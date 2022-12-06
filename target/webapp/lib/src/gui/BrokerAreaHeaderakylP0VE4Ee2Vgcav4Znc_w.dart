import 'dart:async';
import 'dart:convert';
import 'dart:html' as html;

import 'package:angular_router/angular_router.dart';
import 'package:angular/angular.dart';
import 'package:angular/security.dart';
import 'package:angular_forms/angular_forms.dart';

import 'package:app/src/app.dart';

import 'package:app/src/core/dime_process_service.dart';
//Notifications
import 'package:app/src/notification/notification_component.dart';
//Login
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/core/DIMEComponent.dart' as dime;

//Data
import 'package:app/src/data/Data.dart' as Data;
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/filesupport/fileuploader.dart';
import 'package:app/src/filesupport/fileselect.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/models/Todos.dart';
//Directives
import 'package:app/src/directives/MaxLength.dart';
import 'package:app/src/directives/DimeCustomeAttributes.dart';

//Import Services
import 'package:app/src/services/UserBrokerAreaHeaderUserx1Service.dart';
import 'package:intl/intl.dart';
import 'package:intl/date_symbol_data_local.dart';
import 'package:markdown/markdown.dart' as markdown;
import 'package:app/src/modal/Modal.dart' as modal;
//Panel
import 'package:app/src/panel/Panel.dart' as panel;

//file guard imports
//special element imports
//table component imports
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports
import 'package:app/src/root/RootProcessazgnP4FFLEe2Vgcav4Znc_wComponent.dart';

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "brokerareaheader-tag",
  providers: const [ClassProvider(UserBrokerAreaHeaderUserx1Service)],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  RootProcessazgnP4FFLEe2Vgcav4Znc_wComponentSIB,
  ],
  templateUrl: 'BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w.html'
)

class BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
  	// common declarations
  	bool refresh;
  	@Input()
  	bool ismajorpage = false;
  	@Input()
  	String currentbranch;
  	@Input()
  	bool modalDialog = false;
  	ChangeDetectorRef cdr;
  	@Input()
  	String runtimeId;
  	@Input()
  	String guiId;
  	final Router router;
  	final DIMEProcessService processService;
  	final DomSanitizationService domSanitizationService; 
  	UserBrokerAreaHeaderUserx1Service userBrokerAreaHeaderUserx1Service;
  	// component Default Declaration
  	// table refresh flags
  	
  	
  	/// Process ShowBrokerArea
  	@ViewChildren(RootProcessazgnP4FFLEe2Vgcav4Znc_wComponentSIB)
  	List<RootProcessazgnP4FFLEe2Vgcav4Znc_wComponentSIB> componentazgnP4FFLEe2Vgcav4Znc_w;
  	
  	
  	
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	bool showLogin = false;
	//DATA CONTEXT
	//User currentUser
		Data.User currentUser;
	
	bool isDestroyed = true;
  
	BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes,UserBrokerAreaHeaderUserx1Service this.userBrokerAreaHeaderUserx1Service
	) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// User currentUser
		this.currentUser = null;
						
						
		
			  	
			
		/// Process ShowBrokerArea
		if(componentazgnP4FFLEe2Vgcav4Znc_w!=null) {
			componentazgnP4FFLEe2Vgcav4Znc_w.forEach((n)=>n.restart());			
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		updateImageHash();
	}
	
	void updateInputs(
	)
	{
		
		updateWithoutInputs(updateHidden:false);
		this.loadCurrentUser();
	}
	
	
	@override
	void ngOnInit() async
	{
		this.loadCurrentUser();
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		this.isDestroyed = false;
		openWebsockets();
	}
	
	void openWebsockets() {
	}
	
	
	@override
	void ngOnDestroy()
	{
	}
	
	
	void ngAfterViewInit() {
		html.window.document.dispatchEvent(new html.CustomEvent('dime-component-ready'));
		js.context.callMethod("enableTooltip",[]);
	}
	
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Logout is clicked
  			void actionlogouteventaxGsVsVFMEe2J0bu3ffrh5wEventTrigger()
  		
  		{
  			// static button redirect
  			html.window.location.href=''+getLogoutURL.toString()+'';
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.User
  		 initOnDemandcurrentUser()
  		{
  			if(this.currentUser==null){
  				this.currentUser = new Data.User
  				();
  			}
  			return this.currentUser;
  		}
  		void setValuecurrentUser(Data.User
  		 value)
  		{
  			this.currentUser = value;
  		}
  		void currentUsersetValue(Data.User
  		 value)
  		{
  			this.setValuecurrentUser(value);
  		}
  		
  	
  		
  		
  		
  
  	void loadCurrentUser()
  	{
  		this.userBrokerAreaHeaderUserx1Service.syncUser().then((value){
  			this.currentUser = Data.User.fromJSON(value);
  			this.showLogin = false;
  			updateImageHash();
  			openWebsockets();
  			
  		}).catchError((error){
  			if(error.currentTarget.status != 200){
  				this.showLogin = true;
  			}
  		});
  	}
	/// returns the surrounding container class for major GUI models
	String getContainer_kylP0VE4Ee2Vgcav4Znc_wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_kylP0VE4Ee2Vgcav4Znc_wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_kylP0VE4Ee2Vgcav4Znc_w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_kylP0VE4Ee2Vgcav4Znc_wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_kylP0VE4Ee2Vgcav4Znc_wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

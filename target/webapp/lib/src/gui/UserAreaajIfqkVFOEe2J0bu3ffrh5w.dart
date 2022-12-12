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
import 'package:app/src/services/UserUserAreaUserx1Service.dart';
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
import 'package:app/src/gui/UserOfferTableaOOS_45_AVFNEe2J0bu3ffrh5w.dart';
import 'package:app/src/gui/UserBiddingTableauSTQkVFOEe2J0bu3ffrh5w.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "userarea-tag",
  providers: const [ClassProvider(UserUserAreaUserx1Service)],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  UserOfferTableaOOS_45_AVFNEe2J0bu3ffrh5w,
  UserBiddingTableauSTQkVFOEe2J0bu3ffrh5w,
  ],
  templateUrl: 'UserAreaajIfqkVFOEe2J0bu3ffrh5w.html'
)

class UserAreaajIfqkVFOEe2J0bu3ffrh5w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	UserUserAreaUserx1Service userUserAreaUserx1Service;
  	// component Default Declaration
  	// table refresh flags
  	/// GUI UserOfferTable
  	@ViewChildren(UserOfferTableaOOS_45_AVFNEe2J0bu3ffrh5w)
  	List<UserOfferTableaOOS_45_AVFNEe2J0bu3ffrh5w> componentSIBam6oIYVMPEe2KQc5QIsW97w;
  	/// GUI UserBiddingTable
  	@ViewChildren(UserBiddingTableauSTQkVFOEe2J0bu3ffrh5w)
  	List<UserBiddingTableauSTQkVFOEe2J0bu3ffrh5w> componentSIBalr7goVMPEe2KQc5QIsW97w;
  	
  	
  	
  	
  	
  	// branch Show offer as info.scce.dime.gui.editor.graphiti.api.CButton@5f0bb8f0 (id: _0GKiEVFNEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@b7d0ebbc (id: _OOS-AVFNEe2J0bu3ffrh5w)
  	@Output('actionshowofferevent') Stream<Map<String,dynamic>> get evt_actionshowofferevent => actionshowofferevent.stream;
  	StreamController<Map<String,dynamic>> actionshowofferevent = new StreamController();
  	// branch Edit offer as info.scce.dime.gui.editor.graphiti.api.CButton@5ba3e853 (id: _4QgbkVFNEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@b7d0ebbc (id: _OOS-AVFNEe2J0bu3ffrh5w)
  	@Output('actioneditofferevent') Stream<Map<String,dynamic>> get evt_actioneditofferevent => actioneditofferevent.stream;
  	StreamController<Map<String,dynamic>> actioneditofferevent = new StreamController();
  	// branch Delete offer as info.scce.dime.gui.editor.graphiti.api.CButton@59aebbf (id: _6PHdUVFNEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@b7d0ebbc (id: _OOS-AVFNEe2J0bu3ffrh5w)
  	@Output('actiondeleteofferevent') Stream<Map<String,dynamic>> get evt_actiondeleteofferevent => actiondeleteofferevent.stream;
  	StreamController<Map<String,dynamic>> actiondeleteofferevent = new StreamController();
  	// branch Create offer as info.scce.dime.gui.editor.graphiti.api.CButton@100df91c (id: _CGsWXFFREe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@79c6c735 (id: _jIfqkVFOEe2J0bu3ffrh5w)
  	@Output('actioncreateofferevent') Stream<Map<String,dynamic>> get evt_actioncreateofferevent => actioncreateofferevent.stream;
  	StreamController<Map<String,dynamic>> actioncreateofferevent = new StreamController();
  	// branch Show bidding as info.scce.dime.gui.editor.graphiti.api.CButton@e170c8a5 (id: _xZ1CjFFOEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@14259844 (id: _uSTQkVFOEe2J0bu3ffrh5w)
  	@Output('actionshowbiddingevent') Stream<Map<String,dynamic>> get evt_actionshowbiddingevent => actionshowbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actionshowbiddingevent = new StreamController();
  	// branch Edit bidding as info.scce.dime.gui.editor.graphiti.api.CButton@67b2d0f1 (id: _xZ1pSVFOEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@14259844 (id: _uSTQkVFOEe2J0bu3ffrh5w)
  	@Output('actioneditbiddingevent') Stream<Map<String,dynamic>> get evt_actioneditbiddingevent => actioneditbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actioneditbiddingevent = new StreamController();
  	// branch Delete bidding as info.scce.dime.gui.editor.graphiti.api.CButton@82e5c69f (id: _xZ1pWlFOEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@14259844 (id: _uSTQkVFOEe2J0bu3ffrh5w)
  	@Output('actiondeletebiddingevent') Stream<Map<String,dynamic>> get evt_actiondeletebiddingevent => actiondeletebiddingevent.stream;
  	StreamController<Map<String,dynamic>> actiondeletebiddingevent = new StreamController();
  	// branch Create bidding as info.scce.dime.gui.editor.graphiti.api.CButton@f9595b6a (id: _EIl8nFFREe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@79c6c735 (id: _jIfqkVFOEe2J0bu3ffrh5w)
  	@Output('actioncreatebiddingevent') Stream<Map<String,dynamic>> get evt_actioncreatebiddingevent => actioncreatebiddingevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatebiddingevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	bool showLogin = false;
	//DATA CONTEXT
	//User currentUser
		Data.User currentUser;
	
	bool isDestroyed = true;
  
	UserAreaajIfqkVFOEe2J0bu3ffrh5w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes,UserUserAreaUserx1Service this.userUserAreaUserx1Service
	) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// User currentUser
		this.currentUser = null;
						
						
		
			  	
		// branch Show offer declaration
		if(this.actionshowofferevent!=null) {
			  			this.actionshowofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Edit offer declaration
		if(this.actioneditofferevent!=null) {
			  			this.actioneditofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Delete offer declaration
		if(this.actiondeleteofferevent!=null) {
			  			this.actiondeleteofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create offer declaration
		if(this.actioncreateofferevent!=null) {
			  			this.actioncreateofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Show bidding declaration
		if(this.actionshowbiddingevent!=null) {
			  			this.actionshowbiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Edit bidding declaration
		if(this.actioneditbiddingevent!=null) {
			  			this.actioneditbiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Delete bidding declaration
		if(this.actiondeletebiddingevent!=null) {
			  			this.actiondeletebiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create bidding declaration
		if(this.actioncreatebiddingevent!=null) {
			  			this.actioncreatebiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// GUI UserOfferTable
		if(componentSIBam6oIYVMPEe2KQc5QIsW97w!=null) {
			componentSIBam6oIYVMPEe2KQc5QIsW97w.forEach((n)=>n.restartComponent());
		}
		/// GUI UserBiddingTable
		if(componentSIBalr7goVMPEe2KQc5QIsW97w!=null) {
			componentSIBalr7goVMPEe2KQc5QIsW97w.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBam6oIYVMPEe2KQc5QIsW97w.forEach((n)=>n.updateWithoutInputs());
		componentSIBalr7goVMPEe2KQc5QIsW97w.forEach((n)=>n.updateWithoutInputs());
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
  		
  		
  		
  		
  	
  		/// callback, if the button Create offer is clicked
  			void actioncreateoffereventaCGsWXFFREe2J0bu3ffrh5wEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			data['currentUser'] = this.currentUser;
  			this.actioncreateofferevent.add(data);
  		}
  		/// callback, if the button Create bidding is clicked
  			void actioncreatebiddingeventaEIl8nFFREe2J0bu3ffrh5wEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			data['currentUser'] = this.currentUser;
  			this.actioncreatebiddingevent.add(data);
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
  		
  	
  		
  		
  		//GUI SIB UserOfferTable
  		//GUI SIB UserBiddingTable
  		
  
  	void loadCurrentUser()
  	{
  		this.userUserAreaUserx1Service.syncUser().then((value){
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
	String getContainer_jIfqkVFOEe2J0bu3ffrh5wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_jIfqkVFOEe2J0bu3ffrh5wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_jIfqkVFOEe2J0bu3ffrh5w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_jIfqkVFOEe2J0bu3ffrh5wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_jIfqkVFOEe2J0bu3ffrh5wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

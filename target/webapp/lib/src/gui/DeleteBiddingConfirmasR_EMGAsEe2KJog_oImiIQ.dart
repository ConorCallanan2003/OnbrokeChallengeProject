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

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "deletebiddingconfirm-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ.html'
)

class DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	// component Default Declaration
  	// table refresh flags
  	
  	
  	
  	
  	
  	// branch Confirm as info.scce.dime.gui.editor.graphiti.api.CButton@8c6f20d8 (id: _xnnFEWAsEe2KJog_oImiIQ) in info.scce.dime.gui.editor.graphiti.api.CGUI@26d9548e (id: _sR_EMGAsEe2KJog_oImiIQ)
  	@Output('actionconfirmevent') Stream<Map<String,dynamic>> get evt_actionconfirmevent => actionconfirmevent.stream;
  	StreamController<Map<String,dynamic>> actionconfirmevent = new StreamController();
  	// branch Back as info.scce.dime.gui.editor.graphiti.api.CButton@8766aa28 (id: _02vTgWAsEe2KJog_oImiIQ) in info.scce.dime.gui.editor.graphiti.api.CGUI@26d9548e (id: _sR_EMGAsEe2KJog_oImiIQ)
  	@Output('actionbackevent') Stream<Map<String,dynamic>> get evt_actionbackevent => actionbackevent.stream;
  	StreamController<Map<String,dynamic>> actionbackevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Bidding bidding
		@Input()
		Data.Bidding bidding;
	
	bool isDestroyed = true;
  
	DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Bidding bidding
		this.bidding = null;
						
						
		
			  	
		// branch Confirm declaration
		if(this.actionconfirmevent!=null) {
			  			this.actionconfirmevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Back declaration
		if(this.actionbackevent!=null) {
			  			this.actionbackevent = new StreamController<Map<String,dynamic>>();  				
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
	{Data.Bidding pbidding
	})
	{
		bidding = pbidding;
		
		updateWithoutInputs(updateHidden:false);
	}
	
	
	@override
	void ngOnInit() async
	{
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
  		
  		
  		
  		
  	
  		/// callback, if the button Confirm is clicked
  			void actionconfirmeventaxnnFEWAsEe2KJog_oImiIQEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionconfirmevent.add(data);
  		}
  		/// callback, if the button Back is clicked
  			void actionbackeventa02vTgWAsEe2KJog_oImiIQEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionbackevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.Bidding
  		 initOnDemandbidding()
  		{
  			if(this.bidding==null){
  				this.bidding = new Data.Bidding
  				();
  			}
  			return this.bidding;
  		}
  		void setValuebidding(Data.Bidding
  		 value)
  		{
  			this.bidding = value;
  		}
  		void biddingsetValue(Data.Bidding
  		 value)
  		{
  			this.setValuebidding(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_sR_EMGAsEe2KJog_oImiIQRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_sR_EMGAsEe2KJog_oImiIQId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_sR_EMGAsEe2KJog_oImiIQ";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_sR_EMGAsEe2KJog_oImiIQClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_sR_EMGAsEe2KJog_oImiIQToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

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
  selector: "deletefeature-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg.html'
)

class DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	
  	// branch Confirm Delete as info.scce.dime.gui.editor.graphiti.api.CButton@81c570cb (id: _MxvoYVt9Ee2nXJXMw4vrvg) in info.scce.dime.gui.editor.graphiti.api.CGUI@54cf2137 (id: _VDMMEVt7Ee20aa7PI0XDWg)
  	@Output('actionconfirmdeleteevent') Stream<Map<String,dynamic>> get evt_actionconfirmdeleteevent => actionconfirmdeleteevent.stream;
  	StreamController<Map<String,dynamic>> actionconfirmdeleteevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@904d34ab (id: _2jR6wVt_Ee2nXJXMw4vrvg) in info.scce.dime.gui.editor.graphiti.api.CGUI@54cf2137 (id: _VDMMEVt7Ee20aa7PI0XDWg)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	
	bool isDestroyed = true;
  
	DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
						
						
		
			  	
		// branch Confirm Delete declaration
		if(this.actionconfirmdeleteevent!=null) {
			  			this.actionconfirmdeleteevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
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
  		
  		
  		
  		
  	
  		/// callback, if the button Confirm Delete is clicked
  			void actionconfirmdeleteeventaMxvoYVt9Ee2nXJXMw4vrvgEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionconfirmdeleteevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  			void actioncanceleventa2jR6wVt_Ee2nXJXMw4vrvgEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncancelevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_VDMMEVt7Ee20aa7PI0XDWgRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_VDMMEVt7Ee20aa7PI0XDWgId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_VDMMEVt7Ee20aa7PI0XDWg";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_VDMMEVt7Ee20aa7PI0XDWgClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_VDMMEVt7Ee20aa7PI0XDWgToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

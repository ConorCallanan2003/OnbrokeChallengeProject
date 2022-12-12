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
  selector: "featuredetails-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ.html'
)

class FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	
  	// branch Exit as info.scce.dime.gui.editor.graphiti.api.CButton@2d7a3edb (id: _mLXFEWGpEe2hs_F3HY5wHA) in info.scce.dime.gui.editor.graphiti.api.CGUI@3a564d0e (id: _ptsfcWEREe2Fx80Lw9BAUQ)
  	@Output('actionexitevent') Stream<Map<String,dynamic>> get evt_actionexitevent => actionexitevent.stream;
  	StreamController<Map<String,dynamic>> actionexitevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Feature feature
		@Input()
		Data.Feature feature;
	
	bool isDestroyed = true;
  
	FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Feature feature
		this.feature = null;
						
						
		
			  	
		// branch Exit declaration
		if(this.actionexitevent!=null) {
			  			this.actionexitevent = new StreamController<Map<String,dynamic>>();  				
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
	{Data.Feature pfeature
	})
	{
		feature = pfeature;
		
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
  		
  		
  		
  		
  	
  		/// callback, if the button Exit is clicked
  			void actionexiteventamLXFEWGpEe2hs_F3HY5wHAEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionexitevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.Feature
  		 initOnDemandfeature()
  		{
  			if(this.feature==null){
  				this.feature = new Data.Feature
  				();
  			}
  			return this.feature;
  		}
  		void setValuefeature(Data.Feature
  		 value)
  		{
  			this.feature = value;
  		}
  		void featuresetValue(Data.Feature
  		 value)
  		{
  			this.setValuefeature(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_ptsfcWEREe2Fx80Lw9BAUQRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_ptsfcWEREe2Fx80Lw9BAUQId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_ptsfcWEREe2Fx80Lw9BAUQ";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_ptsfcWEREe2Fx80Lw9BAUQClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_ptsfcWEREe2Fx80Lw9BAUQToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

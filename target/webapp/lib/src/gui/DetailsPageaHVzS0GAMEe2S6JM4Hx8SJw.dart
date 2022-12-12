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
import 'package:app/src/tables/DetailsPage/Table_fr5MkWAPEe2S6JM4Hx8SJwDetailsPage.dart' as afr5MkWAPEe2S6JM4Hx8SJw;
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "detailspage-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  afr5MkWAPEe2S6JM4Hx8SJw.Table_fr5MkWAPEe2S6JM4Hx8SJwDetailsPage,
  ],
  templateUrl: 'DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw.html'
)

class DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_fr5MkWAPEe2S6JM4Hx8SJwTable;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(afr5MkWAPEe2S6JM4Hx8SJw.Table_fr5MkWAPEe2S6JM4Hx8SJwDetailsPage)
  	List<afr5MkWAPEe2S6JM4Hx8SJw.Table_fr5MkWAPEe2S6JM4Hx8SJwDetailsPage> tableComponentafr5MkWAPEe2S6JM4Hx8SJw;
  	// branch Edit as info.scce.dime.gui.editor.graphiti.api.CButton@b04ce911 (id: _4twukWAPEe2S6JM4Hx8SJw) in info.scce.dime.gui.editor.graphiti.api.CGUI@b1b1095 (id: _HVzS0GAMEe2S6JM4Hx8SJw)
  	@Output('actioneditevent') Stream<Map<String,dynamic>> get evt_actioneditevent => actioneditevent.stream;
  	StreamController<Map<String,dynamic>> actioneditevent = new StreamController();
  	// branch Delete as info.scce.dime.gui.editor.graphiti.api.CButton@dcba30b8 (id: _6FR7IWAPEe2S6JM4Hx8SJw) in info.scce.dime.gui.editor.graphiti.api.CGUI@b1b1095 (id: _HVzS0GAMEe2S6JM4Hx8SJw)
  	@Output('actiondeleteevent') Stream<Map<String,dynamic>> get evt_actiondeleteevent => actiondeleteevent.stream;
  	StreamController<Map<String,dynamic>> actiondeleteevent = new StreamController();
  	// branch Add new Comment as info.scce.dime.gui.editor.graphiti.api.CButton@702045e9 (id: _hG3q4GAREe2S6JM4Hx8SJw) in info.scce.dime.gui.editor.graphiti.api.CGUI@b1b1095 (id: _HVzS0GAMEe2S6JM4Hx8SJw)
  	@Output('actionaddnewcommentevent') Stream<Map<String,dynamic>> get evt_actionaddnewcommentevent => actionaddnewcommentevent.stream;
  	StreamController<Map<String,dynamic>> actionaddnewcommentevent = new StreamController();
  	// branch Back as info.scce.dime.gui.editor.graphiti.api.CButton@91d31d2 (id: _QYSNsWAREe2S6JM4Hx8SJw) in info.scce.dime.gui.editor.graphiti.api.CGUI@b1b1095 (id: _HVzS0GAMEe2S6JM4Hx8SJw)
  	@Output('actionbackevent') Stream<Map<String,dynamic>> get evt_actionbackevent => actionbackevent.stream;
  	StreamController<Map<String,dynamic>> actionbackevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Issue issue
		@Input()
		Data.Issue issue;
	
	bool isDestroyed = true;
  
	DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Issue issue
		this.issue = null;
						
						
		
			  	
		// branch Edit declaration
		if(this.actioneditevent!=null) {
			  			this.actioneditevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Delete declaration
		if(this.actiondeleteevent!=null) {
			  			this.actiondeleteevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Add new Comment declaration
		if(this.actionaddnewcommentevent!=null) {
			  			this.actionaddnewcommentevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Back declaration
		if(this.actionbackevent!=null) {
			  			this.actionbackevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// table
		if(tableComponentafr5MkWAPEe2S6JM4Hx8SJw!=null) {
			tableComponentafr5MkWAPEe2S6JM4Hx8SJw.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentafr5MkWAPEe2S6JM4Hx8SJw.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Issue pissue
	})
	{
		issue = pissue;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentafr5MkWAPEe2S6JM4Hx8SJw.forEach((n)=>n.updateInputs(
			pissue:issue
		));
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
  		
  		
  		
  		
  	
  		/// callback, if the button Edit is clicked
  		void actionediteventa4twukWAPEe2S6JM4Hx8SJwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioneditevent.add(data);
  		}
  		/// callback, if the button Delete is clicked
  		void actiondeleteeventa6FR7IWAPEe2S6JM4Hx8SJwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actiondeleteevent.add(data);
  		}
  		/// callback, if the button Add new Comment is clicked
  			void actionaddnewcommenteventahG3q4GAREe2S6JM4Hx8SJwEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionaddnewcommentevent.add(data);
  		}
  		/// callback, if the button Back is clicked
  			void actionbackeventaQYSNsWAREe2S6JM4Hx8SJwEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionbackevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.Issue
  		 initOnDemandissue()
  		{
  			if(this.issue==null){
  				this.issue = new Data.Issue
  				();
  			}
  			return this.issue;
  		}
  		void setValueissue(Data.Issue
  		 value)
  		{
  			this.issue = value;
  		}
  		void issuesetValue(Data.Issue
  		 value)
  		{
  			this.setValueissue(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_HVzS0GAMEe2S6JM4Hx8SJwRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_HVzS0GAMEe2S6JM4Hx8SJwId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_HVzS0GAMEe2S6JM4Hx8SJw";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_HVzS0GAMEe2S6JM4Hx8SJwClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_HVzS0GAMEe2S6JM4Hx8SJwToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

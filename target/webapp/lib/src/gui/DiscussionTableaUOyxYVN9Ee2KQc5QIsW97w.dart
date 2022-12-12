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
import 'package:app/src/tables/DiscussionTable/Table_bJt8IVN9Ee2KQc5QIsW97wDiscussionTable.dart' as abJt8IVN9Ee2KQc5QIsW97w;
//form component imports
//GUI plug in component imports
//GUI SIB imports
import 'package:app/src/gui/IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "discussiontable-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  abJt8IVN9Ee2KQc5QIsW97w.Table_bJt8IVN9Ee2KQc5QIsW97wDiscussionTable,
  IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w,
  ],
  templateUrl: 'DiscussionTableaUOyxYVN9Ee2KQc5QIsW97w.html'
)

class DiscussionTableaUOyxYVN9Ee2KQc5QIsW97w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_bJt8IVN9Ee2KQc5QIsW97wTable;
  	/// GUI IssueStateBadge
  	@ViewChildren(IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w)
  	List<IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w> componentSIBau8rT5VN_45_Ee2KQc5QIsW97w;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(abJt8IVN9Ee2KQc5QIsW97w.Table_bJt8IVN9Ee2KQc5QIsW97wDiscussionTable)
  	List<abJt8IVN9Ee2KQc5QIsW97w.Table_bJt8IVN9Ee2KQc5QIsW97wDiscussionTable> tableComponentabJt8IVN9Ee2KQc5QIsW97w;
  	// branch Show issue as info.scce.dime.gui.editor.graphiti.api.CButton@9df2c280 (id: _bJxmsVN9Ee2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
  	@Output('actionshowissueevent') Stream<Map<String,dynamic>> get evt_actionshowissueevent => actionshowissueevent.stream;
  	StreamController<Map<String,dynamic>> actionshowissueevent = new StreamController();
  	// branch Resolve issue as info.scce.dime.gui.editor.graphiti.api.CButton@db418f73 (id: _V3lGkVOdEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
  	@Output('actionresolveissueevent') Stream<Map<String,dynamic>> get evt_actionresolveissueevent => actionresolveissueevent.stream;
  	StreamController<Map<String,dynamic>> actionresolveissueevent = new StreamController();
  	// branch Unresolve issue as info.scce.dime.gui.editor.graphiti.api.CButton@fdde42e (id: _dDPcAVOdEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
  	@Output('actionunresolveissueevent') Stream<Map<String,dynamic>> get evt_actionunresolveissueevent => actionunresolveissueevent.stream;
  	StreamController<Map<String,dynamic>> actionunresolveissueevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Issue issues
		@Input()
		DIMEList<Data.Issue> issues;
	@Input()
	bool showResolveButtons;
	
	bool isDestroyed = true;
  
	DiscussionTableaUOyxYVN9Ee2KQc5QIsW97w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Issue issues
		this.issues = new DIMEList();
		// Boolean showResolveButtons
		this.showResolveButtons = false;
						
						
		
			  	
		// branch Show issue declaration
		if(this.actionshowissueevent!=null) {
			  			this.actionshowissueevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Resolve issue declaration
		if(this.actionresolveissueevent!=null) {
			  			this.actionresolveissueevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Unresolve issue declaration
		if(this.actionunresolveissueevent!=null) {
			  			this.actionunresolveissueevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// table
		if(tableComponentabJt8IVN9Ee2KQc5QIsW97w!=null) {
			tableComponentabJt8IVN9Ee2KQc5QIsW97w.forEach((n) => n.restartComponent());
		}
		/// GUI IssueStateBadge
		if(componentSIBau8rT5VN_45_Ee2KQc5QIsW97w!=null) {
			componentSIBau8rT5VN_45_Ee2KQc5QIsW97w.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentabJt8IVN9Ee2KQc5QIsW97w.forEach((n)=>n.updateWithoutInputs());
		}
		componentSIBau8rT5VN_45_Ee2KQc5QIsW97w.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Issue>  pissues,
	bool pshowResolveButtons
	})
	{
		issues = pissues;
		showResolveButtons = pshowResolveButtons;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentabJt8IVN9Ee2KQc5QIsW97w.forEach((n)=>n.updateInputs(
			pissues:issues,
			pshowResolveButtons:showResolveButtons
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
  		
  		
  		
  		
  	
  		/// callback, if the button Show issue is clicked
  		void actionshowissueeventabJxmsVN9Ee2KQc5QIsW97wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionshowissueevent.add(data);
  		}
  		/// callback, if the button Resolve issue is clicked
  		void actionresolveissueeventaV3lGkVOdEe2KQc5QIsW97wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionresolveissueevent.add(data);
  		}
  		/// callback, if the button Unresolve issue is clicked
  		void actionunresolveissueeventadDPcAVOdEe2KQc5QIsW97wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionunresolveissueevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		DIMEList<Data.Issue>
  		 initOnDemandissues()
  		{
  			if(this.issues==null){
  				this.issues = new DIMEList<Data.Issue>
  				();
  			}
  			return this.issues;
  		}
  		void setValueissues(DIMEList<Data.Issue>
  		 value)
  		{
  			this.issues = value;
  		}
  		void issuessetValue(DIMEList<Data.Issue>
  		 value)
  		{
  			this.setValueissues(value);
  		}
  		void issuesadd(Data.Issue
  		 value)
  		{
  			this.issues.add(value);
  		}
  		bool initOnDemandshowResolveButtons()
  		{
  			return this.showResolveButtons;
  		}
  		void setValueshowResolveButtons(bool value)
  		{
  			this.showResolveButtons = value;
  		}
  		void showResolveButtonssetValue(bool value)
  		{
  			this.setValueshowResolveButtons(value);
  		}
  		
  	
  		
  		
  		//GUI SIB IssueStateBadge
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_UOyxYVN9Ee2KQc5QIsW97wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_UOyxYVN9Ee2KQc5QIsW97wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_UOyxYVN9Ee2KQc5QIsW97w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_UOyxYVN9Ee2KQc5QIsW97wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_UOyxYVN9Ee2KQc5QIsW97wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

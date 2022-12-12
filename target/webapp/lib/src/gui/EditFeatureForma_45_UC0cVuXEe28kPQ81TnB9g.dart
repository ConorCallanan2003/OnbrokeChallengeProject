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
import 'package:app/src/forms/EditFeatureForm/Form_BjP7YVuYEe28kPQ81TnB9gEditFeatureForm.dart' as aBjP7YVuYEe28kPQ81TnB9g;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "editfeatureform-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aBjP7YVuYEe28kPQ81TnB9g.Form_BjP7YVuYEe28kPQ81TnB9gEditFeatureForm,
  ],
  templateUrl: 'EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g.html'
)

class EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	/// Form
  	@ViewChildren(aBjP7YVuYEe28kPQ81TnB9g.Form_BjP7YVuYEe28kPQ81TnB9gEditFeatureForm)
  	List<aBjP7YVuYEe28kPQ81TnB9g.Form_BjP7YVuYEe28kPQ81TnB9gEditFeatureForm> formComponentaBjP7YVuYEe28kPQ81TnB9g;
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@9938ae5d (id: _BjRJk1uYEe28kPQ81TnB9g) in info.scce.dime.gui.editor.graphiti.api.CGUI@955f4f91 (id: _-UC0cVuXEe28kPQ81TnB9g)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@5515cf0d (id: _BjRwmVuYEe28kPQ81TnB9g) in info.scce.dime.gui.editor.graphiti.api.CGUI@955f4f91 (id: _-UC0cVuXEe28kPQ81TnB9g)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	@Input()
	String title;
	//Priority priorities
		@Input()
		DIMEList<Data.Priority> priorities;
	//Priority priority
		@Input()
		Data.Priority priority;
	//Feature feature
		@Input()
		Data.Feature feature;
	
	bool isDestroyed = true;
  
	EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Text title
		this.title = '';
		// Priority priorities
		this.priorities = new DIMEList();
		// Priority priority
		this.priority = null;
		// Feature feature
		this.feature = null;
						
						
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaBjP7YVuYEe28kPQ81TnB9g!=null) {
			formComponentaBjP7YVuYEe28kPQ81TnB9g.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaBjP7YVuYEe28kPQ81TnB9g.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{String ptitle,
	DIMEList<Data.Priority>  ppriorities,
	Data.Priority ppriority,
	Data.Feature pfeature
	})
	{
		title = ptitle;
		priorities = ppriorities;
		priority = ppriority;
		feature = pfeature;
		
		updateWithoutInputs(updateHidden:false);
		formComponentaBjP7YVuYEe28kPQ81TnB9g.forEach((n)=>n.updateInputs(
			ptitle:title,
			ppriorities:priorities,
			ppriority:priority,
			pfeature:feature
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
  		
  		
  		
  		
  	
  		/// callback, if the button Submit is clicked
  		void actionsubmiteventaBjRJk1uYEe28kPQ81TnB9gEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  		void actioncanceleventaBjRwmVuYEe28kPQ81TnB9gEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncancelevent.add(data);
  		}
  		
  		
  		
  		
  	
  		void formEventactionsubmiteventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		void formEventactioncanceleventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncancelevent.add(data);
  		}
  		
  		
  		
  		String initOnDemandtitle()
  		{
  			return this.title;
  		}
  		void setValuetitle(String value)
  		{
  			this.title = value;
  		}
  		void titlesetValue(String value)
  		{
  			this.setValuetitle(value);
  		}
  		DIMEList<Data.Priority>
  		 initOnDemandpriorities()
  		{
  			if(this.priorities==null){
  				this.priorities = new DIMEList<Data.Priority>
  				();
  			}
  			return this.priorities;
  		}
  		void setValuepriorities(DIMEList<Data.Priority>
  		 value)
  		{
  			this.priorities = value;
  		}
  		void prioritiessetValue(DIMEList<Data.Priority>
  		 value)
  		{
  			this.setValuepriorities(value);
  		}
  		void prioritiesadd(Data.Priority
  		 value)
  		{
  			this.priorities.add(value);
  		}
  		Data.Priority
  		 initOnDemandpriority()
  		{
  			if(this.priority==null){
  				this.priority = new Data.Priority
  				();
  			}
  			return this.priority;
  		}
  		void setValuepriority(Data.Priority
  		 value)
  		{
  			this.priority = value;
  		}
  		void prioritysetValue(Data.Priority
  		 value)
  		{
  			this.setValuepriority(value);
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
	String getContainer_UC0cVuXEe28kPQ81TnB9gRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_UC0cVuXEe28kPQ81TnB9gId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_UC0cVuXEe28kPQ81TnB9g";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_UC0cVuXEe28kPQ81TnB9gClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_UC0cVuXEe28kPQ81TnB9gToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

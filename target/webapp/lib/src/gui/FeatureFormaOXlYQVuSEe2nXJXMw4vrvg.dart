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
import 'package:app/src/forms/FeatureForm/Form_r0c0AVuUEe2nXJXMw4vrvgFeatureForm.dart' as ar0c0AVuUEe2nXJXMw4vrvg;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "featureform-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ar0c0AVuUEe2nXJXMw4vrvg.Form_r0c0AVuUEe2nXJXMw4vrvgFeatureForm,
  ],
  templateUrl: 'FeatureFormaOXlYQVuSEe2nXJXMw4vrvg.html'
)

class FeatureFormaOXlYQVuSEe2nXJXMw4vrvg extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	@ViewChildren(ar0c0AVuUEe2nXJXMw4vrvg.Form_r0c0AVuUEe2nXJXMw4vrvgFeatureForm)
  	List<ar0c0AVuUEe2nXJXMw4vrvg.Form_r0c0AVuUEe2nXJXMw4vrvgFeatureForm> formComponentar0c0AVuUEe2nXJXMw4vrvg;
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@cf6f309f (id: _r0epMVuUEe2nXJXMw4vrvg) in info.scce.dime.gui.editor.graphiti.api.CGUI@f01c8d0d (id: _OXlYQVuSEe2nXJXMw4vrvg)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@66212f60 (id: _XD45sVuVEe2nXJXMw4vrvg) in info.scce.dime.gui.editor.graphiti.api.CGUI@f01c8d0d (id: _OXlYQVuSEe2nXJXMw4vrvg)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Priority priority
		Data.Priority priority;
	String title;
	//Priority priorities
		@Input()
		DIMEList<Data.Priority> priorities;
	
	bool isDestroyed = true;
  
	FeatureFormaOXlYQVuSEe2nXJXMw4vrvg(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Priority priority
		this.priority = null;
		// Text title
		this.title = '';
		// Priority priorities
		this.priorities = new DIMEList();
						
						
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentar0c0AVuUEe2nXJXMw4vrvg!=null) {
			formComponentar0c0AVuUEe2nXJXMw4vrvg.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentar0c0AVuUEe2nXJXMw4vrvg.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Priority>  ppriorities
	})
	{
		priorities = ppriorities;
		
		updateWithoutInputs(updateHidden:false);
		formComponentar0c0AVuUEe2nXJXMw4vrvg.forEach((n)=>n.updateInputs(
			ppriorities:priorities
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
  		void actionsubmiteventar0epMVuUEe2nXJXMw4vrvgEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  		void actioncanceleventaXD45sVuVEe2nXJXMw4vrvgEventTrigger(Map<String,dynamic> data)
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
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_OXlYQVuSEe2nXJXMw4vrvgRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_OXlYQVuSEe2nXJXMw4vrvgId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_OXlYQVuSEe2nXJXMw4vrvg";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_OXlYQVuSEe2nXJXMw4vrvgClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_OXlYQVuSEe2nXJXMw4vrvgToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

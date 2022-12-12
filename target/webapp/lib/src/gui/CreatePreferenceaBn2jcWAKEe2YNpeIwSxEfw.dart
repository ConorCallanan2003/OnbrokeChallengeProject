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
import 'package:app/src/forms/CreatePreference/Form_NvcnYWAKEe2YNpeIwSxEfwCreatePreference.dart' as aNvcnYWAKEe2YNpeIwSxEfw;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "createpreference-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aNvcnYWAKEe2YNpeIwSxEfw.Form_NvcnYWAKEe2YNpeIwSxEfwCreatePreference,
  ],
  templateUrl: 'CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw.html'
)

class CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	@ViewChildren(aNvcnYWAKEe2YNpeIwSxEfw.Form_NvcnYWAKEe2YNpeIwSxEfwCreatePreference)
  	List<aNvcnYWAKEe2YNpeIwSxEfw.Form_NvcnYWAKEe2YNpeIwSxEfwCreatePreference> formComponentaNvcnYWAKEe2YNpeIwSxEfw;
  	
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@7fa2a774 (id: _iyZcwWAKEe2YNpeIwSxEfw) in info.scce.dime.gui.editor.graphiti.api.CGUI@faf20f4a (id: _Bn2jcWAKEe2YNpeIwSxEfw)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@e32b2f68 (id: _NviG8WAKEe2YNpeIwSxEfw) in info.scce.dime.gui.editor.graphiti.api.CGUI@faf20f4a (id: _Bn2jcWAKEe2YNpeIwSxEfw)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	String title;
	
	bool isDestroyed = true;
  
	CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Text title
		this.title = '';
						
						
		
			  	
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaNvcnYWAKEe2YNpeIwSxEfw!=null) {
			formComponentaNvcnYWAKEe2YNpeIwSxEfw.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaNvcnYWAKEe2YNpeIwSxEfw.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	)
	{
		
		updateWithoutInputs(updateHidden:false);
		formComponentaNvcnYWAKEe2YNpeIwSxEfw.forEach((n)=>n.updateInputs(
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
  		
  		
  		
  		
  	
  		/// callback, if the button Cancel is clicked
  			void actioncanceleventaiyZcwWAKEe2YNpeIwSxEfwEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncancelevent.add(data);
  		}
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventaNviG8WAKEe2YNpeIwSxEfwEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			data['title'] = this.title;
  			this.actionsubmitevent.add(data);
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
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_Bn2jcWAKEe2YNpeIwSxEfwRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_Bn2jcWAKEe2YNpeIwSxEfwId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_Bn2jcWAKEe2YNpeIwSxEfw";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_Bn2jcWAKEe2YNpeIwSxEfwClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_Bn2jcWAKEe2YNpeIwSxEfwToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

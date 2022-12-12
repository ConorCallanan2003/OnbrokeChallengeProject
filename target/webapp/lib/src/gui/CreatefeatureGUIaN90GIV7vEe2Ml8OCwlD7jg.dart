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
import 'package:app/src/forms/CreatefeatureGUI/Form_SclkV7vEe2Ml8OCwlD7jgCreatefeatureGUI.dart' as aScl_45_kV7vEe2Ml8OCwlD7jg;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "createfeaturegui-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aScl_45_kV7vEe2Ml8OCwlD7jg.Form_SclkV7vEe2Ml8OCwlD7jgCreatefeatureGUI,
  ],
  templateUrl: 'CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg.html'
)

class CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	@ViewChildren(aScl_45_kV7vEe2Ml8OCwlD7jg.Form_SclkV7vEe2Ml8OCwlD7jgCreatefeatureGUI)
  	List<aScl_45_kV7vEe2Ml8OCwlD7jg.Form_SclkV7vEe2Ml8OCwlD7jgCreatefeatureGUI> formComponentaScl_45_kV7vEe2Ml8OCwlD7jg;
  	
  	// branch Label as info.scce.dime.gui.editor.graphiti.api.CButton@c81c00fc (id: _b3fywV7vEe2Ml8OCwlD7jg) in info.scce.dime.gui.editor.graphiti.api.CGUI@8d471765 (id: _N90GIV7vEe2Ml8OCwlD7jg)
  	@Output('actionlabelevent') Stream<Map<String,dynamic>> get evt_actionlabelevent => actionlabelevent.stream;
  	StreamController<Map<String,dynamic>> actionlabelevent = new StreamController();
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@c409a70d (id: _Scyy4V7vEe2Ml8OCwlD7jg) in info.scce.dime.gui.editor.graphiti.api.CGUI@8d471765 (id: _N90GIV7vEe2Ml8OCwlD7jg)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	String title;
	
	bool isDestroyed = true;
  
	CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Text title
		this.title = '';
						
						
		
			  	
		// branch Label declaration
		if(this.actionlabelevent!=null) {
			  			this.actionlabelevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaScl_45_kV7vEe2Ml8OCwlD7jg!=null) {
			formComponentaScl_45_kV7vEe2Ml8OCwlD7jg.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaScl_45_kV7vEe2Ml8OCwlD7jg.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	)
	{
		
		updateWithoutInputs(updateHidden:false);
		formComponentaScl_45_kV7vEe2Ml8OCwlD7jg.forEach((n)=>n.updateInputs(
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
  		
  		
  		
  		
  	
  		/// callback, if the button Label is clicked
  			void actionlabeleventab3fywV7vEe2Ml8OCwlD7jgEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionlabelevent.add(data);
  		}
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventaScyy4V7vEe2Ml8OCwlD7jgEventTrigger()
  		
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
	String getContainer_N90GIV7vEe2Ml8OCwlD7jgRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_N90GIV7vEe2Ml8OCwlD7jgId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_N90GIV7vEe2Ml8OCwlD7jg";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_N90GIV7vEe2Ml8OCwlD7jgClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_N90GIV7vEe2Ml8OCwlD7jgToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

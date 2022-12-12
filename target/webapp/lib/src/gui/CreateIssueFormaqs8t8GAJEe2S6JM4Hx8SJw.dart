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
import 'package:app/src/forms/CreateIssueForm/Form_sAJbMGAJEe2S6JM4Hx8SJwCreateIssueForm.dart' as asAJbMGAJEe2S6JM4Hx8SJw;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "createissueform-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  asAJbMGAJEe2S6JM4Hx8SJw.Form_sAJbMGAJEe2S6JM4Hx8SJwCreateIssueForm,
  ],
  templateUrl: 'CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw.html'
)

class CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	@ViewChildren(asAJbMGAJEe2S6JM4Hx8SJw.Form_sAJbMGAJEe2S6JM4Hx8SJwCreateIssueForm)
  	List<asAJbMGAJEe2S6JM4Hx8SJw.Form_sAJbMGAJEe2S6JM4Hx8SJwCreateIssueForm> formComponentasAJbMGAJEe2S6JM4Hx8SJw;
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@43bf0077 (id: _sAn8UGAJEe2S6JM4Hx8SJw) in info.scce.dime.gui.editor.graphiti.api.CGUI@8f3d8b69 (id: _qs8t8GAJEe2S6JM4Hx8SJw)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Back as info.scce.dime.gui.editor.graphiti.api.CButton@de73b5cb (id: _tIEFgGAJEe2S6JM4Hx8SJw) in info.scce.dime.gui.editor.graphiti.api.CGUI@8f3d8b69 (id: _qs8t8GAJEe2S6JM4Hx8SJw)
  	@Output('actionbackevent') Stream<Map<String,dynamic>> get evt_actionbackevent => actionbackevent.stream;
  	StreamController<Map<String,dynamic>> actionbackevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	String title;
	
	bool isDestroyed = true;
  
	CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Text title
		this.title = '';
						
						
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Back declaration
		if(this.actionbackevent!=null) {
			  			this.actionbackevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentasAJbMGAJEe2S6JM4Hx8SJw!=null) {
			formComponentasAJbMGAJEe2S6JM4Hx8SJw.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentasAJbMGAJEe2S6JM4Hx8SJw.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	)
	{
		
		updateWithoutInputs(updateHidden:false);
		formComponentasAJbMGAJEe2S6JM4Hx8SJw.forEach((n)=>n.updateInputs(
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
  		void actionsubmiteventasAn8UGAJEe2S6JM4Hx8SJwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Back is clicked
  			void actionbackeventatIEFgGAJEe2S6JM4Hx8SJwEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionbackevent.add(data);
  		}
  		
  		
  		
  		
  	
  		void formEventactionsubmiteventTrigger(Map<String,dynamic> data)
  		{
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
	String getContainer_qs8t8GAJEe2S6JM4Hx8SJwRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_qs8t8GAJEe2S6JM4Hx8SJwId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_qs8t8GAJEe2S6JM4Hx8SJw";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_qs8t8GAJEe2S6JM4Hx8SJwClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_qs8t8GAJEe2S6JM4Hx8SJwToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

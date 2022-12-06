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
import 'package:app/src/forms/EditAssignment/Form_afTeYFuaEe2CdvY0XUmpAEditAssignment.dart' as aafTeYFuaEe2C_45_dvY0XUmpA;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "editassignment-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aafTeYFuaEe2C_45_dvY0XUmpA.Form_afTeYFuaEe2CdvY0XUmpAEditAssignment,
  ],
  templateUrl: 'EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA.html'
)

class EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	@ViewChildren(aafTeYFuaEe2C_45_dvY0XUmpA.Form_afTeYFuaEe2CdvY0XUmpAEditAssignment)
  	List<aafTeYFuaEe2C_45_dvY0XUmpA.Form_afTeYFuaEe2CdvY0XUmpAEditAssignment> formComponentaafTeYFuaEe2C_45_dvY0XUmpA;
  	
  	// branch Cancel Edit as info.scce.dime.gui.editor.graphiti.api.CButton@7927968a (id: _ka-Z4Vw1Ee2gxcFkjyzH4g) in info.scce.dime.gui.editor.graphiti.api.CGUI@80676da7 (id: _mOjJMVuZEe2C-dvY0XUmpA)
  	@Output('actioncanceleditevent') Stream<Map<String,dynamic>> get evt_actioncanceleditevent => actioncanceleditevent.stream;
  	StreamController<Map<String,dynamic>> actioncanceleditevent = new StreamController();
  	// branch Assign as info.scce.dime.gui.editor.graphiti.api.CButton@a371ae2d (id: _afXv0VuaEe2C-dvY0XUmpA) in info.scce.dime.gui.editor.graphiti.api.CGUI@80676da7 (id: _mOjJMVuZEe2C-dvY0XUmpA)
  	@Output('actionassignevent') Stream<Map<String,dynamic>> get evt_actionassignevent => actionassignevent.stream;
  	StreamController<Map<String,dynamic>> actionassignevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Bidding bidding
		@Input()
		Data.Bidding bidding;
	
	bool isDestroyed = true;
  
	EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Bidding bidding
		this.bidding = null;
						
						
		
			  	
		// branch Cancel Edit declaration
		if(this.actioncanceleditevent!=null) {
			  			this.actioncanceleditevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Assign declaration
		if(this.actionassignevent!=null) {
			  			this.actionassignevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaafTeYFuaEe2C_45_dvY0XUmpA!=null) {
			formComponentaafTeYFuaEe2C_45_dvY0XUmpA.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaafTeYFuaEe2C_45_dvY0XUmpA.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Bidding pbidding
	})
	{
		bidding = pbidding;
		
		updateWithoutInputs(updateHidden:false);
		formComponentaafTeYFuaEe2C_45_dvY0XUmpA.forEach((n)=>n.updateInputs(
			pbidding:bidding
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
  		
  		
  		
  		
  	
  		/// callback, if the button Cancel Edit is clicked
  			void actioncancelediteventaka_45_Z4Vw1Ee2gxcFkjyzH4gEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncanceleditevent.add(data);
  		}
  		/// callback, if the button Assign is clicked
  		void actionassigneventaafXv0VuaEe2C_45_dvY0XUmpAEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionassignevent.add(data);
  		}
  		
  		
  		
  		
  	
  		void formEventactionassigneventTrigger(Map<String,dynamic> data)
  		{
  			this.actionassignevent.add(data);
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
	String getContainer_mOjJMVuZEe2CdvY0XUmpARootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_mOjJMVuZEe2CdvY0XUmpAId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_mOjJMVuZEe2CdvY0XUmpA";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_mOjJMVuZEe2CdvY0XUmpAClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_mOjJMVuZEe2CdvY0XUmpAToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

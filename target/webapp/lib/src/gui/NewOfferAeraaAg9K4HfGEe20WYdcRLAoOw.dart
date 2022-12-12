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
import 'package:app/src/tables/NewOfferAera/Table_FiJM7HfGEe20WYdcRLAoOwNewOfferAera.dart' as aFiJM7HfGEe20WYdcRLAoOw;
import 'package:app/src/tables/NewOfferAera/Table_FiLCLnfGEe20WYdcRLAoOwNewOfferAera.dart' as aFiLCLnfGEe20WYdcRLAoOw;
//form component imports
import 'package:app/src/forms/NewOfferAera/Form_FiGwkXfGEe20WYdcRLAoOwNewOfferAera.dart' as aFiGwkXfGEe20WYdcRLAoOw;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "newofferaera-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aFiJM7HfGEe20WYdcRLAoOw.Table_FiJM7HfGEe20WYdcRLAoOwNewOfferAera,
  aFiLCLnfGEe20WYdcRLAoOw.Table_FiLCLnfGEe20WYdcRLAoOwNewOfferAera,
  aFiGwkXfGEe20WYdcRLAoOw.Form_FiGwkXfGEe20WYdcRLAoOwNewOfferAera,
  ],
  templateUrl: 'NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw.html'
)

class NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_FiJM7HfGEe20WYdcRLAoOwTable;
  	bool refresh_FiLCLnfGEe20WYdcRLAoOwTable;
  	
  	
  	
  	
  	/// Form
  	@ViewChildren(aFiGwkXfGEe20WYdcRLAoOw.Form_FiGwkXfGEe20WYdcRLAoOwNewOfferAera)
  	List<aFiGwkXfGEe20WYdcRLAoOw.Form_FiGwkXfGEe20WYdcRLAoOwNewOfferAera> formComponentaFiGwkXfGEe20WYdcRLAoOw;
  	
  	/// Table
  	@ViewChildren(aFiJM7HfGEe20WYdcRLAoOw.Table_FiJM7HfGEe20WYdcRLAoOwNewOfferAera)
  	List<aFiJM7HfGEe20WYdcRLAoOw.Table_FiJM7HfGEe20WYdcRLAoOwNewOfferAera> tableComponentaFiJM7HfGEe20WYdcRLAoOw;
  	/// Table
  	@ViewChildren(aFiLCLnfGEe20WYdcRLAoOw.Table_FiLCLnfGEe20WYdcRLAoOwNewOfferAera)
  	List<aFiLCLnfGEe20WYdcRLAoOw.Table_FiLCLnfGEe20WYdcRLAoOwNewOfferAera> tableComponentaFiLCLnfGEe20WYdcRLAoOw;
  	// branch Create New Feature as info.scce.dime.gui.editor.graphiti.api.CButton@8e214908 (id: _FiKbG3fGEe20WYdcRLAoOw) in info.scce.dime.gui.editor.graphiti.api.CGUI@7c8a8357 (id: _Ag9K4HfGEe20WYdcRLAoOw)
  	@Output('actioncreatenewfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreatenewfeatureevent => actioncreatenewfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewfeatureevent = new StreamController();
  	// branch Create New Preference as info.scce.dime.gui.editor.graphiti.api.CButton@e5532d3a (id: _FiLpKXfGEe20WYdcRLAoOw) in info.scce.dime.gui.editor.graphiti.api.CGUI@7c8a8357 (id: _Ag9K4HfGEe20WYdcRLAoOw)
  	@Output('actioncreatenewpreferenceevent') Stream<Map<String,dynamic>> get evt_actioncreatenewpreferenceevent => actioncreatenewpreferenceevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewpreferenceevent = new StreamController();
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@3b8392b1 (id: _FiMQXnfGEe20WYdcRLAoOw) in info.scce.dime.gui.editor.graphiti.api.CGUI@7c8a8357 (id: _Ag9K4HfGEe20WYdcRLAoOw)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@de4a205 (id: _FiM3NnfGEe20WYdcRLAoOw) in info.scce.dime.gui.editor.graphiti.api.CGUI@7c8a8357 (id: _Ag9K4HfGEe20WYdcRLAoOw)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Feature preferences
		@Input()
		DIMEList<Data.Feature> preferences;
	//Feature selectedFeature
		DIMEList<Data.Feature> selectedFeature;
	String title;
	//Feature selectedPreferences
		DIMEList<Data.Feature> selectedPreferences;
	//Feature features
		@Input()
		DIMEList<Data.Feature> features;
	String description;
	
	bool isDestroyed = true;
  
	NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Feature preferences
		this.preferences = new DIMEList();
		// Feature selectedFeature
		this.selectedFeature = new DIMEList();
		// Text title
		this.title = '';
		// Feature selectedPreferences
		this.selectedPreferences = new DIMEList();
		// Feature features
		this.features = new DIMEList();
		// Text description
		this.description = '';
						
						
		
			  	
		// branch Create New Feature declaration
		if(this.actioncreatenewfeatureevent!=null) {
			  			this.actioncreatenewfeatureevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create New Preference declaration
		if(this.actioncreatenewpreferenceevent!=null) {
			  			this.actioncreatenewpreferenceevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaFiGwkXfGEe20WYdcRLAoOw!=null) {
			formComponentaFiGwkXfGEe20WYdcRLAoOw.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaFiJM7HfGEe20WYdcRLAoOw!=null) {
			tableComponentaFiJM7HfGEe20WYdcRLAoOw.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaFiLCLnfGEe20WYdcRLAoOw!=null) {
			tableComponentaFiLCLnfGEe20WYdcRLAoOw.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaFiGwkXfGEe20WYdcRLAoOw.forEach((n)=>n.updateWithoutInputs());
			tableComponentaFiJM7HfGEe20WYdcRLAoOw.forEach((n)=>n.updateWithoutInputs());
			tableComponentaFiLCLnfGEe20WYdcRLAoOw.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Feature>  ppreferences,
	DIMEList<Data.Feature>  pfeatures
	})
	{
		preferences = ppreferences;
		features = pfeatures;
		
		updateWithoutInputs(updateHidden:false);
		formComponentaFiGwkXfGEe20WYdcRLAoOw.forEach((n)=>n.updateInputs(
			ppreferences:preferences,
			pfeatures:features
		));
		tableComponentaFiJM7HfGEe20WYdcRLAoOw.forEach((n)=>n.updateInputs(
			ppreferences:preferences,
			pfeatures:features
		));
		tableComponentaFiLCLnfGEe20WYdcRLAoOw.forEach((n)=>n.updateInputs(
			ppreferences:preferences,
			pfeatures:features
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
  		
  		
  		
  		
  	
  		/// callback, if the button Create New Feature is clicked
  		void actioncreatenewfeatureeventaFiKbG3fGEe20WYdcRLAoOwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		/// callback, if the button Create New Preference is clicked
  		void actioncreatenewpreferenceeventaFiLpKXfGEe20WYdcRLAoOwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewpreferenceevent.add(data);
  		}
  		/// callback, if the button Submit is clicked
  		void actionsubmiteventaFiMQXnfGEe20WYdcRLAoOwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  		void actioncanceleventaFiM3NnfGEe20WYdcRLAoOwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncancelevent.add(data);
  		}
  		
  		
  		
  		
  	
  		void formEventactioncreatenewfeatureeventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		void formEventactioncreatenewpreferenceeventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewpreferenceevent.add(data);
  		}
  		void formEventactionsubmiteventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		void formEventactioncanceleventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncancelevent.add(data);
  		}
  		
  		
  		
  		DIMEList<Data.Feature>
  		 initOnDemandpreferences()
  		{
  			if(this.preferences==null){
  				this.preferences = new DIMEList<Data.Feature>
  				();
  			}
  			return this.preferences;
  		}
  		void setValuepreferences(DIMEList<Data.Feature>
  		 value)
  		{
  			this.preferences = value;
  		}
  		void preferencessetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValuepreferences(value);
  		}
  		void preferencesadd(Data.Feature
  		 value)
  		{
  			this.preferences.add(value);
  		}
  		DIMEList<Data.Feature>
  		 initOnDemandselectedFeature()
  		{
  			if(this.selectedFeature==null){
  				this.selectedFeature = new DIMEList<Data.Feature>
  				();
  			}
  			return this.selectedFeature;
  		}
  		void setValueselectedFeature(DIMEList<Data.Feature>
  		 value)
  		{
  			this.selectedFeature = value;
  		}
  		void selectedFeaturesetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValueselectedFeature(value);
  		}
  		void selectedFeatureadd(Data.Feature
  		 value)
  		{
  			this.selectedFeature.add(value);
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
  		DIMEList<Data.Feature>
  		 initOnDemandselectedPreferences()
  		{
  			if(this.selectedPreferences==null){
  				this.selectedPreferences = new DIMEList<Data.Feature>
  				();
  			}
  			return this.selectedPreferences;
  		}
  		void setValueselectedPreferences(DIMEList<Data.Feature>
  		 value)
  		{
  			this.selectedPreferences = value;
  		}
  		void selectedPreferencessetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValueselectedPreferences(value);
  		}
  		void selectedPreferencesadd(Data.Feature
  		 value)
  		{
  			this.selectedPreferences.add(value);
  		}
  		DIMEList<Data.Feature>
  		 initOnDemandfeatures()
  		{
  			if(this.features==null){
  				this.features = new DIMEList<Data.Feature>
  				();
  			}
  			return this.features;
  		}
  		void setValuefeatures(DIMEList<Data.Feature>
  		 value)
  		{
  			this.features = value;
  		}
  		void featuressetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValuefeatures(value);
  		}
  		void featuresadd(Data.Feature
  		 value)
  		{
  			this.features.add(value);
  		}
  		String initOnDemanddescription()
  		{
  			return this.description;
  		}
  		void setValuedescription(String value)
  		{
  			this.description = value;
  		}
  		void descriptionsetValue(String value)
  		{
  			this.setValuedescription(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_Ag9K4HfGEe20WYdcRLAoOwRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_Ag9K4HfGEe20WYdcRLAoOwId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_Ag9K4HfGEe20WYdcRLAoOw";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_Ag9K4HfGEe20WYdcRLAoOwClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_Ag9K4HfGEe20WYdcRLAoOwToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

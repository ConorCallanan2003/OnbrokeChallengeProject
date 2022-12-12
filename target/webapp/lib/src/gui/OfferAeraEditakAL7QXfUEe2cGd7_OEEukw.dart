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
import 'package:app/src/tables/OfferAeraEdit/Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit.dart' as aoFfj9XfUEe2cGd7_OEEukw;
import 'package:app/src/tables/OfferAeraEdit/Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit.dart' as aoFgLG3fUEe2cGd7_OEEukw;
//form component imports
import 'package:app/src/forms/OfferAeraEdit/Form_oFb5YXfUEe2cGd7_OEEukwOfferAeraEdit.dart' as aoFb5YXfUEe2cGd7_OEEukw;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "offeraeraedit-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aoFfj9XfUEe2cGd7_OEEukw.Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit,
  aoFgLG3fUEe2cGd7_OEEukw.Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit,
  aoFb5YXfUEe2cGd7_OEEukw.Form_oFb5YXfUEe2cGd7_OEEukwOfferAeraEdit,
  ],
  templateUrl: 'OfferAeraEditakAL7QXfUEe2cGd7_OEEukw.html'
)

class OfferAeraEditakAL7QXfUEe2cGd7_OEEukw extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_oFfj9XfUEe2cGd7_OEEukwTable;
  	bool refresh_oFgLG3fUEe2cGd7_OEEukwTable;
  	
  	
  	
  	
  	/// Form
  	@ViewChildren(aoFb5YXfUEe2cGd7_OEEukw.Form_oFb5YXfUEe2cGd7_OEEukwOfferAeraEdit)
  	List<aoFb5YXfUEe2cGd7_OEEukw.Form_oFb5YXfUEe2cGd7_OEEukwOfferAeraEdit> formComponentaoFb5YXfUEe2cGd7_OEEukw;
  	
  	/// Table
  	@ViewChildren(aoFfj9XfUEe2cGd7_OEEukw.Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit)
  	List<aoFfj9XfUEe2cGd7_OEEukw.Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit> tableComponentaoFfj9XfUEe2cGd7_OEEukw;
  	/// Table
  	@ViewChildren(aoFgLG3fUEe2cGd7_OEEukw.Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit)
  	List<aoFgLG3fUEe2cGd7_OEEukw.Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit> tableComponentaoFgLG3fUEe2cGd7_OEEukw;
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@eb1a778c (id: _zo0wsXhbEe2mVL2cgUAW0A) in info.scce.dime.gui.editor.graphiti.api.CGUI@d23a1354 (id: _kAL7QXfUEe2cGd7_OEEukw)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@c63e3199 (id: _zo1-03hbEe2mVL2cgUAW0A) in info.scce.dime.gui.editor.graphiti.api.CGUI@d23a1354 (id: _kAL7QXfUEe2cGd7_OEEukw)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Create new feature as info.scce.dime.gui.editor.graphiti.api.CButton@fc3d0639 (id: _oFfj5HfUEe2cGd7_OEEukw) in info.scce.dime.gui.editor.graphiti.api.CGUI@d23a1354 (id: _kAL7QXfUEe2cGd7_OEEukw)
  	@Output('actioncreatenewfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreatenewfeatureevent => actioncreatenewfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewfeatureevent = new StreamController();
  	// branch Create new preference as info.scce.dime.gui.editor.graphiti.api.CButton@50d7c5c0 (id: _oFgLCnfUEe2cGd7_OEEukw) in info.scce.dime.gui.editor.graphiti.api.CGUI@d23a1354 (id: _kAL7QXfUEe2cGd7_OEEukw)
  	@Output('actioncreatenewpreferenceevent') Stream<Map<String,dynamic>> get evt_actioncreatenewpreferenceevent => actioncreatenewpreferenceevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewpreferenceevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Offer offer
		@Input()
		Data.Offer offer;
	//Feature preferences
		@Input()
		DIMEList<Data.Feature> preferences;
	//Feature selectedPreferences
		DIMEList<Data.Feature> selectedPreferences;
	String description;
	//Feature features
		@Input()
		DIMEList<Data.Feature> features;
	//Feature selectedFeatures
		DIMEList<Data.Feature> selectedFeatures;
	
	bool isDestroyed = true;
  
	OfferAeraEditakAL7QXfUEe2cGd7_OEEukw(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Offer offer
		this.offer = null;
		// Feature preferences
		this.preferences = new DIMEList();
		// Feature selectedPreferences
		this.selectedPreferences = new DIMEList();
		// Text description
		this.description = '';
		// Feature features
		this.features = new DIMEList();
		// Feature selectedFeatures
		this.selectedFeatures = new DIMEList();
						
						
		
			  	
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create new feature declaration
		if(this.actioncreatenewfeatureevent!=null) {
			  			this.actioncreatenewfeatureevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create new preference declaration
		if(this.actioncreatenewpreferenceevent!=null) {
			  			this.actioncreatenewpreferenceevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaoFb5YXfUEe2cGd7_OEEukw!=null) {
			formComponentaoFb5YXfUEe2cGd7_OEEukw.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaoFfj9XfUEe2cGd7_OEEukw!=null) {
			tableComponentaoFfj9XfUEe2cGd7_OEEukw.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaoFgLG3fUEe2cGd7_OEEukw!=null) {
			tableComponentaoFgLG3fUEe2cGd7_OEEukw.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaoFb5YXfUEe2cGd7_OEEukw.forEach((n)=>n.updateWithoutInputs());
			tableComponentaoFfj9XfUEe2cGd7_OEEukw.forEach((n)=>n.updateWithoutInputs());
			tableComponentaoFgLG3fUEe2cGd7_OEEukw.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Offer poffer,
	DIMEList<Data.Feature>  ppreferences,
	DIMEList<Data.Feature>  pfeatures
	})
	{
		offer = poffer;
		preferences = ppreferences;
		features = pfeatures;
		
		updateWithoutInputs(updateHidden:false);
		formComponentaoFb5YXfUEe2cGd7_OEEukw.forEach((n)=>n.updateInputs(
			poffer:offer,
			ppreferences:preferences,
			pfeatures:features
		));
		tableComponentaoFfj9XfUEe2cGd7_OEEukw.forEach((n)=>n.updateInputs(
			poffer:offer,
			ppreferences:preferences,
			pfeatures:features
		));
		tableComponentaoFgLG3fUEe2cGd7_OEEukw.forEach((n)=>n.updateInputs(
			poffer:offer,
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
  		
  		
  		
  		
  	
  		/// callback, if the button Cancel is clicked
  			void actioncanceleventazo0wsXhbEe2mVL2cgUAW0AEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncancelevent.add(data);
  		}
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventazo1_45_03hbEe2mVL2cgUAW0AEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			data['selectedFeatures'] = this.selectedFeatures;
  			data['selectedPreferences'] = this.selectedPreferences;
  			data['description'] = this.description;
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Create new feature is clicked
  		void actioncreatenewfeatureeventaoFfj5HfUEe2cGd7_OEEukwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		/// callback, if the button Create new preference is clicked
  		void actioncreatenewpreferenceeventaoFgLCnfUEe2cGd7_OEEukwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewpreferenceevent.add(data);
  		}
  		
  		
  		
  		
  	
  		void formEventactioncreatenewfeatureeventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		void formEventactioncreatenewpreferenceeventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewpreferenceevent.add(data);
  		}
  		
  		
  		
  		Data.Offer
  		 initOnDemandoffer()
  		{
  			if(this.offer==null){
  				this.offer = new Data.Offer
  				();
  			}
  			return this.offer;
  		}
  		void setValueoffer(Data.Offer
  		 value)
  		{
  			this.offer = value;
  		}
  		void offersetValue(Data.Offer
  		 value)
  		{
  			this.setValueoffer(value);
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
  		DIMEList<Data.Feature>
  		 initOnDemandselectedFeatures()
  		{
  			if(this.selectedFeatures==null){
  				this.selectedFeatures = new DIMEList<Data.Feature>
  				();
  			}
  			return this.selectedFeatures;
  		}
  		void setValueselectedFeatures(DIMEList<Data.Feature>
  		 value)
  		{
  			this.selectedFeatures = value;
  		}
  		void selectedFeaturessetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValueselectedFeatures(value);
  		}
  		void selectedFeaturesadd(Data.Feature
  		 value)
  		{
  			this.selectedFeatures.add(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_kAL7QXfUEe2cGd7_OEEukwRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_kAL7QXfUEe2cGd7_OEEukwId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_kAL7QXfUEe2cGd7_OEEukw";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_kAL7QXfUEe2cGd7_OEEukwClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_kAL7QXfUEe2cGd7_OEEukwToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

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
import 'package:app/src/tables/BiddingAreaEdit/Table_NVwBQV3WEe2FVevBlBmE3A_INTERNALBiddingAreaEdit.dart' as aNVwBQV3WEe2FVevBlBmE3A_INTERNAL;
import 'package:app/src/tables/BiddingAreaEdit/Table_a_RZAV7pEe2MjMOCwlD7jgBiddingAreaEdit.dart' as aa_RZAV7pEe2MjMOCwlD7jg;
//form component imports
import 'package:app/src/forms/BiddingAreaEdit/Form_HWNIFtTEe2ySJBy9D3dpw_INTERNALBiddingAreaEdit.dart' as a_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "biddingareaedit-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aNVwBQV3WEe2FVevBlBmE3A_INTERNAL.Table_NVwBQV3WEe2FVevBlBmE3A_INTERNALBiddingAreaEdit,
  aa_RZAV7pEe2MjMOCwlD7jg.Table_a_RZAV7pEe2MjMOCwlD7jgBiddingAreaEdit,
  a_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL.Form_HWNIFtTEe2ySJBy9D3dpw_INTERNALBiddingAreaEdit,
  ],
  templateUrl: 'BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL.html'
)

class BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_NVwBQV3WEe2FVevBlBmE3A_INTERNALTable;
  	bool refresh_a_RZAV7pEe2MjMOCwlD7jgTable;
  	
  	
  	
  	
  	/// Form
  	@ViewChildren(a_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL.Form_HWNIFtTEe2ySJBy9D3dpw_INTERNALBiddingAreaEdit)
  	List<a_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL.Form_HWNIFtTEe2ySJBy9D3dpw_INTERNALBiddingAreaEdit> formComponenta_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL;
  	
  	/// Table
  	@ViewChildren(aNVwBQV3WEe2FVevBlBmE3A_INTERNAL.Table_NVwBQV3WEe2FVevBlBmE3A_INTERNALBiddingAreaEdit)
  	List<aNVwBQV3WEe2FVevBlBmE3A_INTERNAL.Table_NVwBQV3WEe2FVevBlBmE3A_INTERNALBiddingAreaEdit> tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL;
  	/// Table
  	@ViewChildren(aa_RZAV7pEe2MjMOCwlD7jg.Table_a_RZAV7pEe2MjMOCwlD7jgBiddingAreaEdit)
  	List<aa_RZAV7pEe2MjMOCwlD7jg.Table_a_RZAV7pEe2MjMOCwlD7jgBiddingAreaEdit> tableComponentaa_RZAV7pEe2MjMOCwlD7jg;
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@2db8dcd1 (id: _b9LjoVnDEe2zb-oDKccEjg_INTERNAL) in info.scce.dime.gui.editor.graphiti.api.CGUI@9ee421bb (id: _Goy80Fm_Ee2zbeoDKccEjg_INTERNAL)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@b279192e (id: _wIQk8V7pEe2MjcOCwlD7jg) in info.scce.dime.gui.editor.graphiti.api.CGUI@9ee421bb (id: _Goy80Fm_Ee2zbeoDKccEjg_INTERNAL)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	// branch Create new feature as info.scce.dime.gui.editor.graphiti.api.CButton@b49bf5b6 (id: _EABIkF-lEe2c5ZoBUTVdBw) in info.scce.dime.gui.editor.graphiti.api.CGUI@9ee421bb (id: _Goy80Fm_Ee2zbeoDKccEjg_INTERNAL)
  	@Output('actioncreatenewfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreatenewfeatureevent => actioncreatenewfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewfeatureevent = new StreamController();
  	// branch Create new preference as info.scce.dime.gui.editor.graphiti.api.CButton@62ebe3d4 (id: _Eli3gV-lEe2c5ZoBUTVdBw) in info.scce.dime.gui.editor.graphiti.api.CGUI@9ee421bb (id: _Goy80Fm_Ee2zbeoDKccEjg_INTERNAL)
  	@Output('actioncreatenewpreferenceevent') Stream<Map<String,dynamic>> get evt_actioncreatenewpreferenceevent => actioncreatenewpreferenceevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewpreferenceevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Feature selectedPreferences
		DIMEList<Data.Feature> selectedPreferences;
	//Feature features
		@Input()
		DIMEList<Data.Feature> features;
	//Feature selectedFeatures
		DIMEList<Data.Feature> selectedFeatures;
	//Feature preferences
		@Input()
		DIMEList<Data.Feature> preferences;
	String description;
	//Bidding bidding
		@Input()
		Data.Bidding bidding;
	
	bool isDestroyed = true;
  
	BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Feature selectedPreferences
		this.selectedPreferences = new DIMEList();
		// Feature features
		this.features = new DIMEList();
		// Feature selectedFeatures
		this.selectedFeatures = new DIMEList();
		// Feature preferences
		this.preferences = new DIMEList();
		// Text description
		this.description = '';
		// Bidding bidding
		this.bidding = null;
						
						
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
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
		if(formComponenta_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL!=null) {
			formComponenta_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL!=null) {
			tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaa_RZAV7pEe2MjMOCwlD7jg!=null) {
			tableComponentaa_RZAV7pEe2MjMOCwlD7jg.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponenta_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL.forEach((n)=>n.updateWithoutInputs());
			tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL.forEach((n)=>n.updateWithoutInputs());
			tableComponentaa_RZAV7pEe2MjMOCwlD7jg.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Feature>  pfeatures,
	DIMEList<Data.Feature>  ppreferences,
	Data.Bidding pbidding
	})
	{
		features = pfeatures;
		preferences = ppreferences;
		bidding = pbidding;
		
		updateWithoutInputs(updateHidden:false);
		formComponenta_45_HWNIFtTEe2ySJBy9D3dpw_INTERNAL.forEach((n)=>n.updateInputs(
			pfeatures:features,
			ppreferences:preferences,
			pbidding:bidding
		));
		tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL.forEach((n)=>n.updateInputs(
			pfeatures:features,
			ppreferences:preferences,
			pbidding:bidding
		));
		tableComponentaa_RZAV7pEe2MjMOCwlD7jg.forEach((n)=>n.updateInputs(
			pfeatures:features,
			ppreferences:preferences,
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
  		
  		
  		
  		
  	
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventab9LjoVnDEe2zb_45_oDKccEjg_INTERNALEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			data['selectedFeatures'] = this.selectedFeatures;
  			data['selectedPreferences'] = this.selectedPreferences;
  			data['description'] = this.description;
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  			void actioncanceleventawIQk8V7pEe2MjcOCwlD7jgEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncancelevent.add(data);
  		}
  		/// callback, if the button Create new feature is clicked
  		void actioncreatenewfeatureeventaEABIkF_45_lEe2c5ZoBUTVdBwEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		/// callback, if the button Create new preference is clicked
  		void actioncreatenewpreferenceeventaEli3gV_45_lEe2c5ZoBUTVdBwEventTrigger(Map<String,dynamic> data)
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
	String getContainer_Goy80Fm_Ee2zbeoDKccEjg_INTERNALRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_Goy80Fm_Ee2zbeoDKccEjg_INTERNALId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_Goy80Fm_Ee2zbeoDKccEjg_INTERNALClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_Goy80Fm_Ee2zbeoDKccEjg_INTERNALToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

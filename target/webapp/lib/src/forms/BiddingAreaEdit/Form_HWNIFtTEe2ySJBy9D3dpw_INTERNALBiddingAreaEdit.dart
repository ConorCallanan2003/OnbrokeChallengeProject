import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';
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
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'package:app/src/core/Validators.dart' as validators;

// Form placed in GUI model BiddingAreaEdit
@Component(
  selector: 'form-_HWNIFtTEe2ySJBy9D3dpw_INTERNAL-biddingAreaEdit',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aNVwBQV3WEe2FVevBlBmE3A_INTERNAL.Table_NVwBQV3WEe2FVevBlBmE3A_INTERNALBiddingAreaEdit,
  aa_RZAV7pEe2MjMOCwlD7jg.Table_a_RZAV7pEe2MjMOCwlD7jgBiddingAreaEdit,
  ],
  templateUrl: 'Form_HWNIFtTEe2ySJBy9D3dpw_INTERNALBiddingAreaEdit.html'
)
class Form_HWNIFtTEe2ySJBy9D3dpw_INTERNALBiddingAreaEdit extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(aNVwBQV3WEe2FVevBlBmE3A_INTERNAL.Table_NVwBQV3WEe2FVevBlBmE3A_INTERNALBiddingAreaEdit)
  	List<aNVwBQV3WEe2FVevBlBmE3A_INTERNAL.Table_NVwBQV3WEe2FVevBlBmE3A_INTERNALBiddingAreaEdit> tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL;
  	/// Table
  	@ViewChildren(aa_RZAV7pEe2MjMOCwlD7jg.Table_a_RZAV7pEe2MjMOCwlD7jgBiddingAreaEdit)
  	List<aa_RZAV7pEe2MjMOCwlD7jg.Table_a_RZAV7pEe2MjMOCwlD7jgBiddingAreaEdit> tableComponentaa_RZAV7pEe2MjMOCwlD7jg;
  	// branch Create new feature as info.scce.dime.gui.editor.graphiti.api.CButton@b49bf5b6 (id: _EABIkF-lEe2c5ZoBUTVdBw) in info.scce.dime.gui.editor.graphiti.api.CGUI@9ee421bb (id: _Goy80Fm_Ee2zbeoDKccEjg_INTERNAL)
  	@Output('actioncreatenewfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreatenewfeatureevent => actioncreatenewfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewfeatureevent = new StreamController();
  	// branch Create new preference as info.scce.dime.gui.editor.graphiti.api.CButton@62ebe3d4 (id: _Eli3gV-lEe2c5ZoBUTVdBw) in info.scce.dime.gui.editor.graphiti.api.CGUI@9ee421bb (id: _Goy80Fm_Ee2zbeoDKccEjg_INTERNAL)
  	@Output('actioncreatenewpreferenceevent') Stream<Map<String,dynamic>> get evt_actioncreatenewpreferenceevent => actioncreatenewpreferenceevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewpreferenceevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Global Scope
  	//DATA CONTEXT
  	//Feature selectedPreferences
  		@Input()
  		DIMEList<Data.Feature> selectedPreferences;
  	//Feature features
  		@Input()
  		DIMEList<Data.Feature> features;
  	//Feature selectedFeatures
  		@Input()
  		DIMEList<Data.Feature> selectedFeatures;
  	//Feature preferences
  		@Input()
  		DIMEList<Data.Feature> preferences;
  	@Input()
  	String description;
  	//Bidding bidding
  		@Input()
  		Data.Bidding bidding;
  	//Extra input variables
	
	//FORM
	ControlGroup form_HWNIFtTEe2ySJBy9D3dpw_INTERNALForm;
	bool formLoaded = false;
	//Form Inputs:
	// input field: Desription
	String input__CRDJcWBiEe2zFOcETdlBwQ;

	@Output('primitive_description_update') Stream<dynamic> get primitive_description_update => _primitive_description_update.stream;
	StreamController<dynamic> _primitive_description_update = new StreamController();
	
	@Output('complex_bidding_update') Stream<dynamic> get complex_bidding_update => _complex_bidding_update.stream;
	StreamController<dynamic> _complex_bidding_update = new StreamController();

  	Form_HWNIFtTEe2ySJBy9D3dpw_INTERNALBiddingAreaEdit(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		
			  	
		// branch Create new feature declaration
		if(this.actioncreatenewfeatureevent!=null) {
			  			this.actioncreatenewfeatureevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create new preference declaration
		if(this.actioncreatenewpreferenceevent!=null) {
			  			this.actioncreatenewpreferenceevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// table
		if(tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL!=null) {
			tableComponentaNVwBQV3WEe2FVevBlBmE3A_INTERNAL.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaa_RZAV7pEe2MjMOCwlD7jg!=null) {
			tableComponentaa_RZAV7pEe2MjMOCwlD7jg.forEach((n) => n.restartComponent());
		}
	}
	
	String propagatedescriptionPrimitives(String value) {
		_primitive_description_update.add(value);
		return value;
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
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
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		this.input__CRDJcWBiEe2zFOcETdlBwQ = this.description;
		if(form_HWNIFtTEe2ySJBy9D3dpw_INTERNALForm!=null) {
			(form_HWNIFtTEe2ySJBy9D3dpw_INTERNALForm.controls['input__CRDJcWBiEe2zFOcETdlBwQ'] as Control).updateValue(this.input__CRDJcWBiEe2zFOcETdlBwQ);
		}
		
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_HWNIFtTEe2ySJBy9D3dpw_INTERNALForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_HWNIFtTEe2ySJBy9D3dpw_INTERNALForm = FormBuilder.controlGroup({
			"input__CRDJcWBiEe2zFOcETdlBwQ": [
				this.description
,
				Validators.compose([
					
				])
				]
		});
		
		//FORM Field loading
		this.loadFormFieldValues();
	}
  
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Create new feature is clicked
  			void actioncreatenewfeatureeventaEABIkF_45_lEe2c5ZoBUTVdBwEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_HWNIFtTEe2ySJBy9D3dpw_INTERNALFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		/// callback, if the button Create new preference is clicked
  			void actioncreatenewpreferenceeventaEli3gV_45_lEe2c5ZoBUTVdBwEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_HWNIFtTEe2ySJBy9D3dpw_INTERNALFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
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
  				this._complex_bidding_update.add(this.bidding);
  			}
  			return this.bidding;
  		}
  		void setValuebidding(Data.Bidding
  		 value)
  		{
  			this.bidding = value;
  			this._complex_bidding_update.add(this.bidding);
  		}
  		void biddingsetValue(Data.Bidding
  		 value)
  		{
  			this.setValuebidding(value);
  		}
  		
  	
  		
  		
  		
	// Triggered on Form Submit
	void form_HWNIFtTEe2ySJBy9D3dpw_INTERNALFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	// input field Desription with type: Text
	if(this.input__CRDJcWBiEe2zFOcETdlBwQ!=null){
		if(this.input__CRDJcWBiEe2zFOcETdlBwQ.toString().isNotEmpty){
			this.setValuedescription(
			input__CRDJcWBiEe2zFOcETdlBwQ
			);
			propagatedescriptionPrimitives(this.description);
		} else {
			this.setValuedescription('');
			propagatedescriptionPrimitives(this.description);
		}
	} else {
		this.setValuedescription('');
		propagatedescriptionPrimitives(this.description);
	}
	}
		
	
}

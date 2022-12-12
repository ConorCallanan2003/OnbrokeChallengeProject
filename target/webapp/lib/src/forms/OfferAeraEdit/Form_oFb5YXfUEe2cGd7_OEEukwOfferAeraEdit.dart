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
import 'package:app/src/tables/OfferAeraEdit/Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit.dart' as aoFfj9XfUEe2cGd7_OEEukw;
import 'package:app/src/tables/OfferAeraEdit/Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit.dart' as aoFgLG3fUEe2cGd7_OEEukw;
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'package:app/src/core/Validators.dart' as validators;

// Form placed in GUI model OfferAeraEdit
@Component(
  selector: 'form-_oFb5YXfUEe2cGd7_OEEukw-offerAeraEdit',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aoFfj9XfUEe2cGd7_OEEukw.Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit,
  aoFgLG3fUEe2cGd7_OEEukw.Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit,
  ],
  templateUrl: 'Form_oFb5YXfUEe2cGd7_OEEukwOfferAeraEdit.html'
)
class Form_oFb5YXfUEe2cGd7_OEEukwOfferAeraEdit extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(aoFfj9XfUEe2cGd7_OEEukw.Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit)
  	List<aoFfj9XfUEe2cGd7_OEEukw.Table_oFfj9XfUEe2cGd7_OEEukwOfferAeraEdit> tableComponentaoFfj9XfUEe2cGd7_OEEukw;
  	/// Table
  	@ViewChildren(aoFgLG3fUEe2cGd7_OEEukw.Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit)
  	List<aoFgLG3fUEe2cGd7_OEEukw.Table_oFgLG3fUEe2cGd7_OEEukwOfferAeraEdit> tableComponentaoFgLG3fUEe2cGd7_OEEukw;
  	// branch Create new feature as info.scce.dime.gui.editor.graphiti.api.CButton@fc3d0639 (id: _oFfj5HfUEe2cGd7_OEEukw) in info.scce.dime.gui.editor.graphiti.api.CGUI@d23a1354 (id: _kAL7QXfUEe2cGd7_OEEukw)
  	@Output('actioncreatenewfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreatenewfeatureevent => actioncreatenewfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewfeatureevent = new StreamController();
  	// branch Create new preference as info.scce.dime.gui.editor.graphiti.api.CButton@50d7c5c0 (id: _oFgLCnfUEe2cGd7_OEEukw) in info.scce.dime.gui.editor.graphiti.api.CGUI@d23a1354 (id: _kAL7QXfUEe2cGd7_OEEukw)
  	@Output('actioncreatenewpreferenceevent') Stream<Map<String,dynamic>> get evt_actioncreatenewpreferenceevent => actioncreatenewpreferenceevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewpreferenceevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Global Scope
  	//DATA CONTEXT
  	//Offer offer
  		@Input()
  		Data.Offer offer;
  	//Feature preferences
  		@Input()
  		DIMEList<Data.Feature> preferences;
  	//Feature selectedPreferences
  		@Input()
  		DIMEList<Data.Feature> selectedPreferences;
  	@Input()
  	String description;
  	//Feature features
  		@Input()
  		DIMEList<Data.Feature> features;
  	//Feature selectedFeatures
  		@Input()
  		DIMEList<Data.Feature> selectedFeatures;
  	//Extra input variables
	
	//FORM
	ControlGroup form_oFb5YXfUEe2cGd7_OEEukwForm;
	bool formLoaded = false;
	//Form Inputs:
	// input field: Desription
	String input__oFgyHHfUEe2cGd7_OEEukw;

	@Output('primitive_description_update') Stream<dynamic> get primitive_description_update => _primitive_description_update.stream;
	StreamController<dynamic> _primitive_description_update = new StreamController();
	
	@Output('complex_offer_update') Stream<dynamic> get complex_offer_update => _complex_offer_update.stream;
	StreamController<dynamic> _complex_offer_update = new StreamController();

  	Form_oFb5YXfUEe2cGd7_OEEukwOfferAeraEdit(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
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
		if(tableComponentaoFfj9XfUEe2cGd7_OEEukw!=null) {
			tableComponentaoFfj9XfUEe2cGd7_OEEukw.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaoFgLG3fUEe2cGd7_OEEukw!=null) {
			tableComponentaoFgLG3fUEe2cGd7_OEEukw.forEach((n) => n.restartComponent());
		}
	}
	
	String propagatedescriptionPrimitives(String value) {
		_primitive_description_update.add(value);
		return value;
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
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
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		this.input__oFgyHHfUEe2cGd7_OEEukw = this.description;
		if(form_oFb5YXfUEe2cGd7_OEEukwForm!=null) {
			(form_oFb5YXfUEe2cGd7_OEEukwForm.controls['input__oFgyHHfUEe2cGd7_OEEukw'] as Control).updateValue(this.input__oFgyHHfUEe2cGd7_OEEukw);
		}
		
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_oFb5YXfUEe2cGd7_OEEukwForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_oFb5YXfUEe2cGd7_OEEukwForm = FormBuilder.controlGroup({
			"input__oFgyHHfUEe2cGd7_OEEukw": [
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
  			void actioncreatenewfeatureeventaoFfj5HfUEe2cGd7_OEEukwEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_oFb5YXfUEe2cGd7_OEEukwFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		/// callback, if the button Create new preference is clicked
  			void actioncreatenewpreferenceeventaoFgLCnfUEe2cGd7_OEEukwEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_oFb5YXfUEe2cGd7_OEEukwFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncreatenewpreferenceevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.Offer
  		 initOnDemandoffer()
  		{
  			if(this.offer==null){
  				this.offer = new Data.Offer
  				();
  				this._complex_offer_update.add(this.offer);
  			}
  			return this.offer;
  		}
  		void setValueoffer(Data.Offer
  		 value)
  		{
  			this.offer = value;
  			this._complex_offer_update.add(this.offer);
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
  		
  	
  		
  		
  		
	// Triggered on Form Submit
	void form_oFb5YXfUEe2cGd7_OEEukwFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	// input field Desription with type: Text
	if(this.input__oFgyHHfUEe2cGd7_OEEukw!=null){
		if(this.input__oFgyHHfUEe2cGd7_OEEukw.toString().isNotEmpty){
			this.setValuedescription(
			input__oFgyHHfUEe2cGd7_OEEukw
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

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
import 'package:app/src/tables/NewBiddingArea/Table_p7ZzEWBHEe2Zz8LOII5r3gNewBiddingArea.dart' as ap7ZzEWBHEe2Zz8LOII5r3g;
import 'package:app/src/tables/NewBiddingArea/Table_qKoh4WBHEe2Zz8LOII5r3gNewBiddingArea.dart' as aqKoh4WBHEe2Zz8LOII5r3g;
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'package:app/src/core/Validators.dart' as validators;

// Form placed in GUI model NewBiddingArea
@Component(
  selector: 'form-_kVGR4WBHEe2Zz8LOII5r3g-newBiddingArea',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ap7ZzEWBHEe2Zz8LOII5r3g.Table_p7ZzEWBHEe2Zz8LOII5r3gNewBiddingArea,
  aqKoh4WBHEe2Zz8LOII5r3g.Table_qKoh4WBHEe2Zz8LOII5r3gNewBiddingArea,
  ],
  templateUrl: 'Form_kVGR4WBHEe2Zz8LOII5r3gNewBiddingArea.html'
)
class Form_kVGR4WBHEe2Zz8LOII5r3gNewBiddingArea extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	bool refresh_p7ZzEWBHEe2Zz8LOII5r3gTable;
  	bool refresh_qKoh4WBHEe2Zz8LOII5r3gTable;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(ap7ZzEWBHEe2Zz8LOII5r3g.Table_p7ZzEWBHEe2Zz8LOII5r3gNewBiddingArea)
  	List<ap7ZzEWBHEe2Zz8LOII5r3g.Table_p7ZzEWBHEe2Zz8LOII5r3gNewBiddingArea> tableComponentap7ZzEWBHEe2Zz8LOII5r3g;
  	/// Table
  	@ViewChildren(aqKoh4WBHEe2Zz8LOII5r3g.Table_qKoh4WBHEe2Zz8LOII5r3gNewBiddingArea)
  	List<aqKoh4WBHEe2Zz8LOII5r3g.Table_qKoh4WBHEe2Zz8LOII5r3gNewBiddingArea> tableComponentaqKoh4WBHEe2Zz8LOII5r3g;
  	// branch Create New Feature as info.scce.dime.gui.editor.graphiti.api.CButton@3ffeaaa5 (id: _shOl0WBHEe2Zz8LOII5r3g) in info.scce.dime.gui.editor.graphiti.api.CGUI@377ffede (id: _ZI100WBHEe2Zz8LOII5r3g)
  	@Output('actioncreatenewfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreatenewfeatureevent => actioncreatenewfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewfeatureevent = new StreamController();
  	// branch Create New Preference as info.scce.dime.gui.editor.graphiti.api.CButton@f6afe65c (id: _s9JFwWBHEe2Zz8LOII5r3g) in info.scce.dime.gui.editor.graphiti.api.CGUI@377ffede (id: _ZI100WBHEe2Zz8LOII5r3g)
  	@Output('actioncreatenewpreferenceevent') Stream<Map<String,dynamic>> get evt_actioncreatenewpreferenceevent => actioncreatenewpreferenceevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatenewpreferenceevent = new StreamController();
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@39e9b270 (id: _wqqgYWBHEe2Zz8LOII5r3g) in info.scce.dime.gui.editor.graphiti.api.CGUI@377ffede (id: _ZI100WBHEe2Zz8LOII5r3g)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@4961cd3b (id: _xCUycWBHEe2Zz8LOII5r3g) in info.scce.dime.gui.editor.graphiti.api.CGUI@377ffede (id: _ZI100WBHEe2Zz8LOII5r3g)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Global Scope
  	//DATA CONTEXT
  	//Feature features
  		@Input()
  		DIMEList<Data.Feature> features;
  	//Feature preferences
  		@Input()
  		DIMEList<Data.Feature> preferences;
  	//Feature selectedFeature
  		@Input()
  		DIMEList<Data.Feature> selectedFeature;
  	@Input()
  	String title;
  	//Feature selectedPreferences
  		@Input()
  		DIMEList<Data.Feature> selectedPreferences;
  	@Input()
  	String description;
  	//Extra input variables
	
	//FORM
	ControlGroup form_kVGR4WBHEe2Zz8LOII5r3gForm;
	bool formLoaded = false;
	//Form Inputs:
	// input field: Desription
	String input__JpxDcWBiEe2zFOcETdlBwQ;
	// input field: Title
	String input__kwsBsWBHEe2Zz8LOII5r3g;

	@Output('primitive_title_update') Stream<dynamic> get primitive_title_update => _primitive_title_update.stream;
	StreamController<dynamic> _primitive_title_update = new StreamController();
	@Output('primitive_description_update') Stream<dynamic> get primitive_description_update => _primitive_description_update.stream;
	StreamController<dynamic> _primitive_description_update = new StreamController();
	

  	Form_kVGR4WBHEe2Zz8LOII5r3gNewBiddingArea(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		
			  	
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
			
		/// table
		if(tableComponentap7ZzEWBHEe2Zz8LOII5r3g!=null) {
			tableComponentap7ZzEWBHEe2Zz8LOII5r3g.forEach((n) => n.restartComponent());
		}
		/// table
		if(tableComponentaqKoh4WBHEe2Zz8LOII5r3g!=null) {
			tableComponentaqKoh4WBHEe2Zz8LOII5r3g.forEach((n) => n.restartComponent());
		}
	}
	
	String propagatetitlePrimitives(String value) {
		_primitive_title_update.add(value);
		return value;
	}
	String propagatedescriptionPrimitives(String value) {
		_primitive_description_update.add(value);
		return value;
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentap7ZzEWBHEe2Zz8LOII5r3g.forEach((n)=>n.updateWithoutInputs());
			tableComponentaqKoh4WBHEe2Zz8LOII5r3g.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Feature>  pfeatures,
	DIMEList<Data.Feature>  ppreferences
	})
	{
		features = pfeatures;
		preferences = ppreferences;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentap7ZzEWBHEe2Zz8LOII5r3g.forEach((n)=>n.updateInputs(
			pfeatures:features,
			ppreferences:preferences
		));
		tableComponentaqKoh4WBHEe2Zz8LOII5r3g.forEach((n)=>n.updateInputs(
			pfeatures:features,
			ppreferences:preferences
		));
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		this.input__JpxDcWBiEe2zFOcETdlBwQ = this.description;
		if(form_kVGR4WBHEe2Zz8LOII5r3gForm!=null) {
			(form_kVGR4WBHEe2Zz8LOII5r3gForm.controls['input__JpxDcWBiEe2zFOcETdlBwQ'] as Control).updateValue(this.input__JpxDcWBiEe2zFOcETdlBwQ);
		}
		
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_kVGR4WBHEe2Zz8LOII5r3gForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_kVGR4WBHEe2Zz8LOII5r3gForm = FormBuilder.controlGroup({
			"input__JpxDcWBiEe2zFOcETdlBwQ": [
				this.description
,
				Validators.compose([
					
				])
				],
			"input__kwsBsWBHEe2Zz8LOII5r3g": [
				""
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
  		
  		
  		
  		
  	
  		/// callback, if the button Create New Feature is clicked
  			void actioncreatenewfeatureeventashOl0WBHEe2Zz8LOII5r3gEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_kVGR4WBHEe2Zz8LOII5r3gFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncreatenewfeatureevent.add(data);
  		}
  		/// callback, if the button Create New Preference is clicked
  			void actioncreatenewpreferenceeventas9JFwWBHEe2Zz8LOII5r3gEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_kVGR4WBHEe2Zz8LOII5r3gFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncreatenewpreferenceevent.add(data);
  		}
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventawqqgYWBHEe2Zz8LOII5r3gEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_kVGR4WBHEe2Zz8LOII5r3gFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			data['title'] = this.title;
  			data['selectedFeature'] = this.selectedFeature;
  			data['selectedPreferences'] = this.selectedPreferences;
  			data['description'] = this.description;
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  			void actioncanceleventaxCUycWBHEe2Zz8LOII5r3gEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_kVGR4WBHEe2Zz8LOII5r3gFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncancelevent.add(data);
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
  		
  	
  		
  		
  		
	// Triggered on Form Submit
	void form_kVGR4WBHEe2Zz8LOII5r3gFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	// input field Desription with type: Text
	if(this.input__JpxDcWBiEe2zFOcETdlBwQ!=null){
		if(this.input__JpxDcWBiEe2zFOcETdlBwQ.toString().isNotEmpty){
			this.setValuedescription(
			input__JpxDcWBiEe2zFOcETdlBwQ
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
	// input field Title with type: Text
	if(this.input__kwsBsWBHEe2Zz8LOII5r3g!=null){
		if(this.input__kwsBsWBHEe2Zz8LOII5r3g.toString().isNotEmpty){
			this.setValuetitle(
			input__kwsBsWBHEe2Zz8LOII5r3g
			);
			propagatetitlePrimitives(this.title);
		} else {
			this.setValuetitle('');
			propagatetitlePrimitives(this.title);
		}
	} else {
		this.setValuetitle('');
		propagatetitlePrimitives(this.title);
	}
	}
		
	
}

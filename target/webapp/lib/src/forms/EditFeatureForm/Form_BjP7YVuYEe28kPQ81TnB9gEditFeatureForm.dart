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
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'package:app/src/core/Validators.dart' as validators;

// Form placed in GUI model EditFeatureForm
@Component(
  selector: 'form-_BjP7YVuYEe28kPQ81TnB9g-editFeatureForm',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'Form_BjP7YVuYEe28kPQ81TnB9gEditFeatureForm.html'
)
class Form_BjP7YVuYEe28kPQ81TnB9gEditFeatureForm extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	
  	
  	
  	
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@9938ae5d (id: _BjRJk1uYEe28kPQ81TnB9g) in info.scce.dime.gui.editor.graphiti.api.CGUI@955f4f91 (id: _-UC0cVuXEe28kPQ81TnB9g)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@5515cf0d (id: _BjRwmVuYEe28kPQ81TnB9g) in info.scce.dime.gui.editor.graphiti.api.CGUI@955f4f91 (id: _-UC0cVuXEe28kPQ81TnB9g)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Global Scope
  	//DATA CONTEXT
  	@Input()
  	String title;
  	//Priority priorities
  		@Input()
  		DIMEList<Data.Priority> priorities;
  	//Priority priority
  		@Input()
  		Data.Priority priority;
  	//Feature feature
  		@Input()
  		Data.Feature feature;
  	//Extra input variables
	
	//FORM
	ControlGroup form_BjP7YVuYEe28kPQ81TnB9gForm;
	bool formLoaded = false;
	//Form Inputs:
	// input field: Title
	String input__BjRJpFuYEe28kPQ81TnB9g;
	Data.Priority
	 input__462EAWGeEe2SIeIc0TVXOQ;
	//Select Priority Choice values
	DIMEList<Data.Priority>
	 input__462EAWGeEe2SIeIc0TVXOQIteratable;

	@Output('primitive_title_update') Stream<dynamic> get primitive_title_update => _primitive_title_update.stream;
	StreamController<dynamic> _primitive_title_update = new StreamController();
	
	@Output('complex_feature_update') Stream<dynamic> get complex_feature_update => _complex_feature_update.stream;
	StreamController<dynamic> _complex_feature_update = new StreamController();
	@Output('complex_priority_update') Stream<dynamic> get complex_priority_update => _complex_priority_update.stream;
	StreamController<dynamic> _complex_priority_update = new StreamController();

  	Form_BjP7YVuYEe28kPQ81TnB9gEditFeatureForm(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
			
	}
	
	String propagatetitlePrimitives(String value) {
		_primitive_title_update.add(value);
		return value;
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		updateImageHash();
	}
	
	void updateInputs(
	{String ptitle,
	DIMEList<Data.Priority>  ppriorities,
	Data.Priority ppriority,
	Data.Feature pfeature
	})
	{
		title = ptitle;
		priorities = ppriorities;
		priority = ppriority;
		feature = pfeature;
		
		updateWithoutInputs(updateHidden:false);
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		
		//Select Choice values
		this.input__462EAWGeEe2SIeIc0TVXOQIteratable = this.priorities;
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_BjP7YVuYEe28kPQ81TnB9gForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_BjP7YVuYEe28kPQ81TnB9gForm = FormBuilder.controlGroup({
			"input__BjRJpFuYEe28kPQ81TnB9g": [
				""
				,
				Validators.compose([
					
				])
				],
		"input__462EAWGeEe2SIeIc0TVXOQ": [this.priorities,Validators.compose([
			
		])
		]
		});
		
		//FORM Field loading
		this.loadFormFieldValues();
	}
  
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventaBjRJk1uYEe28kPQ81TnB9gEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_BjP7YVuYEe28kPQ81TnB9gFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			data['title'] = this.title;
  			data['priority'] = this.priority;
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  			void actioncanceleventaBjRwmVuYEe28kPQ81TnB9gEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_BjP7YVuYEe28kPQ81TnB9gFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncancelevent.add(data);
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
  		DIMEList<Data.Priority>
  		 initOnDemandpriorities()
  		{
  			if(this.priorities==null){
  				this.priorities = new DIMEList<Data.Priority>
  				();
  			}
  			return this.priorities;
  		}
  		void setValuepriorities(DIMEList<Data.Priority>
  		 value)
  		{
  			this.priorities = value;
  		}
  		void prioritiessetValue(DIMEList<Data.Priority>
  		 value)
  		{
  			this.setValuepriorities(value);
  		}
  		void prioritiesadd(Data.Priority
  		 value)
  		{
  			this.priorities.add(value);
  		}
  		Data.Priority
  		 initOnDemandpriority()
  		{
  			if(this.priority==null){
  				this.priority = new Data.Priority
  				();
  				this._complex_priority_update.add(this.priority);
  			}
  			return this.priority;
  		}
  		void setValuepriority(Data.Priority
  		 value)
  		{
  			this.priority = value;
  			this._complex_priority_update.add(this.priority);
  		}
  		void prioritysetValue(Data.Priority
  		 value)
  		{
  			this.setValuepriority(value);
  		}
  		Data.Feature
  		 initOnDemandfeature()
  		{
  			if(this.feature==null){
  				this.feature = new Data.Feature
  				();
  				this._complex_feature_update.add(this.feature);
  			}
  			return this.feature;
  		}
  		void setValuefeature(Data.Feature
  		 value)
  		{
  			this.feature = value;
  			this._complex_feature_update.add(this.feature);
  		}
  		void featuresetValue(Data.Feature
  		 value)
  		{
  			this.setValuefeature(value);
  		}
  		
  	
  		
  		
  		
	// Triggered on Form Submit
	void form_BjP7YVuYEe28kPQ81TnB9gFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	// input field Title with type: Text
	if(this.input__BjRJpFuYEe28kPQ81TnB9g!=null){
		if(this.input__BjRJpFuYEe28kPQ81TnB9g.toString().isNotEmpty){
			this.setValuetitle(
			input__BjRJpFuYEe28kPQ81TnB9g
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
		
	
	// methods for the select form field Priority
		// dynamic data source for the select from field
		
		/// checks if a given complex selection entry is selected
		bool is_462EAWGeEe2SIeIc0TVXOQSelected(dynamic element)
		{
			if(this.priority == null)return false;
		return element==this.priority;
		}
		
		/// callback to update the variables binded to the selection form component
		void submitSelect_462EAWGeEe2SIeIc0TVXOQBox(dynamic event) {
	// radio
	int index = int.parse(event.target.value);
	if(index < 0) {
		this.setValuepriority(null);
	}
	else {
		this.setValuepriority(this.initOnDemandpriorities()[index]);
	}
		}
}

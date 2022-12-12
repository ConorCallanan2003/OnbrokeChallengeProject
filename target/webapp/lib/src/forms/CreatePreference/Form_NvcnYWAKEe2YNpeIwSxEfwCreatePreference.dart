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

// Form placed in GUI model CreatePreference
@Component(
  selector: 'form-_NvcnYWAKEe2YNpeIwSxEfw-createPreference',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'Form_NvcnYWAKEe2YNpeIwSxEfwCreatePreference.html'
)
class Form_NvcnYWAKEe2YNpeIwSxEfwCreatePreference extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	
  	
  	
  	
  	
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Global Scope
  	//DATA CONTEXT
  	@Input()
  	String title;
  	//Extra input variables
	
	//FORM
	ControlGroup form_NvcnYWAKEe2YNpeIwSxEfwForm;
	bool formLoaded = false;
	//Form Inputs:
	// input field: Preference Name
	String input__OaAAQWAKEe2YNpeIwSxEfw;

	@Output('primitive_title_update') Stream<dynamic> get primitive_title_update => _primitive_title_update.stream;
	StreamController<dynamic> _primitive_title_update = new StreamController();
	

  	Form_NvcnYWAKEe2YNpeIwSxEfwCreatePreference(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		
			  	
			
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
	)
	{
		
		updateWithoutInputs(updateHidden:false);
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		this.input__OaAAQWAKEe2YNpeIwSxEfw = this.title;
		if(form_NvcnYWAKEe2YNpeIwSxEfwForm!=null) {
			(form_NvcnYWAKEe2YNpeIwSxEfwForm.controls['input__OaAAQWAKEe2YNpeIwSxEfw'] as Control).updateValue(this.input__OaAAQWAKEe2YNpeIwSxEfw);
		}
		
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_NvcnYWAKEe2YNpeIwSxEfwForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_NvcnYWAKEe2YNpeIwSxEfwForm = FormBuilder.controlGroup({
			"input__OaAAQWAKEe2YNpeIwSxEfw": [
				this.title
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
  		
  	
  		
  		
  		
	// Triggered on Form Submit
	void form_NvcnYWAKEe2YNpeIwSxEfwFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	// input field Preference Name with type: Text
	if(this.input__OaAAQWAKEe2YNpeIwSxEfw!=null){
		if(this.input__OaAAQWAKEe2YNpeIwSxEfw.toString().isNotEmpty){
			this.setValuetitle(
			input__OaAAQWAKEe2YNpeIwSxEfw
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

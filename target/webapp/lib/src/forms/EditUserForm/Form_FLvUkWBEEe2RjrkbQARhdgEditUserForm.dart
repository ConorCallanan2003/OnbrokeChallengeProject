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

// Form placed in GUI model EditUserForm
@Component(
  selector: 'form-_FLvUkWBEEe2RjrkbQARhdg-editUserForm',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'Form_FLvUkWBEEe2RjrkbQARhdgEditUserForm.html'
)
class Form_FLvUkWBEEe2RjrkbQARhdgEditUserForm extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	
  	
  	
  	
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@83d324d1 (id: _FLv7w2BEEe2RjrkbQARhdg) in info.scce.dime.gui.editor.graphiti.api.CGUI@7a5fb9a2 (id: _CPN5EWBEEe2RjrkbQARhdg)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@6733f696 (id: _FLv71GBEEe2RjrkbQARhdg) in info.scce.dime.gui.editor.graphiti.api.CGUI@7a5fb9a2 (id: _CPN5EWBEEe2RjrkbQARhdg)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Global Scope
  	//DATA CONTEXT
  	//UserRole userRole
  		@Input()
  		Data.UserRole userRole;
  	//User currentUser
  		@Input()
  		Data.User currentUser;
  	@Input()
  	String lastName;
  	@Input()
  	String firstName;
  	//UserRole userRoles
  		@Input()
  		DIMEList<Data.UserRole> userRoles;
  	//Extra input variables
	
	//FORM
	ControlGroup form_FLvUkWBEEe2RjrkbQARhdgForm;
	bool formLoaded = false;
	//Form Inputs:
	// input field: First Name
	String input__FL3QYGBEEe2RjrkbQARhdg;
	// input field: Last Name
	String input__FL33cWBEEe2RjrkbQARhdg;
	Data.UserRole
	 input__FL7h0WBEEe2RjrkbQARhdg;
	//Select Role Choice values
	DIMEList<Data.UserRole>
	 input__FL7h0WBEEe2RjrkbQARhdgIteratable;

	@Output('primitive_lastName_update') Stream<dynamic> get primitive_lastName_update => _primitive_lastName_update.stream;
	StreamController<dynamic> _primitive_lastName_update = new StreamController();
	@Output('primitive_firstName_update') Stream<dynamic> get primitive_firstName_update => _primitive_firstName_update.stream;
	StreamController<dynamic> _primitive_firstName_update = new StreamController();
	
	@Output('complex_currentUser_update') Stream<dynamic> get complex_currentUser_update => _complex_currentUser_update.stream;
	StreamController<dynamic> _complex_currentUser_update = new StreamController();
	@Output('complex_userRole_update') Stream<dynamic> get complex_userRole_update => _complex_userRole_update.stream;
	StreamController<dynamic> _complex_userRole_update = new StreamController();

  	Form_FLvUkWBEEe2RjrkbQARhdgEditUserForm(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
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
	
	String propagatelastNamePrimitives(String value) {
		_primitive_lastName_update.add(value);
		return value;
	}
	String propagatefirstNamePrimitives(String value) {
		_primitive_firstName_update.add(value);
		return value;
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		updateImageHash();
	}
	
	void updateInputs(
	{Data.UserRole puserRole,
	Data.User pcurrentUser,
	String plastName,
	String pfirstName,
	DIMEList<Data.UserRole>  puserRoles
	})
	{
		userRole = puserRole;
		currentUser = pcurrentUser;
		lastName = plastName;
		firstName = pfirstName;
		userRoles = puserRoles;
		
		updateWithoutInputs(updateHidden:false);
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		
		//Select Choice values
		this.input__FL7h0WBEEe2RjrkbQARhdgIteratable = this.userRoles;
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_FLvUkWBEEe2RjrkbQARhdgForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_FLvUkWBEEe2RjrkbQARhdgForm = FormBuilder.controlGroup({
			"input__FL3QYGBEEe2RjrkbQARhdg": [
				""
				,
				Validators.compose([
					
				])
				],
			"input__FL33cWBEEe2RjrkbQARhdg": [
				""
				,
				Validators.compose([
					
				])
				],
		"input__FL7h0WBEEe2RjrkbQARhdg": [this.userRoles,Validators.compose([
			
		])
		]
		});
		
		//FORM Field loading
		this.loadFormFieldValues();
	}
  
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Submit is clicked
  			void actionsubmiteventaFLv7w2BEEe2RjrkbQARhdgEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_FLvUkWBEEe2RjrkbQARhdgFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			data['lastName'] = this.lastName;
  			data['firstName'] = this.firstName;
  			data['userRole'] = this.userRole;
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  			void actioncanceleventaFLv71GBEEe2RjrkbQARhdgEventTrigger(dynamic formValues)
  		
  		{
  			//Submit Form Values
  			this.form_FLvUkWBEEe2RjrkbQARhdgFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			this.actioncancelevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.UserRole
  		 initOnDemanduserRole()
  		{
  			if(this.userRole==null){
  				this.userRole = new Data.UserRole
  				();
  				this._complex_userRole_update.add(this.userRole);
  			}
  			return this.userRole;
  		}
  		void setValueuserRole(Data.UserRole
  		 value)
  		{
  			this.userRole = value;
  			this._complex_userRole_update.add(this.userRole);
  		}
  		void userRolesetValue(Data.UserRole
  		 value)
  		{
  			this.setValueuserRole(value);
  		}
  		Data.User
  		 initOnDemandcurrentUser()
  		{
  			if(this.currentUser==null){
  				this.currentUser = new Data.User
  				();
  				this._complex_currentUser_update.add(this.currentUser);
  			}
  			return this.currentUser;
  		}
  		void setValuecurrentUser(Data.User
  		 value)
  		{
  			this.currentUser = value;
  			this._complex_currentUser_update.add(this.currentUser);
  		}
  		void currentUsersetValue(Data.User
  		 value)
  		{
  			this.setValuecurrentUser(value);
  		}
  		String initOnDemandlastName()
  		{
  			return this.lastName;
  		}
  		void setValuelastName(String value)
  		{
  			this.lastName = value;
  		}
  		void lastNamesetValue(String value)
  		{
  			this.setValuelastName(value);
  		}
  		String initOnDemandfirstName()
  		{
  			return this.firstName;
  		}
  		void setValuefirstName(String value)
  		{
  			this.firstName = value;
  		}
  		void firstNamesetValue(String value)
  		{
  			this.setValuefirstName(value);
  		}
  		DIMEList<Data.UserRole>
  		 initOnDemanduserRoles()
  		{
  			if(this.userRoles==null){
  				this.userRoles = new DIMEList<Data.UserRole>
  				();
  			}
  			return this.userRoles;
  		}
  		void setValueuserRoles(DIMEList<Data.UserRole>
  		 value)
  		{
  			this.userRoles = value;
  		}
  		void userRolessetValue(DIMEList<Data.UserRole>
  		 value)
  		{
  			this.setValueuserRoles(value);
  		}
  		void userRolesadd(Data.UserRole
  		 value)
  		{
  			this.userRoles.add(value);
  		}
  		
  	
  		
  		
  		
	// Triggered on Form Submit
	void form_FLvUkWBEEe2RjrkbQARhdgFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	// input field First Name with type: Text
	if(this.input__FL3QYGBEEe2RjrkbQARhdg!=null){
		if(this.input__FL3QYGBEEe2RjrkbQARhdg.toString().isNotEmpty){
			this.setValuefirstName(
			input__FL3QYGBEEe2RjrkbQARhdg
			);
			propagatefirstNamePrimitives(this.firstName);
		} else {
			this.setValuefirstName('');
			propagatefirstNamePrimitives(this.firstName);
		}
	} else {
		this.setValuefirstName('');
		propagatefirstNamePrimitives(this.firstName);
	}
	// input field Last Name with type: Text
	if(this.input__FL33cWBEEe2RjrkbQARhdg!=null){
		if(this.input__FL33cWBEEe2RjrkbQARhdg.toString().isNotEmpty){
			this.setValuelastName(
			input__FL33cWBEEe2RjrkbQARhdg
			);
			propagatelastNamePrimitives(this.lastName);
		} else {
			this.setValuelastName('');
			propagatelastNamePrimitives(this.lastName);
		}
	} else {
		this.setValuelastName('');
		propagatelastNamePrimitives(this.lastName);
	}
	}
		
	
	// methods for the select form field Role
		// dynamic data source for the select from field
		
		/// checks if a given complex selection entry is selected
		bool is_FL7h0WBEEe2RjrkbQARhdgSelected(dynamic element)
		{
			if(this.userRole == null)return false;
		return element==this.userRole;
		}
		
		/// callback to update the variables binded to the selection form component
		void submitSelect_FL7h0WBEEe2RjrkbQARhdgBox(dynamic event) {
	// radio
	int index = int.parse(event.target.value);
	if(index < 0) {
		this.setValueuserRole(null);
	}
	else {
		this.setValueuserRole(this.initOnDemanduserRoles()[index]);
	}
		}
}

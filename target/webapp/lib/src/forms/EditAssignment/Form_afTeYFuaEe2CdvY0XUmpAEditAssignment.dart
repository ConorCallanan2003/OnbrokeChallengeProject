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

// Form placed in GUI model EditAssignment
@Component(
  selector: 'form-_afTeYFuaEe2CdvY0XUmpA-editAssignment',
  viewProviders: const [FORM_BINDINGS],
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  ],
  templateUrl: 'Form_afTeYFuaEe2CdvY0XUmpAEditAssignment.html'
)
class Form_afTeYFuaEe2CdvY0XUmpAEditAssignment extends dime.DIMEComponent implements OnInit, AfterViewChecked {
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
  	
  	
  	
  	
  	
  	// branch Assign as info.scce.dime.gui.editor.graphiti.api.CButton@a371ae2d (id: _afXv0VuaEe2C-dvY0XUmpA) in info.scce.dime.gui.editor.graphiti.api.CGUI@80676da7 (id: _mOjJMVuZEe2C-dvY0XUmpA)
  	@Output('actionassignevent') Stream<Map<String,dynamic>> get evt_actionassignevent => actionassignevent.stream;
  	StreamController<Map<String,dynamic>> actionassignevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	
  	//Global Scope
  	//DATA CONTEXT
  	//Bidding bidding
  		@Input()
  		Data.Bidding bidding;
  	//Extra input variables
@Input() Data.Bidding
 thisBidding;
	
	//FORM
	ControlGroup form_afTeYFuaEe2CdvY0XUmpAForm;
	bool formLoaded = false;
	//Form Inputs:

	
	@Output('complex_bidding_update') Stream<dynamic> get complex_bidding_update => _complex_bidding_update.stream;
	StreamController<dynamic> _complex_bidding_update = new StreamController();

  	Form_afTeYFuaEe2CdvY0XUmpAEditAssignment(DIMEProcessService this.processService,Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		
			  	
		// branch Assign declaration
		if(this.actionassignevent!=null) {
			  			this.actionassignevent = new StreamController<Map<String,dynamic>>();  				
		}
			
	}
	
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Bidding pbidding
	})
	{
		bidding = pbidding;
		
		updateWithoutInputs(updateHidden:false);
		loadFormFieldValues();
		
	}
	
	void loadFormFieldValues() {
		
	}
	
	void ngAfterViewChecked() {
		if(html.querySelector("#form${this.form_afTeYFuaEe2CdvY0XUmpAForm.hashCode}")!=null&&!formLoaded) {
			formLoaded = true;
		}
	}
	
	
	/// called after the input variables are loaded, but before the template rendering
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		
		//FORM Field grouping and vaalidation
		this.form_afTeYFuaEe2CdvY0XUmpAForm = FormBuilder.controlGroup({
		});
		
		//FORM Field loading
		this.loadFormFieldValues();
	}
  
  		@override
  		String getRuntimeId() => this.runtimeId;
  		
  		
  		
  		
  	
  		/// callback, if the button Assign is clicked
  			void actionassigneventaafXv0VuaEe2C_45_dvY0XUmpAEventTrigger(
  				dynamic formValues,
  				p_Vh3igVwzEe2gxcFkjyzH4g
  				
  				)
  		
  		{
  			//Submit Form Values
  			this.form_afTeYFuaEe2CdvY0XUmpAFormSubmit(formValues);
  			Map<String,dynamic> data = new Map();
  			data['thisBidding'] = p_Vh3igVwzEe2gxcFkjyzH4g;
  			this.actionassignevent.add(data);
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
	void form_afTeYFuaEe2CdvY0XUmpAFormSubmit(Map formValues) {
	// Store Form Data in Attributes
	}
		
	
}

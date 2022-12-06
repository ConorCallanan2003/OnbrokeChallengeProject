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
import 'package:app/src/forms/UserForm/Form_V_IR4V3WEe2t19MJLPzxmgUserForm.dart' as aV_IR4V3WEe2t19MJLPzxmg;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "userform-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aV_IR4V3WEe2t19MJLPzxmg.Form_V_IR4V3WEe2t19MJLPzxmgUserForm,
  ],
  templateUrl: 'UserFormaBDkd8F3WEe2t19MJLPzxmg.html'
)

class UserFormaBDkd8F3WEe2t19MJLPzxmg extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	
  	
  	
  	
  	/// Form
  	@ViewChildren(aV_IR4V3WEe2t19MJLPzxmg.Form_V_IR4V3WEe2t19MJLPzxmgUserForm)
  	List<aV_IR4V3WEe2t19MJLPzxmg.Form_V_IR4V3WEe2t19MJLPzxmgUserForm> formComponentaV_IR4V3WEe2t19MJLPzxmg;
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@60f744f4 (id: _V_NKYV3WEe2t19MJLPzxmg) in info.scce.dime.gui.editor.graphiti.api.CGUI@e96f8863 (id: _BDkd8F3WEe2t19MJLPzxmg)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@1b1885b3 (id: _YG4okF3WEe2t19MJLPzxmg) in info.scce.dime.gui.editor.graphiti.api.CGUI@e96f8863 (id: _BDkd8F3WEe2t19MJLPzxmg)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//UserRole userRoles
		@Input()
		DIMEList<Data.UserRole> userRoles;
	//UserRole userRole
		Data.UserRole userRole;
	String firstName;
	String lastName;
	
	bool isDestroyed = true;
  
	UserFormaBDkd8F3WEe2t19MJLPzxmg(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// UserRole userRoles
		this.userRoles = new DIMEList();
		// UserRole userRole
		this.userRole = null;
		// Text firstName
		this.firstName = '';
		// Text lastName
		this.lastName = '';
						
						
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaV_IR4V3WEe2t19MJLPzxmg!=null) {
			formComponentaV_IR4V3WEe2t19MJLPzxmg.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaV_IR4V3WEe2t19MJLPzxmg.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.UserRole>  puserRoles
	})
	{
		userRoles = puserRoles;
		
		updateWithoutInputs(updateHidden:false);
		formComponentaV_IR4V3WEe2t19MJLPzxmg.forEach((n)=>n.updateInputs(
			puserRoles:userRoles
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
  		void actionsubmiteventaV_NKYV3WEe2t19MJLPzxmgEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  		void actioncanceleventaYG4okF3WEe2t19MJLPzxmgEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncancelevent.add(data);
  		}
  		
  		
  		
  		
  	
  		void formEventactionsubmiteventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		void formEventactioncanceleventTrigger(Map<String,dynamic> data)
  		{
  			this.actioncancelevent.add(data);
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
  		Data.UserRole
  		 initOnDemanduserRole()
  		{
  			if(this.userRole==null){
  				this.userRole = new Data.UserRole
  				();
  			}
  			return this.userRole;
  		}
  		void setValueuserRole(Data.UserRole
  		 value)
  		{
  			this.userRole = value;
  		}
  		void userRolesetValue(Data.UserRole
  		 value)
  		{
  			this.setValueuserRole(value);
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
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_BDkd8F3WEe2t19MJLPzxmgRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_BDkd8F3WEe2t19MJLPzxmgId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_BDkd8F3WEe2t19MJLPzxmg";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_BDkd8F3WEe2t19MJLPzxmgClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_BDkd8F3WEe2t19MJLPzxmgToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

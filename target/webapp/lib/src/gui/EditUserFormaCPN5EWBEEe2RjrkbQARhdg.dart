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
import 'package:app/src/forms/EditUserForm/Form_FLvUkWBEEe2RjrkbQARhdgEditUserForm.dart' as aFLvUkWBEEe2RjrkbQARhdg;
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "edituserform-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aFLvUkWBEEe2RjrkbQARhdg.Form_FLvUkWBEEe2RjrkbQARhdgEditUserForm,
  ],
  templateUrl: 'EditUserFormaCPN5EWBEEe2RjrkbQARhdg.html'
)

class EditUserFormaCPN5EWBEEe2RjrkbQARhdg extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	@ViewChildren(aFLvUkWBEEe2RjrkbQARhdg.Form_FLvUkWBEEe2RjrkbQARhdgEditUserForm)
  	List<aFLvUkWBEEe2RjrkbQARhdg.Form_FLvUkWBEEe2RjrkbQARhdgEditUserForm> formComponentaFLvUkWBEEe2RjrkbQARhdg;
  	
  	// branch Submit as info.scce.dime.gui.editor.graphiti.api.CButton@83d324d1 (id: _FLv7w2BEEe2RjrkbQARhdg) in info.scce.dime.gui.editor.graphiti.api.CGUI@7a5fb9a2 (id: _CPN5EWBEEe2RjrkbQARhdg)
  	@Output('actionsubmitevent') Stream<Map<String,dynamic>> get evt_actionsubmitevent => actionsubmitevent.stream;
  	StreamController<Map<String,dynamic>> actionsubmitevent = new StreamController();
  	// branch Cancel as info.scce.dime.gui.editor.graphiti.api.CButton@6733f696 (id: _FLv71GBEEe2RjrkbQARhdg) in info.scce.dime.gui.editor.graphiti.api.CGUI@7a5fb9a2 (id: _CPN5EWBEEe2RjrkbQARhdg)
  	@Output('actioncancelevent') Stream<Map<String,dynamic>> get evt_actioncancelevent => actioncancelevent.stream;
  	StreamController<Map<String,dynamic>> actioncancelevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
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
	
	bool isDestroyed = true;
  
	EditUserFormaCPN5EWBEEe2RjrkbQARhdg(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// UserRole userRole
		this.userRole = null;
		// User currentUser
		this.currentUser = null;
		// Text lastName
		this.lastName = '';
		// Text firstName
		this.firstName = '';
		// UserRole userRoles
		this.userRoles = new DIMEList();
						
						
		
			  	
		// branch Submit declaration
		if(this.actionsubmitevent!=null) {
			  			this.actionsubmitevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Cancel declaration
		if(this.actioncancelevent!=null) {
			  			this.actioncancelevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// Form
		if(formComponentaFLvUkWBEEe2RjrkbQARhdg!=null) {
			formComponentaFLvUkWBEEe2RjrkbQARhdg.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			formComponentaFLvUkWBEEe2RjrkbQARhdg.forEach((n)=>n.updateWithoutInputs());
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
		formComponentaFLvUkWBEEe2RjrkbQARhdg.forEach((n)=>n.updateInputs(
			puserRole:userRole,
			pcurrentUser:currentUser,
			plastName:lastName,
			pfirstName:firstName,
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
  		void actionsubmiteventaFLv7w2BEEe2RjrkbQARhdgEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionsubmitevent.add(data);
  		}
  		/// callback, if the button Cancel is clicked
  		void actioncanceleventaFLv71GBEEe2RjrkbQARhdgEventTrigger(Map<String,dynamic> data)
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
  		Data.User
  		 initOnDemandcurrentUser()
  		{
  			if(this.currentUser==null){
  				this.currentUser = new Data.User
  				();
  			}
  			return this.currentUser;
  		}
  		void setValuecurrentUser(Data.User
  		 value)
  		{
  			this.currentUser = value;
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
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_CPN5EWBEEe2RjrkbQARhdgRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_CPN5EWBEEe2RjrkbQARhdgId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_CPN5EWBEEe2RjrkbQARhdg";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_CPN5EWBEEe2RjrkbQARhdgClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_CPN5EWBEEe2RjrkbQARhdgToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

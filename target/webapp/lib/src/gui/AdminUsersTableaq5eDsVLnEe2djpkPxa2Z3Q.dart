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
import 'package:app/src/tables/AdminUsersTable/Table_vZcO8VLnEe2djpkPxa2Z3QAdminUsersTable.dart' as avZcO8VLnEe2djpkPxa2Z3Q;
//form component imports
//GUI plug in component imports
//GUI SIB imports
import 'package:app/src/gui/UserRoleBadgeagqOMAVLoEe2djpkPxa2Z3Q.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "adminuserstable-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  avZcO8VLnEe2djpkPxa2Z3Q.Table_vZcO8VLnEe2djpkPxa2Z3QAdminUsersTable,
  UserRoleBadgeagqOMAVLoEe2djpkPxa2Z3Q,
  ],
  templateUrl: 'AdminUsersTableaq5eDsVLnEe2djpkPxa2Z3Q.html'
)

class AdminUsersTableaq5eDsVLnEe2djpkPxa2Z3Q extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_vZcO8VLnEe2djpkPxa2Z3QTable;
  	/// GUI UserRoleBadge
  	@ViewChildren(UserRoleBadgeagqOMAVLoEe2djpkPxa2Z3Q)
  	List<UserRoleBadgeagqOMAVLoEe2djpkPxa2Z3Q> componentSIBat4qjZVLoEe2djpkPxa2Z3Q;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(avZcO8VLnEe2djpkPxa2Z3Q.Table_vZcO8VLnEe2djpkPxa2Z3QAdminUsersTable)
  	List<avZcO8VLnEe2djpkPxa2Z3Q.Table_vZcO8VLnEe2djpkPxa2Z3QAdminUsersTable> tableComponentavZcO8VLnEe2djpkPxa2Z3Q;
  	// branch Edit user as info.scce.dime.gui.editor.graphiti.api.CButton@b4e0c3f5 (id: _vZeEOFLnEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@626cbf9f (id: _q5eDsVLnEe2djpkPxa2Z3Q)
  	@Output('actionedituserevent') Stream<Map<String,dynamic>> get evt_actionedituserevent => actionedituserevent.stream;
  	StreamController<Map<String,dynamic>> actionedituserevent = new StreamController();
  	// branch Delete user as info.scce.dime.gui.editor.graphiti.api.CButton@34a86ce9 (id: _vZeESVLnEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@626cbf9f (id: _q5eDsVLnEe2djpkPxa2Z3Q)
  	@Output('actiondeleteuserevent') Stream<Map<String,dynamic>> get evt_actiondeleteuserevent => actiondeleteuserevent.stream;
  	StreamController<Map<String,dynamic>> actiondeleteuserevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//User users
		@Input()
		DIMEList<Data.User> users;
	
	bool isDestroyed = true;
  
	AdminUsersTableaq5eDsVLnEe2djpkPxa2Z3Q(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// User users
		this.users = new DIMEList();
						
						
		
			  	
		// branch Edit user declaration
		if(this.actionedituserevent!=null) {
			  			this.actionedituserevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Delete user declaration
		if(this.actiondeleteuserevent!=null) {
			  			this.actiondeleteuserevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// table
		if(tableComponentavZcO8VLnEe2djpkPxa2Z3Q!=null) {
			tableComponentavZcO8VLnEe2djpkPxa2Z3Q.forEach((n) => n.restartComponent());
		}
		/// GUI UserRoleBadge
		if(componentSIBat4qjZVLoEe2djpkPxa2Z3Q!=null) {
			componentSIBat4qjZVLoEe2djpkPxa2Z3Q.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentavZcO8VLnEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		}
		componentSIBat4qjZVLoEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.User>  pusers
	})
	{
		users = pusers;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentavZcO8VLnEe2djpkPxa2Z3Q.forEach((n)=>n.updateInputs(
			pusers:users
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
  		
  		
  		
  		
  	
  		/// callback, if the button Edit user is clicked
  		void actioneditusereventavZeEOFLnEe2djpkPxa2Z3QEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionedituserevent.add(data);
  		}
  		/// callback, if the button Delete user is clicked
  		void actiondeleteusereventavZeESVLnEe2djpkPxa2Z3QEventTrigger(Map<String,dynamic> data)
  		{
  			this.actiondeleteuserevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		DIMEList<Data.User>
  		 initOnDemandusers()
  		{
  			if(this.users==null){
  				this.users = new DIMEList<Data.User>
  				();
  			}
  			return this.users;
  		}
  		void setValueusers(DIMEList<Data.User>
  		 value)
  		{
  			this.users = value;
  		}
  		void userssetValue(DIMEList<Data.User>
  		 value)
  		{
  			this.setValueusers(value);
  		}
  		void usersadd(Data.User
  		 value)
  		{
  			this.users.add(value);
  		}
  		
  	
  		
  		
  		//GUI SIB UserRoleBadge
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_q5eDsVLnEe2djpkPxa2Z3QRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_q5eDsVLnEe2djpkPxa2Z3QId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_q5eDsVLnEe2djpkPxa2Z3Q";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_q5eDsVLnEe2djpkPxa2Z3QClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_q5eDsVLnEe2djpkPxa2Z3QToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

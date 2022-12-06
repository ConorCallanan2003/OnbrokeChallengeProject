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
import 'package:app/src/tables/UserBiddingTable/Table_xZzNAVFOEe2J0bu3ffrh5wUserBiddingTable.dart' as axZzNAVFOEe2J0bu3ffrh5w;
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "userbiddingtable-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  axZzNAVFOEe2J0bu3ffrh5w.Table_xZzNAVFOEe2J0bu3ffrh5wUserBiddingTable,
  ],
  templateUrl: 'UserBiddingTableauSTQkVFOEe2J0bu3ffrh5w.html'
)

class UserBiddingTableauSTQkVFOEe2J0bu3ffrh5w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_xZzNAVFOEe2J0bu3ffrh5wTable;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(axZzNAVFOEe2J0bu3ffrh5w.Table_xZzNAVFOEe2J0bu3ffrh5wUserBiddingTable)
  	List<axZzNAVFOEe2J0bu3ffrh5w.Table_xZzNAVFOEe2J0bu3ffrh5wUserBiddingTable> tableComponentaxZzNAVFOEe2J0bu3ffrh5w;
  	// branch Show bidding as info.scce.dime.gui.editor.graphiti.api.CButton@e170c8a5 (id: _xZ1CjFFOEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@14259844 (id: _uSTQkVFOEe2J0bu3ffrh5w)
  	@Output('actionshowbiddingevent') Stream<Map<String,dynamic>> get evt_actionshowbiddingevent => actionshowbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actionshowbiddingevent = new StreamController();
  	// branch Edit bidding as info.scce.dime.gui.editor.graphiti.api.CButton@67b2d0f1 (id: _xZ1pSVFOEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@14259844 (id: _uSTQkVFOEe2J0bu3ffrh5w)
  	@Output('actioneditbiddingevent') Stream<Map<String,dynamic>> get evt_actioneditbiddingevent => actioneditbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actioneditbiddingevent = new StreamController();
  	// branch Delete bidding as info.scce.dime.gui.editor.graphiti.api.CButton@82e5c69f (id: _xZ1pWlFOEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@14259844 (id: _uSTQkVFOEe2J0bu3ffrh5w)
  	@Output('actiondeletebiddingevent') Stream<Map<String,dynamic>> get evt_actiondeletebiddingevent => actiondeletebiddingevent.stream;
  	StreamController<Map<String,dynamic>> actiondeletebiddingevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Bidding biddings
		@Input()
		DIMEList<Data.Bidding> biddings;
	
	bool isDestroyed = true;
  
	UserBiddingTableauSTQkVFOEe2J0bu3ffrh5w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Bidding biddings
		this.biddings = new DIMEList();
						
						
		
			  	
		// branch Show bidding declaration
		if(this.actionshowbiddingevent!=null) {
			  			this.actionshowbiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Edit bidding declaration
		if(this.actioneditbiddingevent!=null) {
			  			this.actioneditbiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Delete bidding declaration
		if(this.actiondeletebiddingevent!=null) {
			  			this.actiondeletebiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// table
		if(tableComponentaxZzNAVFOEe2J0bu3ffrh5w!=null) {
			tableComponentaxZzNAVFOEe2J0bu3ffrh5w.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentaxZzNAVFOEe2J0bu3ffrh5w.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Bidding>  pbiddings
	})
	{
		biddings = pbiddings;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentaxZzNAVFOEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
			pbiddings:biddings
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
  		
  		
  		
  		
  	
  		/// callback, if the button Show bidding is clicked
  		void actionshowbiddingeventaxZ1CjFFOEe2J0bu3ffrh5wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionshowbiddingevent.add(data);
  		}
  		/// callback, if the button Edit bidding is clicked
  		void actioneditbiddingeventaxZ1pSVFOEe2J0bu3ffrh5wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioneditbiddingevent.add(data);
  		}
  		/// callback, if the button Delete bidding is clicked
  		void actiondeletebiddingeventaxZ1pWlFOEe2J0bu3ffrh5wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actiondeletebiddingevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		DIMEList<Data.Bidding>
  		 initOnDemandbiddings()
  		{
  			if(this.biddings==null){
  				this.biddings = new DIMEList<Data.Bidding>
  				();
  			}
  			return this.biddings;
  		}
  		void setValuebiddings(DIMEList<Data.Bidding>
  		 value)
  		{
  			this.biddings = value;
  		}
  		void biddingssetValue(DIMEList<Data.Bidding>
  		 value)
  		{
  			this.setValuebiddings(value);
  		}
  		void biddingsadd(Data.Bidding
  		 value)
  		{
  			this.biddings.add(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_uSTQkVFOEe2J0bu3ffrh5wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_uSTQkVFOEe2J0bu3ffrh5wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_uSTQkVFOEe2J0bu3ffrh5w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_uSTQkVFOEe2J0bu3ffrh5wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_uSTQkVFOEe2J0bu3ffrh5wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

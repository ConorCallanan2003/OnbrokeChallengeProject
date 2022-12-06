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
import 'package:app/src/gui/AdminUsersTableaq5eDsVLnEe2djpkPxa2Z3Q.dart';
import 'package:app/src/gui/AdminOfferTableaG6PuMVLlEe2djpkPxa2Z3Q.dart';
import 'package:app/src/gui/AdminBiddingTableaQIJywVLmEe2djpkPxa2Z3Q.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "adminoverviewtab-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  AdminUsersTableaq5eDsVLnEe2djpkPxa2Z3Q,
  AdminOfferTableaG6PuMVLlEe2djpkPxa2Z3Q,
  AdminBiddingTableaQIJywVLmEe2djpkPxa2Z3Q,
  ],
  templateUrl: 'AdminOverviewTaba8iqPUVLkEe2djpkPxa2Z3Q.html'
)

class AdminOverviewTaba8iqPUVLkEe2djpkPxa2Z3Q extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	/// GUI AdminUsersTable
  	@ViewChildren(AdminUsersTableaq5eDsVLnEe2djpkPxa2Z3Q)
  	List<AdminUsersTableaq5eDsVLnEe2djpkPxa2Z3Q> componentSIBaEo8dIVLpEe2djpkPxa2Z3Q;
  	/// GUI AdminOfferTable
  	@ViewChildren(AdminOfferTableaG6PuMVLlEe2djpkPxa2Z3Q)
  	List<AdminOfferTableaG6PuMVLlEe2djpkPxa2Z3Q> componentSIBaIzLwUVLmEe2djpkPxa2Z3Q;
  	/// GUI AdminBiddingTable
  	@ViewChildren(AdminBiddingTableaQIJywVLmEe2djpkPxa2Z3Q)
  	List<AdminBiddingTableaQIJywVLmEe2djpkPxa2Z3Q> componentSIBaM8qfcVLsEe2djpkPxa2Z3Q;
  	
  	
  	
  	
  	
  	// branch Edit user as info.scce.dime.gui.editor.graphiti.api.CButton@b4e0c3f5 (id: _vZeEOFLnEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@626cbf9f (id: _q5eDsVLnEe2djpkPxa2Z3Q)
  	@Output('actionedituserevent') Stream<Map<String,dynamic>> get evt_actionedituserevent => actionedituserevent.stream;
  	StreamController<Map<String,dynamic>> actionedituserevent = new StreamController();
  	// branch Delete user as info.scce.dime.gui.editor.graphiti.api.CButton@34a86ce9 (id: _vZeESVLnEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@626cbf9f (id: _q5eDsVLnEe2djpkPxa2Z3Q)
  	@Output('actiondeleteuserevent') Stream<Map<String,dynamic>> get evt_actiondeleteuserevent => actiondeleteuserevent.stream;
  	StreamController<Map<String,dynamic>> actiondeleteuserevent = new StreamController();
  	// branch Create user as info.scce.dime.gui.editor.graphiti.api.CButton@c545f76a (id: _0U35P1LlEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@e4a008b7 (id: _8iqPUVLkEe2djpkPxa2Z3Q)
  	@Output('actioncreateuserevent') Stream<Map<String,dynamic>> get evt_actioncreateuserevent => actioncreateuserevent.stream;
  	StreamController<Map<String,dynamic>> actioncreateuserevent = new StreamController();
  	// branch Show offer as info.scce.dime.gui.editor.graphiti.api.CButton@a295995d (id: _K80y21LlEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@bfcefbca (id: _G6PuMVLlEe2djpkPxa2Z3Q)
  	@Output('actionshowofferevent') Stream<Map<String,dynamic>> get evt_actionshowofferevent => actionshowofferevent.stream;
  	StreamController<Map<String,dynamic>> actionshowofferevent = new StreamController();
  	// branch Edit offer as info.scce.dime.gui.editor.graphiti.api.CButton@c6e10ead (id: _K80y7FLlEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@bfcefbca (id: _G6PuMVLlEe2djpkPxa2Z3Q)
  	@Output('actioneditofferevent') Stream<Map<String,dynamic>> get evt_actioneditofferevent => actioneditofferevent.stream;
  	StreamController<Map<String,dynamic>> actioneditofferevent = new StreamController();
  	// branch Delete offer as info.scce.dime.gui.editor.graphiti.api.CButton@329e76c5 (id: _K80y_VLlEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@bfcefbca (id: _G6PuMVLlEe2djpkPxa2Z3Q)
  	@Output('actiondeleteofferevent') Stream<Map<String,dynamic>> get evt_actiondeleteofferevent => actiondeleteofferevent.stream;
  	StreamController<Map<String,dynamic>> actiondeleteofferevent = new StreamController();
  	// branch Show bidding as info.scce.dime.gui.editor.graphiti.api.CButton@5dcf08b (id: _uDx5LFLmEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@94235220 (id: _QIJywVLmEe2djpkPxa2Z3Q)
  	@Output('actionshowbiddingevent') Stream<Map<String,dynamic>> get evt_actionshowbiddingevent => actionshowbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actionshowbiddingevent = new StreamController();
  	// branch Edit bidding as info.scce.dime.gui.editor.graphiti.api.CButton@85a4997f (id: _uDx5PVLmEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@94235220 (id: _QIJywVLmEe2djpkPxa2Z3Q)
  	@Output('actioneditbiddingevent') Stream<Map<String,dynamic>> get evt_actioneditbiddingevent => actioneditbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actioneditbiddingevent = new StreamController();
  	// branch Delete bidding as info.scce.dime.gui.editor.graphiti.api.CButton@79656c6f (id: _uDygGlLmEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@94235220 (id: _QIJywVLmEe2djpkPxa2Z3Q)
  	@Output('actiondeletebiddingevent') Stream<Map<String,dynamic>> get evt_actiondeletebiddingevent => actiondeletebiddingevent.stream;
  	StreamController<Map<String,dynamic>> actiondeletebiddingevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Offer offers
		@Input()
		DIMEList<Data.Offer> offers;
	//Bidding biddings
		@Input()
		DIMEList<Data.Bidding> biddings;
	//User users
		@Input()
		DIMEList<Data.User> users;
	
	bool isDestroyed = true;
  
	AdminOverviewTaba8iqPUVLkEe2djpkPxa2Z3Q(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Offer offers
		this.offers = new DIMEList();
		// Bidding biddings
		this.biddings = new DIMEList();
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
		// branch Create user declaration
		if(this.actioncreateuserevent!=null) {
			  			this.actioncreateuserevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Show offer declaration
		if(this.actionshowofferevent!=null) {
			  			this.actionshowofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Edit offer declaration
		if(this.actioneditofferevent!=null) {
			  			this.actioneditofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Delete offer declaration
		if(this.actiondeleteofferevent!=null) {
			  			this.actiondeleteofferevent = new StreamController<Map<String,dynamic>>();  				
		}
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
			
		/// GUI AdminUsersTable
		if(componentSIBaEo8dIVLpEe2djpkPxa2Z3Q!=null) {
			componentSIBaEo8dIVLpEe2djpkPxa2Z3Q.forEach((n)=>n.restartComponent());
		}
		/// GUI AdminOfferTable
		if(componentSIBaIzLwUVLmEe2djpkPxa2Z3Q!=null) {
			componentSIBaIzLwUVLmEe2djpkPxa2Z3Q.forEach((n)=>n.restartComponent());
		}
		/// GUI AdminBiddingTable
		if(componentSIBaM8qfcVLsEe2djpkPxa2Z3Q!=null) {
			componentSIBaM8qfcVLsEe2djpkPxa2Z3Q.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBaEo8dIVLpEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		componentSIBaIzLwUVLmEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		componentSIBaM8qfcVLsEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Offer>  poffers,
	DIMEList<Data.Bidding>  pbiddings,
	DIMEList<Data.User>  pusers
	})
	{
		offers = poffers;
		biddings = pbiddings;
		users = pusers;
		
		updateWithoutInputs(updateHidden:false);
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
  		
  		
  		
  		
  	
  		/// callback, if the button Create user is clicked
  			void actioncreateusereventa0U35P1LlEe2djpkPxa2Z3QEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncreateuserevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		DIMEList<Data.Offer>
  		 initOnDemandoffers()
  		{
  			if(this.offers==null){
  				this.offers = new DIMEList<Data.Offer>
  				();
  			}
  			return this.offers;
  		}
  		void setValueoffers(DIMEList<Data.Offer>
  		 value)
  		{
  			this.offers = value;
  		}
  		void offerssetValue(DIMEList<Data.Offer>
  		 value)
  		{
  			this.setValueoffers(value);
  		}
  		void offersadd(Data.Offer
  		 value)
  		{
  			this.offers.add(value);
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
  		
  	
  		
  		
  		//GUI SIB AdminUsersTable
  		//GUI SIB AdminOfferTable
  		//GUI SIB AdminBiddingTable
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_8iqPUVLkEe2djpkPxa2Z3QRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_8iqPUVLkEe2djpkPxa2Z3QId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_8iqPUVLkEe2djpkPxa2Z3Q";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_8iqPUVLkEe2djpkPxa2Z3QClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_8iqPUVLkEe2djpkPxa2Z3QToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

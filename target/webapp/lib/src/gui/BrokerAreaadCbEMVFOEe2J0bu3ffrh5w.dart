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
import 'package:app/src/gui/BrokerApprovalTabasK8JMVFTEe2J0bu3ffrh5w.dart';
import 'package:app/src/gui/BrokerAssignmentTabaxmnuwVFTEe2J0bu3ffrh5w.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "brokerarea-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  BrokerApprovalTabasK8JMVFTEe2J0bu3ffrh5w,
  BrokerAssignmentTabaxmnuwVFTEe2J0bu3ffrh5w,
  ],
  templateUrl: 'BrokerAreaadCbEMVFOEe2J0bu3ffrh5w.html'
)

class BrokerAreaadCbEMVFOEe2J0bu3ffrh5w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	/// GUI BrokerApprovalTab
  	@ViewChildren(BrokerApprovalTabasK8JMVFTEe2J0bu3ffrh5w)
  	List<BrokerApprovalTabasK8JMVFTEe2J0bu3ffrh5w> componentSIBaiEvI4FGNEe2J0bu3ffrh5w;
  	/// GUI BrokerAssignmentTab
  	@ViewChildren(BrokerAssignmentTabaxmnuwVFTEe2J0bu3ffrh5w)
  	List<BrokerAssignmentTabaxmnuwVFTEe2J0bu3ffrh5w> componentSIBajIAjwVGNEe2J0bu3ffrh5w;
  	
  	
  	
  	
  	
  	// branch Show offer as info.scce.dime.gui.editor.graphiti.api.CButton@2d80ca5 (id: _XM-FZVFUEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@39901114 (id: _JXgxEVFUEe2J0bu3ffrh5w)
  	@Output('actionshowofferevent') Stream<Map<String,dynamic>> get evt_actionshowofferevent => actionshowofferevent.stream;
  	StreamController<Map<String,dynamic>> actionshowofferevent = new StreamController();
  	// branch Decide offer as info.scce.dime.gui.editor.graphiti.api.CButton@c8dc1b97 (id: _XM-sIFFUEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@39901114 (id: _JXgxEVFUEe2J0bu3ffrh5w)
  	@Output('actiondecideofferevent') Stream<Map<String,dynamic>> get evt_actiondecideofferevent => actiondecideofferevent.stream;
  	StreamController<Map<String,dynamic>> actiondecideofferevent = new StreamController();
  	// branch Review offer as info.scce.dime.gui.editor.graphiti.api.CButton@ad726fbb (id: _5KRCilF_Ee2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@39901114 (id: _JXgxEVFUEe2J0bu3ffrh5w)
  	@Output('actionreviewofferevent') Stream<Map<String,dynamic>> get evt_actionreviewofferevent => actionreviewofferevent.stream;
  	StreamController<Map<String,dynamic>> actionreviewofferevent = new StreamController();
  	// branch Edit report as info.scce.dime.gui.editor.graphiti.api.CButton@ae46dc06 (id: _5KRpf1F_Ee2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@39901114 (id: _JXgxEVFUEe2J0bu3ffrh5w)
  	@Output('actioneditreportevent') Stream<Map<String,dynamic>> get evt_actioneditreportevent => actioneditreportevent.stream;
  	StreamController<Map<String,dynamic>> actioneditreportevent = new StreamController();
  	// branch Revoke offer as info.scce.dime.gui.editor.graphiti.api.CButton@c1b6af2c (id: _mp6QW1GAEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@39901114 (id: _JXgxEVFUEe2J0bu3ffrh5w)
  	@Output('actionrevokeofferevent') Stream<Map<String,dynamic>> get evt_actionrevokeofferevent => actionrevokeofferevent.stream;
  	StreamController<Map<String,dynamic>> actionrevokeofferevent = new StreamController();
  	// branch Show bidding as info.scce.dime.gui.editor.graphiti.api.CButton@23890d57 (id: _X1hAWlGGEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@e4db9f0e (id: _Ln-sIFGGEe2J0bu3ffrh5w)
  	@Output('actionshowbiddingevent') Stream<Map<String,dynamic>> get evt_actionshowbiddingevent => actionshowbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actionshowbiddingevent = new StreamController();
  	// branch Decide bidding as info.scce.dime.gui.editor.graphiti.api.CButton@de91c1bc (id: _X1hAa1GGEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@e4db9f0e (id: _Ln-sIFGGEe2J0bu3ffrh5w)
  	@Output('actiondecidebiddingevent') Stream<Map<String,dynamic>> get evt_actiondecidebiddingevent => actiondecidebiddingevent.stream;
  	StreamController<Map<String,dynamic>> actiondecidebiddingevent = new StreamController();
  	// branch Review bidding as info.scce.dime.gui.editor.graphiti.api.CButton@2dd370c (id: _X1hAfFGGEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@e4db9f0e (id: _Ln-sIFGGEe2J0bu3ffrh5w)
  	@Output('actionreviewbiddingevent') Stream<Map<String,dynamic>> get evt_actionreviewbiddingevent => actionreviewbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actionreviewbiddingevent = new StreamController();
  	// branch Revoke bidding as info.scce.dime.gui.editor.graphiti.api.CButton@84cb5693 (id: _X1hnJVGGEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@e4db9f0e (id: _Ln-sIFGGEe2J0bu3ffrh5w)
  	@Output('actionrevokebiddingevent') Stream<Map<String,dynamic>> get evt_actionrevokebiddingevent => actionrevokebiddingevent.stream;
  	StreamController<Map<String,dynamic>> actionrevokebiddingevent = new StreamController();
  	// branch Assign as info.scce.dime.gui.editor.graphiti.api.CButton@e8dac0f (id: _kOQ-ZFGJEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@bc1503fe (id: _dsesAVGJEe2J0bu3ffrh5w)
  	@Output('actionassignevent') Stream<Map<String,dynamic>> get evt_actionassignevent => actionassignevent.stream;
  	StreamController<Map<String,dynamic>> actionassignevent = new StreamController();
  	// branch Unassign as info.scce.dime.gui.editor.graphiti.api.CButton@f3718e14 (id: _kORlMVGJEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@bc1503fe (id: _dsesAVGJEe2J0bu3ffrh5w)
  	@Output('actionunassignevent') Stream<Map<String,dynamic>> get evt_actionunassignevent => actionunassignevent.stream;
  	StreamController<Map<String,dynamic>> actionunassignevent = new StreamController();
  	// branch Edit as info.scce.dime.gui.editor.graphiti.api.CButton@811e87ad (id: _PdUCgVuYEe2C-dvY0XUmpA) in info.scce.dime.gui.editor.graphiti.api.CGUI@bc1503fe (id: _dsesAVGJEe2J0bu3ffrh5w)
  	@Output('actioneditevent') Stream<Map<String,dynamic>> get evt_actioneditevent => actioneditevent.stream;
  	StreamController<Map<String,dynamic>> actioneditevent = new StreamController();
  	// branch Auto Assign as info.scce.dime.gui.editor.graphiti.api.CButton@7d0dc7f9 (id: _oi368V94Ee2pr7wspri7ww) in info.scce.dime.gui.editor.graphiti.api.CGUI@794eacff (id: _dCbEMVFOEe2J0bu3ffrh5w)
  	@Output('actionautoassignevent') Stream<Map<String,dynamic>> get evt_actionautoassignevent => actionautoassignevent.stream;
  	StreamController<Map<String,dynamic>> actionautoassignevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	String currentbranch_hgg4FFTEe2J0bu3ffrh5w = "_hhQ0wFFTEe2J0bu3ffrh5w";
  	bool hasToSignIn;
	//DATA CONTEXT
	//Bidding biddings
		@Input()
		DIMEList<Data.Bidding> biddings;
	//Offer offers
		@Input()
		DIMEList<Data.Offer> offers;
	//Offer approvedOffers
		@Input()
		DIMEList<Data.Offer> approvedOffers;
	
	bool isDestroyed = true;
  
	BrokerAreaadCbEMVFOEe2J0bu3ffrh5w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Bidding biddings
		this.biddings = new DIMEList();
		// Offer offers
		this.offers = new DIMEList();
		// Offer approvedOffers
		this.approvedOffers = new DIMEList();
						
						
		
			  	
		// branch Show offer declaration
		if(this.actionshowofferevent!=null) {
			  			this.actionshowofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Decide offer declaration
		if(this.actiondecideofferevent!=null) {
			  			this.actiondecideofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Review offer declaration
		if(this.actionreviewofferevent!=null) {
			  			this.actionreviewofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Edit report declaration
		if(this.actioneditreportevent!=null) {
			  			this.actioneditreportevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Revoke offer declaration
		if(this.actionrevokeofferevent!=null) {
			  			this.actionrevokeofferevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Show bidding declaration
		if(this.actionshowbiddingevent!=null) {
			  			this.actionshowbiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Decide bidding declaration
		if(this.actiondecidebiddingevent!=null) {
			  			this.actiondecidebiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Review bidding declaration
		if(this.actionreviewbiddingevent!=null) {
			  			this.actionreviewbiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Revoke bidding declaration
		if(this.actionrevokebiddingevent!=null) {
			  			this.actionrevokebiddingevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Assign declaration
		if(this.actionassignevent!=null) {
			  			this.actionassignevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Unassign declaration
		if(this.actionunassignevent!=null) {
			  			this.actionunassignevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Edit declaration
		if(this.actioneditevent!=null) {
			  			this.actioneditevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Auto Assign declaration
		if(this.actionautoassignevent!=null) {
			  			this.actionautoassignevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// GUI BrokerApprovalTab
		if(componentSIBaiEvI4FGNEe2J0bu3ffrh5w!=null) {
			componentSIBaiEvI4FGNEe2J0bu3ffrh5w.forEach((n)=>n.restartComponent());
		}
		/// GUI BrokerAssignmentTab
		if(componentSIBajIAjwVGNEe2J0bu3ffrh5w!=null) {
			componentSIBajIAjwVGNEe2J0bu3ffrh5w.forEach((n)=>n.restartComponent());
		}
		currentbranch_hgg4FFTEe2J0bu3ffrh5w = "_hhQ0wFFTEe2J0bu3ffrh5w";
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBaiEvI4FGNEe2J0bu3ffrh5w.forEach((n)=>n.updateWithoutInputs());
		componentSIBajIAjwVGNEe2J0bu3ffrh5w.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Bidding>  pbiddings,
	DIMEList<Data.Offer>  poffers,
	DIMEList<Data.Offer>  papprovedOffers
	})
	{
		biddings = pbiddings;
		offers = poffers;
		approvedOffers = papprovedOffers;
		
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
  		
  		
  		
  		
  	
  		/// callback, if the button Auto Assign is clicked
  			void actionautoassigneventaoi368V94Ee2pr7wspri7wwEventTrigger()
  		
  		{
  			// button is placed in a tab and changes the state
  			this.currentbranch = '_oi368V94Ee2pr7wspri7ww';
  			Map<String,dynamic> data = new Map();
  			data['approvedOffers'] = this.approvedOffers;
  			this.actionautoassignevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		// methods for the tab Approval
  		
  		/// checks if the tab Approval is active
  		bool getActive_hhQ0wFFTEe2J0bu3ffrh5wTab(dynamic id)
  		{
  			String eq = '_hhQ0wFFTEe2J0bu3ffrh5w${id}';
  			if(this.currentbranch_hgg4FFTEe2J0bu3ffrh5w==eq){
  				return true;
  			}
  			return false;
  		}
  		
  		/// callback to set the active tab to Approval
  		void click_hhQ0wFFTEe2J0bu3ffrh5wTab(dynamic event,dynamic id)
  		{
  			String eq = '_hhQ0wFFTEe2J0bu3ffrh5w${id}';
  			this.currentbranch_hgg4FFTEe2J0bu3ffrh5w = eq;
  			event.preventDefault();
  		}
  		// methods for the tab Assignments
  		
  		/// checks if the tab Assignments is active
  		bool getActive_iUpZgVFTEe2J0bu3ffrh5wTab(dynamic id)
  		{
  			String eq = '_iUpZgVFTEe2J0bu3ffrh5w${id}';
  			if(this.currentbranch_hgg4FFTEe2J0bu3ffrh5w==eq){
  				return true;
  			}
  			return false;
  		}
  		
  		/// callback to set the active tab to Assignments
  		void click_iUpZgVFTEe2J0bu3ffrh5wTab(dynamic event,dynamic id)
  		{
  			String eq = '_iUpZgVFTEe2J0bu3ffrh5w${id}';
  			this.currentbranch_hgg4FFTEe2J0bu3ffrh5w = eq;
  			event.preventDefault();
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
  		DIMEList<Data.Offer>
  		 initOnDemandapprovedOffers()
  		{
  			if(this.approvedOffers==null){
  				this.approvedOffers = new DIMEList<Data.Offer>
  				();
  			}
  			return this.approvedOffers;
  		}
  		void setValueapprovedOffers(DIMEList<Data.Offer>
  		 value)
  		{
  			this.approvedOffers = value;
  		}
  		void approvedOfferssetValue(DIMEList<Data.Offer>
  		 value)
  		{
  			this.setValueapprovedOffers(value);
  		}
  		void approvedOffersadd(Data.Offer
  		 value)
  		{
  			this.approvedOffers.add(value);
  		}
  		
  	
  		
  		
  		//GUI SIB BrokerApprovalTab
  		//GUI SIB BrokerAssignmentTab
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_dCbEMVFOEe2J0bu3ffrh5wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_dCbEMVFOEe2J0bu3ffrh5wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_dCbEMVFOEe2J0bu3ffrh5w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_dCbEMVFOEe2J0bu3ffrh5wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_dCbEMVFOEe2J0bu3ffrh5wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

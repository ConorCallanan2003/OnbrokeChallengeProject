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
import 'package:app/src/tables/AdminOfferTable/Table_K8y9oVLlEe2djpkPxa2Z3QAdminOfferTable.dart' as aK8y9oVLlEe2djpkPxa2Z3Q;
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "adminoffertable-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  aK8y9oVLlEe2djpkPxa2Z3Q.Table_K8y9oVLlEe2djpkPxa2Z3QAdminOfferTable,
  ],
  templateUrl: 'AdminOfferTableaG6PuMVLlEe2djpkPxa2Z3Q.html'
)

class AdminOfferTableaG6PuMVLlEe2djpkPxa2Z3Q extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_K8y9oVLlEe2djpkPxa2Z3QTable;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(aK8y9oVLlEe2djpkPxa2Z3Q.Table_K8y9oVLlEe2djpkPxa2Z3QAdminOfferTable)
  	List<aK8y9oVLlEe2djpkPxa2Z3Q.Table_K8y9oVLlEe2djpkPxa2Z3QAdminOfferTable> tableComponentaK8y9oVLlEe2djpkPxa2Z3Q;
  	// branch Show offer as info.scce.dime.gui.editor.graphiti.api.CButton@a295995d (id: _K80y21LlEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@bfcefbca (id: _G6PuMVLlEe2djpkPxa2Z3Q)
  	@Output('actionshowofferevent') Stream<Map<String,dynamic>> get evt_actionshowofferevent => actionshowofferevent.stream;
  	StreamController<Map<String,dynamic>> actionshowofferevent = new StreamController();
  	// branch Edit offer as info.scce.dime.gui.editor.graphiti.api.CButton@c6e10ead (id: _K80y7FLlEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@bfcefbca (id: _G6PuMVLlEe2djpkPxa2Z3Q)
  	@Output('actioneditofferevent') Stream<Map<String,dynamic>> get evt_actioneditofferevent => actioneditofferevent.stream;
  	StreamController<Map<String,dynamic>> actioneditofferevent = new StreamController();
  	// branch Delete offer as info.scce.dime.gui.editor.graphiti.api.CButton@329e76c5 (id: _K80y_VLlEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@bfcefbca (id: _G6PuMVLlEe2djpkPxa2Z3Q)
  	@Output('actiondeleteofferevent') Stream<Map<String,dynamic>> get evt_actiondeleteofferevent => actiondeleteofferevent.stream;
  	StreamController<Map<String,dynamic>> actiondeleteofferevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Offer offers
		@Input()
		DIMEList<Data.Offer> offers;
	
	bool isDestroyed = true;
  
	AdminOfferTableaG6PuMVLlEe2djpkPxa2Z3Q(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Offer offers
		this.offers = new DIMEList();
						
						
		
			  	
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
			
		/// table
		if(tableComponentaK8y9oVLlEe2djpkPxa2Z3Q!=null) {
			tableComponentaK8y9oVLlEe2djpkPxa2Z3Q.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentaK8y9oVLlEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Offer>  poffers
	})
	{
		offers = poffers;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentaK8y9oVLlEe2djpkPxa2Z3Q.forEach((n)=>n.updateInputs(
			poffers:offers
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
  		
  		
  		
  		
  	
  		/// callback, if the button Show offer is clicked
  		void actionshowoffereventaK80y21LlEe2djpkPxa2Z3QEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionshowofferevent.add(data);
  		}
  		/// callback, if the button Edit offer is clicked
  		void actioneditoffereventaK80y7FLlEe2djpkPxa2Z3QEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioneditofferevent.add(data);
  		}
  		/// callback, if the button Delete offer is clicked
  		void actiondeleteoffereventaK80y_VLlEe2djpkPxa2Z3QEventTrigger(Map<String,dynamic> data)
  		{
  			this.actiondeleteofferevent.add(data);
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
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_G6PuMVLlEe2djpkPxa2Z3QRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_G6PuMVLlEe2djpkPxa2Z3QId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_G6PuMVLlEe2djpkPxa2Z3Q";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_G6PuMVLlEe2djpkPxa2Z3QClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_G6PuMVLlEe2djpkPxa2Z3QToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

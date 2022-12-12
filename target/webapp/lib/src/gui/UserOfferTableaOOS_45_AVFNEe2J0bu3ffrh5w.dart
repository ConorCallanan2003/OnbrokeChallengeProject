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
import 'package:app/src/tables/UserOfferTable/Table_lv1VsFFNEe2J0bu3ffrh5wUserOfferTable.dart' as alv1VsFFNEe2J0bu3ffrh5w;
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "useroffertable-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  alv1VsFFNEe2J0bu3ffrh5w.Table_lv1VsFFNEe2J0bu3ffrh5wUserOfferTable,
  ],
  templateUrl: 'UserOfferTableaOOS_45_AVFNEe2J0bu3ffrh5w.html'
)

class UserOfferTableaOOS_45_AVFNEe2J0bu3ffrh5w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_lv1VsFFNEe2J0bu3ffrh5wTable;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(alv1VsFFNEe2J0bu3ffrh5w.Table_lv1VsFFNEe2J0bu3ffrh5wUserOfferTable)
  	List<alv1VsFFNEe2J0bu3ffrh5w.Table_lv1VsFFNEe2J0bu3ffrh5wUserOfferTable> tableComponentalv1VsFFNEe2J0bu3ffrh5w;
  	// branch Show offer as info.scce.dime.gui.editor.graphiti.api.CButton@5f0bb8f0 (id: _0GKiEVFNEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@b7d0ebbc (id: _OOS-AVFNEe2J0bu3ffrh5w)
  	@Output('actionshowofferevent') Stream<Map<String,dynamic>> get evt_actionshowofferevent => actionshowofferevent.stream;
  	StreamController<Map<String,dynamic>> actionshowofferevent = new StreamController();
  	// branch Edit offer as info.scce.dime.gui.editor.graphiti.api.CButton@5ba3e853 (id: _4QgbkVFNEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@b7d0ebbc (id: _OOS-AVFNEe2J0bu3ffrh5w)
  	@Output('actioneditofferevent') Stream<Map<String,dynamic>> get evt_actioneditofferevent => actioneditofferevent.stream;
  	StreamController<Map<String,dynamic>> actioneditofferevent = new StreamController();
  	// branch Delete offer as info.scce.dime.gui.editor.graphiti.api.CButton@59aebbf (id: _6PHdUVFNEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@b7d0ebbc (id: _OOS-AVFNEe2J0bu3ffrh5w)
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
  
	UserOfferTableaOOS_45_AVFNEe2J0bu3ffrh5w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
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
		if(tableComponentalv1VsFFNEe2J0bu3ffrh5w!=null) {
			tableComponentalv1VsFFNEe2J0bu3ffrh5w.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentalv1VsFFNEe2J0bu3ffrh5w.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Offer>  poffers
	})
	{
		offers = poffers;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentalv1VsFFNEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
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
  		void actionshowoffereventa0GKiEVFNEe2J0bu3ffrh5wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actionshowofferevent.add(data);
  		}
  		/// callback, if the button Edit offer is clicked
  		void actioneditoffereventa4QgbkVFNEe2J0bu3ffrh5wEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioneditofferevent.add(data);
  		}
  		/// callback, if the button Delete offer is clicked
  		void actiondeleteoffereventa6PHdUVFNEe2J0bu3ffrh5wEventTrigger(Map<String,dynamic> data)
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
	String getContainer_OOSAVFNEe2J0bu3ffrh5wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_OOSAVFNEe2J0bu3ffrh5wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_OOSAVFNEe2J0bu3ffrh5w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_OOSAVFNEe2J0bu3ffrh5wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_OOSAVFNEe2J0bu3ffrh5wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

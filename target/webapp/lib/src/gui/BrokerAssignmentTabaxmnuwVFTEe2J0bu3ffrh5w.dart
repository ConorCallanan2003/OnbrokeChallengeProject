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
import 'package:app/src/gui/BrokerAssignBiddingsTableadsesAVGJEe2J0bu3ffrh5w.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "brokerassignmenttab-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  BrokerAssignBiddingsTableadsesAVGJEe2J0bu3ffrh5w,
  ],
  templateUrl: 'BrokerAssignmentTabaxmnuwVFTEe2J0bu3ffrh5w.html'
)

class BrokerAssignmentTabaxmnuwVFTEe2J0bu3ffrh5w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	/// GUI BrokerAssignBiddingsTable
  	@ViewChildren(BrokerAssignBiddingsTableadsesAVGJEe2J0bu3ffrh5w)
  	List<BrokerAssignBiddingsTableadsesAVGJEe2J0bu3ffrh5w> componentSIBano1yAVGKEe2J0bu3ffrh5w;
  	
  	
  	
  	
  	
  	// branch Show bidding as info.scce.dime.gui.editor.graphiti.api.CButton@ea4236bf (id: _kOQ-U1GJEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@bc1503fe (id: _dsesAVGJEe2J0bu3ffrh5w)
  	@Output('actionshowbiddingevent') Stream<Map<String,dynamic>> get evt_actionshowbiddingevent => actionshowbiddingevent.stream;
  	StreamController<Map<String,dynamic>> actionshowbiddingevent = new StreamController();
  	// branch Assign as info.scce.dime.gui.editor.graphiti.api.CButton@e8dac0f (id: _kOQ-ZFGJEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@bc1503fe (id: _dsesAVGJEe2J0bu3ffrh5w)
  	@Output('actionassignevent') Stream<Map<String,dynamic>> get evt_actionassignevent => actionassignevent.stream;
  	StreamController<Map<String,dynamic>> actionassignevent = new StreamController();
  	// branch Unassign as info.scce.dime.gui.editor.graphiti.api.CButton@f3718e14 (id: _kORlMVGJEe2J0bu3ffrh5w) in info.scce.dime.gui.editor.graphiti.api.CGUI@bc1503fe (id: _dsesAVGJEe2J0bu3ffrh5w)
  	@Output('actionunassignevent') Stream<Map<String,dynamic>> get evt_actionunassignevent => actionunassignevent.stream;
  	StreamController<Map<String,dynamic>> actionunassignevent = new StreamController();
  	// branch Edit as info.scce.dime.gui.editor.graphiti.api.CButton@811e87ad (id: _PdUCgVuYEe2C-dvY0XUmpA) in info.scce.dime.gui.editor.graphiti.api.CGUI@bc1503fe (id: _dsesAVGJEe2J0bu3ffrh5w)
  	@Output('actioneditevent') Stream<Map<String,dynamic>> get evt_actioneditevent => actioneditevent.stream;
  	StreamController<Map<String,dynamic>> actioneditevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Offer offers
		@Input()
		DIMEList<Data.Offer> offers;
	
	bool isDestroyed = true;
  
	BrokerAssignmentTabaxmnuwVFTEe2J0bu3ffrh5w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Offer offers
		this.offers = new DIMEList();
						
						
		
			  	
		// branch Show bidding declaration
		if(this.actionshowbiddingevent!=null) {
			  			this.actionshowbiddingevent = new StreamController<Map<String,dynamic>>();  				
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
			
		/// GUI BrokerAssignBiddingsTable
		if(componentSIBano1yAVGKEe2J0bu3ffrh5w!=null) {
			componentSIBano1yAVGKEe2J0bu3ffrh5w.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBano1yAVGKEe2J0bu3ffrh5w.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Offer>  poffers
	})
	{
		offers = poffers;
		
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
  		
  	
  		
  		
  		//GUI SIB BrokerAssignBiddingsTable
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_xmnuwVFTEe2J0bu3ffrh5wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_xmnuwVFTEe2J0bu3ffrh5wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_xmnuwVFTEe2J0bu3ffrh5w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_xmnuwVFTEe2J0bu3ffrh5wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_xmnuwVFTEe2J0bu3ffrh5wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

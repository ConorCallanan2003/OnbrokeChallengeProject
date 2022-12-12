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
import 'package:app/src/gui/DiscussionPanelContentacA_45_CgVOkEe2KQc5QIsW97w.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "biddingdetails-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  DiscussionPanelContentacA_45_CgVOkEe2KQc5QIsW97w,
  ],
  templateUrl: 'BiddingDetailsazSAVgVOjEe2KQc5QIsW97w.html'
)

class BiddingDetailsazSAVgVOjEe2KQc5QIsW97w extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	/// GUI DiscussionPanelContent
  	@ViewChildren(DiscussionPanelContentacA_45_CgVOkEe2KQc5QIsW97w)
  	List<DiscussionPanelContentacA_45_CgVOkEe2KQc5QIsW97w> componentSIBaNOUqEXmiEe2ix_xiis0jnw;
  	
  	
  	
  	
  	
  	// branch Back as info.scce.dime.gui.editor.graphiti.api.CButton@34905add (id: _8MBYQVOlEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@e6e457c8 (id: _zSAVgVOjEe2KQc5QIsW97w)
  	@Output('actionbackevent') Stream<Map<String,dynamic>> get evt_actionbackevent => actionbackevent.stream;
  	StreamController<Map<String,dynamic>> actionbackevent = new StreamController();
  	// branch Show issue as info.scce.dime.gui.editor.graphiti.api.CButton@9df2c280 (id: _bJxmsVN9Ee2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
  	@Output('actionshowissueevent') Stream<Map<String,dynamic>> get evt_actionshowissueevent => actionshowissueevent.stream;
  	StreamController<Map<String,dynamic>> actionshowissueevent = new StreamController();
  	// branch Resolve issue as info.scce.dime.gui.editor.graphiti.api.CButton@db418f73 (id: _V3lGkVOdEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
  	@Output('actionresolveissueevent') Stream<Map<String,dynamic>> get evt_actionresolveissueevent => actionresolveissueevent.stream;
  	StreamController<Map<String,dynamic>> actionresolveissueevent = new StreamController();
  	// branch Unresolve issue as info.scce.dime.gui.editor.graphiti.api.CButton@fdde42e (id: _dDPcAVOdEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
  	@Output('actionunresolveissueevent') Stream<Map<String,dynamic>> get evt_actionunresolveissueevent => actionunresolveissueevent.stream;
  	StreamController<Map<String,dynamic>> actionunresolveissueevent = new StreamController();
  	// branch Create issue as info.scce.dime.gui.editor.graphiti.api.CButton@c7dac57c (id: _h9u76VOkEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@7ba43a81 (id: _cA-CgVOkEe2KQc5QIsW97w)
  	@Output('actioncreateissueevent') Stream<Map<String,dynamic>> get evt_actioncreateissueevent => actioncreateissueevent.stream;
  	StreamController<Map<String,dynamic>> actioncreateissueevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Bidding bidding
		@Input()
		Data.Bidding bidding;
	@Input()
	bool showResolveButtons;
	
	bool isDestroyed = true;
  
	BiddingDetailsazSAVgVOjEe2KQc5QIsW97w(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Bidding bidding
		this.bidding = null;
		// Boolean showResolveButtons
		this.showResolveButtons = false;
						
						
		
			  	
		// branch Back declaration
		if(this.actionbackevent!=null) {
			  			this.actionbackevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Show issue declaration
		if(this.actionshowissueevent!=null) {
			  			this.actionshowissueevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Resolve issue declaration
		if(this.actionresolveissueevent!=null) {
			  			this.actionresolveissueevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Unresolve issue declaration
		if(this.actionunresolveissueevent!=null) {
			  			this.actionunresolveissueevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create issue declaration
		if(this.actioncreateissueevent!=null) {
			  			this.actioncreateissueevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// GUI DiscussionPanelContent
		if(componentSIBaNOUqEXmiEe2ix_xiis0jnw!=null) {
			componentSIBaNOUqEXmiEe2ix_xiis0jnw.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBaNOUqEXmiEe2ix_xiis0jnw.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{Data.Bidding pbidding,
	bool pshowResolveButtons
	})
	{
		bidding = pbidding;
		showResolveButtons = pshowResolveButtons;
		
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
  		
  		
  		
  		
  	
  		/// callback, if the button Back is clicked
  			void actionbackeventa8MBYQVOlEe2KQc5QIsW97wEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actionbackevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		Data.Bidding
  		 initOnDemandbidding()
  		{
  			if(this.bidding==null){
  				this.bidding = new Data.Bidding
  				();
  			}
  			return this.bidding;
  		}
  		void setValuebidding(Data.Bidding
  		 value)
  		{
  			this.bidding = value;
  		}
  		void biddingsetValue(Data.Bidding
  		 value)
  		{
  			this.setValuebidding(value);
  		}
  		bool initOnDemandshowResolveButtons()
  		{
  			return this.showResolveButtons;
  		}
  		void setValueshowResolveButtons(bool value)
  		{
  			this.showResolveButtons = value;
  		}
  		void showResolveButtonssetValue(bool value)
  		{
  			this.setValueshowResolveButtons(value);
  		}
  		
  	
  		
  		
  		//GUI SIB DiscussionPanelContent
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_zSAVgVOjEe2KQc5QIsW97wRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_zSAVgVOjEe2KQc5QIsW97wId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_zSAVgVOjEe2KQc5QIsW97w";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_zSAVgVOjEe2KQc5QIsW97wClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_zSAVgVOjEe2KQc5QIsW97wToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

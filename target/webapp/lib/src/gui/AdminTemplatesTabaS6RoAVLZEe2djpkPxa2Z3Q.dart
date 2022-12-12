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
import 'package:app/src/gui/FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q.dart';
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "admintemplatestab-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q,
  ],
  templateUrl: 'AdminTemplatesTabaS6RoAVLZEe2djpkPxa2Z3Q.html'
)

class AdminTemplatesTabaS6RoAVLZEe2djpkPxa2Z3Q extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	/// GUI FeatureTemplateTable
  	@ViewChildren(FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q)
  	List<FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q> componentSIBaLp248VLaEe2djpkPxa2Z3Q;
  	/// GUI FeatureTemplateTable
  	@ViewChildren(FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q)
  	List<FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q> componentSIBaMOVfAVLaEe2djpkPxa2Z3Q;
  	
  	
  	
  	
  	
  	// branch Edit feature as info.scce.dime.gui.editor.graphiti.api.CButton@85cb98db (id: _zZTH0VLIEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@108b2d4f (id: _a-hbAVLIEe2djpkPxa2Z3Q)
  	@Output('actioneditfeatureevent') Stream<Map<String,dynamic>> get evt_actioneditfeatureevent => actioneditfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioneditfeatureevent = new StreamController();
  	// branch Delete feature as info.scce.dime.gui.editor.graphiti.api.CButton@a0fe8e89 (id: _zZTH4lLIEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@108b2d4f (id: _a-hbAVLIEe2djpkPxa2Z3Q)
  	@Output('actiondeletefeatureevent') Stream<Map<String,dynamic>> get evt_actiondeletefeatureevent => actiondeletefeatureevent.stream;
  	StreamController<Map<String,dynamic>> actiondeletefeatureevent = new StreamController();
  	// branch Details as info.scce.dime.gui.editor.graphiti.api.CButton@f61a5129 (id: _FHYeQXVnEe2_CvdRyEmMCQ) in info.scce.dime.gui.editor.graphiti.api.CGUI@108b2d4f (id: _a-hbAVLIEe2djpkPxa2Z3Q)
  	@Output('actiondetailsevent') Stream<Map<String,dynamic>> get evt_actiondetailsevent => actiondetailsevent.stream;
  	StreamController<Map<String,dynamic>> actiondetailsevent = new StreamController();
  	// branch Create offer feature as info.scce.dime.gui.editor.graphiti.api.CButton@1dedf35 (id: _bWPu1FLZEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@654ae0e4 (id: _S6RoAVLZEe2djpkPxa2Z3Q)
  	@Output('actioncreateofferfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreateofferfeatureevent => actioncreateofferfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreateofferfeatureevent = new StreamController();
  	// branch Create bidding feature as info.scce.dime.gui.editor.graphiti.api.CButton@37e6368f (id: _mSh2L1LZEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@654ae0e4 (id: _S6RoAVLZEe2djpkPxa2Z3Q)
  	@Output('actioncreatebiddingfeatureevent') Stream<Map<String,dynamic>> get evt_actioncreatebiddingfeatureevent => actioncreatebiddingfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioncreatebiddingfeatureevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Feature featuresForOffer
		@Input()
		DIMEList<Data.Feature> featuresForOffer;
	//Feature featuresForBidding
		@Input()
		DIMEList<Data.Feature> featuresForBidding;
	
	bool isDestroyed = true;
  
	AdminTemplatesTabaS6RoAVLZEe2djpkPxa2Z3Q(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Feature featuresForOffer
		this.featuresForOffer = new DIMEList();
		// Feature featuresForBidding
		this.featuresForBidding = new DIMEList();
						
						
		
			  	
		// branch Edit feature declaration
		if(this.actioneditfeatureevent!=null) {
			  			this.actioneditfeatureevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Delete feature declaration
		if(this.actiondeletefeatureevent!=null) {
			  			this.actiondeletefeatureevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Details declaration
		if(this.actiondetailsevent!=null) {
			  			this.actiondetailsevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create offer feature declaration
		if(this.actioncreateofferfeatureevent!=null) {
			  			this.actioncreateofferfeatureevent = new StreamController<Map<String,dynamic>>();  				
		}
		// branch Create bidding feature declaration
		if(this.actioncreatebiddingfeatureevent!=null) {
			  			this.actioncreatebiddingfeatureevent = new StreamController<Map<String,dynamic>>();  				
		}
			
		/// GUI FeatureTemplateTable
		if(componentSIBaLp248VLaEe2djpkPxa2Z3Q!=null) {
			componentSIBaLp248VLaEe2djpkPxa2Z3Q.forEach((n)=>n.restartComponent());
		}
		/// GUI FeatureTemplateTable
		if(componentSIBaMOVfAVLaEe2djpkPxa2Z3Q!=null) {
			componentSIBaMOVfAVLaEe2djpkPxa2Z3Q.forEach((n)=>n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBaLp248VLaEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		componentSIBaMOVfAVLaEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Feature>  pfeaturesForOffer,
	DIMEList<Data.Feature>  pfeaturesForBidding
	})
	{
		featuresForOffer = pfeaturesForOffer;
		featuresForBidding = pfeaturesForBidding;
		
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
  		
  		
  		
  		
  	
  		/// callback, if the button Create offer feature is clicked
  			void actioncreateofferfeatureeventabWPu1FLZEe2djpkPxa2Z3QEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncreateofferfeatureevent.add(data);
  		}
  		/// callback, if the button Create bidding feature is clicked
  			void actioncreatebiddingfeatureeventamSh2L1LZEe2djpkPxa2Z3QEventTrigger()
  		
  		{
  			Map<String,dynamic> data = new Map();
  			this.actioncreatebiddingfeatureevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		DIMEList<Data.Feature>
  		 initOnDemandfeaturesForOffer()
  		{
  			if(this.featuresForOffer==null){
  				this.featuresForOffer = new DIMEList<Data.Feature>
  				();
  			}
  			return this.featuresForOffer;
  		}
  		void setValuefeaturesForOffer(DIMEList<Data.Feature>
  		 value)
  		{
  			this.featuresForOffer = value;
  		}
  		void featuresForOffersetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValuefeaturesForOffer(value);
  		}
  		void featuresForOfferadd(Data.Feature
  		 value)
  		{
  			this.featuresForOffer.add(value);
  		}
  		DIMEList<Data.Feature>
  		 initOnDemandfeaturesForBidding()
  		{
  			if(this.featuresForBidding==null){
  				this.featuresForBidding = new DIMEList<Data.Feature>
  				();
  			}
  			return this.featuresForBidding;
  		}
  		void setValuefeaturesForBidding(DIMEList<Data.Feature>
  		 value)
  		{
  			this.featuresForBidding = value;
  		}
  		void featuresForBiddingsetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValuefeaturesForBidding(value);
  		}
  		void featuresForBiddingadd(Data.Feature
  		 value)
  		{
  			this.featuresForBidding.add(value);
  		}
  		
  	
  		
  		
  		//GUI SIB FeatureTemplateTable
  		//GUI SIB FeatureTemplateTable
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_S6RoAVLZEe2djpkPxa2Z3QRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_S6RoAVLZEe2djpkPxa2Z3QId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_S6RoAVLZEe2djpkPxa2Z3Q";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_S6RoAVLZEe2djpkPxa2Z3QClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_S6RoAVLZEe2djpkPxa2Z3QToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

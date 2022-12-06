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
import 'package:app/src/tables/FeatureTemplateTable/Table_zZO2YVLIEe2djpkPxa2Z3QFeatureTemplateTable.dart' as azZO2YVLIEe2djpkPxa2Z3Q;
//form component imports
//GUI plug in component imports
//GUI SIB imports
//Embedded process SIB imports

import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';

@Component(
  selector: "featuretemplatetable-tag",
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  azZO2YVLIEe2djpkPxa2Z3Q.Table_zZO2YVLIEe2djpkPxa2Z3QFeatureTemplateTable,
  ],
  templateUrl: 'FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q.html'
)

class FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q extends dime.DIMEComponent implements OnInit, OnDestroy, AfterViewInit {
  
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
  	bool refresh_zZO2YVLIEe2djpkPxa2Z3QTable;
  	
  	
  	
  	
  	
  	/// Table
  	@ViewChildren(azZO2YVLIEe2djpkPxa2Z3Q.Table_zZO2YVLIEe2djpkPxa2Z3QFeatureTemplateTable)
  	List<azZO2YVLIEe2djpkPxa2Z3Q.Table_zZO2YVLIEe2djpkPxa2Z3QFeatureTemplateTable> tableComponentazZO2YVLIEe2djpkPxa2Z3Q;
  	// branch Edit feature as info.scce.dime.gui.editor.graphiti.api.CButton@85cb98db (id: _zZTH0VLIEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@108b2d4f (id: _a-hbAVLIEe2djpkPxa2Z3Q)
  	@Output('actioneditfeatureevent') Stream<Map<String,dynamic>> get evt_actioneditfeatureevent => actioneditfeatureevent.stream;
  	StreamController<Map<String,dynamic>> actioneditfeatureevent = new StreamController();
  	// branch Delete feature as info.scce.dime.gui.editor.graphiti.api.CButton@a0fe8e89 (id: _zZTH4lLIEe2djpkPxa2Z3Q) in info.scce.dime.gui.editor.graphiti.api.CGUI@108b2d4f (id: _a-hbAVLIEe2djpkPxa2Z3Q)
  	@Output('actiondeletefeatureevent') Stream<Map<String,dynamic>> get evt_actiondeletefeatureevent => actiondeletefeatureevent.stream;
  	StreamController<Map<String,dynamic>> actiondeletefeatureevent = new StreamController();
  	// branch Details as info.scce.dime.gui.editor.graphiti.api.CButton@f61a5129 (id: _FHYeQXVnEe2_CvdRyEmMCQ) in info.scce.dime.gui.editor.graphiti.api.CGUI@108b2d4f (id: _a-hbAVLIEe2djpkPxa2Z3Q)
  	@Output('actiondetailsevent') Stream<Map<String,dynamic>> get evt_actiondetailsevent => actiondetailsevent.stream;
  	StreamController<Map<String,dynamic>> actiondetailsevent = new StreamController();
  	
  	@ViewChildren(modal.Modal)
  	List<modal.Modal> modals;
  	bool hasToSignIn;
	//DATA CONTEXT
	//Feature features
		@Input()
		DIMEList<Data.Feature> features;
	
	bool isDestroyed = true;
  
	FeatureTemplateTableaa_45_hbAVLIEe2djpkPxa2Z3Q(DIMEProcessService this.processService, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	void restartComponent() {
		
		this.hasToSignIn = false;
		
		//DATA CONTEXT
		// Feature features
		this.features = new DIMEList();
						
						
		
			  	
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
			
		/// table
		if(tableComponentazZO2YVLIEe2djpkPxa2Z3Q!=null) {
			tableComponentazZO2YVLIEe2djpkPxa2Z3Q.forEach((n) => n.restartComponent());
		}
		updateImageHash();
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
			tableComponentazZO2YVLIEe2djpkPxa2Z3Q.forEach((n)=>n.updateWithoutInputs());
		}
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Feature>  pfeatures
	})
	{
		features = pfeatures;
		
		updateWithoutInputs(updateHidden:false);
		tableComponentazZO2YVLIEe2djpkPxa2Z3Q.forEach((n)=>n.updateInputs(
			pfeatures:features
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
  		
  		
  		
  		
  	
  		/// callback, if the button Edit feature is clicked
  		void actioneditfeatureeventazZTH0VLIEe2djpkPxa2Z3QEventTrigger(Map<String,dynamic> data)
  		{
  			this.actioneditfeatureevent.add(data);
  		}
  		/// callback, if the button Delete feature is clicked
  		void actiondeletefeatureeventazZTH4lLIEe2djpkPxa2Z3QEventTrigger(Map<String,dynamic> data)
  		{
  			this.actiondeletefeatureevent.add(data);
  		}
  		/// callback, if the button Details is clicked
  		void actiondetailseventaFHYeQXVnEe2_CvdRyEmMCQEventTrigger(Map<String,dynamic> data)
  		{
  			this.actiondetailsevent.add(data);
  		}
  		
  		
  		
  		
  	
  		
  		
  		
  		DIMEList<Data.Feature>
  		 initOnDemandfeatures()
  		{
  			if(this.features==null){
  				this.features = new DIMEList<Data.Feature>
  				();
  			}
  			return this.features;
  		}
  		void setValuefeatures(DIMEList<Data.Feature>
  		 value)
  		{
  			this.features = value;
  		}
  		void featuressetValue(DIMEList<Data.Feature>
  		 value)
  		{
  			this.setValuefeatures(value);
  		}
  		void featuresadd(Data.Feature
  		 value)
  		{
  			this.features.add(value);
  		}
  		
  	
  		
  		
  		
  
	/// returns the surrounding container class for major GUI models
	String getContainer_ahbAVLIEe2djpkPxa2Z3QRootClass()
	{
		if(this.ismajorpage)return "";
		return "";
	}
	
	/// returns the surrounding wrapper class for major GUI models
	String getContainer_ahbAVLIEe2djpkPxa2Z3QId()
	{
		if(this.ismajorpage)return "wrapper";
		return "_ahbAVLIEe2djpkPxa2Z3Q";
	}
	
	/// returns the surrounding container class for major GUI models
	String getContainer_ahbAVLIEe2djpkPxa2Z3QClass()
	{
		if(this.ismajorpage)return "container-display";
		return "";
	}
	
	/// callback, to go back to the root interaction
	void redirect_ahbAVLIEe2djpkPxa2Z3QToHome(dynamic e)
	{
		e.preventDefault();
		this.router.navigate(Routes.root.toUrl());
	}
}

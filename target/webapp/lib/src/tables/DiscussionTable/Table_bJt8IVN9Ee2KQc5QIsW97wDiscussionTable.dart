// generated by info.scce.dime.generator.gui.dart.AngularDartTableTemplate#create
// table in GUI model DiscussionTable
// with columns Title Actions State
import 'dart:js' as js;
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/services/TableDndService.dart';

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
import 'package:app/src/gui/IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w.dart';
//Embedded process SIB imports


@Component(
  selector: 'table-_bJt8IVN9Ee2KQc5QIsW97w-discussionTable',
  pipes: const [commonPipes,SecondsPipe],
  encapsulation: ViewEncapsulation.None,
  exports: const [
  	Data.DataCastUtil
  ],
  directives: const [
  coreDirectives,panel.Panel,modal.Modal,DimeCustomeAttributes,formDirectives,FileSelect,routerDirectives,MaxLength,login.Login,SafeInnerHtmlDirective,
  IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w,
  ],
  templateUrl: 'Table_bJt8IVN9Ee2KQc5QIsW97wDiscussionTable.html',
  styles: const [
  ]
)
class Table_bJt8IVN9Ee2KQc5QIsW97wDiscussionTable extends dime.DIMEComponent implements OnInit, AfterViewChecked {
	
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
	/// GUI IssueStateBadge
	@ViewChildren(IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w)
	List<IssueStateBadgeadFq2AVN_45_Ee2KQc5QIsW97w> componentSIBau8rT5VN_45_Ee2KQc5QIsW97w;
	
	
	
	
	
	// branch Show issue as info.scce.dime.gui.editor.graphiti.api.CButton@9df2c280 (id: _bJxmsVN9Ee2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
	@Output('actionshowissueevent') Stream<Map<String,dynamic>> get evt_actionshowissueevent => actionshowissueevent.stream;
	StreamController<Map<String,dynamic>> actionshowissueevent = new StreamController();
	// branch Resolve issue as info.scce.dime.gui.editor.graphiti.api.CButton@db418f73 (id: _V3lGkVOdEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
	@Output('actionresolveissueevent') Stream<Map<String,dynamic>> get evt_actionresolveissueevent => actionresolveissueevent.stream;
	StreamController<Map<String,dynamic>> actionresolveissueevent = new StreamController();
	// branch Unresolve issue as info.scce.dime.gui.editor.graphiti.api.CButton@fdde42e (id: _dDPcAVOdEe2KQc5QIsW97w) in info.scce.dime.gui.editor.graphiti.api.CGUI@dbafc57f (id: _UOyxYVN9Ee2KQc5QIsW97w)
	@Output('actionunresolveissueevent') Stream<Map<String,dynamic>> get evt_actionunresolveissueevent => actionunresolveissueevent.stream;
	StreamController<Map<String,dynamic>> actionunresolveissueevent = new StreamController();
	
	@ViewChildren(modal.Modal)
	List<modal.Modal> modals;
	
	@Input()
	DIMEList<Data.Issue>
	 sourceabJt8IVN9Ee2KQc5QIsW97w;
	
	@Output('source_update') Stream<dynamic> get source_update => _source_update.stream;
	StreamController<dynamic> _source_update = new StreamController();
	
	
	ElementRef elementRef;
	TableDndService dndService;
	html.Element dragHandle;
	
  	//Global Scope
  	//DATA CONTEXT
  	//Issue issues
  		@Input()
  		DIMEList<Data.Issue> issues;
  	@Input()
  	bool showResolveButtons;

	//Extra input variables
	//TABLE SORTING
	String current_bJt8IVN9Ee2KQc5QIsW97wSortCol = "";
	// table pagination activated
	int table_bJt8IVN9Ee2KQc5QIsW97wCurrentPage = 0;
	int table_bJt8IVN9Ee2KQc5QIsW97w_size = 0;
	
	// column Title
	String filter_bJvxZVN9Ee2KQc5QIsW97wColumn = "";
	bool sortColumn_bJvxZVN9Ee2KQc5QIsW97wDirection = false;
	// column State
	String filter_bJy0q1N9Ee2KQc5QIsW97wColumn = "";
	bool sortColumn_bJy0q1N9Ee2KQc5QIsW97wDirection = false;
	// column Actions
  	
	Table_bJt8IVN9Ee2KQc5QIsW97wDiscussionTable(DIMEProcessService this.processService, TableDndService this.dndService, ElementRef this.elementRef, Router this.router,DomSanitizationService this.domSanitizationService,AbstractRoutes routes) : super(domSanitizationService,processService,routes)
	{
		restartComponent();
	}
	
	
	void restartComponent() {
		
		
			  	
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
			
		/// GUI IssueStateBadge
		if(componentSIBau8rT5VN_45_Ee2KQc5QIsW97w!=null) {
			componentSIBau8rT5VN_45_Ee2KQc5QIsW97w.forEach((n)=>n.restartComponent());
		}
		//TABLE SORTING
		current_bJt8IVN9Ee2KQc5QIsW97wSortCol = "";
		// table pagination activated
		table_bJt8IVN9Ee2KQc5QIsW97wCurrentPage = 0;
		table_bJt8IVN9Ee2KQc5QIsW97w_size = 0;
		
		// column Title
		filter_bJvxZVN9Ee2KQc5QIsW97wColumn = "";
		sortColumn_bJvxZVN9Ee2KQc5QIsW97wDirection = false;
		// column State
		filter_bJy0q1N9Ee2KQc5QIsW97wColumn = "";
		sortColumn_bJy0q1N9Ee2KQc5QIsW97wDirection = false;
		// column Actions
	}
									
	void ngOnInit()
	{
		initializeDateFormatting(html.window.navigator.language,null).then((_)=>Intl.defaultLocale = html.window.navigator.language);
		
		
		
		// sorting enabled for State
		this.table_bJy0q1N9Ee2KQc5QIsW97wSort(null);
		
	}
	
	
	
	
	void ngAfterViewChecked() {
		if(html.querySelector("#table${this.hashCode}")!=null) {
		}
	}
	
	void updateWithoutInputs({bool updateHidden:true}) {
		modals.forEach((m)=>m.close());
		if(updateHidden) {
		}
		componentSIBau8rT5VN_45_Ee2KQc5QIsW97w.forEach((n)=>n.updateWithoutInputs());
		updateImageHash();
	}
	
	void updateInputs(
	{DIMEList<Data.Issue>  pissues,
	bool pshowResolveButtons
	})
	{
		issues = pissues;
		showResolveButtons = pshowResolveButtons;
		
		updateWithoutInputs(updateHidden:false);
	}
		@override
		String getRuntimeId() => this.runtimeId;
		
		
		
		
	
		/// callback, if the button Show issue is clicked
			void actionshowissueeventabJxmsVN9Ee2KQc5QIsW97wEventTrigger(
				p_BzmcVNEe2KQc5QIsW97w
				
				)
		
		{
			Map<String,dynamic> data = new Map();
			data['issue'] = p_BzmcVNEe2KQc5QIsW97w;
			this.actionshowissueevent.add(data);
		}
		/// callback, if the button Resolve issue is clicked
			void actionresolveissueeventaV3lGkVOdEe2KQc5QIsW97wEventTrigger(
				p_BzmcVNEe2KQc5QIsW97w
				
				)
		
		{
			Map<String,dynamic> data = new Map();
			data['issue'] = p_BzmcVNEe2KQc5QIsW97w;
			this.actionresolveissueevent.add(data);
		}
		/// callback, if the button Unresolve issue is clicked
			void actionunresolveissueeventadDPcAVOdEe2KQc5QIsW97wEventTrigger(
				p_BzmcVNEe2KQc5QIsW97w
				
				)
		
		{
			Map<String,dynamic> data = new Map();
			data['issue'] = p_BzmcVNEe2KQc5QIsW97w;
			this.actionunresolveissueevent.add(data);
		}
		
		
		
		
	
		
		
		
		DIMEList<Data.Issue>
		 initOnDemandissues()
		{
			if(this.issues==null){
				this.issues = new DIMEList<Data.Issue>
				();
			}
			return this.issues;
		}
		void setValueissues(DIMEList<Data.Issue>
		 value)
		{
			this.issues = value;
		}
		void issuessetValue(DIMEList<Data.Issue>
		 value)
		{
			this.setValueissues(value);
		}
		void issuesadd(Data.Issue
		 value)
		{
			this.issues.add(value);
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
		
	
		
		
		//GUI SIB IssueStateBadge
		
	// returns the filtered and sorted list of objects
	DIMEList table_bJt8IVN9Ee2KQc5QIsW97wgetElements(DIMEList source) {
		DIMEList<Data.Issue>
		 table_bJt8IVN9Ee2KQc5QIsW97wSource = new DIMEList();
		if(source==null) {
			return table_bJt8IVN9Ee2KQc5QIsW97wSource;
		}
		table_bJt8IVN9Ee2KQc5QIsW97wSource.addAll(source.where((element) {
		            return (
	// filterable column Title
	this.tableValue_bJvxZVN9Ee2KQc5QIsW97wProvider(element).toLowerCase().replaceAll(' ','').contains(this.filter_bJvxZVN9Ee2KQc5QIsW97wColumn.toLowerCase().replaceAll(' ','')) &&
	// filterable column State
	this.tableValue_bJy0q1N9Ee2KQc5QIsW97wProvider(element).toLowerCase().replaceAll(' ','').contains(this.filter_bJy0q1N9Ee2KQc5QIsW97wColumn.toLowerCase().replaceAll(' ','')) &&
			true);
		        }));
	// column Title is sortable
	if (this.current_bJt8IVN9Ee2KQc5QIsW97wSortCol == "colId_bJvxZVN9Ee2KQc5QIsW97w") {
	    table_bJt8IVN9Ee2KQc5QIsW97wSource.sort(table_bJvxZVN9Ee2KQc5QIsW97wSortFun);
	}
	// column State is sortable
	if (this.current_bJt8IVN9Ee2KQc5QIsW97wSortCol == "colId_bJy0q1N9Ee2KQc5QIsW97w") {
	    table_bJt8IVN9Ee2KQc5QIsW97wSource.sort(table_bJy0q1N9Ee2KQc5QIsW97wSortFun);
	}
		this.table_bJt8IVN9Ee2KQc5QIsW97w_size = table_bJt8IVN9Ee2KQc5QIsW97wSource.length;
		// pagination with up to 20 entries per page
			    var from = (this.table_bJt8IVN9Ee2KQc5QIsW97wCurrentPage) * 20;
			    var to = from + 20;
			    if (to > table_bJt8IVN9Ee2KQc5QIsW97wSource.length) to = table_bJt8IVN9Ee2KQc5QIsW97wSource.length;
			    if (this.table_bJt8IVN9Ee2KQc5QIsW97wCurrentPage > to) this.table_bJt8IVN9Ee2KQc5QIsW97wCurrentPage = to;
			    if(table_bJt8IVN9Ee2KQc5QIsW97wSource.length>=from && table_bJt8IVN9Ee2KQc5QIsW97wSource.length >= to) {
			    		return table_bJt8IVN9Ee2KQc5QIsW97wSource.subDIMEList(from, to);
			    }
			    return table_bJt8IVN9Ee2KQc5QIsW97wSource;
	}
	
	/// creates the pagination bar entries
	List<int> table_bJt8IVN9Ee2KQc5QIsW97wgetPageCount(int size) {
	    var page_array = new List<int>();
	    int bound = (size / 20).ceil();
	    for (var i = 0; i < bound; i++) {
	        page_array.add(i);
	    }
	    return page_array;
	}
	
	/// callback, if the another page is selected
	///
	/// changes the current page of the table
	void table_bJt8IVN9Ee2KQc5QIsW97wchangePage(int targetPage,dynamic event) {
		int bound = (this.sourceabJt8IVN9Ee2KQc5QIsW97w.length / 20).ceil();
		if (targetPage >= 0 && targetPage < bound) {
	        this.table_bJt8IVN9Ee2KQc5QIsW97wCurrentPage = targetPage;
	    }
	    event.preventDefault();
	    
	}
	
	/// determines if and in which order the given column is sorted
	String table_bJt8IVN9Ee2KQc5QIsW97wIsSorted(String colId) {
		String cssClass = "glyphicon glyphicon-chevron-";
	// column Title is sortable
	if (this.current_bJt8IVN9Ee2KQc5QIsW97wSortCol == colId && colId == "colId_bJvxZVN9Ee2KQc5QIsW97w") {
	    if (this.sortColumn_bJvxZVN9Ee2KQc5QIsW97wDirection) {
	        return cssClass += "down";
	    }
	    return cssClass += "up";
	}
	// column State is sortable
	if (this.current_bJt8IVN9Ee2KQc5QIsW97wSortCol == colId && colId == "colId_bJy0q1N9Ee2KQc5QIsW97w") {
	    if (this.sortColumn_bJy0q1N9Ee2KQc5QIsW97wDirection) {
	        return cssClass += "down";
	    }
	    return cssClass += "up";
	}
	    return "";
	}
	/// callback, if the filter has changed for column Title
	void columnFilter_bJvxZVN9Ee2KQc5QIsW97wSubmit(String value) {
	    this.filter_bJvxZVN9Ee2KQc5QIsW97wColumn = value;
	}
	/// callback, if the sorting has changed for column Title
	void table_bJvxZVN9Ee2KQc5QIsW97wSort(dynamic event) {
		this.sortColumn_bJvxZVN9Ee2KQc5QIsW97wDirection = ! this.sortColumn_bJvxZVN9Ee2KQc5QIsW97wDirection;
		this.current_bJt8IVN9Ee2KQc5QIsW97wSortCol = "colId_bJvxZVN9Ee2KQc5QIsW97w";
		if(event!=null){
			event.preventDefault();
		}
	}
	/// callback, if the sorting has changed for column Title
	int table_bJvxZVN9Ee2KQc5QIsW97wSortFun(n1,n2) {
		dynamic c1 = n1?.title?.toString();
		dynamic c2 = n2?.title?.toString();
		if (c1 == null)
			return 1;
		if (c2 == null)
			return -1;
		if(c1
		?.compareTo(c2
		) > 0) {
			return this.sortColumn_bJvxZVN9Ee2KQc5QIsW97wDirection?-1:1;
		}
		if(c1
		?.compareTo(c2
		) < 0) {
			return this.sortColumn_bJvxZVN9Ee2KQc5QIsW97wDirection?1:-1;
		}
		return 0;
	}
	/// callback, if the filter has changed for column State
	void columnFilter_bJy0q1N9Ee2KQc5QIsW97wSubmit(String value) {
	    this.filter_bJy0q1N9Ee2KQc5QIsW97wColumn = value;
	}
	/// callback, if the sorting has changed for column State
	void table_bJy0q1N9Ee2KQc5QIsW97wSort(dynamic event) {
		this.sortColumn_bJy0q1N9Ee2KQc5QIsW97wDirection = ! this.sortColumn_bJy0q1N9Ee2KQc5QIsW97wDirection;
		this.current_bJt8IVN9Ee2KQc5QIsW97wSortCol = "colId_bJy0q1N9Ee2KQc5QIsW97w";
		if(event!=null){
			event.preventDefault();
		}
	}
	/// callback, if the sorting has changed for column State
	int table_bJy0q1N9Ee2KQc5QIsW97wSortFun(n1,n2) {
		dynamic c1 = n1?.state?.toString();
		dynamic c2 = n2?.state?.toString();
		if (c1 == null)
			return 1;
		if (c2 == null)
			return -1;
		if(c1
		?.compareTo(c2
		) > 0) {
			return this.sortColumn_bJy0q1N9Ee2KQc5QIsW97wDirection?-1:1;
		}
		if(c1
		?.compareTo(c2
		) < 0) {
			return this.sortColumn_bJy0q1N9Ee2KQc5QIsW97wDirection?1:-1;
		}
		return 0;
	}
	
	
	/// getter for the value of the Title column
	String tableValue_bJvxZVN9Ee2KQc5QIsW97wProvider(dynamic value) {
		if(value==null)return "";
		String strValue = value?.title?.toString();
		if(strValue == null)return "";
		return strValue;
	}
	/// getter for the value of the Actions column
	String tableValue_bJwYhFN9Ee2KQc5QIsW97wProvider(dynamic value) {
		if(value==null)return "";
		return "";
	}
	/// getter for the value of the State column
	String tableValue_bJy0q1N9Ee2KQc5QIsW97wProvider(dynamic value) {
		if(value==null)return "";
		String strValue = value?.state?.toString();
		if(strValue == null)return "";
		return strValue;
	}
}

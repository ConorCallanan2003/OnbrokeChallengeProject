// root Home process combines all front end sibs reachable
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'dart:async';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/notification/notification_component.dart';
//routes
import 'package:app/src/app.dart' as main;
//Data
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
//GUI model outputs
import 'package:app/src/rest/gui/AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput.dart';
import 'package:app/src/rest/gui/AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wBranch.dart';
import 'package:app/src/gui/AdminAreaHeaderaikwGUVE4Ee2Vgcav4Znc_w.dart';
import 'package:app/src/rest/gui/BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput.dart';
import 'package:app/src/rest/gui/BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wBranch.dart';
import 'package:app/src/gui/BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w.dart';
import 'package:app/src/rest/gui/UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput.dart';
import 'package:app/src/rest/gui/UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wBranch.dart';
import 'package:app/src/gui/UserAreaHeaderaoEUtYVE4Ee2Vgcav4Znc_w.dart';
//NF model outputs

@Component(
  	selector: 'Home-aLWgagF_45_SEeakMeYoloYxpg-process',
  	directives: const [
  		coreDirectives,login.Login,AdminAreaHeaderaikwGUVE4Ee2Vgcav4Znc_w,BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w,UserAreaHeaderaoEUtYVE4Ee2Vgcav4Znc_w,AdminAreaHeaderaikwGUVE4Ee2Vgcav4Znc_w,BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w,UserAreaHeaderaoEUtYVE4Ee2Vgcav4Znc_w
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process Home -->
		<!-- Process ShowInternalArea -->
		<adminareaheader-tag
			*ngIf="isVisible(majorSIB,'_p7PywVE4Ee2Vgcav4Znc_w')"
			[guiId]="'_ikwGUVE4Ee2Vgcav4Znc_w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
		>
		</adminareaheader-tag>
		<brokerareaheader-tag
			*ngIf="isVisible(majorSIB,'_rcx28FE4Ee2Vgcav4Znc_w')"
			[guiId]="'_kylP0VE4Ee2Vgcav4Znc_w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
		>
		</brokerareaheader-tag>
		<userareaheader-tag
			*ngIf="isVisible(majorSIB,'_svmJsVE4Ee2Vgcav4Znc_w')"
			[guiId]="'_oEUtYVE4Ee2Vgcav4Znc_w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
		>
		</userareaheader-tag>
	</template>
	'''
)
class ProcessaLWgagF_45_SEeakMeYoloYxpgComponent extends GUIProcess implements OnInit, OnChanges, AfterViewChecked {
	
	@Input()
	String runtimeId;
	
	@Input()
	String parentRuntimeId;
	
	@Input()
	String majorSIB;
	
	@Input()
	String minorSIB;
	
	@Input()
	String guiId;
	
	@Input()
	String sibId;
	
	@Input()
	UserInteractionResponse majorInput;
	
	@Input()
	UserInteractionResponse minorInput;
	
	@Input()
	UserInteractionResponseDeserializer deserializer;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput majorap7PywVE4Ee2Vgcav4Znc_wInput;
	AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput minorap7PywVE4Ee2Vgcav4Znc_wInput;
	BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput majorarcx28FE4Ee2Vgcav4Znc_wInput;
	BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput minorarcx28FE4Ee2Vgcav4Znc_wInput;
	UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput majorasvmJsVE4Ee2Vgcav4Znc_wInput;
	UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput minorasvmJsVE4Ee2Vgcav4Znc_wInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process ShowInternalArea
	// GUISIB AdminAreaHeader
	@ViewChildren(AdminAreaHeaderaikwGUVE4Ee2Vgcav4Znc_w)
	List<AdminAreaHeaderaikwGUVE4Ee2Vgcav4Znc_w> componentap7PywVE4Ee2Vgcav4Znc_w;
	// GUISIBs of Process ShowInternalArea
	// GUISIB BrokerAreaHeader
	@ViewChildren(BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w)
	List<BrokerAreaHeaderakylP0VE4Ee2Vgcav4Znc_w> componentarcx28FE4Ee2Vgcav4Znc_w;
	// GUISIBs of Process ShowInternalArea
	// GUISIB UserAreaHeader
	@ViewChildren(UserAreaHeaderaoEUtYVE4Ee2Vgcav4Znc_w)
	List<UserAreaHeaderaoEUtYVE4Ee2Vgcav4Znc_w> componentasvmJsVE4Ee2Vgcav4Znc_w;
	
	ProcessaLWgagF_45_SEeakMeYoloYxpgComponent(this._processService,this._router,this._notificationService,AbstractRoutes routes): super(routes);

	@override
	ngOnInit() {
		reActivateProcess();
		started = true;
	}
	
	@override
	ngAfterViewChecked() {
	}
	
	void retry() {
		retryAfterLogin(_processService,"Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg",sibId:sibId);
	}
	
	@override
	void ngOnChanges(Map<String, SimpleChange> changes) {
		reActivateProcess();
	}
	
	@override
	Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
	
	@override
	String getParentRuntimeId() => parentRuntimeId;
	
	@override
	String getRuntimeId() => runtimeId;
	
	@override
    String getGUIId() => guiId;
    
    @override
    Router getRouter() => _router;
    
    @override
    NotificationService getNotificationService() => _notificationService;
	
	/// starts a front end routine or a GUI by event
	void reActivateProcess() {
		
		if(isVisible(majorSIB,'_p7PywVE4Ee2Vgcav4Znc_w')) {
			majorap7PywVE4Ee2Vgcav4Znc_wInput = majorInput as AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput;
			if(componentap7PywVE4Ee2Vgcav4Znc_w != null) {
				componentap7PywVE4Ee2Vgcav4Znc_w.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_p7PywVE4Ee2Vgcav4Znc_w')) {
			AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput newInput = minorInput as AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput;
			bool hasChanged = minorap7PywVE4Ee2Vgcav4Znc_wInput!=null?minorap7PywVE4Ee2Vgcav4Znc_wInput.inpusChanged(newInput):true;
			minorap7PywVE4Ee2Vgcav4Znc_wInput = newInput;
			if(componentap7PywVE4Ee2Vgcav4Znc_w != null) {
				componentap7PywVE4Ee2Vgcav4Znc_w.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentap7PywVE4Ee2Vgcav4Znc_w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_rcx28FE4Ee2Vgcav4Znc_w')) {
			majorarcx28FE4Ee2Vgcav4Znc_wInput = majorInput as BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput;
			if(componentarcx28FE4Ee2Vgcav4Znc_w != null) {
				componentarcx28FE4Ee2Vgcav4Znc_w.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_rcx28FE4Ee2Vgcav4Znc_w')) {
			BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput newInput = minorInput as BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput;
			bool hasChanged = minorarcx28FE4Ee2Vgcav4Znc_wInput!=null?minorarcx28FE4Ee2Vgcav4Znc_wInput.inpusChanged(newInput):true;
			minorarcx28FE4Ee2Vgcav4Znc_wInput = newInput;
			if(componentarcx28FE4Ee2Vgcav4Znc_w != null) {
				componentarcx28FE4Ee2Vgcav4Znc_w.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentarcx28FE4Ee2Vgcav4Znc_w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_svmJsVE4Ee2Vgcav4Znc_w')) {
			majorasvmJsVE4Ee2Vgcav4Znc_wInput = majorInput as UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput;
			if(componentasvmJsVE4Ee2Vgcav4Znc_w != null) {
				componentasvmJsVE4Ee2Vgcav4Znc_w.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_svmJsVE4Ee2Vgcav4Znc_w')) {
			UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput newInput = minorInput as UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput;
			bool hasChanged = minorasvmJsVE4Ee2Vgcav4Znc_wInput!=null?minorasvmJsVE4Ee2Vgcav4Znc_wInput.inpusChanged(newInput):true;
			minorasvmJsVE4Ee2Vgcav4Znc_wInput = newInput;
			if(componentasvmJsVE4Ee2Vgcav4Znc_w != null) {
				componentasvmJsVE4Ee2Vgcav4Znc_w.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentasvmJsVE4Ee2Vgcav4Znc_w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB AdminAreaHeader of Process ShowInternalArea
	// Branches for GUISIB BrokerAreaHeader of Process ShowInternalArea
	// Branches for GUISIB UserAreaHeader of Process ShowInternalArea
}

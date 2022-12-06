// root ShowUserArea process combines all front end sibs reachable
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
import 'package:app/src/rest/gui/UserArea_jIfqkVFOEe2J0bu3ffrh5wInput.dart';
import 'package:app/src/rest/gui/UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.dart';
import 'package:app/src/gui/UserAreaajIfqkVFOEe2J0bu3ffrh5w.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.dart';
import 'package:app/src/gui/OfferDetailsafcOIkVN8Ee2KQc5QIsW97w.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.dart';
import 'package:app/src/gui/BiddingDetailsazSAVgVOjEe2KQc5QIsW97w.dart';
//NF model outputs

@Component(
  	selector: 'ShowUserArea-acxB5kVFLEe2Vgcav4Znc_w-process',
  	directives: const [
  		coreDirectives,login.Login,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process ShowUserArea -->
		<userarea-tag
			*ngIf="isVisible(majorSIB,'_lsPHwVFQEe2J0bu3ffrh5w')"
			[guiId]="'_jIfqkVFOEe2J0bu3ffrh5w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionshowofferevent) = "eventalsTZMVFQEe2J0bu3ffrh5wShow_offerTrigger(\$event)"
			(actioneditofferevent) = "eventalsbVAVFQEe2J0bu3ffrh5wEdit_offerTrigger(\$event)"
			(actiondeleteofferevent) = "eventalsiCsVFQEe2J0bu3ffrh5wDelete_offerTrigger(\$event)"
			(actionshowbiddingevent) = "eventalspXcVFQEe2J0bu3ffrh5wShow_biddingTrigger(\$event)"
			(actioneditbiddingevent) = "eventalswsMVFQEe2J0bu3ffrh5wEdit_biddingTrigger(\$event)"
			(actiondeletebiddingevent) = "eventals4oAVFQEe2J0bu3ffrh5wDelete_biddingTrigger(\$event)"
			(actioncreateofferevent) = "eventaMeLucVFREe2J0bu3ffrh5wCreate_offerTrigger(\$event)"
			(actioncreatebiddingevent) = "eventaPXHDYVFREe2J0bu3ffrh5wCreate_biddingTrigger(\$event)"
		>
		</userarea-tag>
		<!-- Process ShowOfferDetails -->
		<offerdetails-tag
			*ngIf="isVisible(majorSIB,'_AaCYMVOjEe2KQc5QIsW97w')"
			[offer]="majoraAaCYMVOjEe2KQc5QIsW97wInput.offer"
			[guiId]="'_fcOIkVN8Ee2KQc5QIsW97w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionshowissueevent) = "eventaAaXvYVOjEe2KQc5QIsW97wShow_issueTrigger(\$event)"
			(actionresolveissueevent) = "eventaAaiHcVOjEe2KQc5QIsW97wResolve_issueTrigger(\$event)"
			(actionunresolveissueevent) = "eventaAaqDQVOjEe2KQc5QIsW97wUnresolve_issueTrigger(\$event)"
			(actioncreateissueevent) = "eventaAaxYAVOjEe2KQc5QIsW97wCreate_issueTrigger(\$event)"
			(actionbackevent) = "eventaDXxNQVOmEe2KQc5QIsW97wBackTrigger(\$event)"
		>
		</offerdetails-tag>
		<!-- Process ShowBiddingDetails -->
		<biddingdetails-tag
			*ngIf="isVisible(majorSIB,'_Yuo5oVOlEe2KQc5QIsW97w')"
			[bidding]="majoraYuo5oVOlEe2KQc5QIsW97wInput.bidding"
			[guiId]="'_zSAVgVOjEe2KQc5QIsW97w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actioncreateissueevent) = "eventajZ9z61OlEe2KQc5QIsW97wCreate_issueTrigger(\$event)"
			(actionshowissueevent) = "eventajZ9M2VOlEe2KQc5QIsW97wShow_issueTrigger(\$event)"
			(actionresolveissueevent) = "eventajZ_45_a_lOlEe2KQc5QIsW97wResolve_issueTrigger(\$event)"
			(actionunresolveissueevent) = "eventajZ_45_a8VOlEe2KQc5QIsW97wUnresolve_issueTrigger(\$event)"
			(actionbackevent) = "eventaAfrl0VOmEe2KQc5QIsW97wBackTrigger(\$event)"
		>
		</biddingdetails-tag>
	</template>
	'''
)
class ProcessacxB5kVFLEe2Vgcav4Znc_wComponent extends GUIProcess implements OnInit, OnChanges, AfterViewChecked {
	
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
	
	UserArea_jIfqkVFOEe2J0bu3ffrh5wInput majoralsPHwVFQEe2J0bu3ffrh5wInput;
	UserArea_jIfqkVFOEe2J0bu3ffrh5wInput minoralsPHwVFQEe2J0bu3ffrh5wInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput majoraAaCYMVOjEe2KQc5QIsW97wInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput minoraAaCYMVOjEe2KQc5QIsW97wInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput majoraYuo5oVOlEe2KQc5QIsW97wInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput minoraYuo5oVOlEe2KQc5QIsW97wInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process ShowUserArea
	// GUISIB UserArea
	@ViewChildren(UserAreaajIfqkVFOEe2J0bu3ffrh5w)
	List<UserAreaajIfqkVFOEe2J0bu3ffrh5w> componentalsPHwVFQEe2J0bu3ffrh5w;
	// GUISIBs of Process ShowOfferDetails
	// GUISIB OfferDetails
	@ViewChildren(OfferDetailsafcOIkVN8Ee2KQc5QIsW97w)
	List<OfferDetailsafcOIkVN8Ee2KQc5QIsW97w> componentaAaCYMVOjEe2KQc5QIsW97w;
	// GUISIBs of Process ShowBiddingDetails
	// GUISIB BiddingDetails
	@ViewChildren(BiddingDetailsazSAVgVOjEe2KQc5QIsW97w)
	List<BiddingDetailsazSAVgVOjEe2KQc5QIsW97w> componentaYuo5oVOlEe2KQc5QIsW97w;
	
	ProcessacxB5kVFLEe2Vgcav4Znc_wComponent(this._processService,this._router,this._notificationService,AbstractRoutes routes): super(routes);

	@override
	ngOnInit() {
		reActivateProcess();
		started = true;
	}
	
	@override
	ngAfterViewChecked() {
	}
	
	void retry() {
		retryAfterLogin(_processService,"ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w",sibId:sibId);
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
		
		if(isVisible(majorSIB,'_lsPHwVFQEe2J0bu3ffrh5w')) {
			majoralsPHwVFQEe2J0bu3ffrh5wInput = majorInput as UserArea_jIfqkVFOEe2J0bu3ffrh5wInput;
			if(componentalsPHwVFQEe2J0bu3ffrh5w != null) {
				componentalsPHwVFQEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_lsPHwVFQEe2J0bu3ffrh5w')) {
			UserArea_jIfqkVFOEe2J0bu3ffrh5wInput newInput = minorInput as UserArea_jIfqkVFOEe2J0bu3ffrh5wInput;
			bool hasChanged = minoralsPHwVFQEe2J0bu3ffrh5wInput!=null?minoralsPHwVFQEe2J0bu3ffrh5wInput.inpusChanged(newInput):true;
			minoralsPHwVFQEe2J0bu3ffrh5wInput = newInput;
			if(componentalsPHwVFQEe2J0bu3ffrh5w != null) {
				componentalsPHwVFQEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentalsPHwVFQEe2J0bu3ffrh5w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_AaCYMVOjEe2KQc5QIsW97w')) {
			majoraAaCYMVOjEe2KQc5QIsW97wInput = majorInput as OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput;
			if(componentaAaCYMVOjEe2KQc5QIsW97w != null) {
				componentaAaCYMVOjEe2KQc5QIsW97w.forEach((n)=>n.updateInputs(
					poffer:majoraAaCYMVOjEe2KQc5QIsW97wInput.offer
				));
			}
		} else if(isVisible(minorSIB,'_AaCYMVOjEe2KQc5QIsW97w')) {
			OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput newInput = minorInput as OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput;
			bool hasChanged = minoraAaCYMVOjEe2KQc5QIsW97wInput!=null?minoraAaCYMVOjEe2KQc5QIsW97wInput.inpusChanged(newInput):true;
			minoraAaCYMVOjEe2KQc5QIsW97wInput = newInput;
			if(componentaAaCYMVOjEe2KQc5QIsW97w != null) {
				componentaAaCYMVOjEe2KQc5QIsW97w.forEach((n)=>n.updateInputs(
					poffer:minoraAaCYMVOjEe2KQc5QIsW97wInput.offer
				));
				if(hasChanged) {
					componentaAaCYMVOjEe2KQc5QIsW97w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_Yuo5oVOlEe2KQc5QIsW97w')) {
			majoraYuo5oVOlEe2KQc5QIsW97wInput = majorInput as BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput;
			if(componentaYuo5oVOlEe2KQc5QIsW97w != null) {
				componentaYuo5oVOlEe2KQc5QIsW97w.forEach((n)=>n.updateInputs(
					pbidding:majoraYuo5oVOlEe2KQc5QIsW97wInput.bidding
				));
			}
		} else if(isVisible(minorSIB,'_Yuo5oVOlEe2KQc5QIsW97w')) {
			BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput newInput = minorInput as BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput;
			bool hasChanged = minoraYuo5oVOlEe2KQc5QIsW97wInput!=null?minoraYuo5oVOlEe2KQc5QIsW97wInput.inpusChanged(newInput):true;
			minoraYuo5oVOlEe2KQc5QIsW97wInput = newInput;
			if(componentaYuo5oVOlEe2KQc5QIsW97w != null) {
				componentaYuo5oVOlEe2KQc5QIsW97w.forEach((n)=>n.updateInputs(
					pbidding:minoraYuo5oVOlEe2KQc5QIsW97wInput.bidding
				));
				if(hasChanged) {
					componentaYuo5oVOlEe2KQc5QIsW97w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB UserArea of Process ShowUserArea
	// Branch Show offer
	void eventalsTZMVFQEe2J0bu3ffrh5wShow_offerTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forShow_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Show_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit offer
	void eventalsbVAVFQEe2J0bu3ffrh5wEdit_offerTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forEdit_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Edit_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Delete offer
	void eventalsiCsVFQEe2J0bu3ffrh5wDelete_offerTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forDelete_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Delete_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Show bidding
	void eventalspXcVFQEe2J0bu3ffrh5wShow_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forShow_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Show_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit bidding
	void eventalswsMVFQEe2J0bu3ffrh5wEdit_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forEdit_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Edit_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Delete bidding
	void eventals4oAVFQEe2J0bu3ffrh5wDelete_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forDelete_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Delete_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create offer
	void eventaMeLucVFREe2J0bu3ffrh5wCreate_offerTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forCreate_offerBranch(
			currentUser:map['currentUser'] as Data.User
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Create_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create bidding
	void eventaPXHDYVFREe2J0bu3ffrh5wCreate_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new UserArea_jIfqkVFOEe2J0bu3ffrh5wBranch.forCreate_biddingBranch(
			currentUser:map['currentUser'] as Data.User
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_jIfqkVFOEe2J0bu3ffrh5w',
			'Create_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB OfferDetails of Process ShowOfferDetails
	// Branch Show issue
	void eventaAaXvYVOjEe2KQc5QIsW97wShow_issueTrigger(Map<String,dynamic> map)
	{
		var result = new OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.forShow_issueBranch(
			issue:map['issue'] as Data.Issue
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_fcOIkVN8Ee2KQc5QIsW97w',
			'Show_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Resolve issue
	void eventaAaiHcVOjEe2KQc5QIsW97wResolve_issueTrigger(Map<String,dynamic> map)
	{
		var result = new OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.forResolve_issueBranch(
			issue:map['issue'] as Data.Issue
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_fcOIkVN8Ee2KQc5QIsW97w',
			'Resolve_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Unresolve issue
	void eventaAaqDQVOjEe2KQc5QIsW97wUnresolve_issueTrigger(Map<String,dynamic> map)
	{
		var result = new OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.forUnresolve_issueBranch(
			issue:map['issue'] as Data.Issue
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_fcOIkVN8Ee2KQc5QIsW97w',
			'Unresolve_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create issue
	void eventaAaxYAVOjEe2KQc5QIsW97wCreate_issueTrigger(Map<String,dynamic> map)
	{
		var result = new OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.forCreate_issueBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_fcOIkVN8Ee2KQc5QIsW97w',
			'Create_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaDXxNQVOmEe2KQc5QIsW97wBackTrigger(Map<String,dynamic> map)
	{
		var result = new OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_fcOIkVN8Ee2KQc5QIsW97w',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB BiddingDetails of Process ShowBiddingDetails
	// Branch Create issue
	void eventajZ9z61OlEe2KQc5QIsW97wCreate_issueTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.forCreate_issueBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_zSAVgVOjEe2KQc5QIsW97w',
			'Create_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Show issue
	void eventajZ9M2VOlEe2KQc5QIsW97wShow_issueTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.forShow_issueBranch(
			issue:map['issue'] as Data.Issue
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_zSAVgVOjEe2KQc5QIsW97w',
			'Show_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Resolve issue
	void eventajZ_45_a_lOlEe2KQc5QIsW97wResolve_issueTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.forResolve_issueBranch(
			issue:map['issue'] as Data.Issue
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_zSAVgVOjEe2KQc5QIsW97w',
			'Resolve_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Unresolve issue
	void eventajZ_45_a8VOlEe2KQc5QIsW97wUnresolve_issueTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.forUnresolve_issueBranch(
			issue:map['issue'] as Data.Issue
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_zSAVgVOjEe2KQc5QIsW97w',
			'Unresolve_issue/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaAfrl0VOmEe2KQc5QIsW97wBackTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_zSAVgVOjEe2KQc5QIsW97w',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}

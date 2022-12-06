// root ShowBrokerArea process combines all front end sibs reachable
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
import 'package:app/src/rest/gui/BrokerArea_dCbEMVFOEe2J0bu3ffrh5wInput.dart';
import 'package:app/src/rest/gui/BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.dart';
import 'package:app/src/gui/BrokerAreaadCbEMVFOEe2J0bu3ffrh5w.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.dart';
import 'package:app/src/gui/BiddingDetailsazSAVgVOjEe2KQc5QIsW97w.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.dart';
import 'package:app/src/gui/OfferDetailsafcOIkVN8Ee2KQc5QIsW97w.dart';
import 'package:app/src/rest/gui/EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpAInput.dart';
import 'package:app/src/rest/gui/EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpABranch.dart';
import 'package:app/src/gui/EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA.dart';
//NF model outputs

@Component(
  	selector: 'ShowBrokerArea-azgnP4FFLEe2Vgcav4Znc_w-process',
  	directives: const [
  		coreDirectives,login.Login,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process ShowBrokerArea -->
		<brokerarea-tag
			*ngIf="isVisible(majorSIB,'_fElJMVFOEe2J0bu3ffrh5w')"
			[offers]="majorafElJMVFOEe2J0bu3ffrh5wInput.offers"
			[approvedOffers]="majorafElJMVFOEe2J0bu3ffrh5wInput.approvedOffers"
			[biddings]="majorafElJMVFOEe2J0bu3ffrh5wInput.biddings"
			[guiId]="'_dCbEMVFOEe2J0bu3ffrh5w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionshowofferevent) = "eventaKvfysVGLEe2J0bu3ffrh5wShow_offerTrigger(\$event)"
			(actiondecideofferevent) = "eventaKvxfgVGLEe2J0bu3ffrh5wDecide_offerTrigger(\$event)"
			(actioneditreportevent) = "eventaKwFBgVGLEe2J0bu3ffrh5wEdit_reportTrigger(\$event)"
			(actionshowbiddingevent) = "eventaKwZKkVGLEe2J0bu3ffrh5wShow_biddingTrigger(\$event)"
			(actionassignevent) = "eventaKwi7kVGLEe2J0bu3ffrh5wAssignTrigger(\$event)"
			(actionunassignevent) = "eventaKwt6sVGLEe2J0bu3ffrh5wUnassignTrigger(\$event)"
			(actionreviewofferevent) = "eventakn_45_hsVGNEe2J0bu3ffrh5wReview_offerTrigger(\$event)"
			(actionrevokeofferevent) = "eventakoamkVGNEe2J0bu3ffrh5wRevoke_offerTrigger(\$event)"
			(actiondecidebiddingevent) = "eventako3SgVGNEe2J0bu3ffrh5wDecide_biddingTrigger(\$event)"
			(actionreviewbiddingevent) = "eventakpMCoVGNEe2J0bu3ffrh5wReview_biddingTrigger(\$event)"
			(actionrevokebiddingevent) = "eventakpeWgVGNEe2J0bu3ffrh5wRevoke_biddingTrigger(\$event)"
			(actioneditevent) = "eventaAxMsAVubEe2C_45_dvY0XUmpAEditTrigger(\$event)"
			(actionautoassignevent) = "eventah_45_5hgV_45_BEe2pr7wspri7wwAuto_AssignTrigger(\$event)"
		>
		</brokerarea-tag>
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
		<!-- Process EditAssignment -->
		<editassignment-tag
			*ngIf="isVisible(majorSIB,'_qeqTgVuZEe2C-dvY0XUmpA')"
			[bidding]="majoraqeqTgVuZEe2C_45_dvY0XUmpAInput.bidding"
			[guiId]="'_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionassignevent) = "eventaqzih4VuaEe2C_45_dvY0XUmpAAssignTrigger(\$event)"
			(actioncanceleditevent) = "eventanXt30Vw1Ee2gxcFkjyzH4gCancel_EditTrigger(\$event)"
		>
		</editassignment-tag>
	</template>
	'''
)
class ProcessazgnP4FFLEe2Vgcav4Znc_wComponent extends GUIProcess implements OnInit, OnChanges, AfterViewChecked {
	
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
	
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wInput majorafElJMVFOEe2J0bu3ffrh5wInput;
	BrokerArea_dCbEMVFOEe2J0bu3ffrh5wInput minorafElJMVFOEe2J0bu3ffrh5wInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput majoraYuo5oVOlEe2KQc5QIsW97wInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput minoraYuo5oVOlEe2KQc5QIsW97wInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput majoraAaCYMVOjEe2KQc5QIsW97wInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput minoraAaCYMVOjEe2KQc5QIsW97wInput;
	EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpAInput majoraqeqTgVuZEe2C_45_dvY0XUmpAInput;
	EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpAInput minoraqeqTgVuZEe2C_45_dvY0XUmpAInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process ShowBrokerArea
	// GUISIB BrokerArea
	@ViewChildren(BrokerAreaadCbEMVFOEe2J0bu3ffrh5w)
	List<BrokerAreaadCbEMVFOEe2J0bu3ffrh5w> componentafElJMVFOEe2J0bu3ffrh5w;
	// GUISIBs of Process ShowBiddingDetails
	// GUISIB BiddingDetails
	@ViewChildren(BiddingDetailsazSAVgVOjEe2KQc5QIsW97w)
	List<BiddingDetailsazSAVgVOjEe2KQc5QIsW97w> componentaYuo5oVOlEe2KQc5QIsW97w;
	// GUISIBs of Process ShowOfferDetails
	// GUISIB OfferDetails
	@ViewChildren(OfferDetailsafcOIkVN8Ee2KQc5QIsW97w)
	List<OfferDetailsafcOIkVN8Ee2KQc5QIsW97w> componentaAaCYMVOjEe2KQc5QIsW97w;
	// GUISIBs of Process EditAssignment
	// GUISIB EditAssignment
	@ViewChildren(EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA)
	List<EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA> componentaqeqTgVuZEe2C_45_dvY0XUmpA;
	
	ProcessazgnP4FFLEe2Vgcav4Znc_wComponent(this._processService,this._router,this._notificationService,AbstractRoutes routes): super(routes);

	@override
	ngOnInit() {
		reActivateProcess();
		started = true;
	}
	
	@override
	ngAfterViewChecked() {
	}
	
	void retry() {
		retryAfterLogin(_processService,"ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w",sibId:sibId);
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
		
		if(isVisible(majorSIB,'_fElJMVFOEe2J0bu3ffrh5w')) {
			majorafElJMVFOEe2J0bu3ffrh5wInput = majorInput as BrokerArea_dCbEMVFOEe2J0bu3ffrh5wInput;
			if(componentafElJMVFOEe2J0bu3ffrh5w != null) {
				componentafElJMVFOEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
					poffers:majorafElJMVFOEe2J0bu3ffrh5wInput.offers,
					papprovedOffers:majorafElJMVFOEe2J0bu3ffrh5wInput.approvedOffers,
					pbiddings:majorafElJMVFOEe2J0bu3ffrh5wInput.biddings
				));
			}
		} else if(isVisible(minorSIB,'_fElJMVFOEe2J0bu3ffrh5w')) {
			BrokerArea_dCbEMVFOEe2J0bu3ffrh5wInput newInput = minorInput as BrokerArea_dCbEMVFOEe2J0bu3ffrh5wInput;
			bool hasChanged = minorafElJMVFOEe2J0bu3ffrh5wInput!=null?minorafElJMVFOEe2J0bu3ffrh5wInput.inpusChanged(newInput):true;
			minorafElJMVFOEe2J0bu3ffrh5wInput = newInput;
			if(componentafElJMVFOEe2J0bu3ffrh5w != null) {
				componentafElJMVFOEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
					poffers:minorafElJMVFOEe2J0bu3ffrh5wInput.offers,
					papprovedOffers:minorafElJMVFOEe2J0bu3ffrh5wInput.approvedOffers,
					pbiddings:minorafElJMVFOEe2J0bu3ffrh5wInput.biddings
				));
				if(hasChanged) {
					componentafElJMVFOEe2J0bu3ffrh5w.forEach((n)=>n.restartComponent());			
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
		if(isVisible(majorSIB,'_qeqTgVuZEe2C-dvY0XUmpA')) {
			majoraqeqTgVuZEe2C_45_dvY0XUmpAInput = majorInput as EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpAInput;
			if(componentaqeqTgVuZEe2C_45_dvY0XUmpA != null) {
				componentaqeqTgVuZEe2C_45_dvY0XUmpA.forEach((n)=>n.updateInputs(
					pbidding:majoraqeqTgVuZEe2C_45_dvY0XUmpAInput.bidding
				));
			}
		} else if(isVisible(minorSIB,'_qeqTgVuZEe2C-dvY0XUmpA')) {
			EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpAInput newInput = minorInput as EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpAInput;
			bool hasChanged = minoraqeqTgVuZEe2C_45_dvY0XUmpAInput!=null?minoraqeqTgVuZEe2C_45_dvY0XUmpAInput.inpusChanged(newInput):true;
			minoraqeqTgVuZEe2C_45_dvY0XUmpAInput = newInput;
			if(componentaqeqTgVuZEe2C_45_dvY0XUmpA != null) {
				componentaqeqTgVuZEe2C_45_dvY0XUmpA.forEach((n)=>n.updateInputs(
					pbidding:minoraqeqTgVuZEe2C_45_dvY0XUmpAInput.bidding
				));
				if(hasChanged) {
					componentaqeqTgVuZEe2C_45_dvY0XUmpA.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB BrokerArea of Process ShowBrokerArea
	// Branch Show offer
	void eventaKvfysVGLEe2J0bu3ffrh5wShow_offerTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forShow_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Show_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Decide offer
	void eventaKvxfgVGLEe2J0bu3ffrh5wDecide_offerTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forDecide_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Decide_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit report
	void eventaKwFBgVGLEe2J0bu3ffrh5wEdit_reportTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forEdit_reportBranch(
			report:map['report'] as Data.Report
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Edit_report/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Show bidding
	void eventaKwZKkVGLEe2J0bu3ffrh5wShow_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forShow_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Show_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Assign
	void eventaKwi7kVGLEe2J0bu3ffrh5wAssignTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forAssignBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Assign/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Unassign
	void eventaKwt6sVGLEe2J0bu3ffrh5wUnassignTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forUnassignBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Unassign/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Review offer
	void eventakn_45_hsVGNEe2J0bu3ffrh5wReview_offerTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forReview_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Review_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Revoke offer
	void eventakoamkVGNEe2J0bu3ffrh5wRevoke_offerTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forRevoke_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Revoke_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Decide bidding
	void eventako3SgVGNEe2J0bu3ffrh5wDecide_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forDecide_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Decide_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Review bidding
	void eventakpMCoVGNEe2J0bu3ffrh5wReview_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forReview_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Review_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Revoke bidding
	void eventakpeWgVGNEe2J0bu3ffrh5wRevoke_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forRevoke_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Revoke_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit
	void eventaAxMsAVubEe2C_45_dvY0XUmpAEditTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forEditBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Edit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Auto Assign
	void eventah_45_5hgV_45_BEe2pr7wspri7wwAuto_AssignTrigger(Map<String,dynamic> map)
	{
		var result = new BrokerArea_dCbEMVFOEe2J0bu3ffrh5wBranch.forAuto_AssignBranch(
			approvedOffers:map['approvedOffers'] as DIMEList<Data.Offer>
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_dCbEMVFOEe2J0bu3ffrh5w',
			'Auto_Assign/branch/public',
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
	// Branches for GUISIB EditAssignment of Process EditAssignment
	// Branch Assign
	void eventaqzih4VuaEe2C_45_dvY0XUmpAAssignTrigger(Map<String,dynamic> map)
	{
		var result = new EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpABranch.forAssignBranch(
			thisBidding:map['thisBidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA',
			'Assign/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel Edit
	void eventanXt30Vw1Ee2gxcFkjyzH4gCancel_EditTrigger(Map<String,dynamic> map)
	{
		var result = new EditAssignment_mOjJMVuZEe2C_45_dvY0XUmpABranch.forCancel_EditBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA',
			'Cancel_Edit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}

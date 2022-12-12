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
import 'package:app/src/rest/gui/CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.dart';
import 'package:app/src/gui/CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw.dart';
import 'package:app/src/rest/gui/DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwBranch.dart';
import 'package:app/src/gui/DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw.dart';
import 'package:app/src/rest/gui/CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwBranch.dart';
import 'package:app/src/gui/CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw.dart';
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
  		coreDirectives,login.Login,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA,BrokerAreaadCbEMVFOEe2J0bu3ffrh5w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,EditAssignmentamOjJMVuZEe2C_45_dvY0XUmpA
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
			[showResolveButtons]="majoraYuo5oVOlEe2KQc5QIsW97wInput.showResolveButtons"
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
		<!-- Process ShowCreateIssueBidding -->
		<createissueform-tag
			*ngIf="isVisible(majorSIB,'_ot8yYWBQEe22r-rMCqBFnw')"
			[guiId]="'_qs8t8GAJEe2S6JM4Hx8SJw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventaouEuMWBQEe22r_45_rMCqBFnwSubmitTrigger(\$event)"
			(actionbackevent) = "eventaouioQWBQEe22r_45_rMCqBFnwBackTrigger(\$event)"
		>
		</createissueform-tag>
		<!-- Process ShowDetailsPage -->
		<detailspage-tag
			*ngIf="isVisible(majorSIB,'_432fEWBZEe22r-rMCqBFnw')"
			[issue]="majora432fEWBZEe22r_45_rMCqBFnwInput.issue"
			[guiId]="'_HVzS0GAMEe2S6JM4Hx8SJw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionaddnewcommentevent) = "eventa436JcWBZEe22r_45_rMCqBFnwAdd_new_CommentTrigger(\$event)"
			(actioneditevent) = "eventa437XkWBZEe22r_45_rMCqBFnwEditTrigger(\$event)"
			(actiondeleteevent) = "eventa439MwWBZEe22r_45_rMCqBFnwDeleteTrigger(\$event)"
			(actionbackevent) = "eventaUEF7AWBnEe22r_45_rMCqBFnwBackTrigger(\$event)"
		>
		</detailspage-tag>
		<!-- Process ShowAddNewComment -->
		<createcommentform-tag
			*ngIf="isVisible(majorSIB,'_OTSh8WDTEe22r-rMCqBFnw')"
			[guiId]="'_ovAusWAWEe2S6JM4Hx8SJw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventaOTZPoWDTEe22r_45_rMCqBFnwSubmitTrigger(\$event)"
			(actionbackevent) = "eventaOTq8cWDTEe22r_45_rMCqBFnwBackTrigger(\$event)"
		>
		</createcommentform-tag>
		<!-- Process ShowEditComment -->
		<createcommentform-tag
			*ngIf="isVisible(majorSIB,'_BXlEAWDUEe22r-rMCqBFnw')"
			[comment]="majoraBXlEAWDUEe22r_45_rMCqBFnwInput.comment"
			[guiId]="'_ovAusWAWEe2S6JM4Hx8SJw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventaBXp8gWDUEe22r_45_rMCqBFnwSubmitTrigger(\$event)"
			(actionbackevent) = "eventaBXu1AWDUEe22r_45_rMCqBFnwBackTrigger(\$event)"
		>
		</createcommentform-tag>
		<!-- Process ShowOfferDetails -->
		<offerdetails-tag
			*ngIf="isVisible(majorSIB,'_AaCYMVOjEe2KQc5QIsW97w')"
			[offer]="majoraAaCYMVOjEe2KQc5QIsW97wInput.offer"
			[showResolveButtons]="majoraAaCYMVOjEe2KQc5QIsW97wInput.showResolveButtons"
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
		<!-- Process ShowCreateIssueOffer -->
		<createissueform-tag
			*ngIf="isVisible(majorSIB,'_ohLoEWBYEe22r-rMCqBFnw')"
			[guiId]="'_qs8t8GAJEe2S6JM4Hx8SJw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventaohNdQWBYEe22r_45_rMCqBFnwSubmitTrigger(\$event)"
			(actionbackevent) = "eventaohP5gWBYEe22r_45_rMCqBFnwBackTrigger(\$event)"
		>
		</createissueform-tag>
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
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput majoraot8yYWBQEe22r_45_rMCqBFnwInput;
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput minoraot8yYWBQEe22r_45_rMCqBFnwInput;
	DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput majora432fEWBZEe22r_45_rMCqBFnwInput;
	DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput minora432fEWBZEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput majoraOTSh8WDTEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput minoraOTSh8WDTEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput majoraBXlEAWDUEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput minoraBXlEAWDUEe22r_45_rMCqBFnwInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput majoraAaCYMVOjEe2KQc5QIsW97wInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput minoraAaCYMVOjEe2KQc5QIsW97wInput;
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput majoraohLoEWBYEe22r_45_rMCqBFnwInput;
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput minoraohLoEWBYEe22r_45_rMCqBFnwInput;
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
	// GUISIBs of Process ShowCreateIssueBidding
	// GUISIB CreateIssueForm
	@ViewChildren(CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw)
	List<CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw> componentaot8yYWBQEe22r_45_rMCqBFnw;
	// GUISIBs of Process ShowDetailsPage
	// GUISIB DetailsPage
	@ViewChildren(DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw)
	List<DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw> componenta432fEWBZEe22r_45_rMCqBFnw;
	// GUISIBs of Process ShowAddNewComment
	// GUISIB CreateCommentForm
	@ViewChildren(CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw)
	List<CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw> componentaOTSh8WDTEe22r_45_rMCqBFnw;
	// GUISIBs of Process ShowEditComment
	// GUISIB CreateCommentForm
	@ViewChildren(CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw)
	List<CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw> componentaBXlEAWDUEe22r_45_rMCqBFnw;
	// GUISIBs of Process ShowOfferDetails
	// GUISIB OfferDetails
	@ViewChildren(OfferDetailsafcOIkVN8Ee2KQc5QIsW97w)
	List<OfferDetailsafcOIkVN8Ee2KQc5QIsW97w> componentaAaCYMVOjEe2KQc5QIsW97w;
	// GUISIBs of Process ShowCreateIssueOffer
	// GUISIB CreateIssueForm
	@ViewChildren(CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw)
	List<CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw> componentaohLoEWBYEe22r_45_rMCqBFnw;
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
					pbidding:majoraYuo5oVOlEe2KQc5QIsW97wInput.bidding,
					pshowResolveButtons:majoraYuo5oVOlEe2KQc5QIsW97wInput.showResolveButtons
				));
			}
		} else if(isVisible(minorSIB,'_Yuo5oVOlEe2KQc5QIsW97w')) {
			BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput newInput = minorInput as BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput;
			bool hasChanged = minoraYuo5oVOlEe2KQc5QIsW97wInput!=null?minoraYuo5oVOlEe2KQc5QIsW97wInput.inpusChanged(newInput):true;
			minoraYuo5oVOlEe2KQc5QIsW97wInput = newInput;
			if(componentaYuo5oVOlEe2KQc5QIsW97w != null) {
				componentaYuo5oVOlEe2KQc5QIsW97w.forEach((n)=>n.updateInputs(
					pbidding:minoraYuo5oVOlEe2KQc5QIsW97wInput.bidding,
					pshowResolveButtons:minoraYuo5oVOlEe2KQc5QIsW97wInput.showResolveButtons
				));
				if(hasChanged) {
					componentaYuo5oVOlEe2KQc5QIsW97w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_ot8yYWBQEe22r-rMCqBFnw')) {
			majoraot8yYWBQEe22r_45_rMCqBFnwInput = majorInput as CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput;
			if(componentaot8yYWBQEe22r_45_rMCqBFnw != null) {
				componentaot8yYWBQEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_ot8yYWBQEe22r-rMCqBFnw')) {
			CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput newInput = minorInput as CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput;
			bool hasChanged = minoraot8yYWBQEe22r_45_rMCqBFnwInput!=null?minoraot8yYWBQEe22r_45_rMCqBFnwInput.inpusChanged(newInput):true;
			minoraot8yYWBQEe22r_45_rMCqBFnwInput = newInput;
			if(componentaot8yYWBQEe22r_45_rMCqBFnw != null) {
				componentaot8yYWBQEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaot8yYWBQEe22r_45_rMCqBFnw.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_432fEWBZEe22r-rMCqBFnw')) {
			majora432fEWBZEe22r_45_rMCqBFnwInput = majorInput as DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput;
			if(componenta432fEWBZEe22r_45_rMCqBFnw != null) {
				componenta432fEWBZEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
					pissue:majora432fEWBZEe22r_45_rMCqBFnwInput.issue
				));
			}
		} else if(isVisible(minorSIB,'_432fEWBZEe22r-rMCqBFnw')) {
			DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput newInput = minorInput as DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput;
			bool hasChanged = minora432fEWBZEe22r_45_rMCqBFnwInput!=null?minora432fEWBZEe22r_45_rMCqBFnwInput.inpusChanged(newInput):true;
			minora432fEWBZEe22r_45_rMCqBFnwInput = newInput;
			if(componenta432fEWBZEe22r_45_rMCqBFnw != null) {
				componenta432fEWBZEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
					pissue:minora432fEWBZEe22r_45_rMCqBFnwInput.issue
				));
				if(hasChanged) {
					componenta432fEWBZEe22r_45_rMCqBFnw.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_OTSh8WDTEe22r-rMCqBFnw')) {
			majoraOTSh8WDTEe22r_45_rMCqBFnwInput = majorInput as CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput;
			if(componentaOTSh8WDTEe22r_45_rMCqBFnw != null) {
				componentaOTSh8WDTEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
					pcomment:majoraOTSh8WDTEe22r_45_rMCqBFnwInput.comment
				));
			}
		} else if(isVisible(minorSIB,'_OTSh8WDTEe22r-rMCqBFnw')) {
			CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput newInput = minorInput as CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput;
			bool hasChanged = minoraOTSh8WDTEe22r_45_rMCqBFnwInput!=null?minoraOTSh8WDTEe22r_45_rMCqBFnwInput.inpusChanged(newInput):true;
			minoraOTSh8WDTEe22r_45_rMCqBFnwInput = newInput;
			if(componentaOTSh8WDTEe22r_45_rMCqBFnw != null) {
				componentaOTSh8WDTEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
					pcomment:minoraOTSh8WDTEe22r_45_rMCqBFnwInput.comment
				));
				if(hasChanged) {
					componentaOTSh8WDTEe22r_45_rMCqBFnw.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_BXlEAWDUEe22r-rMCqBFnw')) {
			majoraBXlEAWDUEe22r_45_rMCqBFnwInput = majorInput as CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput;
			if(componentaBXlEAWDUEe22r_45_rMCqBFnw != null) {
				componentaBXlEAWDUEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
					pcomment:majoraBXlEAWDUEe22r_45_rMCqBFnwInput.comment
				));
			}
		} else if(isVisible(minorSIB,'_BXlEAWDUEe22r-rMCqBFnw')) {
			CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput newInput = minorInput as CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput;
			bool hasChanged = minoraBXlEAWDUEe22r_45_rMCqBFnwInput!=null?minoraBXlEAWDUEe22r_45_rMCqBFnwInput.inpusChanged(newInput):true;
			minoraBXlEAWDUEe22r_45_rMCqBFnwInput = newInput;
			if(componentaBXlEAWDUEe22r_45_rMCqBFnw != null) {
				componentaBXlEAWDUEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
					pcomment:minoraBXlEAWDUEe22r_45_rMCqBFnwInput.comment
				));
				if(hasChanged) {
					componentaBXlEAWDUEe22r_45_rMCqBFnw.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_AaCYMVOjEe2KQc5QIsW97w')) {
			majoraAaCYMVOjEe2KQc5QIsW97wInput = majorInput as OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput;
			if(componentaAaCYMVOjEe2KQc5QIsW97w != null) {
				componentaAaCYMVOjEe2KQc5QIsW97w.forEach((n)=>n.updateInputs(
					poffer:majoraAaCYMVOjEe2KQc5QIsW97wInput.offer,
					pshowResolveButtons:majoraAaCYMVOjEe2KQc5QIsW97wInput.showResolveButtons
				));
			}
		} else if(isVisible(minorSIB,'_AaCYMVOjEe2KQc5QIsW97w')) {
			OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput newInput = minorInput as OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput;
			bool hasChanged = minoraAaCYMVOjEe2KQc5QIsW97wInput!=null?minoraAaCYMVOjEe2KQc5QIsW97wInput.inpusChanged(newInput):true;
			minoraAaCYMVOjEe2KQc5QIsW97wInput = newInput;
			if(componentaAaCYMVOjEe2KQc5QIsW97w != null) {
				componentaAaCYMVOjEe2KQc5QIsW97w.forEach((n)=>n.updateInputs(
					poffer:minoraAaCYMVOjEe2KQc5QIsW97wInput.offer,
					pshowResolveButtons:minoraAaCYMVOjEe2KQc5QIsW97wInput.showResolveButtons
				));
				if(hasChanged) {
					componentaAaCYMVOjEe2KQc5QIsW97w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_ohLoEWBYEe22r-rMCqBFnw')) {
			majoraohLoEWBYEe22r_45_rMCqBFnwInput = majorInput as CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput;
			if(componentaohLoEWBYEe22r_45_rMCqBFnw != null) {
				componentaohLoEWBYEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_ohLoEWBYEe22r-rMCqBFnw')) {
			CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput newInput = minorInput as CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput;
			bool hasChanged = minoraohLoEWBYEe22r_45_rMCqBFnwInput!=null?minoraohLoEWBYEe22r_45_rMCqBFnwInput.inpusChanged(newInput):true;
			minoraohLoEWBYEe22r_45_rMCqBFnwInput = newInput;
			if(componentaohLoEWBYEe22r_45_rMCqBFnw != null) {
				componentaohLoEWBYEe22r_45_rMCqBFnw.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaohLoEWBYEe22r_45_rMCqBFnw.forEach((n)=>n.restartComponent());			
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
	// Branches for GUISIB CreateIssueForm of Process ShowCreateIssueBidding
	// Branch Submit
	void eventaouEuMWBQEe22r_45_rMCqBFnwSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.forSubmitBranch(
			title:map['title']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_qs8t8GAJEe2S6JM4Hx8SJw',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaouioQWBQEe22r_45_rMCqBFnwBackTrigger(Map<String,dynamic> map)
	{
		var result = new CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_qs8t8GAJEe2S6JM4Hx8SJw',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB DetailsPage of Process ShowDetailsPage
	// Branch Add new Comment
	void eventa436JcWBZEe22r_45_rMCqBFnwAdd_new_CommentTrigger(Map<String,dynamic> map)
	{
		var result = new DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwBranch.forAdd_new_CommentBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_HVzS0GAMEe2S6JM4Hx8SJw',
			'Add_new_Comment/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit
	void eventa437XkWBZEe22r_45_rMCqBFnwEditTrigger(Map<String,dynamic> map)
	{
		var result = new DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwBranch.forEditBranch(
			comment:map['comment'] as Data.Comment
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_HVzS0GAMEe2S6JM4Hx8SJw',
			'Edit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Delete
	void eventa439MwWBZEe22r_45_rMCqBFnwDeleteTrigger(Map<String,dynamic> map)
	{
		var result = new DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwBranch.forDeleteBranch(
			comment:map['comment'] as Data.Comment
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_HVzS0GAMEe2S6JM4Hx8SJw',
			'Delete/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaUEF7AWBnEe22r_45_rMCqBFnwBackTrigger(Map<String,dynamic> map)
	{
		var result = new DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_HVzS0GAMEe2S6JM4Hx8SJw',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB CreateCommentForm of Process ShowAddNewComment
	// Branch Submit
	void eventaOTZPoWDTEe22r_45_rMCqBFnwSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwBranch.forSubmitBranch(
			comment:map['comment']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ovAusWAWEe2S6JM4Hx8SJw',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaOTq8cWDTEe22r_45_rMCqBFnwBackTrigger(Map<String,dynamic> map)
	{
		var result = new CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ovAusWAWEe2S6JM4Hx8SJw',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB CreateCommentForm of Process ShowEditComment
	// Branch Submit
	void eventaBXp8gWDUEe22r_45_rMCqBFnwSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwBranch.forSubmitBranch(
			comment:map['comment']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ovAusWAWEe2S6JM4Hx8SJw',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaBXu1AWDUEe22r_45_rMCqBFnwBackTrigger(Map<String,dynamic> map)
	{
		var result = new CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ovAusWAWEe2S6JM4Hx8SJw',
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
	// Branches for GUISIB CreateIssueForm of Process ShowCreateIssueOffer
	// Branch Submit
	void eventaohNdQWBYEe22r_45_rMCqBFnwSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.forSubmitBranch(
			title:map['title']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_qs8t8GAJEe2S6JM4Hx8SJw',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventaohP5gWBYEe22r_45_rMCqBFnwBackTrigger(Map<String,dynamic> map)
	{
		var result = new CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_qs8t8GAJEe2S6JM4Hx8SJw',
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

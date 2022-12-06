// root ShowAdminArea process combines all front end sibs reachable
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
import 'package:app/src/rest/gui/AdminArea_YggYMVFOEe2J0bu3ffrh5wInput.dart';
import 'package:app/src/rest/gui/AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.dart';
import 'package:app/src/gui/AdminAreaaYggYMVFOEe2J0bu3ffrh5w.dart';
import 'package:app/src/rest/gui/FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQInput.dart';
import 'package:app/src/rest/gui/FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQBranch.dart';
import 'package:app/src/gui/FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ.dart';
import 'package:app/src/rest/gui/DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput.dart';
import 'package:app/src/rest/gui/DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.dart';
import 'package:app/src/gui/DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wBranch.dart';
import 'package:app/src/gui/OfferDetailsafcOIkVN8Ee2KQc5QIsW97w.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.dart';
import 'package:app/src/gui/BiddingDetailsazSAVgVOjEe2KQc5QIsW97w.dart';
import 'package:app/src/rest/gui/FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput.dart';
import 'package:app/src/rest/gui/FeatureForm_OXlYQVuSEe2nXJXMw4vrvgBranch.dart';
import 'package:app/src/gui/FeatureFormaOXlYQVuSEe2nXJXMw4vrvg.dart';
import 'package:app/src/rest/gui/EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gInput.dart';
import 'package:app/src/rest/gui/EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gBranch.dart';
import 'package:app/src/gui/EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g.dart';
import 'package:app/src/rest/gui/UserForm_BDkd8F3WEe2t19MJLPzxmgInput.dart';
import 'package:app/src/rest/gui/UserForm_BDkd8F3WEe2t19MJLPzxmgBranch.dart';
import 'package:app/src/gui/UserFormaBDkd8F3WEe2t19MJLPzxmg.dart';
import 'package:app/src/rest/gui/EditUserForm_CPN5EWBEEe2RjrkbQARhdgInput.dart';
import 'package:app/src/rest/gui/EditUserForm_CPN5EWBEEe2RjrkbQARhdgBranch.dart';
import 'package:app/src/gui/EditUserFormaCPN5EWBEEe2RjrkbQARhdg.dart';
//NF model outputs

@Component(
  	selector: 'ShowAdminArea-arHwukVFLEe2Vgcav4Znc_w-process',
  	directives: const [
  		coreDirectives,login.Login,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg,AdminAreaaYggYMVFOEe2J0bu3ffrh5w,FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ,DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,FeatureFormaOXlYQVuSEe2nXJXMw4vrvg,EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g,UserFormaBDkd8F3WEe2t19MJLPzxmg,EditUserFormaCPN5EWBEEe2RjrkbQARhdg
  	],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<template [ngIf]="!showLogin">
		<!-- Process ShowAdminArea -->
		<adminarea-tag
			*ngIf="isVisible(majorSIB,'_ZewJIVFOEe2J0bu3ffrh5w')"
			[featuresForOffer]="majoraZewJIVFOEe2J0bu3ffrh5wInput.featuresForOffer"
			[featuresForBidding]="majoraZewJIVFOEe2J0bu3ffrh5wInput.featuresForBidding"
			[users]="majoraZewJIVFOEe2J0bu3ffrh5wInput.users"
			[offers]="majoraZewJIVFOEe2J0bu3ffrh5wInput.offers"
			[biddings]="majoraZewJIVFOEe2J0bu3ffrh5wInput.biddings"
			[guiId]="'_YggYMVFOEe2J0bu3ffrh5w'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actioncreateofferfeatureevent) = "eventajx7GIVLPEe2djpkPxa2Z3QCreate_offer_featureTrigger(\$event)"
			(actioncreatebiddingfeatureevent) = "eventajx_45_JcVLPEe2djpkPxa2Z3QCreate_bidding_featureTrigger(\$event)"
			(actioneditfeatureevent) = "eventaxymyoVLPEe2djpkPxa2Z3QEdit_featureTrigger(\$event)"
			(actiondeletefeatureevent) = "eventaxyrEEVLPEe2djpkPxa2Z3QDelete_featureTrigger(\$event)"
			(actionedituserevent) = "eventa5mWyEVLrEe2djpkPxa2Z3QEdit_userTrigger(\$event)"
			(actiondeleteuserevent) = "eventa5mk0gVLrEe2djpkPxa2Z3QDelete_userTrigger(\$event)"
			(actioncreateuserevent) = "eventa5my28VLrEe2djpkPxa2Z3QCreate_userTrigger(\$event)"
			(actionshowofferevent) = "eventa5m49kVLrEe2djpkPxa2Z3QShow_offerTrigger(\$event)"
			(actioneditofferevent) = "eventa5nIOIVLrEe2djpkPxa2Z3QEdit_offerTrigger(\$event)"
			(actiondeleteofferevent) = "eventa5nYs0VLrEe2djpkPxa2Z3QDelete_offerTrigger(\$event)"
			(actionshowbiddingevent) = "eventa5nrAsVLrEe2djpkPxa2Z3QShow_biddingTrigger(\$event)"
			(actioneditbiddingevent) = "eventa5n9UkVLrEe2djpkPxa2Z3QEdit_biddingTrigger(\$event)"
			(actiondeletebiddingevent) = "eventa5oQPgVLrEe2djpkPxa2Z3QDelete_biddingTrigger(\$event)"
			(actiondetailsevent) = "eventaTWLCwXVoEe2_CvdRyEmMCQDetailsTrigger(\$event)"
		>
		</adminarea-tag>
		<featuredetails-tag
			*ngIf="isVisible(majorSIB,'_U-x_UXVoEe2_CvdRyEmMCQ')"
			[feature]="majoraU_45_x_UXVoEe2_CvdRyEmMCQInput.feature"
			[guiId]="'_ptsfcWEREe2Fx80Lw9BAUQ'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionexitevent) = "eventaU_LA4XVoEe2_CvdRyEmMCQExitTrigger(\$event)"
		>
		</featuredetails-tag>
		<deletefeature-tag
			*ngIf="isVisible(majorSIB,'_EGVmEXVpEe2_CvdRyEmMCQ')"
			[guiId]="'_VDMMEVt7Ee20aa7PI0XDWg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionconfirmdeleteevent) = "eventaEGglMXVpEe2_CvdRyEmMCQConfirm_DeleteTrigger(\$event)"
			(actioncancelevent) = "eventaEGq9QXVpEe2_CvdRyEmMCQCancelTrigger(\$event)"
		>
		</deletefeature-tag>
		<deletefeature-tag
			*ngIf="isVisible(majorSIB,'_kAAQ4XVqEe2_CvdRyEmMCQ')"
			[guiId]="'_VDMMEVt7Ee20aa7PI0XDWg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionconfirmdeleteevent) = "eventakAMeIXVqEe2_CvdRyEmMCQConfirm_DeleteTrigger(\$event)"
			(actioncancelevent) = "eventakAYrYXVqEe2_CvdRyEmMCQCancelTrigger(\$event)"
		>
		</deletefeature-tag>
		<deletefeature-tag
			*ngIf="isVisible(majorSIB,'_j8aU4XVrEe2_CvdRyEmMCQ')"
			[guiId]="'_VDMMEVt7Ee20aa7PI0XDWg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionconfirmdeleteevent) = "eventaj8raoXVrEe2_CvdRyEmMCQConfirm_DeleteTrigger(\$event)"
			(actioncancelevent) = "eventaj86EIXVrEe2_CvdRyEmMCQCancelTrigger(\$event)"
		>
		</deletefeature-tag>
		<deletefeature-tag
			*ngIf="isVisible(majorSIB,'_GqNwsXVsEe2_CvdRyEmMCQ')"
			[guiId]="'_VDMMEVt7Ee20aa7PI0XDWg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionconfirmdeleteevent) = "eventaGqdoUXVsEe2_CvdRyEmMCQConfirm_DeleteTrigger(\$event)"
			(actioncancelevent) = "eventaGqs44XVsEe2_CvdRyEmMCQCancelTrigger(\$event)"
		>
		</deletefeature-tag>
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
		<!-- Process ShowCreateOfferFeature -->
		<featureform-tag
			*ngIf="isVisible(majorSIB,'_3nKNEVuUEe2nXJXMw4vrvg')"
			[priorities]="majora3nKNEVuUEe2nXJXMw4vrvgInput.priorities"
			[guiId]="'_OXlYQVuSEe2nXJXMw4vrvg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventa3nUlIVuUEe2nXJXMw4vrvgSubmitTrigger(\$event)"
			(actioncancelevent) = "eventaZBTBkVuVEe2nXJXMw4vrvgCancelTrigger(\$event)"
		>
		</featureform-tag>
		<!-- Process ShowCreateBiddingFeature -->
		<featureform-tag
			*ngIf="isVisible(majorSIB,'_5m6o41uVEe2nXJXMw4vrvg')"
			[priorities]="majora5m6o41uVEe2nXJXMw4vrvgInput.priorities"
			[guiId]="'_OXlYQVuSEe2nXJXMw4vrvg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actioncancelevent) = "eventa5m7P_45_FuVEe2nXJXMw4vrvgCancelTrigger(\$event)"
			(actionsubmitevent) = "eventa5m2_45_h1uVEe2nXJXMw4vrvgSubmitTrigger(\$event)"
		>
		</featureform-tag>
		<!-- Process EditFeature -->
		<editfeatureform-tag
			*ngIf="isVisible(majorSIB,'_HW6tsFuZEe28kPQ81TnB9g')"
			[title]="majoraHW6tsFuZEe28kPQ81TnB9gInput.title"
			[feature]="majoraHW6tsFuZEe28kPQ81TnB9gInput.feature"
			[priorities]="majoraHW6tsFuZEe28kPQ81TnB9gInput.priorities"
			[priority]="majoraHW6tsFuZEe28kPQ81TnB9gInput.priority"
			[guiId]="'___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventaHXEesVuZEe28kPQ81TnB9gSubmitTrigger(\$event)"
			(actioncancelevent) = "eventaHXRTAVuZEe28kPQ81TnB9gCancelTrigger(\$event)"
		>
		</editfeatureform-tag>
		<!-- Process ShowCreateUser -->
		<userform-tag
			*ngIf="isVisible(majorSIB,'_6cS9EV3XEe2t19MJLPzxmg')"
			[userRoles]="majora6cS9EV3XEe2t19MJLPzxmgInput.userRoles"
			[guiId]="'_BDkd8F3WEe2t19MJLPzxmg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventa6ci0sV3XEe2t19MJLPzxmgSubmitTrigger(\$event)"
			(actioncancelevent) = "eventa6dJ4sV3XEe2t19MJLPzxmgCancelTrigger(\$event)"
		>
		</userform-tag>
		<!-- Process ShowEditUser -->
		<edituserform-tag
			*ngIf="isVisible(majorSIB,'_r7eUwWBEEe2RjrkbQARhdg')"
			[currentUser]="majorar7eUwWBEEe2RjrkbQARhdgInput.currentUser"
			[lastName]="majorar7eUwWBEEe2RjrkbQARhdgInput.lastName"
			[firstName]="majorar7eUwWBEEe2RjrkbQARhdgInput.firstName"
			[userRoles]="majorar7eUwWBEEe2RjrkbQARhdgInput.userRoles"
			[userRole]="majorar7eUwWBEEe2RjrkbQARhdgInput.userRole"
			[guiId]="'_CPN5EWBEEe2RjrkbQARhdg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventar706EWBEEe2RjrkbQARhdgSubmitTrigger(\$event)"
			(actioncancelevent) = "eventar79c8WBEEe2RjrkbQARhdgCancelTrigger(\$event)"
		>
		</edituserform-tag>
	</template>
	'''
)
class ProcessarHwukVFLEe2Vgcav4Znc_wComponent extends GUIProcess implements OnInit, OnChanges, AfterViewChecked {
	
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
	
	AdminArea_YggYMVFOEe2J0bu3ffrh5wInput majoraZewJIVFOEe2J0bu3ffrh5wInput;
	AdminArea_YggYMVFOEe2J0bu3ffrh5wInput minoraZewJIVFOEe2J0bu3ffrh5wInput;
	FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQInput majoraU_45_x_UXVoEe2_CvdRyEmMCQInput;
	FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQInput minoraU_45_x_UXVoEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput majoraEGVmEXVpEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput minoraEGVmEXVpEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput majorakAAQ4XVqEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput minorakAAQ4XVqEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput majoraj8aU4XVrEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput minoraj8aU4XVrEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput majoraGqNwsXVsEe2_CvdRyEmMCQInput;
	DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput minoraGqNwsXVsEe2_CvdRyEmMCQInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput majoraAaCYMVOjEe2KQc5QIsW97wInput;
	OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput minoraAaCYMVOjEe2KQc5QIsW97wInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput majoraYuo5oVOlEe2KQc5QIsW97wInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput minoraYuo5oVOlEe2KQc5QIsW97wInput;
	FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput majora3nKNEVuUEe2nXJXMw4vrvgInput;
	FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput minora3nKNEVuUEe2nXJXMw4vrvgInput;
	FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput majora5m6o41uVEe2nXJXMw4vrvgInput;
	FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput minora5m6o41uVEe2nXJXMw4vrvgInput;
	EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gInput majoraHW6tsFuZEe28kPQ81TnB9gInput;
	EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gInput minoraHW6tsFuZEe28kPQ81TnB9gInput;
	UserForm_BDkd8F3WEe2t19MJLPzxmgInput majora6cS9EV3XEe2t19MJLPzxmgInput;
	UserForm_BDkd8F3WEe2t19MJLPzxmgInput minora6cS9EV3XEe2t19MJLPzxmgInput;
	EditUserForm_CPN5EWBEEe2RjrkbQARhdgInput majorar7eUwWBEEe2RjrkbQARhdgInput;
	EditUserForm_CPN5EWBEEe2RjrkbQARhdgInput minorar7eUwWBEEe2RjrkbQARhdgInput;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final NotificationService _notificationService;
	
	
	// GUISIBs of Process ShowAdminArea
	// GUISIB AdminArea
	@ViewChildren(AdminAreaaYggYMVFOEe2J0bu3ffrh5w)
	List<AdminAreaaYggYMVFOEe2J0bu3ffrh5w> componentaZewJIVFOEe2J0bu3ffrh5w;
	// GUISIBs of Process ShowAdminArea
	// GUISIB FeatureDetails
	@ViewChildren(FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ)
	List<FeatureDetailsaptsfcWEREe2Fx80Lw9BAUQ> componentaU_45_x_UXVoEe2_CvdRyEmMCQ;
	// GUISIBs of Process ShowAdminArea
	// GUISIB DeleteFeature
	@ViewChildren(DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg)
	List<DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg> componentaEGVmEXVpEe2_CvdRyEmMCQ;
	// GUISIBs of Process ShowAdminArea
	// GUISIB DeleteFeature
	@ViewChildren(DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg)
	List<DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg> componentakAAQ4XVqEe2_CvdRyEmMCQ;
	// GUISIBs of Process ShowAdminArea
	// GUISIB DeleteFeature
	@ViewChildren(DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg)
	List<DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg> componentaj8aU4XVrEe2_CvdRyEmMCQ;
	// GUISIBs of Process ShowAdminArea
	// GUISIB DeleteFeature
	@ViewChildren(DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg)
	List<DeleteFeatureaVDMMEVt7Ee20aa7PI0XDWg> componentaGqNwsXVsEe2_CvdRyEmMCQ;
	// GUISIBs of Process ShowOfferDetails
	// GUISIB OfferDetails
	@ViewChildren(OfferDetailsafcOIkVN8Ee2KQc5QIsW97w)
	List<OfferDetailsafcOIkVN8Ee2KQc5QIsW97w> componentaAaCYMVOjEe2KQc5QIsW97w;
	// GUISIBs of Process ShowBiddingDetails
	// GUISIB BiddingDetails
	@ViewChildren(BiddingDetailsazSAVgVOjEe2KQc5QIsW97w)
	List<BiddingDetailsazSAVgVOjEe2KQc5QIsW97w> componentaYuo5oVOlEe2KQc5QIsW97w;
	// GUISIBs of Process ShowCreateOfferFeature
	// GUISIB FeatureForm
	@ViewChildren(FeatureFormaOXlYQVuSEe2nXJXMw4vrvg)
	List<FeatureFormaOXlYQVuSEe2nXJXMw4vrvg> componenta3nKNEVuUEe2nXJXMw4vrvg;
	// GUISIBs of Process ShowCreateBiddingFeature
	// GUISIB FeatureForm
	@ViewChildren(FeatureFormaOXlYQVuSEe2nXJXMw4vrvg)
	List<FeatureFormaOXlYQVuSEe2nXJXMw4vrvg> componenta5m6o41uVEe2nXJXMw4vrvg;
	// GUISIBs of Process EditFeature
	// GUISIB EditFeatureForm
	@ViewChildren(EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g)
	List<EditFeatureForma_45_UC0cVuXEe28kPQ81TnB9g> componentaHW6tsFuZEe28kPQ81TnB9g;
	// GUISIBs of Process ShowCreateUser
	// GUISIB UserForm
	@ViewChildren(UserFormaBDkd8F3WEe2t19MJLPzxmg)
	List<UserFormaBDkd8F3WEe2t19MJLPzxmg> componenta6cS9EV3XEe2t19MJLPzxmg;
	// GUISIBs of Process ShowEditUser
	// GUISIB EditUserForm
	@ViewChildren(EditUserFormaCPN5EWBEEe2RjrkbQARhdg)
	List<EditUserFormaCPN5EWBEEe2RjrkbQARhdg> componentar7eUwWBEEe2RjrkbQARhdg;
	
	ProcessarHwukVFLEe2Vgcav4Znc_wComponent(this._processService,this._router,this._notificationService,AbstractRoutes routes): super(routes);

	@override
	ngOnInit() {
		reActivateProcess();
		started = true;
	}
	
	@override
	ngAfterViewChecked() {
	}
	
	void retry() {
		retryAfterLogin(_processService,"ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w",sibId:sibId);
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
		
		if(isVisible(majorSIB,'_ZewJIVFOEe2J0bu3ffrh5w')) {
			majoraZewJIVFOEe2J0bu3ffrh5wInput = majorInput as AdminArea_YggYMVFOEe2J0bu3ffrh5wInput;
			if(componentaZewJIVFOEe2J0bu3ffrh5w != null) {
				componentaZewJIVFOEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
					pfeaturesForOffer:majoraZewJIVFOEe2J0bu3ffrh5wInput.featuresForOffer,
					pfeaturesForBidding:majoraZewJIVFOEe2J0bu3ffrh5wInput.featuresForBidding,
					pusers:majoraZewJIVFOEe2J0bu3ffrh5wInput.users,
					poffers:majoraZewJIVFOEe2J0bu3ffrh5wInput.offers,
					pbiddings:majoraZewJIVFOEe2J0bu3ffrh5wInput.biddings
				));
			}
		} else if(isVisible(minorSIB,'_ZewJIVFOEe2J0bu3ffrh5w')) {
			AdminArea_YggYMVFOEe2J0bu3ffrh5wInput newInput = minorInput as AdminArea_YggYMVFOEe2J0bu3ffrh5wInput;
			bool hasChanged = minoraZewJIVFOEe2J0bu3ffrh5wInput!=null?minoraZewJIVFOEe2J0bu3ffrh5wInput.inpusChanged(newInput):true;
			minoraZewJIVFOEe2J0bu3ffrh5wInput = newInput;
			if(componentaZewJIVFOEe2J0bu3ffrh5w != null) {
				componentaZewJIVFOEe2J0bu3ffrh5w.forEach((n)=>n.updateInputs(
					pfeaturesForOffer:minoraZewJIVFOEe2J0bu3ffrh5wInput.featuresForOffer,
					pfeaturesForBidding:minoraZewJIVFOEe2J0bu3ffrh5wInput.featuresForBidding,
					pusers:minoraZewJIVFOEe2J0bu3ffrh5wInput.users,
					poffers:minoraZewJIVFOEe2J0bu3ffrh5wInput.offers,
					pbiddings:minoraZewJIVFOEe2J0bu3ffrh5wInput.biddings
				));
				if(hasChanged) {
					componentaZewJIVFOEe2J0bu3ffrh5w.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_U-x_UXVoEe2_CvdRyEmMCQ')) {
			majoraU_45_x_UXVoEe2_CvdRyEmMCQInput = majorInput as FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQInput;
			if(componentaU_45_x_UXVoEe2_CvdRyEmMCQ != null) {
				componentaU_45_x_UXVoEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
					pfeature:majoraU_45_x_UXVoEe2_CvdRyEmMCQInput.feature
				));
			}
		} else if(isVisible(minorSIB,'_U-x_UXVoEe2_CvdRyEmMCQ')) {
			FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQInput newInput = minorInput as FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQInput;
			bool hasChanged = minoraU_45_x_UXVoEe2_CvdRyEmMCQInput!=null?minoraU_45_x_UXVoEe2_CvdRyEmMCQInput.inpusChanged(newInput):true;
			minoraU_45_x_UXVoEe2_CvdRyEmMCQInput = newInput;
			if(componentaU_45_x_UXVoEe2_CvdRyEmMCQ != null) {
				componentaU_45_x_UXVoEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
					pfeature:minoraU_45_x_UXVoEe2_CvdRyEmMCQInput.feature
				));
				if(hasChanged) {
					componentaU_45_x_UXVoEe2_CvdRyEmMCQ.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_EGVmEXVpEe2_CvdRyEmMCQ')) {
			majoraEGVmEXVpEe2_CvdRyEmMCQInput = majorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			if(componentaEGVmEXVpEe2_CvdRyEmMCQ != null) {
				componentaEGVmEXVpEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_EGVmEXVpEe2_CvdRyEmMCQ')) {
			DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput newInput = minorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			bool hasChanged = minoraEGVmEXVpEe2_CvdRyEmMCQInput!=null?minoraEGVmEXVpEe2_CvdRyEmMCQInput.inpusChanged(newInput):true;
			minoraEGVmEXVpEe2_CvdRyEmMCQInput = newInput;
			if(componentaEGVmEXVpEe2_CvdRyEmMCQ != null) {
				componentaEGVmEXVpEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaEGVmEXVpEe2_CvdRyEmMCQ.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_kAAQ4XVqEe2_CvdRyEmMCQ')) {
			majorakAAQ4XVqEe2_CvdRyEmMCQInput = majorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			if(componentakAAQ4XVqEe2_CvdRyEmMCQ != null) {
				componentakAAQ4XVqEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_kAAQ4XVqEe2_CvdRyEmMCQ')) {
			DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput newInput = minorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			bool hasChanged = minorakAAQ4XVqEe2_CvdRyEmMCQInput!=null?minorakAAQ4XVqEe2_CvdRyEmMCQInput.inpusChanged(newInput):true;
			minorakAAQ4XVqEe2_CvdRyEmMCQInput = newInput;
			if(componentakAAQ4XVqEe2_CvdRyEmMCQ != null) {
				componentakAAQ4XVqEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentakAAQ4XVqEe2_CvdRyEmMCQ.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_j8aU4XVrEe2_CvdRyEmMCQ')) {
			majoraj8aU4XVrEe2_CvdRyEmMCQInput = majorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			if(componentaj8aU4XVrEe2_CvdRyEmMCQ != null) {
				componentaj8aU4XVrEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_j8aU4XVrEe2_CvdRyEmMCQ')) {
			DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput newInput = minorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			bool hasChanged = minoraj8aU4XVrEe2_CvdRyEmMCQInput!=null?minoraj8aU4XVrEe2_CvdRyEmMCQInput.inpusChanged(newInput):true;
			minoraj8aU4XVrEe2_CvdRyEmMCQInput = newInput;
			if(componentaj8aU4XVrEe2_CvdRyEmMCQ != null) {
				componentaj8aU4XVrEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaj8aU4XVrEe2_CvdRyEmMCQ.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_GqNwsXVsEe2_CvdRyEmMCQ')) {
			majoraGqNwsXVsEe2_CvdRyEmMCQInput = majorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			if(componentaGqNwsXVsEe2_CvdRyEmMCQ != null) {
				componentaGqNwsXVsEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_GqNwsXVsEe2_CvdRyEmMCQ')) {
			DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput newInput = minorInput as DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgInput;
			bool hasChanged = minoraGqNwsXVsEe2_CvdRyEmMCQInput!=null?minoraGqNwsXVsEe2_CvdRyEmMCQInput.inpusChanged(newInput):true;
			minoraGqNwsXVsEe2_CvdRyEmMCQInput = newInput;
			if(componentaGqNwsXVsEe2_CvdRyEmMCQ != null) {
				componentaGqNwsXVsEe2_CvdRyEmMCQ.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaGqNwsXVsEe2_CvdRyEmMCQ.forEach((n)=>n.restartComponent());			
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
		if(isVisible(majorSIB,'_3nKNEVuUEe2nXJXMw4vrvg')) {
			majora3nKNEVuUEe2nXJXMw4vrvgInput = majorInput as FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput;
			if(componenta3nKNEVuUEe2nXJXMw4vrvg != null) {
				componenta3nKNEVuUEe2nXJXMw4vrvg.forEach((n)=>n.updateInputs(
					ppriorities:majora3nKNEVuUEe2nXJXMw4vrvgInput.priorities
				));
			}
		} else if(isVisible(minorSIB,'_3nKNEVuUEe2nXJXMw4vrvg')) {
			FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput newInput = minorInput as FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput;
			bool hasChanged = minora3nKNEVuUEe2nXJXMw4vrvgInput!=null?minora3nKNEVuUEe2nXJXMw4vrvgInput.inpusChanged(newInput):true;
			minora3nKNEVuUEe2nXJXMw4vrvgInput = newInput;
			if(componenta3nKNEVuUEe2nXJXMw4vrvg != null) {
				componenta3nKNEVuUEe2nXJXMw4vrvg.forEach((n)=>n.updateInputs(
					ppriorities:minora3nKNEVuUEe2nXJXMw4vrvgInput.priorities
				));
				if(hasChanged) {
					componenta3nKNEVuUEe2nXJXMw4vrvg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_5m6o41uVEe2nXJXMw4vrvg')) {
			majora5m6o41uVEe2nXJXMw4vrvgInput = majorInput as FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput;
			if(componenta5m6o41uVEe2nXJXMw4vrvg != null) {
				componenta5m6o41uVEe2nXJXMw4vrvg.forEach((n)=>n.updateInputs(
					ppriorities:majora5m6o41uVEe2nXJXMw4vrvgInput.priorities
				));
			}
		} else if(isVisible(minorSIB,'_5m6o41uVEe2nXJXMw4vrvg')) {
			FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput newInput = minorInput as FeatureForm_OXlYQVuSEe2nXJXMw4vrvgInput;
			bool hasChanged = minora5m6o41uVEe2nXJXMw4vrvgInput!=null?minora5m6o41uVEe2nXJXMw4vrvgInput.inpusChanged(newInput):true;
			minora5m6o41uVEe2nXJXMw4vrvgInput = newInput;
			if(componenta5m6o41uVEe2nXJXMw4vrvg != null) {
				componenta5m6o41uVEe2nXJXMw4vrvg.forEach((n)=>n.updateInputs(
					ppriorities:minora5m6o41uVEe2nXJXMw4vrvgInput.priorities
				));
				if(hasChanged) {
					componenta5m6o41uVEe2nXJXMw4vrvg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_HW6tsFuZEe28kPQ81TnB9g')) {
			majoraHW6tsFuZEe28kPQ81TnB9gInput = majorInput as EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gInput;
			if(componentaHW6tsFuZEe28kPQ81TnB9g != null) {
				componentaHW6tsFuZEe28kPQ81TnB9g.forEach((n)=>n.updateInputs(
					ptitle:majoraHW6tsFuZEe28kPQ81TnB9gInput.title,
					pfeature:majoraHW6tsFuZEe28kPQ81TnB9gInput.feature,
					ppriorities:majoraHW6tsFuZEe28kPQ81TnB9gInput.priorities,
					ppriority:majoraHW6tsFuZEe28kPQ81TnB9gInput.priority
				));
			}
		} else if(isVisible(minorSIB,'_HW6tsFuZEe28kPQ81TnB9g')) {
			EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gInput newInput = minorInput as EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gInput;
			bool hasChanged = minoraHW6tsFuZEe28kPQ81TnB9gInput!=null?minoraHW6tsFuZEe28kPQ81TnB9gInput.inpusChanged(newInput):true;
			minoraHW6tsFuZEe28kPQ81TnB9gInput = newInput;
			if(componentaHW6tsFuZEe28kPQ81TnB9g != null) {
				componentaHW6tsFuZEe28kPQ81TnB9g.forEach((n)=>n.updateInputs(
					ptitle:minoraHW6tsFuZEe28kPQ81TnB9gInput.title,
					pfeature:minoraHW6tsFuZEe28kPQ81TnB9gInput.feature,
					ppriorities:minoraHW6tsFuZEe28kPQ81TnB9gInput.priorities,
					ppriority:minoraHW6tsFuZEe28kPQ81TnB9gInput.priority
				));
				if(hasChanged) {
					componentaHW6tsFuZEe28kPQ81TnB9g.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_6cS9EV3XEe2t19MJLPzxmg')) {
			majora6cS9EV3XEe2t19MJLPzxmgInput = majorInput as UserForm_BDkd8F3WEe2t19MJLPzxmgInput;
			if(componenta6cS9EV3XEe2t19MJLPzxmg != null) {
				componenta6cS9EV3XEe2t19MJLPzxmg.forEach((n)=>n.updateInputs(
					puserRoles:majora6cS9EV3XEe2t19MJLPzxmgInput.userRoles
				));
			}
		} else if(isVisible(minorSIB,'_6cS9EV3XEe2t19MJLPzxmg')) {
			UserForm_BDkd8F3WEe2t19MJLPzxmgInput newInput = minorInput as UserForm_BDkd8F3WEe2t19MJLPzxmgInput;
			bool hasChanged = minora6cS9EV3XEe2t19MJLPzxmgInput!=null?minora6cS9EV3XEe2t19MJLPzxmgInput.inpusChanged(newInput):true;
			minora6cS9EV3XEe2t19MJLPzxmgInput = newInput;
			if(componenta6cS9EV3XEe2t19MJLPzxmg != null) {
				componenta6cS9EV3XEe2t19MJLPzxmg.forEach((n)=>n.updateInputs(
					puserRoles:minora6cS9EV3XEe2t19MJLPzxmgInput.userRoles
				));
				if(hasChanged) {
					componenta6cS9EV3XEe2t19MJLPzxmg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_r7eUwWBEEe2RjrkbQARhdg')) {
			majorar7eUwWBEEe2RjrkbQARhdgInput = majorInput as EditUserForm_CPN5EWBEEe2RjrkbQARhdgInput;
			if(componentar7eUwWBEEe2RjrkbQARhdg != null) {
				componentar7eUwWBEEe2RjrkbQARhdg.forEach((n)=>n.updateInputs(
					pcurrentUser:majorar7eUwWBEEe2RjrkbQARhdgInput.currentUser,
					plastName:majorar7eUwWBEEe2RjrkbQARhdgInput.lastName,
					pfirstName:majorar7eUwWBEEe2RjrkbQARhdgInput.firstName,
					puserRoles:majorar7eUwWBEEe2RjrkbQARhdgInput.userRoles,
					puserRole:majorar7eUwWBEEe2RjrkbQARhdgInput.userRole
				));
			}
		} else if(isVisible(minorSIB,'_r7eUwWBEEe2RjrkbQARhdg')) {
			EditUserForm_CPN5EWBEEe2RjrkbQARhdgInput newInput = minorInput as EditUserForm_CPN5EWBEEe2RjrkbQARhdgInput;
			bool hasChanged = minorar7eUwWBEEe2RjrkbQARhdgInput!=null?minorar7eUwWBEEe2RjrkbQARhdgInput.inpusChanged(newInput):true;
			minorar7eUwWBEEe2RjrkbQARhdgInput = newInput;
			if(componentar7eUwWBEEe2RjrkbQARhdg != null) {
				componentar7eUwWBEEe2RjrkbQARhdg.forEach((n)=>n.updateInputs(
					pcurrentUser:minorar7eUwWBEEe2RjrkbQARhdgInput.currentUser,
					plastName:minorar7eUwWBEEe2RjrkbQARhdgInput.lastName,
					pfirstName:minorar7eUwWBEEe2RjrkbQARhdgInput.firstName,
					puserRoles:minorar7eUwWBEEe2RjrkbQARhdgInput.userRoles,
					puserRole:minorar7eUwWBEEe2RjrkbQARhdgInput.userRole
				));
				if(hasChanged) {
					componentar7eUwWBEEe2RjrkbQARhdg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		
		
	}
	// Branches for GUISIB AdminArea of Process ShowAdminArea
	// Branch Create offer feature
	void eventajx7GIVLPEe2djpkPxa2Z3QCreate_offer_featureTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forCreate_offer_featureBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Create_offer_feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create bidding feature
	void eventajx_45_JcVLPEe2djpkPxa2Z3QCreate_bidding_featureTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forCreate_bidding_featureBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Create_bidding_feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit feature
	void eventaxymyoVLPEe2djpkPxa2Z3QEdit_featureTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forEdit_featureBranch(
			feature:map['feature'] as Data.Feature
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Edit_feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Delete feature
	void eventaxyrEEVLPEe2djpkPxa2Z3QDelete_featureTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forDelete_featureBranch(
			feature:map['feature'] as Data.Feature
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Delete_feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit user
	void eventa5mWyEVLrEe2djpkPxa2Z3QEdit_userTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forEdit_userBranch(
			user:map['user'] as Data.User
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Edit_user/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Delete user
	void eventa5mk0gVLrEe2djpkPxa2Z3QDelete_userTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forDelete_userBranch(
			user:map['user'] as Data.User
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Delete_user/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create user
	void eventa5my28VLrEe2djpkPxa2Z3QCreate_userTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forCreate_userBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Create_user/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Show offer
	void eventa5m49kVLrEe2djpkPxa2Z3QShow_offerTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forShow_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Show_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit offer
	void eventa5nIOIVLrEe2djpkPxa2Z3QEdit_offerTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forEdit_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Edit_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Delete offer
	void eventa5nYs0VLrEe2djpkPxa2Z3QDelete_offerTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forDelete_offerBranch(
			offer:map['offer'] as Data.Offer
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Delete_offer/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Show bidding
	void eventa5nrAsVLrEe2djpkPxa2Z3QShow_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forShow_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Show_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Edit bidding
	void eventa5n9UkVLrEe2djpkPxa2Z3QEdit_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forEdit_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Edit_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Delete bidding
	void eventa5oQPgVLrEe2djpkPxa2Z3QDelete_biddingTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forDelete_biddingBranch(
			bidding:map['bidding'] as Data.Bidding
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Delete_bidding/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Details
	void eventaTWLCwXVoEe2_CvdRyEmMCQDetailsTrigger(Map<String,dynamic> map)
	{
		var result = new AdminArea_YggYMVFOEe2J0bu3ffrh5wBranch.forDetailsBranch(
			feature:map['feature'] as Data.Feature
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_YggYMVFOEe2J0bu3ffrh5w',
			'Details/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB FeatureDetails of Process ShowAdminArea
	// Branch Exit
	void eventaU_LA4XVoEe2_CvdRyEmMCQExitTrigger(Map<String,dynamic> map)
	{
		var result = new FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQBranch.forExitBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ptsfcWEREe2Fx80Lw9BAUQ',
			'Exit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB DeleteFeature of Process ShowAdminArea
	// Branch Confirm Delete
	void eventaEGglMXVpEe2_CvdRyEmMCQConfirm_DeleteTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forConfirm_DeleteBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Confirm_Delete/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventaEGq9QXVpEe2_CvdRyEmMCQCancelTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB DeleteFeature of Process ShowAdminArea
	// Branch Confirm Delete
	void eventakAMeIXVqEe2_CvdRyEmMCQConfirm_DeleteTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forConfirm_DeleteBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Confirm_Delete/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventakAYrYXVqEe2_CvdRyEmMCQCancelTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB DeleteFeature of Process ShowAdminArea
	// Branch Confirm Delete
	void eventaj8raoXVrEe2_CvdRyEmMCQConfirm_DeleteTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forConfirm_DeleteBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Confirm_Delete/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventaj86EIXVrEe2_CvdRyEmMCQCancelTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB DeleteFeature of Process ShowAdminArea
	// Branch Confirm Delete
	void eventaGqdoUXVsEe2_CvdRyEmMCQConfirm_DeleteTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forConfirm_DeleteBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Confirm_Delete/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventaGqs44XVsEe2_CvdRyEmMCQCancelTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_VDMMEVt7Ee20aa7PI0XDWg',
			'Cancel/branch/public',
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
	// Branches for GUISIB FeatureForm of Process ShowCreateOfferFeature
	// Branch Submit
	void eventa3nUlIVuUEe2nXJXMw4vrvgSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new FeatureForm_OXlYQVuSEe2nXJXMw4vrvgBranch.forSubmitBranch(
			title:map['title'],
			priority:map['priority'] as Data.Priority
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_OXlYQVuSEe2nXJXMw4vrvg',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventaZBTBkVuVEe2nXJXMw4vrvgCancelTrigger(Map<String,dynamic> map)
	{
		var result = new FeatureForm_OXlYQVuSEe2nXJXMw4vrvgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_OXlYQVuSEe2nXJXMw4vrvg',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB FeatureForm of Process ShowCreateBiddingFeature
	// Branch Cancel
	void eventa5m7P_45_FuVEe2nXJXMw4vrvgCancelTrigger(Map<String,dynamic> map)
	{
		var result = new FeatureForm_OXlYQVuSEe2nXJXMw4vrvgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_OXlYQVuSEe2nXJXMw4vrvg',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Submit
	void eventa5m2_45_h1uVEe2nXJXMw4vrvgSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new FeatureForm_OXlYQVuSEe2nXJXMw4vrvgBranch.forSubmitBranch(
			title:map['title'],
			priority:map['priority'] as Data.Priority
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_OXlYQVuSEe2nXJXMw4vrvg',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB EditFeatureForm of Process EditFeature
	// Branch Submit
	void eventaHXEesVuZEe28kPQ81TnB9gSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gBranch.forSubmitBranch(
			title:map['title'],
			priority:map['priority'] as Data.Priority
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventaHXRTAVuZEe28kPQ81TnB9gCancelTrigger(Map<String,dynamic> map)
	{
		var result = new EditFeatureForm__45_UC0cVuXEe28kPQ81TnB9gBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB UserForm of Process ShowCreateUser
	// Branch Submit
	void eventa6ci0sV3XEe2t19MJLPzxmgSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new UserForm_BDkd8F3WEe2t19MJLPzxmgBranch.forSubmitBranch(
			userRole:map['userRole'] as Data.UserRole,
			firstName:map['firstName'],
			lastName:map['lastName']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_BDkd8F3WEe2t19MJLPzxmg',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventa6dJ4sV3XEe2t19MJLPzxmgCancelTrigger(Map<String,dynamic> map)
	{
		var result = new UserForm_BDkd8F3WEe2t19MJLPzxmgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_BDkd8F3WEe2t19MJLPzxmg',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB EditUserForm of Process ShowEditUser
	// Branch Submit
	void eventar706EWBEEe2RjrkbQARhdgSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new EditUserForm_CPN5EWBEEe2RjrkbQARhdgBranch.forSubmitBranch(
			lastName:map['lastName'],
			firstName:map['firstName'],
			userRole:map['userRole'] as Data.UserRole
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_CPN5EWBEEe2RjrkbQARhdg',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventar79c8WBEEe2RjrkbQARhdgCancelTrigger(Map<String,dynamic> map)
	{
		var result = new EditUserForm_CPN5EWBEEe2RjrkbQARhdgBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_CPN5EWBEEe2RjrkbQARhdg',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}

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
import 'package:app/src/rest/gui/CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwBranch.dart';
import 'package:app/src/gui/CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw.dart';
import 'package:app/src/rest/gui/DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwBranch.dart';
import 'package:app/src/gui/DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw.dart';
import 'package:app/src/rest/gui/CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwBranch.dart';
import 'package:app/src/gui/CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wBranch.dart';
import 'package:app/src/gui/BiddingDetailsazSAVgVOjEe2KQc5QIsW97w.dart';
import 'package:app/src/rest/gui/NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput.dart';
import 'package:app/src/rest/gui/NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwBranch.dart';
import 'package:app/src/gui/NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw.dart';
import 'package:app/src/rest/gui/CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput.dart';
import 'package:app/src/rest/gui/CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwBranch.dart';
import 'package:app/src/gui/CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw.dart';
import 'package:app/src/rest/gui/CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput.dart';
import 'package:app/src/rest/gui/CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgBranch.dart';
import 'package:app/src/gui/CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg.dart';
import 'package:app/src/rest/gui/DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput.dart';
import 'package:app/src/rest/gui/DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwBranch.dart';
import 'package:app/src/gui/DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw.dart';
import 'package:app/src/rest/gui/NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput.dart';
import 'package:app/src/rest/gui/NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gBranch.dart';
import 'package:app/src/gui/NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g.dart';
import 'package:app/src/rest/gui/BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput.dart';
import 'package:app/src/rest/gui/BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALBranch.dart';
import 'package:app/src/gui/BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL.dart';
import 'package:app/src/rest/gui/DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput.dart';
import 'package:app/src/rest/gui/DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQBranch.dart';
import 'package:app/src/gui/DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ.dart';
import 'package:app/src/rest/gui/OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput.dart';
import 'package:app/src/rest/gui/OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwBranch.dart';
import 'package:app/src/gui/OfferAeraEditakAL7QXfUEe2cGd7_OEEukw.dart';
//NF model outputs

@Component(
  	selector: 'ShowUserArea-acxB5kVFLEe2Vgcav4Znc_w-process',
  	directives: const [
  		coreDirectives,login.Login,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw,UserAreaajIfqkVFOEe2J0bu3ffrh5w,OfferDetailsafcOIkVN8Ee2KQc5QIsW97w,CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw,DetailsPageaHVzS0GAMEe2S6JM4Hx8SJw,CreateCommentFormaovAusWAWEe2S6JM4Hx8SJw,BiddingDetailsazSAVgVOjEe2KQc5QIsW97w,NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw,CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw,CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg,DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw,NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g,BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL,DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ,OfferAeraEditakAL7QXfUEe2cGd7_OEEukw
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
		<!-- Process newOfferProcess -->
		<newofferaera-tag
			*ngIf="isVisible(majorSIB,'_1kpY4XfGEe20WYdcRLAoOw')"
			[features]="majora1kpY4XfGEe20WYdcRLAoOwInput.features"
			[preferences]="majora1kpY4XfGEe20WYdcRLAoOwInput.preferences"
			[guiId]="'_Ag9K4HfGEe20WYdcRLAoOw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actioncreatenewfeatureevent) = "eventa1lHS8XfGEe20WYdcRLAoOwCreate_New_FeatureTrigger(\$event)"
			(actioncreatenewpreferenceevent) = "eventa1lLkYXfGEe20WYdcRLAoOwCreate_New_PreferenceTrigger(\$event)"
			(actionsubmitevent) = "eventa1lPOwXfGEe20WYdcRLAoOwSubmitTrigger(\$event)"
			(actioncancelevent) = "eventa1lz2gXfGEe20WYdcRLAoOwCancelTrigger(\$event)"
		>
		</newofferaera-tag>
		<!-- Process NewPreference -->
		<createpreference-tag
			*ngIf="isVisible(majorSIB,'_sumAIWAKEe2YNpeIwSxEfw')"
			[guiId]="'_Bn2jcWAKEe2YNpeIwSxEfw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventasvKn4WAKEe2YNpeIwSxEfwSubmitTrigger(\$event)"
			(actioncancelevent) = "eventabkMnQWDnEe2niNyWP4DbtACancelTrigger(\$event)"
		>
		</createpreference-tag>
		<!-- Process NewFeature -->
		<createfeaturegui-tag
			*ngIf="isVisible(majorSIB,'_PnWioV-mEe2Y_7LmLNugjg')"
			[guiId]="'_N90GIV7vEe2Ml8OCwlD7jg'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionlabelevent) = "eventaPnZl8V_45_mEe2Y_7LmLNugjgLabelTrigger(\$event)"
			(actionsubmitevent) = "eventaPncCMV_45_mEe2Y_7LmLNugjgSubmitTrigger(\$event)"
		>
		</createfeaturegui-tag>
		<!-- Process deleteOffer -->
		<deleteofferconfirm-tag
			*ngIf="isVisible(majorSIB,'__vHV4XfTEe2cGd7_OEEukw')"
			[offer]="majora_vHV4XfTEe2cGd7_OEEukwInput.offer"
			[guiId]="'_ynZRsXfTEe2cGd7_OEEukw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionbackevent) = "eventa_vbe8XfTEe2cGd7_OEEukwBackTrigger(\$event)"
			(actionconfirmevent) = "eventa_vhlkXfTEe2cGd7_OEEukwConfirmTrigger(\$event)"
		>
		</deleteofferconfirm-tag>
		<!-- Process newBiddingProcess -->
		<newbiddingarea-tag
			*ngIf="isVisible(majorSIB,'_HUNqsWBJEe2Zz8LOII5r3g')"
			[features]="majoraHUNqsWBJEe2Zz8LOII5r3gInput.features"
			[preferences]="majoraHUNqsWBJEe2Zz8LOII5r3gInput.preferences"
			[guiId]="'_ZI100WBHEe2Zz8LOII5r3g'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actioncreatenewfeatureevent) = "eventaHUleIWBJEe2Zz8LOII5r3gCreate_New_FeatureTrigger(\$event)"
			(actioncreatenewpreferenceevent) = "eventaHUnTUWBJEe2Zz8LOII5r3gCreate_New_PreferenceTrigger(\$event)"
			(actionsubmitevent) = "eventaHUqWoWBJEe2Zz8LOII5r3gSubmitTrigger(\$event)"
			(actioncancelevent) = "eventaHU8qgWBJEe2Zz8LOII5r3gCancelTrigger(\$event)"
		>
		</newbiddingarea-tag>
		<!-- Process BiddingEditProcess -->
		<biddingareaedit-tag
			*ngIf="isVisible(majorSIB,'_5k-cEV3uEe2HUMxwZL7uug')"
			[preferences]="majora5k_45_cEV3uEe2HUMxwZL7uugInput.preferences"
			[features]="majora5k_45_cEV3uEe2HUMxwZL7uugInput.features"
			[bidding]="majora5k_45_cEV3uEe2HUMxwZL7uugInput.bidding"
			[guiId]="'_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionsubmitevent) = "eventaChNewV7VEe2G_45_ZFrOzgUmwSubmitTrigger(\$event)"
			(actioncreatenewfeatureevent) = "eventaIWTzYV_45_lEe2c5ZoBUTVdBwCreate_new_featureTrigger(\$event)"
			(actioncreatenewpreferenceevent) = "eventaIW5CMV_45_lEe2c5ZoBUTVdBwCreate_new_preferenceTrigger(\$event)"
			(actioncancelevent) = "eventaa3HgQWBiEe2zFOcETdlBwQCancelTrigger(\$event)"
		>
		</biddingareaedit-tag>
		<!-- Process deleteBidding -->
		<deletebiddingconfirm-tag
			*ngIf="isVisible(majorSIB,'_bfwnsWAtEe2KJog_oImiIQ')"
			[bidding]="majorabfwnsWAtEe2KJog_oImiIQInput.bidding"
			[guiId]="'_sR_EMGAsEe2KJog_oImiIQ'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actionconfirmevent) = "eventabgEwwWAtEe2KJog_oImiIQConfirmTrigger(\$event)"
			(actionbackevent) = "eventabgK3YWAtEe2KJog_oImiIQBackTrigger(\$event)"
		>
		</deletebiddingconfirm-tag>
		<!-- Process OfferEditProcess -->
		<offeraeraedit-tag
			*ngIf="isVisible(majorSIB,'_LFbIkHhdEe2mVL2cgUAW0A')"
			[features]="majoraLFbIkHhdEe2mVL2cgUAW0AInput.features"
			[preferences]="majoraLFbIkHhdEe2mVL2cgUAW0AInput.preferences"
			[offer]="majoraLFbIkHhdEe2mVL2cgUAW0AInput.offer"
			[guiId]="'_kAL7QXfUEe2cGd7_OEEukw'"
			[runtimeId]="runtimeId"
			[currentbranch]="currentBranch"
			[modalDialog]="false"
			[ismajorpage]="true"
			(actioncancelevent) = "eventaLGYK0HhdEe2mVL2cgUAW0ACancelTrigger(\$event)"
			(actionsubmitevent) = "eventaLGm0UXhdEe2mVL2cgUAW0ASubmitTrigger(\$event)"
			(actioncreatenewfeatureevent) = "eventaLHaFkXhdEe2mVL2cgUAW0ACreate_new_featureTrigger(\$event)"
			(actioncreatenewpreferenceevent) = "eventaLHgzQXhdEe2mVL2cgUAW0ACreate_new_preferenceTrigger(\$event)"
		>
		</offeraeraedit-tag>
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
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput majoraohLoEWBYEe22r_45_rMCqBFnwInput;
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput minoraohLoEWBYEe22r_45_rMCqBFnwInput;
	DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput majora432fEWBZEe22r_45_rMCqBFnwInput;
	DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput minora432fEWBZEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput majoraOTSh8WDTEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput minoraOTSh8WDTEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput majoraBXlEAWDUEe22r_45_rMCqBFnwInput;
	CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput minoraBXlEAWDUEe22r_45_rMCqBFnwInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput majoraYuo5oVOlEe2KQc5QIsW97wInput;
	BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput minoraYuo5oVOlEe2KQc5QIsW97wInput;
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput majoraot8yYWBQEe22r_45_rMCqBFnwInput;
	CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput minoraot8yYWBQEe22r_45_rMCqBFnwInput;
	NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput majora1kpY4XfGEe20WYdcRLAoOwInput;
	NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput minora1kpY4XfGEe20WYdcRLAoOwInput;
	CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput majorasumAIWAKEe2YNpeIwSxEfwInput;
	CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput minorasumAIWAKEe2YNpeIwSxEfwInput;
	CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput majoraPnWioV_45_mEe2Y_7LmLNugjgInput;
	CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput minoraPnWioV_45_mEe2Y_7LmLNugjgInput;
	DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput majora_vHV4XfTEe2cGd7_OEEukwInput;
	DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput minora_vHV4XfTEe2cGd7_OEEukwInput;
	NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput majoraHUNqsWBJEe2Zz8LOII5r3gInput;
	NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput minoraHUNqsWBJEe2Zz8LOII5r3gInput;
	BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput majora5k_45_cEV3uEe2HUMxwZL7uugInput;
	BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput minora5k_45_cEV3uEe2HUMxwZL7uugInput;
	DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput majorabfwnsWAtEe2KJog_oImiIQInput;
	DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput minorabfwnsWAtEe2KJog_oImiIQInput;
	OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput majoraLFbIkHhdEe2mVL2cgUAW0AInput;
	OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput minoraLFbIkHhdEe2mVL2cgUAW0AInput;
	
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
	// GUISIBs of Process ShowCreateIssueOffer
	// GUISIB CreateIssueForm
	@ViewChildren(CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw)
	List<CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw> componentaohLoEWBYEe22r_45_rMCqBFnw;
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
	// GUISIBs of Process ShowBiddingDetails
	// GUISIB BiddingDetails
	@ViewChildren(BiddingDetailsazSAVgVOjEe2KQc5QIsW97w)
	List<BiddingDetailsazSAVgVOjEe2KQc5QIsW97w> componentaYuo5oVOlEe2KQc5QIsW97w;
	// GUISIBs of Process ShowCreateIssueBidding
	// GUISIB CreateIssueForm
	@ViewChildren(CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw)
	List<CreateIssueFormaqs8t8GAJEe2S6JM4Hx8SJw> componentaot8yYWBQEe22r_45_rMCqBFnw;
	// GUISIBs of Process newOfferProcess
	// GUISIB newOfferAera
	@ViewChildren(NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw)
	List<NewOfferAeraaAg9K4HfGEe20WYdcRLAoOw> componenta1kpY4XfGEe20WYdcRLAoOw;
	// GUISIBs of Process NewPreference
	// GUISIB CreatePreference
	@ViewChildren(CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw)
	List<CreatePreferenceaBn2jcWAKEe2YNpeIwSxEfw> componentasumAIWAKEe2YNpeIwSxEfw;
	// GUISIBs of Process NewFeature
	// GUISIB CreatefeatureGUI
	@ViewChildren(CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg)
	List<CreatefeatureGUIaN90GIV7vEe2Ml8OCwlD7jg> componentaPnWioV_45_mEe2Y_7LmLNugjg;
	// GUISIBs of Process deleteOffer
	// GUISIB deleteOfferConfirm
	@ViewChildren(DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw)
	List<DeleteOfferConfirmaynZRsXfTEe2cGd7_OEEukw> componenta_vHV4XfTEe2cGd7_OEEukw;
	// GUISIBs of Process newBiddingProcess
	// GUISIB NewBiddingArea
	@ViewChildren(NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g)
	List<NewBiddingAreaaZI100WBHEe2Zz8LOII5r3g> componentaHUNqsWBJEe2Zz8LOII5r3g;
	// GUISIBs of Process BiddingEditProcess
	// GUISIB BiddingAreaEdit
	@ViewChildren(BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL)
	List<BiddingAreaEditaGoy80Fm_Ee2zbeoDKccEjg_INTERNAL> componenta5k_45_cEV3uEe2HUMxwZL7uug;
	// GUISIBs of Process deleteBidding
	// GUISIB deleteBiddingConfirm
	@ViewChildren(DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ)
	List<DeleteBiddingConfirmasR_EMGAsEe2KJog_oImiIQ> componentabfwnsWAtEe2KJog_oImiIQ;
	// GUISIBs of Process OfferEditProcess
	// GUISIB OfferAeraEdit
	@ViewChildren(OfferAeraEditakAL7QXfUEe2cGd7_OEEukw)
	List<OfferAeraEditakAL7QXfUEe2cGd7_OEEukw> componentaLFbIkHhdEe2mVL2cgUAW0A;
	
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
		if(isVisible(majorSIB,'_1kpY4XfGEe20WYdcRLAoOw')) {
			majora1kpY4XfGEe20WYdcRLAoOwInput = majorInput as NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput;
			if(componenta1kpY4XfGEe20WYdcRLAoOw != null) {
				componenta1kpY4XfGEe20WYdcRLAoOw.forEach((n)=>n.updateInputs(
					pfeatures:majora1kpY4XfGEe20WYdcRLAoOwInput.features,
					ppreferences:majora1kpY4XfGEe20WYdcRLAoOwInput.preferences
				));
			}
		} else if(isVisible(minorSIB,'_1kpY4XfGEe20WYdcRLAoOw')) {
			NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput newInput = minorInput as NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput;
			bool hasChanged = minora1kpY4XfGEe20WYdcRLAoOwInput!=null?minora1kpY4XfGEe20WYdcRLAoOwInput.inpusChanged(newInput):true;
			minora1kpY4XfGEe20WYdcRLAoOwInput = newInput;
			if(componenta1kpY4XfGEe20WYdcRLAoOw != null) {
				componenta1kpY4XfGEe20WYdcRLAoOw.forEach((n)=>n.updateInputs(
					pfeatures:minora1kpY4XfGEe20WYdcRLAoOwInput.features,
					ppreferences:minora1kpY4XfGEe20WYdcRLAoOwInput.preferences
				));
				if(hasChanged) {
					componenta1kpY4XfGEe20WYdcRLAoOw.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_sumAIWAKEe2YNpeIwSxEfw')) {
			majorasumAIWAKEe2YNpeIwSxEfwInput = majorInput as CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput;
			if(componentasumAIWAKEe2YNpeIwSxEfw != null) {
				componentasumAIWAKEe2YNpeIwSxEfw.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_sumAIWAKEe2YNpeIwSxEfw')) {
			CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput newInput = minorInput as CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput;
			bool hasChanged = minorasumAIWAKEe2YNpeIwSxEfwInput!=null?minorasumAIWAKEe2YNpeIwSxEfwInput.inpusChanged(newInput):true;
			minorasumAIWAKEe2YNpeIwSxEfwInput = newInput;
			if(componentasumAIWAKEe2YNpeIwSxEfw != null) {
				componentasumAIWAKEe2YNpeIwSxEfw.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentasumAIWAKEe2YNpeIwSxEfw.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_PnWioV-mEe2Y_7LmLNugjg')) {
			majoraPnWioV_45_mEe2Y_7LmLNugjgInput = majorInput as CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput;
			if(componentaPnWioV_45_mEe2Y_7LmLNugjg != null) {
				componentaPnWioV_45_mEe2Y_7LmLNugjg.forEach((n)=>n.updateInputs(
				));
			}
		} else if(isVisible(minorSIB,'_PnWioV-mEe2Y_7LmLNugjg')) {
			CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput newInput = minorInput as CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput;
			bool hasChanged = minoraPnWioV_45_mEe2Y_7LmLNugjgInput!=null?minoraPnWioV_45_mEe2Y_7LmLNugjgInput.inpusChanged(newInput):true;
			minoraPnWioV_45_mEe2Y_7LmLNugjgInput = newInput;
			if(componentaPnWioV_45_mEe2Y_7LmLNugjg != null) {
				componentaPnWioV_45_mEe2Y_7LmLNugjg.forEach((n)=>n.updateInputs(
				));
				if(hasChanged) {
					componentaPnWioV_45_mEe2Y_7LmLNugjg.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'__vHV4XfTEe2cGd7_OEEukw')) {
			majora_vHV4XfTEe2cGd7_OEEukwInput = majorInput as DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput;
			if(componenta_vHV4XfTEe2cGd7_OEEukw != null) {
				componenta_vHV4XfTEe2cGd7_OEEukw.forEach((n)=>n.updateInputs(
					poffer:majora_vHV4XfTEe2cGd7_OEEukwInput.offer
				));
			}
		} else if(isVisible(minorSIB,'__vHV4XfTEe2cGd7_OEEukw')) {
			DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput newInput = minorInput as DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput;
			bool hasChanged = minora_vHV4XfTEe2cGd7_OEEukwInput!=null?minora_vHV4XfTEe2cGd7_OEEukwInput.inpusChanged(newInput):true;
			minora_vHV4XfTEe2cGd7_OEEukwInput = newInput;
			if(componenta_vHV4XfTEe2cGd7_OEEukw != null) {
				componenta_vHV4XfTEe2cGd7_OEEukw.forEach((n)=>n.updateInputs(
					poffer:minora_vHV4XfTEe2cGd7_OEEukwInput.offer
				));
				if(hasChanged) {
					componenta_vHV4XfTEe2cGd7_OEEukw.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_HUNqsWBJEe2Zz8LOII5r3g')) {
			majoraHUNqsWBJEe2Zz8LOII5r3gInput = majorInput as NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput;
			if(componentaHUNqsWBJEe2Zz8LOII5r3g != null) {
				componentaHUNqsWBJEe2Zz8LOII5r3g.forEach((n)=>n.updateInputs(
					pfeatures:majoraHUNqsWBJEe2Zz8LOII5r3gInput.features,
					ppreferences:majoraHUNqsWBJEe2Zz8LOII5r3gInput.preferences
				));
			}
		} else if(isVisible(minorSIB,'_HUNqsWBJEe2Zz8LOII5r3g')) {
			NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput newInput = minorInput as NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput;
			bool hasChanged = minoraHUNqsWBJEe2Zz8LOII5r3gInput!=null?minoraHUNqsWBJEe2Zz8LOII5r3gInput.inpusChanged(newInput):true;
			minoraHUNqsWBJEe2Zz8LOII5r3gInput = newInput;
			if(componentaHUNqsWBJEe2Zz8LOII5r3g != null) {
				componentaHUNqsWBJEe2Zz8LOII5r3g.forEach((n)=>n.updateInputs(
					pfeatures:minoraHUNqsWBJEe2Zz8LOII5r3gInput.features,
					ppreferences:minoraHUNqsWBJEe2Zz8LOII5r3gInput.preferences
				));
				if(hasChanged) {
					componentaHUNqsWBJEe2Zz8LOII5r3g.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_5k-cEV3uEe2HUMxwZL7uug')) {
			majora5k_45_cEV3uEe2HUMxwZL7uugInput = majorInput as BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput;
			if(componenta5k_45_cEV3uEe2HUMxwZL7uug != null) {
				componenta5k_45_cEV3uEe2HUMxwZL7uug.forEach((n)=>n.updateInputs(
					ppreferences:majora5k_45_cEV3uEe2HUMxwZL7uugInput.preferences,
					pfeatures:majora5k_45_cEV3uEe2HUMxwZL7uugInput.features,
					pbidding:majora5k_45_cEV3uEe2HUMxwZL7uugInput.bidding
				));
			}
		} else if(isVisible(minorSIB,'_5k-cEV3uEe2HUMxwZL7uug')) {
			BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput newInput = minorInput as BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput;
			bool hasChanged = minora5k_45_cEV3uEe2HUMxwZL7uugInput!=null?minora5k_45_cEV3uEe2HUMxwZL7uugInput.inpusChanged(newInput):true;
			minora5k_45_cEV3uEe2HUMxwZL7uugInput = newInput;
			if(componenta5k_45_cEV3uEe2HUMxwZL7uug != null) {
				componenta5k_45_cEV3uEe2HUMxwZL7uug.forEach((n)=>n.updateInputs(
					ppreferences:minora5k_45_cEV3uEe2HUMxwZL7uugInput.preferences,
					pfeatures:minora5k_45_cEV3uEe2HUMxwZL7uugInput.features,
					pbidding:minora5k_45_cEV3uEe2HUMxwZL7uugInput.bidding
				));
				if(hasChanged) {
					componenta5k_45_cEV3uEe2HUMxwZL7uug.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_bfwnsWAtEe2KJog_oImiIQ')) {
			majorabfwnsWAtEe2KJog_oImiIQInput = majorInput as DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput;
			if(componentabfwnsWAtEe2KJog_oImiIQ != null) {
				componentabfwnsWAtEe2KJog_oImiIQ.forEach((n)=>n.updateInputs(
					pbidding:majorabfwnsWAtEe2KJog_oImiIQInput.bidding
				));
			}
		} else if(isVisible(minorSIB,'_bfwnsWAtEe2KJog_oImiIQ')) {
			DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput newInput = minorInput as DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput;
			bool hasChanged = minorabfwnsWAtEe2KJog_oImiIQInput!=null?minorabfwnsWAtEe2KJog_oImiIQInput.inpusChanged(newInput):true;
			minorabfwnsWAtEe2KJog_oImiIQInput = newInput;
			if(componentabfwnsWAtEe2KJog_oImiIQ != null) {
				componentabfwnsWAtEe2KJog_oImiIQ.forEach((n)=>n.updateInputs(
					pbidding:minorabfwnsWAtEe2KJog_oImiIQInput.bidding
				));
				if(hasChanged) {
					componentabfwnsWAtEe2KJog_oImiIQ.forEach((n)=>n.restartComponent());			
				}
			}
		}
		if(isVisible(majorSIB,'_LFbIkHhdEe2mVL2cgUAW0A')) {
			majoraLFbIkHhdEe2mVL2cgUAW0AInput = majorInput as OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput;
			if(componentaLFbIkHhdEe2mVL2cgUAW0A != null) {
				componentaLFbIkHhdEe2mVL2cgUAW0A.forEach((n)=>n.updateInputs(
					pfeatures:majoraLFbIkHhdEe2mVL2cgUAW0AInput.features,
					ppreferences:majoraLFbIkHhdEe2mVL2cgUAW0AInput.preferences,
					poffer:majoraLFbIkHhdEe2mVL2cgUAW0AInput.offer
				));
			}
		} else if(isVisible(minorSIB,'_LFbIkHhdEe2mVL2cgUAW0A')) {
			OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput newInput = minorInput as OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput;
			bool hasChanged = minoraLFbIkHhdEe2mVL2cgUAW0AInput!=null?minoraLFbIkHhdEe2mVL2cgUAW0AInput.inpusChanged(newInput):true;
			minoraLFbIkHhdEe2mVL2cgUAW0AInput = newInput;
			if(componentaLFbIkHhdEe2mVL2cgUAW0A != null) {
				componentaLFbIkHhdEe2mVL2cgUAW0A.forEach((n)=>n.updateInputs(
					pfeatures:minoraLFbIkHhdEe2mVL2cgUAW0AInput.features,
					ppreferences:minoraLFbIkHhdEe2mVL2cgUAW0AInput.preferences,
					poffer:minoraLFbIkHhdEe2mVL2cgUAW0AInput.offer
				));
				if(hasChanged) {
					componentaLFbIkHhdEe2mVL2cgUAW0A.forEach((n)=>n.restartComponent());			
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
	// Branches for GUISIB newOfferAera of Process newOfferProcess
	// Branch Create New Feature
	void eventa1lHS8XfGEe20WYdcRLAoOwCreate_New_FeatureTrigger(Map<String,dynamic> map)
	{
		var result = new NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwBranch.forCreate_New_FeatureBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Ag9K4HfGEe20WYdcRLAoOw',
			'Create_New_Feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create New Preference
	void eventa1lLkYXfGEe20WYdcRLAoOwCreate_New_PreferenceTrigger(Map<String,dynamic> map)
	{
		var result = new NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwBranch.forCreate_New_PreferenceBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Ag9K4HfGEe20WYdcRLAoOw',
			'Create_New_Preference/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Submit
	void eventa1lPOwXfGEe20WYdcRLAoOwSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwBranch.forSubmitBranch(
			title:map['title'],
			selectedFeature:map['selectedFeature'] as DIMEList<Data.Feature>,
			selectedPreferences:map['selectedPreferences'] as DIMEList<Data.Feature>,
			description:map['description']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Ag9K4HfGEe20WYdcRLAoOw',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventa1lz2gXfGEe20WYdcRLAoOwCancelTrigger(Map<String,dynamic> map)
	{
		var result = new NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Ag9K4HfGEe20WYdcRLAoOw',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB CreatePreference of Process NewPreference
	// Branch Submit
	void eventasvKn4WAKEe2YNpeIwSxEfwSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwBranch.forSubmitBranch(
			title:map['title']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Bn2jcWAKEe2YNpeIwSxEfw',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventabkMnQWDnEe2niNyWP4DbtACancelTrigger(Map<String,dynamic> map)
	{
		var result = new CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Bn2jcWAKEe2YNpeIwSxEfw',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB CreatefeatureGUI of Process NewFeature
	// Branch Label
	void eventaPnZl8V_45_mEe2Y_7LmLNugjgLabelTrigger(Map<String,dynamic> map)
	{
		var result = new CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgBranch.forLabelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_N90GIV7vEe2Ml8OCwlD7jg',
			'Label/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Submit
	void eventaPncCMV_45_mEe2Y_7LmLNugjgSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgBranch.forSubmitBranch(
			title:map['title']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_N90GIV7vEe2Ml8OCwlD7jg',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB deleteOfferConfirm of Process deleteOffer
	// Branch Back
	void eventa_vbe8XfTEe2cGd7_OEEukwBackTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ynZRsXfTEe2cGd7_OEEukw',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Confirm
	void eventa_vhlkXfTEe2cGd7_OEEukwConfirmTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwBranch.forConfirmBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ynZRsXfTEe2cGd7_OEEukw',
			'Confirm/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB NewBiddingArea of Process newBiddingProcess
	// Branch Create New Feature
	void eventaHUleIWBJEe2Zz8LOII5r3gCreate_New_FeatureTrigger(Map<String,dynamic> map)
	{
		var result = new NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gBranch.forCreate_New_FeatureBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ZI100WBHEe2Zz8LOII5r3g',
			'Create_New_Feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create New Preference
	void eventaHUnTUWBJEe2Zz8LOII5r3gCreate_New_PreferenceTrigger(Map<String,dynamic> map)
	{
		var result = new NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gBranch.forCreate_New_PreferenceBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ZI100WBHEe2Zz8LOII5r3g',
			'Create_New_Preference/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Submit
	void eventaHUqWoWBJEe2Zz8LOII5r3gSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gBranch.forSubmitBranch(
			title:map['title'],
			selectedFeature:map['selectedFeature'] as DIMEList<Data.Feature>,
			selectedPreferences:map['selectedPreferences'] as DIMEList<Data.Feature>,
			description:map['description']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ZI100WBHEe2Zz8LOII5r3g',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventaHU8qgWBJEe2Zz8LOII5r3gCancelTrigger(Map<String,dynamic> map)
	{
		var result = new NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_ZI100WBHEe2Zz8LOII5r3g',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB BiddingAreaEdit of Process BiddingEditProcess
	// Branch Submit
	void eventaChNewV7VEe2G_45_ZFrOzgUmwSubmitTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALBranch.forSubmitBranch(
			selectedFeatures:map['selectedFeatures'] as DIMEList<Data.Feature>,
			selectedPreferences:map['selectedPreferences'] as DIMEList<Data.Feature>,
			description:map['description']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create new feature
	void eventaIWTzYV_45_lEe2c5ZoBUTVdBwCreate_new_featureTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALBranch.forCreate_new_featureBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL',
			'Create_new_feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create new preference
	void eventaIW5CMV_45_lEe2c5ZoBUTVdBwCreate_new_preferenceTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALBranch.forCreate_new_preferenceBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL',
			'Create_new_preference/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Cancel
	void eventaa3HgQWBiEe2zFOcETdlBwQCancelTrigger(Map<String,dynamic> map)
	{
		var result = new BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB deleteBiddingConfirm of Process deleteBidding
	// Branch Confirm
	void eventabgEwwWAtEe2KJog_oImiIQConfirmTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQBranch.forConfirmBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_sR_EMGAsEe2KJog_oImiIQ',
			'Confirm/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Back
	void eventabgK3YWAtEe2KJog_oImiIQBackTrigger(Map<String,dynamic> map)
	{
		var result = new DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQBranch.forBackBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_sR_EMGAsEe2KJog_oImiIQ',
			'Back/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branches for GUISIB OfferAeraEdit of Process OfferEditProcess
	// Branch Cancel
	void eventaLGYK0HhdEe2mVL2cgUAW0ACancelTrigger(Map<String,dynamic> map)
	{
		var result = new OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwBranch.forCancelBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_kAL7QXfUEe2cGd7_OEEukw',
			'Cancel/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Submit
	void eventaLGm0UXhdEe2mVL2cgUAW0ASubmitTrigger(Map<String,dynamic> map)
	{
		var result = new OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwBranch.forSubmitBranch(
			selectedFeatures:map['selectedFeatures'] as DIMEList<Data.Feature>,
			selectedPreferences:map['selectedPreferences'] as DIMEList<Data.Feature>,
			description:map['description']
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_kAL7QXfUEe2cGd7_OEEukw',
			'Submit/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create new feature
	void eventaLHaFkXhdEe2mVL2cgUAW0ACreate_new_featureTrigger(Map<String,dynamic> map)
	{
		var result = new OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwBranch.forCreate_new_featureBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_kAL7QXfUEe2cGd7_OEEukw',
			'Create_new_feature/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
	// Branch Create new preference
	void eventaLHgzQXhdEe2mVL2cgUAW0ACreate_new_preferenceTrigger(Map<String,dynamic> map)
	{
		var result = new OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwBranch.forCreate_new_preferenceBranch(
		);
		_processService.continueProcess(
			deserializer,
			getActiveProcesses()[runtimeId].runtime,
			getRuntimeId(),
			'_kAL7QXfUEe2cGd7_OEEukw',
			'Create_new_preference/branch/public',
			result.toJSOG(),
			parentRuntimeId:getParentRuntimeId()
		)
		.then((cpr)=>processResponse(_processService,cpr))
		.catchError((e)=>processError(e));
	}
}

import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/rest/gui/UserArea_jIfqkVFOEe2J0bu3ffrh5wInput.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput.dart';
import 'package:app/src/rest/gui/CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput.dart';
import 'package:app/src/rest/gui/CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput.dart';
import 'package:app/src/rest/gui/DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput.dart';
import 'package:app/src/rest/gui/NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput.dart';
import 'package:app/src/rest/gui/BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput.dart';
import 'package:app/src/rest/gui/DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput.dart';
import 'package:app/src/rest/gui/OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput.dart';

class UserInteractionShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResponseDeserializer extends UserInteractionResponseDeserializer {
	UserInteractionResponse deserialize(String sibId,Map<String,dynamic> map, Map<String,dynamic> cache) {
switch(sibId){		case '_lsPHwVFQEe2J0bu3ffrh5w': return new UserArea_jIfqkVFOEe2J0bu3ffrh5wInput(map,cache);
		case '_AaCYMVOjEe2KQc5QIsW97w': return new OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput(map,cache);
		case '_ohLoEWBYEe22r-rMCqBFnw': return new CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput(map,cache);
		case '_432fEWBZEe22r-rMCqBFnw': return new DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwInput(map,cache);
		case '_OTSh8WDTEe22r-rMCqBFnw': return new CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput(map,cache);
		case '_BXlEAWDUEe22r-rMCqBFnw': return new CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwInput(map,cache);
		case '_Yuo5oVOlEe2KQc5QIsW97w': return new BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput(map,cache);
		case '_ot8yYWBQEe22r-rMCqBFnw': return new CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwInput(map,cache);
		case '_1kpY4XfGEe20WYdcRLAoOw': return new NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwInput(map,cache);
		case '_sumAIWAKEe2YNpeIwSxEfw': return new CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwInput(map,cache);
		case '_PnWioV-mEe2Y_7LmLNugjg': return new CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgInput(map,cache);
		case '__vHV4XfTEe2cGd7_OEEukw': return new DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwInput(map,cache);
		case '_HUNqsWBJEe2Zz8LOII5r3g': return new NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gInput(map,cache);
		case '_5k-cEV3uEe2HUMxwZL7uug': return new BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALInput(map,cache);
		case '_bfwnsWAtEe2KJog_oImiIQ': return new DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQInput(map,cache);
		case '_LFbIkHhdEe2mVL2cgUAW0A': return new OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwInput(map,cache);
}		throw new Exception("Exhaustive if for: ${sibId}");
	}
}

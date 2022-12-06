import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/rest/gui/UserArea_jIfqkVFOEe2J0bu3ffrh5wInput.dart';
import 'package:app/src/rest/gui/OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput.dart';
import 'package:app/src/rest/gui/BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput.dart';

class UserInteractionShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResponseDeserializer extends UserInteractionResponseDeserializer {
	UserInteractionResponse deserialize(String sibId,Map<String,dynamic> map, Map<String,dynamic> cache) {
switch(sibId){		case '_lsPHwVFQEe2J0bu3ffrh5w': return new UserArea_jIfqkVFOEe2J0bu3ffrh5wInput(map,cache);
		case '_AaCYMVOjEe2KQc5QIsW97w': return new OfferDetails_fcOIkVN8Ee2KQc5QIsW97wInput(map,cache);
		case '_Yuo5oVOlEe2KQc5QIsW97w': return new BiddingDetails_zSAVgVOjEe2KQc5QIsW97wInput(map,cache);
}		throw new Exception("Exhaustive if for: ${sibId}");
	}
}

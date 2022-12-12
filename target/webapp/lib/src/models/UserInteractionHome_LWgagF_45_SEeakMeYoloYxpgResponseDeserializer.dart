import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/rest/gui/AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput.dart';
import 'package:app/src/rest/gui/BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput.dart';
import 'package:app/src/rest/gui/UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput.dart';

class UserInteractionHome_LWgagF_45_SEeakMeYoloYxpgResponseDeserializer extends UserInteractionResponseDeserializer {
	UserInteractionResponse deserialize(String sibId,Map<String,dynamic> map, Map<String,dynamic> cache) {
switch(sibId){		case '_p7PywVE4Ee2Vgcav4Znc_w': return new AdminAreaHeader_ikwGUVE4Ee2Vgcav4Znc_wInput(map,cache);
		case '_rcx28FE4Ee2Vgcav4Znc_w': return new BrokerAreaHeader_kylP0VE4Ee2Vgcav4Znc_wInput(map,cache);
		case '_svmJsVE4Ee2Vgcav4Znc_w': return new UserAreaHeader_oEUtYVE4Ee2Vgcav4Znc_wInput(map,cache);
		case '_4dwC1VFMEe2J0bu3ffrh5w': return new GuardContainerInput(map);
}		throw new Exception("Exhaustive if for: ${sibId}");
	}
}

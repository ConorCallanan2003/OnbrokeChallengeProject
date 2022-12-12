import 'dart:async';
import 'dart:html';
import 'package:angular/core.dart';
import 'package:app/src/core/dime_process_service.dart';

class UserBrokerAreaHeaderUserx1Service {
    
	Future<String> syncUser() async {
		return (await HttpRequest.getString('${DIMEProcessService.getBaseUrl()}/rest/user/current/User/BrokerAreaHeaderUserSelectivex1_kylP0VE4Ee2Vgcav4Znc_w/private',withCredentials: true));
    }
    
}

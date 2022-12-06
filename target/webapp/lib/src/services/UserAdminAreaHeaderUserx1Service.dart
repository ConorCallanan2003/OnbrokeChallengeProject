import 'dart:async';
import 'dart:html';
import 'package:angular/core.dart';
import 'package:app/src/core/dime_process_service.dart';

class UserAdminAreaHeaderUserx1Service {
    
	Future<String> syncUser() async {
		return (await HttpRequest.getString('${DIMEProcessService.getBaseUrl()}/rest/user/current/User/AdminAreaHeaderUserSelectivex1_ikwGUVE4Ee2Vgcav4Znc_w/private',withCredentials: true));
    }
    
}

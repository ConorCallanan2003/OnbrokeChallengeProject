import 'dart:async';
import 'dart:html';
import 'package:angular/core.dart';
import 'package:app/src/core/dime_process_service.dart';

class UserUserAreaUserx1Service {
    
	Future<String> syncUser() async {
		return (await HttpRequest.getString('${DIMEProcessService.getBaseUrl()}/rest/user/current/User/UserAreaUserSelectivex1_jIfqkVFOEe2J0bu3ffrh5w/private',withCredentials: true));
    }
    
}

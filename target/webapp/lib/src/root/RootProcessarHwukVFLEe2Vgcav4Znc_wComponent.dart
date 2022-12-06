// routing wrapper for the ShowAdminArea process
import 'package:angular/angular.dart';	
import 'package:angular_router/angular_router.dart';
import 'dart:html';
import 'dart:convert';
import 'package:app/src/core/AbstractRoutes.dart';
import 'package:app/src/core/dime_process_service.dart';
import 'package:app/src/login/Login.dart' as login;
import 'package:app/src/notification/notification_component.dart';

//Data
import 'package:app/src/models/FileReference.dart';
import 'package:app/src/models/Selectives.dart';
import 'package:app/src/data/Data.dart' as Data;
//Process
import 'package:app/src/process/ProcessarHwukVFLEe2Vgcav4Znc_wComponent.dart';
//Deserializer
import 'package:app/src/models/UserInteractionShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResponseDeserializer.dart';

@Component(
  	selector: 'root-ShowAdminArea-arHwukVFLEe2Vgcav4Znc_w-process',
  	directives: const [coreDirectives,ProcessarHwukVFLEe2Vgcav4Znc_wComponent,login.Login],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<ShowAdminArea-arHwukVFLEe2Vgcav4Znc_w-process
		*ngIf="!showLogin&&runtime!=null"
		[runtimeId]="runtimeId"
		[parentRuntimeId]="parentRuntimeId"
		[majorSIB]="runtime.majorSIB"
		[minorSIB]="runtime.minorSIB"
		[majorInput]="runtime.majorInput"
		[minorInput]="runtime.minorInput"
		[deserializer]="deserializer"
	>
	</ShowAdminArea-arHwukVFLEe2Vgcav4Znc_w-process>
	'''
)
class RootProcessarHwukVFLEe2Vgcav4Znc_wComponent extends RootProcess implements OnInit {
	
	
	@Input()
	String startPointId;
	
	@Input()
	String parentRuntimeId;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final UserInteractionShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResponseDeserializer deserializer = new UserInteractionShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResponseDeserializer();
	
	final NotificationService _notificationService;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	RootProcessarHwukVFLEe2Vgcav4Znc_wComponent(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
	
	void retry() {
		retryAfterLogin(_processService,"ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w");
	}
	
	@override
	ngOnInit() {
		
		if(startPointId==null||startPointId=='arU2IUVFLEe2Vgcav4Znc_w') {
			Map<Object,dynamic> cache = new Map();
			_processService.startProcess(
				'ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w/public',
				deserializer,
				{
				},
				parentRuntimeId:parentRuntimeId
			)
			.then((sr)=>processResponse(_processService,sr))
			.catchError((e)=>processError(e));
		
		}
		 else {
			print("Cannot start process ShowAdminArea with start point id ${startPointId}");
		}
	}
	
	@override
	Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
	
	@override
	String getParentRuntimeId() => parentRuntimeId;
	
	@override
	String getGUIId() => null;
	
	@override
	Router getRouter() => _router;
	
	@override
	NotificationService getNotificationService() => _notificationService;
}

@Component(
	  	selector: 'root-ShowAdminArea-arHwukVFLEe2Vgcav4Znc_w-process',
	  	directives: const [coreDirectives,ProcessarHwukVFLEe2Vgcav4Znc_wComponent,login.Login],
		template: '''
		<login-form 
			*ngIf="showLogin"
			(signedin)="retry()"
			[modal]="false"
		></login-form>
		<ShowAdminArea-arHwukVFLEe2Vgcav4Znc_w-process
			*ngIf="!showLogin&&runtime!=null"
			[runtimeId]="runtimeId"
			[parentRuntimeId]="parentRuntimeId"
			[majorSIB]="runtime.majorSIB"
			[minorSIB]="runtime.minorSIB"
			[majorInput]="runtime.majorInput"
			[minorInput]="runtime.minorInput"
			[guiId]="guiId"
			[sibId]="sibId"
			[deserializer]="deserializer"
		>
		</ShowAdminArea-arHwukVFLEe2Vgcav4Znc_w-process>
		'''
	)
	class RootProcessarHwukVFLEe2Vgcav4Znc_wComponentSIB extends RootProcess implements AfterChanges {
		
		
		@Input()
		String startPointId;
		
		@Input()
		String sibId;
		
		@Input()
		String guiId;
		
		@Input()
		String parentRuntimeId;
		
		
		final DIMEProcessService _processService;
		
		final NotificationService _notificationService;
		
		final Router _router;
		
		final UserInteractionShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResponseDeserializer deserializer = new UserInteractionShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResponseDeserializer();
		
		@override
		UserInteractionResponseDeserializer getDeserializer() => deserializer;
		
		RootProcessarHwukVFLEe2Vgcav4Znc_wComponentSIB(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
		
		void retry() {
			retryAfterLogin(_processService,"ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w",sibId:sibId);
		}
		
		@override
		ngAfterChanges() {
			restart();
		}
		
		
		void restart() {
			if(startPointId==null||startPointId=='arU2IUVFLEe2Vgcav4Znc_w') {
				Map<Object,dynamic> cache = new Map();
				_processService.startProcess(
					"ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w/${sibId}/public",
					deserializer,
					{
					},
					parentRuntimeId:parentRuntimeId,
					guiId:guiId
				)
				.then((sr)=>processResponse(_processService,sr))
				.catchError((e)=>processError(e));
			
			} else {
				print("Cannot start process ShowAdminArea with start point id ${startPointId}");
			}
		}
		
		@override
		Map<String,ActiveProcess> getActiveProcesses() => _processService.activeProcesses;
		
		@override
		String getParentRuntimeId() => parentRuntimeId;
		
		@override
		String getGUIId() => guiId;
		
		@override
		Router getRouter() => _router;
		
		@override
		NotificationService getNotificationService() => _notificationService;
	}


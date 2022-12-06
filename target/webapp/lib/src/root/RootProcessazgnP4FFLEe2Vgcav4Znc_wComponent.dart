// routing wrapper for the ShowBrokerArea process
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
import 'package:app/src/process/ProcessazgnP4FFLEe2Vgcav4Znc_wComponent.dart';
//Deserializer
import 'package:app/src/models/UserInteractionShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResponseDeserializer.dart';

@Component(
  	selector: 'root-ShowBrokerArea-azgnP4FFLEe2Vgcav4Znc_w-process',
  	directives: const [coreDirectives,ProcessazgnP4FFLEe2Vgcav4Znc_wComponent,login.Login],
	template: '''
	<login-form 
		*ngIf="showLogin"
		(signedin)="retry()"
		[modal]="false"
	></login-form>
	<ShowBrokerArea-azgnP4FFLEe2Vgcav4Znc_w-process
		*ngIf="!showLogin&&runtime!=null"
		[runtimeId]="runtimeId"
		[parentRuntimeId]="parentRuntimeId"
		[majorSIB]="runtime.majorSIB"
		[minorSIB]="runtime.minorSIB"
		[majorInput]="runtime.majorInput"
		[minorInput]="runtime.minorInput"
		[deserializer]="deserializer"
	>
	</ShowBrokerArea-azgnP4FFLEe2Vgcav4Znc_w-process>
	'''
)
class RootProcessazgnP4FFLEe2Vgcav4Znc_wComponent extends RootProcess implements OnInit {
	
	
	@Input()
	String startPointId;
	
	@Input()
	String parentRuntimeId;
	
	final DIMEProcessService _processService;
	
	final Router _router;
	
	final UserInteractionShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResponseDeserializer deserializer = new UserInteractionShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResponseDeserializer();
	
	final NotificationService _notificationService;
	
	@override
	UserInteractionResponseDeserializer getDeserializer() => deserializer;
	
	RootProcessazgnP4FFLEe2Vgcav4Znc_wComponent(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
	
	void retry() {
		retryAfterLogin(_processService,"ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w");
	}
	
	@override
	ngOnInit() {
		
		if(startPointId==null||startPointId=='azrg4UVFLEe2Vgcav4Znc_w') {
			Map<Object,dynamic> cache = new Map();
			_processService.startProcess(
				'ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w/public',
				deserializer,
				{
				},
				parentRuntimeId:parentRuntimeId
			)
			.then((sr)=>processResponse(_processService,sr))
			.catchError((e)=>processError(e));
		
		}
		 else {
			print("Cannot start process ShowBrokerArea with start point id ${startPointId}");
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
	  	selector: 'root-ShowBrokerArea-azgnP4FFLEe2Vgcav4Znc_w-process',
	  	directives: const [coreDirectives,ProcessazgnP4FFLEe2Vgcav4Znc_wComponent,login.Login],
		template: '''
		<login-form 
			*ngIf="showLogin"
			(signedin)="retry()"
			[modal]="false"
		></login-form>
		<ShowBrokerArea-azgnP4FFLEe2Vgcav4Znc_w-process
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
		</ShowBrokerArea-azgnP4FFLEe2Vgcav4Znc_w-process>
		'''
	)
	class RootProcessazgnP4FFLEe2Vgcav4Znc_wComponentSIB extends RootProcess implements AfterChanges {
		
		
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
		
		final UserInteractionShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResponseDeserializer deserializer = new UserInteractionShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResponseDeserializer();
		
		@override
		UserInteractionResponseDeserializer getDeserializer() => deserializer;
		
		RootProcessazgnP4FFLEe2Vgcav4Znc_wComponentSIB(this._processService,this._router,this._notificationService, AbstractRoutes routes): super(routes);
		
		void retry() {
			retryAfterLogin(_processService,"ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w",sibId:sibId);
		}
		
		@override
		ngAfterChanges() {
			restart();
		}
		
		
		void restart() {
			if(startPointId==null||startPointId=='azrg4UVFLEe2Vgcav4Znc_w') {
				Map<Object,dynamic> cache = new Map();
				_processService.startProcess(
					"ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w/${sibId}/public",
					deserializer,
					{
					},
					parentRuntimeId:parentRuntimeId,
					guiId:guiId
				)
				.then((sr)=>processResponse(_processService,sr))
				.catchError((e)=>processError(e));
			
			} else {
				print("Cannot start process ShowBrokerArea with start point id ${startPointId}");
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


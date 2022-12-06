package info.scce.dime.process.onbroke.models.startup.model__HYPHEN_MINUS__gen;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Date;
import java.util.UUID;
import java.util.Optional;

import javax.enterprise.inject.spi.BeanManager;
import javax.inject.Inject;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

import info.scce.dime.exception.GUIEncounteredSignal;
import info.scce.dime.exception.GUIEncounteredSignal.GUIInfo;
import info.scce.dime.process.CallFrame;
import info.scce.dime.process.DIMEProcess;
import info.scce.dime.process.DIMEProcessContext;
import info.scce.dime.process.JSONContext;
import info.scce.dime.process.ProcessCallFrame;
import info.scce.dime.util.CDIUtil;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@info.scce.dime.process.RequiresDI
public final class CreateTestData_zn_1sEt2Ee22z989Tp8YUw implements DIMEProcess {


	// attributes shaping the context variables.
	public static class Context implements DIMEProcessContext {

		// bean manager
		private BeanManager beanManager;
		
		// current eventID
		private String eventId;
		
		// last MajorSIBId
		private String lastMajorSIBId;
		
		// current MajorGUI
		private GUIInfo majorGUIState = null;

		// stack variables
		private ProcessCallFrame callStack = new ProcessCallFrame();

		// context variables.
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> features_vPSTMWEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_vPz3oGEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Comment> comments_vQM5MGEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Issue> issues_vQUN8GEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_vRsuAGEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> features_vTA8oGEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_vTkWQGEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> features_vUuz4GEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_vVaJUGEmEe22eKBh7MAS9A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_vWhjoGEmEe22eKBh7MAS9A = new ArrayList<>();
		// direct dataflow variables.
		private java.lang.String HashPasswordSuccessHashedPassword_vOzyEGEmEe22eKBh7MAS9A;
		private java.lang.String HashPasswordSuccessHashedPassword_vRItUGEmEe22eKBh7MAS9A;
		private java.lang.String HashPasswordSuccessHashedPassword_vSdjAGEmEe22eKBh7MAS9A;
		private java.lang.String HashPasswordSuccessHashedPassword_vXLq8mEmEe22eKBh7MAS9A;
		private java.lang.String HashPasswordSuccessHashedPassword_vYU6cmEmEe22eKBh7MAS9A;
		private java.lang.String HashPasswordSuccessHashedPassword_vZh0UGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Decision Create_DecisionSuccessCreated_vM8J0GEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState Get_DecisionStateApprovedLiteral_vNCQcGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Report Create_ReportSuccessCreated_vNTWMmEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleUserLiteral_vNyeYWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_vOdz0GEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vPE30mEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vPix4WEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityHighLiteral_vPmcQWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue Create_IssueSuccessCreated_vP8agGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment Create_CommentSuccessCreated_vQB6EWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment Create_CommentSuccessCreated_vQGLgmEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Report Create_ReportSuccessCreated_vQjegGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleUserLiteral_vQ1yYGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_vRB_omEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vRbBMWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityHighLiteral_vRi9AWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Decision Create_DecisionSuccessCreated_vR8loGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState Get_DecisionStateRejectedLiteral_vR__HYPHEN_MINUS__a0WEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Report Create_ReportSuccessCreated_vSG9smEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleUserLiteral_vSQusmEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_vSZ4omEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vS4ZwWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vTMi0WEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityLowLiteral_vTW64GEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer Create_OfferSuccessCreated_vTv8cWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vUXngWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vVBu0WEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityLowLiteral_vVKRsWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_vVrPEWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_vWLlYWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityMediumLiteral_vWWkgGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_vWpfcWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleAdminLiteral_vWvmEGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_vXDIEWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_vX9HAWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleBrokerLiteral_vYDNoWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_vYR3IGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_vYzbkGEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleBrokerLiteral_vY47IWEmEe22eKBh7MAS9A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_vZRVoGEmEe22eKBh7MAS9A;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_vL3LwGEmEe22eKBh7MAS9A,
	_vMcakGEmEe22eKBh7MAS9A,
	_vMvVgGEmEe22eKBh7MAS9A,
	_vMzm8GEmEe22eKBh7MAS9A,
	_vM67sGEmEe22eKBh7MAS9A,
	_vM9X8GEmEe22eKBh7MAS9A,
	_vNDekGEmEe22eKBh7MAS9A,
	_vNPEwGEmEe22eKBh7MAS9A,
	_vNSIEGEmEe22eKBh7MAS9A,
	_vNXnoGEmEe22eKBh7MAS9A,
	_vNcgIWEmEe22eKBh7MAS9A,
	_vNxQQGEmEe22eKBh7MAS9A,
	_vNzFcWEmEe22eKBh7MAS9A,
	_vOMuEWEmEe22eKBh7MAS9A,
	_vOXGIGEmEe22eKBh7MAS9A,
	_vOfpAGEmEe22eKBh7MAS9A,
	_vO3ccGEmEe22eKBh7MAS9A,
	_vO_YQGEmEe22eKBh7MAS9A,
	_vPEQwGEmEe22eKBh7MAS9A,
	_vPRsIGEmEe22eKBh7MAS9A,
	_vPdSUGEmEe22eKBh7MAS9A,
	_vPg8sGEmEe22eKBh7MAS9A,
	_vPlOIGEmEe22eKBh7MAS9A,
	_vPqGoGEmEe22eKBh7MAS9A,
	_vPzQkGEmEe22eKBh7MAS9A,
	_vP3iAGEmEe22eKBh7MAS9A,
	_vP6lUGEmEe22eKBh7MAS9A,
	_vP9ooGEmEe22eKBh7MAS9A,
	_vQAE4GEmEe22eKBh7MAS9A,
	_vQE9YGEmEe22eKBh7MAS9A,
	_vQLEAGEmEe22eKBh7MAS9A,
	_vQS_0GEmEe22eKBh7MAS9A,
	_vQZtgGEmEe22eKBh7MAS9A,
	_vQbisGEmEe22eKBh7MAS9A,
	_vQemAWEmEe22eKBh7MAS9A,
	_vQhpUWEmEe22eKBh7MAS9A,
	_vQlTsWEmEe22eKBh7MAS9A,
	_vQnv8GEmEe22eKBh7MAS9A,
	_vQ0kQGEmEe22eKBh7MAS9A,
	_vQ3AgGEmEe22eKBh7MAS9A,
	_vQ__HYPHEN_MINUS__VQWEmEe22eKBh7MAS9A,
	_vRAxgWEmEe22eKBh7MAS9A,
	_vRDNwGEmEe22eKBh7MAS9A,
	_vROM4GEmEe22eKBh7MAS9A,
	_vRVhoGEmEe22eKBh7MAS9A,
	_vRZzEGEmEe22eKBh7MAS9A,
	_vRddcGEmEe22eKBh7MAS9A,
	_vRkLIGEmEe22eKBh7MAS9A,
	_vRpqsGEmEe22eKBh7MAS9A,
	_vRy0oGEmEe22eKBh7MAS9A,
	_vR138GEmEe22eKBh7MAS9A,
	_vR4UMGEmEe22eKBh7MAS9A,
	_vR6JYmEmEe22eKBh7MAS9A,
	_vR9zwGEmEe22eKBh7MAS9A,
	_vR_o8GEmEe22eKBh7MAS9A,
	_vSDTUGEmEe22eKBh7MAS9A,
	_vSFvkGEmEe22eKBh7MAS9A,
	_vSJZ8GEmEe22eKBh7MAS9A,
	_vSL2MGEmEe22eKBh7MAS9A,
	_vSQHoGEmEe22eKBh7MAS9A,
	_vSTK8GEmEe22eKBh7MAS9A,
	_vSWOQWEmEe22eKBh7MAS9A,
	_vSYqgWEmEe22eKBh7MAS9A,
	_vSbt0GEmEe22eKBh7MAS9A,
	_vSnUAGEmEe22eKBh7MAS9A,
	_vSvP0GEmEe22eKBh7MAS9A,
	_vSzhQGEmEe22eKBh7MAS9A,
	_vS95UGEmEe22eKBh7MAS9A,
	_vTF1IGEmEe22eKBh7MAS9A,
	_vTKtoGEmEe22eKBh7MAS9A,
	_vTVswGEmEe22eKBh7MAS9A,
	_vTXh8WEmEe22eKBh7MAS9A,
	_vTjvMGEmEe22eKBh7MAS9A,
	_vTuHQWEmEe22eKBh7MAS9A,
	_vTyYsGEmEe22eKBh7MAS9A,
	_vT8wwGEmEe22eKBh7MAS9A,
	_vT_0EGEmEe22eKBh7MAS9A,
	_vUIW8GEmEe22eKBh7MAS9A,
	_vUMBUGEmEe22eKBh7MAS9A,
	_vUUkMGEmEe22eKBh7MAS9A,
	_vUqicGEmEe22eKBh7MAS9A,
	_vU2vsGEmEe22eKBh7MAS9A,
	_vU_5oGEmEe22eKBh7MAS9A,
	_vVJDkGEmEe22eKBh7MAS9A,
	_vVLf0GEmEe22eKBh7MAS9A,
	_vVYUIWEmEe22eKBh7MAS9A,
	_vVpZ4GEmEe22eKBh7MAS9A,
	_vVtEQGEmEe22eKBh7MAS9A,
	_vV21QGEmEe22eKBh7MAS9A,
	_vV7twGEmEe22eKBh7MAS9A,
	_vWH7AGEmEe22eKBh7MAS9A,
	_vWP20GEmEe22eKBh7MAS9A,
	_vWYZsGEmEe22eKBh7MAS9A,
	_vWg8kGEmEe22eKBh7MAS9A,
	_vWnqQGEmEe22eKBh7MAS9A,
	_vWsiwGEmEe22eKBh7MAS9A,
	_vW1FoGEmEe22eKBh7MAS9A,
	_vW4wAWEmEe22eKBh7MAS9A,
	_vXAr0GEmEe22eKBh7MAS9A,
	_vXJ1wGEmEe22eKBh7MAS9A,
	_vXTmwWEmEe22eKBh7MAS9A,
	_vXfM8GEmEe22eKBh7MAS9A,
	_vYCmkGEmEe22eKBh7MAS9A,
	_vYFC0GEmEe22eKBh7MAS9A,
	_vYIGIWEmEe22eKBh7MAS9A,
	_vYQB8GEmEe22eKBh7MAS9A,
	_vYTFQGEmEe22eKBh7MAS9A,
	_vYc2QGEmEe22eKBh7MAS9A,
	_vYujEGEmEe22eKBh7MAS9A,
	_vY3tAGEmEe22eKBh7MAS9A,
	_vY6JQGEmEe22eKBh7MAS9A,
	_vZFIYGEmEe22eKBh7MAS9A,
	_vZJZ0GEmEe22eKBh7MAS9A,
	_vZbtsGEmEe22eKBh7MAS9A,
	_vZrlUGEmEe22eKBh7MAS9A,
	_vZ3ykGEmEe22eKBh7MAS9A,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController DecisionController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.ReportController ReportController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.IssueController IssueController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController CommentController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;

	@Inject
	public CreateTestData_zn_1sEt2Ee22z989Tp8YUw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController, de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController, de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController DecisionController, de.ls5.dywa.generated.controller.onbroke.models.app.ReportController ReportController, de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController, de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController, de.ls5.dywa.generated.controller.onbroke.models.app.IssueController IssueController, de.ls5.dywa.generated.controller.onbroke.models.app.CommentController CommentController, de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController) {
		this.beanManager = beanManager;
		this.FeatureController = FeatureController;
		this.OfferController = OfferController;
		this.DecisionController = DecisionController;
		this.ReportController = ReportController;
		this.UserController = UserController;
		this.BaseUserController = BaseUserController;
		this.IssueController = IssueController;
		this.CommentController = CommentController;
		this.BiddingController = BiddingController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._vL3LwGEmEe22eKBh7MAS9A);
	}
	
	

	@Override
	public CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _vL3LwGEmEe22eKBh7MAS9A: {
					curr = execute_vL3LwGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vMcakGEmEe22eKBh7MAS9A: {
					curr = execute_vMcakGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vMvVgGEmEe22eKBh7MAS9A: {
					curr = execute_vMvVgGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vMzm8GEmEe22eKBh7MAS9A: {
					curr = execute_vMzm8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vM67sGEmEe22eKBh7MAS9A: {
					curr = execute_vM67sGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vM9X8GEmEe22eKBh7MAS9A: {
					curr = execute_vM9X8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vNDekGEmEe22eKBh7MAS9A: {
					curr = execute_vNDekGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vNPEwGEmEe22eKBh7MAS9A: {
					curr = execute_vNPEwGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vNSIEGEmEe22eKBh7MAS9A: {
					curr = execute_vNSIEGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vNXnoGEmEe22eKBh7MAS9A: {
					curr = execute_vNXnoGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vNcgIWEmEe22eKBh7MAS9A: {
					curr = execute_vNcgIWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vNxQQGEmEe22eKBh7MAS9A: {
					curr = execute_vNxQQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vNzFcWEmEe22eKBh7MAS9A: {
					curr = execute_vNzFcWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vOMuEWEmEe22eKBh7MAS9A: {
					curr = execute_vOMuEWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vOXGIGEmEe22eKBh7MAS9A: {
					curr = execute_vOXGIGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vOfpAGEmEe22eKBh7MAS9A: {
					curr = execute_vOfpAGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vO3ccGEmEe22eKBh7MAS9A: {
					curr = execute_vO3ccGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vO_YQGEmEe22eKBh7MAS9A: {
					curr = execute_vO_YQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vPEQwGEmEe22eKBh7MAS9A: {
					curr = execute_vPEQwGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vPRsIGEmEe22eKBh7MAS9A: {
					curr = execute_vPRsIGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vPdSUGEmEe22eKBh7MAS9A: {
					curr = execute_vPdSUGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vPg8sGEmEe22eKBh7MAS9A: {
					curr = execute_vPg8sGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vPlOIGEmEe22eKBh7MAS9A: {
					curr = execute_vPlOIGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vPqGoGEmEe22eKBh7MAS9A: {
					curr = execute_vPqGoGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vPzQkGEmEe22eKBh7MAS9A: {
					curr = execute_vPzQkGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vP3iAGEmEe22eKBh7MAS9A: {
					curr = execute_vP3iAGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vP6lUGEmEe22eKBh7MAS9A: {
					curr = execute_vP6lUGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vP9ooGEmEe22eKBh7MAS9A: {
					curr = execute_vP9ooGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQAE4GEmEe22eKBh7MAS9A: {
					curr = execute_vQAE4GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQE9YGEmEe22eKBh7MAS9A: {
					curr = execute_vQE9YGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQLEAGEmEe22eKBh7MAS9A: {
					curr = execute_vQLEAGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQS_0GEmEe22eKBh7MAS9A: {
					curr = execute_vQS_0GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQZtgGEmEe22eKBh7MAS9A: {
					curr = execute_vQZtgGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQbisGEmEe22eKBh7MAS9A: {
					curr = execute_vQbisGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQemAWEmEe22eKBh7MAS9A: {
					curr = execute_vQemAWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQhpUWEmEe22eKBh7MAS9A: {
					curr = execute_vQhpUWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQlTsWEmEe22eKBh7MAS9A: {
					curr = execute_vQlTsWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQnv8GEmEe22eKBh7MAS9A: {
					curr = execute_vQnv8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQ0kQGEmEe22eKBh7MAS9A: {
					curr = execute_vQ0kQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQ3AgGEmEe22eKBh7MAS9A: {
					curr = execute_vQ3AgGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vQ__HYPHEN_MINUS__VQWEmEe22eKBh7MAS9A: {
					curr = execute_vQ__HYPHEN_MINUS__VQWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRAxgWEmEe22eKBh7MAS9A: {
					curr = execute_vRAxgWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRDNwGEmEe22eKBh7MAS9A: {
					curr = execute_vRDNwGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vROM4GEmEe22eKBh7MAS9A: {
					curr = execute_vROM4GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRVhoGEmEe22eKBh7MAS9A: {
					curr = execute_vRVhoGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRZzEGEmEe22eKBh7MAS9A: {
					curr = execute_vRZzEGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRddcGEmEe22eKBh7MAS9A: {
					curr = execute_vRddcGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRkLIGEmEe22eKBh7MAS9A: {
					curr = execute_vRkLIGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRpqsGEmEe22eKBh7MAS9A: {
					curr = execute_vRpqsGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vRy0oGEmEe22eKBh7MAS9A: {
					curr = execute_vRy0oGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vR138GEmEe22eKBh7MAS9A: {
					curr = execute_vR138GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vR4UMGEmEe22eKBh7MAS9A: {
					curr = execute_vR4UMGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vR6JYmEmEe22eKBh7MAS9A: {
					curr = execute_vR6JYmEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vR9zwGEmEe22eKBh7MAS9A: {
					curr = execute_vR9zwGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vR_o8GEmEe22eKBh7MAS9A: {
					curr = execute_vR_o8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSDTUGEmEe22eKBh7MAS9A: {
					curr = execute_vSDTUGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSFvkGEmEe22eKBh7MAS9A: {
					curr = execute_vSFvkGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSJZ8GEmEe22eKBh7MAS9A: {
					curr = execute_vSJZ8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSL2MGEmEe22eKBh7MAS9A: {
					curr = execute_vSL2MGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSQHoGEmEe22eKBh7MAS9A: {
					curr = execute_vSQHoGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSTK8GEmEe22eKBh7MAS9A: {
					curr = execute_vSTK8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSWOQWEmEe22eKBh7MAS9A: {
					curr = execute_vSWOQWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSYqgWEmEe22eKBh7MAS9A: {
					curr = execute_vSYqgWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSbt0GEmEe22eKBh7MAS9A: {
					curr = execute_vSbt0GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSnUAGEmEe22eKBh7MAS9A: {
					curr = execute_vSnUAGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSvP0GEmEe22eKBh7MAS9A: {
					curr = execute_vSvP0GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vSzhQGEmEe22eKBh7MAS9A: {
					curr = execute_vSzhQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vS95UGEmEe22eKBh7MAS9A: {
					curr = execute_vS95UGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vTF1IGEmEe22eKBh7MAS9A: {
					curr = execute_vTF1IGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vTKtoGEmEe22eKBh7MAS9A: {
					curr = execute_vTKtoGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vTVswGEmEe22eKBh7MAS9A: {
					curr = execute_vTVswGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vTXh8WEmEe22eKBh7MAS9A: {
					curr = execute_vTXh8WEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vTjvMGEmEe22eKBh7MAS9A: {
					curr = execute_vTjvMGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vTuHQWEmEe22eKBh7MAS9A: {
					curr = execute_vTuHQWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vTyYsGEmEe22eKBh7MAS9A: {
					curr = execute_vTyYsGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vT8wwGEmEe22eKBh7MAS9A: {
					curr = execute_vT8wwGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vT_0EGEmEe22eKBh7MAS9A: {
					curr = execute_vT_0EGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vUIW8GEmEe22eKBh7MAS9A: {
					curr = execute_vUIW8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vUMBUGEmEe22eKBh7MAS9A: {
					curr = execute_vUMBUGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vUUkMGEmEe22eKBh7MAS9A: {
					curr = execute_vUUkMGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vUqicGEmEe22eKBh7MAS9A: {
					curr = execute_vUqicGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vU2vsGEmEe22eKBh7MAS9A: {
					curr = execute_vU2vsGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vU_5oGEmEe22eKBh7MAS9A: {
					curr = execute_vU_5oGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vVJDkGEmEe22eKBh7MAS9A: {
					curr = execute_vVJDkGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vVLf0GEmEe22eKBh7MAS9A: {
					curr = execute_vVLf0GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vVYUIWEmEe22eKBh7MAS9A: {
					curr = execute_vVYUIWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vVpZ4GEmEe22eKBh7MAS9A: {
					curr = execute_vVpZ4GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vVtEQGEmEe22eKBh7MAS9A: {
					curr = execute_vVtEQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vV21QGEmEe22eKBh7MAS9A: {
					curr = execute_vV21QGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vV7twGEmEe22eKBh7MAS9A: {
					curr = execute_vV7twGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vWH7AGEmEe22eKBh7MAS9A: {
					curr = execute_vWH7AGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vWP20GEmEe22eKBh7MAS9A: {
					curr = execute_vWP20GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vWYZsGEmEe22eKBh7MAS9A: {
					curr = execute_vWYZsGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vWg8kGEmEe22eKBh7MAS9A: {
					curr = execute_vWg8kGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vWnqQGEmEe22eKBh7MAS9A: {
					curr = execute_vWnqQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vWsiwGEmEe22eKBh7MAS9A: {
					curr = execute_vWsiwGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vW1FoGEmEe22eKBh7MAS9A: {
					curr = execute_vW1FoGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vW4wAWEmEe22eKBh7MAS9A: {
					curr = execute_vW4wAWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vXAr0GEmEe22eKBh7MAS9A: {
					curr = execute_vXAr0GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vXJ1wGEmEe22eKBh7MAS9A: {
					curr = execute_vXJ1wGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vXTmwWEmEe22eKBh7MAS9A: {
					curr = execute_vXTmwWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vXfM8GEmEe22eKBh7MAS9A: {
					curr = execute_vXfM8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vYCmkGEmEe22eKBh7MAS9A: {
					curr = execute_vYCmkGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vYFC0GEmEe22eKBh7MAS9A: {
					curr = execute_vYFC0GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vYIGIWEmEe22eKBh7MAS9A: {
					curr = execute_vYIGIWEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vYQB8GEmEe22eKBh7MAS9A: {
					curr = execute_vYQB8GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vYTFQGEmEe22eKBh7MAS9A: {
					curr = execute_vYTFQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vYc2QGEmEe22eKBh7MAS9A: {
					curr = execute_vYc2QGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vYujEGEmEe22eKBh7MAS9A: {
					curr = execute_vYujEGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vY3tAGEmEe22eKBh7MAS9A: {
					curr = execute_vY3tAGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vY6JQGEmEe22eKBh7MAS9A: {
					curr = execute_vY6JQGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vZFIYGEmEe22eKBh7MAS9A: {
					curr = execute_vZFIYGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vZJZ0GEmEe22eKBh7MAS9A: {
					curr = execute_vZJZ0GEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vZbtsGEmEe22eKBh7MAS9A: {
					curr = execute_vZbtsGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vZrlUGEmEe22eKBh7MAS9A: {
					curr = execute_vZrlUGEmEe22eKBh7MAS9A(ctx);
					break;
				}
				case _vZ3ykGEmEe22eKBh7MAS9A: {
					return execute_vZ3ykGEmEe22eKBh7MAS9A(ctx);
				}
				default: {
					throw new IllegalStateException("unhandled SIB container " + curr);
				}
			}
		}
	}
	
	/**
	 * The return type for this process. It stores the corresponding branch name 
	 * as well as the corresponding result for the branch.
	 */
	public static class CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_vZ3ykGEmEe22eKBh7MAS9A";
			this.success = success;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public SuccessReturn getSuccessReturn() {
			return success;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>success</code>.
		 */
		public interface SuccessReturn {
		}
	
		/**
		 * Return type of branch <code>success</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class SuccessReturnImpl implements SuccessReturn {

			private final Context ctx;

	        SuccessReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vL3LwGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create("Feature featTmpl");
	
		createdObj.setisTemplateForOffer(true);
		createdObj.settitle("3 Year Warranty");
	
	
		// branch 'success'
		return SIB_ID._vMcakGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vMcakGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create("Feature attrTmpl");
	
		createdObj.setisTemplateForBidding(true);
		createdObj.settitle("Cash Payment");
	
	
		// branch 'success'
		return SIB_ID._vMvVgGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Offer'.
	public SIB_ID execute_vMvVgGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer createdObj = domController.create("Offer offer1");
	
		createdObj.settitle("Awesome Product");
		createdObj.setassigned(false);
	
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vM67sGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set decision' setting a new attribute value.
	public SIB_ID execute_vMzm8GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A.setdecision(ctx.Create_DecisionSuccessCreated_vM8J0GEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vNSIEGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Decision'.
	public SIB_ID execute_vM67sGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController domController = this.DecisionController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision createdObj = domController.create(null);
	
	
		ctx.Create_DecisionSuccessCreated_vM8J0GEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_DecisionSuccessCreated_vM8J0GEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vM9X8GEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get DecisionState'.
	public SIB_ID execute_vM9X8GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_DecisionStateApprovedLiteral_vNCQcGEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState.approved;
		// branch 'approved'
		return SIB_ID._vNDekGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set state' setting a new attribute value.
	public SIB_ID execute_vNDekGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_DecisionSuccessCreated_vM8J0GEmEe22eKBh7MAS9A.setstate(ctx.Get_DecisionStateApprovedLiteral_vNCQcGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vMzm8GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set report' setting a new attribute value.
	public SIB_ID execute_vNPEwGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A.setreport(ctx.Create_ReportSuccessCreated_vNTWMmEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vNcgIWEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Report'.
	public SIB_ID execute_vNSIEGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.ReportController domController = this.ReportController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Report createdObj = domController.create(null);
	
	
		ctx.Create_ReportSuccessCreated_vNTWMmEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vNPEwGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_vNXnoGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A.setuser(ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vPEQwGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_vNcgIWEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create(null);
	
		createdObj.setfirstName("Homer");
		createdObj.setlastName("Simpson");
	
		ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vNxQQGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_vNxQQGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_UserRoleUserLiteral_vNyeYWEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.user;
		// branch 'user'
		return SIB_ID._vNzFcWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_vNzFcWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A.setrole(ctx.Get_UserRoleUserLiteral_vNyeYWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vOXGIGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_vOMuEWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A.setbaseUser(ctx.Create_BaseUserSuccessCreated_vOdz0GEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vNXnoGEmEe22eKBh7MAS9A;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_vOXGIGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("user");
	
		ctx.Create_BaseUserSuccessCreated_vOdz0GEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BaseUserSuccessCreated_vOdz0GEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vOfpAGEmEe22eKBh7MAS9A;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_vOfpAGEmEe22eKBh7MAS9A(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_vOzyEGEmEe22eKBh7MAS9A = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._vO3ccGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_vO3ccGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_vOdz0GEmEe22eKBh7MAS9A.setpassword(ctx.HashPasswordSuccessHashedPassword_vOzyEGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vOMuEWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vO_YQGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value0 = ctx.Create_FeatureSuccessCreated_vPE30mEmEe22eKBh7MAS9A;
			if (value0 != null) { // prevent null in lists
			ctx.features_vPSTMWEmEe22eKBh7MAS9A.add(value0);
			}
			// branch 'success'
			return SIB_ID._vPRsIGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vPEQwGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_vPE30mEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vO_YQGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_vPRsIGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A.setfeatures_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.features_vPSTMWEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vPg8sGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vPdSUGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value1 = ctx.Create_FeatureSuccessCreated_vPix4WEmEe22eKBh7MAS9A;
			if (value1 != null) { // prevent null in lists
			ctx.preferences_vPz3oGEmEe22eKBh7MAS9A.add(value1);
			}
			// branch 'success'
			return SIB_ID._vPzQkGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vPg8sGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForBidding(false);
		createdObj.settitle("Cash Payment");
	
		ctx.Create_FeatureSuccessCreated_vPix4WEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_FeatureSuccessCreated_vPix4WEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vPlOIGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_vPlOIGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_PriorityHighLiteral_vPmcQWEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.high;
		// branch 'high'
		return SIB_ID._vPqGoGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_vPqGoGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_vPix4WEmEe22eKBh7MAS9A.setpriority(ctx.Get_PriorityHighLiteral_vPmcQWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vPdSUGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_vPzQkGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_vPz3oGEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vP6lUGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Issue' putting complex value of type 'Issue' to context.
	public SIB_ID execute_vP3iAGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Issue value2 = ctx.Create_IssueSuccessCreated_vP8agGEmEe22eKBh7MAS9A;
			if (value2 != null) { // prevent null in lists
			ctx.issues_vQUN8GEmEe22eKBh7MAS9A.add(value2);
			}
			// branch 'success'
			return SIB_ID._vQS_0GEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Issue'.
	public SIB_ID execute_vP6lUGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.IssueController domController = this.IssueController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Issue createdObj = domController.create(null);
	
		createdObj.settitle("The title is confusing");
	
		ctx.Create_IssueSuccessCreated_vP8agGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_IssueSuccessCreated_vP8agGEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vQAE4GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Comment' putting complex value of type 'Comment' to context.
	public SIB_ID execute_vP9ooGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val1'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Comment value3 = ctx.Create_CommentSuccessCreated_vQGLgmEmEe22eKBh7MAS9A;
			if (value3 != null) { // prevent null in lists
			ctx.comments_vQM5MGEmEe22eKBh7MAS9A.add(value3);
			}
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Comment value4 = ctx.Create_CommentSuccessCreated_vQB6EWEmEe22eKBh7MAS9A;
			if (value4 != null) { // prevent null in lists
			ctx.comments_vQM5MGEmEe22eKBh7MAS9A.add(value4);
			}
			// branch 'success'
			return SIB_ID._vQLEAGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Comment'.
	public SIB_ID execute_vQAE4GEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController domController = this.CommentController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Comment createdObj = domController.create(null);
	
		createdObj.settext("The title is very confusing. Please change it.");
	
		ctx.Create_CommentSuccessCreated_vQB6EWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vQE9YGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Comment'.
	public SIB_ID execute_vQE9YGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController domController = this.CommentController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Comment createdObj = domController.create(null);
	
		createdObj.settext("Ok, i see. I'll change it and upload a new version.");
	
		ctx.Create_CommentSuccessCreated_vQGLgmEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vP9ooGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set comments' setting a new attribute value.
	public SIB_ID execute_vQLEAGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_IssueSuccessCreated_vP8agGEmEe22eKBh7MAS9A.setcomments_Comment(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Comment>(ctx.comments_vQM5MGEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vP3iAGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set issues' setting a new attribute value.
	public SIB_ID execute_vQS_0GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A.setissues_Issue(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Issue>(ctx.issues_vQUN8GEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vQZtgGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_vQZtgGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vQbisGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_vQbisGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A.setoffer(ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vQhpUWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set report' setting a new attribute value.
	public SIB_ID execute_vQemAWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A.setreport(ctx.Create_ReportSuccessCreated_vQjegGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vQnv8GEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Report'.
	public SIB_ID execute_vQhpUWEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.ReportController domController = this.ReportController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Report createdObj = domController.create(null);
	
	
		ctx.Create_ReportSuccessCreated_vQjegGEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vQemAWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_vQlTsWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A.setuser(ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vRZzEGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_vQnv8GEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create(null);
	
		createdObj.setfirstName("Barney");
		createdObj.setlastName("Gumble");
	
		ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vQ0kQGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_vQ0kQGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_UserRoleUserLiteral_vQ1yYGEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.user;
		// branch 'user'
		return SIB_ID._vQ3AgGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_vQ3AgGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A.setrole(ctx.Get_UserRoleUserLiteral_vQ1yYGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vRAxgWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_vQ__HYPHEN_MINUS__VQWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A.setbaseUser(ctx.Create_BaseUserSuccessCreated_vRB_omEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vQlTsWEmEe22eKBh7MAS9A;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_vRAxgWEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("user2");
	
		ctx.Create_BaseUserSuccessCreated_vRB_omEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BaseUserSuccessCreated_vRB_omEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vRDNwGEmEe22eKBh7MAS9A;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_vRDNwGEmEe22eKBh7MAS9A(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_vRItUGEmEe22eKBh7MAS9A = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._vROM4GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_vROM4GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_vRB_omEmEe22eKBh7MAS9A.setpassword(ctx.HashPasswordSuccessHashedPassword_vRItUGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vQ__HYPHEN_MINUS__VQWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vRVhoGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value5 = ctx.Create_FeatureSuccessCreated_vRbBMWEmEe22eKBh7MAS9A;
			if (value5 != null) { // prevent null in lists
			ctx.preferences_vRsuAGEmEe22eKBh7MAS9A.add(value5);
			}
			// branch 'success'
			return SIB_ID._vRpqsGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vRZzEGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_vRbBMWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_FeatureSuccessCreated_vRbBMWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vRddcGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_vRddcGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_PriorityHighLiteral_vRi9AWEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.high;
		// branch 'high'
		return SIB_ID._vRkLIGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_vRkLIGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_vRbBMWEmEe22eKBh7MAS9A.setpriority(ctx.Get_PriorityHighLiteral_vRi9AWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vRVhoGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_vRpqsGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vQaUkmEmEe22eKBh7MAS9A.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_vRsuAGEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vRy0oGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_vRy0oGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vR138GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_vR138GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A.setoffer(ctx.Create_OfferSuccessCreated_vMv8kmEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vR6JYmEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set decision' setting a new attribute value.
	public SIB_ID execute_vR4UMGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A.setdecision(ctx.Create_DecisionSuccessCreated_vR8loGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vSFvkGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Decision'.
	public SIB_ID execute_vR6JYmEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController domController = this.DecisionController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision createdObj = domController.create(null);
	
	
		ctx.Create_DecisionSuccessCreated_vR8loGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_DecisionSuccessCreated_vR8loGEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vR9zwGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get DecisionState'.
	public SIB_ID execute_vR9zwGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_DecisionStateRejectedLiteral_vR__HYPHEN_MINUS__a0WEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState.rejected;
		// branch 'rejected'
		return SIB_ID._vR_o8GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set state' setting a new attribute value.
	public SIB_ID execute_vR_o8GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_DecisionSuccessCreated_vR8loGEmEe22eKBh7MAS9A.setstate(ctx.Get_DecisionStateRejectedLiteral_vR__HYPHEN_MINUS__a0WEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vR4UMGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set report' setting a new attribute value.
	public SIB_ID execute_vSDTUGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A.setreport(ctx.Create_ReportSuccessCreated_vSG9smEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vSL2MGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Report'.
	public SIB_ID execute_vSFvkGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.ReportController domController = this.ReportController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Report createdObj = domController.create(null);
	
	
		ctx.Create_ReportSuccessCreated_vSG9smEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vSDTUGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_vSJZ8GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A.setuser(ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vSzhQGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_vSL2MGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create(null);
	
		createdObj.setfirstName("Gums");
		createdObj.setlastName("Murphy");
	
		ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vSQHoGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_vSQHoGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_UserRoleUserLiteral_vSQusmEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.user;
		// branch 'user'
		return SIB_ID._vSTK8GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_vSTK8GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A.setrole(ctx.Get_UserRoleUserLiteral_vSQusmEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vSYqgWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_vSWOQWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A.setbaseUser(ctx.Create_BaseUserSuccessCreated_vSZ4omEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vSJZ8GEmEe22eKBh7MAS9A;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_vSYqgWEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("user3");
	
		ctx.Create_BaseUserSuccessCreated_vSZ4omEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BaseUserSuccessCreated_vSZ4omEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vSbt0GEmEe22eKBh7MAS9A;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_vSbt0GEmEe22eKBh7MAS9A(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_vSdjAGEmEe22eKBh7MAS9A = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._vSnUAGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_vSnUAGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_vSZ4omEmEe22eKBh7MAS9A.setpassword(ctx.HashPasswordSuccessHashedPassword_vSdjAGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vSWOQWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vSvP0GEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value6 = ctx.Create_FeatureSuccessCreated_vS4ZwWEmEe22eKBh7MAS9A;
			if (value6 != null) { // prevent null in lists
			ctx.features_vTA8oGEmEe22eKBh7MAS9A.add(value6);
			}
			// branch 'success'
			return SIB_ID._vS95UGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vSzhQGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForBidding(false);
		createdObj.settitle("Cash Payment");
	
		ctx.Create_FeatureSuccessCreated_vS4ZwWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vSvP0GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_vS95UGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A.setfeatures_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.features_vTA8oGEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vTKtoGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vTF1IGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value7 = ctx.Create_FeatureSuccessCreated_vTMi0WEmEe22eKBh7MAS9A;
			if (value7 != null) { // prevent null in lists
			ctx.preferences_vTkWQGEmEe22eKBh7MAS9A.add(value7);
			}
			// branch 'success'
			return SIB_ID._vTjvMGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vTKtoGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_vTMi0WEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_FeatureSuccessCreated_vTMi0WEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vTVswGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_vTVswGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_PriorityLowLiteral_vTW64GEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.low;
		// branch 'low'
		return SIB_ID._vTXh8WEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_vTXh8WEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_vTMi0WEmEe22eKBh7MAS9A.setpriority(ctx.Get_PriorityLowLiteral_vTW64GEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vTF1IGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_vTjvMGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vR0CwmEmEe22eKBh7MAS9A.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_vTkWQGEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vTuHQWEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Offer'.
	public SIB_ID execute_vTuHQWEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer createdObj = domController.create("Offer offer2");
	
		createdObj.settitle("Great Product");
		createdObj.setassigned(false);
	
		ctx.Create_OfferSuccessCreated_vTv8cWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vTv8cWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_OfferSuccessCreated_vTv8cWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vTyYsGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_vTyYsGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_OfferSuccessCreated_vTv8cWEmEe22eKBh7MAS9A.setuser(ctx.Create_UserSuccessCreated_vQw54GEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vT8wwGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_vT8wwGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vT_0EGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_vT_0EGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A.setoffer(ctx.Create_OfferSuccessCreated_vTv8cWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vUIW8GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_vUIW8GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A.setuser(ctx.Create_UserSuccessCreated_vNh_sGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vUUkMGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vUMBUGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value8 = ctx.Create_FeatureSuccessCreated_vUXngWEmEe22eKBh7MAS9A;
			if (value8 != null) { // prevent null in lists
			ctx.features_vUuz4GEmEe22eKBh7MAS9A.add(value8);
			}
			// branch 'success'
			return SIB_ID._vUqicGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vUUkMGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForBidding(false);
		createdObj.settitle("Cash Payment");
	
		ctx.Create_FeatureSuccessCreated_vUXngWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vUMBUGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_vUqicGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A.setfeatures_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.features_vUuz4GEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vU_5oGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vU2vsGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value9 = ctx.Create_FeatureSuccessCreated_vVBu0WEmEe22eKBh7MAS9A;
			if (value9 != null) { // prevent null in lists
			ctx.preferences_vVaJUGEmEe22eKBh7MAS9A.add(value9);
			}
			// branch 'success'
			return SIB_ID._vVYUIWEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vU_5oGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_vVBu0WEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_FeatureSuccessCreated_vVBu0WEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vVJDkGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_vVJDkGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_PriorityLowLiteral_vVKRsWEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.low;
		// branch 'low'
		return SIB_ID._vVLf0GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_vVLf0GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_vVBu0WEmEe22eKBh7MAS9A.setpriority(ctx.Get_PriorityLowLiteral_vVKRsWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vU2vsGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_vVYUIWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vT9__HYPHEN_MINUS__4mEmEe22eKBh7MAS9A.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_vVaJUGEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vVpZ4GEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_vVpZ4GEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_vVrPEWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vVrPEWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BiddingSuccessCreated_vVrPEWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vVtEQGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_vVtEQGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vVrPEWEmEe22eKBh7MAS9A.setoffer(ctx.Create_OfferSuccessCreated_vTv8cWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vV21QGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_vV21QGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vVrPEWEmEe22eKBh7MAS9A.setuser(ctx.Create_UserSuccessCreated_vSNrYWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vWH7AGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_vV7twGEmEe22eKBh7MAS9A(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value10 = ctx.Create_FeatureSuccessCreated_vWLlYWEmEe22eKBh7MAS9A;
			if (value10 != null) { // prevent null in lists
			ctx.preferences_vWhjoGEmEe22eKBh7MAS9A.add(value10);
			}
			// branch 'success'
			return SIB_ID._vWg8kGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_vWH7AGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_vWLlYWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_FeatureSuccessCreated_vWLlYWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vWP20GEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_vWP20GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_PriorityMediumLiteral_vWWkgGEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.medium;
		// branch 'medium'
		return SIB_ID._vWYZsGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_vWYZsGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_vWLlYWEmEe22eKBh7MAS9A.setpriority(ctx.Get_PriorityMediumLiteral_vWWkgGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vV7twGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_vWg8kGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_vVrPEWEmEe22eKBh7MAS9A.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_vWhjoGEmEe22eKBh7MAS9A));
		// branch 'success'
		return SIB_ID._vWnqQGEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_vWnqQGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create("User admin");
	
		createdObj.setfirstName("System");
		createdObj.setlastName("Admin");
	
		ctx.Create_UserSuccessCreated_vWpfcWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vWpfcWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vWsiwGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_vWsiwGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_UserRoleAdminLiteral_vWvmEGEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.admin;
		// branch 'admin'
		return SIB_ID._vW1FoGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_vW1FoGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vWpfcWEmEe22eKBh7MAS9A.setrole(ctx.Get_UserRoleAdminLiteral_vWvmEGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vXAr0GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_vW4wAWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vWpfcWEmEe22eKBh7MAS9A.setbaseUser(ctx.Create_BaseUserSuccessCreated_vXDIEWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vXfM8GEmEe22eKBh7MAS9A;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_vXAr0GEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("admin");
	
		ctx.Create_BaseUserSuccessCreated_vXDIEWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BaseUserSuccessCreated_vXDIEWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vXJ1wGEmEe22eKBh7MAS9A;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_vXJ1wGEmEe22eKBh7MAS9A(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_vXLq8mEmEe22eKBh7MAS9A = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._vXTmwWEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_vXTmwWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_vXDIEWEmEe22eKBh7MAS9A.setpassword(ctx.HashPasswordSuccessHashedPassword_vXLq8mEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vW4wAWEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_vXfM8GEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create("User broker");
	
		createdObj.setfirstName("Peter");
		createdObj.setlastName("Parker");
	
		ctx.Create_UserSuccessCreated_vX9HAWEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vX9HAWEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vYCmkGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_vYCmkGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_UserRoleBrokerLiteral_vYDNoWEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.broker;
		// branch 'broker'
		return SIB_ID._vYFC0GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_vYFC0GEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vX9HAWEmEe22eKBh7MAS9A.setrole(ctx.Get_UserRoleBrokerLiteral_vYDNoWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vYQB8GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_vYIGIWEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vX9HAWEmEe22eKBh7MAS9A.setbaseUser(ctx.Create_BaseUserSuccessCreated_vYR3IGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vYujEGEmEe22eKBh7MAS9A;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_vYQB8GEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("broker");
	
		ctx.Create_BaseUserSuccessCreated_vYR3IGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BaseUserSuccessCreated_vYR3IGEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vYTFQGEmEe22eKBh7MAS9A;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_vYTFQGEmEe22eKBh7MAS9A(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_vYU6cmEmEe22eKBh7MAS9A = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._vYc2QGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_vYc2QGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_vYR3IGEmEe22eKBh7MAS9A.setpassword(ctx.HashPasswordSuccessHashedPassword_vYU6cmEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vYIGIWEmEe22eKBh7MAS9A;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_vYujEGEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create("User mary");
	
		createdObj.setfirstName("Mary Jane");
		createdObj.setlastName("Watson");
	
		ctx.Create_UserSuccessCreated_vYzbkGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_UserSuccessCreated_vYzbkGEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vY3tAGEmEe22eKBh7MAS9A;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_vY3tAGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Get_UserRoleBrokerLiteral_vY47IWEmEe22eKBh7MAS9A = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.broker;
		// branch 'broker'
		return SIB_ID._vY6JQGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_vY6JQGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vYzbkGEmEe22eKBh7MAS9A.setrole(ctx.Get_UserRoleBrokerLiteral_vY47IWEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vZJZ0GEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_vZFIYGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_UserSuccessCreated_vYzbkGEmEe22eKBh7MAS9A.setbaseUser(ctx.Create_BaseUserSuccessCreated_vZRVoGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vZ3ykGEmEe22eKBh7MAS9A;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_vZJZ0GEmEe22eKBh7MAS9A(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("broker2");
	
		ctx.Create_BaseUserSuccessCreated_vZRVoGEmEe22eKBh7MAS9A = createdObj;
		ctx.Create_BaseUserSuccessCreated_vZRVoGEmEe22eKBh7MAS9A = createdObj;
	
		// branch 'success'
		return SIB_ID._vZbtsGEmEe22eKBh7MAS9A;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_vZbtsGEmEe22eKBh7MAS9A(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_vZh0UGEmEe22eKBh7MAS9A = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._vZrlUGEmEe22eKBh7MAS9A;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_vZrlUGEmEe22eKBh7MAS9A(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_vZRVoGEmEe22eKBh7MAS9A.setpassword(ctx.HashPasswordSuccessHashedPassword_vZh0UGEmEe22eKBh7MAS9A);
		// branch 'success'
		return SIB_ID._vZFIYGEmEe22eKBh7MAS9A;
	}
	// container for graph i/o 'success'.
	public CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult execute_vZ3ykGEmEe22eKBh7MAS9A(final Context ctx) {
		return new CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult(new SuccessReturnImpl(ctx));
	}
	
}  

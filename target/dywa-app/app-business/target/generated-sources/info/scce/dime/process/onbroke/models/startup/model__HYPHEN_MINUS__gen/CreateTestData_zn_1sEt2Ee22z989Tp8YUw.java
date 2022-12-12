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
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> features_kyVt0Xl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_kykXUXl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Comment> comments_kyuvYnl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Issue> issues_kyxLo3l9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_kzbS8Hl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> features_k0Ahwnl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_k0Jrsnl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> features_k0g4EHl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_k0rQIHl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> preferences_k07u0Xl9Ee2Bb9t6ovoR_Q = new ArrayList<>();
		// direct dataflow variables.
		private java.lang.String HashPasswordSuccessHashedPassword_kyHrYnl9Ee2Bb9t6ovoR_Q;
		private java.lang.String HashPasswordSuccessHashedPassword_kzJmInl9Ee2Bb9t6ovoR_Q;
		private java.lang.String HashPasswordSuccessHashedPassword_kz3X0nl9Ee2Bb9t6ovoR_Q;
		private java.lang.String HashPasswordSuccessHashedPassword_k1MNgnl9Ee2Bb9t6ovoR_Q;
		private java.lang.String HashPasswordSuccessHashedPassword_k1mdMnl9Ee2Bb9t6ovoR_Q;
		private java.lang.String HashPasswordSuccessHashedPassword_k11Gsnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Decision Create_DecisionSuccessCreated_kxv383l9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState Get_DecisionStateApprovedLiteral_kxxGEnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Report Create_ReportSuccessCreated_kx1__HYPHEN_MINUS__kXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleUserLiteral_kx96YHl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_kyDZ8nl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_kyRcYXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_kygF4nl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityHighLiteral_kyhUA3l9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue Create_IssueSuccessCreated_kyoBsXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment Create_CommentSuccessCreated_kyqd8nl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment Create_CommentSuccessCreated_kysTInl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Report Create_ReportSuccessCreated_ky5HcXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleUserLiteral_kzBDQ3l9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_kzHw8Hl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_kzSJAnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityHighLiteral_kzUlQnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Decision Create_DecisionSuccessCreated_kzlrAnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState Get_DecisionStateApprovedLiteral_kzngMHl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Report Create_ReportSuccessCreated_kzsYsXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleUserLiteral_kzxRM3l9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_kz1ionl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_kz__HYPHEN_MINUS__Fgnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_k0EzMnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityLowLiteral_k0GoYXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer Create_OfferSuccessCreated_k0MvAnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_k0d0wnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_k0lJgnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityLowLiteral_k0m__HYPHEN_MINUS__s3l9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding Create_BiddingSuccessCreated_k0u6gnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature Create_FeatureSuccessCreated_k01oMnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority Get_PriorityMediumLiteral_k03dYXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_k1AnUnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleAdminLiteral_k1DqoXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_k1JxQnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_k1ehYXl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleBrokerLiteral_k1gWknl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_k1lPEHl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_k1sj0nl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole Get_UserRoleBrokerLiteral_k1uZAnl9Ee2Bb9t6ovoR_Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_k1yqcnl9Ee2Bb9t6ovoR_Q;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_kxgAUHl9Ee2Bb9t6ovoR_Q,
	_kxqYYHl9Ee2Bb9t6ovoR_Q,
	_kxsNknl9Ee2Bb9t6ovoR_Q,
	_kxtbsnl9Ee2Bb9t6ovoR_Q,
	_kxvQ4Xl9Ee2Bb9t6ovoR_Q,
	_kxwfAXl9Ee2Bb9t6ovoR_Q,
	_kxyUMHl9Ee2Bb9t6ovoR_Q,
	_kx0wcHl9Ee2Bb9t6ovoR_Q,
	_kx1Xgnl9Ee2Bb9t6ovoR_Q,
	_kx3MsHl9Ee2Bb9t6ovoR_Q,
	_kx5o8Xl9Ee2Bb9t6ovoR_Q,
	_kx9TUXl9Ee2Bb9t6ovoR_Q,
	_kx__HYPHEN_MINUS__hcXl9Ee2Bb9t6ovoR_Q,
	_kyA9sHl9Ee2Bb9t6ovoR_Q,
	_kyBkw3l9Ee2Bb9t6ovoR_Q,
	_kyEBAHl9Ee2Bb9t6ovoR_Q,
	_kyJgkXl9Ee2Bb9t6ovoR_Q,
	_kyNK8Hl9Ee2Bb9t6ovoR_Q,
	_kyQ1UHl9Ee2Bb9t6ovoR_Q,
	_kyVGwXl9Ee2Bb9t6ovoR_Q,
	_kyeQsHl9Ee2Bb9t6ovoR_Q,
	_kyfe0Hl9Ee2Bb9t6ovoR_Q,
	_kyhUAHl9Ee2Bb9t6ovoR_Q,
	_kyh7EXl9Ee2Bb9t6ovoR_Q,
	_kyjwQ3l9Ee2Bb9t6ovoR_Q,
	_kyllcXl9Ee2Bb9t6ovoR_Q,
	_kynaoHl9Ee2Bb9t6ovoR_Q,
	_kyoowXl9Ee2Bb9t6ovoR_Q,
	_kyp24Hl9Ee2Bb9t6ovoR_Q,
	_kyrsEXl9Ee2Bb9t6ovoR_Q,
	_kyuvYHl9Ee2Bb9t6ovoR_Q,
	_kyxLoXl9Ee2Bb9t6ovoR_Q,
	_ky0O8Hl9Ee2Bb9t6ovoR_Q,
	_ky1dEHl9Ee2Bb9t6ovoR_Q,
	_ky2rMHl9Ee2Bb9t6ovoR_Q,
	_ky35Unl9Ee2Bb9t6ovoR_Q,
	_ky7jsHl9Ee2Bb9t6ovoR_Q,
	_ky9Y4Hl9Ee2Bb9t6ovoR_Q,
	_kzBDQHl9Ee2Bb9t6ovoR_Q,
	_kzCRYXl9Ee2Bb9t6ovoR_Q,
	_kzEtoXl9Ee2Bb9t6ovoR_Q,
	_kzGi0Hl9Ee2Bb9t6ovoR_Q,
	_kzIYAXl9Ee2Bb9t6ovoR_Q,
	_kzLbUHl9Ee2Bb9t6ovoR_Q,
	_kzOeoXl9Ee2Bb9t6ovoR_Q,
	_kzRh8Hl9Ee2Bb9t6ovoR_Q,
	_kzT__HYPHEN_MINUS__MHl9Ee2Bb9t6ovoR_Q,
	_kzVMUXl9Ee2Bb9t6ovoR_Q,
	_kzar4Hl9Ee2Bb9t6ovoR_Q,
	_kze9UXl9Ee2Bb9t6ovoR_Q,
	_kzhZkHl9Ee2Bb9t6ovoR_Q,
	_kzjOwXl9Ee2Bb9t6ovoR_Q,
	_kzkc4nl9Ee2Bb9t6ovoR_Q,
	_kzm5IHl9Ee2Bb9t6ovoR_Q,
	_kzoHQHl9Ee2Bb9t6ovoR_Q,
	_kzp8cXl9Ee2Bb9t6ovoR_Q,
	_kzrKknl9Ee2Bb9t6ovoR_Q,
	_kztm0Hl9Ee2Bb9t6ovoR_Q,
	_kzu08Xl9Ee2Bb9t6ovoR_Q,
	_kzxRMHl9Ee2Bb9t6ovoR_Q,
	_kzx4QXl9Ee2Bb9t6ovoR_Q,
	_kzztcHl9Ee2Bb9t6ovoR_Q,
	_kz07kXl9Ee2Bb9t6ovoR_Q,
	_kz2wwHl9Ee2Bb9t6ovoR_Q,
	_kz5NAHl9Ee2Bb9t6ovoR_Q,
	_kz7pQHl9Ee2Bb9t6ovoR_Q,
	_kz9ecHl9Ee2Bb9t6ovoR_Q,
	_k0AhwHl9Ee2Bb9t6ovoR_Q,
	_k0CW8Xl9Ee2Bb9t6ovoR_Q,
	_k0EMIHl9Ee2Bb9t6ovoR_Q,
	_k0GBUXl9Ee2Bb9t6ovoR_Q,
	_k0HPcHl9Ee2Bb9t6ovoR_Q,
	_k0JrsHl9Ee2Bb9t6ovoR_Q,
	_k0MH8Xl9Ee2Bb9t6ovoR_Q,
	_k0N9IHl9Ee2Bb9t6ovoR_Q,
	_k0QZYHl9Ee2Bb9t6ovoR_Q,
	_k0RngHl9Ee2Bb9t6ovoR_Q,
	_k0TcsHl9Ee2Bb9t6ovoR_Q,
	_k0axdHl9Ee2Bb9t6ovoR_Q,
	_k0dNsHl9Ee2Bb9t6ovoR_Q,
	_k0gRAXl9Ee2Bb9t6ovoR_Q,
	_k0iGM3l9Ee2Bb9t6ovoR_Q,
	_k0kicHl9Ee2Bb9t6ovoR_Q,
	_k0m__HYPHEN_MINUS__sHl9Ee2Bb9t6ovoR_Q,
	_k0nlwXl9Ee2Bb9t6ovoR_Q,
	_k0qpEXl9Ee2Bb9t6ovoR_Q,
	_k0tsYnl9Ee2Bb9t6ovoR_Q,
	_k0vhkHl9Ee2Bb9t6ovoR_Q,
	_k0xWwHl9Ee2Bb9t6ovoR_Q,
	_k0yk43l9Ee2Bb9t6ovoR_Q,
	_k01BIHl9Ee2Bb9t6ovoR_Q,
	_k022UXl9Ee2Bb9t6ovoR_Q,
	_k04EcHl9Ee2Bb9t6ovoR_Q,
	_k07HwXl9Ee2Bb9t6ovoR_Q,
	_k0_ZMXl9Ee2Bb9t6ovoR_Q,
	_k1DDkHl9Ee2Bb9t6ovoR_Q,
	_k1ERsXl9Ee2Bb9t6ovoR_Q,
	_k1Gt8Hl9Ee2Bb9t6ovoR_Q,
	_k1IjIXl9Ee2Bb9t6ovoR_Q,
	_k1K_YHl9Ee2Bb9t6ovoR_Q,
	_k1ZB0Hl9Ee2Bb9t6ovoR_Q,
	_k1dTQHl9Ee2Bb9t6ovoR_Q,
	_k1fvgXl9Ee2Bb9t6ovoR_Q,
	_k1g9oXl9Ee2Bb9t6ovoR_Q,
	_k1iy0Xl9Ee2Bb9t6ovoR_Q,
	_k1kA8nl9Ee2Bb9t6ovoR_Q,
	_k1l2IHl9Ee2Bb9t6ovoR_Q,
	_k1oSYXl9Ee2Bb9t6ovoR_Q,
	_k1rVsXl9Ee2Bb9t6ovoR_Q,
	_k1tx8Xl9Ee2Bb9t6ovoR_Q,
	_k1vAEXl9Ee2Bb9t6ovoR_Q,
	_k1w1QHl9Ee2Bb9t6ovoR_Q,
	_k1yDYXl9Ee2Bb9t6ovoR_Q,
	_k10foHl9Ee2Bb9t6ovoR_Q,
	_k1274Hl9Ee2Bb9t6ovoR_Q,
	_k15_MXl9Ee2Bb9t6ovoR_Q,
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

		return executeInternal(ctx, SIB_ID._kxgAUHl9Ee2Bb9t6ovoR_Q);
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
				case _kxgAUHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kxgAUHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kxqYYHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kxqYYHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kxsNknl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kxsNknl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kxtbsnl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kxtbsnl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kxvQ4Xl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kxvQ4Xl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kxwfAXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kxwfAXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kxyUMHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kxyUMHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kx0wcHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kx0wcHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kx1Xgnl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kx1Xgnl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kx3MsHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kx3MsHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kx5o8Xl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kx5o8Xl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kx9TUXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kx9TUXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kx__HYPHEN_MINUS__hcXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kx__HYPHEN_MINUS__hcXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyA9sHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyA9sHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyBkw3l9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyBkw3l9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyEBAHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyEBAHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyJgkXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyJgkXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyNK8Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyNK8Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyQ1UHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyQ1UHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyVGwXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyVGwXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyeQsHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyeQsHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyfe0Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyfe0Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyhUAHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyhUAHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyh7EXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyh7EXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyjwQ3l9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyjwQ3l9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyllcXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyllcXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kynaoHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kynaoHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyoowXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyoowXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyp24Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyp24Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyrsEXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyrsEXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyuvYHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyuvYHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kyxLoXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kyxLoXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _ky0O8Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_ky0O8Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _ky1dEHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_ky1dEHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _ky2rMHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_ky2rMHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _ky35Unl9Ee2Bb9t6ovoR_Q: {
					curr = execute_ky35Unl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _ky7jsHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_ky7jsHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _ky9Y4Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_ky9Y4Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzBDQHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzBDQHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzCRYXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzCRYXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzEtoXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzEtoXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzGi0Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzGi0Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzIYAXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzIYAXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzLbUHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzLbUHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzOeoXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzOeoXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzRh8Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzRh8Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzT__HYPHEN_MINUS__MHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzT__HYPHEN_MINUS__MHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzVMUXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzVMUXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzar4Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzar4Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kze9UXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kze9UXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzhZkHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzhZkHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzjOwXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzjOwXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzkc4nl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzkc4nl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzm5IHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzm5IHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzoHQHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzoHQHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzp8cXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzp8cXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzrKknl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzrKknl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kztm0Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kztm0Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzu08Xl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzu08Xl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzxRMHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzxRMHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzx4QXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzx4QXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kzztcHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kzztcHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kz07kXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kz07kXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kz2wwHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kz2wwHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kz5NAHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kz5NAHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kz7pQHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kz7pQHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _kz9ecHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_kz9ecHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0AhwHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0AhwHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0CW8Xl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0CW8Xl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0EMIHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0EMIHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0GBUXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0GBUXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0HPcHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0HPcHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0JrsHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0JrsHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0MH8Xl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0MH8Xl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0N9IHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0N9IHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0QZYHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0QZYHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0RngHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0RngHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0TcsHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0TcsHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0axdHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0axdHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0dNsHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0dNsHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0gRAXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0gRAXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0iGM3l9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0iGM3l9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0kicHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0kicHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0m__HYPHEN_MINUS__sHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0m__HYPHEN_MINUS__sHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0nlwXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0nlwXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0qpEXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0qpEXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0tsYnl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0tsYnl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0vhkHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0vhkHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0xWwHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0xWwHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0yk43l9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0yk43l9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k01BIHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k01BIHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k022UXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k022UXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k04EcHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k04EcHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k07HwXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k07HwXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k0_ZMXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k0_ZMXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1DDkHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1DDkHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1ERsXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1ERsXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1Gt8Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1Gt8Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1IjIXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1IjIXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1K_YHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1K_YHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1ZB0Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1ZB0Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1dTQHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1dTQHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1fvgXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1fvgXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1g9oXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1g9oXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1iy0Xl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1iy0Xl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1kA8nl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1kA8nl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1l2IHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1l2IHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1oSYXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1oSYXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1rVsXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1rVsXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1tx8Xl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1tx8Xl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1vAEXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1vAEXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1w1QHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1w1QHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1yDYXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1yDYXl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k10foHl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k10foHl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k1274Hl9Ee2Bb9t6ovoR_Q: {
					curr = execute_k1274Hl9Ee2Bb9t6ovoR_Q(ctx);
					break;
				}
				case _k15_MXl9Ee2Bb9t6ovoR_Q: {
					return execute_k15_MXl9Ee2Bb9t6ovoR_Q(ctx);
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
			this.branchId = "_k15_MXl9Ee2Bb9t6ovoR_Q";
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
	public SIB_ID execute_kxgAUHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create("Feature featTmpl");
	
		createdObj.setisTemplateForOffer(true);
		createdObj.settitle("3 Year Warranty");
	
	
		// branch 'success'
		return SIB_ID._kxqYYHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_kxqYYHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create("Feature attrTmpl");
	
		createdObj.setisTemplateForBidding(true);
		createdObj.settitle("Cash Payment");
	
	
		// branch 'success'
		return SIB_ID._kxsNknl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Offer'.
	public SIB_ID execute_kxsNknl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer createdObj = domController.create("Offer offer1");
	
		createdObj.settitle("Awesome Product");
	
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kxvQ4Xl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set decision' setting a new attribute value.
	public SIB_ID execute_kxtbsnl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q.setdecision(ctx.Create_DecisionSuccessCreated_kxv383l9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kx1Xgnl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Decision'.
	public SIB_ID execute_kxvQ4Xl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController domController = this.DecisionController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision createdObj = domController.create(null);
	
	
		ctx.Create_DecisionSuccessCreated_kxv383l9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_DecisionSuccessCreated_kxv383l9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kxwfAXl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get DecisionState'.
	public SIB_ID execute_kxwfAXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_DecisionStateApprovedLiteral_kxxGEnl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState.approved;
		// branch 'approved'
		return SIB_ID._kxyUMHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set state' setting a new attribute value.
	public SIB_ID execute_kxyUMHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_DecisionSuccessCreated_kxv383l9Ee2Bb9t6ovoR_Q.setstate(ctx.Get_DecisionStateApprovedLiteral_kxxGEnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kxtbsnl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set report' setting a new attribute value.
	public SIB_ID execute_kx0wcHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q.setreport(ctx.Create_ReportSuccessCreated_kx1__HYPHEN_MINUS__kXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kx5o8Xl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Report'.
	public SIB_ID execute_kx1Xgnl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.ReportController domController = this.ReportController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Report createdObj = domController.create(null);
	
	
		ctx.Create_ReportSuccessCreated_kx1__HYPHEN_MINUS__kXl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kx0wcHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_kx3MsHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q.setuser(ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kyQ1UHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_kx5o8Xl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create(null);
	
		createdObj.setfirstName("Homer");
		createdObj.setlastName("Simpson");
	
		ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kx9TUXl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_kx9TUXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_UserRoleUserLiteral_kx96YHl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.user;
		// branch 'user'
		return SIB_ID._kx__HYPHEN_MINUS__hcXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_kx__HYPHEN_MINUS__hcXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q.setrole(ctx.Get_UserRoleUserLiteral_kx96YHl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kyBkw3l9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_kyA9sHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q.setbaseUser(ctx.Create_BaseUserSuccessCreated_kyDZ8nl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kx3MsHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_kyBkw3l9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("user");
	
		ctx.Create_BaseUserSuccessCreated_kyDZ8nl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BaseUserSuccessCreated_kyDZ8nl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kyEBAHl9Ee2Bb9t6ovoR_Q;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_kyEBAHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_kyHrYnl9Ee2Bb9t6ovoR_Q = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._kyJgkXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_kyJgkXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_kyDZ8nl9Ee2Bb9t6ovoR_Q.setpassword(ctx.HashPasswordSuccessHashedPassword_kyHrYnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kyA9sHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_kyNK8Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value0 = ctx.Create_FeatureSuccessCreated_kyRcYXl9Ee2Bb9t6ovoR_Q;
			if (value0 != null) { // prevent null in lists
			ctx.features_kyVt0Xl9Ee2Bb9t6ovoR_Q.add(value0);
			}
			// branch 'success'
			return SIB_ID._kyVGwXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_kyQ1UHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_kyRcYXl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kyNK8Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_kyVGwXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q.setfeatures_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.features_kyVt0Xl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._kyfe0Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_kyeQsHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value1 = ctx.Create_FeatureSuccessCreated_kygF4nl9Ee2Bb9t6ovoR_Q;
			if (value1 != null) { // prevent null in lists
			ctx.preferences_kykXUXl9Ee2Bb9t6ovoR_Q.add(value1);
			}
			// branch 'success'
			return SIB_ID._kyjwQ3l9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_kyfe0Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForBidding(false);
		createdObj.settitle("Cash Payment");
	
		ctx.Create_FeatureSuccessCreated_kygF4nl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_FeatureSuccessCreated_kygF4nl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kyhUAHl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_kyhUAHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_PriorityHighLiteral_kyhUA3l9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.high;
		// branch 'high'
		return SIB_ID._kyh7EXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_kyh7EXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_kygF4nl9Ee2Bb9t6ovoR_Q.setpriority(ctx.Get_PriorityHighLiteral_kyhUA3l9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kyeQsHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_kyjwQ3l9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_kykXUXl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._kynaoHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Issue' putting complex value of type 'Issue' to context.
	public SIB_ID execute_kyllcXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Issue value2 = ctx.Create_IssueSuccessCreated_kyoBsXl9Ee2Bb9t6ovoR_Q;
			if (value2 != null) { // prevent null in lists
			ctx.issues_kyxLo3l9Ee2Bb9t6ovoR_Q.add(value2);
			}
			// branch 'success'
			return SIB_ID._kyxLoXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Issue'.
	public SIB_ID execute_kynaoHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.IssueController domController = this.IssueController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Issue createdObj = domController.create(null);
	
		createdObj.settitle("The title is confusing");
	
		ctx.Create_IssueSuccessCreated_kyoBsXl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_IssueSuccessCreated_kyoBsXl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kyp24Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Comment' putting complex value of type 'Comment' to context.
	public SIB_ID execute_kyoowXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Comment value3 = ctx.Create_CommentSuccessCreated_kyqd8nl9Ee2Bb9t6ovoR_Q;
			if (value3 != null) { // prevent null in lists
			ctx.comments_kyuvYnl9Ee2Bb9t6ovoR_Q.add(value3);
			}
			// put 'val1'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Comment value4 = ctx.Create_CommentSuccessCreated_kysTInl9Ee2Bb9t6ovoR_Q;
			if (value4 != null) { // prevent null in lists
			ctx.comments_kyuvYnl9Ee2Bb9t6ovoR_Q.add(value4);
			}
			// branch 'success'
			return SIB_ID._kyuvYHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Comment'.
	public SIB_ID execute_kyp24Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController domController = this.CommentController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Comment createdObj = domController.create(null);
	
		createdObj.settext("The title is very confusing. Please change it.");
	
		ctx.Create_CommentSuccessCreated_kyqd8nl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kyrsEXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Comment'.
	public SIB_ID execute_kyrsEXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController domController = this.CommentController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Comment createdObj = domController.create(null);
	
		createdObj.settext("Ok, i see. I'll change it and upload a new version.");
	
		ctx.Create_CommentSuccessCreated_kysTInl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kyoowXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set comments' setting a new attribute value.
	public SIB_ID execute_kyuvYHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_IssueSuccessCreated_kyoBsXl9Ee2Bb9t6ovoR_Q.setcomments_Comment(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Comment>(ctx.comments_kyuvYnl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._kyllcXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set issues' setting a new attribute value.
	public SIB_ID execute_kyxLoXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q.setissues_Issue(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Issue>(ctx.issues_kyxLo3l9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._ky0O8Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_ky0O8Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._ky1dEHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_ky1dEHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q.setoffer(ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._ky35Unl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set report' setting a new attribute value.
	public SIB_ID execute_ky2rMHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q.setreport(ctx.Create_ReportSuccessCreated_ky5HcXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._ky9Y4Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Report'.
	public SIB_ID execute_ky35Unl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.ReportController domController = this.ReportController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Report createdObj = domController.create(null);
	
	
		ctx.Create_ReportSuccessCreated_ky5HcXl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._ky2rMHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_ky7jsHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q.setuser(ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzRh8Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_ky9Y4Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create(null);
	
		createdObj.setfirstName("Barney");
		createdObj.setlastName("Gumble");
	
		ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kzBDQHl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_kzBDQHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_UserRoleUserLiteral_kzBDQ3l9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.user;
		// branch 'user'
		return SIB_ID._kzCRYXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_kzCRYXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q.setrole(ctx.Get_UserRoleUserLiteral_kzBDQ3l9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzGi0Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_kzEtoXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q.setbaseUser(ctx.Create_BaseUserSuccessCreated_kzHw8Hl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._ky7jsHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_kzGi0Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("user2");
	
		ctx.Create_BaseUserSuccessCreated_kzHw8Hl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BaseUserSuccessCreated_kzHw8Hl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kzIYAXl9Ee2Bb9t6ovoR_Q;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_kzIYAXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_kzJmInl9Ee2Bb9t6ovoR_Q = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._kzLbUHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_kzLbUHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_kzHw8Hl9Ee2Bb9t6ovoR_Q.setpassword(ctx.HashPasswordSuccessHashedPassword_kzJmInl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzEtoXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_kzOeoXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value5 = ctx.Create_FeatureSuccessCreated_kzSJAnl9Ee2Bb9t6ovoR_Q;
			if (value5 != null) { // prevent null in lists
			ctx.preferences_kzbS8Hl9Ee2Bb9t6ovoR_Q.add(value5);
			}
			// branch 'success'
			return SIB_ID._kzar4Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_kzRh8Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_kzSJAnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_FeatureSuccessCreated_kzSJAnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kzT__HYPHEN_MINUS__MHl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_kzT__HYPHEN_MINUS__MHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_PriorityHighLiteral_kzUlQnl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.high;
		// branch 'high'
		return SIB_ID._kzVMUXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_kzVMUXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_kzSJAnl9Ee2Bb9t6ovoR_Q.setpriority(ctx.Get_PriorityHighLiteral_kzUlQnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzOeoXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_kzar4Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_ky02AHl9Ee2Bb9t6ovoR_Q.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_kzbS8Hl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._kze9UXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_kze9UXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kzhZkHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_kzhZkHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q.setoffer(ctx.Create_OfferSuccessCreated_kxsNlnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzkc4nl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set decision' setting a new attribute value.
	public SIB_ID execute_kzjOwXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q.setdecision(ctx.Create_DecisionSuccessCreated_kzlrAnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzrKknl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Decision'.
	public SIB_ID execute_kzkc4nl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController domController = this.DecisionController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision createdObj = domController.create(null);
	
	
		ctx.Create_DecisionSuccessCreated_kzlrAnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_DecisionSuccessCreated_kzlrAnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kzm5IHl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get DecisionState'.
	public SIB_ID execute_kzm5IHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_DecisionStateApprovedLiteral_kzngMHl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState.approved;
		// branch 'approved'
		return SIB_ID._kzoHQHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set state' setting a new attribute value.
	public SIB_ID execute_kzoHQHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_DecisionSuccessCreated_kzlrAnl9Ee2Bb9t6ovoR_Q.setstate(ctx.Get_DecisionStateApprovedLiteral_kzngMHl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzjOwXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set report' setting a new attribute value.
	public SIB_ID execute_kzp8cXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q.setreport(ctx.Create_ReportSuccessCreated_kzsYsXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzu08Xl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Report'.
	public SIB_ID execute_kzrKknl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.ReportController domController = this.ReportController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Report createdObj = domController.create(null);
	
	
		ctx.Create_ReportSuccessCreated_kzsYsXl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kzp8cXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_kztm0Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q.setuser(ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kz9ecHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_kzu08Xl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create(null);
	
		createdObj.setfirstName("Gums");
		createdObj.setlastName("Murphy");
	
		ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kzxRMHl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_kzxRMHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_UserRoleUserLiteral_kzxRM3l9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.user;
		// branch 'user'
		return SIB_ID._kzx4QXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_kzx4QXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q.setrole(ctx.Get_UserRoleUserLiteral_kzxRM3l9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kz07kXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_kzztcHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q.setbaseUser(ctx.Create_BaseUserSuccessCreated_kz1ionl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kztm0Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_kz07kXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("user3");
	
		ctx.Create_BaseUserSuccessCreated_kz1ionl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BaseUserSuccessCreated_kz1ionl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kz2wwHl9Ee2Bb9t6ovoR_Q;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_kz2wwHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_kz3X0nl9Ee2Bb9t6ovoR_Q = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._kz5NAHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_kz5NAHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_kz1ionl9Ee2Bb9t6ovoR_Q.setpassword(ctx.HashPasswordSuccessHashedPassword_kz3X0nl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._kzztcHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_kz7pQHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value6 = ctx.Create_FeatureSuccessCreated_kz__HYPHEN_MINUS__Fgnl9Ee2Bb9t6ovoR_Q;
			if (value6 != null) { // prevent null in lists
			ctx.features_k0Ahwnl9Ee2Bb9t6ovoR_Q.add(value6);
			}
			// branch 'success'
			return SIB_ID._k0AhwHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_kz9ecHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForBidding(false);
		createdObj.settitle("Cash Payment");
	
		ctx.Create_FeatureSuccessCreated_kz__HYPHEN_MINUS__Fgnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._kz7pQHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_k0AhwHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q.setfeatures_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.features_k0Ahwnl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._k0EMIHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_k0CW8Xl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value7 = ctx.Create_FeatureSuccessCreated_k0EzMnl9Ee2Bb9t6ovoR_Q;
			if (value7 != null) { // prevent null in lists
			ctx.preferences_k0Jrsnl9Ee2Bb9t6ovoR_Q.add(value7);
			}
			// branch 'success'
			return SIB_ID._k0JrsHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_k0EMIHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_k0EzMnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_FeatureSuccessCreated_k0EzMnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k0GBUXl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_k0GBUXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_PriorityLowLiteral_k0GoYXl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.low;
		// branch 'low'
		return SIB_ID._k0HPcHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_k0HPcHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_k0EzMnl9Ee2Bb9t6ovoR_Q.setpriority(ctx.Get_PriorityLowLiteral_k0GoYXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k0CW8Xl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_k0JrsHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_kzfkYnl9Ee2Bb9t6ovoR_Q.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_k0Jrsnl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._k0MH8Xl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Offer'.
	public SIB_ID execute_k0MH8Xl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer createdObj = domController.create("Offer offer2");
	
		createdObj.settitle("Great Product");
	
		ctx.Create_OfferSuccessCreated_k0MvAnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_k0MvAnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_OfferSuccessCreated_k0MvAnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k0N9IHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_k0N9IHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_OfferSuccessCreated_k0MvAnl9Ee2Bb9t6ovoR_Q.setuser(ctx.Create_UserSuccessCreated_ky__HYPHEN_MINUS__nAHl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k0QZYHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_k0QZYHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k0RngHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_k0RngHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q.setoffer(ctx.Create_OfferSuccessCreated_k0MvAnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k0TcsHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_k0TcsHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q.setuser(ctx.Create_UserSuccessCreated_kx8FMXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k0dNsHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_k0axdHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value8 = ctx.Create_FeatureSuccessCreated_k0d0wnl9Ee2Bb9t6ovoR_Q;
			if (value8 != null) { // prevent null in lists
			ctx.features_k0g4EHl9Ee2Bb9t6ovoR_Q.add(value8);
			}
			// branch 'success'
			return SIB_ID._k0gRAXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_k0dNsHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForBidding(false);
		createdObj.settitle("Cash Payment");
	
		ctx.Create_FeatureSuccessCreated_k0d0wnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k0axdHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_k0gRAXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q.setfeatures_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.features_k0g4EHl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._k0kicHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_k0iGM3l9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value9 = ctx.Create_FeatureSuccessCreated_k0lJgnl9Ee2Bb9t6ovoR_Q;
			if (value9 != null) { // prevent null in lists
			ctx.preferences_k0rQIHl9Ee2Bb9t6ovoR_Q.add(value9);
			}
			// branch 'success'
			return SIB_ID._k0qpEXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_k0kicHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_k0lJgnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_FeatureSuccessCreated_k0lJgnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k0m__HYPHEN_MINUS__sHl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_k0m__HYPHEN_MINUS__sHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_PriorityLowLiteral_k0m__HYPHEN_MINUS__s3l9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.low;
		// branch 'low'
		return SIB_ID._k0nlwXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_k0nlwXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_k0lJgnl9Ee2Bb9t6ovoR_Q.setpriority(ctx.Get_PriorityLowLiteral_k0m__HYPHEN_MINUS__s3l9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k0iGM3l9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_k0qpEXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_k0RAcnl9Ee2Bb9t6ovoR_Q.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_k0rQIHl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._k0tsYnl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_k0tsYnl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create("Bidding");
	
	
		ctx.Create_BiddingSuccessCreated_k0u6gnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_k0u6gnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BiddingSuccessCreated_k0u6gnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k0vhkHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set offer' setting a new attribute value.
	public SIB_ID execute_k0vhkHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_k0u6gnl9Ee2Bb9t6ovoR_Q.setoffer(ctx.Create_OfferSuccessCreated_k0MvAnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k0xWwHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set user' setting a new attribute value.
	public SIB_ID execute_k0xWwHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_k0u6gnl9Ee2Bb9t6ovoR_Q.setuser(ctx.Create_UserSuccessCreated_kzvcAnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k01BIHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Put Feature' putting complex value of type 'Feature' to context.
	public SIB_ID execute_k0yk43l9Ee2Bb9t6ovoR_Q(final Context ctx) {
			// put 'val0'.
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature value10 = ctx.Create_FeatureSuccessCreated_k01oMnl9Ee2Bb9t6ovoR_Q;
			if (value10 != null) { // prevent null in lists
			ctx.preferences_k07u0Xl9Ee2Bb9t6ovoR_Q.add(value10);
			}
			// branch 'success'
			return SIB_ID._k07HwXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_k01BIHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle("3 Year Warranty");
	
		ctx.Create_FeatureSuccessCreated_k01oMnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_FeatureSuccessCreated_k01oMnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k022UXl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get Priority'.
	public SIB_ID execute_k022UXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_PriorityMediumLiteral_k03dYXl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.Priority.medium;
		// branch 'medium'
		return SIB_ID._k04EcHl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set priority' setting a new attribute value.
	public SIB_ID execute_k04EcHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_FeatureSuccessCreated_k01oMnl9Ee2Bb9t6ovoR_Q.setpriority(ctx.Get_PriorityMediumLiteral_k03dYXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k0yk43l9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_k07HwXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BiddingSuccessCreated_k0u6gnl9Ee2Bb9t6ovoR_Q.setpreferences_Feature(new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.preferences_k07u0Xl9Ee2Bb9t6ovoR_Q));
		// branch 'success'
		return SIB_ID._k0_ZMXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_k0_ZMXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create("User admin");
	
		createdObj.setfirstName("System");
		createdObj.setlastName("Admin");
	
		ctx.Create_UserSuccessCreated_k1AnUnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_k1AnUnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k1DDkHl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_k1DDkHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_UserRoleAdminLiteral_k1DqoXl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.admin;
		// branch 'admin'
		return SIB_ID._k1ERsXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_k1ERsXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_k1AnUnl9Ee2Bb9t6ovoR_Q.setrole(ctx.Get_UserRoleAdminLiteral_k1DqoXl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1IjIXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_k1Gt8Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_k1AnUnl9Ee2Bb9t6ovoR_Q.setbaseUser(ctx.Create_BaseUserSuccessCreated_k1JxQnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1dTQHl9Ee2Bb9t6ovoR_Q;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_k1IjIXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("admin");
	
		ctx.Create_BaseUserSuccessCreated_k1JxQnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BaseUserSuccessCreated_k1JxQnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k1K_YHl9Ee2Bb9t6ovoR_Q;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_k1K_YHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_k1MNgnl9Ee2Bb9t6ovoR_Q = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._k1ZB0Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_k1ZB0Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_k1JxQnl9Ee2Bb9t6ovoR_Q.setpassword(ctx.HashPasswordSuccessHashedPassword_k1MNgnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1Gt8Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_k1dTQHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create("User broker");
	
		createdObj.setfirstName("Peter");
		createdObj.setlastName("Parker");
	
		ctx.Create_UserSuccessCreated_k1ehYXl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_k1ehYXl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k1fvgXl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_k1fvgXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_UserRoleBrokerLiteral_k1gWknl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.broker;
		// branch 'broker'
		return SIB_ID._k1g9oXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_k1g9oXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_k1ehYXl9Ee2Bb9t6ovoR_Q.setrole(ctx.Get_UserRoleBrokerLiteral_k1gWknl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1kA8nl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_k1iy0Xl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_k1ehYXl9Ee2Bb9t6ovoR_Q.setbaseUser(ctx.Create_BaseUserSuccessCreated_k1lPEHl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1rVsXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_k1kA8nl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("broker");
	
		ctx.Create_BaseUserSuccessCreated_k1lPEHl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BaseUserSuccessCreated_k1lPEHl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k1l2IHl9Ee2Bb9t6ovoR_Q;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_k1l2IHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_k1mdMnl9Ee2Bb9t6ovoR_Q = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._k1oSYXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_k1oSYXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_k1lPEHl9Ee2Bb9t6ovoR_Q.setpassword(ctx.HashPasswordSuccessHashedPassword_k1mdMnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1iy0Xl9Ee2Bb9t6ovoR_Q;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_k1rVsXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create("User mary");
	
		createdObj.setfirstName("Mary Jane");
		createdObj.setlastName("Watson");
	
		ctx.Create_UserSuccessCreated_k1sj0nl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_UserSuccessCreated_k1sj0nl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k1tx8Xl9Ee2Bb9t6ovoR_Q;
	}
	// container for retrieve enum literal SIB 'Get UserRole'.
	public SIB_ID execute_k1tx8Xl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Get_UserRoleBrokerLiteral_k1uZAnl9Ee2Bb9t6ovoR_Q = de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.broker;
		// branch 'broker'
		return SIB_ID._k1vAEXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_k1vAEXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_k1sj0nl9Ee2Bb9t6ovoR_Q.setrole(ctx.Get_UserRoleBrokerLiteral_k1uZAnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1yDYXl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_k1w1QHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_UserSuccessCreated_k1sj0nl9Ee2Bb9t6ovoR_Q.setbaseUser(ctx.Create_BaseUserSuccessCreated_k1yqcnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k15_MXl9Ee2Bb9t6ovoR_Q;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_k1yDYXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername("broker2");
	
		ctx.Create_BaseUserSuccessCreated_k1yqcnl9Ee2Bb9t6ovoR_Q = createdObj;
		ctx.Create_BaseUserSuccessCreated_k1yqcnl9Ee2Bb9t6ovoR_Q = createdObj;
	
		// branch 'success'
		return SIB_ID._k10foHl9Ee2Bb9t6ovoR_Q;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_k10foHl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_k11Gsnl9Ee2Bb9t6ovoR_Q = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._k1274Hl9Ee2Bb9t6ovoR_Q;
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_k1274Hl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_k1yqcnl9Ee2Bb9t6ovoR_Q.setpassword(ctx.HashPasswordSuccessHashedPassword_k11Gsnl9Ee2Bb9t6ovoR_Q);
		// branch 'success'
		return SIB_ID._k1w1QHl9Ee2Bb9t6ovoR_Q;
	}
	// container for graph i/o 'success'.
	public CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult execute_k15_MXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		return new CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult(new SuccessReturnImpl(ctx));
	}
	
}  

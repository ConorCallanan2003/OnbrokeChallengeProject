package info.scce.dime.process.onbroke.models.util;

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
public final class UserCanDiscuss_rUELYFOfEe2KQc5QIsW97w implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.onbroke.models.app.User user;
		private java.lang.Boolean result_FndKMVOhEe2KQc5QIsW97w = false;
		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.onbroke.models.app.Submission startSubmission_saBt4VOfEe2KQc5QIsW97w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User GetSubmitterSuccessSubmitter_v_0TYVOgEe2KQc5QIsW97w;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_rhXnkVOfEe2KQc5QIsW97w,
	_uW97sVOfEe2KQc5QIsW97w,
	_0iRAUVOfEe2KQc5QIsW97w,
	_v_VLMVOgEe2KQc5QIsW97w,
	_3DRvEVOgEe2KQc5QIsW97w,
	_J4vZMVOhEe2KQc5QIsW97w,
	_WqvFA1OhEe2KQc5QIsW97w,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController;

	@Inject
	public UserCanDiscuss_rUELYFOfEe2KQc5QIsW97w(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController) {
		this.beanManager = beanManager;
		this.BaseUserController = BaseUserController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Submission submission) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startSubmission_saBt4VOfEe2KQc5QIsW97w = submission;
		
		return ctx;
	}

	public UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Submission submission) {
		final Context ctx = createContext(submission);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._uW97sVOfEe2KQc5QIsW97w);
	}
	
	

	@Override
	public UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _rhXnkVOfEe2KQc5QIsW97w: {
					return execute_rhXnkVOfEe2KQc5QIsW97w(ctx);
				}
				case _uW97sVOfEe2KQc5QIsW97w: {
					curr = execute_uW97sVOfEe2KQc5QIsW97w(ctx);
					break;
				}
				case _0iRAUVOfEe2KQc5QIsW97w: {
					curr = execute_0iRAUVOfEe2KQc5QIsW97w(ctx);
					break;
				}
				case _v_VLMVOgEe2KQc5QIsW97w: {
					curr = execute_v_VLMVOgEe2KQc5QIsW97w(ctx);
					break;
				}
				case _3DRvEVOgEe2KQc5QIsW97w: {
					curr = execute_3DRvEVOgEe2KQc5QIsW97w(ctx);
					break;
				}
				case _J4vZMVOhEe2KQc5QIsW97w: {
					curr = execute_J4vZMVOhEe2KQc5QIsW97w(ctx);
					break;
				}
				case _WqvFA1OhEe2KQc5QIsW97w: {
					curr = execute_WqvFA1OhEe2KQc5QIsW97w(ctx);
					break;
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
	public static class UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_rhXnkVOfEe2KQc5QIsW97w";
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
			public java.lang.Boolean getResult();
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

			public java.lang.Boolean getResult() {
				return ctx.result_FndKMVOhEe2KQc5QIsW97w;
			}
		}
		

	private <T> T getConcreteUser(final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser subject, final Class<T> userType) {
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.User concreteUser: subject.getuser_User()) {
			if (userType.isAssignableFrom(concreteUser.getClass())) {
				return (T)concreteUser;
			}
		}
		throw new IllegalStateException("Did not find concrete user of type '" + userType.getSimpleName() + "'");
	}

	// sibs
	// container for graph i/o 'success'.
	public UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult execute_rhXnkVOfEe2KQc5QIsW97w(final Context ctx) {
		return new UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult(new SuccessReturnImpl(ctx));
	}
	// container for retrieve user sib 'Retrieve Current User'.
	public SIB_ID execute_uW97sVOfEe2KQc5QIsW97w(final Context ctx) {
		final Subject shiroSubj = SecurityUtils.getSubject();
	
		if (!shiroSubj.isAuthenticated()) {
			// branch 'not authenticated'
			return SIB_ID._WqvFA1OhEe2KQc5QIsW97w;
		}
	
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController subjectController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser subject = subjectController.read((Long)shiroSubj.getPrincipal());
		final de.ls5.dywa.generated.entity.onbroke.models.app.User concreteUser = getConcreteUser(subject, de.ls5.dywa.generated.entity.onbroke.models.app.User.class);
		ctx.user = concreteUser.getdywaSwitchedTo() != null ? concreteUser.getdywaSwitchedTo() : concreteUser;
		// branch 'success'
		return SIB_ID._0iRAUVOfEe2KQc5QIsW97w;
	}
	// container for switch enum SIB 'Switch UserRole'.
	public SIB_ID execute_0iRAUVOfEe2KQc5QIsW97w(final Context ctx) {
		if(Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getrole).orElse(null) == null) {
			// branch 'else'
			return SIB_ID._J4vZMVOhEe2KQc5QIsW97w;
		}
	
		switch(Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getrole).orElse(null).toString()){
			case "user": // branch 'user'
			return SIB_ID._v_VLMVOgEe2KQc5QIsW97w;
			default : // branch 'else'
			return SIB_ID._J4vZMVOhEe2KQc5QIsW97w;
		}
	}
	// container for graph abstraction 'GetSubmitter' and sub process 'GetSubmitter'.
	public SIB_ID execute_v_VLMVOgEe2KQc5QIsW97w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.GetSubmitter_Ba_mQVOgEe2KQc5QIsW97w instance = new info.scce.dime.process.onbroke.models.util.GetSubmitter_Ba_mQVOgEe2KQc5QIsW97w(ctx.beanManager);
	
		final info.scce.dime.process.onbroke.models.util.GetSubmitter_Ba_mQVOgEe2KQc5QIsW97w.GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult result = instance.execute(false, ctx.startSubmission_saBt4VOfEe2KQc5QIsW97w);
	
		switch(result.getBranchName()) {
		case "success": {
			ctx.GetSubmitterSuccessSubmitter_v_0TYVOgEe2KQc5QIsW97w = result.getSuccessReturn().getSubmitter();
			// branch 'success'
			return SIB_ID._3DRvEVOgEe2KQc5QIsW97w;
		}
			default: throw new IllegalStateException("SIB 'GetSubmitter' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for atomic SIB 'ObjectEquals'.
	public SIB_ID execute_3DRvEVOgEe2KQc5QIsW97w(final Context ctx) {
		if (info.scce.dime.common.CommonNativeServiceLibrary.objectEquals(ctx.GetSubmitterSuccessSubmitter_v_0TYVOgEe2KQc5QIsW97w, ctx.user)) {
			// branch 'true'
			return SIB_ID._J4vZMVOhEe2KQc5QIsW97w;
		}
		else {
			// branch 'false'
			return SIB_ID._WqvFA1OhEe2KQc5QIsW97w;
		}
	}
	// container for SIB 'PutToContext' putting some values to context.
	public SIB_ID execute_J4vZMVOhEe2KQc5QIsW97w(final Context ctx) {
		// put 'value'.
		ctx.result_FndKMVOhEe2KQc5QIsW97w = true;
	
		// branch 'success'
		return SIB_ID._rhXnkVOfEe2KQc5QIsW97w;
	}
	// container for SIB 'PutToContext' putting some values to context.
	public SIB_ID execute_WqvFA1OhEe2KQc5QIsW97w(final Context ctx) {
		// put 'value'.
		ctx.result_FndKMVOhEe2KQc5QIsW97w = false;
	
		// branch 'success'
		return SIB_ID._rhXnkVOfEe2KQc5QIsW97w;
	}
	
}  

package info.scce.dime.process.onbroke.models.areas.admin;

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
public final class ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg implements DIMEProcess {


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

		// direct dataflow variables.
		private java.lang.String UserFormSubmitFirstName_6cr__HYPHEN_MINUS__oV3XEe2t19MJLPzxmg;
		private java.lang.String UserFormSubmitLastName_6c4y8V3XEe2t19MJLPzxmg;
		private java.lang.String HashPasswordSuccessHashedPassword_FbtRAF3YEe2t19MJLPzxmg;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole> Retrieve_from_UserRoleSuccessRetrieved_u__HYPHEN_MINUS__4k4WEUEe2Fx80Lw9BAUQ = new ArrayList<>();
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole UserFormSubmitUserRole_Al6C0V3cEe2Be6DvFR1aQQ;
		private de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser Create_BaseUserSuccessCreated_FbufFl3YEe2t19MJLPzxmg;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User Create_UserSuccessCreated_FbwURV3YEe2t19MJLPzxmg;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_6cS9EV3XEe2t19MJLPzxmg,
	_8GdY0V3XEe2t19MJLPzxmg,
	_FbsC1l3YEe2t19MJLPzxmg,
	_FbtQ9V3YEe2t19MJLPzxmg,
	_FbywhV3YEe2t19MJLPzxmg,
	_FbzXn13YEe2t19MJLPzxmg,
	_FbvGKV3YEe2t19MJLPzxmg,
	_Fb0luF3YEe2t19MJLPzxmg,
	_rDbgMF3YEe2t19MJLPzxmg,
	_u__HYPHEN_MINUS__mRAWEUEe2Fx80Lw9BAUQ,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.UserRoleController UserRoleController;

	@Inject
	public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController, de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController, de.ls5.dywa.generated.controller.onbroke.models.app.UserRoleController UserRoleController) {
		this.beanManager = beanManager;
		this.BaseUserController = BaseUserController;
		this.UserController = UserController;
		this.UserRoleController = UserRoleController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._u__HYPHEN_MINUS__mRAWEUEe2Fx80Lw9BAUQ);
	}
	
	
	public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._u__HYPHEN_MINUS__mRAWEUEe2Fx80Lw9BAUQ);
	}

	@Override
	public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_6cS9EV3XEe2t19MJLPzxmg": return executeInternal(ctx, continue_6cS9EV3XEe2t19MJLPzxmg(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _6cS9EV3XEe2t19MJLPzxmg: {
					curr = execute_6cS9EV3XEe2t19MJLPzxmg(ctx);
					break;
				}
				case _8GdY0V3XEe2t19MJLPzxmg: {
					return execute_8GdY0V3XEe2t19MJLPzxmg(ctx);
				}
				case _FbsC1l3YEe2t19MJLPzxmg: {
					curr = execute_FbsC1l3YEe2t19MJLPzxmg(ctx);
					break;
				}
				case _FbtQ9V3YEe2t19MJLPzxmg: {
					curr = execute_FbtQ9V3YEe2t19MJLPzxmg(ctx);
					break;
				}
				case _FbywhV3YEe2t19MJLPzxmg: {
					curr = execute_FbywhV3YEe2t19MJLPzxmg(ctx);
					break;
				}
				case _FbzXn13YEe2t19MJLPzxmg: {
					curr = execute_FbzXn13YEe2t19MJLPzxmg(ctx);
					break;
				}
				case _FbvGKV3YEe2t19MJLPzxmg: {
					curr = execute_FbvGKV3YEe2t19MJLPzxmg(ctx);
					break;
				}
				case _Fb0luF3YEe2t19MJLPzxmg: {
					curr = execute_Fb0luF3YEe2t19MJLPzxmg(ctx);
					break;
				}
				case _rDbgMF3YEe2t19MJLPzxmg: {
					return execute_rDbgMF3YEe2t19MJLPzxmg(ctx);
				}
				case _u__HYPHEN_MINUS__mRAWEUEe2Fx80Lw9BAUQ: {
					curr = execute_u__HYPHEN_MINUS__mRAWEUEe2Fx80Lw9BAUQ(ctx);
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
	public static class ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private CancelReturn cancel;
		
		public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult(CancelReturn cancel) {
			this.branchName = "cancel";
			this.branchId = "_8GdY0V3XEe2t19MJLPzxmg";
			this.cancel = cancel;
		}
		private SuccessReturn success;
		
		public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_rDbgMF3YEe2t19MJLPzxmg";
			this.success = success;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public CancelReturn getCancelReturn() {
			return cancel;
		}
		public SuccessReturn getSuccessReturn() {
			return success;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>cancel</code>.
		 */
		public interface CancelReturn {
		}
	
		/**
		 * Return type of branch <code>cancel</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class CancelReturnImpl implements CancelReturn {

			private final Context ctx;

	        CancelReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		
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
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB UserForm _6cS9EV3XEe2t19MJLPzxmg
	private static class InputsForGUISIB_6cS9EV3XEe2t19MJLPzxmg {
		public java.util.List<de.ls5.dywa.generated.rest.types.UserRole>
		 userRoles = new ArrayList<>();
	}
	
	
	// container for GUI SIB 'UserForm'.
	public SIB_ID execute_6cS9EV3XEe2t19MJLPzxmg(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.UserRoleREST inputsUserRoleREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.UserRoleREST.class);
		
		final InputsForGUISIB_6cS9EV3XEe2t19MJLPzxmg inputs = new InputsForGUISIB_6cS9EV3XEe2t19MJLPzxmg();
		
		{
			//userRoles
			java.util.List<de.ls5.dywa.generated.rest.types.UserRole>
			 result = new java.util.ArrayList<>(ctx.Retrieve_from_UserRoleSuccessRetrieved_u__HYPHEN_MINUS__4k4WEUEe2Fx80Lw9BAUQ.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.UserRole obj : ctx.Retrieve_from_UserRoleSuccessRetrieved_u__HYPHEN_MINUS__4k4WEUEe2Fx80Lw9BAUQ) {
			
			de.ls5.dywa.generated.rest.types.UserRole restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg
					restTO = inputsUserRoleREST.read_UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.UserRole.fromDywaEntity(obj, objectCache);
					}
					// UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg
					de.ls5.dywa.generated.rest.types.UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.userRoles = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg:_6cS9EV3XEe2t19MJLPzxmg:_BDkd8F3WEe2t19MJLPzxmg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_6cS9EV3XEe2t19MJLPzxmg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_6cS9EV3XEe2t19MJLPzxmg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_6cS9EV3XEe2t19MJLPzxmg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.userform.UserForm_BDkd8F3WEe2t19MJLPzxmgResult result = (info.scce.dime.gui.onbroke.models.areas.admin.userform.UserForm_BDkd8F3WEe2t19MJLPzxmgResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn() != null) {
			ctx.UserFormSubmitUserRole_Al6C0V3cEe2Be6DvFR1aQQ = (de.ls5.dywa.generated.entity.onbroke.models.app.UserRole)result.getgui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn().getUserRole();
			ctx.UserFormSubmitFirstName_6cr__HYPHEN_MINUS__oV3XEe2t19MJLPzxmg = result.getgui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn().getFirstName();
			ctx.UserFormSubmitFirstName_6cr__HYPHEN_MINUS__oV3XEe2t19MJLPzxmg = result.getgui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn().getFirstName();
			ctx.UserFormSubmitLastName_6c4y8V3XEe2t19MJLPzxmg = result.getgui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn().getLastName();
			}
			// branch 'Submit'
			return SIB_ID._Fb0luF3YEe2t19MJLPzxmg;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._8GdY0V3XEe2t19MJLPzxmg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_6cS9EV3XEe2t19MJLPzxmg(ctx);
		}
	}
	// container for graph i/o 'cancel'.
	public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult execute_8GdY0V3XEe2t19MJLPzxmg(final Context ctx) {
		return new ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult(new CancelReturnImpl(ctx));
	}
	// container for SIB 'Set password' setting a new attribute value.
	public SIB_ID execute_FbsC1l3YEe2t19MJLPzxmg(final Context ctx) {
		ctx.Create_BaseUserSuccessCreated_FbufFl3YEe2t19MJLPzxmg.setpassword(ctx.HashPasswordSuccessHashedPassword_FbtRAF3YEe2t19MJLPzxmg);
		// branch 'success'
		return SIB_ID._FbzXn13YEe2t19MJLPzxmg;
	}
	// container for atomic SIB 'HashPassword'.
	public SIB_ID execute_FbtQ9V3YEe2t19MJLPzxmg(final Context ctx) {
		try {
			final java.lang.String result = info.scce.dime.common.CommonNativeServiceLibrary.createSaltedSHA512Hash("pwd");
			ctx.HashPasswordSuccessHashedPassword_FbtRAF3YEe2t19MJLPzxmg = result;
		}
		catch (Exception e) {
			e.printStackTrace();
			// branch 'failure'
			throw new IllegalStateException("SIB 'HashPassword' has no successor defined for branch 'failure'");
		}
		// branch 'success'
		return SIB_ID._FbsC1l3YEe2t19MJLPzxmg;
	}
	// container for SIB 'Set role' setting a new attribute value.
	public SIB_ID execute_FbywhV3YEe2t19MJLPzxmg(final Context ctx) {
		ctx.Create_UserSuccessCreated_FbwURV3YEe2t19MJLPzxmg.setrole(ctx.UserFormSubmitUserRole_Al6C0V3cEe2Be6DvFR1aQQ);
		// branch 'success'
		return SIB_ID._FbvGKV3YEe2t19MJLPzxmg;
	}
	// container for SIB 'Set baseUser' setting a new attribute value.
	public SIB_ID execute_FbzXn13YEe2t19MJLPzxmg(final Context ctx) {
		ctx.Create_UserSuccessCreated_FbwURV3YEe2t19MJLPzxmg.setbaseUser(ctx.Create_BaseUserSuccessCreated_FbufFl3YEe2t19MJLPzxmg);
		// branch 'success'
		return SIB_ID._rDbgMF3YEe2t19MJLPzxmg;
	}
	// container for create User SIB 'Create BaseUser'.
	public SIB_ID execute_FbvGKV3YEe2t19MJLPzxmg(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser createdObj = domController.create(null);
	
		createdObj.setusername(ctx.UserFormSubmitFirstName_6cr__HYPHEN_MINUS__oV3XEe2t19MJLPzxmg);
	
		ctx.Create_BaseUserSuccessCreated_FbufFl3YEe2t19MJLPzxmg = createdObj;
		ctx.Create_BaseUserSuccessCreated_FbufFl3YEe2t19MJLPzxmg = createdObj;
	
		// branch 'success'
		return SIB_ID._FbtQ9V3YEe2t19MJLPzxmg;
	}
	// container for create SIB 'Create User'.
	public SIB_ID execute_Fb0luF3YEe2t19MJLPzxmg(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.User createdObj = domController.create(null);
	
		createdObj.setfirstName(ctx.UserFormSubmitFirstName_6cr__HYPHEN_MINUS__oV3XEe2t19MJLPzxmg);
		createdObj.setlastName(ctx.UserFormSubmitLastName_6c4y8V3XEe2t19MJLPzxmg);
	
		ctx.Create_UserSuccessCreated_FbwURV3YEe2t19MJLPzxmg = createdObj;
		ctx.Create_UserSuccessCreated_FbwURV3YEe2t19MJLPzxmg = createdObj;
	
		// branch 'success'
		return SIB_ID._FbywhV3YEe2t19MJLPzxmg;
	}
	// container for graph i/o 'success'.
	public ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult execute_rDbgMF3YEe2t19MJLPzxmg(final Context ctx) {
		return new ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult(new SuccessReturnImpl(ctx));
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from UserRole'.
	public SIB_ID execute_u__HYPHEN_MINUS__mRAWEUEe2Fx80Lw9BAUQ(final Context ctx) {
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole> result = Arrays.asList(de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.values());
		List<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole> value8 = result;
		if (value8 != null) { // prevent null in lists
		ctx.Retrieve_from_UserRoleSuccessRetrieved_u__HYPHEN_MINUS__4k4WEUEe2Fx80Lw9BAUQ = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole>(value8);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._8GdY0V3XEe2t19MJLPzxmg;
		}
		else {
			// branch 'success'
			return SIB_ID._6cS9EV3XEe2t19MJLPzxmg;
		}
	}
	
}  

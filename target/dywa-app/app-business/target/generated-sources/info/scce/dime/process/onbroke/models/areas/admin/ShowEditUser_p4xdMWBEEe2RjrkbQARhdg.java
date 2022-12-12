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
public final class ShowEditUser_p4xdMWBEEe2RjrkbQARhdg implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.User user;
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.user != null) {
						result.user = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(ctx.user, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(ctx.user, result.user, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.user != null) {
						result.user = contextTransformer.transform(this.user);
					}

					return result;
		        }
			}

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
		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.onbroke.models.app.User startUser_2A9__HYPHEN_MINUS__EWBEEe2RjrkbQARhdg;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole> Retrieve_from_UserRoleSuccessRetrieved_58hXIWEUEe2Fx80Lw9BAUQ = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_qIukwWBEEe2RjrkbQARhdg,
	_r7eUwWBEEe2RjrkbQARhdg,
	_tE6CAGBEEe2RjrkbQARhdg,
	_58W_EWEUEe2Fx80Lw9BAUQ,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.UserRoleController UserRoleController;

	@Inject
	public ShowEditUser_p4xdMWBEEe2RjrkbQARhdg(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.UserRoleController UserRoleController) {
		this.beanManager = beanManager;
		this.UserRoleController = UserRoleController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.user = user;
		ctx.startUser_2A9__HYPHEN_MINUS__EWBEEe2RjrkbQARhdg = user;
		
		return ctx;
	}

	public ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = createContext(user);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._58W_EWEUEe2Fx80Lw9BAUQ);
	}
	
	
	public ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = createContext(user);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._58W_EWEUEe2Fx80Lw9BAUQ);
	}

	@Override
	public ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_r7eUwWBEEe2RjrkbQARhdg": return executeInternal(ctx, continue_r7eUwWBEEe2RjrkbQARhdg(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _qIukwWBEEe2RjrkbQARhdg: {
					return execute_qIukwWBEEe2RjrkbQARhdg(ctx);
				}
				case _r7eUwWBEEe2RjrkbQARhdg: {
					curr = execute_r7eUwWBEEe2RjrkbQARhdg(ctx);
					break;
				}
				case _tE6CAGBEEe2RjrkbQARhdg: {
					return execute_tE6CAGBEEe2RjrkbQARhdg(ctx);
				}
				case _58W_EWEUEe2Fx80Lw9BAUQ: {
					curr = execute_58W_EWEUEe2Fx80Lw9BAUQ(ctx);
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
	public static class ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_qIukwWBEEe2RjrkbQARhdg";
			this.success = success;
		}
		private CancelReturn cancel;
		
		public ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult(CancelReturn cancel) {
			this.branchName = "cancel";
			this.branchId = "_tE6CAGBEEe2RjrkbQARhdg";
			this.cancel = cancel;
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
		public CancelReturn getCancelReturn() {
			return cancel;
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
		


	// sibs
	// container for graph i/o 'success'.
	public ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult execute_qIukwWBEEe2RjrkbQARhdg(final Context ctx) {
		return new ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB EditUserForm _r7eUwWBEEe2RjrkbQARhdg
	private static class InputsForGUISIB_r7eUwWBEEe2RjrkbQARhdg {
		public de.ls5.dywa.generated.rest.types.User
		 currentUser;
		public java.lang.String lastName;
		public java.lang.String firstName;
		public java.util.List<de.ls5.dywa.generated.rest.types.UserRole>
		 userRoles = new ArrayList<>();
		public de.ls5.dywa.generated.rest.types.UserRole
		 userRole;
	}
	
	
	// container for GUI SIB 'EditUserForm'.
	public SIB_ID execute_r7eUwWBEEe2RjrkbQARhdg(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.UserREST inputsUserREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.UserREST.class);
		final de.ls5.dywa.generated.rest.controller.UserRoleREST inputsUserRoleREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.UserRoleREST.class);
		
		final InputsForGUISIB_r7eUwWBEEe2RjrkbQARhdg inputs = new InputsForGUISIB_r7eUwWBEEe2RjrkbQARhdg();
		
		{
			de.ls5.dywa.generated.rest.types.User
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.User obj = ctx.startUser_2A9__HYPHEN_MINUS__EWBEEe2RjrkbQARhdg;
			
			de.ls5.dywa.generated.rest.types.User restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_EditUserFormUserSelectivex1_CPN5EWBEEe2RjrkbQARhdg
					restTO = inputsUserREST.read_EditAssignmentUserSelectivex1x12x12x19x19x2x2_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(obj, objectCache);
					}
					// EditUserFormUserSelectivex1_CPN5EWBEEe2RjrkbQARhdg
					de.ls5.dywa.generated.rest.types.EditAssignmentUserSelectivex1x12x12x19x19x2x2_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.currentUser = result;
		}
		inputs.lastName = Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getlastName).orElse(new java.lang.String());
		inputs.firstName = Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getfirstName).orElse(new java.lang.String());
		{
			//userRoles
			java.util.List<de.ls5.dywa.generated.rest.types.UserRole>
			 result = new java.util.ArrayList<>(ctx.Retrieve_from_UserRoleSuccessRetrieved_58hXIWEUEe2Fx80Lw9BAUQ.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.UserRole obj : ctx.Retrieve_from_UserRoleSuccessRetrieved_58hXIWEUEe2Fx80Lw9BAUQ) {
			
			de.ls5.dywa.generated.rest.types.UserRole restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_EditUserFormUserRoleSelectivex4_CPN5EWBEEe2RjrkbQARhdg
					restTO = inputsUserRoleREST.read_UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.UserRole.fromDywaEntity(obj, objectCache);
					}
					// EditUserFormUserRoleSelectivex4_CPN5EWBEEe2RjrkbQARhdg
					de.ls5.dywa.generated.rest.types.UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.userRoles = result;
		}
		{
			de.ls5.dywa.generated.rest.types.UserRole
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.UserRole obj = Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getrole).orElse(null);
			
			de.ls5.dywa.generated.rest.types.UserRole restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_EditUserFormUserRoleSelectivex5_CPN5EWBEEe2RjrkbQARhdg
					restTO = inputsUserRoleREST.read_UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.UserRole.fromDywaEntity(obj, objectCache);
					}
					// EditUserFormUserRoleSelectivex5_CPN5EWBEEe2RjrkbQARhdg
					de.ls5.dywa.generated.rest.types.UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.userRole = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowEditUser_p4xdMWBEEe2RjrkbQARhdg:_r7eUwWBEEe2RjrkbQARhdg:_CPN5EWBEEe2RjrkbQARhdg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_r7eUwWBEEe2RjrkbQARhdg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_r7eUwWBEEe2RjrkbQARhdg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_r7eUwWBEEe2RjrkbQARhdg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult result = (info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__FLv7w2BEEe2RjrkbQARhdgSubmitReturn() != null) {
			Optional.ofNullable(ctx.user).get().setrole((de.ls5.dywa.generated.entity.onbroke.models.app.UserRole)result.getgui__FLv7w2BEEe2RjrkbQARhdgSubmitReturn().getUserRole());
			Optional.ofNullable(ctx.user).get().setlastName(result.getgui__FLv7w2BEEe2RjrkbQARhdgSubmitReturn().getLastName());
			Optional.ofNullable(ctx.user).get().setfirstName(result.getgui__FLv7w2BEEe2RjrkbQARhdgSubmitReturn().getFirstName());
			}
			// branch 'Submit'
			return SIB_ID._qIukwWBEEe2RjrkbQARhdg;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._tE6CAGBEEe2RjrkbQARhdg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_r7eUwWBEEe2RjrkbQARhdg(ctx);
		}
	}
	// container for graph i/o 'cancel'.
	public ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult execute_tE6CAGBEEe2RjrkbQARhdg(final Context ctx) {
		return new ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult(new CancelReturnImpl(ctx));
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from UserRole'.
	public SIB_ID execute_58W_EWEUEe2Fx80Lw9BAUQ(final Context ctx) {
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole> result = Arrays.asList(de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.values());
		List<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole> value30 = result;
		if (value30 != null) { // prevent null in lists
		ctx.Retrieve_from_UserRoleSuccessRetrieved_58hXIWEUEe2Fx80Lw9BAUQ = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.UserRole>(value30);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._tE6CAGBEEe2RjrkbQARhdg;
		}
		else {
			// branch 'success'
			return SIB_ID._r7eUwWBEEe2RjrkbQARhdg;
		}
	}
	
}  

package info.scce.dime.process.onbroke.models.areas.user;

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
public final class NewPreference_5nurMGAJEe2YNpeIwSxEfw implements DIMEProcess {


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
		private java.lang.String CreatePreferenceSubmitTitle_svOSQWAKEe2YNpeIwSxEfw;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_50pF0GAJEe2YNpeIwSxEfw,
	_sumAIWAKEe2YNpeIwSxEfw,
	_zg6BcWAKEe2YNpeIwSxEfw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;

	@Inject
	public NewPreference_5nurMGAJEe2YNpeIwSxEfw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController) {
		this.beanManager = beanManager;
		this.FeatureController = FeatureController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public NewPreference_5nurMGAJEe2YNpeIwSxEfwResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._sumAIWAKEe2YNpeIwSxEfw);
	}
	
	
	public NewPreference_5nurMGAJEe2YNpeIwSxEfwResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._sumAIWAKEe2YNpeIwSxEfw);
	}

	@Override
	public NewPreference_5nurMGAJEe2YNpeIwSxEfwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_sumAIWAKEe2YNpeIwSxEfw": return executeInternal(ctx, continue_sumAIWAKEe2YNpeIwSxEfw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private NewPreference_5nurMGAJEe2YNpeIwSxEfwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _50pF0GAJEe2YNpeIwSxEfw: {
					return execute_50pF0GAJEe2YNpeIwSxEfw(ctx);
				}
				case _sumAIWAKEe2YNpeIwSxEfw: {
					curr = execute_sumAIWAKEe2YNpeIwSxEfw(ctx);
					break;
				}
				case _zg6BcWAKEe2YNpeIwSxEfw: {
					curr = execute_zg6BcWAKEe2YNpeIwSxEfw(ctx);
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
	public static class NewPreference_5nurMGAJEe2YNpeIwSxEfwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public NewPreference_5nurMGAJEe2YNpeIwSxEfwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_50pF0GAJEe2YNpeIwSxEfw";
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
	// container for graph i/o 'success'.
	public NewPreference_5nurMGAJEe2YNpeIwSxEfwResult execute_50pF0GAJEe2YNpeIwSxEfw(final Context ctx) {
		return new NewPreference_5nurMGAJEe2YNpeIwSxEfwResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB CreatePreference _sumAIWAKEe2YNpeIwSxEfw
	private static class InputsForGUISIB_sumAIWAKEe2YNpeIwSxEfw {
	}
	
	
	// container for GUI SIB 'CreatePreference'.
	public SIB_ID execute_sumAIWAKEe2YNpeIwSxEfw(final Context ctx) {
	
		
		final InputsForGUISIB_sumAIWAKEe2YNpeIwSxEfw inputs = new InputsForGUISIB_sumAIWAKEe2YNpeIwSxEfw();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw:_sumAIWAKEe2YNpeIwSxEfw:_Bn2jcWAKEe2YNpeIwSxEfw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_sumAIWAKEe2YNpeIwSxEfw", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_sumAIWAKEe2YNpeIwSxEfw(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_sumAIWAKEe2YNpeIwSxEfw");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult result = (info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__NviG8WAKEe2YNpeIwSxEfwSubmitReturn() != null) {
			ctx.CreatePreferenceSubmitTitle_svOSQWAKEe2YNpeIwSxEfw = result.getgui__NviG8WAKEe2YNpeIwSxEfwSubmitReturn().getTitle();
			}
			// branch 'Submit'
			return SIB_ID._zg6BcWAKEe2YNpeIwSxEfw;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._50pF0GAJEe2YNpeIwSxEfw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_sumAIWAKEe2YNpeIwSxEfw(ctx);
		}
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_zg6BcWAKEe2YNpeIwSxEfw(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setpriority(null);
		createdObj.setisTemplateForOffer(true);
		createdObj.settitle(ctx.CreatePreferenceSubmitTitle_svOSQWAKEe2YNpeIwSxEfw);
		createdObj.setisTemplateForBidding(false);
	
	
		// branch 'success'
		return SIB_ID._50pF0GAJEe2YNpeIwSxEfw;
	}
	
}  

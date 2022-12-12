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
public final class NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw implements DIMEProcess {


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
		private java.lang.String CreatefeatureGUISubmitTitle_PneecF__HYPHEN_MINUS__mEe2Y_7LmLNugjg;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_jB0zwV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw,
	_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg,
	_TxV20V__HYPHEN_MINUS__mEe2Y_7LmLNugjg,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;

	@Inject
	public NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController) {
		this.beanManager = beanManager;
		this.FeatureController = FeatureController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg);
	}
	
	
	public NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg);
	}

	@Override
	public NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_PnWioV-mEe2Y_7LmLNugjg": return executeInternal(ctx, continue_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _jB0zwV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw: {
					return execute_jB0zwV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw(ctx);
				}
				case _PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg: {
					curr = execute_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg(ctx);
					break;
				}
				case _TxV20V__HYPHEN_MINUS__mEe2Y_7LmLNugjg: {
					curr = execute_TxV20V__HYPHEN_MINUS__mEe2Y_7LmLNugjg(ctx);
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
	public static class NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_jB0zwV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw";
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
	public NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult execute_jB0zwV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw(final Context ctx) {
		return new NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB CreatefeatureGUI _PnWioV-mEe2Y_7LmLNugjg
	private static class InputsForGUISIB_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg {
	}
	
	
	// container for GUI SIB 'CreatefeatureGUI'.
	public SIB_ID execute_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg(final Context ctx) {
	
		
		final InputsForGUISIB_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg inputs = new InputsForGUISIB_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw:_PnWioV-mEe2Y_7LmLNugjg:_N90GIV7vEe2Ml8OCwlD7jg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_PnWioV-mEe2Y_7LmLNugjg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_PnWioV-mEe2Y_7LmLNugjg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.createfeaturegui.CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgResult result = (info.scce.dime.gui.onbroke.models.areas.user.createfeaturegui.CreatefeatureGUI_N90GIV7vEe2Ml8OCwlD7jgResult) guiResult;
		if ("Label".equals(result.getBranchName())) {
			// branch 'Label'
			return SIB_ID._jB0zwV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw;
		} else 
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__Scyy4V7vEe2Ml8OCwlD7jgSubmitReturn() != null) {
			ctx.CreatefeatureGUISubmitTitle_PneecF__HYPHEN_MINUS__mEe2Y_7LmLNugjg = result.getgui__Scyy4V7vEe2Ml8OCwlD7jgSubmitReturn().getTitle();
			}
			// branch 'Submit'
			return SIB_ID._TxV20V__HYPHEN_MINUS__mEe2Y_7LmLNugjg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_PnWioV__HYPHEN_MINUS__mEe2Y_7LmLNugjg(ctx);
		}
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_TxV20V__HYPHEN_MINUS__mEe2Y_7LmLNugjg(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create(null);
	
		createdObj.setisTemplateForOffer(false);
		createdObj.settitle(ctx.CreatefeatureGUISubmitTitle_PneecF__HYPHEN_MINUS__mEe2Y_7LmLNugjg);
		createdObj.setisTemplateForBidding(true);
	
	
		// branch 'success'
		return SIB_ID._jB0zwV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw;
	}
	
}  

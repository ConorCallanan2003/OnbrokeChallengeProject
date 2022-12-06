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
public final class ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg implements DIMEProcess {


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
		private java.lang.String FeatureFormSubmitTitle_5m2__HYPHEN_MINUS__i1uVEe2nXJXMw4vrvg;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Priority FeatureFormSubmitPriority_pZqOEWGeEe2SIeIc0TVXOQ;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> Retrieve_from_PrioritySuccessRetrieved_wG3F4WGeEe2SIeIc0TVXOQ = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_5m6o41uVEe2nXJXMw4vrvg,
	_5m7QBFuVEe2nXJXMw4vrvg,
	_5m73BFuVEe2nXJXMw4vrvg,
	_7f91N1uVEe2nXJXMw4vrvg,
	_wGmAIWGeEe2SIeIc0TVXOQ,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController;

	@Inject
	public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController, de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController) {
		this.beanManager = beanManager;
		this.FeatureController = FeatureController;
		this.PriorityController = PriorityController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._wGmAIWGeEe2SIeIc0TVXOQ);
	}
	
	
	public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._wGmAIWGeEe2SIeIc0TVXOQ);
	}

	@Override
	public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_5m6o41uVEe2nXJXMw4vrvg": return executeInternal(ctx, continue_5m6o41uVEe2nXJXMw4vrvg(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _5m6o41uVEe2nXJXMw4vrvg: {
					curr = execute_5m6o41uVEe2nXJXMw4vrvg(ctx);
					break;
				}
				case _5m7QBFuVEe2nXJXMw4vrvg: {
					return execute_5m7QBFuVEe2nXJXMw4vrvg(ctx);
				}
				case _5m73BFuVEe2nXJXMw4vrvg: {
					return execute_5m73BFuVEe2nXJXMw4vrvg(ctx);
				}
				case _7f91N1uVEe2nXJXMw4vrvg: {
					curr = execute_7f91N1uVEe2nXJXMw4vrvg(ctx);
					break;
				}
				case _wGmAIWGeEe2SIeIc0TVXOQ: {
					curr = execute_wGmAIWGeEe2SIeIc0TVXOQ(ctx);
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
	public static class ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_5m7QBFuVEe2nXJXMw4vrvg";
			this.success = success;
		}
		private CancelReturn cancel;
		
		public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult(CancelReturn cancel) {
			this.branchName = "cancel";
			this.branchId = "_5m73BFuVEe2nXJXMw4vrvg";
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
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB FeatureForm _5m6o41uVEe2nXJXMw4vrvg
	private static class InputsForGUISIB_5m6o41uVEe2nXJXMw4vrvg {
		public java.util.List<de.ls5.dywa.generated.rest.types.Priority>
		 priorities = new ArrayList<>();
	}
	
	
	// container for GUI SIB 'FeatureForm'.
	public SIB_ID execute_5m6o41uVEe2nXJXMw4vrvg(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.PriorityREST inputsPriorityREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.PriorityREST.class);
		
		final InputsForGUISIB_5m6o41uVEe2nXJXMw4vrvg inputs = new InputsForGUISIB_5m6o41uVEe2nXJXMw4vrvg();
		
		{
			//priorities
			java.util.List<de.ls5.dywa.generated.rest.types.Priority>
			 result = new java.util.ArrayList<>(ctx.Retrieve_from_PrioritySuccessRetrieved_wG3F4WGeEe2SIeIc0TVXOQ.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Priority obj : ctx.Retrieve_from_PrioritySuccessRetrieved_wG3F4WGeEe2SIeIc0TVXOQ) {
			
			de.ls5.dywa.generated.rest.types.Priority restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_FeatureFormPrioritySelectivex2_OXlYQVuSEe2nXJXMw4vrvg
					restTO = inputsPriorityREST.read_EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Priority.fromDywaEntity(obj, objectCache);
					}
					// FeatureFormPrioritySelectivex2_OXlYQVuSEe2nXJXMw4vrvg
					de.ls5.dywa.generated.rest.types.EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.priorities = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg:_5m6o41uVEe2nXJXMw4vrvg:_OXlYQVuSEe2nXJXMw4vrvg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_5m6o41uVEe2nXJXMw4vrvg", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_5m6o41uVEe2nXJXMw4vrvg(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_5m6o41uVEe2nXJXMw4vrvg");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.featureform.FeatureForm_OXlYQVuSEe2nXJXMw4vrvgResult result = (info.scce.dime.gui.onbroke.models.areas.admin.featureform.FeatureForm_OXlYQVuSEe2nXJXMw4vrvgResult) guiResult;
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._5m73BFuVEe2nXJXMw4vrvg;
		} else 
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__r0epMVuUEe2nXJXMw4vrvgSubmitReturn() != null) {
			ctx.FeatureFormSubmitTitle_5m2__HYPHEN_MINUS__i1uVEe2nXJXMw4vrvg = result.getgui__r0epMVuUEe2nXJXMw4vrvgSubmitReturn().getTitle();
			ctx.FeatureFormSubmitPriority_pZqOEWGeEe2SIeIc0TVXOQ = (de.ls5.dywa.generated.entity.onbroke.models.app.Priority)result.getgui__r0epMVuUEe2nXJXMw4vrvgSubmitReturn().getPriority();
			}
			// branch 'Submit'
			return SIB_ID._7f91N1uVEe2nXJXMw4vrvg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_5m6o41uVEe2nXJXMw4vrvg(ctx);
		}
	}
	// container for graph i/o 'success'.
	public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult execute_5m7QBFuVEe2nXJXMw4vrvg(final Context ctx) {
		return new ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult(new SuccessReturnImpl(ctx));
	}
	// container for graph i/o 'cancel'.
	public ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult execute_5m73BFuVEe2nXJXMw4vrvg(final Context ctx) {
		return new ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult(new CancelReturnImpl(ctx));
	}
	// container for create SIB 'Create Feature'.
	public SIB_ID execute_7f91N1uVEe2nXJXMw4vrvg(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature createdObj = domController.create("Feature attrTmpl");
	
		createdObj.setisTemplateForBidding(true);
		createdObj.settitle(ctx.FeatureFormSubmitTitle_5m2__HYPHEN_MINUS__i1uVEe2nXJXMw4vrvg);
		createdObj.setpriority(ctx.FeatureFormSubmitPriority_pZqOEWGeEe2SIeIc0TVXOQ);
	
	
		// branch 'success'
		return SIB_ID._5m7QBFuVEe2nXJXMw4vrvg;
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Priority'.
	public SIB_ID execute_wGmAIWGeEe2SIeIc0TVXOQ(final Context ctx) {
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> result = Arrays.asList(de.ls5.dywa.generated.entity.onbroke.models.app.Priority.values());
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> value6 = result;
		if (value6 != null) { // prevent null in lists
		ctx.Retrieve_from_PrioritySuccessRetrieved_wG3F4WGeEe2SIeIc0TVXOQ = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Priority>(value6);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._5m73BFuVEe2nXJXMw4vrvg;
		}
		else {
			// branch 'success'
			return SIB_ID._5m6o41uVEe2nXJXMw4vrvg;
		}
	}
	
}  

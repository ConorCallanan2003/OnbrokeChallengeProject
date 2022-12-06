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
public final class EditFeature_EYvFUVuZEe28kPQ81TnB9g implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.Feature feature;
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.feature != null) {
						result.feature = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(ctx.feature, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(ctx.feature, result.feature, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.feature != null) {
						result.feature = contextTransformer.transform(this.feature);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature feature;
		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature startFeature_Fhp1MVuZEe28kPQ81TnB9g;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> Retrieve_from_PrioritySuccessRetrieved_Jakl0WGfEe2SIeIc0TVXOQ = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_EmLrcVuZEe28kPQ81TnB9g,
	_HW6tsFuZEe28kPQ81TnB9g,
	_KvnH0VuZEe28kPQ81TnB9g,
	_JacqAWGfEe2SIeIc0TVXOQ,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController;

	@Inject
	public EditFeature_EYvFUVuZEe28kPQ81TnB9g(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController) {
		this.beanManager = beanManager;
		this.PriorityController = PriorityController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Feature feature) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startFeature_Fhp1MVuZEe28kPQ81TnB9g = feature;
		ctx.feature = feature;
		
		return ctx;
	}

	public EditFeature_EYvFUVuZEe28kPQ81TnB9gResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Feature feature) {
		final Context ctx = createContext(feature);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._JacqAWGfEe2SIeIc0TVXOQ);
	}
	
	
	public EditFeature_EYvFUVuZEe28kPQ81TnB9gResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Feature feature) {
		final Context ctx = createContext(feature);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._JacqAWGfEe2SIeIc0TVXOQ);
	}

	@Override
	public EditFeature_EYvFUVuZEe28kPQ81TnB9gResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_HW6tsFuZEe28kPQ81TnB9g": return executeInternal(ctx, continue_HW6tsFuZEe28kPQ81TnB9g(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private EditFeature_EYvFUVuZEe28kPQ81TnB9gResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _EmLrcVuZEe28kPQ81TnB9g: {
					return execute_EmLrcVuZEe28kPQ81TnB9g(ctx);
				}
				case _HW6tsFuZEe28kPQ81TnB9g: {
					curr = execute_HW6tsFuZEe28kPQ81TnB9g(ctx);
					break;
				}
				case _KvnH0VuZEe28kPQ81TnB9g: {
					return execute_KvnH0VuZEe28kPQ81TnB9g(ctx);
				}
				case _JacqAWGfEe2SIeIc0TVXOQ: {
					curr = execute_JacqAWGfEe2SIeIc0TVXOQ(ctx);
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
	public static class EditFeature_EYvFUVuZEe28kPQ81TnB9gResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public EditFeature_EYvFUVuZEe28kPQ81TnB9gResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_EmLrcVuZEe28kPQ81TnB9g";
			this.success = success;
		}
		private CancelReturn cancel;
		
		public EditFeature_EYvFUVuZEe28kPQ81TnB9gResult(CancelReturn cancel) {
			this.branchName = "cancel";
			this.branchId = "_KvnH0VuZEe28kPQ81TnB9g";
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
	public EditFeature_EYvFUVuZEe28kPQ81TnB9gResult execute_EmLrcVuZEe28kPQ81TnB9g(final Context ctx) {
		return new EditFeature_EYvFUVuZEe28kPQ81TnB9gResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB EditFeatureForm _HW6tsFuZEe28kPQ81TnB9g
	private static class InputsForGUISIB_HW6tsFuZEe28kPQ81TnB9g {
		public java.lang.String title;
		public de.ls5.dywa.generated.rest.types.Feature
		 feature;
		public java.util.List<de.ls5.dywa.generated.rest.types.Priority>
		 priorities = new ArrayList<>();
		public de.ls5.dywa.generated.rest.types.Priority
		 priority;
	}
	
	
	// container for GUI SIB 'EditFeatureForm'.
	public SIB_ID execute_HW6tsFuZEe28kPQ81TnB9g(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.FeatureREST inputsFeatureREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.FeatureREST.class);
		final de.ls5.dywa.generated.rest.controller.PriorityREST inputsPriorityREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.PriorityREST.class);
		
		final InputsForGUISIB_HW6tsFuZEe28kPQ81TnB9g inputs = new InputsForGUISIB_HW6tsFuZEe28kPQ81TnB9g();
		
		inputs.title = Optional.ofNullable(ctx.feature).map(de.ls5.dywa.generated.entity.onbroke.models.app.Feature::gettitle).orElse(new java.lang.String());
		{
			de.ls5.dywa.generated.rest.types.Feature
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj = ctx.startFeature_Fhp1MVuZEe28kPQ81TnB9g;
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_EditFeatureFormFeatureSelectivex2___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// EditFeatureFormFeatureSelectivex2___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.feature = result;
		}
		{
			//priorities
			java.util.List<de.ls5.dywa.generated.rest.types.Priority>
			 result = new java.util.ArrayList<>(ctx.Retrieve_from_PrioritySuccessRetrieved_Jakl0WGfEe2SIeIc0TVXOQ.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Priority obj : ctx.Retrieve_from_PrioritySuccessRetrieved_Jakl0WGfEe2SIeIc0TVXOQ) {
			
			de.ls5.dywa.generated.rest.types.Priority restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g
					restTO = inputsPriorityREST.read_EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Priority.fromDywaEntity(obj, objectCache);
					}
					// EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g
					de.ls5.dywa.generated.rest.types.EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.priorities = result;
		}
		{
			de.ls5.dywa.generated.rest.types.Priority
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Priority obj = Optional.ofNullable(ctx.feature).map(de.ls5.dywa.generated.entity.onbroke.models.app.Feature::getpriority).orElse(null);
			
			de.ls5.dywa.generated.rest.types.Priority restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_EditFeatureFormPrioritySelectivex4___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g
					restTO = inputsPriorityREST.read_EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Priority.fromDywaEntity(obj, objectCache);
					}
					// EditFeatureFormPrioritySelectivex4___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g
					de.ls5.dywa.generated.rest.types.EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.priority = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.EditFeature_EYvFUVuZEe28kPQ81TnB9g:_HW6tsFuZEe28kPQ81TnB9g:_-UC0cVuXEe28kPQ81TnB9g", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_HW6tsFuZEe28kPQ81TnB9g", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_HW6tsFuZEe28kPQ81TnB9g(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_HW6tsFuZEe28kPQ81TnB9g");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult result = (info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__BjRJk1uYEe28kPQ81TnB9gSubmitReturn() != null) {
			Optional.ofNullable(ctx.feature).get().settitle(result.getgui__BjRJk1uYEe28kPQ81TnB9gSubmitReturn().getTitle());
			Optional.ofNullable(ctx.feature).get().setpriority((de.ls5.dywa.generated.entity.onbroke.models.app.Priority)result.getgui__BjRJk1uYEe28kPQ81TnB9gSubmitReturn().getPriority());
			}
			// branch 'Submit'
			return SIB_ID._EmLrcVuZEe28kPQ81TnB9g;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._KvnH0VuZEe28kPQ81TnB9g;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_HW6tsFuZEe28kPQ81TnB9g(ctx);
		}
	}
	// container for graph i/o 'cancel'.
	public EditFeature_EYvFUVuZEe28kPQ81TnB9gResult execute_KvnH0VuZEe28kPQ81TnB9g(final Context ctx) {
		return new EditFeature_EYvFUVuZEe28kPQ81TnB9gResult(new CancelReturnImpl(ctx));
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Priority'.
	public SIB_ID execute_JacqAWGfEe2SIeIc0TVXOQ(final Context ctx) {
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> result = Arrays.asList(de.ls5.dywa.generated.entity.onbroke.models.app.Priority.values());
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> value7 = result;
		if (value7 != null) { // prevent null in lists
		ctx.Retrieve_from_PrioritySuccessRetrieved_Jakl0WGfEe2SIeIc0TVXOQ = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Priority>(value7);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._KvnH0VuZEe28kPQ81TnB9g;
		}
		else {
			// branch 'success'
			return SIB_ID._HW6tsFuZEe28kPQ81TnB9g;
		}
	}
	
}  

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
public final class NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.User startUser_K7kYMWDTEe2HtLNu6rgXKQ;
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg = new ArrayList<>();
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startUser_K7kYMWDTEe2HtLNu6rgXKQ != null) {
						result.startUser_K7kYMWDTEe2HtLNu6rgXKQ = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(ctx.startUser_K7kYMWDTEe2HtLNu6rgXKQ, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(ctx.startUser_K7kYMWDTEe2HtLNu6rgXKQ, result.startUser_K7kYMWDTEe2HtLNu6rgXKQ, objectCache);
					}
					result.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg.add(trans);
					}
					result.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg.add(trans);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startUser_K7kYMWDTEe2HtLNu6rgXKQ != null) {
						result.startUser_K7kYMWDTEe2HtLNu6rgXKQ = contextTransformer.transform(this.startUser_K7kYMWDTEe2HtLNu6rgXKQ);
					}
					result.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg = this.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg = this.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());

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

		// direct dataflow variables.
		private java.lang.String NewBiddingAreaSubmitTitle_HUsy4WBJEe2Zz8LOII5r3g;
		private java.lang.String NewBiddingAreaSubmitDescription_43b5QWBiEe2zFOcETdlBwQ;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User startUser_K7kYMWDTEe2HtLNu6rgXKQ;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> NewBiddingAreaSubmitSelectedFeature_HUxEUWBJEe2Zz8LOII5r3g = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> NewBiddingAreaSubmitSelectedPreferences_HU2j4WBJEe2Zz8LOII5r3g = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_AneF4WBJEe2Zz8LOII5r3g,
	_HUNqsWBJEe2Zz8LOII5r3g,
	_MWXV8WBJEe2Zz8LOII5r3g,
	_RNdnwWBJEe2Zz8LOII5r3g,
	_cDdg8WBJEe2Zz8LOII5r3g,
	_OhfZYWD8Ee2s0c0hOvkCRg,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;

	@Inject
	public NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController) {
		this.beanManager = beanManager;
		this.BiddingController = BiddingController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startUser_K7kYMWDTEe2HtLNu6rgXKQ = user;
		
		return ctx;
	}

	public NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = createContext(user);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._OhfZYWD8Ee2s0c0hOvkCRg);
	}
	
	
	public NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = createContext(user);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._OhfZYWD8Ee2s0c0hOvkCRg);
	}

	@Override
	public NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_HUNqsWBJEe2Zz8LOII5r3g": return executeInternal(ctx, continue_HUNqsWBJEe2Zz8LOII5r3g(ctx, slgResult));
		case "_MWXV8WBJEe2Zz8LOII5r3g": return executeInternal(ctx, continue_MWXV8WBJEe2Zz8LOII5r3g(ctx, slgResult));
		case "_RNdnwWBJEe2Zz8LOII5r3g": return executeInternal(ctx, continue_RNdnwWBJEe2Zz8LOII5r3g(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _AneF4WBJEe2Zz8LOII5r3g: {
					return execute_AneF4WBJEe2Zz8LOII5r3g(ctx);
				}
				case _HUNqsWBJEe2Zz8LOII5r3g: {
					curr = execute_HUNqsWBJEe2Zz8LOII5r3g(ctx);
					break;
				}
				case _MWXV8WBJEe2Zz8LOII5r3g: {
					curr = execute_MWXV8WBJEe2Zz8LOII5r3g(ctx);
					break;
				}
				case _RNdnwWBJEe2Zz8LOII5r3g: {
					curr = execute_RNdnwWBJEe2Zz8LOII5r3g(ctx);
					break;
				}
				case _cDdg8WBJEe2Zz8LOII5r3g: {
					curr = execute_cDdg8WBJEe2Zz8LOII5r3g(ctx);
					break;
				}
				case _OhfZYWD8Ee2s0c0hOvkCRg: {
					curr = execute_OhfZYWD8Ee2s0c0hOvkCRg(ctx);
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
	public static class NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_AneF4WBJEe2Zz8LOII5r3g";
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
	public NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult execute_AneF4WBJEe2Zz8LOII5r3g(final Context ctx) {
		return new NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB NewBiddingArea _HUNqsWBJEe2Zz8LOII5r3g
	private static class InputsForGUISIB_HUNqsWBJEe2Zz8LOII5r3g {
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 features = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 preferences = new ArrayList<>();
	}
	
	
	// container for GUI SIB 'NewBiddingArea'.
	public SIB_ID execute_HUNqsWBJEe2Zz8LOII5r3g(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.FeatureREST inputsFeatureREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.FeatureREST.class);
		
		final InputsForGUISIB_HUNqsWBJEe2Zz8LOII5r3g inputs = new InputsForGUISIB_HUNqsWBJEe2Zz8LOII5r3g();
		
		{
			//features
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_NewBiddingAreaFeatureSelectivex1_ZI100WBHEe2Zz8LOII5r3g
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// NewBiddingAreaFeatureSelectivex1_ZI100WBHEe2Zz8LOII5r3g
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.features = result;
		}
		{
			//preferences
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_NewBiddingAreaFeatureSelectivex2_ZI100WBHEe2Zz8LOII5r3g
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// NewBiddingAreaFeatureSelectivex2_ZI100WBHEe2Zz8LOII5r3g
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.preferences = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g:_HUNqsWBJEe2Zz8LOII5r3g:_ZI100WBHEe2Zz8LOII5r3g", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_HUNqsWBJEe2Zz8LOII5r3g", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_HUNqsWBJEe2Zz8LOII5r3g(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_HUNqsWBJEe2Zz8LOII5r3g");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.newbiddingarea.NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gResult result = (info.scce.dime.gui.onbroke.models.areas.user.newbiddingarea.NewBiddingArea_ZI100WBHEe2Zz8LOII5r3gResult) guiResult;
		if ("Create_New_Feature".equals(result.getBranchName())) {
			// branch 'Create New Feature'
			return SIB_ID._RNdnwWBJEe2Zz8LOII5r3g;
		} else 
		if ("Create_New_Preference".equals(result.getBranchName())) {
			// branch 'Create New Preference'
			return SIB_ID._MWXV8WBJEe2Zz8LOII5r3g;
		} else 
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__wqqgYWBHEe2Zz8LOII5r3gSubmitReturn() != null) {
			ctx.NewBiddingAreaSubmitDescription_43b5QWBiEe2zFOcETdlBwQ = result.getgui__wqqgYWBHEe2Zz8LOII5r3gSubmitReturn().getDescription();
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value47 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__wqqgYWBHEe2Zz8LOII5r3gSubmitReturn().getSelectedFeature();
			if (value47 != null) { // prevent null in lists
			ctx.NewBiddingAreaSubmitSelectedFeature_HUxEUWBJEe2Zz8LOII5r3g = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value47);
			}
			ctx.NewBiddingAreaSubmitTitle_HUsy4WBJEe2Zz8LOII5r3g = result.getgui__wqqgYWBHEe2Zz8LOII5r3gSubmitReturn().getTitle();
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value48 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__wqqgYWBHEe2Zz8LOII5r3gSubmitReturn().getSelectedPreferences();
			if (value48 != null) { // prevent null in lists
			ctx.NewBiddingAreaSubmitSelectedPreferences_HU2j4WBJEe2Zz8LOII5r3g = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value48);
			}
			}
			// branch 'Submit'
			return SIB_ID._cDdg8WBJEe2Zz8LOII5r3g;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._AneF4WBJEe2Zz8LOII5r3g;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_HUNqsWBJEe2Zz8LOII5r3g(ctx);
		}
	}
	// container for graph abstraction 'NewPreference' and sub process 'NewPreference'.
	public SIB_ID execute_MWXV8WBJEe2Zz8LOII5r3g(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g:_MWXV8WBJEe2Zz8LOII5r3g", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = instance.execute(ctx.callStack );
	
		return continue_MWXV8WBJEe2Zz8LOII5r3g(ctx, result);
	}
	
	public SIB_ID continue_MWXV8WBJEe2Zz8LOII5r3g(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._OhfZYWD8Ee2s0c0hOvkCRg;
		}
			default: throw new IllegalStateException("SIB 'NewPreference' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'NewFeature' and sub process 'NewFeature'.
	public SIB_ID execute_RNdnwWBJEe2Zz8LOII5r3g(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g:_RNdnwWBJEe2Zz8LOII5r3g", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = instance.execute(ctx.callStack );
	
		return continue_RNdnwWBJEe2Zz8LOII5r3g(ctx, result);
	}
	
	public SIB_ID continue_RNdnwWBJEe2Zz8LOII5r3g(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._OhfZYWD8Ee2s0c0hOvkCRg;
		}
			default: throw new IllegalStateException("SIB 'NewFeature' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for create SIB 'Create Bidding'.
	public SIB_ID execute_cDdg8WBJEe2Zz8LOII5r3g(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding createdObj = domController.create(null);
	
		createdObj.setuser(ctx.startUser_K7kYMWDTEe2HtLNu6rgXKQ);
		createdObj.setfeatures_Feature(ctx.NewBiddingAreaSubmitSelectedFeature_HUxEUWBJEe2Zz8LOII5r3g);
		createdObj.setpreferences_Feature(ctx.NewBiddingAreaSubmitSelectedPreferences_HU2j4WBJEe2Zz8LOII5r3g);
		createdObj.settitle(ctx.NewBiddingAreaSubmitTitle_HUsy4WBJEe2Zz8LOII5r3g);
		createdObj.setdescription(ctx.NewBiddingAreaSubmitDescription_43b5QWBiEe2zFOcETdlBwQ);
	
	
		// branch 'success'
		return SIB_ID._AneF4WBJEe2Zz8LOII5r3g;
	}
	// container for graph abstraction 'GetFeatureData' and sub process 'GetFeatureData'.
	public SIB_ID execute_OhfZYWD8Ee2s0c0hOvkCRg(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.class);
	
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value49 = result.getSuccessReturn().getFeature();
			if (value49 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessFeature_OhyUUWD8Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value49);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value50 = result.getSuccessReturn().getPreferences();
			if (value50 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessPreferences_Oh2lwWD8Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value50);
			}
			// branch 'success'
			return SIB_ID._HUNqsWBJEe2Zz8LOII5r3g;
		}
			default: throw new IllegalStateException("SIB 'GetFeatureData' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  

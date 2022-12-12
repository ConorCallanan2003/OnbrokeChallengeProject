package info.scce.dime.process.onbroke.models.areas.user.newoffer;

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
public final class NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw = new ArrayList<>();
				private de.ls5.dywa.generated.rest.types.User startUser_LOO7AXfIEe20WYdcRLAoOw;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw.add(trans);
					}
					result.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw.add(trans);
					}
					if(ctx.startUser_LOO7AXfIEe20WYdcRLAoOw != null) {
						result.startUser_LOO7AXfIEe20WYdcRLAoOw = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(ctx.startUser_LOO7AXfIEe20WYdcRLAoOw, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(ctx.startUser_LOO7AXfIEe20WYdcRLAoOw, result.startUser_LOO7AXfIEe20WYdcRLAoOw, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					result.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw = this.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw = this.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					if (this.startUser_LOO7AXfIEe20WYdcRLAoOw != null) {
						result.startUser_LOO7AXfIEe20WYdcRLAoOw = contextTransformer.transform(this.startUser_LOO7AXfIEe20WYdcRLAoOw);
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

		// direct dataflow variables.
		private java.lang.String newOfferAeraSubmitTitle_1lTgMXfGEe20WYdcRLAoOw;
		private java.lang.String newOfferAeraSubmitDescription_1lrToXfGEe20WYdcRLAoOw;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> newOfferAeraSubmitSelectedFeature_1ldRMXfGEe20WYdcRLAoOw = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> newOfferAeraSubmitSelectedPreferences_1lkl8XfGEe20WYdcRLAoOw = new ArrayList<>();
		private de.ls5.dywa.generated.entity.onbroke.models.app.User startUser_LOO7AXfIEe20WYdcRLAoOw;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_1VmFsHfFEe20WYdcRLAoOw,
	_9Fo6kXfFEe20WYdcRLAoOw,
	_1kpY4XfGEe20WYdcRLAoOw,
	__Gx2cXfGEe20WYdcRLAoOw,
	__3jMEXfGEe20WYdcRLAoOw,
	_J6pBoXfHEe20WYdcRLAoOw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController;

	@Inject
	public NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController) {
		this.beanManager = beanManager;
		this.OfferController = OfferController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startUser_LOO7AXfIEe20WYdcRLAoOw = user;
		
		return ctx;
	}

	public NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = createContext(user);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._9Fo6kXfFEe20WYdcRLAoOw);
	}
	
	
	public NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.User user) {
		final Context ctx = createContext(user);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._9Fo6kXfFEe20WYdcRLAoOw);
	}

	@Override
	public NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_1kpY4XfGEe20WYdcRLAoOw": return executeInternal(ctx, continue_1kpY4XfGEe20WYdcRLAoOw(ctx, slgResult));
		case "__Gx2cXfGEe20WYdcRLAoOw": return executeInternal(ctx, continue__Gx2cXfGEe20WYdcRLAoOw(ctx, slgResult));
		case "__3jMEXfGEe20WYdcRLAoOw": return executeInternal(ctx, continue__3jMEXfGEe20WYdcRLAoOw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _1VmFsHfFEe20WYdcRLAoOw: {
					return execute_1VmFsHfFEe20WYdcRLAoOw(ctx);
				}
				case _9Fo6kXfFEe20WYdcRLAoOw: {
					curr = execute_9Fo6kXfFEe20WYdcRLAoOw(ctx);
					break;
				}
				case _1kpY4XfGEe20WYdcRLAoOw: {
					curr = execute_1kpY4XfGEe20WYdcRLAoOw(ctx);
					break;
				}
				case __Gx2cXfGEe20WYdcRLAoOw: {
					curr = execute__Gx2cXfGEe20WYdcRLAoOw(ctx);
					break;
				}
				case __3jMEXfGEe20WYdcRLAoOw: {
					curr = execute__3jMEXfGEe20WYdcRLAoOw(ctx);
					break;
				}
				case _J6pBoXfHEe20WYdcRLAoOw: {
					curr = execute_J6pBoXfHEe20WYdcRLAoOw(ctx);
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
	public static class NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_1VmFsHfFEe20WYdcRLAoOw";
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
	public NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult execute_1VmFsHfFEe20WYdcRLAoOw(final Context ctx) {
		return new NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult(new SuccessReturnImpl(ctx));
	}
	// container for graph abstraction 'GetFeatureData' and sub process 'GetFeatureData'.
	public SIB_ID execute_9Fo6kXfFEe20WYdcRLAoOw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.class);
	
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value40 = result.getSuccessReturn().getFeature();
			if (value40 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value40);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value41 = result.getSuccessReturn().getPreferences();
			if (value41 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value41);
			}
			// branch 'success'
			return SIB_ID._1kpY4XfGEe20WYdcRLAoOw;
		}
			default: throw new IllegalStateException("SIB 'GetFeatureData' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB newOfferAera _1kpY4XfGEe20WYdcRLAoOw
	private static class InputsForGUISIB_1kpY4XfGEe20WYdcRLAoOw {
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 features = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 preferences = new ArrayList<>();
	}
	
	
	// container for GUI SIB 'newOfferAera'.
	public SIB_ID execute_1kpY4XfGEe20WYdcRLAoOw(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.FeatureREST inputsFeatureREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.FeatureREST.class);
		
		final InputsForGUISIB_1kpY4XfGEe20WYdcRLAoOw inputs = new InputsForGUISIB_1kpY4XfGEe20WYdcRLAoOw();
		
		{
			//features
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessFeature_9G__HYPHEN_MINUS__XUXfFEe20WYdcRLAoOw) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_NewOfferAeraFeatureSelectivex2_Ag9K4HfGEe20WYdcRLAoOw
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// NewOfferAeraFeatureSelectivex2_Ag9K4HfGEe20WYdcRLAoOw
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
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessPreferences_9HDP0XfFEe20WYdcRLAoOw) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_NewOfferAeraFeatureSelectivex3_Ag9K4HfGEe20WYdcRLAoOw
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// NewOfferAeraFeatureSelectivex3_Ag9K4HfGEe20WYdcRLAoOw
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.preferences = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw:_1kpY4XfGEe20WYdcRLAoOw:_Ag9K4HfGEe20WYdcRLAoOw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_1kpY4XfGEe20WYdcRLAoOw", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_1kpY4XfGEe20WYdcRLAoOw(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_1kpY4XfGEe20WYdcRLAoOw");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.newoffer.newofferaera.NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwResult result = (info.scce.dime.gui.onbroke.models.areas.user.newoffer.newofferaera.NewOfferAera_Ag9K4HfGEe20WYdcRLAoOwResult) guiResult;
		if ("Create_New_Feature".equals(result.getBranchName())) {
			// branch 'Create New Feature'
			return SIB_ID.__3jMEXfGEe20WYdcRLAoOw;
		} else 
		if ("Create_New_Preference".equals(result.getBranchName())) {
			// branch 'Create New Preference'
			return SIB_ID.__Gx2cXfGEe20WYdcRLAoOw;
		} else 
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__FiMQXnfGEe20WYdcRLAoOwSubmitReturn() != null) {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value42 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__FiMQXnfGEe20WYdcRLAoOwSubmitReturn().getSelectedPreferences();
			if (value42 != null) { // prevent null in lists
			ctx.newOfferAeraSubmitSelectedPreferences_1lkl8XfGEe20WYdcRLAoOw = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value42);
			}
			ctx.newOfferAeraSubmitTitle_1lTgMXfGEe20WYdcRLAoOw = result.getgui__FiMQXnfGEe20WYdcRLAoOwSubmitReturn().getTitle();
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value43 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__FiMQXnfGEe20WYdcRLAoOwSubmitReturn().getSelectedFeature();
			if (value43 != null) { // prevent null in lists
			ctx.newOfferAeraSubmitSelectedFeature_1ldRMXfGEe20WYdcRLAoOw = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value43);
			}
			ctx.newOfferAeraSubmitDescription_1lrToXfGEe20WYdcRLAoOw = result.getgui__FiMQXnfGEe20WYdcRLAoOwSubmitReturn().getDescription();
			}
			// branch 'Submit'
			return SIB_ID._J6pBoXfHEe20WYdcRLAoOw;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._1VmFsHfFEe20WYdcRLAoOw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_1kpY4XfGEe20WYdcRLAoOw(ctx);
		}
	}
	// container for graph abstraction 'NewPreference' and sub process 'NewPreference'.
	public SIB_ID execute__Gx2cXfGEe20WYdcRLAoOw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw:__Gx2cXfGEe20WYdcRLAoOw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = instance.execute(ctx.callStack );
	
		return continue__Gx2cXfGEe20WYdcRLAoOw(ctx, result);
	}
	
	public SIB_ID continue__Gx2cXfGEe20WYdcRLAoOw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._9Fo6kXfFEe20WYdcRLAoOw;
		}
			default: throw new IllegalStateException("SIB 'NewPreference' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'NewFeature' and sub process 'NewFeature'.
	public SIB_ID execute__3jMEXfGEe20WYdcRLAoOw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw:__3jMEXfGEe20WYdcRLAoOw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = instance.execute(ctx.callStack );
	
		return continue__3jMEXfGEe20WYdcRLAoOw(ctx, result);
	}
	
	public SIB_ID continue__3jMEXfGEe20WYdcRLAoOw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._9Fo6kXfFEe20WYdcRLAoOw;
		}
			default: throw new IllegalStateException("SIB 'NewFeature' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for create SIB 'Create Offer'.
	public SIB_ID execute_J6pBoXfHEe20WYdcRLAoOw(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer createdObj = domController.create(null);
	
		createdObj.setfeatures_Feature(ctx.newOfferAeraSubmitSelectedFeature_1ldRMXfGEe20WYdcRLAoOw);
		createdObj.setpreferences_Feature(ctx.newOfferAeraSubmitSelectedPreferences_1lkl8XfGEe20WYdcRLAoOw);
		createdObj.settitle(ctx.newOfferAeraSubmitTitle_1lTgMXfGEe20WYdcRLAoOw);
		createdObj.setuser(ctx.startUser_LOO7AXfIEe20WYdcRLAoOw);
		createdObj.setdescription(ctx.newOfferAeraSubmitDescription_1lrToXfGEe20WYdcRLAoOw);
	
	
		// branch 'success'
		return SIB_ID._1VmFsHfFEe20WYdcRLAoOw;
	}
	
}  

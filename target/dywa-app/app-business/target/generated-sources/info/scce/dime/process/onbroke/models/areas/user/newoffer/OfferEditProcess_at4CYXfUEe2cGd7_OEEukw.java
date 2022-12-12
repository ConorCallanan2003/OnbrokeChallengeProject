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

public final class OfferEditProcess_at4CYXfUEe2cGd7_OEEukw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Offer startOffer_vSneEXheEe2mVL2cgUAW0A;
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw = new ArrayList<>();
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startOffer_vSneEXheEe2mVL2cgUAW0A != null) {
						result.startOffer_vSneEXheEe2mVL2cgUAW0A = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.startOffer_vSneEXheEe2mVL2cgUAW0A, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.startOffer_vSneEXheEe2mVL2cgUAW0A, result.startOffer_vSneEXheEe2mVL2cgUAW0A, objectCache);
					}
					result.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw.add(trans);
					}
					result.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw.add(trans);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startOffer_vSneEXheEe2mVL2cgUAW0A != null) {
						result.startOffer_vSneEXheEe2mVL2cgUAW0A = contextTransformer.transform(this.startOffer_vSneEXheEe2mVL2cgUAW0A);
					}
					result.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw = this.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw = this.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());

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
		private java.lang.String OfferAeraEditSubmitDescription_LHMqMXhdEe2mVL2cgUAW0A;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer startOffer_vSneEXheEe2mVL2cgUAW0A;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> OfferAeraEditSubmitSelectedFeatures_LGuwIXhdEe2mVL2cgUAW0A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> OfferAeraEditSubmitSelectedPreferences_LHBrEXhdEe2mVL2cgUAW0A = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_a9ImYXfUEe2cGd7_OEEukw,
	_cq5IsXfUEe2cGd7_OEEukw,
	_LFbIkHhdEe2mVL2cgUAW0A,
	_V2KHQHhdEe2mVL2cgUAW0A,
	_XTY6QXhdEe2mVL2cgUAW0A,
	_j_qjIXheEe2mVL2cgUAW0A,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public OfferEditProcess_at4CYXfUEe2cGd7_OEEukw(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startOffer_vSneEXheEe2mVL2cgUAW0A = offer;
		ctx.startOffer_vSneEXheEe2mVL2cgUAW0A = offer;
		
		return ctx;
	}

	public OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._cq5IsXfUEe2cGd7_OEEukw);
	}
	
	
	public OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._cq5IsXfUEe2cGd7_OEEukw);
	}

	@Override
	public OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_LFbIkHhdEe2mVL2cgUAW0A": return executeInternal(ctx, continue_LFbIkHhdEe2mVL2cgUAW0A(ctx, slgResult));
		case "_V2KHQHhdEe2mVL2cgUAW0A": return executeInternal(ctx, continue_V2KHQHhdEe2mVL2cgUAW0A(ctx, slgResult));
		case "_XTY6QXhdEe2mVL2cgUAW0A": return executeInternal(ctx, continue_XTY6QXhdEe2mVL2cgUAW0A(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _a9ImYXfUEe2cGd7_OEEukw: {
					return execute_a9ImYXfUEe2cGd7_OEEukw(ctx);
				}
				case _cq5IsXfUEe2cGd7_OEEukw: {
					curr = execute_cq5IsXfUEe2cGd7_OEEukw(ctx);
					break;
				}
				case _LFbIkHhdEe2mVL2cgUAW0A: {
					curr = execute_LFbIkHhdEe2mVL2cgUAW0A(ctx);
					break;
				}
				case _V2KHQHhdEe2mVL2cgUAW0A: {
					curr = execute_V2KHQHhdEe2mVL2cgUAW0A(ctx);
					break;
				}
				case _XTY6QXhdEe2mVL2cgUAW0A: {
					curr = execute_XTY6QXhdEe2mVL2cgUAW0A(ctx);
					break;
				}
				case _j_qjIXheEe2mVL2cgUAW0A: {
					curr = execute_j_qjIXheEe2mVL2cgUAW0A(ctx);
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
	public static class OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_a9ImYXfUEe2cGd7_OEEukw";
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
	public OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult execute_a9ImYXfUEe2cGd7_OEEukw(final Context ctx) {
		return new OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult(new SuccessReturnImpl(ctx));
	}
	// container for graph abstraction 'GetFeatureData' and sub process 'GetFeatureData'.
	public SIB_ID execute_cq5IsXfUEe2cGd7_OEEukw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.class);
	
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value57 = result.getSuccessReturn().getFeature();
			if (value57 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value57);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value58 = result.getSuccessReturn().getPreferences();
			if (value58 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value58);
			}
			// branch 'success'
			return SIB_ID._LFbIkHhdEe2mVL2cgUAW0A;
		}
			default: throw new IllegalStateException("SIB 'GetFeatureData' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB OfferAeraEdit _LFbIkHhdEe2mVL2cgUAW0A
	private static class InputsForGUISIB_LFbIkHhdEe2mVL2cgUAW0A {
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 features = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 preferences = new ArrayList<>();
		public de.ls5.dywa.generated.rest.types.Offer
		 offer;
	}
	
	
	// container for GUI SIB 'OfferAeraEdit'.
	public SIB_ID execute_LFbIkHhdEe2mVL2cgUAW0A(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.FeatureREST inputsFeatureREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.FeatureREST.class);
		final de.ls5.dywa.generated.rest.controller.OfferREST inputsOfferREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.OfferREST.class);
		
		final InputsForGUISIB_LFbIkHhdEe2mVL2cgUAW0A inputs = new InputsForGUISIB_LFbIkHhdEe2mVL2cgUAW0A();
		
		{
			//features
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessFeature_crAdcXfUEe2cGd7_OEEukw) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_OfferAeraEditFeatureSelectivex1_kAL7QXfUEe2cGd7_OEEukw
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// OfferAeraEditFeatureSelectivex1_kAL7QXfUEe2cGd7_OEEukw
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
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessPreferences_crDgwXfUEe2cGd7_OEEukw) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_OfferAeraEditFeatureSelectivex3_kAL7QXfUEe2cGd7_OEEukw
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// OfferAeraEditFeatureSelectivex3_kAL7QXfUEe2cGd7_OEEukw
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.preferences = result;
		}
		{
			de.ls5.dywa.generated.rest.types.Offer
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Offer obj = ctx.startOffer_vSneEXheEe2mVL2cgUAW0A;
			
			de.ls5.dywa.generated.rest.types.Offer restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_OfferAeraEditOfferSelectivex5_kAL7QXfUEe2cGd7_OEEukw
					restTO = inputsOfferREST.read_OfferAeraEditOfferSelectivex5_kAL7QXfUEe2cGd7_OEEukw(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(obj, objectCache);
					}
					// OfferAeraEditOfferSelectivex5_kAL7QXfUEe2cGd7_OEEukw
					de.ls5.dywa.generated.rest.types.OfferAeraEditOfferSelectivex5_kAL7QXfUEe2cGd7_OEEukw.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.offer = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw:_LFbIkHhdEe2mVL2cgUAW0A:_kAL7QXfUEe2cGd7_OEEukw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_LFbIkHhdEe2mVL2cgUAW0A", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_LFbIkHhdEe2mVL2cgUAW0A(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_LFbIkHhdEe2mVL2cgUAW0A");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.newoffer.offeraeraedit.OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwResult result = (info.scce.dime.gui.onbroke.models.areas.user.newoffer.offeraeraedit.OfferAeraEdit_kAL7QXfUEe2cGd7_OEEukwResult) guiResult;
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._a9ImYXfUEe2cGd7_OEEukw;
		} else 
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__zo1__HYPHEN_MINUS__03hbEe2mVL2cgUAW0ASubmitReturn() != null) {
			ctx.OfferAeraEditSubmitDescription_LHMqMXhdEe2mVL2cgUAW0A = result.getgui__zo1__HYPHEN_MINUS__03hbEe2mVL2cgUAW0ASubmitReturn().getDescription();
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value59 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__zo1__HYPHEN_MINUS__03hbEe2mVL2cgUAW0ASubmitReturn().getSelectedFeatures();
			if (value59 != null) { // prevent null in lists
			ctx.OfferAeraEditSubmitSelectedFeatures_LGuwIXhdEe2mVL2cgUAW0A = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value59);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value60 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__zo1__HYPHEN_MINUS__03hbEe2mVL2cgUAW0ASubmitReturn().getSelectedPreferences();
			if (value60 != null) { // prevent null in lists
			ctx.OfferAeraEditSubmitSelectedPreferences_LHBrEXhdEe2mVL2cgUAW0A = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value60);
			}
			}
			// branch 'Submit'
			return SIB_ID._j_qjIXheEe2mVL2cgUAW0A;
		} else 
		if ("Create_new_feature".equals(result.getBranchName())) {
			// branch 'Create new feature'
			return SIB_ID._XTY6QXhdEe2mVL2cgUAW0A;
		} else 
		if ("Create_new_preference".equals(result.getBranchName())) {
			// branch 'Create new preference'
			return SIB_ID._V2KHQHhdEe2mVL2cgUAW0A;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_LFbIkHhdEe2mVL2cgUAW0A(ctx);
		}
	}
	// container for graph abstraction 'NewPreference' and sub process 'NewPreference'.
	public SIB_ID execute_V2KHQHhdEe2mVL2cgUAW0A(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw:_V2KHQHhdEe2mVL2cgUAW0A", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = instance.execute(ctx.callStack );
	
		return continue_V2KHQHhdEe2mVL2cgUAW0A(ctx, result);
	}
	
	public SIB_ID continue_V2KHQHhdEe2mVL2cgUAW0A(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._cq5IsXfUEe2cGd7_OEEukw;
		}
			default: throw new IllegalStateException("SIB 'NewPreference' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'NewFeature' and sub process 'NewFeature'.
	public SIB_ID execute_XTY6QXhdEe2mVL2cgUAW0A(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw:_XTY6QXhdEe2mVL2cgUAW0A", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = instance.execute(ctx.callStack );
	
		return continue_XTY6QXhdEe2mVL2cgUAW0A(ctx, result);
	}
	
	public SIB_ID continue_XTY6QXhdEe2mVL2cgUAW0A(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._cq5IsXfUEe2cGd7_OEEukw;
		}
			default: throw new IllegalStateException("SIB 'NewFeature' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'editOfferDetails' and sub process 'editOfferDetails'.
	public SIB_ID execute_j_qjIXheEe2mVL2cgUAW0A(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0A instance = new info.scce.dime.process.onbroke.models.areas.user.newoffer.EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0A(ctx.beanManager);
	
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0A.EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult result = instance.execute(false, ctx.OfferAeraEditSubmitDescription_LHMqMXhdEe2mVL2cgUAW0A, ctx.startOffer_vSneEXheEe2mVL2cgUAW0A, ctx.OfferAeraEditSubmitSelectedFeatures_LGuwIXhdEe2mVL2cgUAW0A, ctx.OfferAeraEditSubmitSelectedPreferences_LHBrEXhdEe2mVL2cgUAW0A, null);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._a9ImYXfUEe2cGd7_OEEukw;
		}
			default: throw new IllegalStateException("SIB 'editOfferDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  

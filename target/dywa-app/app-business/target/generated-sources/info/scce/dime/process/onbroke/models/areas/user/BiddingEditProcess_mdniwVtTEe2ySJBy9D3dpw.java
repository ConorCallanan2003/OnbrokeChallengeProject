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

public final class BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Bidding startBidding_njUMoVutEe2ynpC10MMKgg;
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Feature> GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg = new ArrayList<>();
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startBidding_njUMoVutEe2ynpC10MMKgg != null) {
						result.startBidding_njUMoVutEe2ynpC10MMKgg = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.startBidding_njUMoVutEe2ynpC10MMKgg, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.startBidding_njUMoVutEe2ynpC10MMKgg, result.startBidding_njUMoVutEe2ynpC10MMKgg, objectCache);
					}
					result.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg.add(trans);
					}
					result.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg.add(trans);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startBidding_njUMoVutEe2ynpC10MMKgg != null) {
						result.startBidding_njUMoVutEe2ynpC10MMKgg = contextTransformer.transform(this.startBidding_njUMoVutEe2ynpC10MMKgg);
					}
					result.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg = this.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg = this.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());

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
		private java.lang.String BiddingAreaEditSubmitDescription_a2t3oWBiEe2zFOcETdlBwQ;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding startBidding_njUMoVutEe2ynpC10MMKgg;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> BiddingAreaEditSubmitSelectedFeatures_ChSXQV7VEe2G__HYPHEN_MINUS__ZFrOzgUmw = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> BiddingAreaEditSubmitSelectedPreferences__ZD1gV7pEe2MjcOCwlD7jg = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_baeY4V3ZEe2FVevBlBmE3A,
	_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug,
	_lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg,
	_75nY0GAKEe2YNpeIwSxEfw,
	_tOt4gWD4Ee2s0c0hOvkCRg,
	_blMyMWD6Ee2s0c0hOvkCRg,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startBidding_njUMoVutEe2ynpC10MMKgg = bidding;
		ctx.startBidding_njUMoVutEe2ynpC10MMKgg = bidding;
		
		return ctx;
	}

	public BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._blMyMWD6Ee2s0c0hOvkCRg);
	}
	
	
	public BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._blMyMWD6Ee2s0c0hOvkCRg);
	}

	@Override
	public BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_5k-cEV3uEe2HUMxwZL7uug": return executeInternal(ctx, continue_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug(ctx, slgResult));
		case "_lEXd0V-mEe2Y_7LmLNugjg": return executeInternal(ctx, continue_lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg(ctx, slgResult));
		case "_75nY0GAKEe2YNpeIwSxEfw": return executeInternal(ctx, continue_75nY0GAKEe2YNpeIwSxEfw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _baeY4V3ZEe2FVevBlBmE3A: {
					return execute_baeY4V3ZEe2FVevBlBmE3A(ctx);
				}
				case _5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug: {
					curr = execute_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug(ctx);
					break;
				}
				case _lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg: {
					curr = execute_lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg(ctx);
					break;
				}
				case _75nY0GAKEe2YNpeIwSxEfw: {
					curr = execute_75nY0GAKEe2YNpeIwSxEfw(ctx);
					break;
				}
				case _tOt4gWD4Ee2s0c0hOvkCRg: {
					curr = execute_tOt4gWD4Ee2s0c0hOvkCRg(ctx);
					break;
				}
				case _blMyMWD6Ee2s0c0hOvkCRg: {
					curr = execute_blMyMWD6Ee2s0c0hOvkCRg(ctx);
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
	public static class BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_baeY4V3ZEe2FVevBlBmE3A";
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
	public BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult execute_baeY4V3ZEe2FVevBlBmE3A(final Context ctx) {
		return new BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB BiddingAreaEdit _5k-cEV3uEe2HUMxwZL7uug
	private static class InputsForGUISIB_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug {
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 preferences = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 features = new ArrayList<>();
		public de.ls5.dywa.generated.rest.types.Bidding
		 bidding;
	}
	
	
	// container for GUI SIB 'BiddingAreaEdit'.
	public SIB_ID execute_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.FeatureREST inputsFeatureREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.FeatureREST.class);
		final de.ls5.dywa.generated.rest.controller.BiddingREST inputsBiddingREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BiddingREST.class);
		
		final InputsForGUISIB_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug inputs = new InputsForGUISIB_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug();
		
		{
			//preferences
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_BiddingAreaEditFeatureSelectivex3_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// BiddingAreaEditFeatureSelectivex3_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.preferences = result;
		}
		{
			//features
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_BiddingAreaEditFeatureSelectivex4_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// BiddingAreaEditFeatureSelectivex4_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.features = result;
		}
		{
			de.ls5.dywa.generated.rest.types.Bidding
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Bidding obj = ctx.startBidding_njUMoVutEe2ynpC10MMKgg;
			
			de.ls5.dywa.generated.rest.types.Bidding restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_BiddingAreaEditBiddingSelectivex5_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL
					restTO = inputsBiddingREST.read_BiddingAreaEditBiddingSelectivex5_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(obj, objectCache);
					}
					// BiddingAreaEditBiddingSelectivex5_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL
					de.ls5.dywa.generated.rest.types.BiddingAreaEditBiddingSelectivex5_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.bidding = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw:_5k-cEV3uEe2HUMxwZL7uug:_Goy80Fm_Ee2zbeoDKccEjg_INTERNAL", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_5k-cEV3uEe2HUMxwZL7uug", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_5k-cEV3uEe2HUMxwZL7uug");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.biddingareaedit.BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALResult result = (info.scce.dime.gui.onbroke.models.areas.user.biddingareaedit.BiddingAreaEdit_Goy80Fm_Ee2zbeoDKccEjg_INTERNALResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__b9LjoVnDEe2zb__HYPHEN_MINUS__oDKccEjg_INTERNALSubmitReturn() != null) {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value51 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__b9LjoVnDEe2zb__HYPHEN_MINUS__oDKccEjg_INTERNALSubmitReturn().getSelectedFeatures();
			if (value51 != null) { // prevent null in lists
			ctx.BiddingAreaEditSubmitSelectedFeatures_ChSXQV7VEe2G__HYPHEN_MINUS__ZFrOzgUmw = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value51);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value52 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>)result.getgui__b9LjoVnDEe2zb__HYPHEN_MINUS__oDKccEjg_INTERNALSubmitReturn().getSelectedPreferences();
			if (value52 != null) { // prevent null in lists
			ctx.BiddingAreaEditSubmitSelectedPreferences__ZD1gV7pEe2MjcOCwlD7jg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value52);
			}
			ctx.BiddingAreaEditSubmitDescription_a2t3oWBiEe2zFOcETdlBwQ = result.getgui__b9LjoVnDEe2zb__HYPHEN_MINUS__oDKccEjg_INTERNALSubmitReturn().getDescription();
			}
			// branch 'Submit'
			return SIB_ID._tOt4gWD4Ee2s0c0hOvkCRg;
		} else 
		if ("Create_new_feature".equals(result.getBranchName())) {
			// branch 'Create new feature'
			return SIB_ID._lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg;
		} else 
		if ("Create_new_preference".equals(result.getBranchName())) {
			// branch 'Create new preference'
			return SIB_ID._75nY0GAKEe2YNpeIwSxEfw;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._baeY4V3ZEe2FVevBlBmE3A;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug(ctx);
		}
	}
	// container for graph abstraction 'NewFeature' and sub process 'NewFeature'.
	public SIB_ID execute_lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw:_lEXd0V-mEe2Y_7LmLNugjg", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = instance.execute(ctx.callStack );
	
		return continue_lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg(ctx, result);
	}
	
	public SIB_ID continue_lEXd0V__HYPHEN_MINUS__mEe2Y_7LmLNugjg(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBw.NewFeature_i06ZIV__HYPHEN_MINUS__lEe2c5ZoBUTVdBwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._blMyMWD6Ee2s0c0hOvkCRg;
		}
			default: throw new IllegalStateException("SIB 'NewFeature' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'NewPreference' and sub process 'NewPreference'.
	public SIB_ID execute_75nY0GAKEe2YNpeIwSxEfw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw:_75nY0GAKEe2YNpeIwSxEfw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = instance.execute(ctx.callStack );
	
		return continue_75nY0GAKEe2YNpeIwSxEfw(ctx, result);
	}
	
	public SIB_ID continue_75nY0GAKEe2YNpeIwSxEfw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult result = (info.scce.dime.process.onbroke.models.areas.user.NewPreference_5nurMGAJEe2YNpeIwSxEfw.NewPreference_5nurMGAJEe2YNpeIwSxEfwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._blMyMWD6Ee2s0c0hOvkCRg;
		}
			default: throw new IllegalStateException("SIB 'NewPreference' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'editDetails' and sub process 'editDetails'.
	public SIB_ID execute_tOt4gWD4Ee2s0c0hOvkCRg(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.EditDetails_cXeOkWD4Ee2s0c0hOvkCRg instance = new info.scce.dime.process.onbroke.models.areas.user.EditDetails_cXeOkWD4Ee2s0c0hOvkCRg(ctx.beanManager);
	
		final info.scce.dime.process.onbroke.models.areas.user.EditDetails_cXeOkWD4Ee2s0c0hOvkCRg.EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult result = instance.execute(false, ctx.startBidding_njUMoVutEe2ynpC10MMKgg, ctx.BiddingAreaEditSubmitDescription_a2t3oWBiEe2zFOcETdlBwQ, ctx.BiddingAreaEditSubmitSelectedFeatures_ChSXQV7VEe2G__HYPHEN_MINUS__ZFrOzgUmw, ctx.BiddingAreaEditSubmitSelectedPreferences__ZD1gV7pEe2MjcOCwlD7jg, null);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._baeY4V3ZEe2FVevBlBmE3A;
		}
			default: throw new IllegalStateException("SIB 'editDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'GetFeatureData' and sub process 'GetFeatureData'.
	public SIB_ID execute_blMyMWD6Ee2s0c0hOvkCRg(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.class);
	
		final info.scce.dime.process.onbroke.models.areas.user.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg.GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value53 = result.getSuccessReturn().getFeature();
			if (value53 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessFeature_blefAWD6Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value53);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value54 = result.getSuccessReturn().getPreferences();
			if (value54 != null) { // prevent null in lists
			ctx.GetFeatureDataSuccessPreferences_blj__HYPHEN_MINUS__kWD6Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value54);
			}
			// branch 'success'
			return SIB_ID._5k__HYPHEN_MINUS__cEV3uEe2HUMxwZL7uug;
		}
			default: throw new IllegalStateException("SIB 'GetFeatureData' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  

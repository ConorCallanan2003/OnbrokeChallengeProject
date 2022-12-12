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
public final class DeleteOffer_tTP3gHfTEe2cGd7_OEEukw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Offer startOffer_HLnjsXfUEe2cGd7_OEEukw;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startOffer_HLnjsXfUEe2cGd7_OEEukw != null) {
						result.startOffer_HLnjsXfUEe2cGd7_OEEukw = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.startOffer_HLnjsXfUEe2cGd7_OEEukw, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.startOffer_HLnjsXfUEe2cGd7_OEEukw, result.startOffer_HLnjsXfUEe2cGd7_OEEukw, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startOffer_HLnjsXfUEe2cGd7_OEEukw != null) {
						result.startOffer_HLnjsXfUEe2cGd7_OEEukw = contextTransformer.transform(this.startOffer_HLnjsXfUEe2cGd7_OEEukw);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer startOffer_HLnjsXfUEe2cGd7_OEEukw;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_ti8gYXfTEe2cGd7_OEEukw,
	__vHV4XfTEe2cGd7_OEEukw,
	_CruQ8XfUEe2cGd7_OEEukw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController;

	@Inject
	public DeleteOffer_tTP3gHfTEe2cGd7_OEEukw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController) {
		this.beanManager = beanManager;
		this.OfferController = OfferController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startOffer_HLnjsXfUEe2cGd7_OEEukw = offer;
		ctx.startOffer_HLnjsXfUEe2cGd7_OEEukw = offer;
		
		return ctx;
	}

	public DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID.__vHV4XfTEe2cGd7_OEEukw);
	}
	
	
	public DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID.__vHV4XfTEe2cGd7_OEEukw);
	}

	@Override
	public DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "__vHV4XfTEe2cGd7_OEEukw": return executeInternal(ctx, continue__vHV4XfTEe2cGd7_OEEukw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _ti8gYXfTEe2cGd7_OEEukw: {
					return execute_ti8gYXfTEe2cGd7_OEEukw(ctx);
				}
				case __vHV4XfTEe2cGd7_OEEukw: {
					curr = execute__vHV4XfTEe2cGd7_OEEukw(ctx);
					break;
				}
				case _CruQ8XfUEe2cGd7_OEEukw: {
					curr = execute_CruQ8XfUEe2cGd7_OEEukw(ctx);
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
	public static class DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_ti8gYXfTEe2cGd7_OEEukw";
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
	public DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult execute_ti8gYXfTEe2cGd7_OEEukw(final Context ctx) {
		return new DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB deleteOfferConfirm __vHV4XfTEe2cGd7_OEEukw
	private static class InputsForGUISIB__vHV4XfTEe2cGd7_OEEukw {
		public de.ls5.dywa.generated.rest.types.Offer
		 offer;
	}
	
	
	// container for GUI SIB 'deleteOfferConfirm'.
	public SIB_ID execute__vHV4XfTEe2cGd7_OEEukw(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.OfferREST inputsOfferREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.OfferREST.class);
		
		final InputsForGUISIB__vHV4XfTEe2cGd7_OEEukw inputs = new InputsForGUISIB__vHV4XfTEe2cGd7_OEEukw();
		
		{
			de.ls5.dywa.generated.rest.types.Offer
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Offer obj = ctx.startOffer_HLnjsXfUEe2cGd7_OEEukw;
			
			de.ls5.dywa.generated.rest.types.Offer restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_DeleteOfferConfirmOfferSelectivex1_ynZRsXfTEe2cGd7_OEEukw
					restTO = inputsOfferREST.read_AdminBiddingTableOfferSelectivex1x1x1_QIJywVLmEe2djpkPxa2Z3Q(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(obj, objectCache);
					}
					// DeleteOfferConfirmOfferSelectivex1_ynZRsXfTEe2cGd7_OEEukw
					de.ls5.dywa.generated.rest.types.AdminBiddingTableOfferSelectivex1x1x1_QIJywVLmEe2djpkPxa2Z3Q.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.offer = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.newoffer.DeleteOffer_tTP3gHfTEe2cGd7_OEEukw:__vHV4XfTEe2cGd7_OEEukw:_ynZRsXfTEe2cGd7_OEEukw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "__vHV4XfTEe2cGd7_OEEukw", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue__vHV4XfTEe2cGd7_OEEukw(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "__vHV4XfTEe2cGd7_OEEukw");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.newoffer.deleteofferconfirm.DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwResult result = (info.scce.dime.gui.onbroke.models.areas.user.newoffer.deleteofferconfirm.DeleteOfferConfirm_ynZRsXfTEe2cGd7_OEEukwResult) guiResult;
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._ti8gYXfTEe2cGd7_OEEukw;
		} else 
		if ("Confirm".equals(result.getBranchName())) {
			// branch 'Confirm'
			return SIB_ID._CruQ8XfUEe2cGd7_OEEukw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute__vHV4XfTEe2cGd7_OEEukw(ctx);
		}
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_CruQ8XfUEe2cGd7_OEEukw(final Context ctx) {
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.Offer instanceToDelete = ctx.startOffer_HLnjsXfUEe2cGd7_OEEukw;
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				instanceToDelete.setuser(null);
				instanceToDelete.getbiddings_Bidding().clear();
				instanceToDelete.getpreferences_Feature().clear();
				instanceToDelete.getfeatures_Feature().clear();
				instanceToDelete.setstatus(null);
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}
		// branch 'deleted'
		return SIB_ID._ti8gYXfTEe2cGd7_OEEukw;
	}
	
}  

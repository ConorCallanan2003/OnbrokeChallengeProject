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
public final class DeleteBidding_tvxu4VutEe2ynpC10MMKgg implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Bidding startBidding_wVfz8VutEe2ynpC10MMKgg;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startBidding_wVfz8VutEe2ynpC10MMKgg != null) {
						result.startBidding_wVfz8VutEe2ynpC10MMKgg = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.startBidding_wVfz8VutEe2ynpC10MMKgg, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.startBidding_wVfz8VutEe2ynpC10MMKgg, result.startBidding_wVfz8VutEe2ynpC10MMKgg, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startBidding_wVfz8VutEe2ynpC10MMKgg != null) {
						result.startBidding_wVfz8VutEe2ynpC10MMKgg = contextTransformer.transform(this.startBidding_wVfz8VutEe2ynpC10MMKgg);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding startBidding_wVfz8VutEe2ynpC10MMKgg;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_t409MVutEe2ynpC10MMKgg,
	_5e1H0FwtEe2d79mobnuSHQ,
	_bfwnsWAtEe2KJog_oImiIQ,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;

	@Inject
	public DeleteBidding_tvxu4VutEe2ynpC10MMKgg(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController) {
		this.beanManager = beanManager;
		this.BiddingController = BiddingController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startBidding_wVfz8VutEe2ynpC10MMKgg = bidding;
		ctx.startBidding_wVfz8VutEe2ynpC10MMKgg = bidding;
		
		return ctx;
	}

	public DeleteBidding_tvxu4VutEe2ynpC10MMKggResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._bfwnsWAtEe2KJog_oImiIQ);
	}
	
	
	public DeleteBidding_tvxu4VutEe2ynpC10MMKggResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._bfwnsWAtEe2KJog_oImiIQ);
	}

	@Override
	public DeleteBidding_tvxu4VutEe2ynpC10MMKggResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_bfwnsWAtEe2KJog_oImiIQ": return executeInternal(ctx, continue_bfwnsWAtEe2KJog_oImiIQ(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private DeleteBidding_tvxu4VutEe2ynpC10MMKggResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _t409MVutEe2ynpC10MMKgg: {
					return execute_t409MVutEe2ynpC10MMKgg(ctx);
				}
				case _5e1H0FwtEe2d79mobnuSHQ: {
					curr = execute_5e1H0FwtEe2d79mobnuSHQ(ctx);
					break;
				}
				case _bfwnsWAtEe2KJog_oImiIQ: {
					curr = execute_bfwnsWAtEe2KJog_oImiIQ(ctx);
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
	public static class DeleteBidding_tvxu4VutEe2ynpC10MMKggResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public DeleteBidding_tvxu4VutEe2ynpC10MMKggResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_t409MVutEe2ynpC10MMKgg";
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
	public DeleteBidding_tvxu4VutEe2ynpC10MMKggResult execute_t409MVutEe2ynpC10MMKgg(final Context ctx) {
		return new DeleteBidding_tvxu4VutEe2ynpC10MMKggResult(new SuccessReturnImpl(ctx));
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_5e1H0FwtEe2d79mobnuSHQ(final Context ctx) {
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding instanceToDelete = ctx.startBidding_wVfz8VutEe2ynpC10MMKgg;
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				instanceToDelete.setuser(null);
				instanceToDelete.setoffer(null);
				instanceToDelete.getfeatures_Feature().clear();
				instanceToDelete.getpreferences_Feature().clear();
				instanceToDelete.setstatus(null);
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}
		// branch 'deleted'
		return SIB_ID._t409MVutEe2ynpC10MMKgg;
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB deleteBiddingConfirm _bfwnsWAtEe2KJog_oImiIQ
	private static class InputsForGUISIB_bfwnsWAtEe2KJog_oImiIQ {
		public de.ls5.dywa.generated.rest.types.Bidding
		 bidding;
	}
	
	
	// container for GUI SIB 'deleteBiddingConfirm'.
	public SIB_ID execute_bfwnsWAtEe2KJog_oImiIQ(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.BiddingREST inputsBiddingREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BiddingREST.class);
		
		final InputsForGUISIB_bfwnsWAtEe2KJog_oImiIQ inputs = new InputsForGUISIB_bfwnsWAtEe2KJog_oImiIQ();
		
		{
			de.ls5.dywa.generated.rest.types.Bidding
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Bidding obj = ctx.startBidding_wVfz8VutEe2ynpC10MMKgg;
			
			de.ls5.dywa.generated.rest.types.Bidding restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_DeleteBiddingConfirmBiddingSelectivex1_sR_EMGAsEe2KJog_oImiIQ
					restTO = inputsBiddingREST.read_DeleteBiddingConfirmBiddingSelectivex1_sR_EMGAsEe2KJog_oImiIQ(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(obj, objectCache);
					}
					// DeleteBiddingConfirmBiddingSelectivex1_sR_EMGAsEe2KJog_oImiIQ
					de.ls5.dywa.generated.rest.types.DeleteBiddingConfirmBiddingSelectivex1_sR_EMGAsEe2KJog_oImiIQ.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.bidding = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.DeleteBidding_tvxu4VutEe2ynpC10MMKgg:_bfwnsWAtEe2KJog_oImiIQ:_sR_EMGAsEe2KJog_oImiIQ", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_bfwnsWAtEe2KJog_oImiIQ", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_bfwnsWAtEe2KJog_oImiIQ(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_bfwnsWAtEe2KJog_oImiIQ");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.deletebiddingconfirm.DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQResult result = (info.scce.dime.gui.onbroke.models.areas.user.deletebiddingconfirm.DeleteBiddingConfirm_sR_EMGAsEe2KJog_oImiIQResult) guiResult;
		if ("Confirm".equals(result.getBranchName())) {
			// branch 'Confirm'
			return SIB_ID._5e1H0FwtEe2d79mobnuSHQ;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._t409MVutEe2ynpC10MMKgg;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_bfwnsWAtEe2KJog_oImiIQ(ctx);
		}
	}
	
}  

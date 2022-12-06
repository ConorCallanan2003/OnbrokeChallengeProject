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

public final class ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Offer UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w, result.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w, result.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w);
					}
					if (this.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_lsPHwVFQEe2J0bu3ffrh5w,
	_6J3BUVOnEe2KQc5QIsW97w,
	__FTAkVOnEe2KQc5QIsW97w,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._lsPHwVFQEe2J0bu3ffrh5w);
	}
	
	
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._lsPHwVFQEe2J0bu3ffrh5w);
	}

	@Override
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_lsPHwVFQEe2J0bu3ffrh5w": return executeInternal(ctx, continue_lsPHwVFQEe2J0bu3ffrh5w(ctx, slgResult));
		case "_6J3BUVOnEe2KQc5QIsW97w": return executeInternal(ctx, continue_6J3BUVOnEe2KQc5QIsW97w(ctx, slgResult));
		case "__FTAkVOnEe2KQc5QIsW97w": return executeInternal(ctx, continue__FTAkVOnEe2KQc5QIsW97w(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _lsPHwVFQEe2J0bu3ffrh5w: {
					curr = execute_lsPHwVFQEe2J0bu3ffrh5w(ctx);
					break;
				}
				case _6J3BUVOnEe2KQc5QIsW97w: {
					curr = execute_6J3BUVOnEe2KQc5QIsW97w(ctx);
					break;
				}
				case __FTAkVOnEe2KQc5QIsW97w: {
					curr = execute__FTAkVOnEe2KQc5QIsW97w(ctx);
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
	public static class ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResult implements info.scce.dime.process.DIMEProcessResult<de.ls5.dywa.generated.rest.process.interactable.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutput> {
		private String branchName;
		private String branchId;
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		

		private de.ls5.dywa.generated.rest.process.interactable.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutput wrapper;

		@Override
		public de.ls5.dywa.generated.rest.process.interactable.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutput toJSON(info.scce.dime.rest.ObjectCache objectCache) {
			if (wrapper == null) {
				this.wrapper = new de.ls5.dywa.generated.rest.process.interactable.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutput(this, objectCache);
			}

			return wrapper;
		}
	}
	
	// model branches.


	// sibs
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB UserArea _lsPHwVFQEe2J0bu3ffrh5w
	private static class InputsForGUISIB_lsPHwVFQEe2J0bu3ffrh5w {
	}
	
	
	// container for GUI SIB 'UserArea'.
	public SIB_ID execute_lsPHwVFQEe2J0bu3ffrh5w(final Context ctx) {
	
		
		final InputsForGUISIB_lsPHwVFQEe2J0bu3ffrh5w inputs = new InputsForGUISIB_lsPHwVFQEe2J0bu3ffrh5w();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_lsPHwVFQEe2J0bu3ffrh5w:_jIfqkVFOEe2J0bu3ffrh5w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_lsPHwVFQEe2J0bu3ffrh5w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_lsPHwVFQEe2J0bu3ffrh5w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_lsPHwVFQEe2J0bu3ffrh5w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.user.userarea.UserArea_jIfqkVFOEe2J0bu3ffrh5wResult result = (info.scce.dime.gui.onbroke.models.areas.user.userarea.UserArea_jIfqkVFOEe2J0bu3ffrh5wResult) guiResult;
		if ("Show_offer".equals(result.getBranchName())) {
			if(result.getgui__0GKiEVFNEe2J0bu3ffrh5wShow_offerReturn() != null) {
			ctx.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Offer)result.getgui__0GKiEVFNEe2J0bu3ffrh5wShow_offerReturn().getOffer();
			}
			// branch 'Show offer'
			return SIB_ID._6J3BUVOnEe2KQc5QIsW97w;
		} else 
		if ("Edit_offer".equals(result.getBranchName())) {
			if(result.getgui__4QgbkVFNEe2J0bu3ffrh5wEdit_offerReturn() != null) {
			}
			// branch 'Edit offer'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		} else 
		if ("Delete_offer".equals(result.getBranchName())) {
			if(result.getgui__6PHdUVFNEe2J0bu3ffrh5wDelete_offerReturn() != null) {
			}
			// branch 'Delete offer'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		} else 
		if ("Show_bidding".equals(result.getBranchName())) {
			if(result.getgui__xZ1CjFFOEe2J0bu3ffrh5wShow_biddingReturn() != null) {
			ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__xZ1CjFFOEe2J0bu3ffrh5wShow_biddingReturn().getBidding();
			}
			// branch 'Show bidding'
			return SIB_ID.__FTAkVOnEe2KQc5QIsW97w;
		} else 
		if ("Edit_bidding".equals(result.getBranchName())) {
			if(result.getgui__xZ1pSVFOEe2J0bu3ffrh5wEdit_biddingReturn() != null) {
			}
			// branch 'Edit bidding'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		} else 
		if ("Delete_bidding".equals(result.getBranchName())) {
			if(result.getgui__xZ1pWlFOEe2J0bu3ffrh5wDelete_biddingReturn() != null) {
			}
			// branch 'Delete bidding'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		} else 
		if ("Create_offer".equals(result.getBranchName())) {
			if(result.getgui__CGsWXFFREe2J0bu3ffrh5wCreate_offerReturn() != null) {
			}
			// branch 'Create offer'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		} else 
		if ("Create_bidding".equals(result.getBranchName())) {
			if(result.getgui__EIl8nFFREe2J0bu3ffrh5wCreate_biddingReturn() != null) {
			}
			// branch 'Create bidding'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_lsPHwVFQEe2J0bu3ffrh5w(ctx);
		}
	}
	// container for graph abstraction 'ShowOfferDetails' and sub process 'ShowOfferDetails'.
	public SIB_ID execute_6J3BUVOnEe2KQc5QIsW97w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w instance = new info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_6J3BUVOnEe2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult result = instance.execute(ctx.callStack , ctx.UserAreaShow_offerOffer_lsXDkVFQEe2J0bu3ffrh5w);
	
		return continue_6J3BUVOnEe2KQc5QIsW97w(ctx, result);
	}
	
	public SIB_ID continue_6J3BUVOnEe2KQc5QIsW97w(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult result = (info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "back": {
			// branch 'back'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowOfferDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowBiddingDetails' and sub process 'ShowBiddingDetails'.
	public SIB_ID execute__FTAkVOnEe2KQc5QIsW97w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w instance = new info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:__FTAkVOnEe2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult result = instance.execute(ctx.callStack , ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w);
	
		return continue__FTAkVOnEe2KQc5QIsW97w(ctx, result);
	}
	
	public SIB_ID continue__FTAkVOnEe2KQc5QIsW97w(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult result = (info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "back": {
			// branch 'back'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowBiddingDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
}  

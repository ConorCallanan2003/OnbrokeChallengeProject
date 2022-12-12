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
				private de.ls5.dywa.generated.rest.types.Offer UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Offer UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.User UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.User UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w;
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
					if(ctx.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w, result.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w, result.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w, result.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w, result.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w, result.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w != null) {
						result.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(ctx.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(ctx.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w, result.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w != null) {
						result.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(ctx.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(ctx.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w, result.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w, objectCache);
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
					if (this.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w);
					}
					if (this.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w);
					}
					if (this.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w);
					}
					if (this.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w);
					}
					if (this.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w != null) {
						result.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w);
					}
					if (this.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w != null) {
						result.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w);
					}
					if (this.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w != null) {
						result.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w = contextTransformer.transform(this.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding UserAreaShow_biddingBidding_lssawVFQEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_lsPHwVFQEe2J0bu3ffrh5w,
	_6J3BUVOnEe2KQc5QIsW97w,
	__FTAkVOnEe2KQc5QIsW97w,
	_bB8JoXifEe2n6qlSkDlEsw,
	_of8m4HifEe2n6qlSkDlEsw,
	_yP9IYXifEe2n6qlSkDlEsw,
	_8tEngXifEe2n6qlSkDlEsw,
	_CbDeAXigEe2n6qlSkDlEsw,
	_eCHXMXl9Ee2Bb9t6ovoR_Q,
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
		case "_bB8JoXifEe2n6qlSkDlEsw": return executeInternal(ctx, continue_bB8JoXifEe2n6qlSkDlEsw(ctx, slgResult));
		case "_of8m4HifEe2n6qlSkDlEsw": return executeInternal(ctx, continue_of8m4HifEe2n6qlSkDlEsw(ctx, slgResult));
		case "_yP9IYXifEe2n6qlSkDlEsw": return executeInternal(ctx, continue_yP9IYXifEe2n6qlSkDlEsw(ctx, slgResult));
		case "_8tEngXifEe2n6qlSkDlEsw": return executeInternal(ctx, continue_8tEngXifEe2n6qlSkDlEsw(ctx, slgResult));
		case "_CbDeAXigEe2n6qlSkDlEsw": return executeInternal(ctx, continue_CbDeAXigEe2n6qlSkDlEsw(ctx, slgResult));
		case "_eCHXMXl9Ee2Bb9t6ovoR_Q": return executeInternal(ctx, continue_eCHXMXl9Ee2Bb9t6ovoR_Q(ctx, slgResult));
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
				case _bB8JoXifEe2n6qlSkDlEsw: {
					curr = execute_bB8JoXifEe2n6qlSkDlEsw(ctx);
					break;
				}
				case _of8m4HifEe2n6qlSkDlEsw: {
					curr = execute_of8m4HifEe2n6qlSkDlEsw(ctx);
					break;
				}
				case _yP9IYXifEe2n6qlSkDlEsw: {
					curr = execute_yP9IYXifEe2n6qlSkDlEsw(ctx);
					break;
				}
				case _8tEngXifEe2n6qlSkDlEsw: {
					curr = execute_8tEngXifEe2n6qlSkDlEsw(ctx);
					break;
				}
				case _CbDeAXigEe2n6qlSkDlEsw: {
					curr = execute_CbDeAXigEe2n6qlSkDlEsw(ctx);
					break;
				}
				case _eCHXMXl9Ee2Bb9t6ovoR_Q: {
					curr = execute_eCHXMXl9Ee2Bb9t6ovoR_Q(ctx);
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
			ctx.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Offer)result.getgui__4QgbkVFNEe2J0bu3ffrh5wEdit_offerReturn().getOffer();
			}
			// branch 'Edit offer'
			return SIB_ID._eCHXMXl9Ee2Bb9t6ovoR_Q;
		} else 
		if ("Delete_offer".equals(result.getBranchName())) {
			if(result.getgui__6PHdUVFNEe2J0bu3ffrh5wDelete_offerReturn() != null) {
			ctx.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Offer)result.getgui__6PHdUVFNEe2J0bu3ffrh5wDelete_offerReturn().getOffer();
			}
			// branch 'Delete offer'
			return SIB_ID._of8m4HifEe2n6qlSkDlEsw;
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
			ctx.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__xZ1pSVFOEe2J0bu3ffrh5wEdit_biddingReturn().getBidding();
			}
			// branch 'Edit bidding'
			return SIB_ID._8tEngXifEe2n6qlSkDlEsw;
		} else 
		if ("Delete_bidding".equals(result.getBranchName())) {
			if(result.getgui__xZ1pWlFOEe2J0bu3ffrh5wDelete_biddingReturn() != null) {
			ctx.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__xZ1pWlFOEe2J0bu3ffrh5wDelete_biddingReturn().getBidding();
			}
			// branch 'Delete bidding'
			return SIB_ID._CbDeAXigEe2n6qlSkDlEsw;
		} else 
		if ("Create_offer".equals(result.getBranchName())) {
			if(result.getgui__CGsWXFFREe2J0bu3ffrh5wCreate_offerReturn() != null) {
			ctx.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.User)result.getgui__CGsWXFFREe2J0bu3ffrh5wCreate_offerReturn().getCurrentUser();
			}
			// branch 'Create offer'
			return SIB_ID._bB8JoXifEe2n6qlSkDlEsw;
		} else 
		if ("Create_bidding".equals(result.getBranchName())) {
			if(result.getgui__EIl8nFFREe2J0bu3ffrh5wCreate_biddingReturn() != null) {
			ctx.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.User)result.getgui__EIl8nFFREe2J0bu3ffrh5wCreate_biddingReturn().getCurrentUser();
			}
			// branch 'Create bidding'
			return SIB_ID._yP9IYXifEe2n6qlSkDlEsw;
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
	// container for graph abstraction 'newOfferProcess' and sub process 'newOfferProcess'.
	public SIB_ID execute_bB8JoXifEe2n6qlSkDlEsw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_bB8JoXifEe2n6qlSkDlEsw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult result = instance.execute(ctx.callStack , ctx.UserAreaCreate_offerCurrentUser_MeQm8VFREe2J0bu3ffrh5w);
	
		return continue_bB8JoXifEe2n6qlSkDlEsw(ctx, result);
	}
	
	public SIB_ID continue_bB8JoXifEe2n6qlSkDlEsw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult result = (info.scce.dime.process.onbroke.models.areas.user.newoffer.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOw.NewOfferProcess_1H0vcHfFEe20WYdcRLAoOwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'newOfferProcess' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'deleteOffer' and sub process 'deleteOffer'.
	public SIB_ID execute_of8m4HifEe2n6qlSkDlEsw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.DeleteOffer_tTP3gHfTEe2cGd7_OEEukw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.newoffer.DeleteOffer_tTP3gHfTEe2cGd7_OEEukw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_of8m4HifEe2n6qlSkDlEsw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.DeleteOffer_tTP3gHfTEe2cGd7_OEEukw.DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult result = instance.execute(ctx.callStack , ctx.UserAreaDelete_offerOffer_lslGAVFQEe2J0bu3ffrh5w);
	
		return continue_of8m4HifEe2n6qlSkDlEsw(ctx, result);
	}
	
	public SIB_ID continue_of8m4HifEe2n6qlSkDlEsw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.DeleteOffer_tTP3gHfTEe2cGd7_OEEukw.DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult result = (info.scce.dime.process.onbroke.models.areas.user.newoffer.DeleteOffer_tTP3gHfTEe2cGd7_OEEukw.DeleteOffer_tTP3gHfTEe2cGd7_OEEukwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'deleteOffer' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'newBiddingProcess' and sub process 'newBiddingProcess'.
	public SIB_ID execute_yP9IYXifEe2n6qlSkDlEsw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_yP9IYXifEe2n6qlSkDlEsw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult result = instance.execute(ctx.callStack , ctx.UserAreaCreate_biddingCurrentUser_PXLU0VFREe2J0bu3ffrh5w);
	
		return continue_yP9IYXifEe2n6qlSkDlEsw(ctx, result);
	}
	
	public SIB_ID continue_yP9IYXifEe2n6qlSkDlEsw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult result = (info.scce.dime.process.onbroke.models.areas.user.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3g.NewBiddingProcess_Aea3kWBJEe2Zz8LOII5r3gResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'newBiddingProcess' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'BiddingEditProcess' and sub process 'BiddingEditProcess'.
	public SIB_ID execute_8tEngXifEe2n6qlSkDlEsw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw instance = new info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_8tEngXifEe2n6qlSkDlEsw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult result = instance.execute(ctx.callStack , ctx.UserAreaEdit_biddingBidding_ls0WkVFQEe2J0bu3ffrh5w);
	
		return continue_8tEngXifEe2n6qlSkDlEsw(ctx, result);
	}
	
	public SIB_ID continue_8tEngXifEe2n6qlSkDlEsw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult result = (info.scce.dime.process.onbroke.models.areas.user.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpw.BiddingEditProcess_mdniwVtTEe2ySJBy9D3dpwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'BiddingEditProcess' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'deleteBidding' and sub process 'deleteBidding'.
	public SIB_ID execute_CbDeAXigEe2n6qlSkDlEsw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.DeleteBidding_tvxu4VutEe2ynpC10MMKgg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.user.DeleteBidding_tvxu4VutEe2ynpC10MMKgg.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_CbDeAXigEe2n6qlSkDlEsw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.DeleteBidding_tvxu4VutEe2ynpC10MMKgg.DeleteBidding_tvxu4VutEe2ynpC10MMKggResult result = instance.execute(ctx.callStack , ctx.UserAreaDelete_biddingBidding_ls8SYVFQEe2J0bu3ffrh5w);
	
		return continue_CbDeAXigEe2n6qlSkDlEsw(ctx, result);
	}
	
	public SIB_ID continue_CbDeAXigEe2n6qlSkDlEsw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.DeleteBidding_tvxu4VutEe2ynpC10MMKgg.DeleteBidding_tvxu4VutEe2ynpC10MMKggResult result = (info.scce.dime.process.onbroke.models.areas.user.DeleteBidding_tvxu4VutEe2ynpC10MMKgg.DeleteBidding_tvxu4VutEe2ynpC10MMKggResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'deleteBidding' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'OfferEditProcess' and sub process 'OfferEditProcess'.
	public SIB_ID execute_eCHXMXl9Ee2Bb9t6ovoR_Q(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw instance = new info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w:_eCHXMXl9Ee2Bb9t6ovoR_Q", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw.OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult result = instance.execute(ctx.callStack , ctx.UserAreaEdit_offerOffer_lseYUVFQEe2J0bu3ffrh5w);
	
		return continue_eCHXMXl9Ee2Bb9t6ovoR_Q(ctx, result);
	}
	
	public SIB_ID continue_eCHXMXl9Ee2Bb9t6ovoR_Q(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw.OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult result = (info.scce.dime.process.onbroke.models.areas.user.newoffer.OfferEditProcess_at4CYXfUEe2cGd7_OEEukw.OfferEditProcess_at4CYXfUEe2cGd7_OEEukwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._lsPHwVFQEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'OfferEditProcess' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
}  

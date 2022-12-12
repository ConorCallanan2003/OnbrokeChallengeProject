package info.scce.dime.process.onbroke.models.util;

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

public final class ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private java.lang.Boolean UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw;
				private de.ls5.dywa.generated.rest.types.Offer startOffer_BBuqUVOjEe2KQc5QIsW97w;
				private de.ls5.dywa.generated.rest.types.Issue OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w;
				private de.ls5.dywa.generated.rest.types.Issue OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w;
				private de.ls5.dywa.generated.rest.types.Issue OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw = ctx.UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw;
					if(ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w != null) {
						result.startOffer_BBuqUVOjEe2KQc5QIsW97w = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w, result.startOffer_BBuqUVOjEe2KQc5QIsW97w, objectCache);
					}
					if(ctx.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w != null) {
						result.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(ctx.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w, objectCache);
						de.ls5.dywa.generated.rest.types.IssueSelective.copy(ctx.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w, result.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w, objectCache);
					}
					if(ctx.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w != null) {
						result.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(ctx.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w, objectCache);
						de.ls5.dywa.generated.rest.types.IssueSelective.copy(ctx.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w, result.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w, objectCache);
					}
					if(ctx.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w != null) {
						result.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(ctx.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w, objectCache);
						de.ls5.dywa.generated.rest.types.IssueSelective.copy(ctx.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w, result.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					result.UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw = this.UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw;
					if (this.startOffer_BBuqUVOjEe2KQc5QIsW97w != null) {
						result.startOffer_BBuqUVOjEe2KQc5QIsW97w = contextTransformer.transform(this.startOffer_BBuqUVOjEe2KQc5QIsW97w);
					}
					if (this.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w != null) {
						result.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w = contextTransformer.transform(this.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w);
					}
					if (this.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w != null) {
						result.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w = contextTransformer.transform(this.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w);
					}
					if (this.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w != null) {
						result.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w = contextTransformer.transform(this.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w);
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
		private java.lang.Boolean UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer startOffer_BBuqUVOjEe2KQc5QIsW97w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_AaCYMVOjEe2KQc5QIsW97w,
	_D_mpUVOmEe2KQc5QIsW97w,
	_a068QXmaEe2ix_xiis0jnw,
	_jsEjIXmaEe2ix_xiis0jnw,
	_o3rFUXmaEe2ix_xiis0jnw,
	_wxEDcXmaEe2ix_xiis0jnw,
	_2Md8MXmaEe2ix_xiis0jnw,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w = offer;
		ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w = offer;
		ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w = offer;
		
		return ctx;
	}

	public ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._a068QXmaEe2ix_xiis0jnw);
	}
	
	
	public ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._a068QXmaEe2ix_xiis0jnw);
	}

	@Override
	public ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_AaCYMVOjEe2KQc5QIsW97w": return executeInternal(ctx, continue_AaCYMVOjEe2KQc5QIsW97w(ctx, slgResult));
		case "_jsEjIXmaEe2ix_xiis0jnw": return executeInternal(ctx, continue_jsEjIXmaEe2ix_xiis0jnw(ctx, slgResult));
		case "_o3rFUXmaEe2ix_xiis0jnw": return executeInternal(ctx, continue_o3rFUXmaEe2ix_xiis0jnw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _AaCYMVOjEe2KQc5QIsW97w: {
					curr = execute_AaCYMVOjEe2KQc5QIsW97w(ctx);
					break;
				}
				case _D_mpUVOmEe2KQc5QIsW97w: {
					return execute_D_mpUVOmEe2KQc5QIsW97w(ctx);
				}
				case _a068QXmaEe2ix_xiis0jnw: {
					curr = execute_a068QXmaEe2ix_xiis0jnw(ctx);
					break;
				}
				case _jsEjIXmaEe2ix_xiis0jnw: {
					curr = execute_jsEjIXmaEe2ix_xiis0jnw(ctx);
					break;
				}
				case _o3rFUXmaEe2ix_xiis0jnw: {
					curr = execute_o3rFUXmaEe2ix_xiis0jnw(ctx);
					break;
				}
				case _wxEDcXmaEe2ix_xiis0jnw: {
					curr = execute_wxEDcXmaEe2ix_xiis0jnw(ctx);
					break;
				}
				case _2Md8MXmaEe2ix_xiis0jnw: {
					curr = execute_2Md8MXmaEe2ix_xiis0jnw(ctx);
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
	public static class ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private BackReturn back;
		
		public ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult(BackReturn back) {
			this.branchName = "back";
			this.branchId = "_D_mpUVOmEe2KQc5QIsW97w";
			this.back = back;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public BackReturn getBackReturn() {
			return back;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>back</code>.
		 */
		public interface BackReturn {
		}
	
		/**
		 * Return type of branch <code>back</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class BackReturnImpl implements BackReturn {

			private final Context ctx;

	        BackReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB OfferDetails _AaCYMVOjEe2KQc5QIsW97w
	private static class InputsForGUISIB_AaCYMVOjEe2KQc5QIsW97w {
		public de.ls5.dywa.generated.rest.types.Offer
		 offer;
		public java.lang.Boolean showResolveButtons;
	}
	
	
	// container for GUI SIB 'OfferDetails'.
	public SIB_ID execute_AaCYMVOjEe2KQc5QIsW97w(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.OfferREST inputsOfferREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.OfferREST.class);
		
		final InputsForGUISIB_AaCYMVOjEe2KQc5QIsW97w inputs = new InputsForGUISIB_AaCYMVOjEe2KQc5QIsW97w();
		
		{
			de.ls5.dywa.generated.rest.types.Offer
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Offer obj = ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w;
			
			de.ls5.dywa.generated.rest.types.Offer restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_OfferDetailsOfferSelectivex1_fcOIkVN8Ee2KQc5QIsW97w
					restTO = inputsOfferREST.read_OfferDetailsOfferSelectivex1_fcOIkVN8Ee2KQc5QIsW97w(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(obj, objectCache);
					}
					// OfferDetailsOfferSelectivex1_fcOIkVN8Ee2KQc5QIsW97w
					de.ls5.dywa.generated.rest.types.OfferDetailsOfferSelectivex1_fcOIkVN8Ee2KQc5QIsW97w.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.offer = result;
		}
		inputs.showResolveButtons = ctx.UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw;
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w:_AaCYMVOjEe2KQc5QIsW97w:_fcOIkVN8Ee2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_AaCYMVOjEe2KQc5QIsW97w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_AaCYMVOjEe2KQc5QIsW97w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_AaCYMVOjEe2KQc5QIsW97w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.util.offerdetails.OfferDetails_fcOIkVN8Ee2KQc5QIsW97wResult result = (info.scce.dime.gui.onbroke.models.util.offerdetails.OfferDetails_fcOIkVN8Ee2KQc5QIsW97wResult) guiResult;
		if ("Show_issue".equals(result.getBranchName())) {
			if(result.getgui__bJxmsVN9Ee2KQc5QIsW97wShow_issueReturn() != null) {
			ctx.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w = (de.ls5.dywa.generated.entity.onbroke.models.app.Issue)result.getgui__bJxmsVN9Ee2KQc5QIsW97wShow_issueReturn().getIssue();
			}
			// branch 'Show issue'
			return SIB_ID._o3rFUXmaEe2ix_xiis0jnw;
		} else 
		if ("Resolve_issue".equals(result.getBranchName())) {
			if(result.getgui__V3lGkVOdEe2KQc5QIsW97wResolve_issueReturn() != null) {
			ctx.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w = (de.ls5.dywa.generated.entity.onbroke.models.app.Issue)result.getgui__V3lGkVOdEe2KQc5QIsW97wResolve_issueReturn().getIssue();
			}
			// branch 'Resolve issue'
			return SIB_ID._wxEDcXmaEe2ix_xiis0jnw;
		} else 
		if ("Unresolve_issue".equals(result.getBranchName())) {
			if(result.getgui__dDPcAVOdEe2KQc5QIsW97wUnresolve_issueReturn() != null) {
			ctx.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w = (de.ls5.dywa.generated.entity.onbroke.models.app.Issue)result.getgui__dDPcAVOdEe2KQc5QIsW97wUnresolve_issueReturn().getIssue();
			}
			// branch 'Unresolve issue'
			return SIB_ID._2Md8MXmaEe2ix_xiis0jnw;
		} else 
		if ("Create_issue".equals(result.getBranchName())) {
			// branch 'Create issue'
			return SIB_ID._jsEjIXmaEe2ix_xiis0jnw;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._D_mpUVOmEe2KQc5QIsW97w;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_AaCYMVOjEe2KQc5QIsW97w(ctx);
		}
	}
	// container for graph i/o 'back'.
	public ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult execute_D_mpUVOmEe2KQc5QIsW97w(final Context ctx) {
		return new ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult(new BackReturnImpl(ctx));
	}
	// container for graph abstraction 'UserCanDiscuss' and sub process 'UserCanDiscuss'.
	public SIB_ID execute_a068QXmaEe2ix_xiis0jnw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.UserCanDiscuss_rUELYFOfEe2KQc5QIsW97w instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.util.UserCanDiscuss_rUELYFOfEe2KQc5QIsW97w.class);
	
		final info.scce.dime.process.onbroke.models.util.UserCanDiscuss_rUELYFOfEe2KQc5QIsW97w.UserCanDiscuss_rUELYFOfEe2KQc5QIsW97wResult result = instance.execute(false, ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w);
	
		switch(result.getBranchName()) {
		case "success": {
			ctx.UserCanDiscussSuccessResult_a1HwkXmaEe2ix_xiis0jnw = result.getSuccessReturn().getResult();
			// branch 'success'
			return SIB_ID._AaCYMVOjEe2KQc5QIsW97w;
		}
			default: throw new IllegalStateException("SIB 'UserCanDiscuss' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'ShowCreateIssueOffer' and sub process 'ShowCreateIssueOffer'.
	public SIB_ID execute_jsEjIXmaEe2ix_xiis0jnw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.util.task4files.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w:_jsEjIXmaEe2ix_xiis0jnw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.task4files.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult result = instance.execute(ctx.callStack , ctx.startOffer_BBuqUVOjEe2KQc5QIsW97w);
	
		return continue_jsEjIXmaEe2ix_xiis0jnw(ctx, result);
	}
	
	public SIB_ID continue_jsEjIXmaEe2ix_xiis0jnw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult result = (info.scce.dime.process.onbroke.models.util.task4files.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._AaCYMVOjEe2KQc5QIsW97w;
		}
			default: throw new IllegalStateException("SIB 'ShowCreateIssueOffer' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowDetailsPage' and sub process 'ShowDetailsPage'.
	public SIB_ID execute_o3rFUXmaEe2ix_xiis0jnw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w:_o3rFUXmaEe2ix_xiis0jnw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult result = instance.execute(ctx.callStack , ctx.OfferDetailsShow_issueIssue_AacA0VOjEe2KQc5QIsW97w);
	
		return continue_o3rFUXmaEe2ix_xiis0jnw(ctx, result);
	}
	
	public SIB_ID continue_o3rFUXmaEe2ix_xiis0jnw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult result = (info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._AaCYMVOjEe2KQc5QIsW97w;
		}
			default: throw new IllegalStateException("SIB 'ShowDetailsPage' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowResolveIssue' and sub process 'ShowResolveIssue'.
	public SIB_ID execute_wxEDcXmaEe2ix_xiis0jnw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowResolveIssue_QTqXUWBcEe22r__HYPHEN_MINUS__rMCqBFnw instance = new info.scce.dime.process.onbroke.models.util.task4files.ShowResolveIssue_QTqXUWBcEe22r__HYPHEN_MINUS__rMCqBFnw(ctx.beanManager);
	
		final info.scce.dime.process.onbroke.models.util.task4files.ShowResolveIssue_QTqXUWBcEe22r__HYPHEN_MINUS__rMCqBFnw.ShowResolveIssue_QTqXUWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult result = instance.execute(false, ctx.OfferDetailsResolve_issueIssue_Aalx0VOjEe2KQc5QIsW97w);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._AaCYMVOjEe2KQc5QIsW97w;
		}
			default: throw new IllegalStateException("SIB 'ShowResolveIssue' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'ShowUnresolveIssue' and sub process 'ShowUnresolveIssue'.
	public SIB_ID execute_2Md8MXmaEe2ix_xiis0jnw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnw instance = new info.scce.dime.process.onbroke.models.util.task4files.ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnw(ctx.beanManager);
	
		final info.scce.dime.process.onbroke.models.util.task4files.ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnw.ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult result = instance.execute(false, ctx.OfferDetailsUnresolve_issueIssue_AatGkVOjEe2KQc5QIsW97w);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._AaCYMVOjEe2KQc5QIsW97w;
		}
			default: throw new IllegalStateException("SIB 'ShowUnresolveIssue' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  

package info.scce.dime.process.onbroke.models.util.task4files;

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
public final class ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.Offer offer;
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.offer != null) {
						result.offer = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.offer, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.offer, result.offer, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.offer != null) {
						result.offer = contextTransformer.transform(this.offer);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer;
		// direct dataflow variables.
		private java.lang.String CreateIssueFormSubmitTitle_ohOEU2BYEe22r__HYPHEN_MINUS__rMCqBFnw;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue Create_IssueSuccessCreated_vXjqA2BYEe22r__HYPHEN_MINUS__rMCqBFnw;
		private de.ls5.dywa.generated.entity.onbroke.models.app.IssueState Get_IssueStateUnresolvedLiteral_87LnEWBYEe22r__HYPHEN_MINUS__rMCqBFnw;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_iHzrMWBYEe22r__HYPHEN_MINUS__rMCqBFnw,
	_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw,
	_vXc8UWBYEe22r__HYPHEN_MINUS__rMCqBFnw,
	_87IjwWBYEe22r__HYPHEN_MINUS__rMCqBFnw,
	___HYPHEN_MINUS__VGAUWBYEe22r__HYPHEN_MINUS__rMCqBFnw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.IssueController IssueController;

	@Inject
	public ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.IssueController IssueController) {
		this.beanManager = beanManager;
		this.IssueController = IssueController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.offer = offer;
		
		return ctx;
	}

	public ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw);
	}
	
	
	public ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer) {
		final Context ctx = createContext(offer);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw);
	}

	@Override
	public ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_ohLoEWBYEe22r-rMCqBFnw": return executeInternal(ctx, continue_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _iHzrMWBYEe22r__HYPHEN_MINUS__rMCqBFnw: {
					return execute_iHzrMWBYEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
				}
				case _ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _vXc8UWBYEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_vXc8UWBYEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _87IjwWBYEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_87IjwWBYEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case ___HYPHEN_MINUS__VGAUWBYEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute___HYPHEN_MINUS__VGAUWBYEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
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
	public static class ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_iHzrMWBYEe22r__HYPHEN_MINUS__rMCqBFnw";
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
	public ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult execute_iHzrMWBYEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		return new ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnwResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB CreateIssueForm _ohLoEWBYEe22r-rMCqBFnw
	private static class InputsForGUISIB_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw {
	}
	
	
	// container for GUI SIB 'CreateIssueForm'.
	public SIB_ID execute_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
	
		
		final InputsForGUISIB_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw inputs = new InputsForGUISIB_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.task4files.ShowCreateIssueOffer_fRovUWBYEe22r__HYPHEN_MINUS__rMCqBFnw:_ohLoEWBYEe22r-rMCqBFnw:_qs8t8GAJEe2S6JM4Hx8SJw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_ohLoEWBYEe22r-rMCqBFnw", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_ohLoEWBYEe22r-rMCqBFnw");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.util.task4files.createissueform.CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwResult result = (info.scce.dime.gui.onbroke.models.util.task4files.createissueform.CreateIssueForm_qs8t8GAJEe2S6JM4Hx8SJwResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__sAn8UGAJEe2S6JM4Hx8SJwSubmitReturn() != null) {
			ctx.CreateIssueFormSubmitTitle_ohOEU2BYEe22r__HYPHEN_MINUS__rMCqBFnw = result.getgui__sAn8UGAJEe2S6JM4Hx8SJwSubmitReturn().getTitle();
			}
			// branch 'Submit'
			return SIB_ID._vXc8UWBYEe22r__HYPHEN_MINUS__rMCqBFnw;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._iHzrMWBYEe22r__HYPHEN_MINUS__rMCqBFnw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_ohLoEWBYEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
		}
	}
	// container for create SIB 'Create Issue'.
	public SIB_ID execute_vXc8UWBYEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.IssueController domController = this.IssueController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Issue createdObj = domController.create(null);
	
		createdObj.settitle(ctx.CreateIssueFormSubmitTitle_ohOEU2BYEe22r__HYPHEN_MINUS__rMCqBFnw);
	
		de.ls5.dywa.generated.entity.onbroke.models.app.Issue value23 = createdObj;
		if (value23 != null) { // prevent null in lists
		Optional.ofNullable(ctx.offer).map(de.ls5.dywa.generated.entity.onbroke.models.app.Offer::getissues_Issue).get().add(value23);
		}
		ctx.Create_IssueSuccessCreated_vXjqA2BYEe22r__HYPHEN_MINUS__rMCqBFnw = createdObj;
	
		// branch 'success'
		return SIB_ID._87IjwWBYEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	// container for retrieve enum literal SIB 'Get IssueState'.
	public SIB_ID execute_87IjwWBYEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		ctx.Get_IssueStateUnresolvedLiteral_87LnEWBYEe22r__HYPHEN_MINUS__rMCqBFnw = de.ls5.dywa.generated.entity.onbroke.models.app.IssueState.unresolved;
		// branch 'unresolved'
		return SIB_ID.___HYPHEN_MINUS__VGAUWBYEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	// container for SIB 'Set state' setting a new attribute value.
	public SIB_ID execute___HYPHEN_MINUS__VGAUWBYEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		ctx.Create_IssueSuccessCreated_vXjqA2BYEe22r__HYPHEN_MINUS__rMCqBFnw.setstate(ctx.Get_IssueStateUnresolvedLiteral_87LnEWBYEe22r__HYPHEN_MINUS__rMCqBFnw);
		// branch 'success'
		return SIB_ID._iHzrMWBYEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	
}  

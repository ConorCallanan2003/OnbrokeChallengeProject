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
public final class ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.Issue issue;
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.issue != null) {
						result.issue = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(ctx.issue, objectCache);
						de.ls5.dywa.generated.rest.types.IssueSelective.copy(ctx.issue, result.issue, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.issue != null) {
						result.issue = contextTransformer.transform(this.issue);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User user;
		// direct dataflow variables.
		private java.lang.String CreateCommentFormSubmitComment_OTmrAWDTEe22r__HYPHEN_MINUS__rMCqBFnw;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment Create_CommentSuccessCreated_bkcX4XmeEe2ix_xiis0jnw;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw,
	_Wp9NwGDaEe22r__HYPHEN_MINUS__rMCqBFnw,
	_ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw,
	_bkT1AXmeEe2ix_xiis0jnw,
	_yRYC0XmeEe2ix_xiis0jnw,
	_6KbpwXmeEe2ix_xiis0jnw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController CommentController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController;

	@Inject
	public ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.CommentController CommentController, de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController) {
		this.beanManager = beanManager;
		this.CommentController = CommentController;
		this.BaseUserController = BaseUserController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.issue = issue;
		
		return ctx;
	}

	public ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = createContext(issue);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw);
	}
	
	
	public ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = createContext(issue);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw);
	}

	@Override
	public ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_OTSh8WDTEe22r-rMCqBFnw": return executeInternal(ctx, continue_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _Wp9NwGDaEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_Wp9NwGDaEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw: {
					return execute_ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
				}
				case _bkT1AXmeEe2ix_xiis0jnw: {
					curr = execute_bkT1AXmeEe2ix_xiis0jnw(ctx);
					break;
				}
				case _yRYC0XmeEe2ix_xiis0jnw: {
					curr = execute_yRYC0XmeEe2ix_xiis0jnw(ctx);
					break;
				}
				case _6KbpwXmeEe2ix_xiis0jnw: {
					curr = execute_6KbpwXmeEe2ix_xiis0jnw(ctx);
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
	public static class ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw";
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
		

	private <T> T getConcreteUser(final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser subject, final Class<T> userType) {
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.User concreteUser: subject.getuser_User()) {
			if (userType.isAssignableFrom(concreteUser.getClass())) {
				return (T)concreteUser;
			}
		}
		throw new IllegalStateException("Did not find concrete user of type '" + userType.getSimpleName() + "'");
	}

	// sibs
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB CreateCommentForm _OTSh8WDTEe22r-rMCqBFnw
	private static class InputsForGUISIB_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw {
		public java.lang.String comment;
	}
	
	
	// container for GUI SIB 'CreateCommentForm'.
	public SIB_ID execute_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
	
		
		final InputsForGUISIB_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw inputs = new InputsForGUISIB_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw();
		
		inputs.comment = null;
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.task4files.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw:_OTSh8WDTEe22r-rMCqBFnw:_ovAusWAWEe2S6JM4Hx8SJw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_OTSh8WDTEe22r-rMCqBFnw", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_OTSh8WDTEe22r-rMCqBFnw");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.util.task4files.createcommentform.CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwResult result = (info.scce.dime.gui.onbroke.models.util.task4files.createcommentform.CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__vA9082AWEe2S6JM4Hx8SJwSubmitReturn() != null) {
			ctx.CreateCommentFormSubmitComment_OTmrAWDTEe22r__HYPHEN_MINUS__rMCqBFnw = result.getgui__vA9082AWEe2S6JM4Hx8SJwSubmitReturn().getComment();
			}
			// branch 'Submit'
			return SIB_ID._bkT1AXmeEe2ix_xiis0jnw;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_OTSh8WDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
		}
	}
	// container for retrieve user sib 'Retrieve Current User'.
	public SIB_ID execute_Wp9NwGDaEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		final Subject shiroSubj = SecurityUtils.getSubject();
	
		if (!shiroSubj.isAuthenticated()) {
			// branch 'not authenticated'
			return SIB_ID._ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw;
		}
	
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController subjectController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser subject = subjectController.read((Long)shiroSubj.getPrincipal());
		final de.ls5.dywa.generated.entity.onbroke.models.app.User concreteUser = getConcreteUser(subject, de.ls5.dywa.generated.entity.onbroke.models.app.User.class);
		ctx.user = concreteUser.getdywaSwitchedTo() != null ? concreteUser.getdywaSwitchedTo() : concreteUser;
		// branch 'success'
		return SIB_ID._yRYC0XmeEe2ix_xiis0jnw;
	}
	// container for graph i/o 'success'.
	public ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult execute_ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		return new ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult(new SuccessReturnImpl(ctx));
	}
	// container for create SIB 'Create Comment'.
	public SIB_ID execute_bkT1AXmeEe2ix_xiis0jnw(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController domController = this.CommentController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Comment createdObj = domController.create(ctx.CreateCommentFormSubmitComment_OTmrAWDTEe22r__HYPHEN_MINUS__rMCqBFnw);
	
	
		ctx.Create_CommentSuccessCreated_bkcX4XmeEe2ix_xiis0jnw = createdObj;
		de.ls5.dywa.generated.entity.onbroke.models.app.Comment value24 = createdObj;
		if (value24 != null) { // prevent null in lists
		Optional.ofNullable(ctx.issue).map(de.ls5.dywa.generated.entity.onbroke.models.app.Issue::getcomments_Comment).get().add(value24);
		}
		ctx.Create_CommentSuccessCreated_bkcX4XmeEe2ix_xiis0jnw = createdObj;
	
		// branch 'success'
		return SIB_ID._Wp9NwGDaEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	// container for SIB 'Set commentFirstName' setting a new attribute value.
	public SIB_ID execute_yRYC0XmeEe2ix_xiis0jnw(final Context ctx) {
		ctx.Create_CommentSuccessCreated_bkcX4XmeEe2ix_xiis0jnw.setcommentFirstName(Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getfirstName).orElse(new java.lang.String()));
		// branch 'success'
		return SIB_ID._6KbpwXmeEe2ix_xiis0jnw;
	}
	// container for SIB 'Set commentLastName' setting a new attribute value.
	public SIB_ID execute_6KbpwXmeEe2ix_xiis0jnw(final Context ctx) {
		ctx.Create_CommentSuccessCreated_bkcX4XmeEe2ix_xiis0jnw.setcommentLastName(Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getlastName).orElse(new java.lang.String()));
		// branch 'success'
		return SIB_ID._ix9aAWDdEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	
}  

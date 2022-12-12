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

public final class ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.Comment comment;
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.comment != null) {
						result.comment = de.ls5.dywa.generated.rest.types.Comment.fromDywaEntity(ctx.comment, objectCache);
						de.ls5.dywa.generated.rest.types.CommentSelective.copy(ctx.comment, result.comment, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.comment != null) {
						result.comment = contextTransformer.transform(this.comment);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment comment;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_4aOHcWDTEe22r__HYPHEN_MINUS__rMCqBFnw,
	_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Comment comment) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.comment = comment;
		
		return ctx;
	}

	public ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Comment comment) {
		final Context ctx = createContext(comment);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw);
	}
	
	
	public ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Comment comment) {
		final Context ctx = createContext(comment);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw);
	}

	@Override
	public ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_BXlEAWDUEe22r-rMCqBFnw": return executeInternal(ctx, continue_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _4aOHcWDTEe22r__HYPHEN_MINUS__rMCqBFnw: {
					return execute_4aOHcWDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
				}
				case _BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
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
	public static class ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_4aOHcWDTEe22r__HYPHEN_MINUS__rMCqBFnw";
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
	public ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult execute_4aOHcWDTEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		return new ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB CreateCommentForm _BXlEAWDUEe22r-rMCqBFnw
	private static class InputsForGUISIB_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw {
		public java.lang.String comment;
	}
	
	
	// container for GUI SIB 'CreateCommentForm'.
	public SIB_ID execute_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
	
		
		final InputsForGUISIB_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw inputs = new InputsForGUISIB_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw();
		
		inputs.comment = Optional.ofNullable(ctx.comment).map(de.ls5.dywa.generated.entity.onbroke.models.app.Comment::gettext).orElse(new java.lang.String());
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.task4files.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw:_BXlEAWDUEe22r-rMCqBFnw:_ovAusWAWEe2S6JM4Hx8SJw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_BXlEAWDUEe22r-rMCqBFnw", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_BXlEAWDUEe22r-rMCqBFnw");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.util.task4files.createcommentform.CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwResult result = (info.scce.dime.gui.onbroke.models.util.task4files.createcommentform.CreateCommentForm_ovAusWAWEe2S6JM4Hx8SJwResult) guiResult;
		if ("Submit".equals(result.getBranchName())) {
			if(result.getgui__vA9082AWEe2S6JM4Hx8SJwSubmitReturn() != null) {
			Optional.ofNullable(ctx.comment).get().settext(result.getgui__vA9082AWEe2S6JM4Hx8SJwSubmitReturn().getComment());
			}
			// branch 'Submit'
			return SIB_ID._4aOHcWDTEe22r__HYPHEN_MINUS__rMCqBFnw;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._4aOHcWDTEe22r__HYPHEN_MINUS__rMCqBFnw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_BXlEAWDUEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
		}
	}
	
}  

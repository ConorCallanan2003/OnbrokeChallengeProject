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
public final class ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Issue startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw;
				private de.ls5.dywa.generated.rest.types.Comment DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw;
				private de.ls5.dywa.generated.rest.types.Comment DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw != null) {
						result.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(ctx.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw, objectCache);
						de.ls5.dywa.generated.rest.types.IssueSelective.copy(ctx.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw, result.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw, objectCache);
					}
					if(ctx.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw != null) {
						result.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw = de.ls5.dywa.generated.rest.types.Comment.fromDywaEntity(ctx.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw, objectCache);
						de.ls5.dywa.generated.rest.types.CommentSelective.copy(ctx.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw, result.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw, objectCache);
					}
					if(ctx.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw != null) {
						result.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw = de.ls5.dywa.generated.rest.types.Comment.fromDywaEntity(ctx.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw, objectCache);
						de.ls5.dywa.generated.rest.types.CommentSelective.copy(ctx.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw, result.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw != null) {
						result.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw = contextTransformer.transform(this.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw);
					}
					if (this.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw != null) {
						result.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw = contextTransformer.transform(this.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw);
					}
					if (this.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw != null) {
						result.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw = contextTransformer.transform(this.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Comment DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_tUbfMWBZEe22r__HYPHEN_MINUS__rMCqBFnw,
	_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw,
	_PhWmEGBbEe22r__HYPHEN_MINUS__rMCqBFnw,
	_uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw,
	_XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController CommentController;

	@Inject
	public ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.CommentController CommentController) {
		this.beanManager = beanManager;
		this.CommentController = CommentController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw = issue;
		ctx.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw = issue;
		
		return ctx;
	}

	public ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = createContext(issue);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw);
	}
	
	
	public ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = createContext(issue);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw);
	}

	@Override
	public ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_432fEWBZEe22r-rMCqBFnw": return executeInternal(ctx, continue_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, slgResult));
		case "_uH6KIWDTEe22r-rMCqBFnw": return executeInternal(ctx, continue_uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, slgResult));
		case "_XsVfgWDUEe22r-rMCqBFnw": return executeInternal(ctx, continue_XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _tUbfMWBZEe22r__HYPHEN_MINUS__rMCqBFnw: {
					return execute_tUbfMWBZEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
				}
				case _432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _PhWmEGBbEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_PhWmEGBbEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
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
	public static class ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_tUbfMWBZEe22r__HYPHEN_MINUS__rMCqBFnw";
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
	public ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult execute_tUbfMWBZEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		return new ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnwResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB DetailsPage _432fEWBZEe22r-rMCqBFnw
	private static class InputsForGUISIB_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw {
		public de.ls5.dywa.generated.rest.types.Issue
		 issue;
	}
	
	
	// container for GUI SIB 'DetailsPage'.
	public SIB_ID execute_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.IssueREST inputsIssueREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.IssueREST.class);
		
		final InputsForGUISIB_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw inputs = new InputsForGUISIB_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw();
		
		{
			de.ls5.dywa.generated.rest.types.Issue
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Issue obj = ctx.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw;
			
			de.ls5.dywa.generated.rest.types.Issue restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_DetailsPageIssueSelectivex1_HVzS0GAMEe2S6JM4Hx8SJw
					restTO = inputsIssueREST.read_DetailsPageIssueSelectivex1_HVzS0GAMEe2S6JM4Hx8SJw(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(obj, objectCache);
					}
					// DetailsPageIssueSelectivex1_HVzS0GAMEe2S6JM4Hx8SJw
					de.ls5.dywa.generated.rest.types.DetailsPageIssueSelectivex1_HVzS0GAMEe2S6JM4Hx8SJw.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.issue = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw:_432fEWBZEe22r-rMCqBFnw:_HVzS0GAMEe2S6JM4Hx8SJw", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_432fEWBZEe22r-rMCqBFnw", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_432fEWBZEe22r-rMCqBFnw");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.util.task4files.detailspage.DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwResult result = (info.scce.dime.gui.onbroke.models.util.task4files.detailspage.DetailsPage_HVzS0GAMEe2S6JM4Hx8SJwResult) guiResult;
		if ("Add_new_Comment".equals(result.getBranchName())) {
			// branch 'Add new Comment'
			return SIB_ID._uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw;
		} else 
		if ("Edit".equals(result.getBranchName())) {
			if(result.getgui__4twukWAPEe2S6JM4Hx8SJwEditReturn() != null) {
			ctx.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw = (de.ls5.dywa.generated.entity.onbroke.models.app.Comment)result.getgui__4twukWAPEe2S6JM4Hx8SJwEditReturn().getComment();
			}
			// branch 'Edit'
			return SIB_ID._XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw;
		} else 
		if ("Delete".equals(result.getBranchName())) {
			if(result.getgui__6FR7IWAPEe2S6JM4Hx8SJwDeleteReturn() != null) {
			ctx.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw = (de.ls5.dywa.generated.entity.onbroke.models.app.Comment)result.getgui__6FR7IWAPEe2S6JM4Hx8SJwDeleteReturn().getComment();
			}
			// branch 'Delete'
			return SIB_ID._PhWmEGBbEe22r__HYPHEN_MINUS__rMCqBFnw;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._tUbfMWBZEe22r__HYPHEN_MINUS__rMCqBFnw;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
		}
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_PhWmEGBbEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.CommentController domController = this.CommentController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.Comment instanceToDelete = ctx.DetailsPageDeleteComment_rIjMsXmjEe2ix_xiis0jnw;
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}
		// branch 'deleted'
		return SIB_ID._432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	// container for graph abstraction 'ShowAddNewComment' and sub process 'ShowAddNewComment'.
	public SIB_ID execute_uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.util.task4files.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw:_uH6KIWDTEe22r-rMCqBFnw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.task4files.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult result = instance.execute(ctx.callStack , ctx.startIssue_3BQJ0WBZEe22r__HYPHEN_MINUS__rMCqBFnw);
	
		return continue_uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, result);
	}
	
	public SIB_ID continue_uH6KIWDTEe22r__HYPHEN_MINUS__rMCqBFnw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult result = (info.scce.dime.process.onbroke.models.util.task4files.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnw.ShowAddNewComment_KNwP8WDTEe22r__HYPHEN_MINUS__rMCqBFnwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw;
		}
			default: throw new IllegalStateException("SIB 'ShowAddNewComment' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowEditComment' and sub process 'ShowEditComment'.
	public SIB_ID execute_XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw instance = new info.scce.dime.process.onbroke.models.util.task4files.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.task4files.ShowDetailsPage_tHOwsWBZEe22r__HYPHEN_MINUS__rMCqBFnw:_XsVfgWDUEe22r-rMCqBFnw", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.task4files.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult result = instance.execute(ctx.callStack , ctx.DetailsPageEditComment_rIh__HYPHEN_MINUS__kXmjEe2ix_xiis0jnw);
	
		return continue_XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw(ctx, result);
	}
	
	public SIB_ID continue_XsVfgWDUEe22r__HYPHEN_MINUS__rMCqBFnw(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.task4files.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult result = (info.scce.dime.process.onbroke.models.util.task4files.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnw.ShowEditComment_4JKMoWDTEe22r__HYPHEN_MINUS__rMCqBFnwResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._432fEWBZEe22r__HYPHEN_MINUS__rMCqBFnw;
		}
			default: throw new IllegalStateException("SIB 'ShowEditComment' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
}  

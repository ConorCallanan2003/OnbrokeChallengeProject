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

public final class ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnw implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Issue startIssue_0yQbUGBcEe22r__HYPHEN_MINUS__rMCqBFnw;
		private de.ls5.dywa.generated.entity.onbroke.models.app.IssueState Get_IssueStateUnresolvedLiteral_z4PDEWBcEe22r__HYPHEN_MINUS__rMCqBFnw;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_wQkY0WBcEe22r__HYPHEN_MINUS__rMCqBFnw,
	_z4KxoWBcEe22r__HYPHEN_MINUS__rMCqBFnw,
	_1vii8WBcEe22r__HYPHEN_MINUS__rMCqBFnw,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnw(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startIssue_0yQbUGBcEe22r__HYPHEN_MINUS__rMCqBFnw = issue;
		
		return ctx;
	}

	public ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Issue issue) {
		final Context ctx = createContext(issue);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._z4KxoWBcEe22r__HYPHEN_MINUS__rMCqBFnw);
	}
	
	

	@Override
	public ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _wQkY0WBcEe22r__HYPHEN_MINUS__rMCqBFnw: {
					return execute_wQkY0WBcEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
				}
				case _z4KxoWBcEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_z4KxoWBcEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
					break;
				}
				case _1vii8WBcEe22r__HYPHEN_MINUS__rMCqBFnw: {
					curr = execute_1vii8WBcEe22r__HYPHEN_MINUS__rMCqBFnw(ctx);
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
	public static class ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_wQkY0WBcEe22r__HYPHEN_MINUS__rMCqBFnw";
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
	public ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult execute_wQkY0WBcEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		return new ShowUnresolveIssue_v8GksWBcEe22r__HYPHEN_MINUS__rMCqBFnwResult(new SuccessReturnImpl(ctx));
	}
	// container for retrieve enum literal SIB 'Get IssueState'.
	public SIB_ID execute_z4KxoWBcEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		ctx.Get_IssueStateUnresolvedLiteral_z4PDEWBcEe22r__HYPHEN_MINUS__rMCqBFnw = de.ls5.dywa.generated.entity.onbroke.models.app.IssueState.unresolved;
		// branch 'unresolved'
		return SIB_ID._1vii8WBcEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	// container for SIB 'Set state' setting a new attribute value.
	public SIB_ID execute_1vii8WBcEe22r__HYPHEN_MINUS__rMCqBFnw(final Context ctx) {
		ctx.startIssue_0yQbUGBcEe22r__HYPHEN_MINUS__rMCqBFnw.setstate(ctx.Get_IssueStateUnresolvedLiteral_z4PDEWBcEe22r__HYPHEN_MINUS__rMCqBFnw);
		// branch 'success'
		return SIB_ID._wQkY0WBcEe22r__HYPHEN_MINUS__rMCqBFnw;
	}
	
}  

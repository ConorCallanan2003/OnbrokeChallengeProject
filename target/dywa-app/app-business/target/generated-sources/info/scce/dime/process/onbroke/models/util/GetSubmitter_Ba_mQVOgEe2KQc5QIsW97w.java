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

public final class GetSubmitter_Ba_mQVOgEe2KQc5QIsW97w implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User submitter_QhzNUVOgEe2KQc5QIsW97w;
		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.onbroke.models.app.Submission startSubmission_B60V0VOgEe2KQc5QIsW97w;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_BmQbEVOgEe2KQc5QIsW97w,
	_DNGdEVOgEe2KQc5QIsW97w,
	_JH_HIVOgEe2KQc5QIsW97w,
	_V5BJoVOgEe2KQc5QIsW97w,
	_g5KdUVOgEe2KQc5QIsW97w,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public GetSubmitter_Ba_mQVOgEe2KQc5QIsW97w(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Submission submission) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startSubmission_B60V0VOgEe2KQc5QIsW97w = submission;
		ctx.startSubmission_B60V0VOgEe2KQc5QIsW97w = submission;
		
		return ctx;
	}

	public GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Submission submission) {
		final Context ctx = createContext(submission);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._DNGdEVOgEe2KQc5QIsW97w);
	}
	
	

	@Override
	public GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _BmQbEVOgEe2KQc5QIsW97w: {
					return execute_BmQbEVOgEe2KQc5QIsW97w(ctx);
				}
				case _DNGdEVOgEe2KQc5QIsW97w: {
					curr = execute_DNGdEVOgEe2KQc5QIsW97w(ctx);
					break;
				}
				case _JH_HIVOgEe2KQc5QIsW97w: {
					curr = execute_JH_HIVOgEe2KQc5QIsW97w(ctx);
					break;
				}
				case _V5BJoVOgEe2KQc5QIsW97w: {
					curr = execute_V5BJoVOgEe2KQc5QIsW97w(ctx);
					break;
				}
				case _g5KdUVOgEe2KQc5QIsW97w: {
					curr = execute_g5KdUVOgEe2KQc5QIsW97w(ctx);
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
	public static class GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_BmQbEVOgEe2KQc5QIsW97w";
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
			public de.ls5.dywa.generated.entity.onbroke.models.app.User getSubmitter();
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

			public de.ls5.dywa.generated.entity.onbroke.models.app.User getSubmitter() {
				return ctx.submitter_QhzNUVOgEe2KQc5QIsW97w;
			}
		}
		


	// sibs
	// container for graph i/o 'success'.
	public GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult execute_BmQbEVOgEe2KQc5QIsW97w(final Context ctx) {
		return new GetSubmitter_Ba_mQVOgEe2KQc5QIsW97wResult(new SuccessReturnImpl(ctx));
	}
	// container for is of type SIB 'Is a Offer'.
	public SIB_ID execute_DNGdEVOgEe2KQc5QIsW97w(final Context ctx) {
		final de.ls5.dywa.generated.entity.onbroke.models.app.Submission instance = ctx.startSubmission_B60V0VOgEe2KQc5QIsW97w;
		if(instance instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Offer) {
			ctx.offer = (de.ls5.dywa.generated.entity.onbroke.models.app.Offer)instance;
			// branch 'yes'
			return SIB_ID._JH_HIVOgEe2KQc5QIsW97w;
		}
		// branch 'no'
		return SIB_ID._V5BJoVOgEe2KQc5QIsW97w;
	}
	// container for SIB 'PutToContext' putting some values to context.
	public SIB_ID execute_JH_HIVOgEe2KQc5QIsW97w(final Context ctx) {
		// put 'user'.
		ctx.submitter_QhzNUVOgEe2KQc5QIsW97w = Optional.ofNullable(ctx.offer).map(de.ls5.dywa.generated.entity.onbroke.models.app.Offer::getuser).orElse(null);
	
		// branch 'success'
		return SIB_ID._BmQbEVOgEe2KQc5QIsW97w;
	}
	// container for is of type SIB 'Is a Bidding'.
	public SIB_ID execute_V5BJoVOgEe2KQc5QIsW97w(final Context ctx) {
		final de.ls5.dywa.generated.entity.onbroke.models.app.Submission instance = ctx.startSubmission_B60V0VOgEe2KQc5QIsW97w;
		if(instance instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Bidding) {
			ctx.bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)instance;
			// branch 'yes'
			return SIB_ID._g5KdUVOgEe2KQc5QIsW97w;
		}
		// branch 'no'
		return SIB_ID._BmQbEVOgEe2KQc5QIsW97w;
	}
	// container for SIB 'PutToContext' putting some values to context.
	public SIB_ID execute_g5KdUVOgEe2KQc5QIsW97w(final Context ctx) {
		// put 'user'.
		ctx.submitter_QhzNUVOgEe2KQc5QIsW97w = Optional.ofNullable(ctx.bidding).map(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding::getuser).orElse(null);
	
		// branch 'success'
		return SIB_ID._BmQbEVOgEe2KQc5QIsW97w;
	}
	
}  

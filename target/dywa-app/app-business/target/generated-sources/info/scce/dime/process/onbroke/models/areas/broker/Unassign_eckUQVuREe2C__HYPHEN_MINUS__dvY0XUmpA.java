package info.scce.dime.process.onbroke.models.areas.broker;

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
public final class Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding;
		// direct dataflow variables.
		private de.ls5.dywa.generated.entity.onbroke.models.app.Assignment Retrieve_from_AssignmentSuccessRetrieved_T_ifQVuSEe2C__HYPHEN_MINUS__dvY0XUmpA;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_e0Us8VuREe2C__HYPHEN_MINUS__dvY0XUmpA,
	_FgZ8MVuSEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_HsvQ4VuSEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_T_JdsFuSEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_nah4UFuSEe2C__HYPHEN_MINUS__dvY0XUmpA,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController AssignmentController;

	@Inject
	public Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController AssignmentController) {
		this.beanManager = beanManager;
		this.AssignmentController = AssignmentController;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.bidding = bidding;
		
		return ctx;
	}

	public Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._FgZ8MVuSEe2C__HYPHEN_MINUS__dvY0XUmpA);
	}
	
	

	@Override
	public Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _e0Us8VuREe2C__HYPHEN_MINUS__dvY0XUmpA: {
					return execute_e0Us8VuREe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
				}
				case _FgZ8MVuSEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_FgZ8MVuSEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case _HsvQ4VuSEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_HsvQ4VuSEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case _T_JdsFuSEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_T_JdsFuSEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case _nah4UFuSEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_nah4UFuSEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
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
	public static class Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_e0Us8VuREe2C__HYPHEN_MINUS__dvY0XUmpA";
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
	public Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult execute_e0Us8VuREe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		return new Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult(new SuccessReturnImpl(ctx));
	}
	// container for SIB 'Set assigned' setting a new attribute value.
	public SIB_ID execute_FgZ8MVuSEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		ctx.bidding.setassigned(false);
		// branch 'success'
		return SIB_ID._HsvQ4VuSEe2C__HYPHEN_MINUS__dvY0XUmpA;
	}
	// container for SIB 'Set assigned' setting a new attribute value.
	public SIB_ID execute_HsvQ4VuSEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		Optional.ofNullable(ctx.bidding).map(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding::getoffer).orElse(null).setassigned(false);
		// branch 'success'
		return SIB_ID._T_JdsFuSEe2C__HYPHEN_MINUS__dvY0XUmpA;
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Assignment'.
	public SIB_ID execute_T_JdsFuSEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController domController = this.AssignmentController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Assignment searchObject = domController.createSearchObject("");
		searchObject.setbidding(ctx.bidding);
		final de.ls5.dywa.generated.entity.onbroke.models.app.Assignment result = domController.findFirstByProperties(searchObject);
		ctx.Retrieve_from_AssignmentSuccessRetrieved_T_ifQVuSEe2C__HYPHEN_MINUS__dvY0XUmpA = result;
		if (result == null) {
			// branch 'none found'
			return SIB_ID._e0Us8VuREe2C__HYPHEN_MINUS__dvY0XUmpA;
		}
		else {
			// branch 'success'
			return SIB_ID._nah4UFuSEe2C__HYPHEN_MINUS__dvY0XUmpA;
		}
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_nah4UFuSEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController domController = this.AssignmentController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.Assignment instanceToDelete = ctx.Retrieve_from_AssignmentSuccessRetrieved_T_ifQVuSEe2C__HYPHEN_MINUS__dvY0XUmpA;
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				instanceToDelete.setoffer(null);
				instanceToDelete.setbidding(null);
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}
		// branch 'deleted'
		return SIB_ID._e0Us8VuREe2C__HYPHEN_MINUS__dvY0XUmpA;
	}
	
}  

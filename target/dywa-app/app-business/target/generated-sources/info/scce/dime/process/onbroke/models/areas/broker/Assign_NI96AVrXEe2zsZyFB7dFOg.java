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
public final class Assign_NI96AVrXEe2zsZyFB7dFOg implements DIMEProcess {


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

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_NqQpMVrXEe2zsZyFB7dFOg,
	_im0isFrXEe2zsZyFB7dFOg,
	_uOpScVt8Ee249tGcS7DsBA,
	_IFCRkFuREe2C__HYPHEN_MINUS__dvY0XUmpA,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController AssignmentController;

	@Inject
	public Assign_NI96AVrXEe2zsZyFB7dFOg(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController AssignmentController) {
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

	public Assign_NI96AVrXEe2zsZyFB7dFOgResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._im0isFrXEe2zsZyFB7dFOg);
	}
	
	

	@Override
	public Assign_NI96AVrXEe2zsZyFB7dFOgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Assign_NI96AVrXEe2zsZyFB7dFOgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _NqQpMVrXEe2zsZyFB7dFOg: {
					return execute_NqQpMVrXEe2zsZyFB7dFOg(ctx);
				}
				case _im0isFrXEe2zsZyFB7dFOg: {
					curr = execute_im0isFrXEe2zsZyFB7dFOg(ctx);
					break;
				}
				case _uOpScVt8Ee249tGcS7DsBA: {
					curr = execute_uOpScVt8Ee249tGcS7DsBA(ctx);
					break;
				}
				case _IFCRkFuREe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_IFCRkFuREe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
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
	public static class Assign_NI96AVrXEe2zsZyFB7dFOgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public Assign_NI96AVrXEe2zsZyFB7dFOgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_NqQpMVrXEe2zsZyFB7dFOg";
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
	public Assign_NI96AVrXEe2zsZyFB7dFOgResult execute_NqQpMVrXEe2zsZyFB7dFOg(final Context ctx) {
		return new Assign_NI96AVrXEe2zsZyFB7dFOgResult(new SuccessReturnImpl(ctx));
	}
	// container for create SIB 'Create Assignment'.
	public SIB_ID execute_im0isFrXEe2zsZyFB7dFOg(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController domController = this.AssignmentController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.Assignment createdObj = domController.create(null);
	
		createdObj.setoffer(Optional.ofNullable(ctx.bidding).map(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding::getoffer).orElse(null));
		createdObj.setbidding(ctx.bidding);
	
	
		// branch 'success'
		return SIB_ID._uOpScVt8Ee249tGcS7DsBA;
	}
	// container for SIB 'Set assigned' setting a new attribute value.
	public SIB_ID execute_uOpScVt8Ee249tGcS7DsBA(final Context ctx) {
		ctx.bidding.setassigned(true);
		// branch 'success'
		return SIB_ID._IFCRkFuREe2C__HYPHEN_MINUS__dvY0XUmpA;
	}
	// container for SIB 'Set assigned' setting a new attribute value.
	public SIB_ID execute_IFCRkFuREe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		Optional.ofNullable(ctx.bidding).map(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding::getoffer).orElse(null).setassigned(true);
		// branch 'success'
		return SIB_ID._NqQpMVrXEe2zsZyFB7dFOg;
	}
	
}  

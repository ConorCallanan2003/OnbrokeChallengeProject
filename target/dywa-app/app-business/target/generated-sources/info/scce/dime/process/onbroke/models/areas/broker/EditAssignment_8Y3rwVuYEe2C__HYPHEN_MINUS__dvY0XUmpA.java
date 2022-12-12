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

public final class EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Bidding startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA != null) {
						result.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA, result.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA != null) {
						result.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA = contextTransformer.transform(this.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding EditAssignmentAssignThisBidding_XLxEQVxOEe2AfqRlXAmQBA;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_8qWdUVuYEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_yZYR4VuaEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_4ncWoVuaEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_q4yK0Vw1Ee2gxcFkjyzH4g,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA = bidding;
		ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA = bidding;
		ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA = bidding;
		
		return ctx;
	}

	public EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._yZYR4VuaEe2C__HYPHEN_MINUS__dvY0XUmpA);
	}
	
	
	public EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._yZYR4VuaEe2C__HYPHEN_MINUS__dvY0XUmpA);
	}

	@Override
	public EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_qeqTgVuZEe2C-dvY0XUmpA": return executeInternal(ctx, continue_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _8qWdUVuYEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					return execute_8qWdUVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
				}
				case _qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case _yZYR4VuaEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_yZYR4VuaEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case _4ncWoVuaEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_4ncWoVuaEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case _q4yK0Vw1Ee2gxcFkjyzH4g: {
					curr = execute_q4yK0Vw1Ee2gxcFkjyzH4g(ctx);
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
	public static class EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_8qWdUVuYEe2C__HYPHEN_MINUS__dvY0XUmpA";
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
	public EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult execute_8qWdUVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		return new EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult(new SuccessReturnImpl(ctx));
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB EditAssignment _qeqTgVuZEe2C-dvY0XUmpA
	private static class InputsForGUISIB_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA {
		public de.ls5.dywa.generated.rest.types.Bidding
		 bidding;
	}
	
	
	// container for GUI SIB 'EditAssignment'.
	public SIB_ID execute_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.BiddingREST inputsBiddingREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BiddingREST.class);
		
		final InputsForGUISIB_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA inputs = new InputsForGUISIB_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA();
		
		{
			de.ls5.dywa.generated.rest.types.Bidding
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Bidding obj = ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA;
			
			de.ls5.dywa.generated.rest.types.Bidding restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_EditAssignmentBiddingSelectivex1_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA
					restTO = inputsBiddingREST.read_EditAssignmentBiddingSelectivex1_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(obj, objectCache);
					}
					// EditAssignmentBiddingSelectivex1_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA
					de.ls5.dywa.generated.rest.types.EditAssignmentBiddingSelectivex1_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.bidding = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.broker.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA:_qeqTgVuZEe2C-dvY0XUmpA:_mOjJMVuZEe2C-dvY0XUmpA", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_qeqTgVuZEe2C-dvY0XUmpA", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_qeqTgVuZEe2C-dvY0XUmpA");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult result = (info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult) guiResult;
		if ("Assign".equals(result.getBranchName())) {
			if(result.getgui__afXv0VuaEe2C__HYPHEN_MINUS__dvY0XUmpAAssignReturn() != null) {
			ctx.EditAssignmentAssignThisBidding_XLxEQVxOEe2AfqRlXAmQBA = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__afXv0VuaEe2C__HYPHEN_MINUS__dvY0XUmpAAssignReturn().getThisBidding();
			}
			// branch 'Assign'
			return SIB_ID._4ncWoVuaEe2C__HYPHEN_MINUS__dvY0XUmpA;
		} else 
		if ("Cancel_Edit".equals(result.getBranchName())) {
			// branch 'Cancel Edit'
			return SIB_ID._q4yK0Vw1Ee2gxcFkjyzH4g;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
		}
	}
	// container for graph abstraction 'Unassign' and sub process 'Unassign'.
	public SIB_ID execute_yZYR4VuaEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.broker.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA.class);
	
		final info.scce.dime.process.onbroke.models.areas.broker.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult result = instance.execute(false, ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._qeqTgVuZEe2C__HYPHEN_MINUS__dvY0XUmpA;
		}
			default: throw new IllegalStateException("SIB 'Unassign' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'Assign' and sub process 'Assign'.
	public SIB_ID execute_4ncWoVuaEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.class);
	
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.Assign_NI96AVrXEe2zsZyFB7dFOgResult result = instance.execute(false, ctx.EditAssignmentAssignThisBidding_XLxEQVxOEe2AfqRlXAmQBA);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._8qWdUVuYEe2C__HYPHEN_MINUS__dvY0XUmpA;
		}
			default: throw new IllegalStateException("SIB 'Assign' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'Assign' and sub process 'Assign'.
	public SIB_ID execute_q4yK0Vw1Ee2gxcFkjyzH4g(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.class);
	
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.Assign_NI96AVrXEe2zsZyFB7dFOgResult result = instance.execute(false, ctx.startBidding_AvOoAVuZEe2C__HYPHEN_MINUS__dvY0XUmpA);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._8qWdUVuYEe2C__HYPHEN_MINUS__dvY0XUmpA;
		}
			default: throw new IllegalStateException("SIB 'Assign' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  

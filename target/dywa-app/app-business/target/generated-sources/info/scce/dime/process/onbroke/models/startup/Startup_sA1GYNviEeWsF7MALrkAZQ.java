package info.scce.dime.process.onbroke.models.startup;

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
public final class Startup_sA1GYNviEeWsF7MALrkAZQ implements DIMEProcess {


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


		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_PXMhsNzNEeWtAOZsxPLKSA,
	_sBOvANviEeWsF7MALrkAZQ,
	_n1V1EUt4Ee22z989Tp8YUw,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController;

	@Inject
	public Startup_sA1GYNviEeWsF7MALrkAZQ(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController) {
		this.beanManager = beanManager;
		this.UserController = UserController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public Startup_sA1GYNviEeWsF7MALrkAZQResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._PXMhsNzNEeWtAOZsxPLKSA);
	}
	
	

	@Override
	public Startup_sA1GYNviEeWsF7MALrkAZQResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Startup_sA1GYNviEeWsF7MALrkAZQResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _PXMhsNzNEeWtAOZsxPLKSA: {
					curr = execute_PXMhsNzNEeWtAOZsxPLKSA(ctx);
					break;
				}
				case _sBOvANviEeWsF7MALrkAZQ: {
					return execute_sBOvANviEeWsF7MALrkAZQ(ctx);
				}
				case _n1V1EUt4Ee22z989Tp8YUw: {
					curr = execute_n1V1EUt4Ee22z989Tp8YUw(ctx);
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
	public static class Startup_sA1GYNviEeWsF7MALrkAZQResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public Startup_sA1GYNviEeWsF7MALrkAZQResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_sBOvANviEeWsF7MALrkAZQ";
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
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve Users'.
	public SIB_ID execute_PXMhsNzNEeWtAOZsxPLKSA(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.User searchObject = domController.createSearchObject("");
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.User> result = domController.findByProperties(searchObject);
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._n1V1EUt4Ee22z989Tp8YUw;
		}
		else {
			// branch 'success'
			return SIB_ID._sBOvANviEeWsF7MALrkAZQ;
		}
	}
	// container for graph i/o 'success'.
	public Startup_sA1GYNviEeWsF7MALrkAZQResult execute_sBOvANviEeWsF7MALrkAZQ(final Context ctx) {
		return new Startup_sA1GYNviEeWsF7MALrkAZQResult(new SuccessReturnImpl(ctx));
	}
	// container for graph abstraction 'CreateTestData' and sub process 'CreateTestData'.
	public SIB_ID execute_n1V1EUt4Ee22z989Tp8YUw(final Context ctx) {
		final info.scce.dime.process.onbroke.models.startup.model__HYPHEN_MINUS__gen.CreateTestData_zn_1sEt2Ee22z989Tp8YUw instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.startup.model__HYPHEN_MINUS__gen.CreateTestData_zn_1sEt2Ee22z989Tp8YUw.class);
	
		final info.scce.dime.process.onbroke.models.startup.model__HYPHEN_MINUS__gen.CreateTestData_zn_1sEt2Ee22z989Tp8YUw.CreateTestData_zn_1sEt2Ee22z989Tp8YUwResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._sBOvANviEeWsF7MALrkAZQ;
		}
			default: throw new IllegalStateException("SIB 'CreateTestData' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  

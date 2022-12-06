package info.scce.dime.process.onbroke.models.home;

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

public final class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg implements DIMEProcess {


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
	_4dwC1VFMEe2J0bu3ffrh5w,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._4dwC1VFMEe2J0bu3ffrh5w);
	}
	
	
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._4dwC1VFMEe2J0bu3ffrh5w);
	}

	@Override
	public Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_4dwC1VFMEe2J0bu3ffrh5w": return executeInternal(ctx, continue_4dwC1VFMEe2J0bu3ffrh5w(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _4dwC1VFMEe2J0bu3ffrh5w: {
					curr = execute_4dwC1VFMEe2J0bu3ffrh5w(ctx);
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
	public static class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		

	}
	
	// model branches.


	// sibs
	// guard container for guarded process 'ShowInternalArea' and sub process 'ShowInternalArea'.
	public SIB_ID execute_4dwC1VFMEe2J0bu3ffrh5w(final Context ctx) {
		//check authentication
		final Subject shiroSubj = SecurityUtils.getSubject();
		if (!shiroSubj.isAuthenticated()) {
			final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.home.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg:_4dwC1VFMEe2J0bu3ffrh5w", ctx);
			ctx.callStack.getCallFrames().add(currentFrame);
			GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_4dwC1VFMEe2J0bu3ffrh5w");
			sig.setStatus(401);
			throw sig;
		}
	
		final info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w.class);
	
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.home.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg:_4dwC1VFMEe2J0bu3ffrh5w", ctx);
		ctx.callStack.getCallFrames().add(currentFrame);
		ctx.callStack.setAuthenticationRequired(true);
	
		final info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult result = instance.execute(ctx.callStack );
	
		return continue_4dwC1VFMEe2J0bu3ffrh5w(ctx, result);
	}
	
	public SIB_ID continue_4dwC1VFMEe2J0bu3ffrh5w(Context ctx, Object slgResult) {
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
	
		if(slgResult == null) {
			//re-execute the guard container
			return execute_4dwC1VFMEe2J0bu3ffrh5w(ctx);
		}
	
		final info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult result = (info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult) slgResult;
	
		switch (result.getBranchName()) {
			default: throw new IllegalStateException("SIB 'ShowInternalArea' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
}  

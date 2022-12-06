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

@info.scce.dime.process.RequiresDI
public final class ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w implements DIMEProcess {


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
		private de.ls5.dywa.generated.entity.onbroke.models.app.User user;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_6dpqkFE3Ee2Vgcav4Znc_w,
	_CE03UFE4Ee2Vgcav4Znc_w,
	_p7PywVE4Ee2Vgcav4Znc_w,
	_rcx28FE4Ee2Vgcav4Znc_w,
	_svmJsVE4Ee2Vgcav4Znc_w,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController;

	@Inject
	public ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController) {
		this.beanManager = beanManager;
		this.BaseUserController = BaseUserController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._6dpqkFE3Ee2Vgcav4Znc_w);
	}
	
	
	public ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._6dpqkFE3Ee2Vgcav4Znc_w);
	}

	@Override
	public ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
		case "_p7PywVE4Ee2Vgcav4Znc_w": return executeInternal(ctx, continue_p7PywVE4Ee2Vgcav4Znc_w(ctx, slgResult));
		case "_rcx28FE4Ee2Vgcav4Znc_w": return executeInternal(ctx, continue_rcx28FE4Ee2Vgcav4Znc_w(ctx, slgResult));
		case "_svmJsVE4Ee2Vgcav4Znc_w": return executeInternal(ctx, continue_svmJsVE4Ee2Vgcav4Znc_w(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _6dpqkFE3Ee2Vgcav4Znc_w: {
					curr = execute_6dpqkFE3Ee2Vgcav4Znc_w(ctx);
					break;
				}
				case _CE03UFE4Ee2Vgcav4Znc_w: {
					curr = execute_CE03UFE4Ee2Vgcav4Znc_w(ctx);
					break;
				}
				case _p7PywVE4Ee2Vgcav4Znc_w: {
					curr = execute_p7PywVE4Ee2Vgcav4Znc_w(ctx);
					break;
				}
				case _rcx28FE4Ee2Vgcav4Znc_w: {
					curr = execute_rcx28FE4Ee2Vgcav4Znc_w(ctx);
					break;
				}
				case _svmJsVE4Ee2Vgcav4Znc_w: {
					curr = execute_svmJsVE4Ee2Vgcav4Znc_w(ctx);
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
	public static class ShowInternalArea_xEG9AUH8Ee26p7mBymqW2wResult implements info.scce.dime.process.DIMEProcessResult<Void> {
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

	private <T> T getConcreteUser(final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser subject, final Class<T> userType) {
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.User concreteUser: subject.getuser_User()) {
			if (userType.isAssignableFrom(concreteUser.getClass())) {
				return (T)concreteUser;
			}
		}
		throw new IllegalStateException("Did not find concrete user of type '" + userType.getSimpleName() + "'");
	}

	// sibs
	// container for retrieve user sib 'Retrieve Current User'.
	public SIB_ID execute_6dpqkFE3Ee2Vgcav4Znc_w(final Context ctx) {
		final Subject shiroSubj = SecurityUtils.getSubject();
	
		if (!shiroSubj.isAuthenticated()) {
			GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_6dpqkFE3Ee2Vgcav4Znc_w");
			sig.setStatus(401);
			throw sig;
		}
	
		final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController subjectController = this.BaseUserController;
	
		final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser subject = subjectController.read((Long)shiroSubj.getPrincipal());
		final de.ls5.dywa.generated.entity.onbroke.models.app.User concreteUser = getConcreteUser(subject, de.ls5.dywa.generated.entity.onbroke.models.app.User.class);
		ctx.user = concreteUser.getdywaSwitchedTo() != null ? concreteUser.getdywaSwitchedTo() : concreteUser;
		// branch 'success'
		return SIB_ID._CE03UFE4Ee2Vgcav4Znc_w;
	}
	// container for switch enum SIB 'Switch UserRole'.
	public SIB_ID execute_CE03UFE4Ee2Vgcav4Znc_w(final Context ctx) {
		if(Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getrole).orElse(null) == null) {
			// branch 'else'
			return SIB_ID._svmJsVE4Ee2Vgcav4Znc_w;
		}
	
		switch(Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getrole).orElse(null).toString()){
			case "admin": // branch 'admin'
			return SIB_ID._p7PywVE4Ee2Vgcav4Znc_w;
			case "broker": // branch 'broker'
			return SIB_ID._rcx28FE4Ee2Vgcav4Znc_w;
			default : // branch 'else'
			return SIB_ID._svmJsVE4Ee2Vgcav4Znc_w;
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB AdminAreaHeader _p7PywVE4Ee2Vgcav4Znc_w
	private static class InputsForGUISIB_p7PywVE4Ee2Vgcav4Znc_w {
	}
	
	
	// container for GUI SIB 'AdminAreaHeader'.
	public SIB_ID execute_p7PywVE4Ee2Vgcav4Znc_w(final Context ctx) {
	
		
		final InputsForGUISIB_p7PywVE4Ee2Vgcav4Znc_w inputs = new InputsForGUISIB_p7PywVE4Ee2Vgcav4Znc_w();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w:_p7PywVE4Ee2Vgcav4Znc_w:_ikwGUVE4Ee2Vgcav4Znc_w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_p7PywVE4Ee2Vgcav4Znc_w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_p7PywVE4Ee2Vgcav4Znc_w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_p7PywVE4Ee2Vgcav4Znc_w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		// unspecified branch, show same GUI again
		return execute_p7PywVE4Ee2Vgcav4Znc_w(ctx);
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB BrokerAreaHeader _rcx28FE4Ee2Vgcav4Znc_w
	private static class InputsForGUISIB_rcx28FE4Ee2Vgcav4Znc_w {
	}
	
	
	// container for GUI SIB 'BrokerAreaHeader'.
	public SIB_ID execute_rcx28FE4Ee2Vgcav4Znc_w(final Context ctx) {
	
		
		final InputsForGUISIB_rcx28FE4Ee2Vgcav4Znc_w inputs = new InputsForGUISIB_rcx28FE4Ee2Vgcav4Znc_w();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w:_rcx28FE4Ee2Vgcav4Znc_w:_kylP0VE4Ee2Vgcav4Znc_w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_rcx28FE4Ee2Vgcav4Znc_w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_rcx28FE4Ee2Vgcav4Znc_w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_rcx28FE4Ee2Vgcav4Znc_w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		// unspecified branch, show same GUI again
		return execute_rcx28FE4Ee2Vgcav4Znc_w(ctx);
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB UserAreaHeader _svmJsVE4Ee2Vgcav4Znc_w
	private static class InputsForGUISIB_svmJsVE4Ee2Vgcav4Znc_w {
	}
	
	
	// container for GUI SIB 'UserAreaHeader'.
	public SIB_ID execute_svmJsVE4Ee2Vgcav4Znc_w(final Context ctx) {
	
		
		final InputsForGUISIB_svmJsVE4Ee2Vgcav4Znc_w inputs = new InputsForGUISIB_svmJsVE4Ee2Vgcav4Znc_w();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.home.ShowInternalArea_xEG9AUH8Ee26p7mBymqW2w:_svmJsVE4Ee2Vgcav4Znc_w:_oEUtYVE4Ee2Vgcav4Znc_w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_svmJsVE4Ee2Vgcav4Znc_w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_svmJsVE4Ee2Vgcav4Znc_w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_svmJsVE4Ee2Vgcav4Znc_w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		// unspecified branch, show same GUI again
		return execute_svmJsVE4Ee2Vgcav4Znc_w(ctx);
	}
	
}  

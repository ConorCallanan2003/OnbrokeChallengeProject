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

public final class ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private de.ls5.dywa.generated.rest.types.Bidding startBidding_awmKUVOlEe2KQc5QIsW97w;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.startBidding_awmKUVOlEe2KQc5QIsW97w != null) {
						result.startBidding_awmKUVOlEe2KQc5QIsW97w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.startBidding_awmKUVOlEe2KQc5QIsW97w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.startBidding_awmKUVOlEe2KQc5QIsW97w, result.startBidding_awmKUVOlEe2KQc5QIsW97w, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.startBidding_awmKUVOlEe2KQc5QIsW97w != null) {
						result.startBidding_awmKUVOlEe2KQc5QIsW97w = contextTransformer.transform(this.startBidding_awmKUVOlEe2KQc5QIsW97w);
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
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding startBidding_awmKUVOlEe2KQc5QIsW97w;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_Yuo5oVOlEe2KQc5QIsW97w,
	_BCILkVOmEe2KQc5QIsW97w,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startBidding_awmKUVOlEe2KQc5QIsW97w = bidding;
		
		return ctx;
	}

	public ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._Yuo5oVOlEe2KQc5QIsW97w);
	}
	
	
	public ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult execute(ProcessCallFrame callStack ,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding) {
		final Context ctx = createContext(bidding);
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._Yuo5oVOlEe2KQc5QIsW97w);
	}

	@Override
	public ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_Yuo5oVOlEe2KQc5QIsW97w": return executeInternal(ctx, continue_Yuo5oVOlEe2KQc5QIsW97w(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _Yuo5oVOlEe2KQc5QIsW97w: {
					curr = execute_Yuo5oVOlEe2KQc5QIsW97w(ctx);
					break;
				}
				case _BCILkVOmEe2KQc5QIsW97w: {
					return execute_BCILkVOmEe2KQc5QIsW97w(ctx);
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
	public static class ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private BackReturn back;
		
		public ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult(BackReturn back) {
			this.branchName = "back";
			this.branchId = "_BCILkVOmEe2KQc5QIsW97w";
			this.back = back;
		}
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		
		public BackReturn getBackReturn() {
			return back;
		}

	}
	
	// model branches.
		/**
		 * Interface definition for return type of branch <code>back</code>.
		 */
		public interface BackReturn {
		}
	
		/**
		 * Return type of branch <code>back</code> accessing the 
		 * corresponding values in the process context, instead of storing
		 * the values locally.
		 */
		static class BackReturnImpl implements BackReturn {

			private final Context ctx;

	        BackReturnImpl(Context ctx) {
	            this.ctx = ctx;
	        }

		}
		


	// sibs
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB BiddingDetails _Yuo5oVOlEe2KQc5QIsW97w
	private static class InputsForGUISIB_Yuo5oVOlEe2KQc5QIsW97w {
		public de.ls5.dywa.generated.rest.types.Bidding
		 bidding;
	}
	
	
	// container for GUI SIB 'BiddingDetails'.
	public SIB_ID execute_Yuo5oVOlEe2KQc5QIsW97w(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.BiddingREST inputsBiddingREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BiddingREST.class);
		
		final InputsForGUISIB_Yuo5oVOlEe2KQc5QIsW97w inputs = new InputsForGUISIB_Yuo5oVOlEe2KQc5QIsW97w();
		
		{
			de.ls5.dywa.generated.rest.types.Bidding
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Bidding obj = ctx.startBidding_awmKUVOlEe2KQc5QIsW97w;
			
			de.ls5.dywa.generated.rest.types.Bidding restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_BiddingDetailsBiddingSelectivex1_zSAVgVOjEe2KQc5QIsW97w
					restTO = inputsBiddingREST.read_BiddingDetailsBiddingSelectivex1_zSAVgVOjEe2KQc5QIsW97w(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(obj, objectCache);
					}
					// BiddingDetailsBiddingSelectivex1_zSAVgVOjEe2KQc5QIsW97w
					de.ls5.dywa.generated.rest.types.BiddingDetailsBiddingSelectivex1_zSAVgVOjEe2KQc5QIsW97w.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.bidding = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w:_Yuo5oVOlEe2KQc5QIsW97w:_zSAVgVOjEe2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_Yuo5oVOlEe2KQc5QIsW97w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_Yuo5oVOlEe2KQc5QIsW97w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_Yuo5oVOlEe2KQc5QIsW97w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.util.biddingdetails.BiddingDetails_zSAVgVOjEe2KQc5QIsW97wResult result = (info.scce.dime.gui.onbroke.models.util.biddingdetails.BiddingDetails_zSAVgVOjEe2KQc5QIsW97wResult) guiResult;
		if ("Create_issue".equals(result.getBranchName())) {
			// branch 'Create issue'
			return SIB_ID._Yuo5oVOlEe2KQc5QIsW97w;
		} else 
		if ("Show_issue".equals(result.getBranchName())) {
			if(result.getgui__bJxmsVN9Ee2KQc5QIsW97wShow_issueReturn() != null) {
			}
			// branch 'Show issue'
			return SIB_ID._Yuo5oVOlEe2KQc5QIsW97w;
		} else 
		if ("Resolve_issue".equals(result.getBranchName())) {
			if(result.getgui__V3lGkVOdEe2KQc5QIsW97wResolve_issueReturn() != null) {
			}
			// branch 'Resolve issue'
			return SIB_ID._Yuo5oVOlEe2KQc5QIsW97w;
		} else 
		if ("Unresolve_issue".equals(result.getBranchName())) {
			if(result.getgui__dDPcAVOdEe2KQc5QIsW97wUnresolve_issueReturn() != null) {
			}
			// branch 'Unresolve issue'
			return SIB_ID._Yuo5oVOlEe2KQc5QIsW97w;
		} else 
		if ("Back".equals(result.getBranchName())) {
			// branch 'Back'
			return SIB_ID._BCILkVOmEe2KQc5QIsW97w;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_Yuo5oVOlEe2KQc5QIsW97w(ctx);
		}
	}
	// container for graph i/o 'back'.
	public ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult execute_BCILkVOmEe2KQc5QIsW97w(final Context ctx) {
		return new ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult(new BackReturnImpl(ctx));
	}
	
}  

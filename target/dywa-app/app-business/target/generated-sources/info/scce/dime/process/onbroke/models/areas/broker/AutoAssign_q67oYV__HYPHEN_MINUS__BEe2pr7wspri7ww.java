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

public final class AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7ww implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				private int counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA = 0;
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA = ctx.counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA;

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;



					result.counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA = this.counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA;

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

		// context variables.
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer;
		// direct dataflow variables.
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> startOffer_6kXi0WErEe22faBh7MAS9A = new ArrayList<>();
		// index variables of iterate sibs.
		private int counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA = 0;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_rKRr8V__HYPHEN_MINUS__BEe2pr7wspri7ww,
	_qPcR4WEiEe2Vwqqo0dxUZA,
	_mqiLQWEjEe2Vwqqo0dxUZA,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7ww(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> offer) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value39 = offer;
		if (value39 != null) { // prevent null in lists
		ctx.startOffer_6kXi0WErEe22faBh7MAS9A = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value39);
		}
		
		return ctx;
	}

	public AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult execute(boolean isAuthenticationRequired,List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> offer) {
		final Context ctx = createContext(offer);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._mqiLQWEjEe2Vwqqo0dxUZA);
	}
	
	

	@Override
	public AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _rKRr8V__HYPHEN_MINUS__BEe2pr7wspri7ww: {
					return execute_rKRr8V__HYPHEN_MINUS__BEe2pr7wspri7ww(ctx);
				}
				case _qPcR4WEiEe2Vwqqo0dxUZA: {
					curr = execute_qPcR4WEiEe2Vwqqo0dxUZA(ctx);
					break;
				}
				case _mqiLQWEjEe2Vwqqo0dxUZA: {
					curr = execute_mqiLQWEjEe2Vwqqo0dxUZA(ctx);
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
	public static class AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_rKRr8V__HYPHEN_MINUS__BEe2pr7wspri7ww";
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
	public AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult execute_rKRr8V__HYPHEN_MINUS__BEe2pr7wspri7ww(final Context ctx) {
		return new AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult(new SuccessReturnImpl(ctx));
	}
	// container for graph abstraction 'Assign' and sub process 'Assign'.
	public SIB_ID execute_qPcR4WEiEe2Vwqqo0dxUZA(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.class);
	
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.Assign_NI96AVrXEe2zsZyFB7dFOgResult result = instance.execute(false, Optional.ofNullable(ctx.offer).map(de.ls5.dywa.generated.entity.onbroke.models.app.Offer::getbiddings_Bidding).map(List::stream).flatMap(Stream::findFirst).orElse(null));
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._mqiLQWEjEe2Vwqqo0dxUZA;
		}
			default: throw new IllegalStateException("SIB 'Assign' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for iterate complex SIB 'Iterate Offers'.
	public SIB_ID execute_mqiLQWEjEe2Vwqqo0dxUZA(final Context ctx) {
		final int pos = ctx.counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA++;
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> list = ctx.startOffer_6kXi0WErEe22faBh7MAS9A;
		if(list != null && pos < list.size()) {
			ctx.offer = ctx.startOffer_6kXi0WErEe22faBh7MAS9A.get(pos);
			// branch 'next'
			return SIB_ID._qPcR4WEiEe2Vwqqo0dxUZA;
		}
		else {
			ctx.counterIterate_Offers_mqiLQWEjEe2Vwqqo0dxUZA = 0;
			// branch 'exit'
			return SIB_ID._rKRr8V__HYPHEN_MINUS__BEe2pr7wspri7ww;
		}
		
	}
	
}  

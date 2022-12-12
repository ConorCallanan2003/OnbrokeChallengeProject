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
public final class InitBrokerArea_N73BAFGLEe2J0bu3ffrh5w implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				// end direct dataflow variables

				// begin index variables of iterate sibs
				private int counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w = 0;
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w = ctx.counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w;

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;



					result.counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w = this.counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w;

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
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> approvedOffers_0JQJIVGLEe2J0bu3ffrh5w = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> offers_2EjYMVGLEe2J0bu3ffrh5w = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> biddings_3NYBcVGLEe2J0bu3ffrh5w = new ArrayList<>();
		// direct dataflow variables.
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> Retrieve_from_OfferSuccessRetrieved_VVjycVGLEe2J0bu3ffrh5w = new ArrayList<>();
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer Iterate_OffersNextElement_bOWKwVGLEe2J0bu3ffrh5w;
		// index variables of iterate sibs.
		private int counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w = 0;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_OLk4AVGLEe2J0bu3ffrh5w,
	_VVWXEVGLEe2J0bu3ffrh5w,
	_bOG6MFGLEe2J0bu3ffrh5w,
	_ordQIVGLEe2J0bu3ffrh5w,
	_wKmiQVGLEe2J0bu3ffrh5w,
	___HYPHEN_MINUS__pAskVGLEe2J0bu3ffrh5w,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;

	@Inject
	public InitBrokerArea_N73BAFGLEe2J0bu3ffrh5w(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController, de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController) {
		this.beanManager = beanManager;
		this.OfferController = OfferController;
		this.BiddingController = BiddingController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._VVWXEVGLEe2J0bu3ffrh5w);
	}
	
	

	@Override
	public InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _OLk4AVGLEe2J0bu3ffrh5w: {
					return execute_OLk4AVGLEe2J0bu3ffrh5w(ctx);
				}
				case _VVWXEVGLEe2J0bu3ffrh5w: {
					curr = execute_VVWXEVGLEe2J0bu3ffrh5w(ctx);
					break;
				}
				case _bOG6MFGLEe2J0bu3ffrh5w: {
					curr = execute_bOG6MFGLEe2J0bu3ffrh5w(ctx);
					break;
				}
				case _ordQIVGLEe2J0bu3ffrh5w: {
					curr = execute_ordQIVGLEe2J0bu3ffrh5w(ctx);
					break;
				}
				case _wKmiQVGLEe2J0bu3ffrh5w: {
					curr = execute_wKmiQVGLEe2J0bu3ffrh5w(ctx);
					break;
				}
				case ___HYPHEN_MINUS__pAskVGLEe2J0bu3ffrh5w: {
					curr = execute___HYPHEN_MINUS__pAskVGLEe2J0bu3ffrh5w(ctx);
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
	public static class InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_OLk4AVGLEe2J0bu3ffrh5w";
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
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> getApprovedOffers();
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> getOffers();
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> getBiddings();
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

			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> getApprovedOffers() {
				return new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(ctx.approvedOffers_0JQJIVGLEe2J0bu3ffrh5w);
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> getOffers() {
				return new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(ctx.offers_2EjYMVGLEe2J0bu3ffrh5w);
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> getBiddings() {
				return new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding>(ctx.biddings_3NYBcVGLEe2J0bu3ffrh5w);
			}
		}
		


	// sibs
	// container for graph i/o 'success'.
	public InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult execute_OLk4AVGLEe2J0bu3ffrh5w(final Context ctx) {
		return new InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult(new SuccessReturnImpl(ctx));
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Offer'.
	public SIB_ID execute_VVWXEVGLEe2J0bu3ffrh5w(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer searchObject = domController.createSearchObject("");
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value35 = result;
		if (value35 != null) { // prevent null in lists
		ctx.offers_2EjYMVGLEe2J0bu3ffrh5w = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value35);
		}
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value36 = result;
		if (value36 != null) { // prevent null in lists
		ctx.Retrieve_from_OfferSuccessRetrieved_VVjycVGLEe2J0bu3ffrh5w = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value36);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID.___HYPHEN_MINUS__pAskVGLEe2J0bu3ffrh5w;
		}
		else {
			// branch 'success'
			return SIB_ID._bOG6MFGLEe2J0bu3ffrh5w;
		}
	}
	// container for iterate complex SIB 'Iterate Offers'.
	public SIB_ID execute_bOG6MFGLEe2J0bu3ffrh5w(final Context ctx) {
		final int pos = ctx.counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w++;
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> list = ctx.Retrieve_from_OfferSuccessRetrieved_VVjycVGLEe2J0bu3ffrh5w;
		if(list != null && pos < list.size()) {
			ctx.Iterate_OffersNextElement_bOWKwVGLEe2J0bu3ffrh5w = ctx.Retrieve_from_OfferSuccessRetrieved_VVjycVGLEe2J0bu3ffrh5w.get(pos);
			ctx.offer = ctx.Retrieve_from_OfferSuccessRetrieved_VVjycVGLEe2J0bu3ffrh5w.get(pos);
			// branch 'next'
			return SIB_ID._ordQIVGLEe2J0bu3ffrh5w;
		}
		else {
			ctx.counterIterate_Offers_bOG6MFGLEe2J0bu3ffrh5w = 0;
			// branch 'exit'
			return SIB_ID.___HYPHEN_MINUS__pAskVGLEe2J0bu3ffrh5w;
		}
		
	}
	// container for switch enum SIB 'Switch DecisionState'.
	public SIB_ID execute_ordQIVGLEe2J0bu3ffrh5w(final Context ctx) {
		if(Optional.ofNullable(ctx.offer).map(de.ls5.dywa.generated.entity.onbroke.models.app.Offer::getdecision).map(de.ls5.dywa.generated.entity.onbroke.models.app.Decision::getstate).orElse(null) == null) {
			// branch 'else'
			return SIB_ID._bOG6MFGLEe2J0bu3ffrh5w;
		}
	
		switch(Optional.ofNullable(ctx.offer).map(de.ls5.dywa.generated.entity.onbroke.models.app.Offer::getdecision).map(de.ls5.dywa.generated.entity.onbroke.models.app.Decision::getstate).orElse(null).toString()){
			case "approved": // branch 'approved'
			return SIB_ID._wKmiQVGLEe2J0bu3ffrh5w;
			default : // branch 'else'
			return SIB_ID._bOG6MFGLEe2J0bu3ffrh5w;
		}
	}
	// container for SIB 'PutToContext' putting some values to context.
	public SIB_ID execute_wKmiQVGLEe2J0bu3ffrh5w(final Context ctx) {
		// put 'offer'.
		de.ls5.dywa.generated.entity.onbroke.models.app.Offer value37 = ctx.Iterate_OffersNextElement_bOWKwVGLEe2J0bu3ffrh5w;
		if (value37 != null) { // prevent null in lists
		ctx.approvedOffers_0JQJIVGLEe2J0bu3ffrh5w.add(value37);
		}
	
		// branch 'success'
		return SIB_ID._bOG6MFGLEe2J0bu3ffrh5w;
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Bidding'.
	public SIB_ID execute___HYPHEN_MINUS__pAskVGLEe2J0bu3ffrh5w(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding searchObject = domController.createSearchObject("");
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> value38 = result;
		if (value38 != null) { // prevent null in lists
		ctx.biddings_3NYBcVGLEe2J0bu3ffrh5w = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding>(value38);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._OLk4AVGLEe2J0bu3ffrh5w;
		}
		else {
			// branch 'success'
			return SIB_ID._OLk4AVGLEe2J0bu3ffrh5w;
		}
	}
	
}  

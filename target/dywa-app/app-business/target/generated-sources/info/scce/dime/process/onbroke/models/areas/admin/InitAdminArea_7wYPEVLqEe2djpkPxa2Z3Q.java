package info.scce.dime.process.onbroke.models.areas.admin;

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
public final class InitAdminArea_7wYPEVLqEe2djpkPxa2Z3Q implements DIMEProcess {


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
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> RetrieveTemplatesSuccessFeaturesForOffer_9DDX71LqEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> RetrieveTemplatesSuccessFeaturesForBidding_9DDX8lLqEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.User> Retrieve_from_UserSuccessRetrieved__9wOcVLqEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> Retrieve_from_OfferSuccessRetrieved_EumHQVLrEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> Retrieve_from_BiddingSuccessRetrieved_JL7OMVLrEe2djpkPxa2Z3Q = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_8B2ZkVLqEe2djpkPxa2Z3Q,
	_9DDX4VLqEe2djpkPxa2Z3Q,
	__9l2YVLqEe2djpkPxa2Z3Q,
	_EubIIVLrEe2djpkPxa2Z3Q,
	_JLvA8VLrEe2djpkPxa2Z3Q,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;

	@Inject
	public InitAdminArea_7wYPEVLqEe2djpkPxa2Z3Q(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController, de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController, de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController) {
		this.beanManager = beanManager;
		this.UserController = UserController;
		this.OfferController = OfferController;
		this.BiddingController = BiddingController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._9DDX4VLqEe2djpkPxa2Z3Q);
	}
	
	

	@Override
	public InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _8B2ZkVLqEe2djpkPxa2Z3Q: {
					return execute_8B2ZkVLqEe2djpkPxa2Z3Q(ctx);
				}
				case _9DDX4VLqEe2djpkPxa2Z3Q: {
					curr = execute_9DDX4VLqEe2djpkPxa2Z3Q(ctx);
					break;
				}
				case __9l2YVLqEe2djpkPxa2Z3Q: {
					curr = execute__9l2YVLqEe2djpkPxa2Z3Q(ctx);
					break;
				}
				case _EubIIVLrEe2djpkPxa2Z3Q: {
					curr = execute_EubIIVLrEe2djpkPxa2Z3Q(ctx);
					break;
				}
				case _JLvA8VLrEe2djpkPxa2Z3Q: {
					curr = execute_JLvA8VLrEe2djpkPxa2Z3Q(ctx);
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
	public static class InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_8B2ZkVLqEe2djpkPxa2Z3Q";
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
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getFeaturesForOffer();
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getFeaturesForBidding();
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.User> getUsers();
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

			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getFeaturesForOffer() {
				return ctx.RetrieveTemplatesSuccessFeaturesForOffer_9DDX71LqEe2djpkPxa2Z3Q;
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getFeaturesForBidding() {
				return ctx.RetrieveTemplatesSuccessFeaturesForBidding_9DDX8lLqEe2djpkPxa2Z3Q;
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.User> getUsers() {
				return ctx.Retrieve_from_UserSuccessRetrieved__9wOcVLqEe2djpkPxa2Z3Q;
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> getOffers() {
				return ctx.Retrieve_from_OfferSuccessRetrieved_EumHQVLrEe2djpkPxa2Z3Q;
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> getBiddings() {
				return ctx.Retrieve_from_BiddingSuccessRetrieved_JL7OMVLrEe2djpkPxa2Z3Q;
			}
		}
		


	// sibs
	// container for graph i/o 'success'.
	public InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult execute_8B2ZkVLqEe2djpkPxa2Z3Q(final Context ctx) {
		return new InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult(new SuccessReturnImpl(ctx));
	}
	// container for graph abstraction 'RetrieveTemplates' and sub process 'RetrieveFeatureTemplates'.
	public SIB_ID execute_9DDX4VLqEe2djpkPxa2Z3Q(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.admin.RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3Q instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.admin.RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3Q.class);
	
		final info.scce.dime.process.onbroke.models.areas.admin.RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3Q.RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value16 = result.getSuccessReturn().getFeaturesForOffer();
			if (value16 != null) { // prevent null in lists
			ctx.RetrieveTemplatesSuccessFeaturesForOffer_9DDX71LqEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value16);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value17 = result.getSuccessReturn().getFeaturesForBidding();
			if (value17 != null) { // prevent null in lists
			ctx.RetrieveTemplatesSuccessFeaturesForBidding_9DDX8lLqEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value17);
			}
			// branch 'success'
			return SIB_ID.__9l2YVLqEe2djpkPxa2Z3Q;
		}
			default: throw new IllegalStateException("SIB 'RetrieveTemplates' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from User'.
	public SIB_ID execute__9l2YVLqEe2djpkPxa2Z3Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.User searchObject = domController.createSearchObject("");
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.User> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.User> value18 = result;
		if (value18 != null) { // prevent null in lists
		ctx.Retrieve_from_UserSuccessRetrieved__9wOcVLqEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.User>(value18);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._EubIIVLrEe2djpkPxa2Z3Q;
		}
		else {
			// branch 'success'
			return SIB_ID._EubIIVLrEe2djpkPxa2Z3Q;
		}
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Offer'.
	public SIB_ID execute_EubIIVLrEe2djpkPxa2Z3Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer searchObject = domController.createSearchObject("");
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value19 = result;
		if (value19 != null) { // prevent null in lists
		ctx.Retrieve_from_OfferSuccessRetrieved_EumHQVLrEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value19);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._JLvA8VLrEe2djpkPxa2Z3Q;
		}
		else {
			// branch 'success'
			return SIB_ID._JLvA8VLrEe2djpkPxa2Z3Q;
		}
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Bidding'.
	public SIB_ID execute_JLvA8VLrEe2djpkPxa2Z3Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController domController = this.BiddingController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding searchObject = domController.createSearchObject("");
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> value20 = result;
		if (value20 != null) { // prevent null in lists
		ctx.Retrieve_from_BiddingSuccessRetrieved_JL7OMVLrEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding>(value20);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._8B2ZkVLqEe2djpkPxa2Z3Q;
		}
		else {
			// branch 'success'
			return SIB_ID._8B2ZkVLqEe2djpkPxa2Z3Q;
		}
	}
	
}  

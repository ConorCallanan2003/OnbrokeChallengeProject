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
public final class RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3Q implements DIMEProcess {


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
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> featuresForOffers_A70HEVLIEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> featuresForBiddings_FSTiAVLPEe2djpkPxa2Z3Q = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_os8IQVLHEe2djpkPxa2Z3Q,
	_wHkt0VLHEe2djpkPxa2Z3Q,
	_2nxAOFLOEe2djpkPxa2Z3Q,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;

	@Inject
	public RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3Q(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController) {
		this.beanManager = beanManager;
		this.FeatureController = FeatureController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._wHkt0VLHEe2djpkPxa2Z3Q);
	}
	
	

	@Override
	public RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _os8IQVLHEe2djpkPxa2Z3Q: {
					return execute_os8IQVLHEe2djpkPxa2Z3Q(ctx);
				}
				case _wHkt0VLHEe2djpkPxa2Z3Q: {
					curr = execute_wHkt0VLHEe2djpkPxa2Z3Q(ctx);
					break;
				}
				case _2nxAOFLOEe2djpkPxa2Z3Q: {
					curr = execute_2nxAOFLOEe2djpkPxa2Z3Q(ctx);
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
	public static class RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_os8IQVLHEe2djpkPxa2Z3Q";
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
				return new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.featuresForOffers_A70HEVLIEe2djpkPxa2Z3Q);
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getFeaturesForBidding() {
				return new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(ctx.featuresForBiddings_FSTiAVLPEe2djpkPxa2Z3Q);
			}
		}
		


	// sibs
	// container for graph i/o 'success'.
	public RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult execute_os8IQVLHEe2djpkPxa2Z3Q(final Context ctx) {
		return new RetrieveFeatureTemplates_of7nAVLHEe2djpkPxa2Z3QResult(new SuccessReturnImpl(ctx));
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Feature'.
	public SIB_ID execute_wHkt0VLHEe2djpkPxa2Z3Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature searchObject = domController.createSearchObject("");
		searchObject.setisTemplateForOffer(true);
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value21 = result;
		if (value21 != null) { // prevent null in lists
		ctx.featuresForOffers_A70HEVLIEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value21);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._2nxAOFLOEe2djpkPxa2Z3Q;
		}
		else {
			// branch 'success'
			return SIB_ID._2nxAOFLOEe2djpkPxa2Z3Q;
		}
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Feature'.
	public SIB_ID execute_2nxAOFLOEe2djpkPxa2Z3Q(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature searchObject = domController.createSearchObject("");
		searchObject.setisTemplateForBidding(true);
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value22 = result;
		if (value22 != null) { // prevent null in lists
		ctx.featuresForBiddings_FSTiAVLPEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value22);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._os8IQVLHEe2djpkPxa2Z3Q;
		}
		else {
			// branch 'success'
			return SIB_ID._os8IQVLHEe2djpkPxa2Z3Q;
		}
	}
	
}  

package info.scce.dime.process.onbroke.models.areas.user;

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
public final class GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg implements DIMEProcess {


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
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> Retrieve_from_PrioritySuccessRetrieved_MQD0MWD6Ee2s0c0hOvkCRg = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> Retrieve_from_FeatureSuccessRetrieved_JGNHUWD6Ee2s0c0hOvkCRg = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> Retrieve_from_FeatureSuccessRetrieved_IISGgWD6Ee2s0c0hOvkCRg = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_FWn3MWD6Ee2s0c0hOvkCRg,
	_IIHHYWD6Ee2s0c0hOvkCRg,
	_JGI14WD6Ee2s0c0hOvkCRg,
	_MP8fcGD6Ee2s0c0hOvkCRg,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController;

	@Inject
	public GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRg(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController, de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController) {
		this.beanManager = beanManager;
		this.FeatureController = FeatureController;
		this.PriorityController = PriorityController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._IIHHYWD6Ee2s0c0hOvkCRg);
	}
	
	

	@Override
	public GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _FWn3MWD6Ee2s0c0hOvkCRg: {
					return execute_FWn3MWD6Ee2s0c0hOvkCRg(ctx);
				}
				case _IIHHYWD6Ee2s0c0hOvkCRg: {
					curr = execute_IIHHYWD6Ee2s0c0hOvkCRg(ctx);
					break;
				}
				case _JGI14WD6Ee2s0c0hOvkCRg: {
					curr = execute_JGI14WD6Ee2s0c0hOvkCRg(ctx);
					break;
				}
				case _MP8fcGD6Ee2s0c0hOvkCRg: {
					curr = execute_MP8fcGD6Ee2s0c0hOvkCRg(ctx);
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
	public static class GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_FWn3MWD6Ee2s0c0hOvkCRg";
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
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> getPriority();
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getFeature();
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getPreferences();
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

			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> getPriority() {
				return ctx.Retrieve_from_PrioritySuccessRetrieved_MQD0MWD6Ee2s0c0hOvkCRg;
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getFeature() {
				return ctx.Retrieve_from_FeatureSuccessRetrieved_JGNHUWD6Ee2s0c0hOvkCRg;
			}
			public List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> getPreferences() {
				return ctx.Retrieve_from_FeatureSuccessRetrieved_IISGgWD6Ee2s0c0hOvkCRg;
			}
		}
		


	// sibs
	// container for graph i/o 'success'.
	public GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult execute_FWn3MWD6Ee2s0c0hOvkCRg(final Context ctx) {
		return new GetFeatureData_FKNy4GD6Ee2s0c0hOvkCRgResult(new SuccessReturnImpl(ctx));
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Feature'.
	public SIB_ID execute_IIHHYWD6Ee2s0c0hOvkCRg(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature searchObject = domController.createSearchObject("");
		searchObject.setisTemplateForOffer(true);
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value44 = result;
		if (value44 != null) { // prevent null in lists
		ctx.Retrieve_from_FeatureSuccessRetrieved_IISGgWD6Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value44);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._JGI14WD6Ee2s0c0hOvkCRg;
		}
		else {
			// branch 'success'
			return SIB_ID._JGI14WD6Ee2s0c0hOvkCRg;
		}
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Feature'.
	public SIB_ID execute_JGI14WD6Ee2s0c0hOvkCRg(final Context ctx) {
		final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
		// search for all objects of type matching the given contraints.
		final de.ls5.dywa.generated.entity.onbroke.models.app.Feature searchObject = domController.createSearchObject("");
		searchObject.setisTemplateForBidding(true);
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> result = domController.findByProperties(searchObject);
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value45 = result;
		if (value45 != null) { // prevent null in lists
		ctx.Retrieve_from_FeatureSuccessRetrieved_JGNHUWD6Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value45);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._MP8fcGD6Ee2s0c0hOvkCRg;
		}
		else {
			// branch 'success'
			return SIB_ID._MP8fcGD6Ee2s0c0hOvkCRg;
		}
	}
	// container for retrieve all of type (matching the given constraints) SIB 'Retrieve from Priority'.
	public SIB_ID execute_MP8fcGD6Ee2s0c0hOvkCRg(final Context ctx) {
		final List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> result = Arrays.asList(de.ls5.dywa.generated.entity.onbroke.models.app.Priority.values());
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Priority> value46 = result;
		if (value46 != null) { // prevent null in lists
		ctx.Retrieve_from_PrioritySuccessRetrieved_MQD0MWD6Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Priority>(value46);
		}
		if (result.isEmpty()) {
			// branch 'none found'
			return SIB_ID._FWn3MWD6Ee2s0c0hOvkCRg;
		}
		else {
			// branch 'success'
			return SIB_ID._FWn3MWD6Ee2s0c0hOvkCRg;
		}
	}
	
}  

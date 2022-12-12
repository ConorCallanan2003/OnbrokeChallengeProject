package info.scce.dime.process.onbroke.models.areas.user.newoffer;

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

public final class EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0A implements DIMEProcess {


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
		private java.lang.String startDescription_6lYBMXhdEe2mVL2cgUAW0A;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> startSelectedFeatures_6lYoRHhdEe2mVL2cgUAW0A = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> startSelectedPreferences_6lYoSXhdEe2mVL2cgUAW0A = new ArrayList<>();
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer startOffer_DO5bwXheEe2mVL2cgUAW0A;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_sEo7oXhdEe2mVL2cgUAW0A,
	_KhWVsXheEe2mVL2cgUAW0A,
	_MnVx0XheEe2mVL2cgUAW0A,
	_g0j9oXihEe2wscJU9aUJ3A,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0A(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(java.lang.String description, de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedFeatures, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedPreferences, java.lang.String title) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		ctx.startOffer_DO5bwXheEe2mVL2cgUAW0A = offer;
		ctx.startOffer_DO5bwXheEe2mVL2cgUAW0A = offer;
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value61 = selectedFeatures;
		if (value61 != null) { // prevent null in lists
		ctx.startSelectedFeatures_6lYoRHhdEe2mVL2cgUAW0A = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value61);
		}
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value62 = selectedPreferences;
		if (value62 != null) { // prevent null in lists
		ctx.startSelectedPreferences_6lYoSXhdEe2mVL2cgUAW0A = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value62);
		}
		ctx.startOffer_DO5bwXheEe2mVL2cgUAW0A = offer;
		ctx.startDescription_6lYBMXhdEe2mVL2cgUAW0A = description;
		
		return ctx;
	}

	public EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult execute(boolean isAuthenticationRequired,java.lang.String description, de.ls5.dywa.generated.entity.onbroke.models.app.Offer offer, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedFeatures, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedPreferences, java.lang.String title) {
		final Context ctx = createContext(description, offer, selectedFeatures, selectedPreferences, title);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._KhWVsXheEe2mVL2cgUAW0A);
	}
	
	

	@Override
	public EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _sEo7oXhdEe2mVL2cgUAW0A: {
					return execute_sEo7oXhdEe2mVL2cgUAW0A(ctx);
				}
				case _KhWVsXheEe2mVL2cgUAW0A: {
					curr = execute_KhWVsXheEe2mVL2cgUAW0A(ctx);
					break;
				}
				case _MnVx0XheEe2mVL2cgUAW0A: {
					curr = execute_MnVx0XheEe2mVL2cgUAW0A(ctx);
					break;
				}
				case _g0j9oXihEe2wscJU9aUJ3A: {
					curr = execute_g0j9oXihEe2wscJU9aUJ3A(ctx);
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
	public static class EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_sEo7oXhdEe2mVL2cgUAW0A";
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
	public EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult execute_sEo7oXhdEe2mVL2cgUAW0A(final Context ctx) {
		return new EditOfferDetails_r4IwsXhdEe2mVL2cgUAW0AResult(new SuccessReturnImpl(ctx));
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_KhWVsXheEe2mVL2cgUAW0A(final Context ctx) {
		ctx.startOffer_DO5bwXheEe2mVL2cgUAW0A.setfeatures_Feature(ctx.startSelectedFeatures_6lYoRHhdEe2mVL2cgUAW0A);
		// branch 'success'
		return SIB_ID._MnVx0XheEe2mVL2cgUAW0A;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_MnVx0XheEe2mVL2cgUAW0A(final Context ctx) {
		ctx.startOffer_DO5bwXheEe2mVL2cgUAW0A.setpreferences_Feature(ctx.startSelectedPreferences_6lYoSXhdEe2mVL2cgUAW0A);
		// branch 'success'
		return SIB_ID._g0j9oXihEe2wscJU9aUJ3A;
	}
	// container for SIB 'Set description' setting a new attribute value.
	public SIB_ID execute_g0j9oXihEe2wscJU9aUJ3A(final Context ctx) {
		ctx.startOffer_DO5bwXheEe2mVL2cgUAW0A.setdescription(ctx.startDescription_6lYBMXhdEe2mVL2cgUAW0A);
		// branch 'success'
		return SIB_ID._sEo7oXhdEe2mVL2cgUAW0A;
	}
	
}  

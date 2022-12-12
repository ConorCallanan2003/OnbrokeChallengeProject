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

public final class EditDetails_cXeOkWD4Ee2s0c0hOvkCRg implements DIMEProcess {


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
		private java.lang.String startDescription_kFWOUWD6Ee2s0c0hOvkCRg;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> startSelectedFeatures_oJ5B0WD6Ee2s0c0hOvkCRg = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> startSelectedPreferences_obP3kWD6Ee2s0c0hOvkCRg = new ArrayList<>();
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding startBidding_4Yjo0WD6Ee2s0c0hOvkCRg;

		public info.scce.dime.process.JSONContext toJSON() {
			// this process has no context variables that need to be preserved
			return null;
        }
	}

	private enum SIB_ID {
	_cwqKoWD4Ee2s0c0hOvkCRg,
	_hKjjEWD4Ee2s0c0hOvkCRg,
	_ieiTcWD4Ee2s0c0hOvkCRg,
	_Po_CcXihEe2wscJU9aUJ3A,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public EditDetails_cXeOkWD4Ee2s0c0hOvkCRg(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext(de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding, java.lang.String description, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedFeatures, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedPreferences, java.lang.String title) {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value55 = selectedPreferences;
		if (value55 != null) { // prevent null in lists
		ctx.startSelectedPreferences_obP3kWD6Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value55);
		}
		List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value56 = selectedFeatures;
		if (value56 != null) { // prevent null in lists
		ctx.startSelectedFeatures_oJ5B0WD6Ee2s0c0hOvkCRg = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value56);
		}
		ctx.startBidding_4Yjo0WD6Ee2s0c0hOvkCRg = bidding;
		ctx.startBidding_4Yjo0WD6Ee2s0c0hOvkCRg = bidding;
		ctx.startDescription_kFWOUWD6Ee2s0c0hOvkCRg = description;
		ctx.startBidding_4Yjo0WD6Ee2s0c0hOvkCRg = bidding;
		
		return ctx;
	}

	public EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult execute(boolean isAuthenticationRequired,de.ls5.dywa.generated.entity.onbroke.models.app.Bidding bidding, java.lang.String description, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedFeatures, List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> selectedPreferences, java.lang.String title) {
		final Context ctx = createContext(bidding, description, selectedFeatures, selectedPreferences, title);
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._hKjjEWD4Ee2s0c0hOvkCRg);
	}
	
	

	@Override
	public EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		assert context == null;
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;
		ctx.callStack = callStack;

		switch (sibId) {
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _cwqKoWD4Ee2s0c0hOvkCRg: {
					return execute_cwqKoWD4Ee2s0c0hOvkCRg(ctx);
				}
				case _hKjjEWD4Ee2s0c0hOvkCRg: {
					curr = execute_hKjjEWD4Ee2s0c0hOvkCRg(ctx);
					break;
				}
				case _ieiTcWD4Ee2s0c0hOvkCRg: {
					curr = execute_ieiTcWD4Ee2s0c0hOvkCRg(ctx);
					break;
				}
				case _Po_CcXihEe2wscJU9aUJ3A: {
					curr = execute_Po_CcXihEe2wscJU9aUJ3A(ctx);
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
	public static class EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult implements info.scce.dime.process.DIMEProcessResult<Void> {
		private String branchName;
		private String branchId;
		private SuccessReturn success;
		
		public EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult(SuccessReturn success) {
			this.branchName = "success";
			this.branchId = "_cwqKoWD4Ee2s0c0hOvkCRg";
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
	public EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult execute_cwqKoWD4Ee2s0c0hOvkCRg(final Context ctx) {
		return new EditDetails_cXeOkWD4Ee2s0c0hOvkCRgResult(new SuccessReturnImpl(ctx));
	}
	// container for SIB 'Set features' setting a new attribute value.
	public SIB_ID execute_hKjjEWD4Ee2s0c0hOvkCRg(final Context ctx) {
		ctx.startBidding_4Yjo0WD6Ee2s0c0hOvkCRg.setfeatures_Feature(ctx.startSelectedFeatures_oJ5B0WD6Ee2s0c0hOvkCRg);
		// branch 'success'
		return SIB_ID._ieiTcWD4Ee2s0c0hOvkCRg;
	}
	// container for SIB 'Set preferences' setting a new attribute value.
	public SIB_ID execute_ieiTcWD4Ee2s0c0hOvkCRg(final Context ctx) {
		ctx.startBidding_4Yjo0WD6Ee2s0c0hOvkCRg.setpreferences_Feature(ctx.startSelectedPreferences_obP3kWD6Ee2s0c0hOvkCRg);
		// branch 'success'
		return SIB_ID._Po_CcXihEe2wscJU9aUJ3A;
	}
	// container for SIB 'Set description' setting a new attribute value.
	public SIB_ID execute_Po_CcXihEe2wscJU9aUJ3A(final Context ctx) {
		ctx.startBidding_4Yjo0WD6Ee2s0c0hOvkCRg.setdescription(ctx.startDescription_kFWOUWD6Ee2s0c0hOvkCRg);
		// branch 'success'
		return SIB_ID._cwqKoWD4Ee2s0c0hOvkCRg;
	}
	
}  

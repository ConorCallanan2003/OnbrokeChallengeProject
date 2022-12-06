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

public final class ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				// end context variables

				// begin direct dataflow variables
				private List<de.ls5.dywa.generated.rest.types.Offer> InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Offer> InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Bidding> InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w = new ArrayList<>();
				private de.ls5.dywa.generated.rest.types.Offer BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w;
				private de.ls5.dywa.generated.rest.types.Bidding BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA;
				private List<de.ls5.dywa.generated.rest.types.Offer> BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A = new ArrayList<>();
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					result.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w = new java.util.ArrayList<>(ctx.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Offer o : ctx.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Offer trans = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(o, trans, objectCache);
						result.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w.add(trans);
					}
					result.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w = new java.util.ArrayList<>(ctx.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Offer o : ctx.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Offer trans = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(o, trans, objectCache);
						result.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w.add(trans);
					}
					result.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w = new java.util.ArrayList<>(ctx.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding o : ctx.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Bidding trans = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(o, trans, objectCache);
						result.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w.add(trans);
					}
					if(ctx.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w, result.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w, result.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w, result.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w, result.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w, objectCache);
					}
					if(ctx.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA != null) {
						result.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA, result.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA, objectCache);
					}
					result.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A = new java.util.ArrayList<>(ctx.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Offer o : ctx.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Offer trans = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(o, trans, objectCache);
						result.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A.add(trans);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					result.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w = this.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w = this.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w = this.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					if (this.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w = contextTransformer.transform(this.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w);
					}
					if (this.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w = contextTransformer.transform(this.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w);
					}
					if (this.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w = contextTransformer.transform(this.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w);
					}
					if (this.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w != null) {
						result.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w = contextTransformer.transform(this.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w);
					}
					if (this.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA != null) {
						result.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA = contextTransformer.transform(this.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA);
					}
					result.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A = this.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());

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
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w = new ArrayList<>();
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA;
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A = new ArrayList<>();

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_fElJMVFOEe2J0bu3ffrh5w,
	_ffvSAVGMEe2J0bu3ffrh5w,
	_1d5TYVOlEe2KQc5QIsW97w,
	_NBECwVOmEe2KQc5QIsW97w,
	_QUqZ8VrXEe2zsZyFB7dFOg,
	_haQNYVuREe2C__HYPHEN_MINUS__dvY0XUmpA,
	___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA,
	_tErjIV__HYPHEN_MINUS__BEe2pr7wspri7ww,
		;
	}

	private final BeanManager beanManager;

	@Inject
	public ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w(final BeanManager beanManager) {
		this.beanManager = beanManager;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._ffvSAVGMEe2J0bu3ffrh5w);
	}
	
	
	public ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._ffvSAVGMEe2J0bu3ffrh5w);
	}

	@Override
	public ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_fElJMVFOEe2J0bu3ffrh5w": return executeInternal(ctx, continue_fElJMVFOEe2J0bu3ffrh5w(ctx, slgResult));
		case "_1d5TYVOlEe2KQc5QIsW97w": return executeInternal(ctx, continue_1d5TYVOlEe2KQc5QIsW97w(ctx, slgResult));
		case "_NBECwVOmEe2KQc5QIsW97w": return executeInternal(ctx, continue_NBECwVOmEe2KQc5QIsW97w(ctx, slgResult));
		case "_-u_1oVuYEe2C-dvY0XUmpA": return executeInternal(ctx, continue___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _fElJMVFOEe2J0bu3ffrh5w: {
					curr = execute_fElJMVFOEe2J0bu3ffrh5w(ctx);
					break;
				}
				case _ffvSAVGMEe2J0bu3ffrh5w: {
					curr = execute_ffvSAVGMEe2J0bu3ffrh5w(ctx);
					break;
				}
				case _1d5TYVOlEe2KQc5QIsW97w: {
					curr = execute_1d5TYVOlEe2KQc5QIsW97w(ctx);
					break;
				}
				case _NBECwVOmEe2KQc5QIsW97w: {
					curr = execute_NBECwVOmEe2KQc5QIsW97w(ctx);
					break;
				}
				case _QUqZ8VrXEe2zsZyFB7dFOg: {
					curr = execute_QUqZ8VrXEe2zsZyFB7dFOg(ctx);
					break;
				}
				case _haQNYVuREe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute_haQNYVuREe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case ___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA: {
					curr = execute___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx);
					break;
				}
				case _tErjIV__HYPHEN_MINUS__BEe2pr7wspri7ww: {
					curr = execute_tErjIV__HYPHEN_MINUS__BEe2pr7wspri7ww(ctx);
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
	public static class ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wResult implements info.scce.dime.process.DIMEProcessResult<de.ls5.dywa.generated.rest.process.interactable.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wOutput> {
		private String branchName;
		private String branchId;
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		

		private de.ls5.dywa.generated.rest.process.interactable.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wOutput wrapper;

		@Override
		public de.ls5.dywa.generated.rest.process.interactable.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wOutput toJSON(info.scce.dime.rest.ObjectCache objectCache) {
			if (wrapper == null) {
				this.wrapper = new de.ls5.dywa.generated.rest.process.interactable.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_wOutput(this, objectCache);
			}

			return wrapper;
		}
	}
	
	// model branches.


	// sibs
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB BrokerArea _fElJMVFOEe2J0bu3ffrh5w
	private static class InputsForGUISIB_fElJMVFOEe2J0bu3ffrh5w {
		public java.util.List<de.ls5.dywa.generated.rest.types.Offer>
		 offers = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Offer>
		 approvedOffers = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Bidding>
		 biddings = new ArrayList<>();
	}
	
	
	// container for GUI SIB 'BrokerArea'.
	public SIB_ID execute_fElJMVFOEe2J0bu3ffrh5w(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.OfferREST inputsOfferREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.OfferREST.class);
		final de.ls5.dywa.generated.rest.controller.BiddingREST inputsBiddingREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BiddingREST.class);
		
		final InputsForGUISIB_fElJMVFOEe2J0bu3ffrh5w inputs = new InputsForGUISIB_fElJMVFOEe2J0bu3ffrh5w();
		
		{
			//offers
			java.util.List<de.ls5.dywa.generated.rest.types.Offer>
			 result = new java.util.ArrayList<>(ctx.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Offer obj : ctx.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w) {
			
			de.ls5.dywa.generated.rest.types.Offer restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_BrokerAreaOfferSelectivex1_dCbEMVFOEe2J0bu3ffrh5w
					restTO = inputsOfferREST.read_BrokerOfferTableOfferSelectivex1_JXgxEVFUEe2J0bu3ffrh5w(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(obj, objectCache);
					}
					// BrokerAreaOfferSelectivex1_dCbEMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.BrokerOfferTableOfferSelectivex1_JXgxEVFUEe2J0bu3ffrh5w.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.offers = result;
		}
		{
			//approvedOffers
			java.util.List<de.ls5.dywa.generated.rest.types.Offer>
			 result = new java.util.ArrayList<>(ctx.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Offer obj : ctx.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w) {
			
			de.ls5.dywa.generated.rest.types.Offer restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_BrokerAreaOfferSelectivex2_dCbEMVFOEe2J0bu3ffrh5w
					restTO = inputsOfferREST.read_BrokerAreaOfferSelectivex2_dCbEMVFOEe2J0bu3ffrh5w(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(obj, objectCache);
					}
					// BrokerAreaOfferSelectivex2_dCbEMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.BrokerAreaOfferSelectivex2_dCbEMVFOEe2J0bu3ffrh5w.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.approvedOffers = result;
		}
		{
			//biddings
			java.util.List<de.ls5.dywa.generated.rest.types.Bidding>
			 result = new java.util.ArrayList<>(ctx.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding obj : ctx.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w) {
			
			de.ls5.dywa.generated.rest.types.Bidding restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_BrokerAreaBiddingSelectivex3_dCbEMVFOEe2J0bu3ffrh5w
					restTO = inputsBiddingREST.read_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(obj, objectCache);
					}
					// BrokerAreaBiddingSelectivex3_dCbEMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.biddings = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.broker.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w:_fElJMVFOEe2J0bu3ffrh5w:_dCbEMVFOEe2J0bu3ffrh5w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_fElJMVFOEe2J0bu3ffrh5w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_fElJMVFOEe2J0bu3ffrh5w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_fElJMVFOEe2J0bu3ffrh5w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerarea.BrokerArea_dCbEMVFOEe2J0bu3ffrh5wResult result = (info.scce.dime.gui.onbroke.models.areas.broker.brokerarea.BrokerArea_dCbEMVFOEe2J0bu3ffrh5wResult) guiResult;
		if ("Show_offer".equals(result.getBranchName())) {
			if(result.getgui__XM__HYPHEN_MINUS__FZVFUEe2J0bu3ffrh5wShow_offerReturn() != null) {
			ctx.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Offer)result.getgui__XM__HYPHEN_MINUS__FZVFUEe2J0bu3ffrh5wShow_offerReturn().getOffer();
			}
			// branch 'Show offer'
			return SIB_ID._NBECwVOmEe2KQc5QIsW97w;
		} else 
		if ("Decide_offer".equals(result.getBranchName())) {
			if(result.getgui__XM__HYPHEN_MINUS__sIFFUEe2J0bu3ffrh5wDecide_offerReturn() != null) {
			}
			// branch 'Decide offer'
			return SIB_ID._ffvSAVGMEe2J0bu3ffrh5w;
		} else 
		if ("Edit_report".equals(result.getBranchName())) {
			if(result.getgui__5KRpf1F_Ee2J0bu3ffrh5wEdit_reportReturn() != null) {
			}
			// branch 'Edit report'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		} else 
		if ("Show_bidding".equals(result.getBranchName())) {
			if(result.getgui__X1hAWlGGEe2J0bu3ffrh5wShow_biddingReturn() != null) {
			ctx.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__X1hAWlGGEe2J0bu3ffrh5wShow_biddingReturn().getBidding();
			}
			// branch 'Show bidding'
			return SIB_ID._1d5TYVOlEe2KQc5QIsW97w;
		} else 
		if ("Assign".equals(result.getBranchName())) {
			if(result.getgui__kOQ__HYPHEN_MINUS__ZFGJEe2J0bu3ffrh5wAssignReturn() != null) {
			ctx.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__kOQ__HYPHEN_MINUS__ZFGJEe2J0bu3ffrh5wAssignReturn().getBidding();
			}
			// branch 'Assign'
			return SIB_ID._QUqZ8VrXEe2zsZyFB7dFOg;
		} else 
		if ("Unassign".equals(result.getBranchName())) {
			if(result.getgui__kORlMVGJEe2J0bu3ffrh5wUnassignReturn() != null) {
			ctx.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__kORlMVGJEe2J0bu3ffrh5wUnassignReturn().getBidding();
			}
			// branch 'Unassign'
			return SIB_ID._haQNYVuREe2C__HYPHEN_MINUS__dvY0XUmpA;
		} else 
		if ("Review_offer".equals(result.getBranchName())) {
			if(result.getgui__5KRCilF_Ee2J0bu3ffrh5wReview_offerReturn() != null) {
			}
			// branch 'Review offer'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		} else 
		if ("Revoke_offer".equals(result.getBranchName())) {
			if(result.getgui__mp6QW1GAEe2J0bu3ffrh5wRevoke_offerReturn() != null) {
			}
			// branch 'Revoke offer'
			return SIB_ID._ffvSAVGMEe2J0bu3ffrh5w;
		} else 
		if ("Decide_bidding".equals(result.getBranchName())) {
			if(result.getgui__X1hAa1GGEe2J0bu3ffrh5wDecide_biddingReturn() != null) {
			}
			// branch 'Decide bidding'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		} else 
		if ("Review_bidding".equals(result.getBranchName())) {
			if(result.getgui__X1hAfFGGEe2J0bu3ffrh5wReview_biddingReturn() != null) {
			}
			// branch 'Review bidding'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		} else 
		if ("Revoke_bidding".equals(result.getBranchName())) {
			if(result.getgui__X1hnJVGGEe2J0bu3ffrh5wRevoke_biddingReturn() != null) {
			}
			// branch 'Revoke bidding'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		} else 
		if ("Edit".equals(result.getBranchName())) {
			if(result.getgui__PdUCgVuYEe2C__HYPHEN_MINUS__dvY0XUmpAEditReturn() != null) {
			ctx.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__PdUCgVuYEe2C__HYPHEN_MINUS__dvY0XUmpAEditReturn().getBidding();
			}
			// branch 'Edit'
			return SIB_ID.___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA;
		} else 
		if ("Auto_Assign".equals(result.getBranchName())) {
			if(result.getgui__oi368V94Ee2pr7wspri7wwAuto_AssignReturn() != null) {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value23 = (List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>)result.getgui__oi368V94Ee2pr7wspri7wwAuto_AssignReturn().getApprovedOffers();
			if (value23 != null) { // prevent null in lists
			ctx.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value23);
			}
			}
			// branch 'Auto Assign'
			return SIB_ID._tErjIV__HYPHEN_MINUS__BEe2pr7wspri7ww;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_fElJMVFOEe2J0bu3ffrh5w(ctx);
		}
	}
	// container for graph abstraction 'InitBrokerArea' and sub process 'InitBrokerArea'.
	public SIB_ID execute_ffvSAVGMEe2J0bu3ffrh5w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.InitBrokerArea_N73BAFGLEe2J0bu3ffrh5w instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.broker.InitBrokerArea_N73BAFGLEe2J0bu3ffrh5w.class);
	
		final info.scce.dime.process.onbroke.models.areas.broker.InitBrokerArea_N73BAFGLEe2J0bu3ffrh5w.InitBrokerArea_N73BAFGLEe2J0bu3ffrh5wResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value24 = result.getSuccessReturn().getApprovedOffers();
			if (value24 != null) { // prevent null in lists
			ctx.InitBrokerAreaSuccessApprovedOffers_fgFQQFGMEe2J0bu3ffrh5w = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value24);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value25 = result.getSuccessReturn().getOffers();
			if (value25 != null) { // prevent null in lists
			ctx.InitBrokerAreaSuccessOffers_fgOaMVGMEe2J0bu3ffrh5w = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value25);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> value26 = result.getSuccessReturn().getBiddings();
			if (value26 != null) { // prevent null in lists
			ctx.InitBrokerAreaSuccessBiddings_fgWWAVGMEe2J0bu3ffrh5w = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding>(value26);
			}
			// branch 'success'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'InitBrokerArea' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'ShowBiddingDetails' and sub process 'ShowBiddingDetails'.
	public SIB_ID execute_1d5TYVOlEe2KQc5QIsW97w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w instance = new info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.broker.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w:_1d5TYVOlEe2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult result = instance.execute(ctx.callStack , ctx.BrokerAreaShow_biddingBidding_KwdcAVGLEe2J0bu3ffrh5w);
	
		return continue_1d5TYVOlEe2KQc5QIsW97w(ctx, result);
	}
	
	public SIB_ID continue_1d5TYVOlEe2KQc5QIsW97w(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult result = (info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "back": {
			// branch 'back'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowBiddingDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowOfferDetails' and sub process 'ShowOfferDetails'.
	public SIB_ID execute_NBECwVOmEe2KQc5QIsW97w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w instance = new info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.broker.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w:_NBECwVOmEe2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult result = instance.execute(ctx.callStack , ctx.BrokerAreaShow_offerOffer_Kvqx0VGLEe2J0bu3ffrh5w);
	
		return continue_NBECwVOmEe2KQc5QIsW97w(ctx, result);
	}
	
	public SIB_ID continue_NBECwVOmEe2KQc5QIsW97w(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult result = (info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "back": {
			// branch 'back'
			return SIB_ID._fElJMVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowOfferDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'Assign' and sub process 'Assign'.
	public SIB_ID execute_QUqZ8VrXEe2zsZyFB7dFOg(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.class);
	
		final info.scce.dime.process.onbroke.models.areas.broker.Assign_NI96AVrXEe2zsZyFB7dFOg.Assign_NI96AVrXEe2zsZyFB7dFOgResult result = instance.execute(false, ctx.BrokerAreaAssignBidding_KwnNAVGLEe2J0bu3ffrh5w);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ffvSAVGMEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'Assign' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'Unassign' and sub process 'Unassign'.
	public SIB_ID execute_haQNYVuREe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.broker.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA.class);
	
		final info.scce.dime.process.onbroke.models.areas.broker.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpA.Unassign_eckUQVuREe2C__HYPHEN_MINUS__dvY0XUmpAResult result = instance.execute(false, ctx.BrokerAreaUnassignBidding_KwyzMVGLEe2J0bu3ffrh5w);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ffvSAVGMEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'Unassign' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'EditAssignment' and sub process 'EditAssignment'.
	public SIB_ID execute___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA instance = new info.scce.dime.process.onbroke.models.areas.broker.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.broker.ShowBrokerArea_zgnP4FFLEe2Vgcav4Znc_w:_-u_1oVuYEe2C-dvY0XUmpA", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.broker.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult result = instance.execute(ctx.callStack , ctx.BrokerAreaEditBidding_AxQ9cVubEe2C__HYPHEN_MINUS__dvY0XUmpA);
	
		return continue___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(ctx, result);
	}
	
	public SIB_ID continue___HYPHEN_MINUS__u_1oVuYEe2C__HYPHEN_MINUS__dvY0XUmpA(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.broker.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult result = (info.scce.dime.process.onbroke.models.areas.broker.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpA.EditAssignment_8Y3rwVuYEe2C__HYPHEN_MINUS__dvY0XUmpAResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ffvSAVGMEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'EditAssignment' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'AutoAssign' and sub process 'AutoAssign'.
	public SIB_ID execute_tErjIV__HYPHEN_MINUS__BEe2pr7wspri7ww(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.broker.AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7ww instance = new info.scce.dime.process.onbroke.models.areas.broker.AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7ww(ctx.beanManager);
	
		final info.scce.dime.process.onbroke.models.areas.broker.AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7ww.AutoAssign_q67oYV__HYPHEN_MINUS__BEe2pr7wspri7wwResult result = instance.execute(false, ctx.BrokerAreaAuto_AssignApprovedOffers_BphAkWEsEe22faBh7MAS9A);
	
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ffvSAVGMEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'AutoAssign' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	
}  

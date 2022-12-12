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
public final class ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w implements DIMEProcess {

			// helper context for JSON serialization.
			@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
			public static class JSONContext extends info.scce.dime.process.JSONContext {

				// begin context variables
				private de.ls5.dywa.generated.rest.types.User user;
				// end context variables

				// begin direct dataflow variables
				private List<de.ls5.dywa.generated.rest.types.Feature> InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Feature> InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.User> InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Offer> InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q = new ArrayList<>();
				private List<de.ls5.dywa.generated.rest.types.Bidding> InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q = new ArrayList<>();
				private de.ls5.dywa.generated.rest.types.Feature AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q;
				private de.ls5.dywa.generated.rest.types.Feature AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q;
				private de.ls5.dywa.generated.rest.types.User AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q;
				private de.ls5.dywa.generated.rest.types.Offer AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q;
				private de.ls5.dywa.generated.rest.types.Offer AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q;
				private de.ls5.dywa.generated.rest.types.Bidding AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q;
				private de.ls5.dywa.generated.rest.types.Feature AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ;
				// end direct dataflow variables

				// begin index variables of iterate sibs
				// endindex variables of iterate sibs

				public static JSONContext toJSON(BeanManager bm, Context ctx) {
					final JSONContext result = new JSONContext();
					final info.scce.dime.rest.ObjectCache objectCache = new info.scce.dime.rest.ObjectCache();

					if(ctx.user != null) {
						result.user = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(ctx.user, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(ctx.user, result.user, objectCache);
					}
					result.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q.add(trans);
					}
					result.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : ctx.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Feature trans = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(o, trans, objectCache);
						result.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q.add(trans);
					}
					result.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.User o : ctx.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.User trans = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(o, trans, objectCache);
						result.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q.add(trans);
					}
					result.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Offer o : ctx.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Offer trans = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(o, trans, objectCache);
						result.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q.add(trans);
					}
					result.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q.size());
								
					for (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding o : ctx.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q.stream().filter((n)->n!=null).collect(java.util.stream.Collectors.toList())) {
						final de.ls5.dywa.generated.rest.types.Bidding trans = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(o, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(o, trans, objectCache);
						result.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q.add(trans);
					}
					if(ctx.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q != null) {
						result.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(ctx.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(ctx.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q, result.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q, objectCache);
					}
					if(ctx.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q != null) {
						result.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(ctx.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(ctx.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q, result.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q, objectCache);
					}
					if(ctx.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(ctx.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q, objectCache);
						de.ls5.dywa.generated.rest.types.UserSelective.copy(ctx.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q, result.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q, objectCache);
					}
					if(ctx.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q, result.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q, objectCache);
					}
					if(ctx.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(ctx.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q, objectCache);
						de.ls5.dywa.generated.rest.types.OfferSelective.copy(ctx.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q, result.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q, objectCache);
					}
					if(ctx.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(ctx.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q, objectCache);
						de.ls5.dywa.generated.rest.types.BiddingSelective.copy(ctx.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q, result.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q, objectCache);
					}
					if(ctx.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ != null) {
						result.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(ctx.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ, objectCache);
						de.ls5.dywa.generated.rest.types.FeatureSelective.copy(ctx.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ, result.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ, objectCache);
					}

					return result;
				}

				@Override
		        public Context toContext(BeanManager bm, ProcessCallFrame callStack) {
					final Context result = new Context();
		            result.beanManager = bm;
					result.callStack = callStack;


					info.scce.dime.process.ContextTransformer contextTransformer = info.scce.dime.process.ContextTransformer.getInstance(bm);

					if (this.user != null) {
						result.user = contextTransformer.transform(this.user);
					}
					result.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q = this.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q = this.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q = this.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q = this.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					result.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q = this.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q.stream().filter(o -> o != null).map(o -> contextTransformer.transform(o)).collect(Collectors.toList());
					if (this.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q != null) {
						result.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q = contextTransformer.transform(this.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q);
					}
					if (this.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q != null) {
						result.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q = contextTransformer.transform(this.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q);
					}
					if (this.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q = contextTransformer.transform(this.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q);
					}
					if (this.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q = contextTransformer.transform(this.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q);
					}
					if (this.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q = contextTransformer.transform(this.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q);
					}
					if (this.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q != null) {
						result.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q = contextTransformer.transform(this.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q);
					}
					if (this.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ != null) {
						result.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ = contextTransformer.transform(this.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ);
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

		// context variables.
		private de.ls5.dywa.generated.entity.onbroke.models.app.User user;
		// direct dataflow variables.
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.User> InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q = new ArrayList<>();
		private List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q = new ArrayList<>();
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.User AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Offer AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Bidding AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q;
		private de.ls5.dywa.generated.entity.onbroke.models.app.Feature AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ;

		public info.scce.dime.process.JSONContext toJSON() {
			return JSONContext.toJSON(beanManager, this);
        }
	}

	private enum SIB_ID {
	_ZewJIVFOEe2J0bu3ffrh5w,
	_ldrMkFLrEe2djpkPxa2Z3Q,
	_ugApUVOnEe2KQc5QIsW97w,
	_zC6z0VOnEe2KQc5QIsW97w,
	_GrECEXVoEe2_CvdRyEmMCQ,
	_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ,
	_lWSZQXVoEe2_CvdRyEmMCQ,
	_yn3kEXVoEe2_CvdRyEmMCQ,
	_EGVmEXVpEe2_CvdRyEmMCQ,
	_VoRLwXVpEe2_CvdRyEmMCQ,
	_iS_x8XVpEe2_CvdRyEmMCQ,
	_43eEcXVpEe2_CvdRyEmMCQ,
	_kAAQ4XVqEe2_CvdRyEmMCQ,
	_rrHicXVqEe2_CvdRyEmMCQ,
	_j8aU4XVrEe2_CvdRyEmMCQ,
	_obHU0XVrEe2_CvdRyEmMCQ,
	_GqNwsXVsEe2_CvdRyEmMCQ,
	_JqQaQXVsEe2_CvdRyEmMCQ,
		;
	}

	private final BeanManager beanManager;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController;
	private final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController;

	@Inject
	public ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w(final BeanManager beanManager, de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController, de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController, de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController, de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController) {
		this.beanManager = beanManager;
		this.FeatureController = FeatureController;
		this.UserController = UserController;
		this.BaseUserController = BaseUserController;
		this.OfferController = OfferController;
	}

	private Context createContext() {
		final Context ctx = new Context();
		ctx.beanManager = this.beanManager;

		// store inputs
		
		return ctx;
	}

	public ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResult execute(boolean isAuthenticationRequired) {
		final Context ctx = createContext();
		ctx.callStack.setAuthenticationRequired(isAuthenticationRequired);

		return executeInternal(ctx, SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q);
	}
	
	
	public ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResult execute(ProcessCallFrame callStack) {
		final Context ctx = createContext();
		ctx.callStack = callStack;

		return executeInternal(ctx, SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q);
	}

	@Override
	public ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResult continueExecution(ProcessCallFrame callStack, info.scce.dime.process.JSONContext context, String sibId, Object slgResult) {
		final Context ctx = ((JSONContext) context).toContext(this.beanManager, callStack);

		switch (sibId) {
		case "_ZewJIVFOEe2J0bu3ffrh5w": return executeInternal(ctx, continue_ZewJIVFOEe2J0bu3ffrh5w(ctx, slgResult));
		case "_ugApUVOnEe2KQc5QIsW97w": return executeInternal(ctx, continue_ugApUVOnEe2KQc5QIsW97w(ctx, slgResult));
		case "_zC6z0VOnEe2KQc5QIsW97w": return executeInternal(ctx, continue_zC6z0VOnEe2KQc5QIsW97w(ctx, slgResult));
		case "_GrECEXVoEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_GrECEXVoEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_U-x_UXVoEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_lWSZQXVoEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_lWSZQXVoEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_yn3kEXVoEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_yn3kEXVoEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_EGVmEXVpEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_EGVmEXVpEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_iS_x8XVpEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_iS_x8XVpEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_43eEcXVpEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_43eEcXVpEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_kAAQ4XVqEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_kAAQ4XVqEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_j8aU4XVrEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_j8aU4XVrEe2_CvdRyEmMCQ(ctx, slgResult));
		case "_GqNwsXVsEe2_CvdRyEmMCQ": return executeInternal(ctx, continue_GqNwsXVsEe2_CvdRyEmMCQ(ctx, slgResult));
			default: throw new IllegalStateException("Unknown continuation point '" + sibId + '\'');
		}
	}

	private ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResult executeInternal(final Context ctx, final SIB_ID id) {
		SIB_ID curr = id;
		while (true) {
			switch (curr) {
				case _ZewJIVFOEe2J0bu3ffrh5w: {
					curr = execute_ZewJIVFOEe2J0bu3ffrh5w(ctx);
					break;
				}
				case _ldrMkFLrEe2djpkPxa2Z3Q: {
					curr = execute_ldrMkFLrEe2djpkPxa2Z3Q(ctx);
					break;
				}
				case _ugApUVOnEe2KQc5QIsW97w: {
					curr = execute_ugApUVOnEe2KQc5QIsW97w(ctx);
					break;
				}
				case _zC6z0VOnEe2KQc5QIsW97w: {
					curr = execute_zC6z0VOnEe2KQc5QIsW97w(ctx);
					break;
				}
				case _GrECEXVoEe2_CvdRyEmMCQ: {
					curr = execute_GrECEXVoEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ: {
					curr = execute_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _lWSZQXVoEe2_CvdRyEmMCQ: {
					curr = execute_lWSZQXVoEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _yn3kEXVoEe2_CvdRyEmMCQ: {
					curr = execute_yn3kEXVoEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _EGVmEXVpEe2_CvdRyEmMCQ: {
					curr = execute_EGVmEXVpEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _VoRLwXVpEe2_CvdRyEmMCQ: {
					curr = execute_VoRLwXVpEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _iS_x8XVpEe2_CvdRyEmMCQ: {
					curr = execute_iS_x8XVpEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _43eEcXVpEe2_CvdRyEmMCQ: {
					curr = execute_43eEcXVpEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _kAAQ4XVqEe2_CvdRyEmMCQ: {
					curr = execute_kAAQ4XVqEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _rrHicXVqEe2_CvdRyEmMCQ: {
					curr = execute_rrHicXVqEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _j8aU4XVrEe2_CvdRyEmMCQ: {
					curr = execute_j8aU4XVrEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _obHU0XVrEe2_CvdRyEmMCQ: {
					curr = execute_obHU0XVrEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _GqNwsXVsEe2_CvdRyEmMCQ: {
					curr = execute_GqNwsXVsEe2_CvdRyEmMCQ(ctx);
					break;
				}
				case _JqQaQXVsEe2_CvdRyEmMCQ: {
					curr = execute_JqQaQXVsEe2_CvdRyEmMCQ(ctx);
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
	public static class ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wResult implements info.scce.dime.process.DIMEProcessResult<de.ls5.dywa.generated.rest.process.interactable.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wOutput> {
		private String branchName;
		private String branchId;
		
		public String getBranchName() {
			return branchName;
		}
		
		public String getBranchId() {
			return branchId;
		}
		

		private de.ls5.dywa.generated.rest.process.interactable.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wOutput wrapper;

		@Override
		public de.ls5.dywa.generated.rest.process.interactable.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wOutput toJSON(info.scce.dime.rest.ObjectCache objectCache) {
			if (wrapper == null) {
				this.wrapper = new de.ls5.dywa.generated.rest.process.interactable.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_wOutput(this, objectCache);
			}

			return wrapper;
		}
	}
	
	// model branches.


	// sibs
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB AdminArea _ZewJIVFOEe2J0bu3ffrh5w
	private static class InputsForGUISIB_ZewJIVFOEe2J0bu3ffrh5w {
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 featuresForOffer = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 featuresForBidding = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.User>
		 users = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Offer>
		 offers = new ArrayList<>();
		public java.util.List<de.ls5.dywa.generated.rest.types.Bidding>
		 biddings = new ArrayList<>();
	}
	
	
	// container for GUI SIB 'AdminArea'.
	public SIB_ID execute_ZewJIVFOEe2J0bu3ffrh5w(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.FeatureREST inputsFeatureREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.FeatureREST.class);
		final de.ls5.dywa.generated.rest.controller.UserREST inputsUserREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.UserREST.class);
		final de.ls5.dywa.generated.rest.controller.OfferREST inputsOfferREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.OfferREST.class);
		final de.ls5.dywa.generated.rest.controller.BiddingREST inputsBiddingREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.BiddingREST.class);
		
		final InputsForGUISIB_ZewJIVFOEe2J0bu3ffrh5w inputs = new InputsForGUISIB_ZewJIVFOEe2J0bu3ffrh5w();
		
		{
			//featuresForOffer
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_AdminAreaFeatureSelectivex1_YggYMVFOEe2J0bu3ffrh5w
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// AdminAreaFeatureSelectivex1_YggYMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.featuresForOffer = result;
		}
		{
			//featuresForBidding
			java.util.List<de.ls5.dywa.generated.rest.types.Feature>
			 result = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj : ctx.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q) {
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_AdminAreaFeatureSelectivex2_YggYMVFOEe2J0bu3ffrh5w
					restTO = inputsFeatureREST.read_EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// AdminAreaFeatureSelectivex2_YggYMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.EditAssignmentFeatureSelectivex1x12x12x19x19x28x28_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.featuresForBidding = result;
		}
		{
			//users
			java.util.List<de.ls5.dywa.generated.rest.types.User>
			 result = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.User obj : ctx.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q) {
			
			de.ls5.dywa.generated.rest.types.User restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_AdminAreaUserSelectivex3_YggYMVFOEe2J0bu3ffrh5w
					restTO = inputsUserREST.read_AdminOverviewTabUserSelectivex1_8iqPUVLkEe2djpkPxa2Z3Q(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(obj, objectCache);
					}
					// AdminAreaUserSelectivex3_YggYMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.AdminOverviewTabUserSelectivex1_8iqPUVLkEe2djpkPxa2Z3Q.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.users = result;
		}
		{
			//offers
			java.util.List<de.ls5.dywa.generated.rest.types.Offer>
			 result = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Offer obj : ctx.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q) {
			
			de.ls5.dywa.generated.rest.types.Offer restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_AdminAreaOfferSelectivex4_YggYMVFOEe2J0bu3ffrh5w
					restTO = inputsOfferREST.read_AdminOfferTableOfferSelectivex1_G6PuMVLlEe2djpkPxa2Z3Q(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(obj, objectCache);
					}
					// AdminAreaOfferSelectivex4_YggYMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.AdminOfferTableOfferSelectivex1_G6PuMVLlEe2djpkPxa2Z3Q.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.offers = result;
		}
		{
			//biddings
			java.util.List<de.ls5.dywa.generated.rest.types.Bidding>
			 result = new java.util.ArrayList<>(ctx.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q.size());
			for (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding obj : ctx.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q) {
			
			de.ls5.dywa.generated.rest.types.Bidding restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_AdminAreaBiddingSelectivex5_YggYMVFOEe2J0bu3ffrh5w
					restTO = inputsBiddingREST.read_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(obj, objectCache);
					}
					// AdminAreaBiddingSelectivex5_YggYMVFOEe2J0bu3ffrh5w
					de.ls5.dywa.generated.rest.types.AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q.copy(obj, restTO, objectCache);
				}
				result.add(restTO);
			}
			}
			inputs.biddings = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_ZewJIVFOEe2J0bu3ffrh5w:_YggYMVFOEe2J0bu3ffrh5w", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_ZewJIVFOEe2J0bu3ffrh5w", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_ZewJIVFOEe2J0bu3ffrh5w(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_ZewJIVFOEe2J0bu3ffrh5w");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.adminarea.AdminArea_YggYMVFOEe2J0bu3ffrh5wResult result = (info.scce.dime.gui.onbroke.models.areas.admin.adminarea.AdminArea_YggYMVFOEe2J0bu3ffrh5wResult) guiResult;
		if ("Create_offer_feature".equals(result.getBranchName())) {
			// branch 'Create offer feature'
			return SIB_ID._GrECEXVoEe2_CvdRyEmMCQ;
		} else 
		if ("Create_bidding_feature".equals(result.getBranchName())) {
			// branch 'Create bidding feature'
			return SIB_ID._lWSZQXVoEe2_CvdRyEmMCQ;
		} else 
		if ("Edit_feature".equals(result.getBranchName())) {
			if(result.getgui__zZTH0VLIEe2djpkPxa2Z3QEdit_featureReturn() != null) {
			ctx.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature)result.getgui__zZTH0VLIEe2djpkPxa2Z3QEdit_featureReturn().getFeature();
			}
			// branch 'Edit feature'
			return SIB_ID._yn3kEXVoEe2_CvdRyEmMCQ;
		} else 
		if ("Delete_feature".equals(result.getBranchName())) {
			if(result.getgui__zZTH4lLIEe2djpkPxa2Z3QDelete_featureReturn() != null) {
			ctx.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature)result.getgui__zZTH4lLIEe2djpkPxa2Z3QDelete_featureReturn().getFeature();
			}
			// branch 'Delete feature'
			return SIB_ID._EGVmEXVpEe2_CvdRyEmMCQ;
		} else 
		if ("Edit_user".equals(result.getBranchName())) {
			if(result.getgui__vZeEOFLnEe2djpkPxa2Z3QEdit_userReturn() != null) {
			}
			// branch 'Edit user'
			return SIB_ID._43eEcXVpEe2_CvdRyEmMCQ;
		} else 
		if ("Delete_user".equals(result.getBranchName())) {
			if(result.getgui__vZeESVLnEe2djpkPxa2Z3QDelete_userReturn() != null) {
			ctx.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q = (de.ls5.dywa.generated.entity.onbroke.models.app.User)result.getgui__vZeESVLnEe2djpkPxa2Z3QDelete_userReturn().getUser();
			ctx.user = (de.ls5.dywa.generated.entity.onbroke.models.app.User)result.getgui__vZeESVLnEe2djpkPxa2Z3QDelete_userReturn().getUser();
			}
			// branch 'Delete user'
			return SIB_ID._kAAQ4XVqEe2_CvdRyEmMCQ;
		} else 
		if ("Create_user".equals(result.getBranchName())) {
			// branch 'Create user'
			return SIB_ID._iS_x8XVpEe2_CvdRyEmMCQ;
		} else 
		if ("Show_offer".equals(result.getBranchName())) {
			if(result.getgui__K80y21LlEe2djpkPxa2Z3QShow_offerReturn() != null) {
			ctx.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q = (de.ls5.dywa.generated.entity.onbroke.models.app.Offer)result.getgui__K80y21LlEe2djpkPxa2Z3QShow_offerReturn().getOffer();
			}
			// branch 'Show offer'
			return SIB_ID._ugApUVOnEe2KQc5QIsW97w;
		} else 
		if ("Edit_offer".equals(result.getBranchName())) {
			if(result.getgui__K80y7FLlEe2djpkPxa2Z3QEdit_offerReturn() != null) {
			}
			// branch 'Edit offer'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		} else 
		if ("Delete_offer".equals(result.getBranchName())) {
			if(result.getgui__K80y_VLlEe2djpkPxa2Z3QDelete_offerReturn() != null) {
			ctx.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q = (de.ls5.dywa.generated.entity.onbroke.models.app.Offer)result.getgui__K80y_VLlEe2djpkPxa2Z3QDelete_offerReturn().getOffer();
			}
			// branch 'Delete offer'
			return SIB_ID._j8aU4XVrEe2_CvdRyEmMCQ;
		} else 
		if ("Show_bidding".equals(result.getBranchName())) {
			if(result.getgui__uDx5LFLmEe2djpkPxa2Z3QShow_biddingReturn() != null) {
			ctx.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding)result.getgui__uDx5LFLmEe2djpkPxa2Z3QShow_biddingReturn().getBidding();
			}
			// branch 'Show bidding'
			return SIB_ID._zC6z0VOnEe2KQc5QIsW97w;
		} else 
		if ("Edit_bidding".equals(result.getBranchName())) {
			if(result.getgui__uDx5PVLmEe2djpkPxa2Z3QEdit_biddingReturn() != null) {
			}
			// branch 'Edit bidding'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		} else 
		if ("Delete_bidding".equals(result.getBranchName())) {
			if(result.getgui__uDygGlLmEe2djpkPxa2Z3QDelete_biddingReturn() != null) {
			}
			// branch 'Delete bidding'
			return SIB_ID._GqNwsXVsEe2_CvdRyEmMCQ;
		} else 
		if ("Details".equals(result.getBranchName())) {
			if(result.getgui__FHYeQXVnEe2_CvdRyEmMCQDetailsReturn() != null) {
			ctx.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature)result.getgui__FHYeQXVnEe2_CvdRyEmMCQDetailsReturn().getFeature();
			}
			// branch 'Details'
			return SIB_ID._U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_ZewJIVFOEe2J0bu3ffrh5w(ctx);
		}
	}
	// container for graph abstraction 'InitAdminArea' and sub process 'InitAdminArea'.
	public SIB_ID execute_ldrMkFLrEe2djpkPxa2Z3Q(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.admin.InitAdminArea_7wYPEVLqEe2djpkPxa2Z3Q instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.admin.InitAdminArea_7wYPEVLqEe2djpkPxa2Z3Q.class);
	
		final info.scce.dime.process.onbroke.models.areas.admin.InitAdminArea_7wYPEVLqEe2djpkPxa2Z3Q.InitAdminArea_7wYPEVLqEe2djpkPxa2Z3QResult result = instance.execute(false);
	
		switch(result.getBranchName()) {
		case "success": {
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value11 = result.getSuccessReturn().getFeaturesForOffer();
			if (value11 != null) { // prevent null in lists
			ctx.InitAdminAreaSuccessFeaturesForOffer_ld7EMVLrEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value11);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature> value12 = result.getSuccessReturn().getFeaturesForBidding();
			if (value12 != null) { // prevent null in lists
			ctx.InitAdminAreaSuccessFeaturesForBidding_leDnEVLrEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>(value12);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.User> value13 = result.getSuccessReturn().getUsers();
			if (value13 != null) { // prevent null in lists
			ctx.InitAdminAreaSuccessUsers_leMJ8VLrEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.User>(value13);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> value14 = result.getSuccessReturn().getOffers();
			if (value14 != null) { // prevent null in lists
			ctx.InitAdminAreaSuccessOffers_leTesVLrEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Offer>(value14);
			}
			List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> value15 = result.getSuccessReturn().getBiddings();
			if (value15 != null) { // prevent null in lists
			ctx.InitAdminAreaSuccessBiddings_lecBkVLrEe2djpkPxa2Z3Q = new ArrayList<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding>(value15);
			}
			// branch 'success'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'InitAdminArea' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	
	// container for graph abstraction 'ShowOfferDetails' and sub process 'ShowOfferDetails'.
	public SIB_ID execute_ugApUVOnEe2KQc5QIsW97w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w instance = new info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_ugApUVOnEe2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult result = instance.execute(ctx.callStack , ctx.AdminAreaShow_offerOffer_5m_EMVLrEe2djpkPxa2Z3Q);
	
		return continue_ugApUVOnEe2KQc5QIsW97w(ctx, result);
	}
	
	public SIB_ID continue_ugApUVOnEe2KQc5QIsW97w(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult result = (info.scce.dime.process.onbroke.models.util.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97w.ShowOfferDetails___HYPHEN_MINUS__tSigVOiEe2KQc5QIsW97wResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "back": {
			// branch 'back'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowOfferDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowBiddingDetails' and sub process 'ShowBiddingDetails'.
	public SIB_ID execute_zC6z0VOnEe2KQc5QIsW97w(final Context ctx) {
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w instance = new info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w(ctx.beanManager);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_zC6z0VOnEe2KQc5QIsW97w", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult result = instance.execute(ctx.callStack , ctx.AdminAreaShow_biddingBidding_5nyVcVLrEe2djpkPxa2Z3Q);
	
		return continue_zC6z0VOnEe2KQc5QIsW97w(ctx, result);
	}
	
	public SIB_ID continue_zC6z0VOnEe2KQc5QIsW97w(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult result = (info.scce.dime.process.onbroke.models.util.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97w.ShowBiddingDetails_U_pfYVOlEe2KQc5QIsW97wResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "back": {
			// branch 'back'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowBiddingDetails' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowCreateOfferFeature' and sub process 'ShowCreateOfferFeature'.
	public SIB_ID execute_GrECEXVoEe2_CvdRyEmMCQ(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.admin.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvg.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_GrECEXVoEe2_CvdRyEmMCQ", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvg.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvgResult result = instance.execute(ctx.callStack );
	
		return continue_GrECEXVoEe2_CvdRyEmMCQ(ctx, result);
	}
	
	public SIB_ID continue_GrECEXVoEe2_CvdRyEmMCQ(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvg.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvgResult result = (info.scce.dime.process.onbroke.models.areas.admin.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvg.ShowCreateOfferFeature_1wwsIVuUEe2nXJXMw4vrvgResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
		case "cancel": {
			// branch 'cancel'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowCreateOfferFeature' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB FeatureDetails _U-x_UXVoEe2_CvdRyEmMCQ
	private static class InputsForGUISIB_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ {
		public de.ls5.dywa.generated.rest.types.Feature
		 feature;
	}
	
	
	// container for GUI SIB 'FeatureDetails'.
	public SIB_ID execute_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ(final Context ctx) {
	
		final info.scce.dime.rest.ObjectCache objectCache = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.rest.ObjectCache.class);
		final de.ls5.dywa.generated.rest.controller.FeatureREST inputsFeatureREST = info.scce.dime.util.CDIUtil.getManagedInstance(ctx.beanManager, de.ls5.dywa.generated.rest.controller.FeatureREST.class);
		
		final InputsForGUISIB_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ inputs = new InputsForGUISIB_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ();
		
		{
			de.ls5.dywa.generated.rest.types.Feature
			 result = null;
			de.ls5.dywa.generated.entity.onbroke.models.app.Feature obj = ctx.AdminAreaDetailsFeature_TWUMsXVoEe2_CvdRyEmMCQ;
			
			de.ls5.dywa.generated.rest.types.Feature restTO;
			
			if (obj != null) {
				if (obj.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
					// read_FeatureDetailsFeatureSelectivex1_ptsfcWEREe2Fx80Lw9BAUQ
					restTO = inputsFeatureREST.read_OfferDetailsFeatureSelectivex1x3x3_fcOIkVN8Ee2KQc5QIsW97w(obj.getDywaId());
				}
				else {
					restTO = objectCache.getRestTo(obj);
					if (restTO == null) {
						restTO = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(obj, objectCache);
					}
					// FeatureDetailsFeatureSelectivex1_ptsfcWEREe2Fx80Lw9BAUQ
					de.ls5.dywa.generated.rest.types.OfferDetailsFeatureSelectivex1x3x3_fcOIkVN8Ee2KQc5QIsW97w.copy(obj, restTO, objectCache);
				}
				result = restTO;
			}
			inputs.feature = result;
		}
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_U-x_UXVoEe2_CvdRyEmMCQ:_ptsfcWEREe2Fx80Lw9BAUQ", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_U-x_UXVoEe2_CvdRyEmMCQ", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_U-x_UXVoEe2_CvdRyEmMCQ");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.featuredetails.FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQResult result = (info.scce.dime.gui.onbroke.models.areas.admin.featuredetails.FeatureDetails_ptsfcWEREe2Fx80Lw9BAUQResult) guiResult;
		if ("Exit".equals(result.getBranchName())) {
			// branch 'Exit'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_U__HYPHEN_MINUS__x_UXVoEe2_CvdRyEmMCQ(ctx);
		}
	}
	// container for graph abstraction 'ShowCreateBiddingFeature' and sub process 'ShowCreateBiddingFeature'.
	public SIB_ID execute_lWSZQXVoEe2_CvdRyEmMCQ(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.admin.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_lWSZQXVoEe2_CvdRyEmMCQ", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult result = instance.execute(ctx.callStack );
	
		return continue_lWSZQXVoEe2_CvdRyEmMCQ(ctx, result);
	}
	
	public SIB_ID continue_lWSZQXVoEe2_CvdRyEmMCQ(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult result = (info.scce.dime.process.onbroke.models.areas.admin.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvg.ShowCreateBiddingFeature_14a94VuVEe2nXJXMw4vrvgResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
		case "cancel": {
			// branch 'cancel'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowCreateBiddingFeature' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'EditFeature' and sub process 'EditFeature'.
	public SIB_ID execute_yn3kEXVoEe2_CvdRyEmMCQ(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.admin.EditFeature_EYvFUVuZEe28kPQ81TnB9g instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.admin.EditFeature_EYvFUVuZEe28kPQ81TnB9g.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_yn3kEXVoEe2_CvdRyEmMCQ", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.admin.EditFeature_EYvFUVuZEe28kPQ81TnB9g.EditFeature_EYvFUVuZEe28kPQ81TnB9gResult result = instance.execute(ctx.callStack , ctx.AdminAreaEdit_featureFeature_tF5NEVLpEe2djpkPxa2Z3Q);
	
		return continue_yn3kEXVoEe2_CvdRyEmMCQ(ctx, result);
	}
	
	public SIB_ID continue_yn3kEXVoEe2_CvdRyEmMCQ(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.admin.EditFeature_EYvFUVuZEe28kPQ81TnB9g.EditFeature_EYvFUVuZEe28kPQ81TnB9gResult result = (info.scce.dime.process.onbroke.models.areas.admin.EditFeature_EYvFUVuZEe28kPQ81TnB9g.EditFeature_EYvFUVuZEe28kPQ81TnB9gResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
		case "cancel": {
			// branch 'cancel'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'EditFeature' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB DeleteFeature _EGVmEXVpEe2_CvdRyEmMCQ
	private static class InputsForGUISIB_EGVmEXVpEe2_CvdRyEmMCQ {
	}
	
	
	// container for GUI SIB 'DeleteFeature'.
	public SIB_ID execute_EGVmEXVpEe2_CvdRyEmMCQ(final Context ctx) {
	
		
		final InputsForGUISIB_EGVmEXVpEe2_CvdRyEmMCQ inputs = new InputsForGUISIB_EGVmEXVpEe2_CvdRyEmMCQ();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_EGVmEXVpEe2_CvdRyEmMCQ:_VDMMEVt7Ee20aa7PI0XDWg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_EGVmEXVpEe2_CvdRyEmMCQ", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_EGVmEXVpEe2_CvdRyEmMCQ(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_EGVmEXVpEe2_CvdRyEmMCQ");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult result = (info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult) guiResult;
		if ("Confirm_Delete".equals(result.getBranchName())) {
			// branch 'Confirm Delete'
			return SIB_ID._VoRLwXVpEe2_CvdRyEmMCQ;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_EGVmEXVpEe2_CvdRyEmMCQ(ctx);
		}
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_VoRLwXVpEe2_CvdRyEmMCQ(final Context ctx) {
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController domController = this.FeatureController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.Feature instanceToDelete = ctx.AdminAreaDelete_featureFeature_tGEzQVLpEe2djpkPxa2Z3Q;
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				instanceToDelete.setpriority(null);
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}
		// branch 'deleted'
		return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
	}
	// container for graph abstraction 'ShowCreateUser' and sub process 'ShowCreateUser'.
	public SIB_ID execute_iS_x8XVpEe2_CvdRyEmMCQ(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.admin.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_iS_x8XVpEe2_CvdRyEmMCQ", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult result = instance.execute(ctx.callStack );
	
		return continue_iS_x8XVpEe2_CvdRyEmMCQ(ctx, result);
	}
	
	public SIB_ID continue_iS_x8XVpEe2_CvdRyEmMCQ(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult result = (info.scce.dime.process.onbroke.models.areas.admin.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmg.ShowCreateUser_EP__HYPHEN_MINUS__IgV3WEe2t19MJLPzxmgResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "cancel": {
			// branch 'cancel'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
		case "success": {
			// branch 'success'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
			default: throw new IllegalStateException("SIB 'ShowCreateUser' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// container for graph abstraction 'ShowEditUser' and sub process 'ShowEditUser'.
	public SIB_ID execute_43eEcXVpEe2_CvdRyEmMCQ(final Context ctx) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowEditUser_p4xdMWBEEe2RjrkbQARhdg instance = CDIUtil.getManagedInstance(ctx.beanManager, info.scce.dime.process.onbroke.models.areas.admin.ShowEditUser_p4xdMWBEEe2RjrkbQARhdg.class);
	
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_43eEcXVpEe2_CvdRyEmMCQ", ctx, ctx.lastMajorSIBId);
		ctx.callStack.getCallFrames().add(currentFrame);
	
		final info.scce.dime.process.onbroke.models.areas.admin.ShowEditUser_p4xdMWBEEe2RjrkbQARhdg.ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult result = instance.execute(ctx.callStack , null);
	
		return continue_43eEcXVpEe2_CvdRyEmMCQ(ctx, result);
	}
	
	public SIB_ID continue_43eEcXVpEe2_CvdRyEmMCQ(Context ctx, Object slgResult) {
		final info.scce.dime.process.onbroke.models.areas.admin.ShowEditUser_p4xdMWBEEe2RjrkbQARhdg.ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult result = (info.scce.dime.process.onbroke.models.areas.admin.ShowEditUser_p4xdMWBEEe2RjrkbQARhdg.ShowEditUser_p4xdMWBEEe2RjrkbQARhdgResult) slgResult;
		// clean up inner execution
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size() - 1);
		
		switch(result.getBranchName()) {
		case "success": {
			// branch 'success'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
		case "cancel": {
			// branch 'cancel'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
			default: throw new IllegalStateException("SIB 'ShowEditUser' has no successor defined for branch '" + result.getBranchName() + '\'');
		}
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB DeleteFeature _kAAQ4XVqEe2_CvdRyEmMCQ
	private static class InputsForGUISIB_kAAQ4XVqEe2_CvdRyEmMCQ {
	}
	
	
	// container for GUI SIB 'DeleteFeature'.
	public SIB_ID execute_kAAQ4XVqEe2_CvdRyEmMCQ(final Context ctx) {
	
		
		final InputsForGUISIB_kAAQ4XVqEe2_CvdRyEmMCQ inputs = new InputsForGUISIB_kAAQ4XVqEe2_CvdRyEmMCQ();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_kAAQ4XVqEe2_CvdRyEmMCQ:_VDMMEVt7Ee20aa7PI0XDWg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_kAAQ4XVqEe2_CvdRyEmMCQ", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_kAAQ4XVqEe2_CvdRyEmMCQ(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_kAAQ4XVqEe2_CvdRyEmMCQ");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult result = (info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult) guiResult;
		if ("Confirm_Delete".equals(result.getBranchName())) {
			// branch 'Confirm Delete'
			return SIB_ID._rrHicXVqEe2_CvdRyEmMCQ;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_kAAQ4XVqEe2_CvdRyEmMCQ(ctx);
		}
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_rrHicXVqEe2_CvdRyEmMCQ(final Context ctx) {
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.UserController domController = this.UserController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.User instanceToDelete = ctx.AdminAreaDelete_userUser_5mqUEVLrEe2djpkPxa2Z3Q;
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				instanceToDelete.setbaseUser(null);
				instanceToDelete.setrole(null);
				instanceToDelete.getoffers_Offer().clear();
				instanceToDelete.getbiddings_Bidding().clear();
				instanceToDelete.setcomment(null);
				instanceToDelete.setdywaSwitchedTo(null);
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}	
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController domController = this.BaseUserController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser instanceToDelete = Optional.ofNullable(ctx.user).map(de.ls5.dywa.generated.entity.onbroke.models.app.User::getbaseUser).orElse(null);
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				instanceToDelete.getuser_User().clear();
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}
		// branch 'deleted'
		return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB DeleteFeature _j8aU4XVrEe2_CvdRyEmMCQ
	private static class InputsForGUISIB_j8aU4XVrEe2_CvdRyEmMCQ {
	}
	
	
	// container for GUI SIB 'DeleteFeature'.
	public SIB_ID execute_j8aU4XVrEe2_CvdRyEmMCQ(final Context ctx) {
	
		
		final InputsForGUISIB_j8aU4XVrEe2_CvdRyEmMCQ inputs = new InputsForGUISIB_j8aU4XVrEe2_CvdRyEmMCQ();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_j8aU4XVrEe2_CvdRyEmMCQ:_VDMMEVt7Ee20aa7PI0XDWg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_j8aU4XVrEe2_CvdRyEmMCQ", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_j8aU4XVrEe2_CvdRyEmMCQ(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_j8aU4XVrEe2_CvdRyEmMCQ");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult result = (info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult) guiResult;
		if ("Confirm_Delete".equals(result.getBranchName())) {
			// branch 'Confirm Delete'
			return SIB_ID._obHU0XVrEe2_CvdRyEmMCQ;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._ZewJIVFOEe2J0bu3ffrh5w;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_j8aU4XVrEe2_CvdRyEmMCQ(ctx);
		}
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_obHU0XVrEe2_CvdRyEmMCQ(final Context ctx) {
		{
			final de.ls5.dywa.generated.controller.onbroke.models.app.OfferController domController = this.OfferController;
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.Offer instanceToDelete = ctx.AdminAreaDelete_offerOffer_5ngBkVLrEe2djpkPxa2Z3Q;
			if (instanceToDelete != null) {
			
				// Clear attribute values in order to release all bidirectional associations from this object.
				instanceToDelete.setuser(null);
				instanceToDelete.getbiddings_Bidding().clear();
				instanceToDelete.getpreferences_Feature().clear();
				instanceToDelete.getfeatures_Feature().clear();
				instanceToDelete.setstatus(null);
				domController.deleteWithIncomingReferences(instanceToDelete);
			}
		}
		// branch 'deleted'
		return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
	}
	// Input class -- generated by info.scce.dime.generator.process.BackendProcessGeneratorHelper#renderInputClass(SIB)
	//   for SIB DeleteFeature _GqNwsXVsEe2_CvdRyEmMCQ
	private static class InputsForGUISIB_GqNwsXVsEe2_CvdRyEmMCQ {
	}
	
	
	// container for GUI SIB 'DeleteFeature'.
	public SIB_ID execute_GqNwsXVsEe2_CvdRyEmMCQ(final Context ctx) {
	
		
		final InputsForGUISIB_GqNwsXVsEe2_CvdRyEmMCQ inputs = new InputsForGUISIB_GqNwsXVsEe2_CvdRyEmMCQ();
		
		
		final CallFrame currentFrame = new CallFrame("info.scce.dime.process.onbroke.models.areas.admin.ShowAdminArea_rHwukVFLEe2Vgcav4Znc_w:_GqNwsXVsEe2_CvdRyEmMCQ:_VDMMEVt7Ee20aa7PI0XDWg", ctx, ctx.lastMajorSIBId);
		
		ctx.callStack.getCallFrames().add(currentFrame);
	
		GUIEncounteredSignal signal = new GUIEncounteredSignal(ctx.callStack, "_GqNwsXVsEe2_CvdRyEmMCQ", inputs);
		
		throw signal;
	}
	
	public SIB_ID continue_GqNwsXVsEe2_CvdRyEmMCQ(Context ctx, Object guiResult) {
		if(ctx.callStack.isAuthenticationRequired()) {
			final Subject shiroSubj = SecurityUtils.getSubject();
			if (!shiroSubj.isAuthenticated()) {
				GUIEncounteredSignal sig = new GUIEncounteredSignal(ctx.callStack, "_GqNwsXVsEe2_CvdRyEmMCQ");
				sig.setStatus(401);
				throw sig;
			}
		}
		
		ctx.callStack.getCallFrames().remove(ctx.callStack.getCallFrames().size()-1);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult result = (info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult) guiResult;
		if ("Confirm_Delete".equals(result.getBranchName())) {
			// branch 'Confirm Delete'
			return SIB_ID._JqQaQXVsEe2_CvdRyEmMCQ;
		} else 
		if ("Cancel".equals(result.getBranchName())) {
			// branch 'Cancel'
			return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
		}
		else {
			// unspecified branch, show same GUI again
			return execute_GqNwsXVsEe2_CvdRyEmMCQ(ctx);
		}
	}
	// container for delete SIB 'Delete'.
	public SIB_ID execute_JqQaQXVsEe2_CvdRyEmMCQ(final Context ctx) {
		// branch 'deleted'
		return SIB_ID._ldrMkFLrEe2djpkPxa2Z3Q;
	}
	
}  

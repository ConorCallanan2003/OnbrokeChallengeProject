package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Feature extends info.scce.dime.rest.RESTBaseType  {

	Priority
	 getpriority();
	boolean isprioritySet();

	void setpriority(final Priority
	 priority);
	java.lang.Boolean
	 getisTemplateForOffer();
	boolean isisTemplateForOfferSet();

	void setisTemplateForOffer(final java.lang.Boolean
	 isTemplateForOffer);
	java.lang.String
	 gettitle();
	boolean istitleSet();

	void settitle(final java.lang.String
	 title);
	java.lang.Boolean
	 getisTemplateForBidding();
	boolean isisTemplateForBiddingSet();

	void setisTemplateForBidding(final java.lang.Boolean
	 isTemplateForBidding);

	public static Feature fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.Feature entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Feature result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Feature) {
			result = new de.ls5.dywa.generated.rest.types.FeatureImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

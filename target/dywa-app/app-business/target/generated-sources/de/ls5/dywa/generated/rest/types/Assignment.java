package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Assignment extends info.scce.dime.rest.RESTBaseType  {

	Offer
	 getoffer();
	boolean isofferSet();

	void setoffer(final Offer
	 offer);
	Bidding
	 getbidding();
	boolean isbiddingSet();

	void setbidding(final Bidding
	 bidding);

	public static Assignment fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.Assignment entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Assignment result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Assignment) {
			result = new de.ls5.dywa.generated.rest.types.AssignmentImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

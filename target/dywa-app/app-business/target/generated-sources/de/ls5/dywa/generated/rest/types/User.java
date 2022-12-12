package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface User extends info.scce.dime.rest.RESTBaseType  {

	BaseUser
	 getbaseUser();
	boolean isbaseUserSet();

	void setbaseUser(final BaseUser
	 baseUser);
	UserRole
	 getrole();
	boolean isroleSet();

	void setrole(final UserRole
	 role);
	java.util.List<
	Offer
	>
	 getoffers_Offer();
	boolean isoffers_OfferSet();

	void setoffers_Offer(final java.util.List<
	Offer
	>
	 offers);
	java.util.List<
	Bidding
	>
	 getbiddings_Bidding();
	boolean isbiddings_BiddingSet();

	void setbiddings_Bidding(final java.util.List<
	Bidding
	>
	 biddings);
	Comment
	 getcomment();
	boolean iscommentSet();

	void setcomment(final Comment
	 comment);
	User
	 getdywaSwitchedTo();
	boolean isdywaSwitchedToSet();

	void setdywaSwitchedTo(final User
	 dywaSwitchedTo);
	java.lang.String
	 getfirstName();
	boolean isfirstNameSet();

	void setfirstName(final java.lang.String
	 firstName);
	java.lang.String
	 getlastName();
	boolean islastNameSet();

	void setlastName(final java.lang.String
	 lastName);

	public static User fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.User entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final User result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.User) {
			result = new de.ls5.dywa.generated.rest.types.UserImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

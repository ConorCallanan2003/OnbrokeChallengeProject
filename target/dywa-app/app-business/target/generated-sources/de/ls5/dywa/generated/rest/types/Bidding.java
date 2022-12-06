package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Bidding extends info.scce.dime.rest.RESTBaseType , Submission
 {

	User
	 getuser();
	boolean isuserSet();

	void setuser(final User
	 user);
	Offer
	 getoffer();
	boolean isofferSet();

	void setoffer(final Offer
	 offer);
	java.util.List<
	Feature
	>
	 getfeatures_Feature();
	boolean isfeatures_FeatureSet();

	void setfeatures_Feature(final java.util.List<
	Feature
	>
	 features);
	java.util.List<
	Feature
	>
	 getpreferences_Feature();
	boolean ispreferences_FeatureSet();

	void setpreferences_Feature(final java.util.List<
	Feature
	>
	 preferences);
	Report
	 getreport();
	boolean isreportSet();

	void setreport(final Report
	 report);
	Decision
	 getdecision();
	boolean isdecisionSet();

	void setdecision(final Decision
	 decision);
	java.util.List<
	Issue
	>
	 getissues_Issue();
	boolean isissues_IssueSet();

	void setissues_Issue(final java.util.List<
	Issue
	>
	 issues);
	java.lang.Boolean
	 getassigned();
	boolean isassignedSet();

	void setassigned(final java.lang.Boolean
	 assigned);
	java.lang.String
	 gettitle();
	boolean istitleSet();

	void settitle(final java.lang.String
	 title);
	java.lang.Boolean
	 getuserCanDiscuss();
	boolean isuserCanDiscussSet();

	void setuserCanDiscuss(final java.lang.Boolean
	 userCanDiscuss);

	public static Bidding fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Bidding result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Bidding) {
			result = new de.ls5.dywa.generated.rest.types.BiddingImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class OfferImpl extends info.scce.dime.rest.RESTBaseImpl implements Offer
 {

	private User
	 user;
	private boolean isuserSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("user")
	@info.scce.dime.rest.JsonRenderIndicator("isuserSet")
	@java.lang.Override
	public User
	 getuser() {
		return this.user;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isuserSet() {
		return this.isuserSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("user")
	@java.lang.Override
	public void setuser(final User
	 user) {
		this.user = user;
		this.isuserSet = true;
	}

	private java.util.List<
	Bidding
	>
	 biddings = new java.util.LinkedList<>();
	private boolean isbiddingsSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("biddings")
	@info.scce.dime.rest.JsonRenderIndicator("isbiddings_BiddingSet")
	@java.lang.Override
	public java.util.List<
	Bidding
	>
	 getbiddings_Bidding() {
		return this.biddings;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isbiddings_BiddingSet() {
		return this.isbiddingsSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("biddings")
	@java.lang.Override
	public void setbiddings_Bidding(final java.util.List<
	Bidding
	>
	 biddings) {
		this.biddings = biddings;
		this.isbiddingsSet = true;
	}

	private java.util.List<
	Feature
	>
	 preferences = new java.util.LinkedList<>();
	private boolean ispreferencesSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("preferences")
	@info.scce.dime.rest.JsonRenderIndicator("ispreferences_FeatureSet")
	@java.lang.Override
	public java.util.List<
	Feature
	>
	 getpreferences_Feature() {
		return this.preferences;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean ispreferences_FeatureSet() {
		return this.ispreferencesSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("preferences")
	@java.lang.Override
	public void setpreferences_Feature(final java.util.List<
	Feature
	>
	 preferences) {
		this.preferences = preferences;
		this.ispreferencesSet = true;
	}

	private java.util.List<
	Feature
	>
	 features = new java.util.LinkedList<>();
	private boolean isfeaturesSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("features")
	@info.scce.dime.rest.JsonRenderIndicator("isfeatures_FeatureSet")
	@java.lang.Override
	public java.util.List<
	Feature
	>
	 getfeatures_Feature() {
		return this.features;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isfeatures_FeatureSet() {
		return this.isfeaturesSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("features")
	@java.lang.Override
	public void setfeatures_Feature(final java.util.List<
	Feature
	>
	 features) {
		this.features = features;
		this.isfeaturesSet = true;
	}

	private Report
	 report;
	private boolean isreportSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("report")
	@info.scce.dime.rest.JsonRenderIndicator("isreportSet")
	@java.lang.Override
	public Report
	 getreport() {
		return this.report;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isreportSet() {
		return this.isreportSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("report")
	@java.lang.Override
	public void setreport(final Report
	 report) {
		this.report = report;
		this.isreportSet = true;
	}

	private Decision
	 decision;
	private boolean isdecisionSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("decision")
	@info.scce.dime.rest.JsonRenderIndicator("isdecisionSet")
	@java.lang.Override
	public Decision
	 getdecision() {
		return this.decision;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isdecisionSet() {
		return this.isdecisionSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("decision")
	@java.lang.Override
	public void setdecision(final Decision
	 decision) {
		this.decision = decision;
		this.isdecisionSet = true;
	}

	private java.util.List<
	Issue
	>
	 issues = new java.util.LinkedList<>();
	private boolean isissuesSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("issues")
	@info.scce.dime.rest.JsonRenderIndicator("isissues_IssueSet")
	@java.lang.Override
	public java.util.List<
	Issue
	>
	 getissues_Issue() {
		return this.issues;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isissues_IssueSet() {
		return this.isissuesSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("issues")
	@java.lang.Override
	public void setissues_Issue(final java.util.List<
	Issue
	>
	 issues) {
		this.issues = issues;
		this.isissuesSet = true;
	}

	private java.lang.Boolean
	 assigned;
	private boolean isassignedSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("assigned")
	@info.scce.dime.rest.JsonRenderIndicator("isassignedSet")
	@java.lang.Override
	public java.lang.Boolean
	 getassigned() {
		return this.assigned;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isassignedSet() {
		return this.isassignedSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("assigned")
	@java.lang.Override
	public void setassigned(final java.lang.Boolean
	 assigned) {
		this.assigned = assigned;
		this.isassignedSet = true;
	}

	private java.lang.String
	 title;
	private boolean istitleSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("title")
	@info.scce.dime.rest.JsonRenderIndicator("istitleSet")
	@java.lang.Override
	public java.lang.String
	 gettitle() {
		return this.title;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean istitleSet() {
		return this.istitleSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("title")
	@java.lang.Override
	public void settitle(final java.lang.String
	 title) {
		this.title = title;
		this.istitleSet = true;
	}

	private java.lang.Boolean
	 userCanDiscuss;
	private boolean isuserCanDiscussSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("userCanDiscuss")
	@info.scce.dime.rest.JsonRenderIndicator("isuserCanDiscussSet")
	@java.lang.Override
	public java.lang.Boolean
	 getuserCanDiscuss() {
		return this.userCanDiscuss;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isuserCanDiscussSet() {
		return this.isuserCanDiscussSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("userCanDiscuss")
	@java.lang.Override
	public void setuserCanDiscuss(final java.lang.Boolean
	 userCanDiscuss) {
		this.userCanDiscuss = userCanDiscuss;
		this.isuserCanDiscussSet = true;
	}

	
}

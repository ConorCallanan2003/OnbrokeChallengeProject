package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class FeatureImpl extends info.scce.dime.rest.RESTBaseImpl implements Feature
 {

	private Priority
	 priority;
	private boolean isprioritySet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("priority")
	@info.scce.dime.rest.JsonRenderIndicator("isprioritySet")
	@java.lang.Override
	public Priority
	 getpriority() {
		return this.priority;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isprioritySet() {
		return this.isprioritySet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("priority")
	@java.lang.Override
	public void setpriority(final Priority
	 priority) {
		this.priority = priority;
		this.isprioritySet = true;
	}

	private java.lang.Boolean
	 isTemplateForOffer;
	private boolean isisTemplateForOfferSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("isTemplateForOffer")
	@info.scce.dime.rest.JsonRenderIndicator("isisTemplateForOfferSet")
	@java.lang.Override
	public java.lang.Boolean
	 getisTemplateForOffer() {
		return this.isTemplateForOffer;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isisTemplateForOfferSet() {
		return this.isisTemplateForOfferSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("isTemplateForOffer")
	@java.lang.Override
	public void setisTemplateForOffer(final java.lang.Boolean
	 isTemplateForOffer) {
		this.isTemplateForOffer = isTemplateForOffer;
		this.isisTemplateForOfferSet = true;
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
	 isTemplateForBidding;
	private boolean isisTemplateForBiddingSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("isTemplateForBidding")
	@info.scce.dime.rest.JsonRenderIndicator("isisTemplateForBiddingSet")
	@java.lang.Override
	public java.lang.Boolean
	 getisTemplateForBidding() {
		return this.isTemplateForBidding;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isisTemplateForBiddingSet() {
		return this.isisTemplateForBiddingSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("isTemplateForBidding")
	@java.lang.Override
	public void setisTemplateForBidding(final java.lang.Boolean
	 isTemplateForBidding) {
		this.isTemplateForBidding = isTemplateForBidding;
		this.isisTemplateForBiddingSet = true;
	}

	
}

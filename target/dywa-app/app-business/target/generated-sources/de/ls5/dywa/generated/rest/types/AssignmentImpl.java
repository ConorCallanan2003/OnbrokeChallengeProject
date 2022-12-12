package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class AssignmentImpl extends info.scce.dime.rest.RESTBaseImpl implements Assignment
 {

	private Offer
	 offer;
	private boolean isofferSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("offer")
	@info.scce.dime.rest.JsonRenderIndicator("isofferSet")
	@java.lang.Override
	public Offer
	 getoffer() {
		return this.offer;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isofferSet() {
		return this.isofferSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("offer")
	@java.lang.Override
	public void setoffer(final Offer
	 offer) {
		this.offer = offer;
		this.isofferSet = true;
	}

	private Bidding
	 bidding;
	private boolean isbiddingSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("bidding")
	@info.scce.dime.rest.JsonRenderIndicator("isbiddingSet")
	@java.lang.Override
	public Bidding
	 getbidding() {
		return this.bidding;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isbiddingSet() {
		return this.isbiddingSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("bidding")
	@java.lang.Override
	public void setbidding(final Bidding
	 bidding) {
		this.bidding = bidding;
		this.isbiddingSet = true;
	}

	
}

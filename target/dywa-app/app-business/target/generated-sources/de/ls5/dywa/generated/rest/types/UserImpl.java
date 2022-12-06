package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class UserImpl extends info.scce.dime.rest.RESTBaseImpl implements User
 {

	private BaseUser
	 baseUser;
	private boolean isbaseUserSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("baseUser")
	@info.scce.dime.rest.JsonRenderIndicator("isbaseUserSet")
	@java.lang.Override
	public BaseUser
	 getbaseUser() {
		return this.baseUser;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isbaseUserSet() {
		return this.isbaseUserSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("baseUser")
	@java.lang.Override
	public void setbaseUser(final BaseUser
	 baseUser) {
		this.baseUser = baseUser;
		this.isbaseUserSet = true;
	}

	private UserRole
	 role;
	private boolean isroleSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("role")
	@info.scce.dime.rest.JsonRenderIndicator("isroleSet")
	@java.lang.Override
	public UserRole
	 getrole() {
		return this.role;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isroleSet() {
		return this.isroleSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("role")
	@java.lang.Override
	public void setrole(final UserRole
	 role) {
		this.role = role;
		this.isroleSet = true;
	}

	private java.util.List<
	Offer
	>
	 offers = new java.util.LinkedList<>();
	private boolean isoffersSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("offers")
	@info.scce.dime.rest.JsonRenderIndicator("isoffers_OfferSet")
	@java.lang.Override
	public java.util.List<
	Offer
	>
	 getoffers_Offer() {
		return this.offers;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isoffers_OfferSet() {
		return this.isoffersSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("offers")
	@java.lang.Override
	public void setoffers_Offer(final java.util.List<
	Offer
	>
	 offers) {
		this.offers = offers;
		this.isoffersSet = true;
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

	private User
	 dywaSwitchedTo;
	private boolean isdywaSwitchedToSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("dywaSwitchedTo")
	@info.scce.dime.rest.JsonRenderIndicator("isdywaSwitchedToSet")
	@java.lang.Override
	public User
	 getdywaSwitchedTo() {
		return this.dywaSwitchedTo;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isdywaSwitchedToSet() {
		return this.isdywaSwitchedToSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("dywaSwitchedTo")
	@java.lang.Override
	public void setdywaSwitchedTo(final User
	 dywaSwitchedTo) {
		this.dywaSwitchedTo = dywaSwitchedTo;
		this.isdywaSwitchedToSet = true;
	}

	private java.lang.String
	 firstName;
	private boolean isfirstNameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("firstName")
	@info.scce.dime.rest.JsonRenderIndicator("isfirstNameSet")
	@java.lang.Override
	public java.lang.String
	 getfirstName() {
		return this.firstName;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isfirstNameSet() {
		return this.isfirstNameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("firstName")
	@java.lang.Override
	public void setfirstName(final java.lang.String
	 firstName) {
		this.firstName = firstName;
		this.isfirstNameSet = true;
	}

	private java.lang.String
	 lastName;
	private boolean islastNameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("lastName")
	@info.scce.dime.rest.JsonRenderIndicator("islastNameSet")
	@java.lang.Override
	public java.lang.String
	 getlastName() {
		return this.lastName;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean islastNameSet() {
		return this.islastNameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("lastName")
	@java.lang.Override
	public void setlastName(final java.lang.String
	 lastName) {
		this.lastName = lastName;
		this.islastNameSet = true;
	}

	
}

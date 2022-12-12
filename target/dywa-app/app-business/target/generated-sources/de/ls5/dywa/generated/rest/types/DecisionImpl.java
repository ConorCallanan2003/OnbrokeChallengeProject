package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class DecisionImpl extends info.scce.dime.rest.RESTBaseImpl implements Decision
 {

	private DecisionState
	 state;
	private boolean isstateSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("state")
	@info.scce.dime.rest.JsonRenderIndicator("isstateSet")
	@java.lang.Override
	public DecisionState
	 getstate() {
		return this.state;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isstateSet() {
		return this.isstateSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("state")
	@java.lang.Override
	public void setstate(final DecisionState
	 state) {
		this.state = state;
		this.isstateSet = true;
	}

	
}

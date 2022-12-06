package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class CommentImpl extends info.scce.dime.rest.RESTBaseImpl implements Comment
 {

	private java.lang.String
	 text;
	private boolean istextSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("text")
	@info.scce.dime.rest.JsonRenderIndicator("istextSet")
	@java.lang.Override
	public java.lang.String
	 gettext() {
		return this.text;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean istextSet() {
		return this.istextSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("text")
	@java.lang.Override
	public void settext(final java.lang.String
	 text) {
		this.text = text;
		this.istextSet = true;
	}

	
}

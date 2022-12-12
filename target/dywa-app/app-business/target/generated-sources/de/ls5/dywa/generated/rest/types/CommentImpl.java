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

	private java.lang.String
	 commentFirstName;
	private boolean iscommentFirstNameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("commentFirstName")
	@info.scce.dime.rest.JsonRenderIndicator("iscommentFirstNameSet")
	@java.lang.Override
	public java.lang.String
	 getcommentFirstName() {
		return this.commentFirstName;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iscommentFirstNameSet() {
		return this.iscommentFirstNameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("commentFirstName")
	@java.lang.Override
	public void setcommentFirstName(final java.lang.String
	 commentFirstName) {
		this.commentFirstName = commentFirstName;
		this.iscommentFirstNameSet = true;
	}

	private java.lang.String
	 commentLastName;
	private boolean iscommentLastNameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("commentLastName")
	@info.scce.dime.rest.JsonRenderIndicator("iscommentLastNameSet")
	@java.lang.Override
	public java.lang.String
	 getcommentLastName() {
		return this.commentLastName;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iscommentLastNameSet() {
		return this.iscommentLastNameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("commentLastName")
	@java.lang.Override
	public void setcommentLastName(final java.lang.String
	 commentLastName) {
		this.commentLastName = commentLastName;
		this.iscommentLastNameSet = true;
	}

	
}

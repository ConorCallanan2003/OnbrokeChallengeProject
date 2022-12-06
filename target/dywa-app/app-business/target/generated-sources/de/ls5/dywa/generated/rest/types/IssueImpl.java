package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class IssueImpl extends info.scce.dime.rest.RESTBaseImpl implements Issue
 {

	private java.util.List<
	Comment
	>
	 comments = new java.util.LinkedList<>();
	private boolean iscommentsSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("comments")
	@info.scce.dime.rest.JsonRenderIndicator("iscomments_CommentSet")
	@java.lang.Override
	public java.util.List<
	Comment
	>
	 getcomments_Comment() {
		return this.comments;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean iscomments_CommentSet() {
		return this.iscommentsSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("comments")
	@java.lang.Override
	public void setcomments_Comment(final java.util.List<
	Comment
	>
	 comments) {
		this.comments = comments;
		this.iscommentsSet = true;
	}

	private IssueState
	 state;
	private boolean isstateSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("state")
	@info.scce.dime.rest.JsonRenderIndicator("isstateSet")
	@java.lang.Override
	public IssueState
	 getstate() {
		return this.state;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isstateSet() {
		return this.isstateSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("state")
	@java.lang.Override
	public void setstate(final IssueState
	 state) {
		this.state = state;
		this.isstateSet = true;
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

	
}

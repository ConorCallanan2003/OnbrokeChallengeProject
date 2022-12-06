package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Issue extends info.scce.dime.rest.RESTBaseType  {

	java.util.List<
	Comment
	>
	 getcomments_Comment();
	boolean iscomments_CommentSet();

	void setcomments_Comment(final java.util.List<
	Comment
	>
	 comments);
	IssueState
	 getstate();
	boolean isstateSet();

	void setstate(final IssueState
	 state);
	java.lang.String
	 gettitle();
	boolean istitleSet();

	void settitle(final java.lang.String
	 title);

	public static Issue fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.Issue entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Issue result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Issue) {
			result = new de.ls5.dywa.generated.rest.types.IssueImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

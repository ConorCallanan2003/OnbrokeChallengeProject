package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Comment extends info.scce.dime.rest.RESTBaseType  {

	java.lang.String
	 gettext();
	boolean istextSet();

	void settext(final java.lang.String
	 text);

	public static Comment fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.Comment entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Comment result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Comment) {
			result = new de.ls5.dywa.generated.rest.types.CommentImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

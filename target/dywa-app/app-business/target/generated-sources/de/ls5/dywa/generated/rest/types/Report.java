package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Report extends info.scce.dime.rest.RESTBaseType  {


	public static Report fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.Report entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Report result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Report) {
			result = new de.ls5.dywa.generated.rest.types.ReportImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

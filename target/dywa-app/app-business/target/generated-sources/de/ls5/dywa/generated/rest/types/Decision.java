package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public interface Decision extends info.scce.dime.rest.RESTBaseType  {

	DecisionState
	 getstate();
	boolean isstateSet();

	void setstate(final DecisionState
	 state);

	public static Decision fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.Decision entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final Decision result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Decision) {
			result = new de.ls5.dywa.generated.rest.types.DecisionImpl();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

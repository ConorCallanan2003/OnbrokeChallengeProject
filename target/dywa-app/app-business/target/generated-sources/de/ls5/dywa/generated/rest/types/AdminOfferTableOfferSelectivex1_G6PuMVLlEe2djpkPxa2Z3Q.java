// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class AdminOfferTableOfferSelectivex1_G6PuMVLlEe2djpkPxa2Z3Q {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer from,
		final de.ls5.dywa.generated.rest.types.Offer to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "AdminOfferTableOfferSelectivex1_G6PuMVLlEe2djpkPxa2Z3Q")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "AdminOfferTableOfferSelectivex1_G6PuMVLlEe2djpkPxa2Z3Q");
	
		if (from instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Submission && to instanceof de.ls5.dywa.generated.rest.types.Submission) { // TODO: maybe use dispatch methods
			final de.ls5.dywa.generated.entity.onbroke.models.app.Submission effectiveFrom = (de.ls5.dywa.generated.entity.onbroke.models.app.Submission) from;
			final de.ls5.dywa.generated.rest.types.Submission effectiveTo = (de.ls5.dywa.generated.rest.types.Submission) to;
		effectiveTo.settitle(effectiveFrom.gettitle());
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Offer effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Offer effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.User
		 source = effectiveFrom.getuser();
		if (source != null) {
			// original selective: AdminOfferTableUserSelectivex1x2x2_G6PuMVLlEe2djpkPxa2Z3Q
			de.ls5.dywa.generated.rest.types.User cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "EditAssignmentUserSelectivex1x10x10x18x18x2x2_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA")) {
				de.ls5.dywa.generated.rest.types.EditAssignmentUserSelectivex1x10x10x18x18x2x2_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(source, cached, objectCache);
			}
		
			effectiveTo.setuser(cached);
		}
		}
	}
}

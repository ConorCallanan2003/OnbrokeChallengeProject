// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class BiddingDetailsOfferSelectivex1x3x3_zSAVgVOjEe2KQc5QIsW97w {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer from,
		final de.ls5.dywa.generated.rest.types.Offer to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "BiddingDetailsOfferSelectivex1x3x3_zSAVgVOjEe2KQc5QIsW97w")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "BiddingDetailsOfferSelectivex1x3x3_zSAVgVOjEe2KQc5QIsW97w");
	
	}
}

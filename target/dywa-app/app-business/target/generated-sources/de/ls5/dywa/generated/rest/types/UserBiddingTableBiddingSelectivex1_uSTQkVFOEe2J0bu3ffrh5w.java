// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class UserBiddingTableBiddingSelectivex1_uSTQkVFOEe2J0bu3ffrh5w {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding from,
		final de.ls5.dywa.generated.rest.types.Bidding to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "UserBiddingTableBiddingSelectivex1_uSTQkVFOEe2J0bu3ffrh5w")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "UserBiddingTableBiddingSelectivex1_uSTQkVFOEe2J0bu3ffrh5w");
	
		if (from instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Submission && to instanceof de.ls5.dywa.generated.rest.types.Submission) { // TODO: maybe use dispatch methods
			final de.ls5.dywa.generated.entity.onbroke.models.app.Submission effectiveFrom = (de.ls5.dywa.generated.entity.onbroke.models.app.Submission) from;
			final de.ls5.dywa.generated.rest.types.Submission effectiveTo = (de.ls5.dywa.generated.rest.types.Submission) to;
		effectiveTo.settitle(effectiveFrom.gettitle());
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer
		 source = effectiveFrom.getoffer();
		if (source != null) {
			// original selective: UserBiddingTableOfferSelectivex1x12x12_uSTQkVFOEe2J0bu3ffrh5w
			de.ls5.dywa.generated.rest.types.Offer cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "AdminBiddingTableOfferSelectivex1x1x1_QIJywVLmEe2djpkPxa2Z3Q")) {
				de.ls5.dywa.generated.rest.types.AdminBiddingTableOfferSelectivex1x1x1_QIJywVLmEe2djpkPxa2Z3Q.copy(source, cached, objectCache);
			}
		
			effectiveTo.setoffer(cached);
		}
		}
	}
}

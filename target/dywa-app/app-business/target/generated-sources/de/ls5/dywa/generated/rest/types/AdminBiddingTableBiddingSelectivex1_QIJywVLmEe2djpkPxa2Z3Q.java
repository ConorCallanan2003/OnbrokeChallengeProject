// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding from,
		final de.ls5.dywa.generated.rest.types.Bidding to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q");
	
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer
		 source = effectiveFrom.getoffer();
		if (source != null) {
			// original selective: AdminBiddingTableOfferSelectivex1x1x1_QIJywVLmEe2djpkPxa2Z3Q
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
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.User
		 source = effectiveFrom.getuser();
		if (source != null) {
			// original selective: AdminBiddingTableUserSelectivex1x2x2_QIJywVLmEe2djpkPxa2Z3Q
			de.ls5.dywa.generated.rest.types.User cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "EditAssignmentUserSelectivex1x12x12x19x19x2x2_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA")) {
				de.ls5.dywa.generated.rest.types.EditAssignmentUserSelectivex1x12x12x19x19x2x2_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA.copy(source, cached, objectCache);
			}
		
			effectiveTo.setuser(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.Status
		 source = effectiveFrom.getstatus();
		if (source != null) {
			// original selective: AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q
			de.ls5.dywa.generated.rest.types.Status cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Status.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q")) {
				de.ls5.dywa.generated.rest.types.AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q.copy(source, cached, objectCache);
			}
		
			effectiveTo.setstatus(cached);
		}
		}
	}
}

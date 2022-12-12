// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class BrokerAreaOfferSelectivex2_dCbEMVFOEe2J0bu3ffrh5w {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer from,
		final de.ls5.dywa.generated.rest.types.Offer to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "BrokerAreaOfferSelectivex2_dCbEMVFOEe2J0bu3ffrh5w")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "BrokerAreaOfferSelectivex2_dCbEMVFOEe2J0bu3ffrh5w");
	
		if (from instanceof de.ls5.dywa.generated.entity.onbroke.models.app.Submission && to instanceof de.ls5.dywa.generated.rest.types.Submission) { // TODO: maybe use dispatch methods
			final de.ls5.dywa.generated.entity.onbroke.models.app.Submission effectiveFrom = (de.ls5.dywa.generated.entity.onbroke.models.app.Submission) from;
			final de.ls5.dywa.generated.rest.types.Submission effectiveTo = (de.ls5.dywa.generated.rest.types.Submission) to;
		effectiveTo.settitle(effectiveFrom.gettitle());
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Offer effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Offer effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding>
		 source = effectiveFrom.getbiddings_Bidding();
		final java.util.List<de.ls5.dywa.generated.rest.types.Bidding>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
		 s : source) {
			// original selective: BrokerAreaBiddingSelectivex2x2_dCbEMVFOEe2J0bu3ffrh5w
			de.ls5.dywa.generated.rest.types.Bidding cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Bidding.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "BrokerAssignBiddingsTableBiddingSelectivex1x1x1_dsesAVGJEe2J0bu3ffrh5w")) {
				de.ls5.dywa.generated.rest.types.BrokerAssignBiddingsTableBiddingSelectivex1x1x1_dsesAVGJEe2J0bu3ffrh5w.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.setbiddings_Bidding(target);
		}
	}
}

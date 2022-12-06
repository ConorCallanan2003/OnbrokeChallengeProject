// generated by SelectiveGenerator#generateFullSelective(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class BiddingSelective {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding from,
		final de.ls5.dywa.generated.rest.types.Bidding to,
		final info.scce.dime.rest.ObjectCache objectCache) {


		if (objectCache.containsSelective(to, "BiddingSelective")) {
			return;
		}

		to.setDywaId(from.getDywaId());

		// put to cache, after id has been set
		objectCache.putSelective(to, "BiddingSelective");

		// non-transient objects can be fetched completely from the DB
		if (from.getDywaId() > info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
			return;
		}

		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());

		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.User
		 source = effectiveFrom.getuser();
		if (source != null) {
			// original selective: UserSelective
			de.ls5.dywa.generated.rest.types.User cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.User.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "UserSelective")) {
				de.ls5.dywa.generated.rest.types.UserSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setuser(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.Offer
		 source = effectiveFrom.getoffer();
		if (source != null) {
			// original selective: OfferSelective
			de.ls5.dywa.generated.rest.types.Offer cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Offer.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "OfferSelective")) {
				de.ls5.dywa.generated.rest.types.OfferSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setoffer(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>
		 source = effectiveFrom.getfeatures_Feature();
		final java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.Feature
		 s : source) {
			// original selective: FeatureSelective
			de.ls5.dywa.generated.rest.types.Feature cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "FeatureSelective")) {
				de.ls5.dywa.generated.rest.types.FeatureSelective.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.setfeatures_Feature(target);
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Feature>
		 source = effectiveFrom.getpreferences_Feature();
		final java.util.List<de.ls5.dywa.generated.rest.types.Feature>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.Feature
		 s : source) {
			// original selective: FeatureSelective
			de.ls5.dywa.generated.rest.types.Feature cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Feature.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "FeatureSelective")) {
				de.ls5.dywa.generated.rest.types.FeatureSelective.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.setpreferences_Feature(target);
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.Report
		 source = effectiveFrom.getreport();
		if (source != null) {
			// original selective: ReportSelective
			de.ls5.dywa.generated.rest.types.Report cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Report.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "ReportSelective")) {
				de.ls5.dywa.generated.rest.types.ReportSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setreport(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision
		 source = effectiveFrom.getdecision();
		if (source != null) {
			// original selective: DecisionSelective
			de.ls5.dywa.generated.rest.types.Decision cached = objectCache.getRestTo(source);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Decision.fromDywaEntity(source, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "DecisionSelective")) {
				de.ls5.dywa.generated.rest.types.DecisionSelective.copy(source, cached, objectCache);
			}
		
			effectiveTo.setdecision(cached);
		}
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Issue>
		 source = effectiveFrom.getissues_Issue();
		final java.util.List<de.ls5.dywa.generated.rest.types.Issue>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.Issue
		 s : source) {
			// original selective: IssueSelective
			de.ls5.dywa.generated.rest.types.Issue cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "IssueSelective")) {
				de.ls5.dywa.generated.rest.types.IssueSelective.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.setissues_Issue(target);
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		effectiveTo.setassigned(effectiveFrom.getassigned());
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		effectiveTo.settitle(effectiveFrom.gettitle());
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Bidding effectiveTo = to;
		effectiveTo.setuserCanDiscuss(effectiveFrom.getuserCanDiscuss());
		}
	}
}

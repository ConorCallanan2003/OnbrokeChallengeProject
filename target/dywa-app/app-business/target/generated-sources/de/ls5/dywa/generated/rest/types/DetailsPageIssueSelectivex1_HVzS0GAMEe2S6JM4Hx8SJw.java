// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class DetailsPageIssueSelectivex1_HVzS0GAMEe2S6JM4Hx8SJw {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Issue from,
		final de.ls5.dywa.generated.rest.types.Issue to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "DetailsPageIssueSelectivex1_HVzS0GAMEe2S6JM4Hx8SJw")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "DetailsPageIssueSelectivex1_HVzS0GAMEe2S6JM4Hx8SJw");
	
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Issue effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Issue effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Comment>
		 source = effectiveFrom.getcomments_Comment();
		final java.util.List<de.ls5.dywa.generated.rest.types.Comment>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.Comment
		 s : source) {
			// original selective: DetailsPageCommentSelectivex1x3x3_HVzS0GAMEe2S6JM4Hx8SJw
			de.ls5.dywa.generated.rest.types.Comment cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Comment.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "DetailsPageCommentSelectivex1x3x3_HVzS0GAMEe2S6JM4Hx8SJw")) {
				de.ls5.dywa.generated.rest.types.DetailsPageCommentSelectivex1x3x3_HVzS0GAMEe2S6JM4Hx8SJw.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.setcomments_Comment(target);
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Issue effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Issue effectiveTo = to;
		effectiveTo.settitle(effectiveFrom.gettitle());
		}
	}
}

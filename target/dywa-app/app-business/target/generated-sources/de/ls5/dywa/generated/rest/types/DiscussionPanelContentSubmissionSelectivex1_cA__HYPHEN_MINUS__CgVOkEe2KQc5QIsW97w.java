// generated by SelectiveGenerator#generate(ComplexTypeView view)
package de.ls5.dywa.generated.rest.types;

public class DiscussionPanelContentSubmissionSelectivex1_cA__HYPHEN_MINUS__CgVOkEe2KQc5QIsW97w {

	public static void copy(
		final de.ls5.dywa.generated.entity.onbroke.models.app.Submission from,
		final de.ls5.dywa.generated.rest.types.Submission to,
		final info.scce.dime.rest.ObjectCache objectCache) {
	
	
	
		if (objectCache.containsSelective(to, "DiscussionPanelContentSubmissionSelectivex1_cA__HYPHEN_MINUS__CgVOkEe2KQc5QIsW97w")) {
			return;
		}
	
		to.setDywaId(from.getDywaId());
		to.setDywaVersion(from.getDywaVersion());
		to.setDywaName(from.getDywaName());
	
		// put to cache, after id has been set
		objectCache.putSelective(to, "DiscussionPanelContentSubmissionSelectivex1_cA__HYPHEN_MINUS__CgVOkEe2KQc5QIsW97w");
	
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Submission effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Submission effectiveTo = to;
		effectiveTo.setuserCanDiscuss(effectiveFrom.getuserCanDiscuss());
		}
		{
			final de.ls5.dywa.generated.entity.onbroke.models.app.Submission effectiveFrom = from;
			final de.ls5.dywa.generated.rest.types.Submission effectiveTo = to;
		final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Issue>
		 source = effectiveFrom.getissues_Issue();
		final java.util.List<de.ls5.dywa.generated.rest.types.Issue>
		 target = new java.util.ArrayList<>(source.size());
		
		for (final de.ls5.dywa.generated.entity.onbroke.models.app.Issue
		 s : source) {
			// original selective: DiscussionPanelContentIssueSelectivex1x2x2_cA__HYPHEN_MINUS__CgVOkEe2KQc5QIsW97w
			de.ls5.dywa.generated.rest.types.Issue cached = objectCache.getRestTo(s);
			
			if (cached == null) {
				cached = de.ls5.dywa.generated.rest.types.Issue.fromDywaEntity(s, objectCache);
			}
			
			if (!objectCache.containsSelective(cached, "DiscussionTableIssueSelectivex1_UOyxYVN9Ee2KQc5QIsW97w")) {
				de.ls5.dywa.generated.rest.types.DiscussionTableIssueSelectivex1_UOyxYVN9Ee2KQc5QIsW97w.copy(s, cached, objectCache);
			}
		
			target.add(cached);
		}
		
		effectiveTo.setissues_Issue(target);
		}
	}
}

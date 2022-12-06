/* generated by info.scce.dime.generator.scheme.ControllerGenerator */
package de.ls5.dywa.generated.controller.onbroke.models.app;

import de.ls5.dywa.generated.entity.onbroke.models.app.Decision;

public interface DecisionController {

	Decision read(java.lang.Long id);

	java.util.List<Decision> findByProperties(Decision searchObject);

	Decision findFirstByProperties(Decision searchObject);

	java.util.Set<Decision> fetch();

	java.util.Set<Decision> fetchByName(java.lang.String name);

	Decision create(java.lang.String name);
	Decision createTransient(java.lang.String name);

	Decision createSearchObject(java.lang.String name);

	java.util.Set<Decision> fetchWithSubtypes();

	void delete(Decision entity);

	void deleteWithIncomingReferences(Decision entity);
}

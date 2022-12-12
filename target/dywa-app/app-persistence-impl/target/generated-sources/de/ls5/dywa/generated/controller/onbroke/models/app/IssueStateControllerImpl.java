/* generated by info.scce.dime.generator.scheme.ControllerGenerator */
package de.ls5.dywa.generated.controller.onbroke.models.app;

import de.ls5.dywa.generated.entity.onbroke.models.app.IssueState;
import de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity;

import java.util.Arrays;
import java.util.stream.Collectors;

@javax.enterprise.context.RequestScoped
public class IssueStateControllerImpl implements IssueStateController {
	private static final org.slf4j.Logger LOGGER =  org.slf4j.LoggerFactory.getLogger(IssueStateController.class);

	@javax.persistence.PersistenceContext
	private javax.persistence.EntityManager entityManager;

	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;

@javax.inject.Inject //referenceMap
private de.ls5.dywa.generated.controller.onbroke.models.app.IssueController issueController;

@javax.inject.Inject //referenceMap
private de.ls5.dywa.generated.controller.onbroke.models.app.IssueStateController issueStateController;

    
    @Override
	public IssueState read(final java.lang.Long id) {

		IssueStateEntity result = entityManager.find(IssueStateEntity.class, id);
		if (result != null) {
			return IssueState.valueOf(result.getDywaName());
		}
		return IssueState.forId(id);
	}

    @Override
	public java.util.List<IssueState> findByProperties(IssueState searchObject) {
		throw new java.lang.UnsupportedOperationException("Cannot perform this operation on an enumerable object");
	}

	@Override
	public IssueState findFirstByProperties(IssueState searchObject) {
		throw new java.lang.UnsupportedOperationException("Cannot perform this operation on an enumerable object");
	}

	@Override
	public java.util.Set<IssueState> fetch() {
		return java.util.stream.Stream.of(IssueState.values()).collect(java.util.stream.Collectors.toSet());
	}

	@Override
	public java.util.Set<IssueState> fetchByName(final java.lang.String name) {
		return java.util.stream.Stream.of(IssueState.values()).filter(e -> java.util.Objects.equals(e.getDywaName(), name)).collect(java.util.stream.Collectors.toSet());
	}

}

package de.ls5.dywa.generated.migration;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import de.ls5.dywa.generated.util.EnumMapping;

@Singleton
@Startup
public class EnumMigrator {

    @PersistenceContext
    private EntityManager em;

    @PostConstruct
    public void migrate() {

        for (EnumMapping mapping : em.createQuery("SELECT mapping FROM de.ls5.dywa.generated.util.EnumMapping mapping", EnumMapping.class).getResultList()) {
            em.remove(mapping);
        }
        em.flush();

    			setupUserRole(de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.admin, de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.broker, de.ls5.dywa.generated.entity.onbroke.models.app.UserRole.user);
    			setupDecisionState(de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState.approved, de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState.rejected);
    			setupPriority(de.ls5.dywa.generated.entity.onbroke.models.app.Priority.high, de.ls5.dywa.generated.entity.onbroke.models.app.Priority.medium, de.ls5.dywa.generated.entity.onbroke.models.app.Priority.low);
    			setupIssueState(de.ls5.dywa.generated.entity.onbroke.models.app.IssueState.resolved, de.ls5.dywa.generated.entity.onbroke.models.app.IssueState.unresolved);
    }

	private void setupUserRole(de.ls5.dywa.generated.entity.onbroke.models.app.UserRole... values) {

	    for (de.ls5.dywa.generated.entity.onbroke.models.app.UserRole value : values) {
	        final TypedQuery<de.ls5.dywa.generated.entity.onbroke.models.app.UserRoleEntity> query = em.createQuery(
	                "SELECT o FROM de.ls5.dywa.generated.entity.onbroke.models.app.UserRoleEntity o WHERE o.name_ = :name", de.ls5.dywa.generated.entity.onbroke.models.app.UserRoleEntity.class);
	        query.setParameter("name", value.name());

	        final List<de.ls5.dywa.generated.entity.onbroke.models.app.UserRoleEntity> res = query.getResultList();
	        final de.ls5.dywa.generated.entity.onbroke.models.app.UserRoleEntity entity;

	        switch (res.size()) {
	            case 0:
	                entity = new de.ls5.dywa.generated.entity.onbroke.models.app.UserRoleEntity();
	                entity.setDywaName(value.name());
	                em.persist(entity);
	                break;
	            case 1:
	                entity = res.get(0);
	                break;
	            default:
	                throw new IllegalStateException("There must not exist multiple enum-entities with the same name");
	        }

	        em.persist(new EnumMapping(value.getDywaEnumId(), entity.getId_()));
	    }
	}
	private void setupDecisionState(de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState... values) {

	    for (de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState value : values) {
	        final TypedQuery<de.ls5.dywa.generated.entity.onbroke.models.app.DecisionStateEntity> query = em.createQuery(
	                "SELECT o FROM de.ls5.dywa.generated.entity.onbroke.models.app.DecisionStateEntity o WHERE o.name_ = :name", de.ls5.dywa.generated.entity.onbroke.models.app.DecisionStateEntity.class);
	        query.setParameter("name", value.name());

	        final List<de.ls5.dywa.generated.entity.onbroke.models.app.DecisionStateEntity> res = query.getResultList();
	        final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionStateEntity entity;

	        switch (res.size()) {
	            case 0:
	                entity = new de.ls5.dywa.generated.entity.onbroke.models.app.DecisionStateEntity();
	                entity.setDywaName(value.name());
	                em.persist(entity);
	                break;
	            case 1:
	                entity = res.get(0);
	                break;
	            default:
	                throw new IllegalStateException("There must not exist multiple enum-entities with the same name");
	        }

	        em.persist(new EnumMapping(value.getDywaEnumId(), entity.getId_()));
	    }
	}
	private void setupPriority(de.ls5.dywa.generated.entity.onbroke.models.app.Priority... values) {

	    for (de.ls5.dywa.generated.entity.onbroke.models.app.Priority value : values) {
	        final TypedQuery<de.ls5.dywa.generated.entity.onbroke.models.app.PriorityEntity> query = em.createQuery(
	                "SELECT o FROM de.ls5.dywa.generated.entity.onbroke.models.app.PriorityEntity o WHERE o.name_ = :name", de.ls5.dywa.generated.entity.onbroke.models.app.PriorityEntity.class);
	        query.setParameter("name", value.name());

	        final List<de.ls5.dywa.generated.entity.onbroke.models.app.PriorityEntity> res = query.getResultList();
	        final de.ls5.dywa.generated.entity.onbroke.models.app.PriorityEntity entity;

	        switch (res.size()) {
	            case 0:
	                entity = new de.ls5.dywa.generated.entity.onbroke.models.app.PriorityEntity();
	                entity.setDywaName(value.name());
	                em.persist(entity);
	                break;
	            case 1:
	                entity = res.get(0);
	                break;
	            default:
	                throw new IllegalStateException("There must not exist multiple enum-entities with the same name");
	        }

	        em.persist(new EnumMapping(value.getDywaEnumId(), entity.getId_()));
	    }
	}
	private void setupIssueState(de.ls5.dywa.generated.entity.onbroke.models.app.IssueState... values) {

	    for (de.ls5.dywa.generated.entity.onbroke.models.app.IssueState value : values) {
	        final TypedQuery<de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity> query = em.createQuery(
	                "SELECT o FROM de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity o WHERE o.name_ = :name", de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity.class);
	        query.setParameter("name", value.name());

	        final List<de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity> res = query.getResultList();
	        final de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity entity;

	        switch (res.size()) {
	            case 0:
	                entity = new de.ls5.dywa.generated.entity.onbroke.models.app.IssueStateEntity();
	                entity.setDywaName(value.name());
	                em.persist(entity);
	                break;
	            case 1:
	                entity = res.get(0);
	                break;
	            default:
	                throw new IllegalStateException("There must not exist multiple enum-entities with the same name");
	        }

	        em.persist(new EnumMapping(value.getDywaEnumId(), entity.getId_()));
	    }
	}
}

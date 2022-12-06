// generated by info.scce.dime.generator.rest.SelectiveControllerGenerator
package de.ls5.dywa.generated.rest.controller;

@javax.transaction.Transactional
@javax.enterprise.context.RequestScoped
public class DecisionStateREST {

	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController DomainFileController;
	
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.DecisionStateREST DecisionStateREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.DecisionStateController DecisionStateController;


	
	public de.ls5.dywa.generated.rest.types.DecisionState read_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(final long id) {
		
		final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState obj = this.DecisionStateController.read(id);
		
		if (obj == null) {
			return null;
		}

		de.ls5.dywa.generated.rest.types.DecisionState result = objectCache.getRestTo(obj);
		
		if (result == null) {
			result = de.ls5.dywa.generated.rest.types.DecisionState.fromDywaEntity(obj, objectCache);
		}
		
		if (!objectCache.containsSelective(result, "BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
			de.ls5.dywa.generated.rest.types.BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w.copy(obj, result, objectCache);
		}

		return result;
	}

	public de.ls5.dywa.generated.rest.types.DecisionState readTransient_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(final de.ls5.dywa.generated.rest.types.DecisionState obj) {

		final de.ls5.dywa.generated.rest.types.DecisionState result;
		
		if (this.objectCache.containsSelective(obj, "BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
			return obj;
		}
		else {
			result = obj;
			this.objectCache.putSelective(obj, "BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w");
		}

		// Update references to persistent objects

		return result;
	}

		public java.util.Set<de.ls5.dywa.generated.rest.types.DecisionState> readAll_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w() {
			
			final java.util.Set<de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState> objs =
			new java.util.HashSet<>(java.util.Arrays.asList(de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState.values()));
	
			final java.util.Set<de.ls5.dywa.generated.rest.types.DecisionState> result = new java.util.HashSet<>();

			for (final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState s : objs) {
				de.ls5.dywa.generated.rest.types.DecisionState cached = objectCache.getRestTo(s);
				
				if (cached == null) {
					cached = de.ls5.dywa.generated.rest.types.DecisionState.fromDywaEntity(s, objectCache);
				}
				
				if (!objectCache.containsSelective(cached, "BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
					de.ls5.dywa.generated.rest.types.BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w.copy(s, cached, objectCache);
				}

				result.add(cached);
			}
			
			return result;
		}


	public void update_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(final de.ls5.dywa.generated.rest.types.DecisionState value) {

		final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState obj = this.DecisionStateController.read(value.getDywaId());
		
		this.update_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(value, obj);
	}

	public void update_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(final de.ls5.dywa.generated.rest.types.DecisionState value, final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

	}
	public void update_DecisionStateSelective(final de.ls5.dywa.generated.rest.types.DecisionState value) {

		final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState obj = this.DecisionStateController.read(value.getDywaId());
		
		this.update_DecisionStateSelective(value, obj);
	}

	public void update_DecisionStateSelective(final de.ls5.dywa.generated.rest.types.DecisionState value, final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "DecisionStateSelective")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "DecisionStateSelective");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

		{
			final de.ls5.dywa.generated.rest.types.DecisionState effectiveValue = value;
			final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState effectiveObj = obj;

		// If values were not specified, ignore them
		if (effectiveValue.isdywaDisplayNameSet()) {
			checkVersion(value, obj);
			effectiveObj.setdywaDisplayName(effectiveValue.getdywaDisplayName());
		}
	}
	}


	private void checkVersion(final de.ls5.dywa.generated.rest.types.DecisionState value, final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState obj) {
		if (value.isDywaVersionSet() && value.getDywaVersion() != obj.getDywaVersion()) {
			throw new javax.persistence.OptimisticLockException(obj.getDywaName() + '[' + obj.getDywaId() + "] has been updated by other transaction");
		}
	}
}

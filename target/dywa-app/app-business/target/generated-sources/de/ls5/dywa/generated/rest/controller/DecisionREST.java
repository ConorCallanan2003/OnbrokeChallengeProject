// generated by info.scce.dime.generator.rest.SelectiveControllerGenerator
package de.ls5.dywa.generated.rest.controller;

@javax.transaction.Transactional
@javax.enterprise.context.RequestScoped
public class DecisionREST {

	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController DomainFileController;
	
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.DecisionREST DecisionREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController DecisionController;
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.DecisionStateREST DecisionStateREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.DecisionStateController DecisionStateController;

	public long create(final java.lang.String name) {
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj = this.DecisionController.create(name);
		return obj.getDywaId();
	}

	
	public de.ls5.dywa.generated.rest.types.Decision read_BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w(final long id) {
		
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj = this.DecisionController.read(id);
		
		if (obj == null) {
			return null;
		}

		de.ls5.dywa.generated.rest.types.Decision result = objectCache.getRestTo(obj);
		
		if (result == null) {
			result = de.ls5.dywa.generated.rest.types.Decision.fromDywaEntity(obj, objectCache);
		}
		
		if (!objectCache.containsSelective(result, "BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
			de.ls5.dywa.generated.rest.types.BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w.copy(obj, result, objectCache);
		}

		return result;
	}

	public de.ls5.dywa.generated.rest.types.Decision readTransient_BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w(final de.ls5.dywa.generated.rest.types.Decision obj) {

		final de.ls5.dywa.generated.rest.types.Decision result;
		
		if (this.objectCache.containsSelective(obj, "BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
			return obj;
		}
		else {
			result = obj;
			this.objectCache.putSelective(obj, "BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w");
		}

		// Update references to persistent objects
			{
				{
					final de.ls5.dywa.generated.rest.types.Decision effectiveObj = obj;
					final de.ls5.dywa.generated.rest.types.Decision effectiveResult = result;
					if (effectiveObj.isstateSet()) {
						final de.ls5.dywa.generated.rest.types.DecisionState
						 existing = effectiveObj.getstate();
						de.ls5.dywa.generated.rest.types.DecisionState
						 newValue;

						if (existing.getDywaId() > 0) {
							// read_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w
							newValue = this.DecisionStateREST.read_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(existing.getDywaId());
						}
						else {
							// readTransient_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w
							newValue = this.DecisionStateREST.readTransient_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(existing);
						}

						effectiveResult.setstate(newValue);
						}
					}
			}

		return result;
	}

		public java.util.Set<de.ls5.dywa.generated.rest.types.Decision> readAll_BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w() {
			
			final java.util.Set<de.ls5.dywa.generated.entity.onbroke.models.app.Decision> objs =
			this.DecisionController.fetch();
	
			final java.util.Set<de.ls5.dywa.generated.rest.types.Decision> result = new java.util.HashSet<>();

			for (final de.ls5.dywa.generated.entity.onbroke.models.app.Decision s : objs) {
				de.ls5.dywa.generated.rest.types.Decision cached = objectCache.getRestTo(s);
				
				if (cached == null) {
					cached = de.ls5.dywa.generated.rest.types.Decision.fromDywaEntity(s, objectCache);
				}
				
				if (!objectCache.containsSelective(cached, "BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
					de.ls5.dywa.generated.rest.types.BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w.copy(s, cached, objectCache);
				}

				result.add(cached);
			}
			
			return result;
		}


	public void update_BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w(final de.ls5.dywa.generated.rest.types.Decision value) {

		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj = this.DecisionController.read(value.getDywaId());
		
		this.update_BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w(value, obj);
	}

	public void update_BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w(final de.ls5.dywa.generated.rest.types.Decision value, final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "BrokerOfferTableDecisionSelectivex1x3x3_JXgxEVFUEe2J0bu3ffrh5w");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

		{
			final de.ls5.dywa.generated.rest.types.Decision effectiveValue = value;
			final de.ls5.dywa.generated.entity.onbroke.models.app.Decision effectiveObj = obj;

		// If values were not specified, ignore them
		if (effectiveValue.isstateSet()) {
			checkVersion(value, obj);
			if (effectiveValue.getstate() == null) {
				effectiveObj.setstate(null);
			}
			else {
				final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState
				 entity;
				final de.ls5.dywa.generated.rest.types.DecisionState
				 item = effectiveValue.getstate();
			
				//update_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w
				this.DecisionStateREST.update_BrokerOfferTableDecisionStateSelectivex1x3x3x3x3_JXgxEVFUEe2J0bu3ffrh5w(item);
				
				entity = this.DecisionStateController.read(item.getDywaId());
			
				effectiveObj.setstate(entity);
			
			}
		}
	}
	}
	public void update_DecisionSelective(final de.ls5.dywa.generated.rest.types.Decision value) {

		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj = this.DecisionController.read(value.getDywaId());
		
		this.update_DecisionSelective(value, obj);
	}

	public void update_DecisionSelective(final de.ls5.dywa.generated.rest.types.Decision value, final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "DecisionSelective")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "DecisionSelective");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

		{
			final de.ls5.dywa.generated.rest.types.Decision effectiveValue = value;
			final de.ls5.dywa.generated.entity.onbroke.models.app.Decision effectiveObj = obj;

		// If values were not specified, ignore them
		if (effectiveValue.isstateSet()) {
			checkVersion(value, obj);
			if (effectiveValue.getstate() == null) {
				effectiveObj.setstate(null);
			}
			else {
				final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState
				 entity;
				final de.ls5.dywa.generated.rest.types.DecisionState
				 item = effectiveValue.getstate();
			
				//update_DecisionStateSelective
				this.DecisionStateREST.update_DecisionStateSelective(item);
				
				entity = this.DecisionStateController.read(item.getDywaId());
			
				effectiveObj.setstate(entity);
			
			}
		}
	}
	}

	public de.ls5.dywa.generated.entity.onbroke.models.app.Decision copyToTransient(final de.ls5.dywa.generated.rest.types.Decision value) {

		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj;

		if (this.objectCache.containsTransient(value)) {
			return this.objectCache.getTransient(value);
		}
		else {
			final java.lang.String name;
			if (value.getDywaName() == null || value.getDywaName().isEmpty()) {
				name = "Decision_transient";
			} else {
				name = value.getDywaName();
			}
			obj = DecisionController.createTransient(name);
			this.objectCache.putTransient(value, obj);
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

			{
				final de.ls5.dywa.generated.rest.types.Decision effectiveValue = value;
				final de.ls5.dywa.generated.entity.onbroke.models.app.Decision effectiveObj = obj;

			// If values were not specified, ignore them
			if (effectiveValue.isstateSet()) {
				checkVersion(value, obj);
				if (effectiveValue.getstate() == null) {
					effectiveObj.setstate(null);
				}
				else {
					final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState
					 entity;
					final de.ls5.dywa.generated.rest.types.DecisionState
					 item = effectiveValue.getstate();
				
					//update_DecisionStateSelective
					this.DecisionStateREST.update_DecisionStateSelective(item);
					
					entity = this.DecisionStateController.read(item.getDywaId());
				
					effectiveObj.setstate(entity);
				
				}
			}
		}

		return obj;
	}

	public void delete(final long id) {
		final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj = this.DecisionController.read(id);
		this.DecisionController.delete(obj);
	}

	private void checkVersion(final de.ls5.dywa.generated.rest.types.Decision value, final de.ls5.dywa.generated.entity.onbroke.models.app.Decision obj) {
		if (value.isDywaVersionSet() && value.getDywaVersion() != obj.getDywaVersion()) {
			throw new javax.persistence.OptimisticLockException(obj.getDywaName() + '[' + obj.getDywaId() + "] has been updated by other transaction");
		}
	}
}

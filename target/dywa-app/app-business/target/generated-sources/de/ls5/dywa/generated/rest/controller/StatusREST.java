// generated by info.scce.dime.generator.rest.SelectiveControllerGenerator
package de.ls5.dywa.generated.rest.controller;

@javax.transaction.Transactional
@javax.enterprise.context.RequestScoped
public class StatusREST {

	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController DomainFileController;
	
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.StatusREST StatusREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.StatusController StatusController;


	
	public de.ls5.dywa.generated.rest.types.Status read_AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q(final long id) {
		
		final de.ls5.dywa.generated.entity.onbroke.models.app.Status obj = this.StatusController.read(id);
		
		if (obj == null) {
			return null;
		}

		de.ls5.dywa.generated.rest.types.Status result = objectCache.getRestTo(obj);
		
		if (result == null) {
			result = de.ls5.dywa.generated.rest.types.Status.fromDywaEntity(obj, objectCache);
		}
		
		if (!objectCache.containsSelective(result, "AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q")) {
			de.ls5.dywa.generated.rest.types.AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q.copy(obj, result, objectCache);
		}

		return result;
	}

	public de.ls5.dywa.generated.rest.types.Status readTransient_AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q(final de.ls5.dywa.generated.rest.types.Status obj) {

		final de.ls5.dywa.generated.rest.types.Status result;
		
		if (this.objectCache.containsSelective(obj, "AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q")) {
			return obj;
		}
		else {
			result = obj;
			this.objectCache.putSelective(obj, "AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q");
		}

		// Update references to persistent objects

		return result;
	}

		public java.util.Set<de.ls5.dywa.generated.rest.types.Status> readAll_AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q() {
			
			final java.util.Set<de.ls5.dywa.generated.entity.onbroke.models.app.Status> objs =
			new java.util.HashSet<>(java.util.Arrays.asList(de.ls5.dywa.generated.entity.onbroke.models.app.Status.values()));
	
			final java.util.Set<de.ls5.dywa.generated.rest.types.Status> result = new java.util.HashSet<>();

			for (final de.ls5.dywa.generated.entity.onbroke.models.app.Status s : objs) {
				de.ls5.dywa.generated.rest.types.Status cached = objectCache.getRestTo(s);
				
				if (cached == null) {
					cached = de.ls5.dywa.generated.rest.types.Status.fromDywaEntity(s, objectCache);
				}
				
				if (!objectCache.containsSelective(cached, "AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q")) {
					de.ls5.dywa.generated.rest.types.AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q.copy(s, cached, objectCache);
				}

				result.add(cached);
			}
			
			return result;
		}


	public void update_AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q(final de.ls5.dywa.generated.rest.types.Status value) {

		final de.ls5.dywa.generated.entity.onbroke.models.app.Status obj = this.StatusController.read(value.getDywaId());
		
		this.update_AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q(value, obj);
	}

	public void update_AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q(final de.ls5.dywa.generated.rest.types.Status value, final de.ls5.dywa.generated.entity.onbroke.models.app.Status obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "AdminBiddingTableStatusSelectivex1x3x3_QIJywVLmEe2djpkPxa2Z3Q");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

	}
	public void update_StatusSelective(final de.ls5.dywa.generated.rest.types.Status value) {

		final de.ls5.dywa.generated.entity.onbroke.models.app.Status obj = this.StatusController.read(value.getDywaId());
		
		this.update_StatusSelective(value, obj);
	}

	public void update_StatusSelective(final de.ls5.dywa.generated.rest.types.Status value, final de.ls5.dywa.generated.entity.onbroke.models.app.Status obj) {

		// for updates, consider a special selective so we don't clash with read-operations
		if (this.objectCache.containsSelective(obj, "StatusSelective")) {
			// We are already getting updated by someone else
			return;
		}
		else {
			// we don't care for the actual value. key alone is sufficient enough for detection of cycles
			this.objectCache.putSelective(obj, "StatusSelective");
		}

		if (value.isDywaNameSet()) {
			obj.setDywaName(value.getDywaName());
		}

		{
			final de.ls5.dywa.generated.rest.types.Status effectiveValue = value;
			final de.ls5.dywa.generated.entity.onbroke.models.app.Status effectiveObj = obj;

		// If values were not specified, ignore them
		if (effectiveValue.isdywaDisplayNameSet()) {
			checkVersion(value, obj);
			effectiveObj.setdywaDisplayName(effectiveValue.getdywaDisplayName());
		}
	}
	}


	private void checkVersion(final de.ls5.dywa.generated.rest.types.Status value, final de.ls5.dywa.generated.entity.onbroke.models.app.Status obj) {
		if (value.isDywaVersionSet() && value.getDywaVersion() != obj.getDywaVersion()) {
			throw new javax.persistence.OptimisticLockException(obj.getDywaName() + '[' + obj.getDywaId() + "] has been updated by other transaction");
		}
	}
}

package de.ls5.dywa.generated.util;

import javax.inject.Inject;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;

@RequestScoped
public class AALControllerImpl implements AALController {

	@PersistenceContext
	private EntityManager entityManager;

	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.IssueController IssueController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.CommentController CommentController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.IssueStateController IssueStateController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.AssignmentController AssignmentController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.UserController UserController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.BaseUserController BaseUserController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.UserRoleController UserRoleController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.OfferController OfferController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.ReportController ReportController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.DecisionStateController DecisionStateController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.DecisionController DecisionController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;
	@Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController;

	@Override
	public void reset() {

	final FlushModeType oldFlushMode = this.entityManager.getFlushMode();
	this.entityManager.flush();
	this.entityManager.setFlushMode(FlushModeType.COMMIT);

	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Issue o : IssueController.fetch()) {
	IssueController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Comment o : CommentController.fetch()) {
	CommentController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.IssueState o : IssueStateController.fetch()) {
	o.setDywaName(o.toString());
	o.setresolved
	(null);
	o.setunresolved
	(null);
	o.setdywaDisplayName
	(null);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Assignment o : AssignmentController.fetch()) {
	AssignmentController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.User o : UserController.fetch()) {
	UserController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser o : BaseUserController.fetch()) {
	BaseUserController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.UserRole o : UserRoleController.fetch()) {
	o.setDywaName(o.toString());
	o.setadmin
	(null);
	o.setbroker
	(null);
	o.setuser
	(null);
	o.setdywaDisplayName
	(null);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Offer o : OfferController.fetch()) {
	OfferController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding o : BiddingController.fetch()) {
	BiddingController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Report o : ReportController.fetch()) {
	ReportController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState o : DecisionStateController.fetch()) {
	o.setDywaName(o.toString());
	o.setapproved
	(null);
	o.setrejected
	(null);
	o.setdywaDisplayName
	(null);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Decision o : DecisionController.fetch()) {
	DecisionController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Feature o : FeatureController.fetch()) {
	FeatureController.deleteWithIncomingReferences(o);
	}
	for (final de.ls5.dywa.generated.entity.onbroke.models.app.Priority o : PriorityController.fetch()) {
	o.setDywaName(o.toString());
	o.sethigh
	(null);
	o.setmedium
	(null);
	o.setlow
	(null);
	o.setdywaDisplayName
	(null);
	}

		this.entityManager.setFlushMode(oldFlushMode);
	}
}

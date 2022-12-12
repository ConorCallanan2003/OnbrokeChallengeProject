// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA")
public class EditAssignmentGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.BiddingREST BiddingREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Assign/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueAssignBranch(info.scce.dime.rest.gui.model._afXv0VuaEe2C__HYPHEN_MINUS__dvY0XUmpABranch output) {
		
		checkAuthentication(output.getCallStack(),"_mOjJMVuZEe2C-dvY0XUmpA/Assign");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
			 thisBidding;
			if (output.getThisBidding() != null) {
			// create new object
			if (output.getThisBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getThisBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getThisBidding().getDywaName() == null || output.getThisBidding().getDywaName().isEmpty()) {
						dywaName = "thisBidding";
					} else {
						dywaName = output.getThisBidding().getDywaName();
					}
					final long id;
					id = BiddingREST.create(dywaName);
					output.getThisBidding().setDywaId(id);
					//update_EditAssignmentBiddingSelectivex1x12x12x19x19_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA
					BiddingREST.update_EditAssignmentBiddingSelectivex1x12x12x19x19_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Bidding)output.getThisBidding());
					thisBidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) BiddingController.read(output.getThisBidding().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getThisBidding().getClass()); }	}
			// transient object
			else if (output.getThisBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getThisBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getThisBidding().getDywaName() == null || output.getThisBidding().getDywaName().isEmpty()) {
						dywaName = "thisBidding";
					} else {
						dywaName = output.getThisBidding().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding transientObject;
					if (output.getThisBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						transientObject = BiddingController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getThisBidding().getClass()); }
		
					//update_EditAssignmentBiddingSelectivex1x12x12x19x19_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA
					BiddingREST.update_EditAssignmentBiddingSelectivex1x12x12x19x19_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Bidding)output.getThisBidding(), transientObject);
					thisBidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getThisBidding().getClass()); }	}
			// regular object
				else {
					if(output.getThisBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_EditAssignmentBiddingSelectivex1x12x12x19x19_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA
						BiddingREST.update_EditAssignmentBiddingSelectivex1x12x12x19x19_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Bidding)output.getThisBidding());
						thisBidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getThisBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getThisBidding().getClass()); }		}
			
			}
			else {
				thisBidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult.gui__afXv0VuaEe2C__HYPHEN_MINUS__dvY0XUmpAAssignReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult.gui__afXv0VuaEe2C__HYPHEN_MINUS__dvY0XUmpAAssignReturn();
		guiReturn.setThisBidding(thisBidding);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult("Assign", guiReturn);
		if(!"_mOjJMVuZEe2C-dvY0XUmpA".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
					output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).setPointer(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getMajorGUI());
		}
		if(!output.getCallStack().getCallFrames().isEmpty()) {
		
			if(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size() - 1).getPointer() == null) {
				return javax.ws.rs.core.Response.status(422).build();
			}
		}
		final Object result = this.processResumer.resumeFromGUI(output.getCallStack(), guiResult);
		return javax.ws.rs.core.Response.ok(result).build();
	}
	@javax.ws.rs.POST
	@javax.ws.rs.Path("Cancel_Edit/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueCancel_EditBranch(info.scce.dime.rest.gui.model._mSh2L1LZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_mOjJMVuZEe2C-dvY0XUmpA/Cancel_Edit");
		
		
		final info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.broker.editassignment.EditAssignment_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpAResult("Cancel_Edit");
		if(!"_mOjJMVuZEe2C-dvY0XUmpA".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
					output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).setPointer(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getMajorGUI());
		}
		if(!output.getCallStack().getCallFrames().isEmpty()) {
		
			if(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size() - 1).getPointer() == null) {
				return javax.ws.rs.core.Response.status(422).build();
			}
		}
		final Object result = this.processResumer.resumeFromGUI(output.getCallStack(), guiResult);
		return javax.ws.rs.core.Response.ok(result).build();
	}
	
}

// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_CPN5EWBEEe2RjrkbQARhdg")
public class EditUserFormGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.UserRoleREST UserRoleREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.UserRoleController UserRoleController;

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Cancel/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueCancelBranch(info.scce.dime.rest.gui.model._mSh2L1LZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_CPN5EWBEEe2RjrkbQARhdg/Cancel");
		
		
		final info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult("Cancel");
		if(!"_CPN5EWBEEe2RjrkbQARhdg".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Submit/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueSubmitBranch(info.scce.dime.rest.gui.model._V_NKYV3WEe2t19MJLPzxmgBranch output) {
		
		checkAuthentication(output.getCallStack(),"_CPN5EWBEEe2RjrkbQARhdg/Submit");
		
			final java.lang.String
			 lastName;
			lastName = output.getLastName();
			final java.lang.String
			 firstName;
			firstName = output.getFirstName();
			final de.ls5.dywa.generated.entity.onbroke.models.app.UserRole
			 userRole;
			if (output.getUserRole() != null) {
			// for enum types ignore non-persisted objects
			if (output.getUserRole().getDywaId() < 0) {
				userRole = null;
			}
				else {
					if(output.getUserRole() instanceof de.ls5.dywa.generated.rest.types.UserRole) {
						//update_EditUserFormUserRoleSelectivex5_CPN5EWBEEe2RjrkbQARhdg
						UserRoleREST.update_UserFormUserRoleSelectivex4_BDkd8F3WEe2t19MJLPzxmg((de.ls5.dywa.generated.rest.types.UserRole)output.getUserRole());
						userRole = (de.ls5.dywa.generated.entity.onbroke.models.app.UserRole
						) UserRoleController.read(output.getUserRole().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getUserRole().getClass()); }		}
			
			}
			else {
				userRole = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult.gui__FLv7w2BEEe2RjrkbQARhdgSubmitReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult.gui__FLv7w2BEEe2RjrkbQARhdgSubmitReturn();
		guiReturn.setLastName(lastName);
		guiReturn.setFirstName(firstName);
		guiReturn.setUserRole(userRole);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.edituserform.EditUserForm_CPN5EWBEEe2RjrkbQARhdgResult("Submit", guiReturn);
		if(!"_CPN5EWBEEe2RjrkbQARhdg".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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

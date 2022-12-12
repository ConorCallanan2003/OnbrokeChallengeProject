// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_VDMMEVt7Ee20aa7PI0XDWg")
public class DeleteFeatureGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Cancel/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueCancelBranch(info.scce.dime.rest.gui.model._mSh2L1LZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_VDMMEVt7Ee20aa7PI0XDWg/Cancel");
		
		
		final info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult("Cancel");
		if(!"_VDMMEVt7Ee20aa7PI0XDWg".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Confirm_Delete/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueConfirm_DeleteBranch(info.scce.dime.rest.gui.model._mSh2L1LZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_VDMMEVt7Ee20aa7PI0XDWg/Confirm_Delete");
		
		
		final info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.confirmdelete.DeleteFeature_VDMMEVt7Ee20aa7PI0XDWgResult("Confirm_Delete");
		if(!"_VDMMEVt7Ee20aa7PI0XDWg".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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

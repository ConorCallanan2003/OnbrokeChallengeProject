// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_Bn2jcWAKEe2YNpeIwSxEfw")
public class CreatePreferenceGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Submit/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueSubmitBranch(info.scce.dime.rest.gui.model._sAn8UGAJEe2S6JM4Hx8SJwBranch output) {
		
		checkAuthentication(output.getCallStack(),"_Bn2jcWAKEe2YNpeIwSxEfw/Submit");
		
			final java.lang.String
			 title;
			title = output.getTitle();
		final info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult.gui__NviG8WAKEe2YNpeIwSxEfwSubmitReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult.gui__NviG8WAKEe2YNpeIwSxEfwSubmitReturn();
		guiReturn.setTitle(title);
		
		final info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult("Submit", guiReturn);
		if(!"_Bn2jcWAKEe2YNpeIwSxEfw".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Cancel/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueCancelBranch(info.scce.dime.rest.gui.model._mSh2L1LZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_Bn2jcWAKEe2YNpeIwSxEfw/Cancel");
		
		
		final info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.user.createpreference.CreatePreference_Bn2jcWAKEe2YNpeIwSxEfwResult("Cancel");
		if(!"_Bn2jcWAKEe2YNpeIwSxEfw".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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

// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g")
public class EditFeatureFormGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.PriorityREST PriorityREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.PriorityController PriorityController;

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Submit/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueSubmitBranch(info.scce.dime.rest.gui.model._r0epMVuUEe2nXJXMw4vrvgBranch output) {
		
		checkAuthentication(output.getCallStack(),"_-UC0cVuXEe28kPQ81TnB9g/Submit");
		
			final java.lang.String
			 title;
			title = output.getTitle();
			final de.ls5.dywa.generated.entity.onbroke.models.app.Priority
			 priority;
			if (output.getPriority() != null) {
			// for enum types ignore non-persisted objects
			if (output.getPriority().getDywaId() < 0) {
				priority = null;
			}
				else {
					if(output.getPriority() instanceof de.ls5.dywa.generated.rest.types.Priority) {
						//update_EditFeatureFormPrioritySelectivex4___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g
						PriorityREST.update_EditFeatureFormPrioritySelectivex3___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9g((de.ls5.dywa.generated.rest.types.Priority)output.getPriority());
						priority = (de.ls5.dywa.generated.entity.onbroke.models.app.Priority
						) PriorityController.read(output.getPriority().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getPriority().getClass()); }		}
			
			}
			else {
				priority = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult.gui__BjRJk1uYEe28kPQ81TnB9gSubmitReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult.gui__BjRJk1uYEe28kPQ81TnB9gSubmitReturn();
		guiReturn.setTitle(title);
		guiReturn.setPriority(priority);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult("Submit", guiReturn);
		if(!"_-UC0cVuXEe28kPQ81TnB9g".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	public javax.ws.rs.core.Response continueCancelBranch(info.scce.dime.rest.gui.model._bWPu1FLZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_-UC0cVuXEe28kPQ81TnB9g/Cancel");
		
		
		final info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.editfeatureform.EditFeatureForm___HYPHEN_MINUS__UC0cVuXEe28kPQ81TnB9gResult("Cancel");
		if(!"_-UC0cVuXEe28kPQ81TnB9g".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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

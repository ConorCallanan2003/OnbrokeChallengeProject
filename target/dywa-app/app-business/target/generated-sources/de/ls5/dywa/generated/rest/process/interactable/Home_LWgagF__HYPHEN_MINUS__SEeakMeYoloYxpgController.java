package de.ls5.dywa.generated.rest.process.interactable;

import java.util.List;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/start/Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg")
public class Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgController {

	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;

	@javax.inject.Inject
	private info.scce.dime.rest.ObjectCache objectCache;
	@javax.inject.Inject
	private info.scce.dime.process.onbroke.models.home.Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpg process;
	
	// controller for fetching dywa entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
		@javax.ws.rs.POST
		@javax.ws.rs.Path("public")
		@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
		public javax.ws.rs.core.Response execute(Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgInput ctx) {
				Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutput result = new Home_LWgagF__HYPHEN_MINUS__SEeakMeYoloYxpgOutput(this.process.execute(false),objectCache);
				return javax.ws.rs.core.Response.ok(result).build();
		}
		
	
	@javax.ws.rs.POST
	@javax.ws.rs.Path("_4dwC1VFMEe2J0bu3ffrh5w/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueAfterLogin_4dwC1VFMEe2J0bu3ffrh5w(info.scce.dime.rest.RESTContext ctx) {
		final Object result = this.processResumer.resumeFromGUI(ctx.getCallStack(),null);
		return javax.ws.rs.core.Response.ok(result).build();
	}
}

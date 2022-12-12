// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_QIJywVLmEe2djpkPxa2Z3Q")
public class AdminBiddingTableGUIResumer extends info.scce.dime.process.GUIResumer {
	
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
	@javax.ws.rs.Path("Delete_bidding/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueDelete_biddingBranch(info.scce.dime.rest.gui.model._uDx5LFLmEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_QIJywVLmEe2djpkPxa2Z3Q/Delete_bidding");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
			 bidding;
			if (output.getBidding() != null) {
			// create new object
			if (output.getBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getBidding().getDywaName() == null || output.getBidding().getDywaName().isEmpty()) {
						dywaName = "bidding";
					} else {
						dywaName = output.getBidding().getDywaName();
					}
					final long id;
					id = BiddingREST.create(dywaName);
					output.getBidding().setDywaId(id);
					//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
					BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) BiddingController.read(output.getBidding().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// transient object
			else if (output.getBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getBidding().getDywaName() == null || output.getBidding().getDywaName().isEmpty()) {
						dywaName = "bidding";
					} else {
						dywaName = output.getBidding().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding transientObject;
					if (output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						transientObject = BiddingController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }
		
					//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
					BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding(), transientObject);
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// regular object
				else {
					if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
						BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
						bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }		}
			
			}
			else {
				bidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult.gui__uDygGlLmEe2djpkPxa2Z3QDelete_biddingReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult.gui__uDygGlLmEe2djpkPxa2Z3QDelete_biddingReturn();
		guiReturn.setBidding(bidding);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult("Delete_bidding", guiReturn);
		if(!"_QIJywVLmEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Show_bidding/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueShow_biddingBranch(info.scce.dime.rest.gui.model._uDx5LFLmEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_QIJywVLmEe2djpkPxa2Z3Q/Show_bidding");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
			 bidding;
			if (output.getBidding() != null) {
			// create new object
			if (output.getBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getBidding().getDywaName() == null || output.getBidding().getDywaName().isEmpty()) {
						dywaName = "bidding";
					} else {
						dywaName = output.getBidding().getDywaName();
					}
					final long id;
					id = BiddingREST.create(dywaName);
					output.getBidding().setDywaId(id);
					//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
					BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) BiddingController.read(output.getBidding().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// transient object
			else if (output.getBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getBidding().getDywaName() == null || output.getBidding().getDywaName().isEmpty()) {
						dywaName = "bidding";
					} else {
						dywaName = output.getBidding().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding transientObject;
					if (output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						transientObject = BiddingController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }
		
					//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
					BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding(), transientObject);
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// regular object
				else {
					if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
						BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
						bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }		}
			
			}
			else {
				bidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult.gui__uDx5LFLmEe2djpkPxa2Z3QShow_biddingReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult.gui__uDx5LFLmEe2djpkPxa2Z3QShow_biddingReturn();
		guiReturn.setBidding(bidding);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult("Show_bidding", guiReturn);
		if(!"_QIJywVLmEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Edit_bidding/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueEdit_biddingBranch(info.scce.dime.rest.gui.model._uDx5LFLmEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_QIJywVLmEe2djpkPxa2Z3Q/Edit_bidding");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
			 bidding;
			if (output.getBidding() != null) {
			// create new object
			if (output.getBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getBidding().getDywaName() == null || output.getBidding().getDywaName().isEmpty()) {
						dywaName = "bidding";
					} else {
						dywaName = output.getBidding().getDywaName();
					}
					final long id;
					id = BiddingREST.create(dywaName);
					output.getBidding().setDywaId(id);
					//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
					BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) BiddingController.read(output.getBidding().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// transient object
			else if (output.getBidding().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
					final java.lang.String dywaName;
					if (output.getBidding().getDywaName() == null || output.getBidding().getDywaName().isEmpty()) {
						dywaName = "bidding";
					} else {
						dywaName = output.getBidding().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Bidding transientObject;
					if (output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						transientObject = BiddingController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }
		
					//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
					BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding(), transientObject);
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// regular object
				else {
					if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q
						BiddingREST.update_AdminBiddingTableBiddingSelectivex1_QIJywVLmEe2djpkPxa2Z3Q((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
						bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }		}
			
			}
			else {
				bidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult.gui__uDx5PVLmEe2djpkPxa2Z3QEdit_biddingReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult.gui__uDx5PVLmEe2djpkPxa2Z3QEdit_biddingReturn();
		guiReturn.setBidding(bidding);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.adminbiddingtable.AdminBiddingTable_QIJywVLmEe2djpkPxa2Z3QResult("Edit_bidding", guiReturn);
		if(!"_QIJywVLmEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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

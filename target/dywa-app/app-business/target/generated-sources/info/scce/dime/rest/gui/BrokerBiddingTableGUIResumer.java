// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w")
public class BrokerBiddingTableGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.ReportREST ReportREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.ReportController ReportController;
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.BiddingREST BiddingREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.BiddingController BiddingController;

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Revoke_bidding/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueRevoke_biddingBranch(info.scce.dime.rest.gui.model._X1hAa1GGEe2J0bu3ffrh5wBranch output) {
		
		checkAuthentication(output.getCallStack(),"_Ln-sIFGGEe2J0bu3ffrh5w/Revoke_bidding");
		
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
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
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
		
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding(), transientObject);
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// regular object
				else {
					if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
						BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
						bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }		}
			
			}
			else {
				bidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hnJVGGEe2J0bu3ffrh5wRevoke_biddingReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hnJVGGEe2J0bu3ffrh5wRevoke_biddingReturn();
		guiReturn.setBidding(bidding);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult("Revoke_bidding", guiReturn);
		if(!"_Ln-sIFGGEe2J0bu3ffrh5w".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Decide_bidding/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueDecide_biddingBranch(info.scce.dime.rest.gui.model._X1hAa1GGEe2J0bu3ffrh5wBranch output) {
		
		checkAuthentication(output.getCallStack(),"_Ln-sIFGGEe2J0bu3ffrh5w/Decide_bidding");
		
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
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
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
		
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding(), transientObject);
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// regular object
				else {
					if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
						BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
						bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }		}
			
			}
			else {
				bidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hAa1GGEe2J0bu3ffrh5wDecide_biddingReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hAa1GGEe2J0bu3ffrh5wDecide_biddingReturn();
		guiReturn.setBidding(bidding);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult("Decide_bidding", guiReturn);
		if(!"_Ln-sIFGGEe2J0bu3ffrh5w".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Review_bidding/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueReview_biddingBranch(info.scce.dime.rest.gui.model._X1hAa1GGEe2J0bu3ffrh5wBranch output) {
		
		checkAuthentication(output.getCallStack(),"_Ln-sIFGGEe2J0bu3ffrh5w/Review_bidding");
		
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
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
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
		
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding(), transientObject);
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// regular object
				else {
					if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
						BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
						bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }		}
			
			}
			else {
				bidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hAfFGGEe2J0bu3ffrh5wReview_biddingReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hAfFGGEe2J0bu3ffrh5wReview_biddingReturn();
		guiReturn.setBidding(bidding);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult("Review_bidding", guiReturn);
		if(!"_Ln-sIFGGEe2J0bu3ffrh5w".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Edit_report/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueEdit_reportBranch(info.scce.dime.rest.gui.model._5KRpf1F_Ee2J0bu3ffrh5wBranch output) {
		
		checkAuthentication(output.getCallStack(),"_Ln-sIFGGEe2J0bu3ffrh5w/Edit_report");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Report
			 report;
			if (output.getReport() != null) {
			// create new object
			if (output.getReport().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getReport() instanceof de.ls5.dywa.generated.rest.types.Report) {
					final java.lang.String dywaName;
					if (output.getReport().getDywaName() == null || output.getReport().getDywaName().isEmpty()) {
						dywaName = "report";
					} else {
						dywaName = output.getReport().getDywaName();
					}
					final long id;
					id = ReportREST.create(dywaName);
					output.getReport().setDywaId(id);
					//update_BrokerBiddingTableReportSelectivex1x3x3_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					ReportREST.update_BrokerOfferTableReportSelectivex1x2x2_JXgxEVFUEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Report)output.getReport());
					report = (de.ls5.dywa.generated.entity.onbroke.models.app.Report
					) ReportController.read(output.getReport().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getReport().getClass()); }	}
			// transient object
			else if (output.getReport().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getReport() instanceof de.ls5.dywa.generated.rest.types.Report) {
					final java.lang.String dywaName;
					if (output.getReport().getDywaName() == null || output.getReport().getDywaName().isEmpty()) {
						dywaName = "report";
					} else {
						dywaName = output.getReport().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Report transientObject;
					if (output.getReport() instanceof de.ls5.dywa.generated.rest.types.Report) {
						transientObject = ReportController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getReport().getClass()); }
		
					//update_BrokerBiddingTableReportSelectivex1x3x3_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					ReportREST.update_BrokerOfferTableReportSelectivex1x2x2_JXgxEVFUEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Report)output.getReport(), transientObject);
					report = (de.ls5.dywa.generated.entity.onbroke.models.app.Report
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getReport().getClass()); }	}
			// regular object
				else {
					if(output.getReport() instanceof de.ls5.dywa.generated.rest.types.Report) {
						//update_BrokerBiddingTableReportSelectivex1x3x3_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
						ReportREST.update_BrokerOfferTableReportSelectivex1x2x2_JXgxEVFUEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Report)output.getReport());
						report = (de.ls5.dywa.generated.entity.onbroke.models.app.Report
						) ReportController.read(output.getReport().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getReport().getClass()); }		}
			
			}
			else {
				report = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hnFFGGEe2J0bu3ffrh5wEdit_reportReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hnFFGGEe2J0bu3ffrh5wEdit_reportReturn();
		guiReturn.setReport(report);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult("Edit_report", guiReturn);
		if(!"_Ln-sIFGGEe2J0bu3ffrh5w".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	public javax.ws.rs.core.Response continueShow_biddingBranch(info.scce.dime.rest.gui.model._X1hAa1GGEe2J0bu3ffrh5wBranch output) {
		
		checkAuthentication(output.getCallStack(),"_Ln-sIFGGEe2J0bu3ffrh5w/Show_bidding");
		
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
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
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
		
					//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
					BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding(), transientObject);
					bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }	}
			// regular object
				else {
					if(output.getBidding() instanceof de.ls5.dywa.generated.rest.types.Bidding) {
						//update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w
						BiddingREST.update_BrokerBiddingTableBiddingSelectivex1_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5w((de.ls5.dywa.generated.rest.types.Bidding)output.getBidding());
						bidding = (de.ls5.dywa.generated.entity.onbroke.models.app.Bidding
						) BiddingController.read(output.getBidding().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getBidding().getClass()); }		}
			
			}
			else {
				bidding = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hAWlGGEe2J0bu3ffrh5wShow_biddingReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult.gui__X1hAWlGGEe2J0bu3ffrh5wShow_biddingReturn();
		guiReturn.setBidding(bidding);
		
		final info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.broker.brokerbiddingtable.BrokerBiddingTable_Ln__HYPHEN_MINUS__sIFGGEe2J0bu3ffrh5wResult("Show_bidding", guiReturn);
		if(!"_Ln-sIFGGEe2J0bu3ffrh5w".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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

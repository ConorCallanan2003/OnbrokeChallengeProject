// generated by info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResumer
package info.scce.dime.rest.gui;

@javax.transaction.Transactional(dontRollbackOn = info.scce.dime.exception.GUIEncounteredSignal.class)
@javax.ws.rs.Path("/continue/_S6RoAVLZEe2djpkPxa2Z3Q")
public class AdminTemplatesTabGUIResumer extends info.scce.dime.process.GUIResumer {
	
	@javax.inject.Inject
	private info.scce.dime.gui.ProcessResumer processResumer;
	
	// controller for fetching dywa file entities
	@javax.inject.Inject
	private de.ls5.dywa.generated.util.DomainFileController domainFileController;
	
	@javax.inject.Inject
	private de.ls5.dywa.generated.rest.controller.FeatureREST FeatureREST;
	@javax.inject.Inject
	private de.ls5.dywa.generated.controller.onbroke.models.app.FeatureController FeatureController;

	@javax.ws.rs.POST
	@javax.ws.rs.Path("Details/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueDetailsBranch(info.scce.dime.rest.gui.model._FHYeQXVnEe2_CvdRyEmMCQBranch output) {
		
		checkAuthentication(output.getCallStack(),"_S6RoAVLZEe2djpkPxa2Z3Q/Details");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Feature
			 feature;
			if (output.getFeature() != null) {
			// create new object
			if (output.getFeature().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final long id;
					id = FeatureREST.create(dywaName);
					output.getFeature().setDywaId(id);
					//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) FeatureController.read(output.getFeature().getDywaId());
				}else 
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final long id;
					id = FeatureREST.create(dywaName);
					output.getFeature().setDywaId(id);
					//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) FeatureController.read(output.getFeature().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }	}
			// transient object
			else if (output.getFeature().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Feature transientObject;
					if (output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						transientObject = FeatureController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }
		
					//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature(), transientObject);
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) transientObject;
				}else 
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Feature transientObject;
					if (output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						transientObject = FeatureController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }
		
					//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature(), transientObject);
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }	}
			// regular object
				else {
					if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
						FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
						feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
						) FeatureController.read(output.getFeature().getDywaId());
					}else 
					if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
						FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
						feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
						) FeatureController.read(output.getFeature().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }		}
			
			}
			else {
				feature = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult.gui__FHYeQXVnEe2_CvdRyEmMCQDetailsReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult.gui__FHYeQXVnEe2_CvdRyEmMCQDetailsReturn();
		guiReturn.setFeature(feature);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult("Details", guiReturn);
		if(!"_S6RoAVLZEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Create_bidding_feature/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueCreate_bidding_featureBranch(info.scce.dime.rest.gui.model._bWPu1FLZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_S6RoAVLZEe2djpkPxa2Z3Q/Create_bidding_feature");
		
		
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult("Create_bidding_feature");
		if(!"_S6RoAVLZEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Edit_feature/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueEdit_featureBranch(info.scce.dime.rest.gui.model._FHYeQXVnEe2_CvdRyEmMCQBranch output) {
		
		checkAuthentication(output.getCallStack(),"_S6RoAVLZEe2djpkPxa2Z3Q/Edit_feature");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Feature
			 feature;
			if (output.getFeature() != null) {
			// create new object
			if (output.getFeature().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final long id;
					id = FeatureREST.create(dywaName);
					output.getFeature().setDywaId(id);
					//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) FeatureController.read(output.getFeature().getDywaId());
				}else 
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final long id;
					id = FeatureREST.create(dywaName);
					output.getFeature().setDywaId(id);
					//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) FeatureController.read(output.getFeature().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }	}
			// transient object
			else if (output.getFeature().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Feature transientObject;
					if (output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						transientObject = FeatureController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }
		
					//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature(), transientObject);
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) transientObject;
				}else 
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Feature transientObject;
					if (output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						transientObject = FeatureController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }
		
					//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature(), transientObject);
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }	}
			// regular object
				else {
					if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
						FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
						feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
						) FeatureController.read(output.getFeature().getDywaId());
					}else 
					if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
						FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
						feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
						) FeatureController.read(output.getFeature().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }		}
			
			}
			else {
				feature = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult.gui__zZTH0VLIEe2djpkPxa2Z3QEdit_featureReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult.gui__zZTH0VLIEe2djpkPxa2Z3QEdit_featureReturn();
		guiReturn.setFeature(feature);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult("Edit_feature", guiReturn);
		if(!"_S6RoAVLZEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Create_offer_feature/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueCreate_offer_featureBranch(info.scce.dime.rest.gui.model._bWPu1FLZEe2djpkPxa2Z3QBranch output) {
		
		checkAuthentication(output.getCallStack(),"_S6RoAVLZEe2djpkPxa2Z3Q/Create_offer_feature");
		
		
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult("Create_offer_feature");
		if(!"_S6RoAVLZEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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
	@javax.ws.rs.Path("Delete_feature/branch/public")
	@javax.ws.rs.Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	@javax.ws.rs.Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public javax.ws.rs.core.Response continueDelete_featureBranch(info.scce.dime.rest.gui.model._FHYeQXVnEe2_CvdRyEmMCQBranch output) {
		
		checkAuthentication(output.getCallStack(),"_S6RoAVLZEe2djpkPxa2Z3Q/Delete_feature");
		
			final de.ls5.dywa.generated.entity.onbroke.models.app.Feature
			 feature;
			if (output.getFeature() != null) {
			// create new object
			if (output.getFeature().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_CREATE_NEW) {
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final long id;
					id = FeatureREST.create(dywaName);
					output.getFeature().setDywaId(id);
					//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) FeatureController.read(output.getFeature().getDywaId());
				}else 
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final long id;
					id = FeatureREST.create(dywaName);
					output.getFeature().setDywaId(id);
					//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) FeatureController.read(output.getFeature().getDywaId());
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }	}
			// transient object
			else if (output.getFeature().getDywaId() == info.scce.dime.util.Constants.DYWA_ID_TRANSIENT) {
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Feature transientObject;
					if (output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						transientObject = FeatureController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }
		
					//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature(), transientObject);
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) transientObject;
				}else 
				if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
					final java.lang.String dywaName;
					if (output.getFeature().getDywaName() == null || output.getFeature().getDywaName().isEmpty()) {
						dywaName = "feature";
					} else {
						dywaName = output.getFeature().getDywaName();
					}
					final de.ls5.dywa.generated.entity.onbroke.models.app.Feature transientObject;
					if (output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						transientObject = FeatureController.createTransient(dywaName);
					}
					 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }
		
					//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
					FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature(), transientObject);
					feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
					) transientObject;
				}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }	}
			// regular object
				else {
					if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						//update_AdminTemplatesTabFeatureSelectivex1_S6RoAVLZEe2djpkPxa2Z3Q
						FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
						feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
						) FeatureController.read(output.getFeature().getDywaId());
					}else 
					if(output.getFeature() instanceof de.ls5.dywa.generated.rest.types.Feature) {
						//update_AdminTemplatesTabFeatureSelectivex2_S6RoAVLZEe2djpkPxa2Z3Q
						FeatureREST.update_EditAssignmentFeatureSelectivex1x10x10x18x18x27x27_mOjJMVuZEe2C__HYPHEN_MINUS__dvY0XUmpA((de.ls5.dywa.generated.rest.types.Feature)output.getFeature());
						feature = (de.ls5.dywa.generated.entity.onbroke.models.app.Feature
						) FeatureController.read(output.getFeature().getDywaId());
					}
		 else { throw new java.lang.IllegalArgumentException("Unexpected type " + output.getFeature().getClass()); }		}
			
			}
			else {
				feature = null;
			}
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult.gui__zZTH4lLIEe2djpkPxa2Z3QDelete_featureReturn guiReturn = new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult.gui__zZTH4lLIEe2djpkPxa2Z3QDelete_featureReturn();
		guiReturn.setFeature(feature);
		
		final info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult guiResult = 
		new info.scce.dime.gui.onbroke.models.areas.admin.admintemplatestab.AdminTemplatesTab_S6RoAVLZEe2djpkPxa2Z3QResult("Delete_feature", guiReturn);
		if(!"_S6RoAVLZEe2djpkPxa2Z3Q".equals(output.getCallStack().getCallFrames().get(output.getCallStack().getCallFrames().size()-1).getPointer().split(":")[2])){
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

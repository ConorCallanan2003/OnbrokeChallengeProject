// generated by info.scce.dime.generator.rest.SelectiveInteractableProcessGenerator#generateOutputs(Process)

package de.ls5.dywa.generated.rest.process.interactable;

import java.util.List;

public class ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutput{
	private String branchName;
	private String branchId;
	private ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutputWrapper result;
		
	@com.fasterxml.jackson.annotation.JsonProperty("branchName")
	public java.lang.String getBranchName() {
		return this.branchName;
	}
	
	public void setBranchName(String branchname) {
		this.branchName = branchname;
	}
	
	@com.fasterxml.jackson.annotation.JsonProperty("branchId")
	public java.lang.String getBranchId() {
		return this.branchId;
	}
	
	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}
	
	@com.fasterxml.jackson.annotation.JsonProperty("outputs")
	@com.codingrodent.jackson.crypto.Encrypt
	@com.fasterxml.jackson.databind.annotation.JsonSerialize(using = info.scce.dime.rest.ContextIndependentSerializer.class)
	@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = info.scce.dime.rest.ContextIndependentDeserializer.class)
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutputWrapper getResult() {
		return this.result;
	}
	
	public void setResult(ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutputWrapper result) {
		this.result = result;
	}
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutput(){}
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutput(info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResult result, info.scce.dime.rest.ObjectCache objectCache){
		this.branchName = result.getBranchName();
		this.branchId = result.getBranchId();
		this.result = new ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutputWrapper(result, objectCache);
	}

public static class ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutputWrapper {
	
	private String branchName;
		
	@com.fasterxml.jackson.annotation.JsonProperty("branchName")
	public java.lang.String getBranchName() {
		return this.branchName;
	}
	
	public void setBranchName(String branchname) {
		this.branchName = branchname;
	}
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutputWrapper(){}
	public ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wOutputWrapper(info.scce.dime.process.onbroke.models.areas.user.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_w.ShowUserArea_cxB5kVFLEe2Vgcav4Znc_wResult result, info.scce.dime.rest.ObjectCache objectCache){
		this.branchName = result.getBranchName();
	}
}
}

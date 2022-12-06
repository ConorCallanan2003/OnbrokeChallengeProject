// Generator: info.scce.dime.generator.rest.GUIProgressGenerator#generateGUIResult(GUI gui,Map<String,Map<String,TypeView>> branches)

package info.scce.dime.gui.onbroke.models.areas.admin.userform;

public class UserForm_BDkd8F3WEe2t19MJLPzxmgResult {
	
	private String branchName;
	
	public String getBranchName() {
		return this.branchName;
	}
	
	
	public UserForm_BDkd8F3WEe2t19MJLPzxmgResult(String branchName) {
		this.branchName = branchName;
	}
	
	
	public UserForm_BDkd8F3WEe2t19MJLPzxmgResult(String branchName, gui__YG4okF3WEe2t19MJLPzxmgCancelReturn gui__YG4okF3WEe2t19MJLPzxmgCancelReturn) {
		this.branchName = branchName;
		this.gui__YG4okF3WEe2t19MJLPzxmgCancelReturn = gui__YG4okF3WEe2t19MJLPzxmgCancelReturn;
	}
	
	private gui__YG4okF3WEe2t19MJLPzxmgCancelReturn gui__YG4okF3WEe2t19MJLPzxmgCancelReturn;
	
	public gui__YG4okF3WEe2t19MJLPzxmgCancelReturn getgui__YG4okF3WEe2t19MJLPzxmgCancelReturn() {
		return gui__YG4okF3WEe2t19MJLPzxmgCancelReturn;
	}
	
	public static class gui__YG4okF3WEe2t19MJLPzxmgCancelReturn {
	}
	
	public UserForm_BDkd8F3WEe2t19MJLPzxmgResult(String branchName, gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn) {
		this.branchName = branchName;
		this.gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn = gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn;
	}
	
	private gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn;
	
	public gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn getgui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn() {
		return gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn;
	}
	
	public static class gui__V_NKYV3WEe2t19MJLPzxmgSubmitReturn {
		private java.lang.String firstName;
		
		@com.fasterxml.jackson.annotation.JsonProperty("firstName")
		public java.lang.String getFirstName() {
			return firstName;
		}
		
		@com.fasterxml.jackson.annotation.JsonProperty("firstName")
		public void setFirstName(java.lang.String firstName) {
			this.firstName = firstName;
		}
		private java.lang.String lastName;
		
		@com.fasterxml.jackson.annotation.JsonProperty("lastName")
		public java.lang.String getLastName() {
			return lastName;
		}
		
		@com.fasterxml.jackson.annotation.JsonProperty("lastName")
		public void setLastName(java.lang.String lastName) {
			this.lastName = lastName;
		}
		private de.ls5.dywa.generated.entity.onbroke.models.app.UserRole UserRole;
		
		@com.fasterxml.jackson.annotation.JsonProperty("UserRole")
		public de.ls5.dywa.generated.entity.onbroke.models.app.UserRole getUserRole() {
			return UserRole;
		}
		
		@com.fasterxml.jackson.annotation.JsonProperty("UserRole")
		public void setUserRole(de.ls5.dywa.generated.entity.onbroke.models.app.UserRole UserRole) {
			this.UserRole = UserRole;
		}
	}
}

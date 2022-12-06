package de.ls5.dywa.generated.rest.types;

@com.fasterxml.jackson.annotation.JsonFilter("DIME_Selective_Filter")
@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, property = info.scce.dime.util.Constants.DYWA_RUNTIME_TYPE)
public class BaseUser extends info.scce.dime.rest.RESTBaseImpl implements info.scce.dime.rest.RESTBaseType
 {

	private java.util.List<
	User
	>
	 user = new java.util.LinkedList<>();
	private boolean isuserSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("user")
	@info.scce.dime.rest.JsonRenderIndicator("isuser_UserSet")
	public java.util.List<
	User
	>
	 getuser_User() {
		return this.user;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isuser_UserSet() {
		return this.isuserSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("user")
	public void setuser_User(final java.util.List<
	User
	>
	 user) {
		this.user = user;
		this.isuserSet = true;
	}

	private java.lang.String
	 password;
	private boolean ispasswordSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("password")
	@info.scce.dime.rest.JsonRenderIndicator("ispasswordSet")
	public java.lang.String
	 getpassword() {
		return this.password;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean ispasswordSet() {
		return this.ispasswordSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("password")
	public void setpassword(final java.lang.String
	 password) {
		this.password = password;
		this.ispasswordSet = true;
	}

	private java.lang.String
	 username;
	private boolean isusernameSet;
	
	@com.fasterxml.jackson.annotation.JsonProperty("username")
	@info.scce.dime.rest.JsonRenderIndicator("isusernameSet")
	public java.lang.String
	 getusername() {
		return this.username;
	}
	
	@com.fasterxml.jackson.annotation.JsonIgnore
	public boolean isusernameSet() {
		return this.isusernameSet;
	}

	@com.fasterxml.jackson.annotation.JsonProperty("username")
	public void setusername(final java.lang.String
	 username) {
		this.username = username;
		this.isusernameSet = true;
	}

	
	public static BaseUser fromDywaEntity(final de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser entity, info.scce.dime.rest.ObjectCache objectCache) {
	
		final BaseUser result;
	
		if (entity instanceof de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser) {
			result = new de.ls5.dywa.generated.rest.types.BaseUser();
		}
	 else { throw new java.lang.IllegalArgumentException("Unknown type"); } 
		objectCache.putRestTo(entity, result);
	
		return result;
	}
}

/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.onbroke.models.app;
@javax.persistence.Entity
@javax.persistence.Cacheable
@org.hibernate.annotations.Cache(usage = org.hibernate.annotations.CacheConcurrencyStrategy.READ_WRITE)
@javax.persistence.Table(name = "t_BaseUser__udys4mwneewzvvv", indexes={@javax.persistence.Index(columnList="meta_inheritance")})
@de.ls5.dywa.annotations.IdRef(id = 1L)
public class BaseUserImpl implements BaseUser {
	@javax.persistence.Id
	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.SEQUENCE)
	@javax.persistence.Column(name = "meta_id")
	private long id_;
	
	/* DYWA METADATA START */
	@javax.persistence.Column(name = "meta_name")
	private java.lang.String name_;
	
	@javax.persistence.Column(name = "meta_version")
	private long version_;
	
	@javax.persistence.Column(name = "meta_inheritance")
	private boolean inheritance_ = false;


	@javax.persistence.Transient
	private boolean bidirectionalDirtyFlag;
	/* DYWA METADATA END */

	
	/* MAIN ATTRIBUTES START */
	@de.ls5.dywa.annotations.IdRef(id = 24L)
	@org.hibernate.annotations.Cascade(org.hibernate.annotations.CascadeType.PERSIST)
	@javax.persistence.JoinTable(name="r_BaseUser_User__fokxgmwneewzvvv", joinColumns = { @javax.persistence.JoinColumn(name = "r1_BaseUser_id") }, inverseJoinColumns = { @javax.persistence.JoinColumn(name = "r2_User_id") })
	@org.hibernate.annotations.ManyToAny(metaColumn=@javax.persistence.Column(name="m_User_Type__fokxgmwneewzvvv"))
	@org.hibernate.annotations.AnyMetaDef(
		idType="long", metaType="string",
		metaValues={
			@org.hibernate.annotations.MetaValue(targetEntity=de.ls5.dywa.generated.entity.onbroke.models.app.UserImpl.class, value="_dh6bymwneewzvvv")
		}
	)
	private java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> user  = new java.util.ArrayList<>();
	
	@de.ls5.dywa.annotations.IdRef(id = 25L)
	@javax.persistence.Column(name = "a_Password__yiigumwneewzvvv", columnDefinition="varchar")
	private java.lang.String password;
	
	@de.ls5.dywa.annotations.IdRef(id = 26L)
	@javax.persistence.Column(name = "a_Username__1aickg_qeeaqhez", columnDefinition="varchar")
	private java.lang.String username;
	
	/* MAIN ATTRIBUTES END */
	
	/* IMPLICIT ATTRIBUTES START */
	/* IMPLICIT ATTRIBUTES END */
	
	/* INHERITED MODELS START */
	/* INHERITED MODELS END */

	/* INHERITED ABSTRACT MODELS START */
	/* INHERITED ABSTRACT MODELS END */
	
	/* ADDITIONAL INHERITED MODELS START */
	/* ADDITIONAL INHERITED MODELS END */
	
	// Constructors
	public BaseUserImpl() {
	}



	// EXTENSION ATTRIBUTES

	public long getId_() {
		return this.id_;
	}

	public void setId_(final long id) {
		this.id_ = id;
	}

	@java.lang.Override
	public java.lang.String getDywaName() {
		return this.name_;
	}

	@java.lang.Override
	public void setDywaName(final java.lang.String name) {
		this.name_ = name;
	}

	// return existing id on runtime
	@java.lang.Override
	public long getDywaId() {
		return this.id_;
	}

	@java.lang.Override
	public long getDywaVersion() {
		return this.version_;
	}

	@java.lang.Override
	public void setDywaVersion(final long version) {
		this.version_ = version;
	}
	
	 @javax.persistence.Transient private java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> userWrapper;
	@java.lang.Override
	public java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> getuser_User() {
		if(userWrapper == null){
			userWrapper = new de.ls5.dywa.generated.entity.onbroke.models.app.User.CustomListImpl(this.user,
			new de.ls5.dywa.generated.entity.onbroke.models.app.User.BiDirectionalHelper<>(
				de.ls5.dywa.generated.entity.onbroke.models.app.User::setbaseUser
				,
				this.casted())
			);
		}
	
		return userWrapper;
	}
	
	@java.lang.Override
	public void setuser_User(java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> object) {
		if (!this.bidirectionalDirtyFlag) {
			this.bidirectionalDirtyFlag = true;
			final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> current = this.getuser_User();
				if(current != null){
					// redundant updates can be skipped
					if (object != null && current.equals(object)) {
						this.bidirectionalDirtyFlag = false;
					return;
				}
				current.clear();
				if(object != null){
					current.addAll(object);
				}
			}
			this.bidirectionalDirtyFlag = false;
		}
	}
	
	
	@java.lang.Override
	public java.lang.String getpassword() {
		return this.password;
	}
	
	@java.lang.Override
	public void setpassword(java.lang.String object) {
		this.password = object;
	}
	
	
	@java.lang.Override
	public java.lang.String getusername() {
		return this.username;
	}
	
	@java.lang.Override
	public void setusername(java.lang.String object) {
		this.username = object;
	}
	
	
	@java.lang.Override
	public String toString() {
		return "BaseUser[id: " + this.id_ + ", name: " + this.name_ + "]";
	}
}


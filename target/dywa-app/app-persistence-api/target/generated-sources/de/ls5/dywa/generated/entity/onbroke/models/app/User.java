/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.onbroke.models.app;
@de.ls5.dywa.annotations.IdRef(id = 0L)
@de.ls5.dywa.annotations.OriginalName(name = "User")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
public interface User extends de.ls5.dywa.generated.util.Identifiable {
	@de.ls5.dywa.annotations.IdRef(id = 15L)
	@de.ls5.dywa.annotations.OriginalName(name = "baseUser")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser getbaseUser();
	
	@de.ls5.dywa.annotations.IdRef(id = 15L)
	@de.ls5.dywa.annotations.OriginalName(name = "baseUser")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setbaseUser(de.ls5.dywa.generated.entity.onbroke.models.app.BaseUser object);
	
	@de.ls5.dywa.annotations.IdRef(id = 16L)
	@de.ls5.dywa.annotations.OriginalName(name = "firstName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getfirstName();
	
	@de.ls5.dywa.annotations.IdRef(id = 16L)
	@de.ls5.dywa.annotations.OriginalName(name = "firstName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setfirstName(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 17L)
	@de.ls5.dywa.annotations.OriginalName(name = "lastName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.lang.String getlastName();
	
	@de.ls5.dywa.annotations.IdRef(id = 17L)
	@de.ls5.dywa.annotations.OriginalName(name = "lastName")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setlastName(java.lang.String object);
	
	@de.ls5.dywa.annotations.IdRef(id = 18L)
	@de.ls5.dywa.annotations.OriginalName(name = "role")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.entity.onbroke.models.app.UserRole getrole();
	
	@de.ls5.dywa.annotations.IdRef(id = 18L)
	@de.ls5.dywa.annotations.OriginalName(name = "role")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setrole(de.ls5.dywa.generated.entity.onbroke.models.app.UserRole object);
	
	@de.ls5.dywa.annotations.IdRef(id = 19L)
	@de.ls5.dywa.annotations.OriginalName(name = "offers")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> getoffers_Offer();
	
	@de.ls5.dywa.annotations.IdRef(id = 19L)
	@de.ls5.dywa.annotations.OriginalName(name = "offers")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setoffers_Offer(java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Offer> object);
	
	@de.ls5.dywa.annotations.IdRef(id = 20L)
	@de.ls5.dywa.annotations.OriginalName(name = "biddings")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> getbiddings_Bidding();
	
	@de.ls5.dywa.annotations.IdRef(id = 20L)
	@de.ls5.dywa.annotations.OriginalName(name = "biddings")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setbiddings_Bidding(java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Bidding> object);
	
	@de.ls5.dywa.annotations.IdRef(id = 21L)
	@de.ls5.dywa.annotations.OriginalName(name = "dywaSwitchedTo")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.entity.onbroke.models.app.User getdywaSwitchedTo();
	
	@de.ls5.dywa.annotations.IdRef(id = 21L)
	@de.ls5.dywa.annotations.OriginalName(name = "dywaSwitchedTo")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setdywaSwitchedTo(de.ls5.dywa.generated.entity.onbroke.models.app.User object);
	

	// EXTENSION ATTRIBUTES

	// CUSTOM LIST IMPL
	static class CustomListImpl<T extends de.ls5.dywa.generated.util.Identifiable> extends java.util.AbstractList<de.ls5.dywa.generated.entity.onbroke.models.app.User> {
	
		private final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> delegate;
		private final BiDirectionalHelper<T> bidirectionalHelper;
		private boolean bidirectionalDirtyFlag;
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> delegate) {
			this(delegate, null);
		}
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.User> delegate, final BiDirectionalHelper<T> bidirectionalHelper) {
			this.delegate = delegate;
			this.bidirectionalHelper = bidirectionalHelper;
		}
	
		@java.lang.Override
		public int size() {
			return this.delegate.size();
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.onbroke.models.app.User get(int index) {
				return this.delegate.get(index);
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.onbroke.models.app.User set(int index, de.ls5.dywa.generated.entity.onbroke.models.app.User element) {
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.User replaced = this.delegate.set(index, element);
	
			if (element.equals(replaced)) {
				return element;
			}
	
			if (this.bidirectionalHelper != null) {
				this.bidirectionalHelper.clearReference(element);
				this.bidirectionalHelper.setReference(replaced);
			}
	
			return replaced;
		}
	
		@java.lang.Override
		public void add(int index, de.ls5.dywa.generated.entity.onbroke.models.app.User element) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
	
				this.delegate.add(index, element);
	
				if (this.bidirectionalHelper != null) {
					bidirectionalHelper.setReference(element);
				}
	
				this.bidirectionalDirtyFlag = false;
			}
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.onbroke.models.app.User remove(int index) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
				final de.ls5.dywa.generated.entity.onbroke.models.app.User result = this.delegate.remove(index);
	
				if (this.bidirectionalHelper != null) {
					this.bidirectionalHelper.clearReference(result);
				}
	
				this.bidirectionalDirtyFlag = false;
				return result;
			}
	
			return null;
		}
	}
	
	static class BiDirectionalHelper<T extends de.ls5.dywa.generated.util.Identifiable> {
	
		final java.util.function.BiConsumer<de.ls5.dywa.generated.entity.onbroke.models.app.User, T> setter;
		final java.util.function.Function<de.ls5.dywa.generated.entity.onbroke.models.app.User, java.util.List<T>> getter;
		final T owner;
	
		public BiDirectionalHelper(
				java.util.function.BiConsumer<de.ls5.dywa.generated.entity.onbroke.models.app.User, T> setter,
				T owner) {
	
			this.setter = setter;
			this.getter = null;
			this.owner = owner;
		}
	
		public BiDirectionalHelper(
				java.util.function.Function<de.ls5.dywa.generated.entity.onbroke.models.app.User, java.util.List<T>> getter,
				T owner) {
	
			this.setter = null;
			this.getter = getter;
			this.owner = owner;
		}
	
		public void setReference(final de.ls5.dywa.generated.entity.onbroke.models.app.User p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).add(owner);
			}
			// single mode
			else {
				setter.accept(p, owner);
			}
		}
	
		public void clearReference(final de.ls5.dywa.generated.entity.onbroke.models.app.User p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).remove(owner);
			}
			// single mode
			else {
				setter.accept(p, null);
			}
		}
	}

	default User casted(){
		return this;
	}
}

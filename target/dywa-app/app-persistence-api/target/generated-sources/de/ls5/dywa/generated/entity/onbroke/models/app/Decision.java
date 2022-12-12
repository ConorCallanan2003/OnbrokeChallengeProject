/* generated by info.scce.dime.generator.scheme.ModelGenerator */
package de.ls5.dywa.generated.entity.onbroke.models.app;
@de.ls5.dywa.annotations.IdRef(id = 7L)
@de.ls5.dywa.annotations.OriginalName(name = "Decision")
@de.ls5.dywa.annotations.ShortDescription(description = "")
@de.ls5.dywa.annotations.LongDescription(description = "")
public interface Decision extends de.ls5.dywa.generated.util.Identifiable {
	@de.ls5.dywa.annotations.IdRef(id = 46L)
	@de.ls5.dywa.annotations.OriginalName(name = "state")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState getstate();
	
	@de.ls5.dywa.annotations.IdRef(id = 46L)
	@de.ls5.dywa.annotations.OriginalName(name = "state")
	@de.ls5.dywa.annotations.ShortDescription(description = "")
	@de.ls5.dywa.annotations.LongDescription(description = "")
	void setstate(de.ls5.dywa.generated.entity.onbroke.models.app.DecisionState object);
	

	// EXTENSION ATTRIBUTES

	// CUSTOM LIST IMPL
	static class CustomListImpl<T extends de.ls5.dywa.generated.util.Identifiable> extends java.util.AbstractList<de.ls5.dywa.generated.entity.onbroke.models.app.Decision> {
	
		private final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Decision> delegate;
		private final BiDirectionalHelper<T> bidirectionalHelper;
		private boolean bidirectionalDirtyFlag;
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Decision> delegate) {
			this(delegate, null);
		}
	
		public CustomListImpl(final java.util.List<de.ls5.dywa.generated.entity.onbroke.models.app.Decision> delegate, final BiDirectionalHelper<T> bidirectionalHelper) {
			this.delegate = delegate;
			this.bidirectionalHelper = bidirectionalHelper;
		}
	
		@java.lang.Override
		public int size() {
			return this.delegate.size();
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.onbroke.models.app.Decision get(int index) {
				return this.delegate.get(index);
		}
	
		@java.lang.Override
		public de.ls5.dywa.generated.entity.onbroke.models.app.Decision set(int index, de.ls5.dywa.generated.entity.onbroke.models.app.Decision element) {
	
			final de.ls5.dywa.generated.entity.onbroke.models.app.Decision replaced = this.delegate.set(index, element);
	
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
		public void add(int index, de.ls5.dywa.generated.entity.onbroke.models.app.Decision element) {
	
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
		public de.ls5.dywa.generated.entity.onbroke.models.app.Decision remove(int index) {
	
			if (!this.bidirectionalDirtyFlag) {
	
				this.bidirectionalDirtyFlag = true;
				final de.ls5.dywa.generated.entity.onbroke.models.app.Decision result = this.delegate.remove(index);
	
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
	
		final java.util.function.BiConsumer<de.ls5.dywa.generated.entity.onbroke.models.app.Decision, T> setter;
		final java.util.function.Function<de.ls5.dywa.generated.entity.onbroke.models.app.Decision, java.util.List<T>> getter;
		final T owner;
	
		public BiDirectionalHelper(
				java.util.function.BiConsumer<de.ls5.dywa.generated.entity.onbroke.models.app.Decision, T> setter,
				T owner) {
	
			this.setter = setter;
			this.getter = null;
			this.owner = owner;
		}
	
		public BiDirectionalHelper(
				java.util.function.Function<de.ls5.dywa.generated.entity.onbroke.models.app.Decision, java.util.List<T>> getter,
				T owner) {
	
			this.setter = null;
			this.getter = getter;
			this.owner = owner;
		}
	
		public void setReference(final de.ls5.dywa.generated.entity.onbroke.models.app.Decision p) {
	
			// list mode
			if (this.getter != null) {
				getter.apply(p).add(owner);
			}
			// single mode
			else {
				setter.accept(p, owner);
			}
		}
	
		public void clearReference(final de.ls5.dywa.generated.entity.onbroke.models.app.Decision p) {
	
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

	default Decision casted(){
		return this;
	}
}

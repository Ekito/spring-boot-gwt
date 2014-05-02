package fr.ekito.gwt.client.event;

import com.google.gwt.event.shared.GwtEvent;

import fr.ekito.gwt.common.model.Todo;

/**
 * Delete a Todo event
 * 
 * @author AGI
 *
 */
public class DeleteTodoEvent extends GwtEvent<DeleteTodoEventHandler> {

	public static Type<DeleteTodoEventHandler> TYPE = new Type<DeleteTodoEventHandler>();
	
	/**
	 * todo Id
	 */
	Todo todo;
	
	public Todo getTodo() {
		return todo;
	}

	public DeleteTodoEvent(Todo t) {
		this.todo = t;
	}

	@Override
	protected void dispatch(DeleteTodoEventHandler handler) {
		handler.onDeleteTodoEventHandler(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<DeleteTodoEventHandler> getAssociatedType() {
		return TYPE;
	}

}

package fr.ekito.gwt.client.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Add a TODO event
 * 
 * @author AGI
 *
 */
public class AddTodoEvent extends GwtEvent<AddTodoEventHandler> {

	public static Type<AddTodoEventHandler> TYPE = new Type<AddTodoEventHandler>();

	/**
	 * todo title
	 */
	private String _todoTitle;

	public String getTodoTitle() {
		return _todoTitle;
	}

	public AddTodoEvent(String todoTitle) {
		_todoTitle = todoTitle;
	}

	@Override
	protected void dispatch(AddTodoEventHandler handler) {
		handler.onAddTodoEventHandler(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<AddTodoEventHandler> getAssociatedType() {
		return TYPE;
	}

}

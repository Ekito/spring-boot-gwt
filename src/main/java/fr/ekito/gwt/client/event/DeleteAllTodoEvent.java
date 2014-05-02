package fr.ekito.gwt.client.event;

import com.google.gwt.event.shared.GwtEvent;

/**
 * Delete all todo event
 * 
 * @author AGI
 *
 */
public class DeleteAllTodoEvent extends GwtEvent<DeleteAllTodoEventHandler>{

	public static Type<DeleteAllTodoEventHandler> TYPE = new Type<DeleteAllTodoEventHandler>();

	public DeleteAllTodoEvent(){
		
	}
	
	@Override
	protected void dispatch(DeleteAllTodoEventHandler handler) {
		handler.onDeleteAllTodoEventHandler(this);
	}

	@Override
	public com.google.gwt.event.shared.GwtEvent.Type<DeleteAllTodoEventHandler> getAssociatedType() {
		return TYPE;
	}
	
	

}

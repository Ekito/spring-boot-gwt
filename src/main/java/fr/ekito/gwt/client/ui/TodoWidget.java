package fr.ekito.gwt.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.InlineLabel;
import com.google.gwt.user.client.ui.Widget;

import fr.ekito.gwt.client.event.DeleteTodoEvent;
import fr.ekito.gwt.client.ui.component.ImageButton;
import fr.ekito.gwt.common.model.Todo;

public class TodoWidget extends Composite {

	private static TodoWidgetUiBinder uiBinder = GWT
			.create(TodoWidgetUiBinder.class);

	interface TodoWidgetUiBinder extends UiBinder<Widget, TodoWidget> {
	}
	
	/*
	 * UI components
	 */
	@UiField
	ImageButton deleteButton;
	
	@UiField
	InlineLabel textBox;
	
	/**
	 * current todo
	 */
	private Todo currentTodo;

	/**
	 * event bus
	 */
	private SimpleEventBus _eventBus;

	public TodoWidget() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public TodoWidget(Todo t, SimpleEventBus eventBus) {
		_eventBus = eventBus;
		// init display
		initWidget(uiBinder.createAndBindUi(this));
		this.currentTodo = t;
		// format display
		textBox.setText(t.getTitle());
	}
	
	@UiHandler("deleteButton")
	void onAddButtonClick(ClickEvent e) {
		// show confirm popup
		boolean confirm = Window.confirm("Supprimer "+currentTodo.getTitle()+" ?");
		if (confirm){
			// ask controller for delete
			_eventBus.fireEvent(new DeleteTodoEvent(currentTodo));
		}
	}

}

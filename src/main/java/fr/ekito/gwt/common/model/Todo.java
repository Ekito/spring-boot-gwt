package fr.ekito.gwt.common.model;

import java.io.Serializable;

/**
 * Todo Entity
 * 
 * @author AGI
 *
 */
public class Todo implements Serializable {

	private static final long serialVersionUID = -5744307016899515615L;

	String title;
	
	public Todo(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}

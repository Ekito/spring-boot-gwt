package fr.ekito.gwt.client.ui.component;

import com.google.gwt.dom.client.Element;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Image;

/**
 * Custom component to extend simple button and add 
 * resource image integration
 * @author AGI
 *
 */
public class ImageButton extends Button {
	private String text;

	public ImageButton() {
		super();
	}
	
	/**
	 * reference to the image resource bundle
	 * @param imageResource
	 */
	public void setResource(ImageResource imageResource) {
		Image img = new Image(imageResource);
		String definedStyles = img.getElement().getAttribute("style");
		img.getElement().setAttribute("style",
				definedStyles + "; vertical-align:middle;");
		DOM.insertBefore(getElement(), img.getElement(),
				DOM.getFirstChild(getElement()));
	}

	/**
	 * text on the button
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void setText(String text) {
		this.text = text;
		Element span = DOM.createElement("span");
		span.setInnerText(text);
		span.setAttribute("style", "padding-left:3px; vertical-align:middle;");

		DOM.insertChild(getElement(),
				(com.google.gwt.user.client.Element) span, 0);
	}

	@Override
	public String getText() {
		return this.text;
	}

}

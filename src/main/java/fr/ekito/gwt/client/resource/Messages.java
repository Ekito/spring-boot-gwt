package fr.ekito.gwt.client.resource;

/**
 * i18n Resource Bundle
 * Gather application messages
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
  
  /**
   * Translated helloMessage.
   * 
   * @return translated helloMessage
   */
  @Key("helloMessage")
  String helloMessage();
  
  /**
   * Translated helloMessage.
   * 
   * @return translated helloMessage
   */
  @Key("addButton")
  String addButton();
  
  @Key("deleteButton")
  String deleteButton();
  
  @Key("storeButton")
  String storeButton();
  
  @Key("loadButton")
  String loadButton();
  
  @Key("highLoadButton")
  String highLoadButton();
  
  @Key("clearButton")
  String clearButton();
  
  @Key("todoTitle")
  String todoTitle();
  

}

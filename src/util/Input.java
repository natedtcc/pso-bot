package util;

// Base class for all inputs received

public class Input {
  
  private String input;
  
  public Input() {
	  
  }

  
  public Input(String input) {
	  this.input = input;
  }

  /**
   * @return the message
   */
  public String getMessage() {
    return this.input;
  }

  /**
   * @param message the message to set
   */
  public void setMessage(String message) {
    this.input = message;
  }

}

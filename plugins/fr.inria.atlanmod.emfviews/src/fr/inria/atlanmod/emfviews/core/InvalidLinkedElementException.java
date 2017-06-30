package fr.inria.atlanmod.emfviews.core;

@SuppressWarnings("serial")
public class InvalidLinkedElementException extends RuntimeException {

  public InvalidLinkedElementException() {
    super();
  }

  public InvalidLinkedElementException(String msg) {
    super(msg);
  }
}

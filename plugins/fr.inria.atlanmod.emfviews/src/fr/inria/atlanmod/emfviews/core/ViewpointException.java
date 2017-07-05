package fr.inria.atlanmod.emfviews.core;

@SuppressWarnings("serial")
public class ViewpointException extends RuntimeException {

  public ViewpointException() {
    super();
  }

  public ViewpointException(String msg) {
    super(msg);
  }

  public ViewpointException(String msg, Object... args) {
    this(String.format(msg, args));
  }
}

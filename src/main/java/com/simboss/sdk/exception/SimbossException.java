package com.simboss.sdk.exception;

/**
 * 异常
 * Created by Abel 2018-06-20.
 **/
public class SimbossException extends RuntimeException {

  public SimbossException() {
    super();
  }

  public SimbossException(String message) {
    super(message);
  }

  public SimbossException(String message, Throwable cause) {
    super(message, cause);
  }

  public SimbossException(Throwable cause) {
    super(cause);
  }

  protected SimbossException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
    super(message, cause, enableSuppression, writableStackTrace);
  }

}

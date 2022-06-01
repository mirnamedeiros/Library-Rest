package br.imd.library.exceptions;

@SuppressWarnings("serial")
public class RestRequestException extends Exception {

	public RestRequestException() {}

	public RestRequestException(String message) {
		super(message);
	}

	public RestRequestException(Throwable cause) {
		super(cause);
	}

	public RestRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestRequestException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}


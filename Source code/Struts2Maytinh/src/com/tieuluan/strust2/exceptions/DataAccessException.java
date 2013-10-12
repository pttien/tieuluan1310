package com.tieuluan.strust2.exceptions;

public class DataAccessException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2166651831132818707L;

	/**
	 * Instantiates a new data access exception.
	 */
	public DataAccessException() {
	}

	/**
	 * Instantiates a new data access exception.
	 * 
	 * @param message
	 *            the message
	 */
	public DataAccessException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new data access exception.
	 * 
	 * @param cause
	 *            the cause
	 */
	public DataAccessException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new data access exception.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}

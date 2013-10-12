package com.tieuluan.strust2.exceptions;

/**
 * The Class BussinessException.
 */
public class BusinessException extends Exception {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6127762932224120122L;

	/**
	 * Instantiates a new bussiness exception.
	 */
	public BusinessException() {
	}

	/**
	 * Instantiates a new bussiness exception.
	 * 
	 * @param message
	 *            the message
	 */
	public BusinessException(String message) {
		super(message);
	}

	/**
	 * Instantiates a new bussiness exception.
	 * 
	 * @param cause
	 *            the cause
	 */
	public BusinessException(Throwable cause) {
		super(cause);
	}

	/**
	 * Instantiates a new bussiness exception.
	 * 
	 * @param message
	 *            the message
	 * @param cause
	 *            the cause
	 */
	public BusinessException(String message, Throwable cause) {
		super(message, cause);
	}

}

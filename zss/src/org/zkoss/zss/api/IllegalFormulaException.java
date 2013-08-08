/* IllegalFormulaException.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2013/5/1 , Created by dennis
}}IS_NOTE

Copyright (C) 2013 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zss.api;

/**
 * Indicate a illegal formula exception
 * @author dennis
 * @since 3.0.0
 */
public class IllegalFormulaException extends RuntimeException{
	private static final long serialVersionUID = 1L;
	public IllegalFormulaException() {
		super();
	}

	public IllegalFormulaException(String message, Throwable cause) {
		super(message, cause);
	}

	public IllegalFormulaException(String message) {
		super(message);
	}

	public IllegalFormulaException(Throwable cause) {
		super(cause);
	}
}

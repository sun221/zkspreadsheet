/* Importer.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		Dec 13, 2007 2:42:02 PM, Created by henrichen
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/

package org.zkoss.zss.model.sys;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.zkoss.poi.ss.usermodel.Workbook;
/**
 * Importer class that used to import a input stream into a ZK Spreadsheet {@link XBook}.
 * @author henrichen
 *
 */
public interface XImporter {
	/**
	 * Imports a file into a spreadsheet book.
	 * @param filename a filename
	 * @return the {@link Workbook}
	 */
	public XBook imports(String filename) throws IOException;
	/**
	 * Imports a file into a spreadsheet book.
	 * @param file a file
	 * @return the {@link Workbook}
	 */
	public XBook imports(File file) throws IOException;
	/**
	 * Imports an input stream into a spreadsheet book.
	 * @param is inputstream
	 * @param bookname the book name
	 * @return the {@link Workbook}
	 */
	public XBook imports(InputStream is, String bookname) throws IOException;
}

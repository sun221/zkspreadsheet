/* CellRefence.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2013/8/15     2008, Created by Dennis.Chen
}}IS_NOTE

Copyright (C) 2007 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
	This program is distributed under GPL Version 2.0 in the hope that
	it will be useful, but WITHOUT ANY WARRANTY.
}}IS_RIGHT
*/
package org.zkoss.zss.api;

/**
 * a class to represent a cell position with 2 value : row,column
 * @author Dennis.Chen
 * @since 3.0.0
 */
public class CellRefence {

	private int _row;
	private int _column;
	
	public CellRefence(){
	}
	
	public CellRefence(int row, int column){
		_row = row;
		_column = column;
	}
	
	public int getRow(){
		return _row;
	}
	
	public int getColumn(){
		return _column;
	}
	
	@Override
	public String toString(){
		return "row:"+_row+",column:"+_column;
	}
	
	@Override
	public int hashCode() {
		return _row << 14 + _column;
	}
	
	@Override
	public boolean equals(Object obj){
		return (this == obj)
			|| (obj instanceof CellRefence && ((CellRefence)obj)._row == _row && ((CellRefence)obj)._column == _column);
	}
}
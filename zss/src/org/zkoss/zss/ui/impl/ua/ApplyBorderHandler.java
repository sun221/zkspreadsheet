/* BorderHandler.java

{{IS_NOTE
	Purpose:
		
	Description:
		
	History:
		2013/8/5 , Created by dennis
}}IS_NOTE

Copyright (C) 2013 Potix Corporation. All Rights Reserved.

{{IS_RIGHT
}}IS_RIGHT
*/
package org.zkoss.zss.ui.impl.ua;

import org.zkoss.lang.Strings;
import org.zkoss.util.resource.Labels;
import org.zkoss.zss.api.CellOperationUtil;
import org.zkoss.zss.api.Range;
import org.zkoss.zss.api.Ranges;
import org.zkoss.zss.api.AreaRef;
import org.zkoss.zss.api.Range.ApplyBorderType;
import org.zkoss.zss.api.model.Sheet;
import org.zkoss.zss.api.model.CellStyle.BorderType;
import org.zkoss.zss.ui.UserActionContext;
import org.zkoss.zss.ui.impl.undo.CellBorderAction;
import org.zkoss.zss.ui.sys.UndoableActionManager;

/**
 * @author dennis
 *
 */
public class ApplyBorderHandler extends AbstractProtectedHandler {

	private final ApplyBorderType _applyType;
	private final BorderType _borderType;
	public ApplyBorderHandler(ApplyBorderType applyType, BorderType borderType) {
		this._applyType = applyType;
		this._borderType = borderType;
	}

	@Override
	protected boolean processAction(UserActionContext ctx) {
		Sheet sheet = ctx.getSheet();
		AreaRef selection = ctx.getSelection();
		Range range = Ranges.range(sheet, selection);
		
		String color = getColor(ctx);
		
		UndoableActionManager uam = ctx.getSpreadsheet().getUndoableActionManager();
		uam.doAction(new CellBorderAction(Labels.getLabel("zss.undo.cellBorder"),sheet, selection.getRow(), selection.getColumn(), 
					selection.getLastRow(), selection.getLastColumn(), 
					_applyType, _borderType, color));
		return true;
	}

	protected String getColor(UserActionContext ctx){
		String color = (String)ctx.getData("color");
		if (Strings.isEmpty(color)) {//CE version won't provide color
			color = getDefaultColor();
		}
		return color;
	}
	
	protected String getDefaultColor() {
		return "#000000";
	}
}

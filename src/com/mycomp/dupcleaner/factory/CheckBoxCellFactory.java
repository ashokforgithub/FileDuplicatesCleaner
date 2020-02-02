/**
 * 
 */
package com.mycomp.dupcleaner.factory;

import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.util.Callback;

/**
 * @author Ashok
 *
 */
public class CheckBoxCellFactory<S, T>
implements Callback<TableColumn<S, T>, TableCell<S, T>> {
@Override public TableCell<S, T> call(TableColumn<S, T> p) {
return new CheckBoxTableCell<>();
}
}

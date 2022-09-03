package edu.usac.ipc1.inventario.Operacion;

import java.text.DateFormat;
import javax.swing.table.AbstractTableModel;

public class OperacionTableModel extends AbstractTableModel {

    private final String[] COL_NAMES = {"Fecha", "Detalle", "Entrada", "Salida", "Existencias"};
    private Operacion[] operaciones;
    private double[] existencias;

    public void setOperaciones(Operacion[] operaciones) {
        this.operaciones = operaciones;
        double auxExistencia = 0;
        existencias = new double[operaciones.length];
        for (int i = 0; i < operaciones.length; i++) {
            if (operaciones[i] != null) {
                auxExistencia = auxExistencia + operaciones[i].getEntrada() - operaciones[i].getSalida();
                existencias[i] = auxExistencia;
            }
        }
        fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        if (operaciones == null) {
            return 0;
        }
        int largo = 0;
        for (Operacion operacion : operaciones) {
            if (operacion != null) {
                largo++;
            }
        }
        return largo;
    }

    @Override
    public int getColumnCount() {
        return COL_NAMES.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return switch (col) {
            case 0 ->
                DateFormat
                .getDateTimeInstance()
                .format(operaciones[row].getFechaHora());
            case 1 ->
                operaciones[row].getDetalle();
            case 2 ->
                operaciones[row].getEntrada();
            case 3 ->
                operaciones[row].getSalida();
            case 4 ->
                existencias[row];
            default ->
                "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return COL_NAMES[column];
    }

}

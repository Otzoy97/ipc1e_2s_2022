package edu.usac.ipc1.asignacion;

import javax.swing.table.AbstractTableModel;

/*
 * Esta clase controla la forma de visualizar la información de los cursos asignados a un estudiante en una tabla
 */
public class CursoTableModel extends AbstractTableModel {
    
    private final String[] colNames = {"Cursos"};
    private Curso[] cursosRef;
       
    /**
     * Determina cuales serán los cursos que se visualizarán.
     * 
     * @param estudiante
     */
    public void showCursosEstudiante(Estudiante estudiante) {
        this.cursosRef = estudiante.getCursos();
        // Indica a la tabla que deberá actualizar la información que está mostrando
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        if (cursosRef == null) {
            return 0;
        }
        int countCursos = 0;
        for (Curso cursosRef1 : cursosRef) {
            if (cursosRef1 != null) {
                countCursos++;
            }
        }
        return countCursos;
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        return switch(col) {
            case 0 -> cursosRef[row].getNombre();
            default -> "";
        };
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    
    
}

package edu.usac.ipc1.asignacion;

import javax.swing.DefaultComboBoxModel;

/*
 * Esta clase controla la forma de visualizar la información de los estudiantes creados en un combo box
 */
public class EstudianteModelList extends DefaultComboBoxModel<Estudiante> {

    private Estudiante[] estudiantes;

    public EstudianteModelList(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    @Override
    public Estudiante getElementAt(int index) {
        return estudiantes[index];
    }

    @Override
    public int getSize() {
        int countEstudiantes = 0;
        for (Estudiante cursosRef1 : estudiantes) {
            if (cursosRef1 != null) {
                countEstudiantes++;
            }
        }
        return countEstudiantes;
    }

}

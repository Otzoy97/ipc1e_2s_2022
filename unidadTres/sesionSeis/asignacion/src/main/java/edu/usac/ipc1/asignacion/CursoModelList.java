package edu.usac.ipc1.asignacion;

import javax.swing.DefaultComboBoxModel;

/*
 * Esta clase controla la forma de visualizar la información de los cursos creados en un combo box
 */
public class CursoModelList extends DefaultComboBoxModel<Curso> {

    private Curso[] cursos;

    public CursoModelList(Curso[] cursos) {
        this.cursos = cursos;
    }

    @Override
    public Curso getElementAt(int index) {
        return cursos[index];
    }

    @Override
    public int getSize() {
        int countCursos = 0;
        for (Curso cursosRef1 : cursos) {
            if (cursosRef1 != null) {
                countCursos++;
            }
        }
        return countCursos;
    }
}

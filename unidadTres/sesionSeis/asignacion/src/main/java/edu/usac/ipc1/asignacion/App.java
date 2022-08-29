package edu.usac.ipc1.asignacion;

/**
 * Esta aplicación tiene como objetivo ejemplificar el uso de 
 * de diferentes clases para crear, actualizar y visualizar información
 * haciendo uso de las propiedades de POO:
 *  - Encapsulamiento
 *  - Abstracción
 *  - Herencia 
 *  - Polimorfismo
 * 
 * Las clases usadas procuran seguir:
 *  - El principio de responsabilidad única
 *  - El principio abierto-cerrado
 *  - Alta cohesión, bajo acoplamiento.
 */
public class App extends javax.swing.JFrame {

    private Curso[] cursos = new Curso[5];
    private Estudiante[] estudiantes = new Estudiante[5];
    
    private CursoTableModel tableModel = new CursoTableModel();
    private CursoModelList cursoModelList = new CursoModelList(cursos);
    private EstudianteModelList estudianteModelList = new EstudianteModelList(estudiantes);
    
    public App() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmbEstudiantes = new javax.swing.JComboBox<>();
        txtNombreEstudiante = new javax.swing.JTextField();
        javax.swing.JButton crearEstudiante = new javax.swing.JButton();
        javax.swing.JButton asignarCurso = new javax.swing.JButton();
        txtNombreCurso = new javax.swing.JTextField();
        javax.swing.JButton crearCurso = new javax.swing.JButton();
        cmbCursos = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtBuscarCursosEstudiante = new javax.swing.JTextField();
        javax.swing.JButton buscarCursos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cmbEstudiantes.setModel(this.estudianteModelList);

        crearEstudiante.setText("Crear estudiante");
        crearEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearEstudianteActionPerformed(evt);
            }
        });

        asignarCurso.setText("Asignar");
        asignarCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarCursoActionPerformed(evt);
            }
        });

        crearCurso.setText("Crear Curso");
        crearCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCursoActionPerformed(evt);
            }
        });

        cmbCursos.setModel(this.cursoModelList);

        jTable1.setModel(this.tableModel);
        jScrollPane1.setViewportView(jTable1);

        buscarCursos.setText("Buscar cursos");
        buscarCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCursosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearCurso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmbCursos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbEstudiantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(asignarCurso))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtBuscarCursosEstudiante)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarCursos))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(crearEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearEstudiante))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombreCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearCurso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cmbEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbCursos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(asignarCurso, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarCursosEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarCursos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearEstudianteActionPerformed
        for (int i = 0; i < estudiantes.length; i++) {
            if(estudiantes[i] == null) {
                estudiantes[i] = new Estudiante(txtNombreEstudiante.getText().trim());
                break;
            }
        }
    }//GEN-LAST:event_crearEstudianteActionPerformed

    private void crearCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCursoActionPerformed
        for (int i = 0; i < cursos.length; i++) {
            if(cursos[i] == null) {
                cursos[i] = new Curso(txtNombreCurso.getText().trim());
                break;
            }
        }
    }//GEN-LAST:event_crearCursoActionPerformed

    private void asignarCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCursoActionPerformed
        Estudiante estudiante = cmbEstudiantes.getItemAt(cmbEstudiantes.getSelectedIndex());
        Curso curso = cmbCursos.getItemAt(cmbCursos.getSelectedIndex());

        estudiante.agregarCurso(curso);
    }//GEN-LAST:event_asignarCursoActionPerformed

    private void buscarCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCursosActionPerformed
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getNombre().equals(txtBuscarCursosEstudiante.getText().trim())) {
                tableModel.showCursosEstudiante(estudiante);
                break;
            }
        }
    }//GEN-LAST:event_buscarCursosActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new App().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Curso> cmbCursos;
    private javax.swing.JComboBox<Estudiante> cmbEstudiantes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtBuscarCursosEstudiante;
    private javax.swing.JTextField txtNombreCurso;
    private javax.swing.JTextField txtNombreEstudiante;
    // End of variables declaration//GEN-END:variables
}

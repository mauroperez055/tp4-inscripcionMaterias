
package Vistas;

import Clases.Alumno;
import Clases.Materia;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class VistaInscripcion extends javax.swing.JInternalFrame {

    private HashSet<Materia> materias;
    private HashSet<Alumno> alumnos;
    
    public VistaInscripcion(HashSet<Alumno> alumnos, HashSet<Materia> materias) {
        initComponents();
        this.materias = materias;
        this.alumnos = alumnos;
        
        for (Materia mat: materias) {
            cboMaterias.addItem(mat.getNombre());
        }
        
        for (Alumno alu: alumnos) {
            cboAlumnos.addItem(alu.getApellido() + " " + alu.getNombre());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblEleccionMat = new javax.swing.JLabel();
        lblEleccionAlu = new javax.swing.JLabel();
        cboMaterias = new javax.swing.JComboBox<>();
        cboAlumnos = new javax.swing.JComboBox<>();
        btnInscribir = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 204));
        lblTitulo.setText("Formulario de Inscripción");

        lblEleccionMat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEleccionMat.setForeground(new java.awt.Color(0, 102, 204));
        lblEleccionMat.setText("ELIJA UNA MATERIA:");

        lblEleccionAlu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEleccionAlu.setForeground(new java.awt.Color(0, 102, 204));
        lblEleccionAlu.setText("ELIJA UN ALUMNO:");

        cboMaterias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        cboAlumnos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));

        btnInscribir.setForeground(new java.awt.Color(0, 102, 204));
        btnInscribir.setText("Inscribir");
        btnInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInscribirActionPerformed(evt);
            }
        });

        btnSalir.setForeground(new java.awt.Color(0, 102, 204));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEleccionMat)
                                    .addComponent(lblEleccionAlu))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addGap(63, 63, 63)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnInscribir)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEleccionMat)
                            .addComponent(cboMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEleccionAlu)
                            .addComponent(cboAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 143, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSalir)
                            .addComponent(btnInscribir))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInscribirActionPerformed
        // TODO add your handling code here:
        if (cboMaterias.getSelectedItem().equals("-") || cboAlumnos.getSelectedItem().equals("-")) {
            JOptionPane.showMessageDialog(this, "No deben quedar campos vacíos!", "Atención!", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String materiaItem = cboMaterias.getSelectedItem().toString();
        String alumnoItem = cboAlumnos.getSelectedItem().toString();
        
        Materia materia = null;
        
        for (Materia mat: materias) {
            if (mat.getNombre().equals(materiaItem)) {
                materia = mat;
                break;
            }
        }
        
        Alumno alumno = null;
        
        for (Alumno alu: alumnos) {
            String nombreCompleto = alu.getApellido() + " " + alu.getNombre();
            if (nombreCompleto.equals(alumnoItem)) {
                alumno = alu;
                break;
            }
        }
        
        if (materia != null && alumno != null) {
            alumno.agregarMateria(materia);
            JOptionPane.showMessageDialog(this, "Inscripción realizada correctamente!", "Excelente!", JOptionPane.INFORMATION_MESSAGE);
        }
        
        System.out.println("Materias de " + alumno.getApellido() + " " + alumno.getNombre() + ": " + alumno.getMateriasInscripto());
    }//GEN-LAST:event_btnInscribirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInscribir;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboAlumnos;
    private javax.swing.JComboBox<String> cboMaterias;
    private javax.swing.JLabel lblEleccionAlu;
    private javax.swing.JLabel lblEleccionMat;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}


package Vistas;

import Clases.Alumno;
import Clases.Materia;
import java.util.HashSet;

public class VistaMaterias extends javax.swing.JInternalFrame {

    private final HashSet<Materia> materias;

    public VistaMaterias(HashSet<Materia> materias) {
        initComponents();
        this.materias = materias;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCodigoMat = new javax.swing.JLabel();
        lblNombreMat = new javax.swing.JLabel();
        lblAnioMat = new javax.swing.JLabel();
        txtCodigoMat = new javax.swing.JTextField();
        txtNombreMat = new javax.swing.JTextField();
        txtAnioMat = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 102, 204));
        lblTitulo.setText("Formulario de Materias");

        lblCodigoMat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCodigoMat.setForeground(new java.awt.Color(0, 102, 204));
        lblCodigoMat.setText("CODIGO DE MATERIA:");

        lblNombreMat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNombreMat.setForeground(new java.awt.Color(0, 102, 204));
        lblNombreMat.setText("NOMBRE DE LA MATERIA:");

        lblAnioMat.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAnioMat.setForeground(new java.awt.Color(0, 102, 204));
        lblAnioMat.setText("AÑO AL QUE PERTENECE:");

        btnSalir.setForeground(new java.awt.Color(0, 102, 204));
        btnSalir.setText("Salir");

        btnGuardar.setForeground(new java.awt.Color(0, 102, 204));
        btnGuardar.setText("Guardar");

        btnNuevo.setForeground(new java.awt.Color(0, 102, 204));
        btnNuevo.setText("Nuevo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoMat)
                    .addComponent(lblNombreMat)
                    .addComponent(lblAnioMat))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombreMat, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(txtCodigoMat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnioMat))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnNuevo)
                .addGap(18, 18, 18)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 120, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(116, 116, 116))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoMat)
                    .addComponent(txtCodigoMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreMat)
                    .addComponent(txtNombreMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnioMat)
                    .addComponent(txtAnioMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardar)
                    .addComponent(btnNuevo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblAnioMat;
    private javax.swing.JLabel lblCodigoMat;
    private javax.swing.JLabel lblNombreMat;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtAnioMat;
    private javax.swing.JTextField txtCodigoMat;
    private javax.swing.JTextField txtNombreMat;
    // End of variables declaration//GEN-END:variables
}

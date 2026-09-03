
package Vistas;

import Clases.Alumno;
import Clases.Materia;
import java.util.HashSet;

public class VistaPrincipal extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(VistaPrincipal.class.getName());
    private static final HashSet<Alumno> alumnos = new HashSet<>();
    private static final HashSet<Materia> materias = new HashSet<>();

    public VistaPrincipal() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumno = new javax.swing.JMenu();
        jItemAlumno = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jItemMateria = new javax.swing.JMenuItem();
        jMenuRegistro = new javax.swing.JMenu();
        jItemRegistro = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(600, 450));
        setResizable(false);
        setSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 491, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jMenuAlumno.setForeground(new java.awt.Color(0, 0, 0));
        jMenuAlumno.setText("Alumno");
        jMenuAlumno.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jItemAlumno.setText("Agregar Alumno");
        jItemAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemAlumnoActionPerformed(evt);
            }
        });
        jMenuAlumno.add(jItemAlumno);

        jMenuBar1.add(jMenuAlumno);

        jMenuMateria.setForeground(new java.awt.Color(0, 0, 0));
        jMenuMateria.setText("Materia");
        jMenuMateria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jItemMateria.setText("Agregar Materia");
        jItemMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemMateriaActionPerformed(evt);
            }
        });
        jMenuMateria.add(jItemMateria);

        jMenuBar1.add(jMenuMateria);

        jMenuRegistro.setForeground(new java.awt.Color(0, 0, 0));
        jMenuRegistro.setText("Registro");
        jMenuRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jItemRegistro.setText("Agregar Inscripcion");
        jItemRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jItemRegistroActionPerformed(evt);
            }
        });
        jMenuRegistro.add(jItemRegistro);

        jMenuBar1.add(jMenuRegistro);

        jMenuSalir.setForeground(new java.awt.Color(0, 0, 0));
        jMenuSalir.setText("Salir");
        jMenuSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSalirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuSalirMouseClicked

    private void jItemAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemAlumnoActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaAlumnos vistaAlu = new VistaAlumnos(alumnos);
        vistaAlu.setVisible(true);
        escritorio.add(vistaAlu);
        vistaAlu.toFront();
    }//GEN-LAST:event_jItemAlumnoActionPerformed

    private void jItemMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemMateriaActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaMaterias vistaMat = new VistaMaterias();
        System.out.println(vistaMat);
        vistaMat.setVisible(true);
        escritorio.add(vistaMat);
        vistaMat.toFront();
    }//GEN-LAST:event_jItemMateriaActionPerformed

    private void jItemRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jItemRegistroActionPerformed
        // TODO add your handling code here:
        escritorio.removeAll();
        escritorio.repaint();
        VistaInscripcion vistaIns = new VistaInscripcion(alumnos);
        System.out.println(vistaIns);
        vistaIns.setVisible(true);
        escritorio.add(vistaIns);
        vistaIns.toFront();
    }//GEN-LAST:event_jItemRegistroActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new VistaPrincipal().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jItemAlumno;
    private javax.swing.JMenuItem jItemMateria;
    private javax.swing.JMenuItem jItemRegistro;
    private javax.swing.JMenu jMenuAlumno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuRegistro;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tesis2herramienta;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import pe.edu.pucp.tesis.algorithm.Grasp;
import pe.edu.pucp.tesis.algorithm.VariablesGenericas;
import pe.edu.pucp.tesis.algorithm.Voraz;
import pe.edu.pucp.tesis.config.ConfigAlgoritmo;
import pe.edu.pucp.tesis.config.ConfigMedico;
import pe.edu.pucp.tesis.config.ConfigPaciente;
import pe.edu.pucp.tesis.config.ConfigSolucion;

/**
 *
 * @author PC-HP
 */
public class WindowMain extends javax.swing.JFrame {
    
    Grasp g=new Grasp();
    Voraz v=new Voraz();
    VariablesGenericas vg=new VariablesGenericas();
    
    public WindowMain() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        ImageIcon carga=new ImageIcon("C:\\Users\\PC-HP\\Desktop\\Tesis 2\\Tesis2Herramienta\\src\\images\\iconodatos.png");
        btnCargaDeDatos.setIcon(carga);
       
        ImageIcon simulacion=new ImageIcon("C:\\Users\\PC-HP\\Desktop\\Tesis 2\\Tesis2Herramienta\\src\\images\\iconosimulacion.png");
        btnSimulacion.setIcon(simulacion);
        
        ImageIcon config=new ImageIcon("C:\\Users\\PC-HP\\Desktop\\Tesis 2\\Tesis2Herramienta\\src\\images\\iconoconfig.png");
        btnConfig.setIcon(config);
        
        ImageIcon usuario=new ImageIcon("C:\\Users\\PC-HP\\Desktop\\Tesis 2\\Tesis2Herramienta\\src\\images\\iconousuario.png");
        btnUsr.setIcon(usuario);
        
        panelPrincipal.setVisible(true);
        panelSimulacion.setVisible(false);
        panelCargaDatos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelConfiguracion.setVisible(false);
        
        panelCargaDatos.obtenerDatosLeidos(g,v);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCargaDeDatos = new javax.swing.JButton();
        btnSimulacion = new javax.swing.JButton();
        btnConfig = new javax.swing.JButton();
        btnUsr = new javax.swing.JButton();
        panelPrincipal = new javax.swing.JPanel();
        panelConfiguracion = new tesis2herramienta.WindowConfiguracionParametrosPanel();
        panelSimulacion = new tesis2herramienta.WindowSimulacionPanel();
        panelCargaDatos = new tesis2herramienta.WindowCargaDatosPanel();
        panelUsuarios = new tesis2herramienta.WindowUsuariosPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCargaDeDatos.setBackground(new java.awt.Color(194, 227, 234));
        btnCargaDeDatos.setText("<html><center>Carga de <br>datos</center></html>");
        btnCargaDeDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargaDeDatosActionPerformed(evt);
            }
        });

        btnSimulacion.setBackground(new java.awt.Color(194, 227, 234));
        btnSimulacion.setText("<html><center>Asignar de <br>citas médicas</center></html>");
        btnSimulacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimulacionActionPerformed(evt);
            }
        });

        btnConfig.setBackground(new java.awt.Color(194, 227, 234));
        btnConfig.setText("<html><center>Configuración <br>de Parámetros</center></html>");
        btnConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfigActionPerformed(evt);
            }
        });

        btnUsr.setBackground(new java.awt.Color(194, 227, 234));
        btnUsr.setText("<html><center>Usuarios</center></html>");
        btnUsr.setMinimumSize(new java.awt.Dimension(99, 37));
        btnUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsrActionPerformed(evt);
            }
        });

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setLayout(null);

        panelConfiguracion.setPreferredSize(new java.awt.Dimension(1150, 438));
        panelPrincipal.add(panelConfiguracion);
        panelConfiguracion.setBounds(10, 0, 910, 610);
        panelPrincipal.add(panelSimulacion);
        panelSimulacion.setBounds(140, -10, 400, 270);
        panelPrincipal.add(panelCargaDatos);
        panelCargaDatos.setBounds(10, 0, 680, 700);
        panelPrincipal.add(panelUsuarios);
        panelUsuarios.setBounds(20, -10, 636, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCargaDeDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSimulacion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnConfig, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCargaDeDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                    .addComponent(btnSimulacion)
                    .addComponent(btnConfig)
                    .addComponent(btnUsr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfigActionPerformed
        panelSimulacion.setVisible(false);
        panelCargaDatos.setVisible(false);
        panelUsuarios.setVisible(false);
        panelConfiguracion.setVisible(true);
        this.setSize(708, 680);
    }//GEN-LAST:event_btnConfigActionPerformed

    private void btnUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsrActionPerformed
        panelSimulacion.setVisible(false);
        panelCargaDatos.setVisible(false);
        panelUsuarios.setVisible(true);
        panelConfiguracion.setVisible(false);
        
        this.setSize(708, 400);
    }//GEN-LAST:event_btnUsrActionPerformed

    private void btnCargaDeDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargaDeDatosActionPerformed
        
        panelSimulacion.setVisible(false);
        panelCargaDatos.setVisible(true);
        panelCargaDatos.cleanPanel();
        vg=panelCargaDatos.vg;
        panelUsuarios.setVisible(false);
        panelConfiguracion.setVisible(false); 
        
        this.setSize(708, 700);
    }//GEN-LAST:event_btnCargaDeDatosActionPerformed

    private void btnSimulacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimulacionActionPerformed
        
        if (panelCargaDatos.flagFileLoad)
        {
            panelSimulacion.setVisible(true);
            panelSimulacion.referenciaAlgoritmos(g, v, vg);
            panelCargaDatos.setVisible(false);
            panelUsuarios.setVisible(false);
            panelConfiguracion.setVisible(false);
            this.setSize(708, 400);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No existen datos cargados","Advertencia",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSimulacionActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargaDeDatos;
    private javax.swing.JButton btnConfig;
    private javax.swing.JButton btnSimulacion;
    private javax.swing.JButton btnUsr;
    private tesis2herramienta.WindowCargaDatosPanel panelCargaDatos;
    private tesis2herramienta.WindowConfiguracionParametrosPanel panelConfiguracion;
    private javax.swing.JPanel panelPrincipal;
    private tesis2herramienta.WindowSimulacionPanel panelSimulacion;
    private tesis2herramienta.WindowUsuariosPanel panelUsuarios;
    // End of variables declaration//GEN-END:variables
}

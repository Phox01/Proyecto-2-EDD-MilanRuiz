/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classes.ArchivoTxt;
import Classes.Resumen;
import Classes.GUIFunctions;
import java.io.File;
import Classes.Hashtable;
import Classes.HashTableTitulos;
import Classes.ListaPalabrasClave;
import Classes.ListaAutores;
import Classes.HashTableTitulosAutores;

/**
 *
 * @author <Joseph Ruiz EDD Unimet>
 */
public class WelcomeGUI extends javax.swing.JFrame {

    ArchivoTxt txt = new ArchivoTxt();
    GUIFunctions functions = new GUIFunctions();
    String[] table = new String[0];
    Object[] txtArray = new Object[2];
    //Cambiar esto por la clase hashtable
    //Object[] hasthtable= new Object[1001];
    static Hashtable hashtable;
    static HashTableTitulos hashtable2;
    static ListaPalabrasClave listaPalabrasClave;
    static ListaAutores listaAutores;
    static HashTableTitulosAutores hashtable3;

    /**
     * Creates new form WelcomeGUI
     */
    public WelcomeGUI(Hashtable hashtable, HashTableTitulos hashtable2, ListaPalabrasClave listaPalabrasClave, ListaAutores listaAutores, HashTableTitulosAutores hashtable3) {
        initComponents();
        setLocationRelativeTo(null);
        this.hashtable = hashtable;
        this.hashtable2 = hashtable2;
        this.listaPalabrasClave = listaPalabrasClave;
        this.listaAutores = listaAutores;
        this.hashtable3 = hashtable3;
        functions.openingDatabase(hashtable, hashtable2, listaPalabrasClave, listaAutores, hashtable3);
        if (!(hashtable.getElements() > 0)) {
            menugui.setVisible(false);
        }
        ok.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Import = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        menugui = new javax.swing.JButton();
        ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Import.setText("Importar");
        Import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportActionPerformed(evt);
            }
        });
        jPanel1.add(Import, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("MetroMendeley");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        menugui.setText("Menu");
        menugui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuguiActionPerformed(evt);
            }
        });
        jPanel1.add(menugui, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        jPanel1.add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 260, -1, -1));

        jLabel3.setText("Para reiniciar la database, borre todos los archivos de la carpeta");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, 20));

        jLabel4.setText("LEER DE PRIMERO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, 20));

        jLabel5.setText("Al presionar Importar, saldrá el botón \"ok\" para confirmar la acción");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, 20));

        jLabel6.setText("Al presionar \"ok\", saldrá el botón \"importar\" para continuar ingresando datos");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, 20));

        jLabel7.setText("Al cerrar el programa, los datos se guardan solos");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, 20));

        jLabel8.setText("El botón de \"Menú\" saldrá cuando haya información en la hashtable");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, 20));

        jLabel9.setText("Los datos guardados pueden ser vistos en la carpeta SavedData, dentro del proyecto");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/obit.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportActionPerformed
        txtArray = txt.readTxt(true, new File("SavedData/"));
        ok.setVisible(true);
        Import.setVisible(false);
    }//GEN-LAST:event_ImportActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
        Resumen resumenTxt = (Resumen) txtArray[1];
        File from = (File) txtArray[0];
        functions.introducing(resumenTxt.isEmpty(), true, resumenTxt, hashtable, from, hashtable2, listaPalabrasClave, listaAutores, hashtable3);
        if (hashtable.getElements() > 0) {
            menugui.setVisible(true);
        }
        ok.setVisible(false);
        Import.setVisible(true);
    }//GEN-LAST:event_okActionPerformed

    private void menuguiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuguiActionPerformed
        Controlador window10 = new Controlador(hashtable, hashtable2, listaPalabrasClave, listaAutores, hashtable3);
        window10.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_menuguiActionPerformed

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
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeGUI(hashtable, hashtable2, listaPalabrasClave, listaAutores, hashtable3).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Import;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton menugui;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}

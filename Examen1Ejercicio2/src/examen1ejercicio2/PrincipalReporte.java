/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examen1ejercicio2;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author pabli
 */
public class PrincipalReporte extends javax.swing.JFrame {

    ArrayList<ClaseContenedora> compras = new ArrayList();
    
    ArrayList<Double> subTotal = new ArrayList();
    
    double suma = 0.0;
    
    double impuesto;
    
    double total;
    
    
    /**
     * Creates new form VentanaPrincipal
     */
    public PrincipalReporte() {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        tFArticulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tFCantidad = new javax.swing.JTextField();
        tFPrecioUnitario = new javax.swing.JTextField();
        btnGenerarReporte = new javax.swing.JButton();
        btnGuardarArticulo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 0, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Articulos a Comprar");

        btnExit.setBackground(new java.awt.Color(255, 0, 102));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(83, 83, 83))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnExit)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tFArticulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFArticuloFocusGained(evt);
            }
        });
        tFArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFArticuloMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel2.setText("Articulo");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
        jLabel4.setText("Precio Unitario");

        tFCantidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFCantidadFocusGained(evt);
            }
        });
        tFCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFCantidadMouseClicked(evt);
            }
        });

        tFPrecioUnitario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tFPrecioUnitarioFocusGained(evt);
            }
        });
        tFPrecioUnitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tFPrecioUnitarioMouseClicked(evt);
            }
        });

        btnGenerarReporte.setText("Generar Reporte");
        btnGenerarReporte.setEnabled(false);
        btnGenerarReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteActionPerformed(evt);
            }
        });

        btnGuardarArticulo.setText("Guardar Articulo");
        btnGuardarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarArticuloActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGuardarArticulo)
                        .addGap(18, 18, 18)
                        .addComponent(btnGenerarReporte))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(tFArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(tFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(tFPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tFArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tFCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tFPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarReporte)
                    .addComponent(btnGuardarArticulo))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private int xMouse, yMouse;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
        System.out.println("X: " + xMouse);
        System.out.println("Y: " + yMouse);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // TODO add your handling code here:
        this.setLocation(
                this.getLocation().x + evt.getX() - xMouse, this.getLocation().y + evt.getY() - yMouse
        );
    
    
    }//GEN-LAST:event_formMouseDragged

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnGenerarReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteActionPerformed
        // TODO add your handling code here:
        VentanaDeReporte vDR = new VentanaDeReporte(this,true); 
        
        vDR.compras = compras;
        vDR.subTotal = subTotal;
        vDR.suma = suma;
        vDR.impuesto = impuesto;
        vDR.total = total;
        
        vDR.setResizable(false);
        vDR.setLocationRelativeTo(null);
        vDR.setVisible(true);
        
    }//GEN-LAST:event_btnGenerarReporteActionPerformed

    private void btnGuardarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarArticuloActionPerformed
        
        boolean statusMsg = false;
        
        if (tFArticulo.getText().equals("")) {
               statusMsg = true;
               tFArticulo.setBorder(new LineBorder(Color.RED,2));
           }  
           
            if (tFCantidad.getText().equals("")) {
               statusMsg = true;
                tFCantidad.setBorder(new LineBorder(Color.RED,2));
           } 
        
           
           if (tFPrecioUnitario.getText().equals("")) {
               statusMsg = true;
               tFPrecioUnitario.setBorder(new LineBorder(Color.RED,2));
           } 
           
           try{
              Integer.parseInt(tFCantidad.getText()); 
           }catch(Exception e){
               statusMsg = true;
            tFCantidad.setBorder(new LineBorder(Color.RED,2));
           }
           
           try{
              Double.parseDouble(tFPrecioUnitario.getText()); 
           }catch(Exception e){
               statusMsg = true;
            tFPrecioUnitario.setBorder(new LineBorder(Color.RED,2));
           }
           
           
        
           
           if (!statusMsg) {
               btnGenerarReporte.setEnabled(true);
               
        double precioTotall = (Integer.parseInt(tFCantidad.getText())) * (Double.parseDouble(tFPrecioUnitario.getText()));
        
        compras.add(new ClaseContenedora(tFArticulo.getText(), 
                Integer.parseInt(tFCantidad.getText()), 
                Double.parseDouble(tFPrecioUnitario.getText()), 
                        precioTotall));
        
        subTotal.add(precioTotall);
        
        suma = subTotal.stream().mapToDouble(Double::doubleValue).sum();
        
        impuesto = (0.16) * suma ;
       
        total = suma + impuesto ;
        
        
        tFArticulo.setText("");
        tFCantidad.setText("");
        tFPrecioUnitario.setText("");
       
       } 
           
    }//GEN-LAST:event_btnGuardarArticuloActionPerformed
    Color myColor = new Color(140,140,140);
    private void tFArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFArticuloMouseClicked
        // TODO add your handling code here:
        tFArticulo.setBorder(new LineBorder(myColor,1));
    }//GEN-LAST:event_tFArticuloMouseClicked

    private void tFCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFCantidadMouseClicked
        // TODO add your handling code here:
        tFCantidad.setBorder(new LineBorder(myColor,1));
    }//GEN-LAST:event_tFCantidadMouseClicked

    private void tFPrecioUnitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tFPrecioUnitarioMouseClicked
        // TODO add your handling code here:
        tFPrecioUnitario.setBorder(new LineBorder(myColor,1));
    }//GEN-LAST:event_tFPrecioUnitarioMouseClicked

    private void tFArticuloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFArticuloFocusGained
        // TODO add your handling code here:
        changeColor(tFArticulo);
    }//GEN-LAST:event_tFArticuloFocusGained

    private void tFCantidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFCantidadFocusGained
        // TODO add your handling code here:
        changeColor(tFCantidad);
    }//GEN-LAST:event_tFCantidadFocusGained

    private void tFPrecioUnitarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tFPrecioUnitarioFocusGained
        // TODO add your handling code here:
        changeColor(tFPrecioUnitario);
    }//GEN-LAST:event_tFPrecioUnitarioFocusGained

    private void changeColor(JTextField cuadro){
       cuadro.setBorder(new LineBorder(myColor,2));
       
    }
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
            java.util.logging.Logger.getLogger(PrincipalReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalReporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalReporte().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGenerarReporte;
    private javax.swing.JButton btnGuardarArticulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tFArticulo;
    private javax.swing.JTextField tFCantidad;
    private javax.swing.JTextField tFPrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
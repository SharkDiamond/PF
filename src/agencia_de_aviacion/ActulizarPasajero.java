/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia_de_aviacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabriel
 */
public class ActulizarPasajero extends javax.swing.JPanel {

   
       Fuente f=new Fuente();
  java.util.Timer d=new java.util.Timer();
     private Statement estatuto;
    private ResultSet resultado;
 public Connection s=null;
 
    
    
    public ActulizarPasajero() {
        initComponents();
        this.setAlignmentX(1000);
            f.conectorBD();
    }
    /**
     * This method is called from within the constructor to initialize the form.
  sdThe content of this method is always
  sd
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        identificacion = new javax.swing.JTextField();
        elegidorcampo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        datoNuevo = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));

        elegidorcampo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Nombre", "Apellido", "Numero De Vuelo", "Fecha De Nacimiento" }));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Identificacion");

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1))
                    .addComponent(datoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(identificacion)
                        .addComponent(elegidorcampo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(elegidorcampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(datoNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
       //LO QUE SE VA A ACTUALIZAR 
        
      try {
       Interfaz nd=new Interfaz(1);
            
                String dato=(String) this.elegidorcampo.getSelectedItem();
                
                        
                         if(dato.equals("Nombre")){
                      JOptionPane.showMessageDialog(null, "Nombre");
              estatuto.executeUpdate("UPDATE Pasajeros SET  Nombre= '"+this.datoNuevo.getText()+"' WHERE Identificacion = "+this.identificacion.getText());
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
              nd.cargartabla1();
       
                         }
                  
                         
                           if(dato.equals("Apellido")){
                      JOptionPane.showMessageDialog(null, "Apellido");
              estatuto.executeUpdate("UPDATE Pasajeros SET  Nombre= '"+this.datoNuevo.getText()+"' WHERE Identificacion = "+this.identificacion.getText());
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
              nd.cargartabla1();
       
                         }
                  
                               
                             if(dato.equals("Numero De Vuelo")){
                      JOptionPane.showMessageDialog(null, "Vuelo");
              estatuto.executeUpdate("UPDATE Pasajeros SET  Id_Vuelo= '"+this.datoNuevo.getText()+"' WHERE Identificacion = "+this.identificacion.getText());
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
              nd.cargartabla1();
       
                         }
                  
                         
                           if(dato.equals("Fecha De Nacimiento")){
                      JOptionPane.showMessageDialog(null, "Fecha");
              estatuto.executeUpdate("UPDATE Pasajeros SET  Fecha_De_Nacimiento= '"+this.datoNuevo.getText()+"' WHERE Identificacion = "+this.identificacion.getText());
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
              nd.cargartabla1();
       
                         }
                  
                                  
                               
                    
            
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "Error no ingreso la clave primaria de buena manera");
            Logger.getLogger(ActulizarPasajero.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField datoNuevo;
    private javax.swing.JComboBox elegidorcampo;
    private javax.swing.JTextField identificacion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

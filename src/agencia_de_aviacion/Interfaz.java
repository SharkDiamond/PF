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
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabriel
 */
public class Interfaz extends javax.swing.JFrame {

    //Variables
 Fuente f=new Fuente();
  java.util.Timer d=new java.util.Timer();
     private Statement estatuto;
    private ResultSet resultado;
 public Connection s=null;
 ActulizarPasajero pasajero=new ActulizarPasajero();
     Añadirvuelo a=new Añadirvuelo();
    ActualizarVuelo vuelo=new ActualizarVuelo();
//CONSTRUCTO
    public Interfaz(String sd) {
        
       f.conectorBD();
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
         
            
        TimerTask j;
         j = new TimerTask() {
             
             @Override
             public void run() {
               
                 //Lo que se va a ejecutar
                   tablaactual.setText("Aviones");
                 cargartabla1();
                   cargartabla2();
                     cargartabla3();
                 System.out.println("Se ejecuto");
             }
         };
         d.schedule(j, 0, 30000);
       
        
        
        
        
    }
    public Interfaz(int nada){
    
    }
    
    
    public void cargartabla1(){
    
        
        String [] titulos = { "Identificacion", "Nombre","Apellido","Fecha De Nacimiento","Numero De Vuelo"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[5];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Pasajeros");
            
            while(r.next()){
               registro[0] = r.getString("Identificacion");
               registro[1] = r.getString("Nombre");
                registro[2] = r.getString("Apellido");
               registro[3] = r.getString("Fecha_De_Nacimiento");
               registro[4] = r.getString("Id_Vuelo");
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    
    
    
    }
    
      public void cargartabla2(){
    
      String [] titulos = { "Numero De Vuelo","Fecha De Vuelo","Origen","Destino"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[4];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Vuelos_Avion");
            
            while(r.next()){
               registro[0] = r.getString("Numero_Vuelo");
               registro[1] = r.getString("Fecha_De_Vuelo");
                registro[2] = r.getString("Origen_Areopuerto");
               registro[3] = r.getString("Destino_Areopuerto");
            
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    
    
    }
    
      
        private void cargartabla3(){
    
        
        String [] titulos = { "Matricula","Nombre","Cantidad De Asientos"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[3];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Aviones");
            
            while(r.next()){
               registro[0] = r.getString("Maticula");
               registro[1] = r.getString("Nombre");
                registro[2] = r.getString("Cantidad_De_Asientos");
             
            
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    
    
    
    }
    
      
      
    
    
    public void cargabarra(){
    
    
  
    
    
    
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        principal = new javax.swing.JPanel();
        trasfondo = new javax.swing.JPanel();
        panelregistrarpasajero = new javax.swing.JPanel();
        identificacion = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bpasajero = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        numerovuelo = new javax.swing.JTextField();
        fecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaglobal = new javax.swing.JTable();
        barra = new javax.swing.JProgressBar();
        tablaactual = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principal.setBackground(new java.awt.Color(51, 51, 51));

        trasfondo.setBackground(new java.awt.Color(51, 51, 51));
        trasfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelregistrarpasajero.setBackground(new java.awt.Color(0, 102, 255));
        panelregistrarpasajero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        identificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identificacion.setBorder(null);
        panelregistrarpasajero.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 210, 20));

        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        panelregistrarpasajero.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 210, 20));

        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setBorder(null);
        panelregistrarpasajero.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Identificacion");
        panelregistrarpasajero.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, 23));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre");
        panelregistrarpasajero.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 80, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellido");
        panelregistrarpasajero.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 80, 23));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fecha De Nacimiento");
        panelregistrarpasajero.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 23));

        bpasajero.setBackground(new java.awt.Color(51, 51, 51));
        bpasajero.setForeground(new java.awt.Color(255, 255, 255));
        bpasajero.setText("Registrar");
        bpasajero.setFocusable(false);
        bpasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bpasajeroActionPerformed(evt);
            }
        });
        panelregistrarpasajero.add(bpasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, 40));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Numero De Vuelo");
        panelregistrarpasajero.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 130, 23));

        numerovuelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numerovuelo.setBorder(null);
        panelregistrarpasajero.add(numerovuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 210, 20));

        fecha.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha.setBorder(null);
        panelregistrarpasajero.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 210, 20));

        trasfondo.add(panelregistrarpasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 298, 310));

        tablaglobal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaglobal);

        barra.setBackground(new java.awt.Color(51, 51, 51));
        barra.setForeground(new java.awt.Color(0, 102, 255));
        barra.setBorder(null);
        barra.setBorderPainted(false);

        tablaactual.setForeground(new java.awt.Color(0, 102, 255));
        tablaactual.setText("Tabla");

        javax.swing.GroupLayout principalLayout = new javax.swing.GroupLayout(principal);
        principal.setLayout(principalLayout);
        principalLayout.setHorizontalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addComponent(tablaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(444, 444, 444))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, principalLayout.createSequentialGroup()
                        .addGroup(principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 883, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))))
            .addGroup(principalLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(trasfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        principalLayout.setVerticalGroup(
            principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(principalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trasfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tablaactual, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jMenuBar1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setForeground(new java.awt.Color(0, 153, 255));
        jMenu1.setText("Registrar Pasajero");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 153, 255));
        jMenu2.setText("Registrar Vuelo");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 153, 204));
        jMenu3.setText("Consultar Informacion");

        jMenuItem1.setText("Pasajeros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Vuelos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Aviones");
        jMenuItem3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem3MouseClicked(evt);
            }
        });
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem6.setText("Areopuertos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Ciudades");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(0, 153, 204));
        jMenu4.setText("Eliminar");

        jMenuItem4.setText("Pasajero");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuItem5.setText("Vuelo");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem5);

        jMenuBar1.add(jMenu4);

        jMenu5.setForeground(new java.awt.Color(0, 204, 255));
        jMenu5.setText("Actualizar");

        jMenuItem8.setText("Pasajero");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem9.setText("Vuelo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem9);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
  
   
          pasajero.setVisible(false);
        a.setVisible(false);
        vuelo.setVisible(false);
        this.trasfondo.repaint();
        
        
        
        this.panelregistrarpasajero.setVisible(true);   




    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

        pasajero.setVisible(false);
   
        this.panelregistrarpasajero.setVisible(false);   
      
        
          a.setSize(298,321);
a.setVisible(true);
        
        this.trasfondo.add(a);
        
        
      
this.trasfondo.repaint();




    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
  
      
          Thread 
     tiempo = new Thread(){
         
         @Override
         public void run(){
         
         
         int seg;
         
         for(seg=1;seg<=100;seg++){
         
         
        barra.setValue(seg);
         
        if(seg==100){
           tablaactual.setText("Pasajeros");
          
        String [] titulos = { "Identificacion", "Nombre","Apellido","Fecha De Nacimiento","Id de Vuelo"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[5];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Pasajeros");
            
            while(r.next()){
               registro[0] = r.getString("Identificacion");
               registro[1] = r.getString("Nombre");
                registro[2] = r.getString("Apellido");
               registro[3] = r.getString("Fecha_De_Nacimiento");
               registro[4] = r.getString("Id_Vuelo");
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        }
        
        
        
             try {
                 Thread.sleep(13);
                 
                 
                
             } catch (InterruptedException ex) {
                 Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
             }
       
         }
          seg=0;
                barra.setValue(seg);
         }
          
     };
    
      tiempo.start();
       
        
        
        
        
        
        
        
 
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bpasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bpasajeroActionPerformed

        
        
        
        
        try {
         String fechaa=""+this.fecha.getText();
            estatuto = f.s.createStatement();
            String dato1=this.identificacion.getText();
            String dato2=this.nombre.getText();
            String dato3=this.apellido.getText();
//             String dato4=(String) this.fecha.getValue();
            String dato5=this.numerovuelo.getText();
           
            
         //String Datos="('"+"2323244"+"','"+"sdsdsd"+"','"+"sdsdsd"+"','"+"dffd"+"','"+"12wd"+"');";
           //String Datoss="('identiifcacion, 'franco', 'angel', '03-11-99', '5');";
           
            estatuto.executeUpdate("INSERT INTO Pasajeros VALUES ('"+dato1+"','"+dato2+"','"+dato3+"','"+fechaa+"','"+dato5+"')");
            JOptionPane.showMessageDialog(this,"DATOS REGISTRADOS EXITOSAMENTE");
            this.cargartabla1();
      
        } catch (SQLException ex) {
            
             JOptionPane.showMessageDialog(this,"LOS DATOS NO SE PUDIERON REGISTRAR verique que efectivamente esta ingresando los datos de manera correcta");
            
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
       
          // TODO add your handling code here:
    }//GEN-LAST:event_bpasajeroActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

       
          Thread 
     tiempo = new Thread(){
         
         @Override
         public void run(){
         
         
         int seg;
         
         for(seg=1;seg<=100;seg++){
         
         
        barra.setValue(seg);
         
        if(seg==100){
        
          
          tablaactual.setText("Vuelos");
       
        String [] titulos = { "Numero De Vuelo","Fecha De Vuelo","Origen","Destino"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[4];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Vuelos_Avion");
            
            while(r.next()){
               registro[0] = r.getString("Numero_Vuelo");
               registro[1] = r.getString("Fecha_De_Vuelo");
                registro[2] = r.getString("Origen_Areopuerto");
               registro[3] = r.getString("Destino_Areopuerto");
            
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        }
        
        
        
             try {
                 Thread.sleep(13);
                 
                 
                
             } catch (InterruptedException ex) {
                 Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
             }
       
         }
          seg=0;
                barra.setValue(seg);
         }
          
     };
    
      tiempo.start();
        
        
        
        
        
         // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem3MouseClicked
 try {
              Statement m=s.createStatement();
              
              
              
              ResultSet C=m.executeQuery("select * from Vuelos");
              
              
              while(C.next()){
              
         
              
              
              }
              
              
          } catch (SQLException ex) {
              Logger.getLogger(Fuente.class.getName()).log(Level.SEVERE, null, ex);
          }          // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
 try {
     
             //id = Integer.parseInt(this.campoidasignatura.getText());
               String Identificacion=JOptionPane.showInputDialog("Por favor introduzca la identificacion del pasajero "+"=");

            estatuto = f.s.createStatement();
            estatuto.executeUpdate("DELETE FROM Pasajeros where Identificacion="+Identificacion);
            JOptionPane.showMessageDialog(this,"REGISTRO ELIMINADO EXITOSAMENTE");
          this.cargartabla1();
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }      // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

        
        System.out.print("fdfsdfs");
        
        
        try {
     
             //id = Integer.parseInt(this.campoidasignatura.getText());
               String Identificacion=JOptionPane.showInputDialog("Por favor introduzca el numero de vuelo"+"=");

            estatuto = f.s.createStatement();
            estatuto.executeUpdate("DELETE FROM Vuelos_Avion where Numero_Vuelo="+"'"+Identificacion+"';");
            JOptionPane.showMessageDialog(this,"REGISTRO ELIMINADO EXITOSAMENTE");
          this.cargartabla2();
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
//this.cargabarra();
        
        
          Thread 
     tiempo = new Thread(){
         
         @Override
         public void run(){
         
         
         int seg;
         
         for(seg=1;seg<=100;seg++){
         
         
        barra.setValue(seg);
         
        if(seg==100){
        
            tablaactual.setText("Aviones");
       
        
        String [] titulos = { "Matricula","Nombre","Cantidad De Asientos"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[3];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Aviones");
            
            while(r.next()){
               registro[0] = r.getString("Maticula");
               registro[1] = r.getString("Nombre");
                registro[2] = r.getString("Cantidad_De_Asientos");
             
            
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
        
        
        
             try {
                 Thread.sleep(13);
                 
                 
                
             } catch (InterruptedException ex) {
                 Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
             }
       
         }
          seg=0;
                barra.setValue(seg);
         }
          
     };
    
      tiempo.start();
        
       
            // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      
          Thread 
     tiempo = new Thread(){
         
         @Override
         public void run(){
         
         
         int seg;
         
         for(seg=1;seg<=100;seg++){
         
         
        barra.setValue(seg);
         
        if(seg==100){
        
            tablaactual.setText("Aviones");
       
        
        String [] titulos = { "IATA","Nombre","Id Ciudad"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[3];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Areopuertos");
            
            while(r.next()){
               registro[0] = r.getString("IATA");
               registro[1] = r.getString("Nombre");
                registro[2] = r.getString("Id_Ciudad");
             
            
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
        
        
        
             try {
                 Thread.sleep(13);
                 
                 
                
             } catch (InterruptedException ex) {
                 Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
             }
       
         }
          seg=0;
                barra.setValue(seg);
         }
          
     };
    
      tiempo.start();
         
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

          Thread 
     tiempo = new Thread(){
         
         @Override
         public void run(){
         
         
         int seg;
         
         for(seg=1;seg<=100;seg++){
         
         
        barra.setValue(seg);
         
        if(seg==100){
        
            tablaactual.setText("Aviones");
       
        
        String [] titulos = { "Id","Ciudad"};
        DefaultTableModel md = new DefaultTableModel(null,titulos);
        String [] registro = new String[2];
        
        try {
            Statement a1 = f.s.createStatement();
            ResultSet r = a1.executeQuery("SELECT * FROM Ciudad");
            
            while(r.next()){
               registro[0] = r.getString("Id");
               registro[1] = r.getString("Ciudad");
             
            
               md.addRow(registro);
            }
            
            tablaglobal.setModel(md);
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        }
        
        
        
             try {
                 Thread.sleep(13);
                 
                 
                
             } catch (InterruptedException ex) {
                 Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
             }
       
         }
          seg=0;
                barra.setValue(seg);
         }
          
     };
    
      tiempo.start();
                // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

   
   a.setVisible(false);
        this.panelregistrarpasajero.setVisible(false);   
       vuelo.setVisible(false);
        
          pasajero.setSize(298,321);
pasajero.setVisible(true);
        
        this.trasfondo.add(pasajero);
        
        
      
this.trasfondo.repaint();

    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
     
   a.setVisible(false);
        this.panelregistrarpasajero.setVisible(false);   
       pasajero.setVisible(false);
        
          vuelo.setSize(298,321);
vuelo.setVisible(true);
        
        this.trasfondo.add(vuelo);
        
        
      
this.trasfondo.repaint();
   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz("sds").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton bpasajero;
    private javax.swing.JTextField fecha;
    private javax.swing.JTextField identificacion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numerovuelo;
    private javax.swing.JPanel panelregistrarpasajero;
    private javax.swing.JPanel principal;
    private javax.swing.JLabel tablaactual;
    private javax.swing.JTable tablaglobal;
    private javax.swing.JPanel trasfondo;
    // End of variables declaration//GEN-END:variables
}

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
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

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
 
     Añadirvuelo a=new Añadirvuelo();
    
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
                     cargartablav();
                 System.out.println("Se ejecuto");
             }
         };
         d.schedule(j, 0, 60000);
       
        
        
        
        
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
      
      
      public void cargartablav(){
    
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
            
            this.tablavuelos.setModel(md);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaglobal = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablavuelos = new javax.swing.JTable();
        barra = new javax.swing.JProgressBar();
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
        año = new javax.swing.JSpinner();
        mes = new javax.swing.JSpinner();
        dia = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tablaactual = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 790, 230));

        tablavuelos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tablavuelos);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 30, 460, 310));

        barra.setBackground(new java.awt.Color(153, 153, 153));
        barra.setForeground(new java.awt.Color(0, 102, 255));
        barra.setBorder(null);
        barra.setBorderPainted(false);
        getContentPane().add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 650, 640, 20));

        trasfondo.setBackground(new java.awt.Color(0, 102, 255));
        trasfondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelregistrarpasajero.setBackground(new java.awt.Color(0, 102, 255));
        panelregistrarpasajero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        identificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identificacion.setBorder(null);
        panelregistrarpasajero.add(identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 210, 20));

        nombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombre.setBorder(null);
        panelregistrarpasajero.add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 210, 20));

        apellido.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        apellido.setBorder(null);
        panelregistrarpasajero.add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 210, 20));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Identificacion");
        panelregistrarpasajero.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 120, 23));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Nombre");
        panelregistrarpasajero.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 80, 20));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Apellido");
        panelregistrarpasajero.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 80, 23));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fecha De Nacimiento");
        panelregistrarpasajero.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 150, 20));

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
        panelregistrarpasajero.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 130, 23));

        numerovuelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        numerovuelo.setBorder(null);
        panelregistrarpasajero.add(numerovuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 210, 20));

        año.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1930), null, null, Integer.valueOf(1)));
        panelregistrarpasajero.add(año, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 63, 20));

        mes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        panelregistrarpasajero.add(mes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 64, -1));

        dia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));
        panelregistrarpasajero.add(dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 64, -1));

        jLabel1.setText("Año");
        panelregistrarpasajero.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel2.setText("Mes");
        panelregistrarpasajero.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, -1, -1));

        jLabel3.setText("Dia");
        panelregistrarpasajero.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/giphy.gif"))); // NOI18N
        jLabel4.setText("jLabel4");
        panelregistrarpasajero.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 310, 860, 340));

        trasfondo.add(panelregistrarpasajero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 310));

        getContentPane().add(trasfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 280, 310));

        tablaactual.setBackground(new java.awt.Color(51, 51, 51));
        tablaactual.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tablaactual.setForeground(new java.awt.Color(0, 0, 0));
        tablaactual.setText("Tabla");
        getContentPane().add(tablaactual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 110, 27));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/f.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 255), 2));
        jMenuBar1.setBorderPainted(false);

        jMenu1.setForeground(new java.awt.Color(0, 0, 0));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/forma-del-usuario.png"))); // NOI18N
        jMenu1.setText("Registrar Pasajero");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 0));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salidas-vuelos.png"))); // NOI18N
        jMenu2.setText("Registrar Vuelo");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(0, 0, 0));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informacion.png"))); // NOI18N
        jMenu3.setText("Consultar Informacion");

        jMenuItem1.setText("Pasajeros");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

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

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goma-de-borrar(2).png"))); // NOI18N
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

        jMenu5.setForeground(new java.awt.Color(0, 0, 0));
        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar-boton-de-flecha-de-pagina.png"))); // NOI18N
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

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/periodico.png"))); // NOI18N
        jMenu6.setText("Reportes");
        jMenu6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });

        jMenuItem2.setText("Pasajeros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuItem10.setText("Vuelos");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setText("Areopuertos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem11);

        jMenuBar1.add(jMenu6);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logout.png"))); // NOI18N
        jMenu7.setText("Salir");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
  
   
          
        a.setVisible(false);
        
        this.trasfondo.repaint();
        
        
        
        this.panelregistrarpasajero.setVisible(true);   




    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

     
   
        this.panelregistrarpasajero.setVisible(false);   
      
        
          a.setSize(298,450);
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
         String fechaa=""+this.año.getValue()+"-"+this.mes.getValue()+"-"+this.dia.getValue();
            estatuto = f.s.createStatement();
            String dato1=this.identificacion.getText();
            String dato2=this.nombre.getText();
            String dato3=this.apellido.getText();

            String dato5=this.numerovuelo.getText();
           
            
        
            estatuto.executeUpdate("INSERT INTO Pasajeros VALUES ('"+dato1+"','"+dato2+"','"+dato3+"','"+fechaa+"','"+dato5+"')");
            JOptionPane.showMessageDialog(this,"DATOS REGISTRADOS EXITOSAMENTE");
            this.cargartabla1();
      
        } catch (SQLException ex) {
            
             JOptionPane.showMessageDialog(this,"LOS DATOS NO SE PUDIERON REGISTRAR verique que efectivamente esta ingresando los datos de manera correcta");
            
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }      
        
       
          // TODO add your handling code here:
    }//GEN-LAST:event_bpasajeroActionPerformed

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
          this.cargartablav();
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
 try {
           
            
            String entrada;
     entrada = JOptionPane.showInputDialog(null,"Por favor introduzca la identificacion del pasajero al que le quiere editar los datos",JOptionPane.MESSAGE_PROPERTY);
                         
                      String opciones[]={"Nombre","Apellido","Numero De Vuelo","Fecha De Nacimiento"};
           
                    
 String t=(String) JOptionPane.showInputDialog(null, "Por favor seleccione el campo que quiere actualizar:", "Actualizar", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
   
            
                         if(t.equals(JOptionPane.CANCEL_OPTION)){
                         
                         }
                         
                         else{
                         if(t.equals(opciones[0])){
                                 estatuto = f.s.createStatement();
                                 
                                             
 String nuevo=JOptionPane.showInputDialog(null, "Por favor introduzca el nuevo dato", JOptionPane.MESSAGE_PROPERTY);
 
                         
                                 
              estatuto.executeUpdate("UPDATE Pasajeros SET  Nombre = '"+nuevo+"' WHERE Identificacion = '"+entrada+"'");
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
            this.cargartabla1();
                         }
                  
                         
                              if(t.equals(opciones[1])){
                                 estatuto = f.s.createStatement();
                                                             
 String nuevo=JOptionPane.showInputDialog(null, "Por favor introduzca el nuevo dato", JOptionPane.MESSAGE_PROPERTY);
 
                         
               estatuto.executeUpdate("UPDATE Pasajeros SET  Apellido = '"+nuevo+"' WHERE Identificacion = '"+entrada+"'");
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
              this.cargartabla1();
                         
                         }
                         
                         
                                if(t.equals(opciones[2])){
                                 estatuto = f.s.createStatement();
                                                             
 String nuevo=JOptionPane.showInputDialog(null, "Por favor introduzca el nuevo dato", JOptionPane.MESSAGE_PROPERTY);
 
                         
               estatuto.executeUpdate("UPDATE Pasajeros SET  Id_Vuelo = '"+nuevo+"' WHERE Identificacion = '"+entrada+"'");
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
            this.cargartabla1();
                         
                         }
                         
                                       if(t.equals(opciones[3])){
                                 estatuto = f.s.createStatement();
                                                             
 String nuevo=JOptionPane.showInputDialog(null, "Por favor introduzca el nuevo dato", JOptionPane.MESSAGE_PROPERTY);
 
                         
                estatuto.executeUpdate("UPDATE Pasajeros SET  Fecha_De_Nacimiento = '"+nuevo+"' WHERE Identificacion = '"+entrada+"'");
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
            this.cargartabla1();
                         
                         }
                          
                                 
                                 
                         
                         }
             
            
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }     
   
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
try {
           String entrada;
     entrada = JOptionPane.showInputDialog(null,"Por favor introduzca el numero de vuelo al cual se le quiere editar los datos",JOptionPane.MESSAGE_PROPERTY);
                         
            
             //falta mejorarlo pero ya se  tiene una estructura
                
                         
                      String opciones[]={"Fecha y Hora","Origen","Destino"};
           
 String t=(String) JOptionPane.showInputDialog(null, "Por favor seleccione el campo que quiere actualizar:", "Actualizar", JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);
   

                           
                         
                         if(t.equals(JOptionPane.CANCEL_OPTION)){
                         
                         }
                         
                         else{
                             
                             //FECHA Y HORA
                         if(t.equals(opciones[0])){
                                 estatuto = f.s.createStatement();
                                                               
 String nuevo=JOptionPane.showInputDialog(null, "Por favor introduzca el nuevo dato", JOptionPane.MESSAGE_PROPERTY);
 
              estatuto.executeUpdate("UPDATE Vuelos_Avion SET  Fecha_De_Vuelo = '"+nuevo+"' WHERE Numero_Vuelo = '"+entrada+"'");
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
            this.cargartabla2();
                         }
                  
                         //ORIGEN
                              if(t.equals(opciones[1])){
                                 estatuto = f.s.createStatement();
                                                               
 String nuevo=JOptionPane.showInputDialog(null, "Por favor introduzca el nuevo dato", JOptionPane.MESSAGE_PROPERTY);
 
             estatuto.executeUpdate("UPDATE Vuelos_Avion SET  Origen_Areopuerto = '"+nuevo+"' WHERE Numero_Vuelo = '"+entrada+"'");
            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
           
                           this.cargartabla2(); 
                         }
                         
                         //DESTINO
                                if(t.equals(opciones[2])){
                                 estatuto = f.s.createStatement();
                                                               
 String nuevo=JOptionPane.showInputDialog(null, "Por favor introduzca el nuevo dato", JOptionPane.MESSAGE_PROPERTY);
 
                      estatuto.executeUpdate("UPDATE Vuelos_Avion SET  Destino_Areopuerto = '"+nuevo+"' WHERE Numero_Vuelo = '"+entrada+"'");

            JOptionPane.showMessageDialog(this,"REGISTRO ACTUALIZADO EXITOSAMENTE");
            this.cargartabla2();
                         
                         }
                         
                              
                                 
                                 
                         
                         }
             
            
        } catch (SQLException ex) {
            Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }         

   // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
System.exit(WIDTH);       // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
Connection a=f.getS();

String path="/home/gabriel/NetBeansProjects/Agencia_De_Aviacion/src/Reporte/Pasajeros.jasper";

JasperReport reporte;


     try {
         reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
         
         
         JasperPrint jprint=JasperFillManager.fillReport(path,null,a);
         JasperViewer viewer =new JasperViewer(jprint,false);
         
         viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         
         viewer.setVisible(true);
     } catch (JRException ex) {
         Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
     }




    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
Connection a=f.getS();

String path="/home/gabriel/NetBeansProjects/Agencia_De_Aviacion/src/Reporte/Vuelos.jasper";

JasperReport reporte;


     try {
         reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
         
         
         JasperPrint jprint=JasperFillManager.fillReport(path,null,a);
         JasperViewer viewer =new JasperViewer(jprint,false);
         
         viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         
         viewer.setVisible(true);
     } catch (JRException ex) {
         Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
     }


      
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
Connection a=f.getS();

String path="/home/gabriel/NetBeansProjects/Agencia_De_Aviacion/src/Reporte/Areopuertos.jasper";

JasperReport reporte;


     try {
         reporte=(JasperReport) JRLoader.loadObjectFromFile(path);
         
         
         JasperPrint jprint=JasperFillManager.fillReport(path,null,a);
         JasperViewer viewer =new JasperViewer(jprint,false);
         
         viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
         
         viewer.setVisible(true);
     } catch (JRException ex) {
         Logger.getLogger(Interfaz.class.getName()).log(Level.SEVERE, null, ex);
     }
     
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
    private javax.swing.JSpinner año;
    private javax.swing.JProgressBar barra;
    private javax.swing.JButton bpasajero;
    private javax.swing.JSpinner dia;
    private javax.swing.JTextField identificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner mes;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numerovuelo;
    private javax.swing.JPanel panelregistrarpasajero;
    private javax.swing.JLabel tablaactual;
    protected javax.swing.JTable tablaglobal;
    private javax.swing.JTable tablavuelos;
    private javax.swing.JPanel trasfondo;
    // End of variables declaration//GEN-END:variables
}

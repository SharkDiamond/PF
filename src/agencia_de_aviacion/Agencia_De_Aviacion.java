/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencia_de_aviacion;

/**
 *
 * @author gabriel
 */
public class Agencia_De_Aviacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        carga a=new carga();
        
        
        a.setVisible(true);
       
        a.setLocationRelativeTo(null);
            
         for(int i=0;i<100; i++){
         
         a.bcarga.setValue(i);
         
         try{
         
         Thread.sleep(100);
         
         } catch(Exception e){
         
         
         
         }
    
         
         
             
         }
     
        
            a.dispose();
         Interfaz m =new Interfaz("Mostrar");
       
      
         
         
      
    }
    
}

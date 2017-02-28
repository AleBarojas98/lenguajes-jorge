/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread1;

/**
 *
 * 
 * @author T-102
 */
public class AplicacionThread1 {
    public static void main(String[] args) {
        //Creado
        TareaMensa t1=new TareaMensa();
        
        //iniciado
        //t1.start();
        
        //ejecucion
        try{
            Thread.sleep(5000);
            t1.start();
        }catch(InterruptedException e){
            
        }
   
    }
    
}

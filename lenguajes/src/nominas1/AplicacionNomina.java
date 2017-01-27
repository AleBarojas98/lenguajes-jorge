/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

/**
 *
 * @author T-102
 */
public class AplicacionNomina {
    
    public static void main(String[] args) {
       int x=2;
       Trabajador worker=new Trabajador();
       worker.setNombre("Pedro");
       worker.setPaterno("Lopez");
       worker.setNumeroSocial(80);
       
     
        System.out.println("El nombre es " + worker.getNombre());
        System.out.println("El apellido es " + worker.getPaterno());
        System.out.println("El numero social es " + worker.getNumeroSocial());
               
     
        
    }
}

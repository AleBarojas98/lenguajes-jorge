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
       worker.nombre="Pedro";
       worker.paterno="Lopez";
       worker.numeroSocial=80;
       
     
        System.out.println("El nombre es " + worker.nombre);
        System.out.println("El apellido es " + worker.paterno);
        System.out.println("El numero social es " + worker.numeroSocial);
               
     
        
    }
}

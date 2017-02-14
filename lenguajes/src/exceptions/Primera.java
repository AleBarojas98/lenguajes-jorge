/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author T-102
 */
public class Primera {
    public static void main(String[] args) {
        //vamos aver primero la famila de excpeciones que el compiladr se hace cargo de ellas 
         int x=0;
         float y=2;
         //este renglon lanza una excepcion que se llama arithmeticexception
         
         //System.out.println(y/x);
         
         int[] arreglo={1,2,3};
         ///System.out.println(arreglo[2]);
         
         try{
         float a=2;
         float b=Float.parseFloat("veinte");
         System.out.println(a*b);
         }catch(NumberFormatException e){
             System.out.println("estupido escribe con numero tu edad");
         }
    }
}

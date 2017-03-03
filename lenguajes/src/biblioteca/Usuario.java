/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author T-102
 */
public class Usuario {
    
    private String nombre;
    private int libros[]= new int[5];
 
    public static void main(String[] args) {
        Usuario u1= new Usuario("Jorge");
        System.out.println("Tu nombre es" + u1.getNombre());
        
        
    }
            

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int[] getLibros() {
        return libros;
    }

    public void setLibros(int[] libros) {
        this.libros = libros;
    }
}
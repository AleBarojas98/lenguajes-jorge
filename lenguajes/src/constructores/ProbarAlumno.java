
package constructores;
import javax.swing.*;

public class ProbarAlumno {
    
    public static void main(String[] args) {
        Alumno a=new Alumno();
        
        Alumno a2=new Alumno("Jorge");
        
        System.err.println("Tu nombre es " + a2.getNombre());
        
        JFrame ventana=new JFrame("Hola");
        ventana.setSize(200,120);
        ventana.setVisible(true);
    }
}

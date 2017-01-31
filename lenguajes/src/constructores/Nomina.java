/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author T-102
 */
public class Nomina {

    private String tipo;
    private float saldo;
    private int horaslaboradas;
    
    public Nomina(){
        
    }
    public Nomina(String tipo){
        this.tipo=tipo;
    }
    public Nomina(float saldo){
        this.saldo=saldo;
    }
    public Nomina(int horaslaboradas){
        this.horaslaboradas=horaslaboradas;
    }
    public Nomina(String tipo, float saldo, int horaslaboradas){
        this.horaslaboradas=horaslaboradas;
        this.saldo=saldo;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getHoraslaboradas() {
        return horaslaboradas;
    }

    public void setHoraslaboradas(int horaslaboradas) {
        this.horaslaboradas = horaslaboradas;
    }
    

  
    
}


package domain;


public class Coche {
    private String marca ,modelo ;   
    private double velocidad ;  

    public Coche() {
    }

    public Coche(String marca, String modelo, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    public String acelerar (){
        return "Acelerando coche..."; 
    }
    
    public String frenar (){
        return "Frenando Coche...";
    }
    
    
    
    
}

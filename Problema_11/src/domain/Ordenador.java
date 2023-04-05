
package domain;


public class Ordenador {
    private String marca, modelo ; 
    private double precio ;  

    public Ordenador() {
    }

    public Ordenador(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public String obtenerMarca(){
        return this.marca;
    }
     public String obtenerModelo(){
        return this.modelo;
    }
     public double obtenerPrecio(){
        return this.precio;
    }
    
}

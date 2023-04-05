
package domain;


public class Articulo {
    private String nombre ,descripcion ;
    private double precio ; 

    public Articulo() {
    }

    public Articulo(String nombre, String descripcion, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    public String obtenerDescripcion(){
        return this.descripcion;
    }
    
    public double obtenerPrecio(){
        return this.precio;
    }
    
}

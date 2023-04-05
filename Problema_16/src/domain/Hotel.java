
package domain;

public class Hotel {
    private String nombre ,direccion  ;
    private int numHabitaciones ;  

    public Hotel() {
    }

    public Hotel(String nombre, String direccion, int numHabitaciones) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numHabitaciones = numHabitaciones;
    }
    
    
    public String obtenerNombre(){
        return this.nombre;
    }
    
    public String obtenerDireccion(){
        return this.direccion;
    }
    
    public int obtenerNumHabitaciones(){
        return this.numHabitaciones;
    }
    
    
    
}

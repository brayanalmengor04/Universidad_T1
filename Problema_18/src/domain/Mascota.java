
package domain;


public class Mascota {
    private String nombre , raza ; 
    private int edad ; 

    public Mascota() {
    }

    public Mascota(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public String obtenerRaza() {
        return this.raza;
    }

    public int obtenerEdad() {
        return this.edad;
    }
    
    
}

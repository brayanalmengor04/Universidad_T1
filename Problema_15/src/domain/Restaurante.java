
package domain;


public class Restaurante {
    private String nombre , direccion ,tipoComida; 

    public Restaurante() {
    }

    public Restaurante(String nombre, String direccion, String tipoComida) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tipoComida = tipoComida;
    }
    
    public String obtenerNombre(){
        return this.nombre;
    }
    public String obtenerDireccion(){
        return this.direccion; 
    }
    public String obtenerTipoComida(){
        return this.tipoComida;
    }
}

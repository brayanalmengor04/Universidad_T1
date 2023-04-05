
package domain;


public class PaqueteTuristico {
    private String destino , fechaSalida ;
    private double precio ; 

    public PaqueteTuristico() {
    }

    public PaqueteTuristico(String destino, String fechaSalida, double precio) {
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }
    
    public String obtenerDestino(){
        return this.destino;
    }
    public String obtenerFechaSalida(){
        return this.fechaSalida;
    }
    
    public double obtenerPrecio(){
        return this.precio;
    }
    
}

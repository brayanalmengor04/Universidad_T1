
package domain;

public class Telefono {
    private String marca , modelo ; 
    private double tamañoPantalla;  

    public Telefono() {
    }

    public Telefono(String marca, String modelo, double tamañoPantalla) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamañoPantalla = tamañoPantalla;
    }
    
    public String llamar(){
        String llamar="LLamando con el telefono";
        return llamar ; 
    }
    
    public String enviarMensaje (){
        String mensaje ="Enviando Mensaje"; 
        return mensaje ; 
    }
}

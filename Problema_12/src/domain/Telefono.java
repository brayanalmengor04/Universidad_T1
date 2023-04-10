
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
    
    public void llamar(){
        System.out.println("Llamando al numero");
    }
    
    public void enviarMensaje (){
        System.out.println("Enviando el mensaje");
    }
}

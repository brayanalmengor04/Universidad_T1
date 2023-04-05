
package domain;


public class Animal {
    private String especie , color;  
    private int edad ;

    public Animal() {
    }

    public Animal(String especie, String color, int edad) {
        this.especie = especie;
        this.color = color;
        this.edad = edad;
    }
    
    public String obtenerEspecie(){
        return this.especie;
    } 
    public void establecerEspecie(String especie){
        this.especie= especie; 
    }
    
    public String obtenerColor(){
        return this.color;
    }
    public void obtenerColor(String color){
        this.color= color; 
    }
    
    public int obtenerEdad (){
        return this.edad;
    }
    
    public void establecerEdad(int edad){
        this.edad= edad; 
    }
    
}

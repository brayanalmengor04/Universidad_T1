
package test;
import domain.*; 
import java.util.Scanner; 

/*
    4.	Crear una clase "Rectángulo" que tenga como atributos ancho y alto,
    y métodos para calcular el área y el perímetro del rectángulo.
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Rectangulo rectangulo ;  
        double altura,ancho;
        
        System.out.println("Proporcione la Altura del Rectangulo :");
        altura =Double.parseDouble(input.nextLine()); 
        
        System.out.println("Proporcione el Ancho del Rectangulo :");
        ancho =Double.parseDouble(input.nextLine()); 
        
        rectangulo= new Rectangulo (ancho, altura); 
        
        System.out.println("El Perimetro del Rectangulo es : "+rectangulo.perimetro()+" cm");
        System.out.println("El Area del Rectangulo es : "+rectangulo.area()+" cm^2");
    }
}


package test;
import domain.*;
import java.util.Scanner; 

/*
    3.	Crear una clase "Círculo" que tenga como atributos radio y color, 
    y métodos para calcular el área y el perímetro del círculo.
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        String color=null;  
        double radio=0 ;
        
        Circulo circulo ;  
        
        System.out.println("{Circulo} Proporcione el Color  : ");
        color = input.nextLine(); 
        
        System.out.println("{Circulo} Proporcione el Radio : ");
        radio =Double.parseDouble(input.nextLine());
        
        circulo = new Circulo(radio, color); 
        System.out.println("El Color del circulo es =>"+"{"+circulo.getColor()+"}");
        System.out.println("El Perimetro del Circulo es : "+circulo.perimetro()+" cm");
        System.out.println("El Area del Circulo es : "+circulo.area() +" cm^2");
        
        
    }
}

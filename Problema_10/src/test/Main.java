
package test;

import domain.Animal;
import java.util.Scanner; 

/*
    10.	Crear una clase "Animal" que tenga como atributos especie, 
    edad y color, y métodos para establecer y obtener estos atributos. 
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        String especie , color;  
        int edad ; 
        System.out.println("Proporcione la especie : ");
        especie= sc.nextLine();
        System.out.println("Proporcione el color : ");
        color= sc.nextLine();
        System.out.println("Proporcione la edad : ");
        edad=Integer.parseInt(sc.nextLine()); 
        
        
        Animal animal = new Animal(especie, color, edad); 
        
        System.out.println("Especie ="+animal.obtenerEspecie());
        System.out.println("Color = "+animal.obtenerColor());
        System.out.println("Edad ="+animal.obtenerEdad());
        
        
    }
}

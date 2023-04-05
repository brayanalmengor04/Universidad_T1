
package test;

import domain.Mascota;
import java.util.Scanner;

/*
    18.	Crear una clase "Mascota" que tenga como atributos nombre, raza y edad,
    y métodos para establecer y obtener estos atributos.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        String nombre , raza ; 
        int edad ; 
        
        System.out.println("Proporcione el nombre de la Mascota : ");
        nombre = sc.nextLine();
        
        System.out.println("Proporcione raza de la Mascota : ");
        raza = sc.nextLine();
        
        System.out.println("Proporcione edad de la Mascota : ");
        edad =Integer.parseInt(sc.nextLine());
        
        
        Mascota mascota = new Mascota(nombre, raza, edad); 
        
        System.out.println("Nombre Mascota :"+mascota.obtenerNombre()); 
        System.out.println("Raza Mascota :"+mascota.obtenerRaza());
        System.out.println("Edad Mascota :"+mascota.obtenerEdad());
    }
}


package test;

import domain.Hotel;
import java.util.Scanner; 

/*
    16.	Crear una clase "Hotel" que tenga como atributos nombre, dirección y 
    número de habitaciones, y métodos para obtener la información del hotel.
*/
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String nombre , direccion ; 
        int numHabitaciones; 
        
        System.out.println("Proporcione el nombre Hotel ");
        nombre = sc.nextLine();
        
        System.out.println("Proporcione la direccion Hotel ");
        direccion = sc.nextLine();
        
        System.out.println("Proporcione el nombre Hotel ");
        numHabitaciones =Integer.parseInt(sc.nextLine());
        
        
        Hotel hotel = new Hotel(nombre, direccion, numHabitaciones); 
        
        System.out.println("Nombre Hotel :"+hotel.obtenerNombre());
        System.out.println("Direccion Hotel :"+hotel.obtenerDireccion());
        System.out.println("Numero Habitaciones del Hotel :"+hotel.obtenerNumHabitaciones());
    }
}

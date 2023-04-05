
package test;

import domain.PaqueteTuristico;
import java.util.Scanner;
/*
    17.	Crear una clase "Paquete Turístico" que tenga como atributos destino, fecha de salida y precio,
    y métodos para obtener la información del paquete turístico.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String destino , fechaSalida ;  
        double precio ; 
        
        System.out.println("Proporcione el destino Paquete Turistico :");
        destino= sc.nextLine();
        
        System.out.println("Proporcione Fecha Salida Paquete Turistico :");
        fechaSalida= sc.nextLine();
        System.out.println("Proporcione precio  Paquete Turistico :");
        precio=Double.parseDouble(sc.nextLine());
        
        PaqueteTuristico paquete = new PaqueteTuristico(destino, fechaSalida, precio); 
        
        System.out.println("Destino Paquete Turistico :"+paquete.obtenerDestino());
        System.out.println("Fecha Paquete Turistico :"+paquete.obtenerFechaSalida());
        System.out.println("Precio Paquete Turistico :"+paquete.obtenerPrecio() +"$");
    }
}

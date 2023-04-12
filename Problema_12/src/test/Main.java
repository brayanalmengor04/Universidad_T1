
package test;

import domain.Telefono;
import java.util.Scanner;
/*
    12.	Crear una clase "Teléfono" que tenga como atributos marca,
    modelo y tamaño de pantalla, y métodos para llamar y enviar mensajes
*/

public class Main {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        String marca , modelo ,mensaje ="" ;
        double tamañoPantalla;  
        int telefonoNum ; 
        int option ; 
        
        System.out.println("Proporcione la Marca Telefono:"); 
        marca = sc.nextLine(); 
        
         System.out.println("Proporcione la Modelo Telefono:"); 
        modelo = sc.nextLine();
        
        System.out.println("Proporcione el tamaño Telefono:"); 
        tamañoPantalla =Double.parseDouble(sc.nextLine());
        
        Telefono telefono = new Telefono(marca, modelo, tamañoPantalla); 
        
        // Simulaccion metodos 
        System.out.println(telefono.llamar());
        System.out.println(telefono.enviarMensaje());
        
    }
}

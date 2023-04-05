
package test;

import domain.Restaurante;
import java.util.Scanner; 

/*
    15.	Crear una clase "Restaurante" que tenga como atributos nombre, dirección y tipo de comida,
    y métodos para obtener la información del restaurante.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String nombre , direccion  , tipoComida ;  
        
        System.out.println("Proporcione el nombre restarurante :");
        nombre = sc.nextLine();
        
         System.out.println("Proporcione direccion restarurante :");
        direccion = sc.nextLine();
        
         System.out.println("Proporcione tipo comida restarurante :");
        tipoComida = sc.nextLine();
        
        
        Restaurante restaurante = new Restaurante(nombre, direccion, tipoComida); 
        
        System.out.println("Nombre Restaurante :"+restaurante.obtenerNombre());
        System.out.println("Direccion Restaurante :"+restaurante.obtenerDireccion());
        System.out.println("Tipo de comida Restaurante :"+restaurante.obtenerTipoComida());
    }
}

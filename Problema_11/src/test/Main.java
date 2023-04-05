
package test;

import domain.Ordenador;
import java.util.Scanner;

/*
    11.	Crear una clase "Ordenador" que tenga como atributos 
    marca, modelo y precio, y métodos para obtener la información del ordenador.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String marca , modelo ; 
        double precio ;  
        
        System.out.println("Proporcione la Marca Ordenador:"); 
        marca = sc.nextLine(); 
        
         System.out.println("Proporcione la Modelo Ordenador:"); 
        modelo = sc.nextLine();
        
        System.out.println("Proporcione el precio Ordenador:"); 
        precio =Double.parseDouble(sc.nextLine());
        
        Ordenador ordenador = new Ordenador(marca, modelo, precio);
        
        
        System.out.println("Marca Ordenador :"+ordenador.obtenerMarca());
        System.out.println("Modelo Ordenador :"+ordenador.obtenerModelo());
        System.out.println("Precio Ordenador :"+ordenador.obtenerPrecio());
        
    }
}


package test;

import domain.Articulo;
import java.util.Scanner; 

/*
    13.	Crear una clase "Artículo" que tenga como atributos nombre, descripción 
    y precio, y métodos para obtener la información del artículo.
*/

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 
        String nombre , descripcion ; 
        double precioArticulo ;   
        
        
        System.out.println("Proporcione el nombre Articulo : ");
        nombre = sc.nextLine();
         System.out.println("Proporcione la descripcion del Articulo : ");
        descripcion = sc.nextLine();
         System.out.println("Proporcione el precio del Articulo : ");
        precioArticulo =Double.parseDouble(sc.nextLine());
        
        
        Articulo articulo = new Articulo(nombre, descripcion, precioArticulo);
        
        System.out.println("Nombre del Articulo : "+articulo.obtenerNombre());
        System.out.println("Descripcion del Articulo : "+articulo.obtenerDescripcion());
        System.out.println("Precio del Articulo : "+articulo.obtenerPrecio());
    }
}

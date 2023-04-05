
package test;

import domain.DescuentoArticulo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        String descripcion; 
        double precio;
        
        System.out.println("Proporcione la Descripcion del Articulo : ");
        descripcion= sc.nextLine();
        
        System.out.println("Proporcione el precio del Articulo : ");
        precio=Double.parseDouble(sc.nextLine());
        
        
        DescuentoArticulo articulo = new DescuentoArticulo(descripcion, precio); 
        
        System.out.println("Descripcion del Articulo : "+articulo.getDescripcion());
        System.out.println("Precio del Articulo : "+"$:"+articulo.getPrecio()); 
        System.out.println("Descuento Aplicado :"+"$:"+articulo.descuentoAplicado());
    }
}

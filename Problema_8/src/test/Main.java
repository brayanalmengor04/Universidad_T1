
package test;

import domain.Libro;
import java.util.Scanner; 

/*
    8.	Crear una clase "Libro" que tenga como atributos título
, autor y número de páginas, y métodos para obtener la información del libro.
*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo , autor ; 
        int numeroPag;  
        
        System.out.println("Proporcione el Titulo Libro : "); 
        titulo= sc.nextLine();
        System.out.println("Proporcione el Autor Libro : "); 
        autor= sc.nextLine();
        System.out.println("Proporcione el Numero de pag del Libro : "); 
        numeroPag=Integer.parseInt(sc.nextLine());
        
        Libro libro = new Libro(titulo, autor, numeroPag);
        
        String informacionLibro ="\nTitulo :"+libro.titulo() +"\nAutor :"
        +libro.autor()
        +"\nPaginas Libro: "+libro.numeroPaginas();  
        
        System.out.println("\t<---Informacion Libro -->"+informacionLibro);
        
    }
}

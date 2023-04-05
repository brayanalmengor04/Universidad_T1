
package test;

import domain.Pelicula;
import java.util.Scanner;


/*
    14.	Crear una clase "Película" que tenga como atributos 
    título, director y duración, y métodos para obtener la información de la película.
*/
public class Main {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 
        String titulo , director ; 
        double duracion ;   
        
        
        System.out.println("Proporcione el titulo de la pelicula : ");
        titulo = sc.nextLine();
         System.out.println("Proporcione el director de la pelicula : ");
        director = sc.nextLine();
         System.out.println("Proporcione la duracion de la pelicula : ");
        duracion =Double.parseDouble(sc.nextLine());
        
        Pelicula pelicula = new Pelicula(titulo, director, duracion);
        
        System.out.println("Titulo de la pelicula : "+pelicula.obtenerTitulo());
        System.out.println("Director de la pelicula : "+pelicula.obtenerDirector());
        System.out.println("Duraccion de la pelicula : "+pelicula.obtenerDuracion());
    }
    
}

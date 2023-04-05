
package domain;


public class Pelicula {
    private String titulo ,director ;
    private double duracion ; 

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    public String obtenerTitulo(){
        return this.titulo;
    }
    
    public String obtenerDirector(){
        return this.director;
    }
    
    public double obtenerDuracion(){
        return this.duracion;
    }
}

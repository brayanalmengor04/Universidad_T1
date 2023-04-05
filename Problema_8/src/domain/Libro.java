
package domain;

public class Libro {
    private String titulo ; 
    private String autor ; 
    private int numeroPaginas ;  

    public Libro() {
    }

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

   
    public String titulo (){
        return this.titulo;
    }
    
    public String autor (){
        return this.autor;
    }
    
    public int numeroPaginas (){
        return this.numeroPaginas;
    }
    
  
    
}

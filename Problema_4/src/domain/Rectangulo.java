
package domain;

public class Rectangulo {
    private double ancho;  
    private double alto ; 
    
    
    public Rectangulo (){}
    
    public Rectangulo (double ancho , double alto){
        this.ancho = ancho ; 
        this.alto = alto ; 
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }  
    
    public double perimetro (){ 
        double perimetro ; 
        return perimetro =(this.ancho*2)+(this.alto*2) ;  
    }
    
    public double area (){ 
        // cm2 
        double area ; 
        return area = this.alto*this.ancho;  
    }
    
    
    
}

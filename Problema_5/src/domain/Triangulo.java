
package domain;

public class Triangulo {
    private double altura ;
    private double ancho ; 
    private double lados; 
    
    public Triangulo (){}

    public Triangulo(double altura, double ancho ) {
        this.altura = altura;
        this.ancho = ancho;
    } 


    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }   
    
    public void setLados(double lados){
        this.lados = lados ; 
    }
    
    public double getLados (){
        return this.lados;
    }
    
    
    public double perimetro (){
        double perimetro ; 
        return perimetro = this.ancho+(this.lados*2);
    }
    
    public double area (){
        double area ; 
        return area =(this.ancho*this.altura)/2;
    }

    
    
    
}

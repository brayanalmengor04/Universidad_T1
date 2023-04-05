
package domain;

public class Circulo {
    private double radio ;  
    private String color ;   
    
    
    public Circulo (){}
    
    public Circulo (double radio ,String color){
        this.radio = radio; 
        this.color= color ;  
    }

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color; 
    }
    
    public double perimetro (){
        double perimetro=0; 
        // toma prioridad a los parentesis
        return  perimetro = (2*Math.PI)*this.radio;
    }
    
    public double area (){
        double area=0; 
        return area = (Math.PI*(Math.pow(this.radio, 2)));
    }
    
}

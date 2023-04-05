
package test;
import domain.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        
        /*
        Nota:
        Esta es la formula para un triangulo equilatero : 
        el problema no especifico que tipo de triangulo se debia 
        realizar .
        */
        
        Scanner input = new Scanner(System.in);  
        Triangulo triangulo ; 
        double altura , base ,lados; 
        
        System.out.println("Proporcione la Altura del Triangulo : ");
        altura =Double.parseDouble(input.nextLine());
        
        System.out.println("Proporcione el Ancho del Triangulo : ");
        base = Double.parseDouble(input.nextLine()); 
        
        triangulo= new Triangulo(altura, base);
        
        System.out.println("Proporcione la medidas de Lados del Triangulo : ");
        lados =Double.parseDouble( input.nextLine());        
        triangulo.setLados(lados);
        
        System.out.println("El Perimetro del triangulo es : "+triangulo.perimetro()+" cm");
        System.out.println("El Area del Triangulo es : "+triangulo.area()+" cm^2");
        
        
        
        
    }
}

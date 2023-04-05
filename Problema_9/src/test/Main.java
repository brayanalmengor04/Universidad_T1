
package test;

import domain.Coche;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); 
        String marca , modelo ; 
        int option ; 
        double velocidad ;  
        
        System.out.println("Proporcione la marca :");
        marca = sc.nextLine();
        
        System.out.println("Proporcione el modelo :");
        modelo = sc.nextLine();
        System.out.println("Proporcione la Velocidad :");
        velocidad =Double.parseDouble( sc.nextLine());
        
        Coche coche = new Coche(marca, modelo, velocidad);
        
        do{
            System.out.println("/Coche "
            +"\n1. Acelerar Coche "
            +"\n2. Frenar Coche"
            +"\n3. Salir "        
            +"\nAccion Realizar :");
            option= Integer.parseInt(sc.nextLine()); 
            
            switch (option) {
                case 1:
                    System.out.println(coche.acelerar());
                    break;
                case 2:
                    System.out.println(coche.frenar());
                    break; 
                case 3: 
                    break;
                default:
                    System.out.println("Error opcion Incorrecta");
            }
            
        }while (option!=3);
        
        
        
        
    }
}

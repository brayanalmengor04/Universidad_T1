package test;

import domain.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in); 
        String nombre , dni ; 
        int edad ;  
        
        System.out.println("Proporcione el nombre :");
        nombre = input.nextLine(); 

        System.out.println("Proporcione el DNI :");
        dni = input.nextLine();
        System.out.println("Proporcione la Edad : ");
        edad =Integer.parseInt(input.nextLine()); 
        // Objeto
        Persona persona = new Persona (nombre,dni,edad); 
        
        System.out.println(persona.mostrar());
        System.out.println("Es mayor de edad :"+persona.esMayorEdad()); 
        
        
    }
}

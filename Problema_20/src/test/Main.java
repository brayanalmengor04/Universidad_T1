
package test;

import domain.Trabajador;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        String nombre ;
        double sueldo; 
        int horasTrabajadas;
        
        System.out.println("Proporcione Nombre del Trabajador : ");
        nombre = input.nextLine(); 
        
        System.out.println("Proporcione el sueldo del Trabajador : ");
        sueldo = Double.parseDouble(input.nextLine());
        
        Trabajador trabajador = new Trabajador(nombre, sueldo);
       
        System.out.println("Proporcione las horas Trabajadas:");
        horasTrabajadas= Integer.parseInt(input.nextLine());
        
        trabajador.setHorasTrabajadas(horasTrabajadas);
        
        System.out.println("Nombre del trabajador : "+trabajador.getNombreTrabajador());
        System.out.println("Sueldo del trabajador : "+trabajador.getSueldo());  
        System.out.println("Horas trabajadas : "+trabajador.getHorasTrabajadas());
        System.out.println("Pago semanal : "+trabajador.sueldoSemanal(horasTrabajadas));
        
    }
}

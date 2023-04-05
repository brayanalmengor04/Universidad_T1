
package test;
import domain.*;
import java.util.Scanner;
/*
    2.	Realice una clase en java que, con base en un número proporcionado (1-7),
    devuelva el día de la semana que le corresponde (Lunes a Domingo).
*/

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        DiaSemana diasemana ;   
        
        int dia = 0 ;
        
        do{
           System.out.println("Proporcione el dia de la semana :"); 
           dia =Integer.parseInt(input.nextLine());
            
        }while((dia<=0) || (dia>7));
        
        diasemana = new DiaSemana(dia);
        System.out.println("El dia "+diasemana.getDia()+" de la semana es : "+diasemana.diaSemana());
        
    }
}

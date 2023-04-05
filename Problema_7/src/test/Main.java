package test;

import domain.Fecha;
import java.util.Scanner; 


/*
    7.	Crear una clase "Fecha" que tenga como atributos día, mes y año, 
    y métodos para establecer y obtener la fecha en diferentes formatos.
    Debe imprimir la fecha en formato corto (MM/DD/AA)
 ,formato largo (DD de “MES EN PALABRAS” del AÑO), y en formato mediano (MM-DD-AAAA)

*/
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año;

        do { 
            System.out.println("\tProporcione una fecha Correcta ");
            
            System.out.println("Proporcione el dia : ");
            dia = Integer.parseInt(sc.nextLine());

            System.out.println("Proporcione el Mes : ");
            mes = Integer.parseInt(sc.nextLine());

            System.out.println("Proporcione el año : ");
            año = Integer.parseInt(sc.nextLine());  
            

        } while ((dia < 0)|| (dia>31) || (mes<0)||(mes>12) || (año<999) ||(año>9999));
            
        Fecha fecha = new Fecha(dia, mes, año);
        System.out.println("{Fecha Formato corto} =>" + fecha.formatoCorto());
        System.out.println("{Fecha Formato Mediano} =>" + fecha.formatoMediano());
        System.out.println("{Fecha Formato Largo} =>" + fecha.formatoLargo());

    }
}

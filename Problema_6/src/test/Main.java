
package test;
import domain.*;
import java.util.Scanner; 

/*
   6.	Crear una clase "Cuenta Bancaria" que tenga como atributos número de cuenta,
    saldo y nombre del titular, y métodos para depositar y retirar dinero de la cuenta. 
    Se debe tambien tener un método que permita consultar el saldo. 
*/

public class Main { 
    
    public static void main(String[] args) {
        // Intanciacion class scanner
        Scanner sc = new Scanner(System.in);
        //Declaracion variables
        double saldoInicial , montoIngresar , montoRetirar;  
        int option , numeroCuenta; 
        String nombreTitular ;  
        
        // inicializacion class cuenta
        CuentaBancaria cuenta ;
        
        System.out.println("Proporcione un nombre Titular Cuenta : ");
        nombreTitular = sc.nextLine();
       
        System.out.println("Proporcione un Monto Inicial :"); 
        saldoInicial =Double.parseDouble(sc.nextLine());
        
        System.out.println("Proporcione un Numero Cuenta :"); 
        numeroCuenta =Integer.parseInt(sc.nextLine());
        
        //Instanciacion class cuenta
       cuenta = new CuentaBancaria(numeroCuenta, saldoInicial, nombreTitular);
        
        do {
            //
            System.out.println("---------------------------------------");
            System.out.println("\t 'Menu Cuenta'"); 
            System.out.println("1.Ingresar Dinero " 
            +"\n2.Retirar Dinero"
            +"\n3.Consultar Dinero"
            +"\n4.Salir del Programa"
            +"\nProporcione la Opcion :"); 
            System.out.println("-----------------------------------------");
            option =Integer.parseInt(sc.nextLine());
            
            
            switch (option) {
                case 1:
                    System.out.println("Proporcione el monto Ingresar : ");
                    montoIngresar =Double.parseDouble(sc.nextLine());
                    cuenta.ingresarDinero(montoIngresar);
                    
                    System.out.println("Se ha ingresado Correctamente el  monto a la cuenta");
                    break; 
                    
                case 2:   
                    System.out.println("Proporcione el Monto a Retirar :"); 
                    montoRetirar= Double.parseDouble(sc.nextLine());  
                    if(montoRetirar> cuenta.getSaldo()){
                        System.out.println("Error ,El Monto proporcionado es mayor a su cuenta");
                    }
                    else{ 
                        cuenta.retirarDinero(montoRetirar);
                        System.out.println("Se ha retirado Correctamente el monto de la cuenta");
                    }
                    break;
                case 3: 
                    System.out.println("\tConsulta de Cuenta "); 
                    System.out.println("Titular de la Cuenta :"+cuenta.getNombreTitular()); 
                    System.out.println("Numero de la Cuenta : "+cuenta.getNumeroCuenta());
                    System.out.println(cuenta.consultarSaldo());
                case 4 : 
                    break;  
                default:
                    System.out.println("Error no es una opcion Disponible");
                    
            }
                        
        }while (option!=4);
        
        
    }
    
    
}



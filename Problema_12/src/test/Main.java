
package test;

import domain.Telefono;
import java.util.Scanner;
/*
    12.	Crear una clase "Teléfono" que tenga como atributos marca,
    modelo y tamaño de pantalla, y métodos para llamar y enviar mensajes
*/

public class Main {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in); 
        String marca , modelo ,mensaje ="" ;
        double tamañoPantalla;  
        int telefonoNum ; 
        int option ; 
        
        System.out.println("Proporcione la Marca Telefono:"); 
        marca = sc.nextLine(); 
        
         System.out.println("Proporcione la Modelo Telefono:"); 
        modelo = sc.nextLine();
        
        System.out.println("Proporcione el tamaño Telefono:"); 
        tamañoPantalla =Double.parseDouble(sc.nextLine());
        
        Telefono telefono = new Telefono(marca, modelo, tamañoPantalla); 
        
        // Simulaccion metodos 
        do{
            System.out.println("\tQue desea realizar (Telefono)" 
            +"\n1.Llamar Telefono "
            +"\n2.Enviar Mensaje "
            +"\n3. Salir"
            +"\n.Opcion :");
            option= Integer.parseInt(sc.nextLine());
            System.out.println(""); 
            
            switch (option) {
                case 1:
                    System.out.println("Proporcione el numero que desea llamar :");
                    telefonoNum = Integer.parseInt(sc.nextLine()); 
                    telefono.llamar(telefonoNum);
                    break;
                case 2:  
                    System.out.println("Proporcione el mensaje enviar :"); 
                    mensaje= sc.nextLine();  
                    telefono.enviarMensaje(mensaje);
                    break; 
                    
                case 3:
                    System.out.println("Programa Finalizado...");
                    break;
                default:
                    System.out.println("Error , Opcion Incorrecta");
            }
            
        }while (option!=3);
        
    }
}

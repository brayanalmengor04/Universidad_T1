
package domain;

public class Trabajador {
    private String nombreTrabajador ;  
    private double sueldo; 
    private int horasTrabajadas ; 

    
    public Trabajador() {
    }

    public Trabajador(String nombreTrabajador, double sueldo) {
        this.nombreTrabajador = nombreTrabajador;
        this.sueldo = sueldo;
    }

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
     public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    public double sueldoSemanal(int horasTrabajadas){
        
        double pagoPorHora=0;   
        
        if (horasTrabajadas<40){
            pagoPorHora = this.sueldo*horasTrabajadas;
        }
        else if (horasTrabajadas>=40){
            pagoPorHora = (this.sueldo*2)*horasTrabajadas;
        }
        
        return pagoPorHora;
    }
   
}

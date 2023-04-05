
package domain;

public class CuentaBancaria {
    private int numeroCuenta ;  
    private double saldo;  
    private String nombreTitular ;  

    public CuentaBancaria() {}

    public CuentaBancaria(int numeroCuenta, double saldo, String nombreTitular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.nombreTitular = nombreTitular;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }
    
    public void ingresarDinero (double saldoIngresar){
        this.saldo +=saldoIngresar; 
    }
    
    public void retirarDinero (double saldoRetiro){
        
        if(saldoRetiro >this.saldo){
            // No hara nada mantendra el saldo 
            this.saldo +=0; 
        }
        else{
            // retirara dinero
            this.saldo -=saldoRetiro;
        }
        
    } 
    
    public String consultarSaldo (){
        return "Saldo Actual : "+this.saldo;  
    }
    
    
}

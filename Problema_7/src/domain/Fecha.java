
package domain;


public class Fecha {
    private int  dia ;  
    private int mes ; 
    private int año ;  
    
    public Fecha() {}

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    } 

    
    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return this.año;
    }

    public void setAño(int año) {
        this.año = año;
    }
        
    public String formatoCorto(){
        String mes =null; 
        String dia =null;  
        String año = null;   
        String fecha = "";
        // Dia 
        if ((this.dia>0)&&(this.dia <=9)){
            dia = "0"+(Integer.toString(this.dia));
        }
        else if ((this.dia>=10) && (this.dia <=31)){
           dia = Integer.toString(this.dia); 
        }

        // Mes 
        // Agregar un 0 si es mayor a 0 0 menor o igual a 9 
        
        if ((this.mes>0)&&(this.mes <=9)){
            mes = "0"+(Integer.toString(this.mes));
        }
        else if( (this.mes >=10) && (this.mes <=12)){
            mes = (Integer.toString(this.mes)); 
        }
        
        //Año  
        // 2022
        if (this.año >999){
            año = (Integer.toString(this.año)).substring(2);
            
        }
        
       return fecha = "("+dia +"/" +mes +"/"+año +")"; 
    }
    
    
    public String formatoMediano (){
        
        String mes =null; 
        String dia =null;  
        String año = null;   
        String fecha = "";
        // Dia 
        if ((this.dia>0)&&(this.dia <=9)){
            dia = "0"+(Integer.toString(this.dia));
        }
        else if ((this.dia>=10) && (this.dia <=31)){
           dia = Integer.toString(this.dia); 
        }

        // Mes 
        // Agregar un 0 si es mayor a 0 0 menor o igual a 9 
        
        if ((this.mes>0)&&(this.mes <=9)){
            mes = "0"+(Integer.toString(this.mes));
        }
        else if( (this.mes >=10) && (this.mes <=12)){
            mes = (Integer.toString(this.mes)); 
        }
        
        // Año  
        
        if (this.año >999){
            año = Integer.toString(this.año); 
        }
        
        
        return fecha = "("+dia +"/" +mes +"/"+año +")"; 
    }
    public String formatoLargo (){ 
        
         String mes =null; 
        String dia =null;  
        String año = null;   
        String fecha = "";
        // Dia 
        if ((this.dia>0)&&(this.dia <=9)){
            dia = "0"+(Integer.toString(this.dia));
        }
        else if ((this.dia>=10) && (this.dia <=31)){
           dia = Integer.toString(this.dia); 
        }

        // Mes 
        // Agregar un 0 si es mayor a 0 0 menor o igual a 9 
        
        switch (this.mes){
            case 1: 
                mes ="Enero"; 
                break;
            case 2: 
                mes ="Febrero";
                break;
            case 3:
                mes ="Marzo";
                break;
            case 4: 
                mes ="Abril";
                break;
            case 5: 
                mes ="Mayo";
                break;
            case 6: 
                mes ="Junio";
                break;
            case 7: 
                mes ="Julio";
                break;
            case 8: 
                mes ="Agosto";
                break;
            case 9: 
                mes ="Septiembre";
                break;
            case 10: 
                mes ="Octubre";
                break;
            case 11: 
                mes ="Noviembre";
                break;
            case 12: 
                mes ="Diciembre";
                break;
            
        }
        
        // Año  
        
        if (this.año >999){
            año = Integer.toString(this.año); 
        }
        
        return fecha = "(Dia "+dia +" de " +mes +" del año "+año +")" ; 
    }

   
    
    
}

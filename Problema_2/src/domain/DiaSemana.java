package domain;

public class DiaSemana {
    private int dia ; 
    
    public DiaSemana (){} 
    
    public DiaSemana(int dia){
        this.dia = dia;  
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public String diaSemana (){
        String diaSemana = null; 
       
        switch (this.dia){
            case 1:  
                diaSemana = "Lunes"; 
                break;
            case 2: 
                diaSemana= "Martes";
                break;
            case 3: 
                diaSemana= "Miercoles";
                break;
            case 4:  
                diaSemana= "Jueves";
                break;
            case 5:  
                diaSemana="Viernes";
                break;
            case 6:  
                diaSemana = "Sabado";
                break;
            case 7: 
                diaSemana = "Domingo";
                break;
         
        }
        return diaSemana;
    } 
    
    
}

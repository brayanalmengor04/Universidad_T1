
package domain;

public class DescuentoArticulo { 
    
    private String descripcion ;  
    private double precio ;   
    
    public DescuentoArticulo() {} 

    public DescuentoArticulo(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
      
    } 

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    public double descuentoAplicado(){
        
        double descuentoAplicado =0;
        
        if (this.precio>=200){
            descuentoAplicado = this.precio-(this.precio*0.15); 
        }
        else if ((this.precio >100) && (this.precio <200)){
            descuentoAplicado = this.precio-(this.precio*0.12); 
        }
        else if (this.precio <100){
            descuentoAplicado = this.precio-(this.precio*0.10);
        
        }
        return descuentoAplicado;
    }

    
    
    
    
}

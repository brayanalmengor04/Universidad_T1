package domain;
/*
    1.	Vamos a crear una clase llamada Persona. Sus atributos son: nombre, edad y DNI. 
    Construye los siguientes métodos para la clase: • Un constructor, vacío y un constructor 
    con los atributos. • Los setters y getters para cada uno de los atributos. 
    • mostrar(): Muestra los datos de la persona. • 
    esMayorDeEdad(): Devuelve un valor lógico indicando si es mayor de edad.
*/

public class Persona {
    private String nombre ,dni; 
    private int edad ;  
    
    public Persona(){} 

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String mostrar() {
        return "Nombre "+this.nombre +"\nDNI :"+this.dni +"\nEdad: "+this.edad;
    } 
    
    public boolean esMayorEdad(){
        return this.edad >=18;
    }
     
       
}

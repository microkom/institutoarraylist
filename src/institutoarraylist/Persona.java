/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutoarraylist;

/**
 *
 * @author DAW
 */
public class Persona {

    private String dni;
    private String nombre;
    private Fecha fechaNac;

    //constructor
    public Persona(String dni, String nombre, Fecha fechaNac) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    //getters
    public String getDni() {
        return this.dni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Fecha getFechaNac() {
        return this.fechaNac;
    }

    //setters
    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }
    
  
    public String toString() {
        String texto = "";
        texto = "\tDNI: " + this.dni ;
        texto+="\t- \tNombre: "+this.nombre +"\t-";
        
        return texto;
    }
}

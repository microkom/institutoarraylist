/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutoarraylist;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Dni. Nombre; Fecha de nacimiento. Notas: Se almacena información del listado
 * de notas de un alumno
 */
public class Alumno extends Persona {

    private ArrayList<Nota> notas = new ArrayList<Nota>();

    public Alumno(String dni, String nombre, Fecha fechaNac) {
        super(dni, nombre, fechaNac);
    }

    public ArrayList<Nota> getNotas() {
        return this.notas;
    }

    public void setNotas(ArrayList<Nota> notas) {
        this.notas = notas;
    }
    
    //comprobacion por alumno: todos los módulos están aprobados?
    public boolean todosModulosAprobados() {
        boolean todos = true;

        Iterator<Nota> it = this.notas.iterator();
        Nota obj = null;
        while (it.hasNext() && (todos)) {
            obj = it.next();
            if (obj.getNota() < 5) {
                todos = false;
            }
        }
        return todos;
    }
    
    //nota media por alumno
    public float notaMedia() {
        float med = 0;

        for (Nota nota : this.notas) {
            med += nota.getNota();
        }
        return med / this.notas.size();
    }

    //menor de edad
    public String menorDeEdad(){
        String texto="";
        texto += "\n" + super.toString();
        if (super.getFechaNac().mayorDe(18)) {
            texto += "\tEs mayor de edad" + "\n";
        } else {
            texto += "\tEs menor de edad" + "\n";
        }
        return texto;
    }

    public String toString() {
        //linea de la tabla
        String guion = "\t+" + hy(61,"-") + "+";
        
        //linea separadora de alumnos
        String texto =  hy(3," ")+"+" +hy(76,"=")+"+";
        
        //Es mayor de eadad?
        texto+=menorDeEdad();
        
        //información de los módulos y el alumno
        texto += "\n\tMatriculado en: \n";
        texto += guion + "\n\t| Modulo                 | Ciclo   | Profesor      | Nota     |\n" + guion;
            //nota y nota media
        float med = 0;

        for (Nota nota : this.notas) {
            //notas de cada módulo
            texto += "\n\t" + nota.toString();
            
            med += nota.getNota();
        }
        //cálculo de la nota media
        float notaMedia = (float) med / this.notas.size();
        
        //linea
        texto += "\n\t+" + hy(61,"-");
        //dar formato a un valor en medio de una concatenació
        String textoAux= String.format("+\n\tNota media alumno: %2.2f \n\n", notaMedia);
        texto+= textoAux;
        return texto;
    }

    //metodo estático para crear una linea de guiones
    public static String hy(int cant, String caracter) {
        String hyphen = "";
        for (int i = 0; i < cant; i++) {
            hyphen += caracter;
        }
        return hyphen;
    }
}
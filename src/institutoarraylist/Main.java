/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institutoarraylist;

import static institutoarraylist.Alumno.hy;
import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Main {

    /**
     * hora crea una clase ejecutable que realice lo siguiente:
     *
     *** Crea el ciclo daw con 2000 horas de clase. ** Crea todos los módulos
     * de 1 daw (Crea los profesores que necesiten para los módulos). ** Crear 5
     * alumnos para daw y matricularlo a los módulos creados. ** Después mostrar
     * la información de todos los alumnos **o Información personal. **o
     * Información de si mayor de edad. ** Modulo matriculado junto la nota y el
     * profesor que lo imparte. ** Además habrá que mostrar la nota media del
     * alumno.  Después se deberá mostrar que porcentaje de alumnos tienen
     * todos los módulos aprobados y cuantos no.  También habrá que mostrar el
     * nombre del alumno que mejor nota media tiene y el que peor
     */
    public static void main(String[] args) {

        //profesores
        Profesor profeProgra = new Profesor("12345d", "Victor", new Fecha(2, 2, 1980), "Ing. informatico", "victor@gmail.com");
        Profesor profeEntorno = new Profesor("12346d", "Alex", new Fecha(1, 1, 1981), "Informatico", "alex@gmail.com");
        Profesor profeDbase = new Profesor("12347d", "Jose", new Fecha(4, 4, 1974), "Matemático", "jose@gmail.com");
        Profesor profeHtml = new Profesor("12348d", "David", new Fecha(5, 5, 1985), "Físico", "david@gmail.com");

        //creación de los alumnos del ciclo
        Alumno alumno1 = new Alumno("32341k", "Juanjo", new Fecha(14, 6, 2001));
        Alumno alumno2 = new Alumno("32342k", "Sandra", new Fecha(1, 2, 2000));
        Alumno alumno3 = new Alumno("32343k", "Miguel Angel", new Fecha(4, 8, 1992));
        Alumno alumno4 = new Alumno("32344k", "David", new Fecha(1, 1, 1999));
        Alumno alumno5 = new Alumno("32345k", "Sergio", new Fecha(4, 8, 1999));

        //creación del ciclo
        Ciclo daw = new Ciclo("daw", 2000);

        //creación de los módulos
        Modulo modulo1 = new Modulo("Programacion", 8, daw, profeProgra);
        Modulo modulo2 = new Modulo("Entorno de Desarrollo", 3, daw, profeEntorno);
        Modulo modulo3 = new Modulo("DBase", 3, daw, profeDbase);
        Modulo modulo4 = new Modulo("HTML", 8, daw, profeHtml);

        //agregar alumnos al ciclo
        daw.getAlumno().add(alumno1);
        daw.getAlumno().add(alumno2);
        daw.getAlumno().add(alumno3);
        daw.getAlumno().add(alumno4);
        daw.getAlumno().add(alumno5);
        
        //Creación de notas de los alumnos según módulo
        alumno1.getNotas().add(new Nota(modulo1, 6));
        alumno1.getNotas().add(new Nota(modulo2, 7));
        alumno1.getNotas().add(new Nota(modulo3, 3));
        alumno2.getNotas().add(new Nota(modulo4, 8));
        alumno2.getNotas().add(new Nota(modulo2, 6));
        alumno2.getNotas().add(new Nota(modulo1, 8));
        alumno2.getNotas().add(new Nota(modulo3, 3));
        alumno3.getNotas().add(new Nota(modulo3, 7));
        alumno3.getNotas().add(new Nota(modulo4, 7));
        alumno4.getNotas().add(new Nota(modulo4, 8));
        alumno5.getNotas().add(new Nota(modulo4, 3));
        alumno5.getNotas().add(new Nota(modulo1, 10));
        alumno5.getNotas().add(new Nota(modulo2, 9));

        
        //impresión de toda la información del ciclo
        System.out.println(daw.imprimirTodo());

        //linea separadora
        System.out.println("\t+" + hy(31,"+=") + "+");
        
        //porcentaje de alumnos aprobados en todo el ciclo        
        System.out.printf("\tPorcentaje de aprobados en todo el ciclo %-2.1f%% \n\n",daw.porcentajeAprobadosCiclo());
       
        //Persona con nota más alta y más baja
        System.out.println("\tPersona con Nota max: "+daw.personaNotaMaxima().getNombre());
        System.out.println("\tPersona con Nota min: "+daw.personaNotaMinima().getNombre());
        System.out.println("\n\n");
    }

}

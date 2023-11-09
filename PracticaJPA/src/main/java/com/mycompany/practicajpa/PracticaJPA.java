package com.mycompany.practicajpa;

import com.mycompany.practicajpa.logica.Alumno;
import com.mycompany.practicajpa.logica.ControladoraLogica;
import java.util.Date;

public class PracticaJPA {

    public static void main(String[] args) {
        ControladoraLogica cont = new ControladoraLogica();
        cont.createAlumno(new Alumno("Juan", "Perez", new Date()));
    }
}

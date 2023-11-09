package com.mycompany.practicajpa.logica;

import com.mycompany.practicajpa.persistencia.ControladoraPersistencia;

/**
 *
 * @author fabri
 */
public class ControladoraLogica {

    ControladoraPersistencia contPersis;

    public ControladoraLogica() {
        this.contPersis = new ControladoraPersistencia();
    }

    public void createAlumno(Alumno alumno) {
        contPersis.createAlmuno(alumno);
    }
}

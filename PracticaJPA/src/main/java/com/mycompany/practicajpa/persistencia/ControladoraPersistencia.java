package com.mycompany.practicajpa.persistencia;

import com.mycompany.practicajpa.logica.Alumno;
import com.mycompany.practicajpa.persistencia.exceptions.NonexistentEntityException;

/**
 *
 * @author fabri
 */
public class ControladoraPersistencia {

    AlumnoJpaController ajc;

    public ControladoraPersistencia() {
        this.ajc = new AlumnoJpaController();
    }

    public void createAlmuno(Alumno alumno) {
        ajc.create(alumno);
    }

    public void deleteAlumno(int id) throws NonexistentEntityException {
        try {
            ajc.destroy(id);
        } catch (NonexistentEntityException ex) {
            throw ex;
        }
    }

    public void updateAlumno(Alumno alumno) throws Exception {
        try {
            ajc.edit(alumno);
        } catch (Exception ex) {
            throw ex;
        }
    }

}

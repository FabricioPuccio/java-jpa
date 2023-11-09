package com.mycompany.practicajpa.logica;

import com.mycompany.practicajpa.persistencia.ControladoraPersistencia;
import com.mycompany.practicajpa.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public void deleteAlumno(int id) {
        try {
            contPersis.deleteAlumno(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateAlumno(Alumno alumno) {
        try {
            contPersis.updateAlumno(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraLogica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno findAlumnoById(int id) {
        return contPersis.findAlumnoById(id);
    }

    public List<Alumno> getListAlumno() {
        return contPersis.getListAlumno();
    }
}

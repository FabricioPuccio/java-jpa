package com.mycompany.practicajpa.persistencia;

import com.mycompany.practicajpa.logica.Alumno;

/**
 *
 * @author fabri
 */
public class ControladoraPersistencia {

    AlumnoJpaController ajc;

    public ControladoraPersistencia() {
        this.ajc = new AlumnoJpaController();
    }
    
    public void createAlmuno(Alumno alumno){
        ajc.create(alumno);
    }

}

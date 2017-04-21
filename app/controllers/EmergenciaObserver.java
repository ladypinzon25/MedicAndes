package controllers;

import models.EmergenciaEntity;
import models.HistorialEntity;
import models.LecturaEntity;
import models.PacienteEntity;

/**
 * Created by ln.bello10 on 21/04/2017.
 */
public class EmergenciaObserver extends LecturaObserver {

    public EmergenciaObserver(LecturaEntity lectura){
        this.lectura = lectura;
        this.lectura.agregarObservador(this);
    }

    @Override
    public void update() {

        if(lectura.getEstado() == LecturaEntity.ESTADO_ROJO) {
            EmergenciaEntity emergencia = new EmergenciaEntity();
            emergencia.setFecha(lectura.getFecha());
            emergencia.setEstado(EmergenciaEntity.INICIADA);
            emergencia.setHistorial(HistorialEntity.FINDER.byId(lectura.getHistorial().getId()));
            emergencia.setPaciente(PacienteEntity.FINDER.byId(lectura.getHistorial().getId()));
            emergencia.save();

        }
    }
}

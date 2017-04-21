package controllers;

import models.EmergenciaEntity;
import models.LecturaEntity;

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
            emergencia.save();
        }
    }
}

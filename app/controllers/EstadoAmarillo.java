package controllers;

import models.LecturaEntity;

/**
 * Created by s.martinez15 on 21/04/2017.
 */
public class EstadoAmarillo implements LecturaEstado
{
    public boolean manejar(LecturaEntity lectura)
    {
        if(evaluar(lectura.getFrecuenciaCardiaca(), lectura.getPresionSanguinea()))
        {
            lectura.setEstado(LecturaEntity.ESTADO_AMARILLO);
            return true;
        }
        return false;
    }

    private boolean evaluar(int frec, int presion)
    {
        if(presion < 89)
        {
            return true;
        }
        if(presion > 120)
        {
            return true;
        }
        if(frec > 100 && presion > 100)
        {
            return true;
        }
        return false;
    }
}

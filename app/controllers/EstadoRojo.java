package controllers;

import models.LecturaEntity;

/**
 * Created by s.martinez15 on 21/04/2017.
 */
public class EstadoRojo implements LecturaEstado
{
    public boolean manejar(LecturaEntity lectura)
    {
        if(evaluar(lectura.getFrecuenciaCardiaca(), lectura.getPresionSanguinea()))
        {
            lectura.setEstado(LecturaEntity.ESTADO_ROJO);
            return true;
        }
        return false;
    }

    private boolean evaluar(int frec, int presion)
    {
        if(frec < 50)
        {
            return true;
        }
        if(presion < 80)
        {
            return true;
        }
        if(presion > 139)
        {
            return true;
        }
        if(frec > 120 && presion > 120)
        {
            return true;
        }
        return false;
    }
}

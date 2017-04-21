package controllers;

import models.LecturaEntity;
import models.MedicoEntity;
import models.MensajeEntity;
import models.PacienteEntity;

import java.util.List;

/**
 * Created by s.martinez15 on 21/04/2017.
 */
public class MedicoObserver extends LecturaObserver
{
    public MedicoObserver(LecturaEntity lectura)
    {
        this.lectura = lectura;
    }

    @Override
    public void update()
    {
        if(lectura.getEstado() == LecturaEntity.ESTADO_AMARILLO || lectura.getEstado() == LecturaEntity.ESTADO_ROJO)
        {
            MensajeEntity mensaje = new MensajeEntity();

            String msg = "El paciente con id "+lectura.getHistorial().getId() +" se encuentra en estado ";
            if(lectura.getEstado() == LecturaEntity.ESTADO_AMARILLO)
            {
                msg+="grave.";
            }
            else if(lectura.getEstado() == LecturaEntity.ESTADO_ROJO)
            {
                msg+="critico.";
            }


            mensaje.setMensaje(msg);
            mensaje.setMedicos(buscarMedicosPaciente(lectura.getHistorial().getId()));
            mensaje.save();
        }
    }

    private List<MedicoEntity> buscarMedicosPaciente(Long idP)
    {
        PacienteEntity paciente = PacienteEntity.FINDER.byId(idP);
        return paciente.getMedicos();
    }
}

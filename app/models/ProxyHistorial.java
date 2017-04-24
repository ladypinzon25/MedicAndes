package models;

import controllers.LecturaController;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by ln.bello10 on 24/04/2017.
 */
public class ProxyHistorial implements Historial {

    private HistorialEntity historialReal;
    private Long id;
    private Queue<LecturaEntity> lecturas;

    public ProxyHistorial(Long id){
        lecturas= LecturaController.getLecturasRecientes(id);
        this.id=id;
    }

    @Override
    public Long getId() {
        return id;
    }

    private HistorialEntity getHistorialReal(){
        if(historialReal == null)
        {
            historialReal = HistorialEntity.FINDER.byId(id);
        }
        return historialReal;
    }

    @Override
    public String getAlergias()
    {
        return getHistorialReal().getAlergias();
    }

    @Override
    public String getEnfermedades() {
        return  getHistorialReal().getEnfermedades();
    }

    @Override
    public List<CitaEntity> getCitasHistorial() {
        return getHistorialReal().getCitasHistorial();
    }

    @Override
    public List<ExamenEntity> getExamenesHistorial() {
        return getHistorialReal().getExamenesHistorial();
    }

    @Override
    public List<LecturaEntity> getLecturasHistorial() {
        return getHistorialReal().getLecturasHistorial();
    }

    @Override
    public void addLectura(LecturaEntity lectura) {
        lecturas.remove();
        lecturas.add(lectura);
    }

    @Override
    public List<EmergenciaEntity> getEmergencias() {
        return getHistorialReal().getEmergencias();
    }

}

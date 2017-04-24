package models;

import java.util.List;

/**
 * Created by ln.bello10 on 24/04/2017.
 */
public interface Historial {

    public Long getId();

    public String getAlergias();

    public String getEnfermedades();

    public List<CitaEntity> getCitasHistorial();

    public List<ExamenEntity> getExamenesHistorial();

    public List<LecturaEntity> getLecturasHistorial();

    public List<EmergenciaEntity> getEmergencias();

}

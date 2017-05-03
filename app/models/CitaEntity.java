package models;
import javax.persistence.Entity;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;

/**
 * Clase que representa una cita medica
 * Created by Lady Pinzon on 11/02/2017.
 */
@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="citaEntity")
public class CitaEntity extends Model{

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long,CitaEntity> FINDER = new Finder<>(CitaEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador de la cita
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Cita
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Cita")
    private Long id;

    /**
     * diagnostico generado en la cita
     */
    private String diagnostico;
    /**
     * fecha de la cita
     */
    private Long fecha;

    /**
     * medico de la cita
     */
    @ManyToOne
    @JsonBackReference(value="r1")
    private MedicoEntity medico;

    /**
     * paciente de la cita
     */
    @ManyToOne
    @JsonBackReference(value="r5")
    private PacienteEntity paciente;
    /**
     * historial al que pertenece la cita
     */
    @ManyToOne
    @JsonBackReference(value="r6")
    private HistorialEntity historial;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public CitaEntity() {

        id = null;
        fecha  = null;
        diagnostico ="NO NAME";
        medico = null;
        paciente = null;
        historial = null;
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param fecha
     * @param diagnostico
     */
    public CitaEntity(Long id, Long fecha, String diagnostico) {

        this.id = id;
        this.fecha = fecha;
        this.diagnostico = diagnostico;


    }

    public CitaEntity(Long id) {
        this();
        setId(id);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public Long getFecha() {

        return fecha;
    }

    public void setFecha(Long fecha) {

        this.fecha = fecha;
    }

    public String getDiagnostico() {

        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {

        this.diagnostico = diagnostico;
    }
    public MedicoEntity getMedico() {

        return medico;
    }

    public void setMedico(MedicoEntity medico) {

        this.medico = medico;
    }
    public PacienteEntity getPaciente() {

        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {

        this.paciente = paciente;
    }

    public HistorialEntity getHistorial() {

        return historial;
    }

    public void setHistorial(HistorialEntity historial) {

        this.historial = historial;
    }

    public Date getDia(){
        Date d = new Date (fecha*1000);
        return d;
    }

}

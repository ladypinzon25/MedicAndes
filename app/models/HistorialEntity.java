package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import javax.validation.constraints.AssertFalse;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una historial medico de un paciente
 * Created by Lady Pinzon on 11/02/2017.
 */
@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="historialEntity")
public class HistorialEntity extends Model {

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long,HistorialEntity> FINDER = new Finder<>(HistorialEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador de la historial
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Historial
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Historial")
    private Long id;

    /**
     * enfermedades generados en el historial
     */
    private String enfermedades;
    /**
     * alergias de el historial
     */
    private String alergias;
    /**
     * citas del historial
     */
    @OneToMany(mappedBy = "historial")
    @JsonManagedReference(value="r6")
    private List<CitaEntity> citasHistorial;

    /**
     * examenes del historial
     */
    @OneToMany(mappedBy = "historial")
    @JsonManagedReference(value="r8")
    private List<ExamenEntity> examenesHistorial;

    /**
     * lecturas del historial
     */
    @OneToMany(mappedBy = "historial")
    @JsonManagedReference(value="r9")
    private List<LecturaEntity> lecturasHistorial;

    /**
     * emergencias del historial
     */
    @OneToMany(mappedBy = "historial")
    @JsonManagedReference(value="r10")
    private List<EmergenciaEntity> emergencias;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public HistorialEntity() {

        id = null;
        alergias  = "NO NAME";
        enfermedades ="NO NAME";
        citasHistorial = new ArrayList<CitaEntity>();
        examenesHistorial = new ArrayList<ExamenEntity>();
        lecturasHistorial = new ArrayList<LecturaEntity>();
        emergencias = new ArrayList<EmergenciaEntity>();
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param alergias
     * @param enfermedades
     */
    public HistorialEntity(Long id, String alergias, String enfermedades) {
        System.out.println("Historial");
        this.id = id;
        this.alergias = alergias;
        this.enfermedades = enfermedades;
    }

    public HistorialEntity(Long id) {
        this();
        setId(id);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getAlergias() {

        return alergias;
    }

    public void setAlergias(String alergias) {

        this.alergias = alergias;
    }

    public String getEnfermedades() {

        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {

        this.enfermedades = enfermedades;
    }
    public List<CitaEntity> getCitasHistorial() {

        return citasHistorial;
    }

    public void setCitasHistorial(List <CitaEntity> citas) {

        this.citasHistorial = citas;
    }
    public List<ExamenEntity> getExamenesHistorial() {

        return examenesHistorial;
    }

    public void setExamenesHistorial(List <ExamenEntity> examenes) {

        this.examenesHistorial = examenes;
    }
    public List<LecturaEntity> getLecturasHistorial() {

        return lecturasHistorial;
    }

    public void setLecturasHistorial(List <LecturaEntity> lecturas) {

        this.lecturasHistorial = lecturas;
    }
    public List<EmergenciaEntity> getEmergencias() {

        return emergencias;
    }

    public void setEmergencias(List <EmergenciaEntity> emergencias) {

        this.emergencias = emergencias;
    }
}

package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

/**
 * Clase que representa una lectura medica
 * Created by Lady Pinzon on 11/02/2017.
 */
@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="lecturaEntity")
public class LecturaEntity extends Model{

//--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Model.Finder<Long,LecturaEntity> FINDER = new Model.Finder<>(LecturaEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador de la lectura
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Lectura
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Lectura")
    private Long id;

    /**
     * frecuencia cardiaca generada en la lectura
     */
    private int frecuenciaCardiaca;
    /**
     * fecha de la lectura
     */
    private Long fecha;
    /**
     * presion sanguinea generada en la lectura
     */
    private int presionSanguinea;
    /**
     * Nivel de estres generado en la lectura
     */
    private int nivelEstres;
    /**
     * estado generado en la lectura
     */
    private int estado;
    /**
     * paciente al que pertenece la lectura
     */

    @ManyToOne
    @JsonManagedReference(value="r4")
    private PacienteEntity paciente;

    /**
     * historial al que pertenece las lecturas
     */
    @ManyToOne
    @JsonManagedReference(value="r9")
    private HistorialEntity historial;


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public LecturaEntity() {
        System.out.println("Lectura");
        id = null;
        fecha  = null;
        frecuenciaCardiaca = 0;
        presionSanguinea = 0;
        nivelEstres = 0;
        estado=0;
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param fecha
     * @param frecuenciaCardiaca
     * @param presionSanguinea
     * @param nivelEstres
     * @param estado
     */
    public LecturaEntity(Long id, Long fecha, int frecuenciaCardiaca, int presionSanguinea, int nivelEstres, int estado) {
        System.out.println("Lectura");

        this.id = id;
        this.fecha = fecha;
        this.frecuenciaCardiaca = frecuenciaCardiaca;
        this.presionSanguinea = presionSanguinea;
        this. nivelEstres = nivelEstres;
        this.estado = estado;
        this.paciente = null;
        this.historial = null;
    }

    public LecturaEntity(Long id) {
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

    public int getPresionSanguinea() {

        return presionSanguinea;
    }

    public void setPresionSanguinea(int presionSanguinea) {

        this.presionSanguinea = presionSanguinea;
    }
    public int getFrecuenciaCardiaca() {

        return frecuenciaCardiaca;
    }

    public void setFrecuenciaCardiaca(int frecuenciaCardiaca) {

        this.frecuenciaCardiaca = frecuenciaCardiaca;
    }
    public int getNivelEstres() {

        return nivelEstres;
    }

    public void setNivelEstres(int nivelEstres) {

        this.nivelEstres = nivelEstres;
    }
    public int getEstado() {

        return estado;
    }
    public void setEstado(int estado) {

        this.estado = estado;
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
}

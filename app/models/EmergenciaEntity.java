package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
@Entity
@Table(name="emergenciaEntity")
public class EmergenciaEntity extends Model {

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long,EmergenciaEntity> FINDER = new Finder<>(EmergenciaEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador de la emergencia
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Emergencia
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Emergencia")
    private Long id;

    /**
     * estado generado en la emergencia
     */
    private String estado;
    /**
     * fecha de la emergencia
     */
    private Long fecha;
    /**
     * ubicacion generado en la emergencia
     */
    private String ubicacion;

    /**
     * historial al que pertenece la emergencia
     */
    @ManyToOne
    @JsonBackReference(value="r10")
    private HistorialEntity historial;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public EmergenciaEntity() {
        System.out.println("Emergencia");
        id = null;
        fecha  = null;
        estado ="NO NAME";
        ubicacion = "NO NAME";
        historial = null;
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param fecha
     * @param estado
     * @param ubicacion
     */
    public EmergenciaEntity(Long id, Long fecha, String estado, String ubicacion) {
        System.out.println("Emergencia");
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
        this.ubicacion = ubicacion;
    }

    public EmergenciaEntity(Long id) {
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

    public String getEstado() {

        return estado;
    }

    public void setEstado(String estado) {

        this.estado = estado;
    }
    public String getUbicacion() {

        return estado;
    }

    public void setUbicacion(String ubicacion) {

        this.ubicacion = ubicacion;
    }
    public HistorialEntity getHistorial() {

        return historial;
    }

    public void setHistorial(HistorialEntity historial) {

        this.historial = historial;
    }
}

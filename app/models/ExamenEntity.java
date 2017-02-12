package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
@Entity
@Table(name="examenEntity")
public class ExamenEntity extends Model {

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long,ExamenEntity> FINDER = new Finder<>(ExamenEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador de la examen
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Examen
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Examen")
    private Long id;

    /**
     * resultado generado en el examen
     */
    private String resultado;
    /**
     * fecha del examen
     */
    private Long fecha;
    /**
     * tipo del examen
     */
    private String tipo;
    /**
     * paciente al que pertenece el examen
     */
    @ManyToOne
    @JsonBackReference(value="r7")
    private PacienteEntity paciente;

    /**
     * historial al que pertecene el examen
     */
    @ManyToOne
    @JsonBackReference(value="r8")
    private HistorialEntity historial;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public ExamenEntity() {
        System.out.println("Examen");
        id = null;
        fecha  = null;
        resultado ="NO NAME";
        tipo = "NO NAME";
        paciente = null;
//        historial = null;
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param fecha
     * @param resultado
     * @param tipo
     */
    public ExamenEntity(Long id, Long fecha, String resultado, String tipo) {
        System.out.println("Examen");
        this.id = id;
        this.fecha = fecha;
        this.resultado = resultado;
        this.tipo = tipo;
    }

    public ExamenEntity(Long id) {
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

    public String getResultado() {

        return resultado;
    }

    public void setResultado(String resultado) {

        this.resultado = resultado;
    }
    public String getTipo() {

        return tipo;
    }

    public void setTipo(String tipoo) {

        this.tipo = tipoo;
    }
    public HistorialEntity getHistorial() {

        return historial;
    }

    public void setHistorial(HistorialEntity historial) {

        this.historial = historial;
    }
    public PacienteEntity getPaciente() {

        return paciente;
    }

    public void setPaciente(PacienteEntity paciente) {

        this.paciente = paciente;
    }
}

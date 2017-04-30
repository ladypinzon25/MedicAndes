package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.*;

/**
 * Clase que representa una consejo medica
 * Created by Lady Pinzon on 11/02/2017.
 */
@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="consejoEntity")
public class ConsejoEntity extends Model {

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long,ConsejoEntity> FINDER = new Finder<>(ConsejoEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador de la consejo
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Consejo
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Consejo")
    private Long id;

    /**
     * mensaje recomendado por el medico
     */
    private String mensaje;
    /**
     * fecha del consejo
     */
    private Long fecha;
    /**
     * dieta recomendada por el medico
     */
    private String dieta;
    /**
     * actividad fisica recomendada por el medico
     */
    private String actividadFisica;
    /**
     * medicamentos recetados por el medico
     */
    private String medicamentos;
    /**
     * paciente al que va dirijido el consejo
     */

    @ManyToOne
    @JsonBackReference(value="r2")
    private PacienteEntity paciente;

    /**
     * medico creador del consejo
     */
    @ManyToOne
    @JsonBackReference(value="r3")
    private MedicoEntity medico;

    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public ConsejoEntity() {
        System.out.println("Consejo");
        id = null;
        fecha  = null;
        mensaje ="NO NAME";
        actividadFisica = "NO NAME";
        dieta = "NO NAME";
        medicamentos = "NO NAME";
        paciente = null;
        medico = null;
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param fecha
     * @param mensaje
     * @param dieta
     * @param  actividadFisica
     * @param  medicamentos
     */
    public ConsejoEntity(Long id, Long fecha, String mensaje, String dieta, String actividadFisica, String medicamentos) {
        System.out.println("Consejo");
//        this.id = id;
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.dieta = dieta;
        this.actividadFisica = actividadFisica;
        this.medicamentos = medicamentos;

    }
    public ConsejoEntity( Long fecha, String mensaje, String dieta, String actividadFisica, String medicamentos) {
        System.out.println("Consejo");
//        this.id = id;
        this.fecha = fecha;
        this.mensaje = mensaje;
        this.dieta = dieta;
        this.actividadFisica = actividadFisica;
        this.medicamentos = medicamentos;

    }

    public ConsejoEntity(Long id) {
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

    public String getMensaje() {

        return mensaje;
    }

    public void setMensaje(String mensaje) {

        this.mensaje = mensaje;
    }
    public String getDieta() {

        return dieta;
    }

    public void setDieta(String dieta) {

        this.dieta = dieta;
    }
    public String getActividadFisica() {

        return actividadFisica;
    }

    public void setActividadFisica(String actividadFisica) {

        this.actividadFisica = actividadFisica;
    }
    public String getMedicamentos() {

        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {

        this.medicamentos = medicamentos;
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
}

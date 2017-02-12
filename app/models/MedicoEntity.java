package models;

import javax.persistence.Entity;

/**
 * Clase que representa un medico
 * Created by ln.bello10 on 10/02/2017.
 */

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="medicoEntity")
public class MedicoEntity extends Model {
    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long,MedicoEntity> FINDER = new Finder<>(MedicoEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador del medico
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Medico
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Medico")
    private Long id;

    /**
     * nombre del medico
     */
    private String nombre;

    /**
     * especialidad del medico
     */
    //
    private String especialidad;

    /**
     * lista de citas del medico
     */
    //
    @OneToMany(mappedBy = "medico")
    //Hace que no haya un ciclo entre cita y medico
    @JsonManagedReference(value="r1")
    private List<CitaEntity> citas;

    /**
     * lista de pacientes del medico
     */
    @ManyToMany(mappedBy = "medicos")
    private List<PacienteEntity> pacientes;

    /**
     * consejos generados por el medico
     */
    @OneToMany(mappedBy = "medico")
    @JsonManagedReference(value="r3")
    private List<ConsejoEntity> consejosDados;



    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public MedicoEntity() {

        System.out.println("Medico");
        id = null;
        nombre  = "NO NAME";
        especialidad ="NO NAME";
        citas = new ArrayList<CitaEntity>();
        pacientes = new ArrayList<PacienteEntity>();
        consejosDados = new ArrayList<ConsejoEntity>();
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param nombre
     * @param especialidad
     */
    public MedicoEntity(Long id, String nombre, String especialidad) {
        System.out.println("Medico");
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public MedicoEntity(Long id) {
        this();
        setId(id);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getEspecialidad() {

        return especialidad;
    }

    public void setEspecialidad(String especialidad) {

        this.especialidad = especialidad;
    }
    public List<PacienteEntity> getPacientes() {

        return pacientes;
    }

    public void setPacientes(List <PacienteEntity> pacientes) {

        this.pacientes = pacientes;
    }

    public List<CitaEntity> getCitas() {

        return citas;
    }

    public void setCitas(List <CitaEntity> citas) {

        this.citas = citas;
    }
    public List<ConsejoEntity> getConsejosDados() {

        return consejosDados;
    }

    public void setConsejosDados(List <ConsejoEntity> consejosDados) {

        this.consejosDados = consejosDados;
    }
}

package models;

import com.avaje.ebean.Finder;
import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ln.bello10 on 06/04/2017.
 */
@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="mensajeEntity")
public class MensajeEntity extends Model {

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long, MensajeEntity> FINDER = new Finder<>(MensajeEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador del usuario
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es User
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Mensaje")
    private Long id;

    /**
     * mensaje
     */
    private String mensaje;

    @ManyToMany
    @JsonBackReference
    private List<MedicoEntity> medicos;


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public MensajeEntity() {
        System.out.println("Mensaje");
        id = null;
        mensaje = "NO NAME";
        medicos = new ArrayList<MedicoEntity>();
    }


    public MensajeEntity(Long id, String mensaje) {
        System.out.println("Mensaje");
        this.id = id;
        this.mensaje = mensaje;
    }

    public MensajeEntity(Long id) {
        this();
        setId(id);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getMensaje() {

        return mensaje;
    }

    public void setMensaje(String mensaje) {

        this.mensaje = mensaje;
    }

    public List<MedicoEntity> getMedicos() {

        return medicos;
    }

    public void setMedicos(List<MedicoEntity> medico) {

        this.medicos = medicos;
    }

}


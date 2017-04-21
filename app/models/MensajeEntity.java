package models;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ln.bello10 on 21/04/2017.
 */
@Entity
@Table(name="mensajeEntity")
public class MensajeEntity extends Model {

    public static Model.Finder<Long,MensajeEntity> FINDER = new Model.Finder<>(MensajeEntity.class);

    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Mensaje")
    private Long id;

    private String mensaje;

    @ManyToMany
    @JsonBackReference
    private List<MedicoEntity> medicos;

    public MensajeEntity() {
        System.out.println("Mensaje");
        id = null;
        mensaje  = "NO_NAME";
        medicos = new ArrayList<MedicoEntity>();
    }

    public MensajeEntity(Long id, String mensaje){
        this.id=id;
        this.mensaje=mensaje;
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

    public String getMensaje(){
        return mensaje;
    }

    public void setMensaje(String mensaje){
        this.mensaje=mensaje;
    }

    public List<MedicoEntity> getMedicos() {

        return medicos;
    }

    public void setMedicos(List<MedicoEntity> medico) {

        this.medicos = medicos;
    }

}

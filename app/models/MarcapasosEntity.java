package models;

import javax.persistence.Entity;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

/**
 * Clase que representa una marcapaso medica
 * Created by Lady Pinzon on 11/02/2017.
 */
@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="marcapasosEntity")
public class MarcapasosEntity extends Model{

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Model.Finder<Long,MarcapasosEntity> FINDER = new Model.Finder<>(MarcapasosEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador de la marcapasos
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es Marcapasos
    @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "Marcapasos")
    private Long id;

    /**
     * ritmoCardiaco generado en el marcapasos
     */
    private int ritmoCardiaco;


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public MarcapasosEntity() {
        System.out.println("Marcapasos");
        id = null;
        ritmoCardiaco =0;
    }

    /**
     * Constructor con todos los atributos de la clase.
     * @param id
     * @param ritmoCardiaco
     */
    public MarcapasosEntity(Long id, Long fecha, int ritmoCardiaco) {
        System.out.println("Marcapasos");
        this.id = id;
        this.ritmoCardiaco = ritmoCardiaco;
    }

    public MarcapasosEntity(Long id) {
        this();
        setId(id);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public int getRitmoCardiaco() {

        return ritmoCardiaco;
    }

    public void setRitmoCardiaco(int ritmoCardiaco) {

        this.ritmoCardiaco = ritmoCardiaco;
    }
}

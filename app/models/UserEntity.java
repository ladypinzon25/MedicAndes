package models;

import com.avaje.ebean.Finder;
import com.avaje.ebean.Model;

import javax.persistence.*;

/**
 * Created by ln.bello10 on 06/04/2017.
 */
@Entity
//Este es el nombre de la tabla en la base de datos
@Table(name="userEntity")
public class UserEntity extends Model {

    //--------------------------------------------------------------
    //                          CONSTANTES
    //--------------------------------------------------------------

    //Permite acceso a la base de datos para hacer busquedas
    public static Finder<Long, UserEntity> FINDER = new Finder<>(UserEntity.class);

    //--------------------------------------------------------------
    //                          ATRIBUTOS
    //--------------------------------------------------------------

    /**
     * identificador del usuario
     */
    @Id
    //los id seran generados de forma secuencial y el nombre del generador es User
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "User")
    private Long id;

    /**
     * login del usuario
     */
    private String login;
    /**
     * contrasena
     */
    private String password;
    /**
     * token asignado al usuario
     */
    private String token;
    /**
     * Paciente, Medico o Cardiologo
     */
    private String permiso;


    //--------------------------------------------------------------
    //                          Constructores
    //--------------------------------------------------------------

    /**
     * Constructor vacio de la clase.
     */
    public UserEntity() {
        System.out.println("User");
        id = null;
        login = "NO NAME";
        password = "NO NAME";
        token = "NO NAME";
        permiso = "NO NAME";
    }


    public UserEntity(Long id, String login, String password, String token, String permiso) {
        System.out.println("User");
        this.id = id;
        this.login = login;
        this.password = password;
        this.token = token;
        this.permiso = permiso;

    }

    public UserEntity(Long id) {
        this();
        setId(id);
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getLogin() {

        return login;
    }

    public void setLogin(String login) {

        this.login = login;
    }

    public String getToken() {

        return token;
    }

    public void setToken(String token) {

        this.token = token;
    }

    public String getPermiso() {

        return permiso;
    }

    public void setPermiso(String permiso) {

        this.permiso = permiso;
    }
}

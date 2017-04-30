package controllers;


import models.MedicoEntity;
import models.PacienteEntity;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.*;

import java.util.List;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {


    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */


    public Result index()
    {
        MedicoEntity medico = MedicoEntity.FINDER.byId(1L);
        return ok(index.render(medico));



    }
//    public Result index2()
//    {
//        MedicoEntity medico = MedicoEntity.FINDER.byId(1L);
//        return ok(index2.render());
//    }
    public Result home()
    {
        MedicoEntity medico = MedicoEntity.FINDER.byId(1L);
        return ok(home.render(medico));
    }
    public Result pacientes()
    {
        MedicoEntity medico = MedicoEntity.FINDER.byId(1L);
        List<PacienteEntity> listaPacientes = MedicoEntity.FINDER.byId(1L).getPacientes();
        return ok(pacientes.render(medico,listaPacientes));
    }
    public Result historial(Long pId)
    {
        PacienteEntity paciente = PacienteEntity.FINDER.byId(pId);

        return ok(historial.render(paciente));
    }
    public Result marcapasos(Long pId)
    {
        PacienteEntity paciente = PacienteEntity.FINDER.byId(pId);

        return ok(marcapasos.render(paciente));
    }
    public Result mensajes(Long pId)
    {
        PacienteEntity paciente = PacienteEntity.FINDER.byId(pId);

        return ok(mensajes.render(paciente));
    }
}

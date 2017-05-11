package controllers;


import models.CitaEntity;
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
public class MobileController extends Controller {


    public Result mobileLPaciente(long id) {
        PacienteEntity paciente = PacienteEntity.FINDER.byId(id);

        return ok(consejosPaciente.render(paciente, paciente.getConsejos()));
    }

    public Result mensajes(Long pId)
    {
        PacienteEntity paciente = PacienteEntity.FINDER.byId(pId);
        MedicoEntity medico = MedicoEntity.FINDER.byId(1L);

        return ok(mensajeMobile.render(paciente, medico));
    }

    public Result mobileIndex() {
        return ok(indexMobile.render());
    }

    public Result mobilePacientes()
    {
        List<PacienteEntity> pacientes = PacienteEntity.FINDER.all();

        return ok(pacientesMobile.render(pacientes));
    }

    public Result mobileCitas(){
        List<CitaEntity> citas = CitaEntity.FINDER.all();
        return ok(citasMobile.render(citas));
    }

    public Result mobilePaciente(Long id){
        PacienteEntity paciente = PacienteEntity.FINDER.byId(id);

        return ok(mediPacienteMobile.render(paciente));
    }
}

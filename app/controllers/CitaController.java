package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.CitaEntity;
import models.HistorialEntity;
import models.MedicoEntity;
import models.PacienteEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
public class CitaController extends Controller{

    public CompletionStage<Result> getCitas()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return CitaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(citaEntities -> {return ok(toJson(citaEntities));}
                );
    }

    public CompletionStage<Result> getCita(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return CitaEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }

    public CompletionStage<Result> createCita()
    {

        JsonNode n = request().body().asJson();

        CitaEntity cita = Json.fromJson( n , CitaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    cita.save();
                    return cita;
                }
        ).thenApply(
                citas -> {
                    return ok(Json.toJson(citas));
                }
        );
    }
    public CompletionStage<Result> createCita2(Long pIdPaciente, Long idMedico)
    {

        JsonNode n = request().body().asJson();

        CitaEntity cita = Json.fromJson( n , CitaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    PacienteEntity pacienteBuscado = PacienteEntity.FINDER.byId(pIdPaciente);
                    MedicoEntity medicoBuscado = MedicoEntity.FINDER.byId(idMedico);
                    HistorialEntity historial = HistorialEntity.FINDER.byId(pIdPaciente);

                    if(pacienteBuscado== null||medicoBuscado==null)
                    {
                        return "El paciente o el medico no exiten en la base de datos";
                    }

                    cita.setMedico(medicoBuscado);
                    cita.setPaciente(pacienteBuscado);
                    cita.setHistorial(historial);
                    cita.save();
                    return cita;
                }
        ).thenApply(
                citas -> {
                    return ok(Json.toJson(citas));
                }
        );
    }

    public CompletionStage<Result> deleteCita(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    CitaEntity cita = CitaEntity.FINDER.byId(idE);
                    cita.delete();
                    return cita;
                }
        ).thenApply(
                citas -> {
                    return ok(Json.toJson(citas));
                }
        );
    }
    public CompletionStage<Result> updateCita( Long idE)
    {

        JsonNode n = request().body().asJson();
        CitaEntity m = Json.fromJson( n , CitaEntity.class ) ;
        CitaEntity antiguo = CitaEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setFecha(m.getFecha());
                    antiguo.setDiagnostico(m.getDiagnostico());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                citas -> {
                    return ok(Json.toJson(citas));
                }
        );
    }
    public CompletionStage<Result> createCitaPaciente(Long idPaciente, Long idMedico){

        JsonNode n = request().body().asJson();

        CitaEntity cita = Json.fromJson( n , CitaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    PacienteEntity paciente = PacienteEntity.FINDER.byId(idPaciente);
                    MedicoEntity medico = MedicoEntity.FINDER.byId(idMedico);
                    cita.setPaciente(paciente);
                    cita.setMedico(medico);
                    cita.setHistorial(paciente.getHistorialPaciente());
//                    paciente.getHistorialPaciente().
//                    paciente.addCita(cita);
//                    medico.addCita(cita);
                    cita.save();
//                    paciente.update();
//                    medico.update();
                    return cita;
                }
        ).thenApply(
                citas -> {
                    return ok(Json.toJson(citas));
                }
        );
    }
    public CompletionStage<Result> getCitasPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM).getCitas(); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }

    public CompletionStage<Result> getExamenesPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM).getHistorialPaciente().getExamenesHistorial(); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }
    public CompletionStage<Result> getLecturasPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM).getHistorialPaciente().getLecturasHistorial(); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }
    public CompletionStage<Result> getConsejosPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM).getConsejos(); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }
    public CompletionStage<Result> getEmergenciasPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM).getHistorialPaciente().getEmergencias(); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }

    public CompletionStage<Result> getMarcapasosPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM).getMarcapasos(); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }

    public CompletionStage<Result> getHistorialPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM).getHistorialPaciente(); } ,jdbcDispatcher)
                .thenApply(citas -> {return ok(toJson(citas));}
                );
    }

    public CompletionStage<Result> getLecturasRango( Long idPaciente, String fechaInicio, String fechaFin) {

        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;
       // String str = "01/01/2015";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        long inicio = LocalDate.parse(fechaInicio, formatter).toEpochDay();
        long fin = LocalDate.parse(fechaFin, formatter).toEpochDay();

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idPaciente).getLecturasHistorialEnPeriodoDeTiempo(inicio,fin); } ,jdbcDispatcher)
                .thenApply(pacienteEntities -> {return ok(toJson(pacienteEntities));}
                );
    }
}

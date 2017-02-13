package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.CitaEntity;
import models.MedicoEntity;
import models.PacienteEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

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
}

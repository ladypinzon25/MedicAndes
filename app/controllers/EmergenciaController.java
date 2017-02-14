package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.EmergenciaEntity;
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
public class EmergenciaController extends Controller {

    public CompletionStage<Result> getEmergencias()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return EmergenciaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(emergenciaEntities -> {return ok(toJson(emergenciaEntities));}
                );
    }

    public CompletionStage<Result> getEmergencia(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return EmergenciaEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(emergencias -> {return ok(toJson(emergencias));}
                );
    }

    public CompletionStage<Result> createEmergencia()
    {

        JsonNode n = request().body().asJson();

        EmergenciaEntity emergencia = Json.fromJson( n , EmergenciaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    emergencia.save();
                    return emergencia;
                }
        ).thenApply(
                emergencias -> {
                    return ok(Json.toJson(emergencias));
                }
        );
    }

    public CompletionStage<Result> deleteEmergencia(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    EmergenciaEntity emergencia = EmergenciaEntity.FINDER.byId(idE);
                    emergencia.delete();
                    return emergencia;
                }
        ).thenApply(
                emergencias -> {
                    return ok(Json.toJson(emergencias));
                }
        );
    }
    public CompletionStage<Result> updateEmergencia( Long idE)
    {

        JsonNode n = request().body().asJson();
        EmergenciaEntity m = Json.fromJson( n , EmergenciaEntity.class ) ;
        EmergenciaEntity antiguo = EmergenciaEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setFecha(m.getFecha());
                    antiguo.setEstado(m.getEstado());
                    antiguo.setUbicacion(m.getUbicacion());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                emergencias -> {
                    return ok(Json.toJson(emergencias));
                }
        );
    }

    public CompletionStage<Result> createEmergenciaPaciente(Long idPaciente){

        JsonNode n = request().body().asJson();

        EmergenciaEntity emergencia = Json.fromJson( n , EmergenciaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    PacienteEntity paciente = PacienteEntity.FINDER.byId(idPaciente);
             //       emergencia.setPaciente(paciente);
                    emergencia.setHistorial(paciente.getHistorialPaciente());

                    paciente.getHistorialPaciente().addEmergencia(emergencia);
                    emergencia.save();
                    paciente.getHistorialPaciente().update();
                    return emergencia;
                }
        ).thenApply(
                emergencias -> {
                    return ok(Json.toJson(emergencias));
                }
        );
    }
}

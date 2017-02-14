package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.CitaEntity;
import models.HistorialEntity;
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
public class PacienteController extends Controller{

    public CompletionStage<Result> getPacientes()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(pacienteEntities -> {return ok(toJson(pacienteEntities));}
                );
    }

    public CompletionStage<Result> getPaciente(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return PacienteEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(pacientes -> {return ok(toJson(pacientes));}
                );
    }

    public CompletionStage<Result> createPaciente()
    {
        JsonNode n = request().body().asJson();

        PacienteEntity paciente = Json.fromJson( n , PacienteEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    HistorialEntity nuevo = new HistorialEntity();
                    nuevo.setId(paciente.getId());
                    paciente.setHistorialPaciente(nuevo);
                    nuevo.save();
                    paciente.save();
                    return paciente;
                }
        ).thenApply(
                pacientes -> {
                    return ok(Json.toJson(pacientes));
                }
        );
    }

    public CompletionStage<Result> deletePaciente(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    PacienteEntity paciente = PacienteEntity.FINDER.byId(idE);
                    
                    paciente.delete();
                    return paciente;
                }
        ).thenApply(
                pacientes -> {
                    return ok(Json.toJson(pacientes));
                }
        );
    }
    public CompletionStage<Result> updatePaciente( Long idE) {

        JsonNode n = request().body().asJson();
        PacienteEntity m = Json.fromJson(n, PacienteEntity.class);
        PacienteEntity antiguo = PacienteEntity.FINDER.byId(idE);

            return CompletableFuture.supplyAsync(
                    () -> {
                        antiguo.setId(m.getId());
                        antiguo.setNombre(m.getNombre());
                        antiguo.setGrupoSanguineo(m.getGrupoSanguineo());

                        antiguo.update();
                        return antiguo;
                    }
            ).thenApply(
                    pacientes -> {
                        return ok(Json.toJson(pacientes));
                    }
            );


    }

}

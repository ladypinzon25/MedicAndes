package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.HistorialEntity;
import models.LecturaEntity;
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
public class LecturaController extends Controller {

    public CompletionStage<Result> getLecturas()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return LecturaEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(lecturaEntities -> {return ok(toJson(lecturaEntities));}
                );
    }

    public CompletionStage<Result> getLectura(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return LecturaEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(lecturas -> {return ok(toJson(lecturas));}
                );
    }

    public CompletionStage<Result> createLectura()
    {

        JsonNode n = request().body().asJson();

        LecturaEntity lectura = Json.fromJson( n , LecturaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    lectura.save();
                    return lectura;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }

    public CompletionStage<Result> deleteLectura(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    LecturaEntity lectura = LecturaEntity.FINDER.byId(idE);
                    lectura.delete();
                    return lectura;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }
    public CompletionStage<Result> updateLectura( Long idE)
    {

        JsonNode n = request().body().asJson();
        LecturaEntity m = Json.fromJson( n , LecturaEntity.class ) ;
        LecturaEntity antiguo = LecturaEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setFecha(m.getFecha());
                    antiguo.setFrecuenciaCardiaca(m.getFrecuenciaCardiaca());
                    antiguo.setPresionSanguinea(m.getPresionSanguinea());
                    antiguo.setNivelEstres(m.getNivelEstres());
                    antiguo.setEstado(m.getEstado());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }

    public CompletionStage<Result> createLecturaPaciente(Long idPaciente){

        JsonNode n = request().body().asJson();

        LecturaEntity lectura = Json.fromJson( n , LecturaEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    PacienteEntity paciente = PacienteEntity.FINDER.byId(idPaciente);
                    //lectura.setPaciente(paciente);
                    lectura.setHistorial(paciente.getHistorialPaciente());

                    paciente.getHistorialPaciente().addLectura(lectura);
                    lectura.save();
                    paciente.getHistorialPaciente().update();
                    return lectura;
                }
        ).thenApply(
                lecturas -> {
                    return ok(Json.toJson(lecturas));
                }
        );
    }
}

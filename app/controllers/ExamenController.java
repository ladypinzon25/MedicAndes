package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.ExamenEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
public class ExamenController extends Controller {

    public CompletionStage<Result> getExamenes()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return ExamenEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(examenEntities -> {return ok(toJson(examenEntities));}
                );
    }

    public CompletionStage<Result> getExamen(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return ExamenEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(examenes -> {return ok(toJson(examenes));}
                );
    }

    public CompletionStage<Result> createExamen()
    {

        JsonNode n = request().body().asJson();

        ExamenEntity examen = Json.fromJson( n , ExamenEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    examen.save();
                    return examen;
                }
        ).thenApply(
                examenes -> {
                    return ok(Json.toJson(examenes));
                }
        );
    }

    public CompletionStage<Result> deleteExamen(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    ExamenEntity examen = ExamenEntity.FINDER.byId(idE);
                    examen.delete();
                    return examen;
                }
        ).thenApply(
                examenes -> {
                    return ok(Json.toJson(examenes));
                }
        );
    }
    public CompletionStage<Result> updateExamen( Long idE)
    {

        JsonNode n = request().body().asJson();
        ExamenEntity m = Json.fromJson( n , ExamenEntity.class ) ;
        ExamenEntity antiguo = ExamenEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setFecha(m.getFecha());
                    antiguo.setResultado(m.getResultado());
                    antiguo.setTipo(m.getTipo());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                examenes -> {
                    return ok(Json.toJson(examenes));
                }
        );
    }
}

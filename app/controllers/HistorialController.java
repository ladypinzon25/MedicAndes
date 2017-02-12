package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.HistorialEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
public class HistorialController extends Controller {

    public CompletionStage<Result> getHistoriales()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return HistorialEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(historialEntities -> {return ok(toJson(historialEntities));}
                );
    }

    public CompletionStage<Result> getHistorial(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return HistorialEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(historiales -> {return ok(toJson(historiales));}
                );
    }

    public CompletionStage<Result> createHistorial()
    {

        JsonNode n = request().body().asJson();

        HistorialEntity historial = Json.fromJson( n , HistorialEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    historial.save();
                    return historial;
                }
        ).thenApply(
                historiales -> {
                    return ok(Json.toJson(historiales));
                }
        );
    }

    public CompletionStage<Result> deleteHistorial(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    HistorialEntity historial = HistorialEntity.FINDER.byId(idE);
                    historial.delete();
                    return historial;
                }
        ).thenApply(
                historiales -> {
                    return ok(Json.toJson(historiales));
                }
        );
    }
    public CompletionStage<Result> updateHistorial( Long idE)
    {

        JsonNode n = request().body().asJson();
        HistorialEntity m = Json.fromJson( n , HistorialEntity.class ) ;
        HistorialEntity antiguo = HistorialEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setAlergias(m.getAlergias());
                    antiguo.setEnfermedades(m.getEnfermedades());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                historiales -> {
                    return ok(Json.toJson(historiales));
                }
        );
    }
}

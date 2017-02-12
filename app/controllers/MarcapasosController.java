package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.MarcapasosEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
public class MarcapasosController extends Controller {

    public CompletionStage<Result> getMarcapasoss()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return MarcapasosEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(marcapasosEntities -> {return ok(toJson(marcapasosEntities));}
                );
    }

    public CompletionStage<Result> getMarcapasos(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return MarcapasosEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(marcapasoss -> {return ok(toJson(marcapasoss));}
                );
    }

    public CompletionStage<Result> createMarcapasos()
    {

        JsonNode n = request().body().asJson();

        MarcapasosEntity marcapasos = Json.fromJson( n , MarcapasosEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    marcapasos.save();
                    return marcapasos;
                }
        ).thenApply(
                marcapasoss -> {
                    return ok(Json.toJson(marcapasoss));
                }
        );
    }

    public CompletionStage<Result> deleteMarcapasos(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    MarcapasosEntity marcapasos = MarcapasosEntity.FINDER.byId(idE);
                    marcapasos.delete();
                    return marcapasos;
                }
        ).thenApply(
                marcapasoss -> {
                    return ok(Json.toJson(marcapasoss));
                }
        );
    }
    public CompletionStage<Result> updateMarcapasos( Long idE)
    {

        JsonNode n = request().body().asJson();
        MarcapasosEntity m = Json.fromJson( n , MarcapasosEntity.class ) ;
        MarcapasosEntity antiguo = MarcapasosEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setRitmoCardiaco(m.getRitmoCardiaco());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                marcapasoss -> {
                    return ok(Json.toJson(marcapasoss));
                }
        );
    }
}

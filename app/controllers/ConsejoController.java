package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.ConsejoEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
public class ConsejoController extends Controller {

    public CompletionStage<Result> getConsejos()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return ConsejoEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(consejoEntities -> {return ok(toJson(consejoEntities));}
                );
    }

    public CompletionStage<Result> getConsejo(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return ConsejoEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(consejos -> {return ok(toJson(consejos));}
                );
    }

    public CompletionStage<Result> createConsejo()
    {

        JsonNode n = request().body().asJson();

        ConsejoEntity consejo = Json.fromJson( n , ConsejoEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    consejo.save();
                    return consejo;
                }
        ).thenApply(
                consejos -> {
                    return ok(Json.toJson(consejos));
                }
        );
    }

    public CompletionStage<Result> deleteConsejo(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    ConsejoEntity consejo = ConsejoEntity.FINDER.byId(idE);
                    consejo.delete();
                    return consejo;
                }
        ).thenApply(
                consejos -> {
                    return ok(Json.toJson(consejos));
                }
        );
    }
    public CompletionStage<Result> updateConsejo( Long idE)
    {

        JsonNode n = request().body().asJson();
        ConsejoEntity m = Json.fromJson( n , ConsejoEntity.class ) ;
        ConsejoEntity antiguo = ConsejoEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setFecha(m.getFecha());
                    antiguo.setMensaje(m.getMensaje());
                    antiguo.setActividadFisica(m.getActividadFisica());
                    antiguo.setDieta(m.getDieta());
                    antiguo.setMedicamentos(m.getMedicamentos());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                consejos -> {
                    return ok(Json.toJson(consejos));
                }
        );
    }
}

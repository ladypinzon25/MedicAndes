package controllers;

import akka.dispatch.MessageDispatcher;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.MedicoEntity;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static play.libs.Json.toJson;

/**
 * Created by Lady Pinzon on 11/02/2017.
 */
public class MedicoController extends Controller{

    public CompletionStage<Result> getMedicos()
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return MedicoEntity.FINDER.all(); } ,jdbcDispatcher)
                .thenApply(medicoEntities -> {return ok(toJson(medicoEntities));}
                );
    }

    public CompletionStage<Result> getMedico(Long idM)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.
                supplyAsync(() -> { return MedicoEntity.FINDER.byId(idM); } ,jdbcDispatcher)
                .thenApply(medicos -> {return ok(toJson(medicos));}
                );
    }

    public CompletionStage<Result> createMedico()
    {

        JsonNode n = request().body().asJson();

        MedicoEntity medico = Json.fromJson( n , MedicoEntity.class ) ;
        return CompletableFuture.supplyAsync(
                ()->{
                    medico.save();
                    return medico;
                }
        ).thenApply(
                medicos -> {
                    return ok(Json.toJson(medicos));
                }
        );
    }

    public CompletionStage<Result> deleteMedico(Long idE)
    {


        return CompletableFuture.supplyAsync(
                ()->{
                    MedicoEntity medico = MedicoEntity.FINDER.byId(idE);
                    medico.delete();
                    return medico;
                }
        ).thenApply(
                medicos -> {
                    return ok(Json.toJson(medicos));
                }
        );
    }
    public CompletionStage<Result> updateMedico( Long idE)
    {

        JsonNode n = request().body().asJson();
        MedicoEntity m = Json.fromJson( n , MedicoEntity.class ) ;
        MedicoEntity antiguo = MedicoEntity.FINDER.byId(idE);

        return CompletableFuture.supplyAsync(
                ()->{
                    antiguo.setId(m.getId());
                    antiguo.setNombre(m.getNombre());
                    antiguo.setEspecialidad(m.getEspecialidad());

                    antiguo.update();
                    return antiguo;
                }
        ).thenApply(
                medicos -> {
                    return ok(Json.toJson(medicos));
                }
        );
    }

    /**
     * Le agrega a un tutor una materia que puede dictar.
     * @param idMedico Medico a quien se le agrega la materia
     * @param idMateria Materia que el medico puede dictar
     * @return
     */
    /**
    public CompletionStage<Result> agregarMateriaAMedico(Long idMedico, Long idMateria)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    MedicoEntity medico = MedicoEntity.FINDER.byId(idMedico);
                    MateriaEntity materia = MateriaEntity.FINDER.byId(idMateria);
                    medico.addMateria(materia);
                    materia.addTutor(medico);
                    medico.update();
                    return medico;
                }
        ).thenApply(
                CampoEntity -> {
                    return ok(Json.toJson(CampoEntity));
                }
        );
    }
*/
    /**
     * Agrega una monitoria a un tutor, es decir este sera el encargado de dictarla
     * @param idMedico tutor quien dictara la monitoria.
     * @param idMonitoria Monitoria que dictara, debe haber sido creada previamente.
     * @return
     */
    /**
    public CompletionStage<Result> agregarMonitoriaDictarAMedico(Long idMedico, Long idMonitoria)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    MedicoEntity medico = MedicoEntity.FINDER.byId(idMedico);
                    MonitoriaEntity monitoria = MonitoriaEntity.FINDER.byId(idMonitoria);
                    medico.addMonitoriaDictada(monitoria);
                    monitoria.setTutor(medico);
                    medico.update();
                    monitoria.update();
                    return medico;
                }
        ).thenApply(
                CampoEntity -> {
                    return ok(Json.toJson(CampoEntity));
                }
        );
    }
*/
    /**
     * Se le agrega una monitoria a un medico para que la tome.
     * @param idMedico Medico quien tomara la tutoria.
     * @param idMonitoria Monitoria que sera tomada.
     * @return
     */
    /**
    public CompletionStage<Result> agregarMonitoriaTomarAMedico(Long idMedico, Long idMonitoria)
    {
        MessageDispatcher jdbcDispatcher = AkkaDispatcher.jdbcDispatcher;

        return CompletableFuture.supplyAsync(
                ()->{
                    MedicoEntity medico = MedicoEntity.FINDER.byId(idMedico);
                    MonitoriaEntity monitoria = MonitoriaEntity.FINDER.byId(idMonitoria);
                    medico.addMonitoriaTomada(monitoria);
                    monitoria.addTutorado(medico);
                    medico.update();
                    monitoria.update();
                    return medico;
                }
        ).thenApply(
                CampoEntity -> {
                    return ok(Json.toJson(CampoEntity));
                }
        );
    }
     */
}

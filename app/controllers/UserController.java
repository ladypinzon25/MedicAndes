package controllers;

import akka.dispatch.MessageDispatcher;
import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Query;
import com.fasterxml.jackson.databind.JsonNode;
import dispatchers.AkkaDispatcher;
import models.UserEntity;
import models.RandomToken;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

import static com.avaje.ebean.Expr.eq;
import static play.libs.Json.toJson;

public class UserController extends Controller{

    public final static String PACIENTE = "paciente";
    public final static String MEDICO = "medico";
    public final static String CARDIOLOGO = "cardiologo";
    public final static String REQUIRES_LOGIN = "requires login";

    public CompletionStage<Result> login() throws Exception {
        JsonNode n = request().body().asJson();
        UserEntity user = Json.fromJson( n , UserEntity.class ) ;

        Query<UserEntity> find = UserEntity.FINDER.query();
        ExpressionList<UserEntity> myQuery = find.where();

        if (user.getLogin() != null) myQuery.add(eq("login", user.getLogin()));
        if (user.getPassword() != null) myQuery.add(eq("password", user.getPassword()));

        List<UserEntity> queryResult = myQuery.findList();

        if(queryResult.size() == 1)
        {
            UserEntity userResult = queryResult.get(0);
            RandomToken tokenGenerator = new RandomToken(20);
            String newToken = tokenGenerator.nextString();
            return CompletableFuture.supplyAsync(
                    ()->{
                        userResult.setToken(newToken);

                        userResult.update();
                        return userResult;
                    }
            ).thenApply(
                    users -> {
                        return ok(Json.toJson(users));
                    }
            );
        }
        else
        {
            throw new Exception("Incorrect username or password");
        }
    }

    public static String authenticate(String token)
    {
        Query<UserEntity> find = UserEntity.FINDER.query();
        ExpressionList<UserEntity> myQuery = find.where();

        if (token != null) myQuery.add(eq("token", token));

        List<UserEntity> queryResult = myQuery.findList();

        if(queryResult.size() == 1)
        {
            UserEntity user = queryResult.get(0);
            return user.getPermiso();
        }
        else
        {
            return REQUIRES_LOGIN;
        }
    }
}

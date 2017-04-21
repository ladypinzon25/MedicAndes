package controllers;

import models.LecturaEntity;

/**
 * Created by s.martinez15 on 21/04/2017.
 */
public interface LecturaEstado
{
    boolean manejar(LecturaEntity lectura);
}

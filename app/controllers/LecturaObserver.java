package controllers;

import models.LecturaEntity;

/**
 * Created by s.martinez15 on 21/04/2017.
 */
public abstract class LecturaObserver
{
    protected LecturaEntity lectura;

    public abstract void update();

}

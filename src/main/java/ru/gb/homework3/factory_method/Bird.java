package ru.gb.homework3.factory_method;

public abstract class Bird {

    public void toFly(){
        Action action = action();
        action.toFly();

    }
    public void  toSwim(){
        Action action = action();
        action.toSwim();
    }

    public abstract Action action();
}

package ru.gb.homwork5.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class EmploymentAgency extends Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addJob(JobPost jobPosting) {
        setChanged();
        notifyObservers(jobPosting);
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Object arg) {
        for (Observer observer : observers) {
            observer.update(this, arg);
        }
    }
}


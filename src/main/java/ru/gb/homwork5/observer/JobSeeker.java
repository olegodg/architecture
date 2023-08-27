package ru.gb.homwork5.observer;


import java.util.Observable;
import java.util.Observer;

public class JobSeeker implements Observer {

    private String name;

    public JobSeeker(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable obs, Object arg) {
        if(arg instanceof JobPost) {
            JobPost jobPost = (JobPost) arg;
            System.out.println("Hi " + this.name + "! New job posted: " + jobPost.getTitle());
        }
    }
}

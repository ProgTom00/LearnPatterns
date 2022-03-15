package com.patterns.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class QueueExercises implements Observable {
    private final String name;
    private final Deque<String> exercises;
    private final List<Observer> observers;

    public QueueExercises(String name) {
        this.name = name;
        exercises = new ArrayDeque<>();
        observers = new ArrayList<>();
    }
    public void addExercise(String name) {
        exercises.add(name);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);

    }

    public String getName() {
        return name;
    }

    public Deque<String> getExercises() {
        return exercises;
    }
}

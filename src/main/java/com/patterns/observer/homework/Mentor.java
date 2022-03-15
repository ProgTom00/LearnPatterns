package com.patterns.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(QueueExercises queueExercises) {
        System.out.println(mentorName + ": New exercises in topic " + queueExercises.getName() + "\n" +
                " (total: " + queueExercises.getExercises() + "\n" + queueExercises.getExercises().size() + " exercises");
        updateCount++;

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}

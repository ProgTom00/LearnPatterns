package com.patterns.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueExercisesTestSuite {

    @Test
    public void testExercisesQueue() {
        // Given
        QueueExercises firstStudent = new FirstStudent();
        QueueExercises secondStudent = new SecondStudent();
        Mentor firstMentor = new Mentor("First Mentor");
        Mentor secondMentor = new Mentor("Second Mentor");
        firstStudent.registerObserver(firstMentor);
        secondStudent.registerObserver(secondMentor);
        // When
        firstStudent.addExercise("First exercise to execute");
        firstStudent.addExercise("Second exercise to execute");
        firstStudent.addExercise("Third exercise to execute");
        secondStudent.addExercise("Fourth exercise to execute");
        secondStudent.addExercise("Fifth exercise to execute");
        // Then
        assertEquals(3, firstMentor.getUpdateCount());
        assertEquals(2, secondMentor.getUpdateCount());

    }
}

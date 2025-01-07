package com.example.sms;

import javax.persistence.*;

@Entity
public class Marks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int score;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}

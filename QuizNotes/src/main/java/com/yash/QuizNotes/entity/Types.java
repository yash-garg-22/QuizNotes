package com.yash.QuizNotes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class Types {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String type;

    @ManyToOne
    @JsonIgnore
    private Question question;

    public Types() {
    }

    public Types(String option, Question question) {
        this.type = option;
        this.question = question;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Question getQuestion() {
        return question;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}

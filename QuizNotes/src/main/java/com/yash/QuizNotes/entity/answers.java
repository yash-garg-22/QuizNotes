package com.yash.QuizNotes.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
public class answers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String answer;
    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    Javascript javascript;

    public answers() {
    }

    public answers(String answer, Javascript javascript) {
        this.answer = answer;
        this.javascript = javascript;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Javascript getJavascript() {
        return javascript;
    }

    public void setJavascript(Javascript javascript) {
        this.javascript = javascript;
    }
}

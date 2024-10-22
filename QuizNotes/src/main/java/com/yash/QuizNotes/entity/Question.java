package com.yash.QuizNotes.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String question;
    private String answer;

    @OneToMany(mappedBy = "question",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Types> option;

    public Question() {
    }

    public Question(String question, String answer, List<Types> option) {
        this.question = question;
        this.answer = answer;
        this.option = option;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public List<Types> getOption() {
        return option;
    }

    public void setOption(List<Types> option) {
        this.option = option;
    }
}

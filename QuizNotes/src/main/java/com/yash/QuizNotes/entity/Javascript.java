package com.yash.QuizNotes.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Javascript {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String question;
    String answer;
    @OneToMany(mappedBy = "javascript",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    List<answers> ans;

    public Javascript() {
    }

    public Javascript(String question, String answer, List<answers> ans) {
        this.question = question;
        this.answer = answer;
        this.ans = ans;
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

    public List<answers> getAns() {
        return ans;
    }

    public void setAns(List<answers> ans) {
        this.ans = ans;
    }
}
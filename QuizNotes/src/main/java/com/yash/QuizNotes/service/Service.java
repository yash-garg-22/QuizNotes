package com.yash.QuizNotes.service;

import com.yash.QuizNotes.entity.Question;
import com.yash.QuizNotes.entity.Types;
import com.yash.QuizNotes.repo.questionRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    questionRepo repo;

    public void saveQuestion(Question question){
        String ques = question.getQuestion();
        String ans = question.getAnswer();
        List<Types> option = question.getOption();


        Question q = new Question();
        q.setQuestion(ques);
        q.setAnswer(ans);

        List<Types> ls = new ArrayList<>();

        for(Types t: option){
            Types type = new Types();
            type.setType(t.getType());
            type.setQuestion(q);
            ls.add(type);
        }

        q.setOption(ls);

        repo.save(q);
    }

    public List<Question> getAll(){
        List<Question> all = repo.findAll();
        return all;
    }
}

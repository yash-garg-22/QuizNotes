package com.yash.QuizNotes.service;

import com.yash.QuizNotes.entity.Javascript;
import com.yash.QuizNotes.entity.answers;
import com.yash.QuizNotes.repo.Scriptrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Scriptservice {

    @Autowired
    Scriptrepo repo;

    public void add(Javascript js){
        String ques = js.getQuestion();
        String ans = js.getAnswer();

        Javascript t = new Javascript();
        t.setQuestion(ques);
        t.setAnswer(ans);

        List<answers> lsans = js.getAns();
        List<answers> store = new ArrayList<>();

        for(answers temp: lsans){
            String answer = temp.getAnswer();
            answers a = new answers();
            a.setAnswer(answer);
            a.setJavascript(t);

            store.add(a);
        }
        t.setAns(store);

        repo.save(t);
    }

    public List<Javascript> getAlljs(){
        return repo.findAll();
    }
}

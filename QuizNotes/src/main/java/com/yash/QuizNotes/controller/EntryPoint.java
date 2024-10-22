package com.yash.QuizNotes.controller;

import com.yash.QuizNotes.entity.Javascript;
import com.yash.QuizNotes.entity.Question;
import com.yash.QuizNotes.entity.Registration;
import com.yash.QuizNotes.service.Registerservice;
import com.yash.QuizNotes.service.Scriptservice;
import com.yash.QuizNotes.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin("*")
public class EntryPoint {

    @Autowired
    Service service;

    @Autowired
    Scriptservice script;

    @Autowired
    Registerservice registerservice;

    @PostMapping("/add")
    public void getQuestion(@RequestBody List<Question> questionList){
        for(Question t: questionList){
            service.saveQuestion(t);
        }
    }

    @GetMapping("/Java/all")
    public List<Question> getAll(){
        return service.getAll();
    }

    @PostMapping("/add_js")
    public void getJavascriptQuestion(@RequestBody List<Javascript> questionList){
        for(Javascript t: questionList){
            script.add(t);
        }
    }

    @GetMapping("/getAllJs")
    public List<Javascript> getAllJs(){
        return script.getAlljs();
    }

    @PostMapping("/register_details")
    public Boolean register(@RequestBody Registration data){
        return registerservice.setRegister(data);
    }

    @PostMapping("/getRegisterDetails")
    public Boolean getRegister(@RequestBody Registration data){
        return registerservice.getRegister(data);
    }

}
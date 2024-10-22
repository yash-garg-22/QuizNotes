package com.yash.QuizNotes.service;

import com.yash.QuizNotes.entity.Registration;
import com.yash.QuizNotes.repo.Registerrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Registerservice {
    @Autowired
    Registerrepo register;

    public Boolean setRegister(Registration data){
        Registration byUsername = register.findByUsername(data.getUsername());
        if(byUsername == null){
            register.save(data);
            return true;
        }

        return false;
    }

    public Boolean getRegister(Registration data){
        Registration byUsernameAndPass = register.findByUsernameAndPassword(data.getUsername(), data.getPassword());
        return byUsernameAndPass != null;
    }
}

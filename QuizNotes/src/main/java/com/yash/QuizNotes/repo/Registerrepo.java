package com.yash.QuizNotes.repo;

import com.yash.QuizNotes.entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Registerrepo extends JpaRepository<Registration,Integer> {
     Registration findByUsername(String username);
     Registration findByUsernameAndPassword(String username,String password);
}

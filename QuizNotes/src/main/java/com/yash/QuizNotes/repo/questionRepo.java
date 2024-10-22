package com.yash.QuizNotes.repo;

import com.yash.QuizNotes.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface questionRepo extends JpaRepository<Question,Integer> {
}

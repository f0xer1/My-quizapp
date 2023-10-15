package com.foxer.quizapp.controller;

import com.foxer.quizapp.model.Question;
import com.foxer.quizapp.model.QuestionWrapper;
import com.foxer.quizapp.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("quiz")
public class QuizController {
    @Autowired
    QuizService quizService;
    @PostMapping("create")
    public ResponseEntity<String> createQuiz(@RequestParam String category,
                                             @RequestParam int numQ,
                                             @RequestParam String title){
        return quizService.createQuiz(category, numQ,title);

    }
    @GetMapping("get/{id}")
    public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(@PathVariable Integer id){
       return quizService.getQuizQuestion(id);
    }
}

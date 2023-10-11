package com.foxer.quizapp;

import com.foxer.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {
    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestion")
    public List<Question>  getAllQuestion(){
        return questionService.getAllQuestion();
    }
    @GetMapping("category/{category}")
    public List<Question>  getQuestionByCatogory(@PathVariable String category){
        return questionService.getQuestionByCatogory(category);
    }
    @PostMapping("add")
    public String addQuestion(@RequestBody Question question ){
        return questionService.addQuestion(question);
    }
}

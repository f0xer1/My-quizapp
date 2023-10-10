package com.foxer.quizapp.service;

import com.foxer.quizapp.Question;
import com.foxer.quizapp.dao.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionDao questionDao;
    public List<Question>  getAllQuestion() {
      return questionDao.findAll();
    }
}

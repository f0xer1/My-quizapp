package com.foxer.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "question")
@Data
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "questionTitle")
    private String questionTitle;
    @Column(name = "option1")
    private String option1;
    @Column(name = "option2")
    private String option2;
    @Column(name = "option3")
    private String option3;
    @Column(name = "option4")
    private String option4;
    @Column(name = "rightAnswer")
    private String rightAnswer;
    @Column(name = "difficultylavel")
    private String difficultylavel;
    @Column(name = "category")
    private String category;
}

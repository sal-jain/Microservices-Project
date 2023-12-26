package com.question.QuestionService.service;

import com.question.QuestionService.entity.Question;

import java.util.List;

public interface QuestionService {

    Question create(Question question);
    List<Question> getAll();
    Question getOne(Long id);

    List<Question> getQuestionsOfQuiz(Long quizId);
}
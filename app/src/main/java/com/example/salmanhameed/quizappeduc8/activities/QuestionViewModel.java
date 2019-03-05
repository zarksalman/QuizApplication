package com.example.salmanhameed.quizappeduc8.activities;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.support.annotation.NonNull;

import com.example.salmanhameed.quizappeduc8.activities.entites.Question;
import com.example.salmanhameed.quizappeduc8.activities.repository.QuizRepository;

import java.util.List;

public class QuestionViewModel extends AndroidViewModel {

    private QuizRepository repository;

    public QuestionViewModel(@NonNull Application application) {
        super(application);
        repository = QuizRepository.getInstance();
    }

    void insertQuestion(Question question) {
        repository.insertQuestions(question);
    }

    public LiveData<List<Question>> getAllQuestions() {
        return repository.getAllQuestions();
    }
}

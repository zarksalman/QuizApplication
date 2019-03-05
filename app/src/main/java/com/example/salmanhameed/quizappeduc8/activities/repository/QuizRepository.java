package com.example.salmanhameed.quizappeduc8.activities.repository;

import android.app.Application;
import android.arch.lifecycle.LiveData;
import android.content.Context;
import android.os.AsyncTask;

import com.example.salmanhameed.quizappeduc8.activities.QuizApp;
import com.example.salmanhameed.quizappeduc8.activities.dao.QuestionDao;
import com.example.salmanhameed.quizappeduc8.activities.database.QuizDatabase;
import com.example.salmanhameed.quizappeduc8.activities.entites.Question;

import java.util.List;

public class QuizRepository {

    static QuizRepository quizRepository;
    QuestionDao questionDao;


    public QuizRepository(Context context) {
        QuizDatabase quizDatabase = QuizDatabase.getInstance(context);
        questionDao = quizDatabase.questionDao();
    }

    public static QuizRepository getInstance() {
        if (quizRepository == null)
            quizRepository = new QuizRepository(QuizApp.mContext);

        return quizRepository;
    }

    public void insertQuestions(Question question) {
        questionDao.insertQuestion(question);
    }

    public LiveData<List<Question>> getAllQuestions() {
        return questionDao.getAllQuestions();
    }
}

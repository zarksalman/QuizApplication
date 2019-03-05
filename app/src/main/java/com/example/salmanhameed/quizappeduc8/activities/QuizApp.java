package com.example.salmanhameed.quizappeduc8.activities;

import android.app.Application;
import android.content.Context;

import com.example.salmanhameed.quizappeduc8.activities.database.QuizDatabase;
import com.example.salmanhameed.quizappeduc8.activities.entites.Question;

import java.util.ArrayList;
import java.util.List;

public class QuizApp extends Application {
    public static Context mContext;
    List<Question> questionList = new ArrayList<>();


    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    void insertDummyQuestions() {
        questionList.add(new Question("Sum of 2+2 = ?", "4", "3", "6", 1));
        questionList.add(new Question("Sum of 2+1 = ?", "4", "3", "6", 2));
        questionList.add(new Question("Sum of 2+0 = ?", "4", "3", "2", 3));
        questionList.add(new Question("Sum of 2+4 = ?", "4", "3", "6", 3));
        questionList.add(new Question("Sum of 5+5 = ?", "10", "13", "11", 1));

    }
}

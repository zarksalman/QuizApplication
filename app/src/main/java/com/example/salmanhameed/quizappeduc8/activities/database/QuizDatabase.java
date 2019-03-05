package com.example.salmanhameed.quizappeduc8.activities.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.salmanhameed.quizappeduc8.activities.dao.QuestionDao;
import com.example.salmanhameed.quizappeduc8.activities.entites.Question;

@Database(entities = {Question.class}, version = 1)
public abstract class QuizDatabase extends RoomDatabase {

    static QuizDatabase INSTANCE;
    private static String DATABASE_NAME = "Quiz_Database";

    public static QuizDatabase getInstance(Context context) {
        if (INSTANCE == null) {

            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), QuizDatabase.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    public abstract QuestionDao questionDao();
}

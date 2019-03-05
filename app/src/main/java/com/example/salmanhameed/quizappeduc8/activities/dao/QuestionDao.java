package com.example.salmanhameed.quizappeduc8.activities.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.salmanhameed.quizappeduc8.activities.entites.Question;

import java.util.List;

@Dao
public interface QuestionDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertQuestion(Question question);

    @Query("Select * from question_table")
    LiveData<List<Question>> getAllQuestions();
}

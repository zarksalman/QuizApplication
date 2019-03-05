package com.example.salmanhameed.quizappeduc8.activities.entites;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "question_table")
public class Question {


    @PrimaryKey(autoGenerate = true)
    int question_id;

    String question;
    String option_1;
    String option_2;
    String option_3;
    Integer correct_option;

    public Question(String question, String option_1, String option_2, String option_3, Integer correct_option) {
        this.question = question;
        this.option_1 = option_1;
        this.option_2 = option_2;
        this.option_3 = option_3;
        this.correct_option = correct_option;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption_1() {
        return option_1;
    }

    public String getOption_2() {
        return option_2;
    }

    public String getOption_3() {
        return option_3;
    }

    public Integer getCorrect_option() {
        return correct_option;
    }
}

package com.example.week01;

public class Course {
    // title, tutor, days 가 Course 라는 맥락 아래에서 의미가 분명히 드러납니다.
    public String title;
    public String tutor;
    public int days;

    public String getTitle() {
        return title;
    }

    public String getTutor() {
        return tutor;
    }

    public int getDays() {
        return days;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", tutor='" + tutor + '\'' +
                ", days=" + days +
                '}';
    }
}
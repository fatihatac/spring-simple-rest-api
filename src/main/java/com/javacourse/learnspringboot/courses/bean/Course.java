package com.javacourse.learnspringboot.courses.bean;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import org.springframework.data.annotation.Id;
import jakarta.persistence.Id;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

//    @Column(name = "course_name")
    private String name;
    private String author;

    public Course(long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }
    public Course(){

    }

    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

package com.example.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String author;
    private LocalDate publishDate;
    // Constructor

    public Book() {}



    // Getters and Setters

    public Long getId() {

        return id;

    }



    public void setId(Long id) {

        this.id = id;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public String getAuthor() {

        return author;

    }



    public void setAuthor(String author) {

        this.author = author;

    }



    public LocalDate getPublishDate() {

        return publishDate;

    }



    public void setPublishDate(LocalDate publishDate) {

        this.publishDate = publishDate;

    }
}
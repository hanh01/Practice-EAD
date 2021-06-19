package com.example.dohonghanh.entity;

import javax.persistence.*;

@Entity
@Table(name = "details")
public class BookDetailsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "publisherid")
    private int publisherid;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @ManyToOne()
    @JoinColumn(name = "publisherid", insertable = false, updatable = false)
    private PublisherCatalogsEntity publisher;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublisherid() {
        return publisherid;
    }

    public void setPublisherid(int publisherid) {
        this.publisherid = publisherid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public PublisherCatalogsEntity getPublisher() {
        return publisher;
    }

    public void setPublisher(PublisherCatalogsEntity publisher) {
        this.publisher = publisher;
    }
}

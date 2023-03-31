package com.noor.entity;

import lombok.*;

import javax.persistence.*;


@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int cid;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY,targetEntity = Instructor.class)
    @JoinColumn(name = "instructor_id",referencedColumnName = "id")
    private Instructor instructor;

    public Course() {

    }

    public Course(String title) {
        this.title = title;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    @Override
    public String toString() {
        return "Course [id=" + cid + ", title=" + title + "]";
    }
}
package com.example.springbootappdemo;

import jakarta.persistence.*;

@Entity
@Table(name = "COURSE")
public class Course {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    @Column(name = "NAME")
    private String nombre;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "RATING")
    private String rating;

    @Column(name = "DESCRIPTION")
    private String description;

    public Course(Long id, String nombre, String category, String rating, String description) {
        this.id = id;
        this.nombre = nombre;
        this.category = category;
        this.rating = rating;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", category='" + category + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

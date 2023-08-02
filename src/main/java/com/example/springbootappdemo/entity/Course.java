package com.example.springbootappdemo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "COURSES")
public class Course {
    @Id
    @Column(name = "ID")
    @SequenceGenerator(name = "Course_sequence",sequenceName = "MY_SEQUENCE",allocationSize = 1)//con esta estrategia se delega
    //la generacion de la secuenca a la secuencia creada en base de datos
    //sequenceName es el nombre de la secuencia en base de datos
    //name: el nombre que se quiera proporcionar a la secuencia y que es referenciado por generator en la sig. anotacion
    //allocationSize: el valor que incrementara la secuencia, no puede ser negativo, default: 50
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Course_sequence")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CATEGORY")
    private String category;

    @Column(name = "RATING")
    private int rating;

    @Column(name = "DESCRIPTION")
    private String description;

    public Course(String nombre, String category, int rating, String description) {
        this.name = nombre;
        this.category = category;
        this.rating = rating;
        this.description = description;
    }

    public Course(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String nombre) {
        this.name = nombre;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
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
                ", nombre='" + name + '\'' +
                ", category='" + category + '\'' +
                ", rating='" + rating + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

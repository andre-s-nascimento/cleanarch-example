package com.example.cleanarch.app.adapters.database.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "animal")
public class AnimalDsRequestModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    @Column(name = "birth_date")
    private LocalDate birthDate;
    private String breed;
    private String color;
    private String kind;

}

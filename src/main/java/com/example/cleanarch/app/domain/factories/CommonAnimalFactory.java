package com.example.cleanarch.app.domain.factories;

import com.example.cleanarch.app.domain.entities.Animal;
import com.example.cleanarch.app.domain.entities.CommonAnimal;

import java.time.LocalDate;

public class CommonAnimalFactory implements AnimalFactory {

    @Override
    public Animal create(String name, LocalDate birthDate, String breed, String color, String kind) throws Exception {
        return new CommonAnimal(name, birthDate, breed, color, kind);
    }

}

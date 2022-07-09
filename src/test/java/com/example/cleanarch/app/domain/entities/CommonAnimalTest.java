package com.example.cleanarch.app.domain.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class CommonAnimalTest {

    @Test
    public void createNewAnimalRightWay(){
        Assertions.assertDoesNotThrow(() -> new CommonAnimal("rex", LocalDate.now(), "pitbull", "black", "dog"));
    }

    @Test
    public void createNewAnimalWithInvalidBirthDate(){
        var birthDate = LocalDate.now().plusDays(1);
        Assertions.assertThrows(Exception.class, () -> new CommonAnimal("rex", birthDate, "pitbull", "black", "dog"));
    }

}

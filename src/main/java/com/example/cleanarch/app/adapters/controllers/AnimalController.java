package com.example.cleanarch.app.adapters.controllers;

import com.example.cleanarch.app.adapters.controllers.request.AnimalRequestModel;
import com.example.cleanarch.app.domain.usecases.AnimalInputBoundary;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/animals")
public class AnimalController {

    private final AnimalInputBoundary inputBoundary;

    public AnimalController(AnimalInputBoundary inputBoundary) {
        this.inputBoundary = inputBoundary;
    }

    @PostMapping
    public ResponseEntity<?> createAnimal(@RequestBody AnimalRequestModel animalRequestModel){
        //change to created
        return ResponseEntity.ok(inputBoundary.create(animalRequestModel));
    }

}

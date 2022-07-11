package com.example.cleanarch.app.adapters.database.repository;

import com.example.cleanarch.app.adapters.database.model.AnimalDsRequestModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalRepository extends JpaRepository<Integer, AnimalDsRequestModel> {

}

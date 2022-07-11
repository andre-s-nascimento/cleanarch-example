package com.example.cleanarch.app.domain.gateway;

import com.example.cleanarch.app.adapters.database.model.AnimalDsRequestModel;

public interface AnimalRegisterDsGateway {
    boolean existsByName(String name);
    void save(AnimalDsRequestModel requestModel);
}

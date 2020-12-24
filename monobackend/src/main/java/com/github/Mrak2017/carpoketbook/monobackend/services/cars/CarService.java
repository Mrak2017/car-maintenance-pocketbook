package com.github.Mrak2017.carpoketbook.monobackend.services.cars;

import com.github.Mrak2017.carpoketbook.monobackend.api.model.CarDTO;

import java.util.List;

public interface CarService {
    List<CarDTO> getCars();
}

package com.github.Mrak2017.carpoketbook.monobackend.services.cars;

import com.github.Mrak2017.carpoketbook.monobackend.api.model.CarDTO;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<CarDTO> getCars() {
        List<CarDTO> result = new ArrayList<>();

        CarDTO car1 = new CarDTO();
        car1.id(UUID.randomUUID());
        car1.title("Test car 1");
        car1.date(LocalDate.now());
        car1.description("Description for test car 1");
        result.add(car1);

        CarDTO car2 = new CarDTO();
        car2.id(UUID.randomUUID());
        car2.title("Test car 2");
        car2.date(LocalDate.now());
        car2.description("Description for test car 2");
        result.add(car2);

        return result;
    }
}

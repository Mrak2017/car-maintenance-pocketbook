package com.github.Mrak2017.carpoketbook.monobackend.rest;

import com.github.Mrak2017.carpoketbook.monobackend.api.CarsApi;
import com.github.Mrak2017.carpoketbook.monobackend.api.model.CarDTO;
import com.github.Mrak2017.carpoketbook.monobackend.services.cars.CarService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("cars")
@RestController
@CrossOrigin
public class CarsRestController implements CarsApi {

    private final CarService carService;

    public CarsRestController(CarService carService) {
        this.carService = carService;
    }

    @Override
    @GetMapping
    @ApiOperation("Returns list of cars")
    public ResponseEntity<List<CarDTO>> getCars() {
        return new ResponseEntity<>(this.carService.getCars(), HttpStatus.OK);
    }
}

package com.github.Mrak2017.carpoketbook.monobackend.rest;

import com.github.Mrak2017.carpoketbook.monobackend.api.CarsApi;
import com.github.Mrak2017.carpoketbook.monobackend.api.model.CarDTO;
import com.github.Mrak2017.carpoketbook.monobackend.services.cars.CarService;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
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
    @PreAuthorize("hasAuthority('SCOPE_CARS_DATA')")
    public ResponseEntity<List<CarDTO>> getCars() {
        return new ResponseEntity<>(this.carService.getCars(), HttpStatus.OK);
    }

    @GetMapping("/ping")
    public String ping() {
        SecurityContext context = SecurityContextHolder.getContext();
        Authentication authentication = context.getAuthentication();
        return "Scopes: " + authentication.getAuthorities();
    }
}

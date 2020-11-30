package com.github.Mrak2017.carpoketbook.monobackend.entity.car;

public enum CarModel {
    DUSTER(CarBrand.RENAULT);

    private final CarBrand brand;

    CarModel(CarBrand brand) {
        this.brand = brand;
    }

    public CarBrand getBrand() {
        return brand;
    }
}

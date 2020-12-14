package com.github.Mrak2017.carpoketbook.monobackend.entity.car;

import com.github.Mrak2017.carpoketbook.monobackend.entity.core.BaseStoredEntity;
import com.github.Mrak2017.carpoketbook.monobackend.entity.owner.Person;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "cp_car")
public class Car extends BaseStoredEntity {

    @Column(name = "government_number")
    @Size(max = 6)
    @NotNull
    private String governmentNumber;

    @Column(name = "region_code")
    @Size(max = 3)
    @NotNull
    private Integer regionCode;

    @Column
    @NotNull
    private String color;

    @Column
    @Enumerated(EnumType.STRING)
    @NotNull
    private CarModel model;

    @Column(name = "creation_year")
    @NotNull
    private Integer creationYear;

    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Person owner;
}

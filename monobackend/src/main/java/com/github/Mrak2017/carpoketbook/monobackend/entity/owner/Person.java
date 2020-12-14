package com.github.Mrak2017.carpoketbook.monobackend.entity.owner;

import com.github.Mrak2017.carpoketbook.monobackend.entity.core.BaseStoredEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "cp_person")
public class Person extends BaseStoredEntity {

    @Column(name = "first_name")
    @Size(max = 100)
    @NotNull
    private String firstName;

    @Column(name = "last_name")
    @Size(max = 100)
    @NotNull
    private String lastName;
}

package com.github.Mrak2017.carpoketbook.monobackend.entity.core;

import lombok.Data;

import java.time.LocalDateTime;

@Data
//@MappedSuperclass
public abstract class BaseStoredEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column
//    @CreationTimestamp
    private LocalDateTime insertDate;

//    @Column
//    @UpdateTimestamp
    private LocalDateTime updateDate;
}

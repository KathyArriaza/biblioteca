package com.crud.biblioteca.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Cd")
public class Cd {
    @Id
    private String id;
    private String Duracion;
    private Long AnioPublicacion;


}

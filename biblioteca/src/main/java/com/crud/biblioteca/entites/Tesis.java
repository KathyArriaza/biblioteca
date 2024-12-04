package com.crud.biblioteca.entites;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Tesis")
public class Tesis {
    @Id
    private Long id;
    private String Autor;
    private String Carrera;
    private String Asesor;
    private Long AnioPublicacion;


}

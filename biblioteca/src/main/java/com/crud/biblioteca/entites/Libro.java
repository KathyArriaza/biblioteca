package com.crud.biblioteca.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Libro")
public class Libro {
    @Id
    private Long id;
    private String Autor;
    private Long Paginas;
    private String isbn;
    private Long AnioPublicacion;
    private String Temas;

    public Libro() {
    }


}

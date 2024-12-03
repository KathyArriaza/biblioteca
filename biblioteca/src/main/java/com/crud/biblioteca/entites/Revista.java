package com.crud.biblioteca.entites;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "revista")
public class Revista {

    @Id
    private String id;
    private String Editorial;
    private Date FechaPublicacion;
    private String Periodicidad;


    @ManyToOne
    @JoinColumn(name = "id_material")
    private Material Material;


}

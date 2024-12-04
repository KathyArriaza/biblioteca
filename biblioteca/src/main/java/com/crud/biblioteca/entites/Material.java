package com.crud.biblioteca.entites;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name="Material")
public class Material {
    @Id
    private String id;
    private String titulo;
    private String Contenido;
    private String Tipo;
    private String Ubicacion;
    private String Cantidad;
    private String Disponibles;
    private Date FechaRegistro;

    @OneToMany(mappedBy = "Material", cascade = CascadeType.ALL)
    private List<Revista> Revista;


}

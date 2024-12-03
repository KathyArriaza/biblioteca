package com.crud.biblioteca.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.catalina.User;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Roles")
public class Roles {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nombre;

    @JsonIgnoreProperties({"roles", "handler", "hibernateLazyInitializer"}) //Investigar para ver errores de bucle
    @ManyToMany  (mappedBy = "roles")
    private List<Usuario> users;


}

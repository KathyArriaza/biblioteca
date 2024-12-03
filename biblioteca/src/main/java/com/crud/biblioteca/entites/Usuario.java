package com.crud.biblioteca.entites;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombres;
    private String apellidos;
    private String email;
    private String telefono;
    private String carnet;
    private String username;
    private String password;
    private String FechaRegistro;


    @JsonIgnoreProperties({"users", "handler", "hibernateLazyInitializer"})
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "role_id"})
    )
    private List<Roles> roles;
    public Usuario() {
    }

}

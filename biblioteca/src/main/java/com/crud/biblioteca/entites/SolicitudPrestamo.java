package com.crud.biblioteca.entites;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="SolicitudPrestamo")
public class SolicitudPrestamo {
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
      private String id;
      private Long idUsuario;
      private String IdMaterial;
      private Date FechaPrestamo;
      private Date FechaVencimiento;
      private Date FechaDevolucion;
     @Enumerated(EnumType.STRING)
      private Estado estado;
      private Double Mora;



}

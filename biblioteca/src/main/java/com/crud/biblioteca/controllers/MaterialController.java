package com.crud.biblioteca.controllers;

import com.crud.biblioteca.Implements.MaterialImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/materiales")

public class MaterialController {
    @Autowired
    private MaterialImpl materialImpl;

    @GetMapping
    public ResponseEntity<String> getMateriales(
            @RequestParam(value = "tipo", required = false) String tipoMaterial) {
        try {
            String jsonResult = materialImpl.callConsultaMateriales(tipoMaterial);
            return ResponseEntity.ok(jsonResult);
        } catch (Exception e) {
            return ResponseEntity.status(500).body("{\"error\":\"No se pudo obtener los materiales\"}");
        }
    }

}

package com.crud.biblioteca.Implements;

import com.crud.biblioteca.entites.Material;
import com.crud.biblioteca.repositories.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class MaterialImpl implements MaterialRepository {

    @Autowired
    private MaterialRepository materialRepository;

    public String callConsultaMateriales(String tipoMaterial) throws Exception {
        return
        materialRepository.callConsultaMateriales(tipoMaterial);
    }

    @Override
    public <S extends Material> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Material> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Material> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Material> findAll() {
        return null;
    }

    @Override
    public Iterable<Material> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Material entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Material> entities) {

    }

    @Override
    public void deleteAll() {

    }
}


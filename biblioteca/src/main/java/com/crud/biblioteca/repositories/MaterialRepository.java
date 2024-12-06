package com.crud.biblioteca.repositories;

import com.crud.biblioteca.entites.Material;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long> {

String callConsultaMateriales(String tipoMaterial) throws Exception;
}

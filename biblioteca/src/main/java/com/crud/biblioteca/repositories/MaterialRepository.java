package com.crud.biblioteca.repositories;

import com.crud.biblioteca.entites.Material;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends CrudRepository<Material, Long> {

    @Query(value = "CALL PROC$OBTENER_MATERIALES(:tipoMaterial)", nativeQuery = true)
    String callConsultaMateriales(@Param("tipoMaterial") String tipoMaterial) throws Exception;
}

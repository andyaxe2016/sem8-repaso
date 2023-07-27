package com.example.demo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "especialidades",path = "especialidades")
public interface EspecialidadRepository extends PagingAndSortingRepository<Especialidad,Integer> ,CrudRepository<Especialidad,Integer>{
    
    List<Especialidad> findByNombre(@Param("nombre") String nombre);
}

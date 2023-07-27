package com.example.demo;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "materias",path = "materias")
public interface MateriaRepository extends PagingAndSortingRepository<Materia,Integer> ,CrudRepository<Materia,Integer>{
    
    List<Materia> findByNombre(@Param("nombre") String nombre);
}

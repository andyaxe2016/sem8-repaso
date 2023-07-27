package com.example.demo;



import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;

@Entity
@Table(name="especialidad")
public class Especialidad {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String nombre;
    
    @OneToMany(targetEntity = Materia.class, mappedBy = "especialidad")
    @OrderBy("nombre ASC")
    private Set<Materia> materias = new HashSet<Materia>();
    
    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Materia> getMaterias() {
        return materias;
    }
    public void setMaterias(Set<Materia> materias) {
        this.materias = materias;
    }
    

    

    


}

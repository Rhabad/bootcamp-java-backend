package com.example.Trivia.repositories;

import com.example.Trivia.Entities.Categoria;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class CategoriaRepositories {

    @PersistenceContext
    EntityManager entityManager;

    //para buscar una sola categoria que corresponda a ese id
    public Categoria findById(Long id){
        return entityManager.find(Categoria.class, id);
    }

}

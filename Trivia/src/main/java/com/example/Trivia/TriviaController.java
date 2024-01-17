package com.example.Trivia;

import com.example.Trivia.Entities.Categoria;
import com.example.Trivia.Entities.Pregunta;
import com.example.Trivia.repositories.CategoriaRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TriviaController {

    @Autowired
    CategoriaRepositories categoriaRepositories;


    @GetMapping("/categories")
    public Categoria[] getCategoria(){

        Categoria cat = new Categoria();
        cat.setCategory("Arte");
        cat.setDescription("Preguntas relacionadas con pintura, escultura, arquitectura y otras formas de expresión artística.");

        Categoria cat2 = new Categoria();
        cat2.setCategory("Deportes");
        cat2.setDescription("Preguntas relacionadas con diversos deportes y eventos deportivos.");

        Categoria[] catego = new Categoria[2];
        catego[0] = cat;
        catego[1] = cat2;
        return catego;
    }



    @GetMapping("/question/{id}")
    public Categoria getQuestion(@PathVariable Long id){



        List<Categoria> result = new ArrayList<>();
        Categoria cate = categoriaRepositories.findById(id);
        result.add(cate);

        return cate;
    }
}

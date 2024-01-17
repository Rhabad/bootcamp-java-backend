package com.example.Trivia.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
public class Pregunta {
    private String category;
    private String question;
    private String[] option;
    private Integer answer;
    private String explanation;
}

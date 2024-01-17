package com.example.PanelDeAdministracion.Models;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class UsuarioModels {
    private Integer id;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
}

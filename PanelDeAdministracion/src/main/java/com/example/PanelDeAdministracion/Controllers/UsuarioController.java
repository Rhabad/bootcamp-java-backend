package com.example.PanelDeAdministracion.Controllers;

import com.example.PanelDeAdministracion.Models.UsuarioModels;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    static List<UsuarioModels> listaUsuarios = new ArrayList<>();

    @GetMapping("/api/usuarios")
    public List<UsuarioModels> mostrarUsuarios(){
        return listaUsuarios;
    }

    @DeleteMapping("/api/usuarios/{id}")
    public void eliminarUsuario(@PathVariable String id){
        //buscamos el usuario por su id
        UsuarioModels usuarioEncontrado = listaUsuarios.stream().filter(user -> user.getId().equals(id))
                        .findFirst().get();

        //otra forma
        /*for (UsuarioModels user: listaUsuarios) {
            if (id.equals(user.getId().toString()))
                listaUsuarios.remove(user);
        }*/

        listaUsuarios.remove(usuarioEncontrado);
    }

    @PostMapping("/api/usuarios")
    public void agregarUsuario(@RequestBody UsuarioModels usuario){
        listaUsuarios.add(usuario);
    }
}

package com.periflus.ejemplo.controllers;

import models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Raul");
        usuario.setApellidos("Garcia");
        usuario.setEmail("raulgarcianieto02@gmail.com");
        usuario.setTelefono("628353570");
        usuario.setPassword("1234");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(12L);
        usuario.setNombre("Raul");
        usuario.setApellidos("Garcia");
        usuario.setEmail("raulgarcianieto02@gmail.com");
        usuario.setTelefono("628353570");
        usuario.setPassword("1234");

        Usuario usuario2 = new Usuario();
        usuario2.setId(123L);
        usuario2.setNombre("Raul");
        usuario2.setApellidos("Nieto");
        usuario2.setEmail("raulgarcianieto0@gmail.com");
        usuario2.setTelefono("628353571");
        usuario2.setPassword("1234");

        Usuario usuario3 = new Usuario();
        usuario3.setId(124L);
        usuario3.setNombre("Raul");
        usuario3.setApellidos("Garcia Nieto");
        usuario3.setEmail("raulgarcianieto2@gmail.com");
        usuario3.setTelefono("628353572");
        usuario3.setPassword("1234");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }
    @RequestMapping(value = "usuario2324")
    public Usuario editar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Raul");
        usuario.setApellidos("Garcia");
        usuario.setEmail("raulgarcianieto02@gmail.com");
        usuario.setTelefono("628353570");
        usuario.setPassword("1234");
        return usuario;
    }

    @RequestMapping(value = "usuario3242")
    public Usuario eliminar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Raul");
        usuario.setApellidos("Garcia");
        usuario.setEmail("raulgarcianieto02@gmail.com");
        usuario.setTelefono("628353570");
        usuario.setPassword("1234");
        return usuario;
    }

    @RequestMapping(value = "usuario555")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Raul");
        usuario.setApellidos("Garcia");
        usuario.setEmail("raulgarcianieto02@gmail.com");
        usuario.setTelefono("628353570");
        usuario.setPassword("1234");
        return usuario;
    }
}

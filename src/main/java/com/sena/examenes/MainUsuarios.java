package com.sena.examenes;

import com.sena.examenes.application.port.in.UsuarioUseCase;
import com.sena.examenes.application.service.UsuarioService;

import com.sena.examenes.domain.model.Usuario;  //al ser hexagonal, no se toca el dominio.

public class MainUsuarios {

    public static void main(String[] args) {
        UsuarioUseCase usuarioUseCase = new UsuarioService();
        usuarioUseCase.registrar("cbarrientos", "cbarrientos@sena.edu.co");
        usuarioUseCase.registrar("lgomez", "lgomez@sena.edu.co");
        try {
            usuarioUseCase.registrar("cbarrientos", "otro@correo.com");
        } catch (IllegalStateException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
        usuarioUseCase.buscarPorUsername("lgomez")
                .ifPresent(u -> System.out.println("Encontrado: " + u.getEmail()));
        int totalActivos = usuarioUseCase.listarActivos().size();
        System.out.println("Usuarios activos: " + totalActivos);
    }
}
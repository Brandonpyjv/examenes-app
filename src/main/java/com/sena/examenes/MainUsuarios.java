package com.sena.examenes;

import com.sena.examenes.application.port.in.UsuarioUseCase;
import com.sena.examenes.application.service.UsuarioService;
import com.sena.examenes.application.service.RolService;
import com.sena.examenes.domain.model.Usuario;

public class MainUsuarios {

    public static void main(String[] args) {

/*
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
        System.out.println(usuarioUseCase.listarActivos());

*/

        // Nota: esta clase es la prueba de la Sesion 1 (sin Spring ni base de datos).
        // Para ejecutar con MySQL usar ExamenesAppApplication.
        System.out.println("Ver ExamenesAppApplication para la ejecucion con Spring Boot.");
    }
}

package com.example.forohub;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        // Contraseña original que debe coincidir con la insertada en la base de datos
        String rawPassword = "AluraChallenge21-@J";

        // Hash almacenado en la base de datos
        String encodedPassword = "63m4RxF4f/jAXItX4w0vx0BBX752QoKaSy0Bvuvapi";

        // Verificar si la contraseña coincide con el hash
        boolean matches = encoder.matches(rawPassword, encodedPassword);
        System.out.println("Password match: " + matches);
    }
}

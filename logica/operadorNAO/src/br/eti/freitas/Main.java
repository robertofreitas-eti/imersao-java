package br.eti.freitas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String perfilUsuario;

        System.out.println("Por favor, informe seu perfil de usuário: ");
        perfilUsuario = sc.next();

        if (!perfilUsuario.equalsIgnoreCase("administrador")) {
            System.out.println("Você precisa ser administrador para acessar esta funcionalidade!");
        }
        sc.close();

    }
}

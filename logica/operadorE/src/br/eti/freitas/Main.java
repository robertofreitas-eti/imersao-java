package br.eti.freitas;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username;
        String password;

        System.out.println("LOGIN");
        System.out.println("===========================================");
        System.out.print("Informe o usuário: ");
        username = sc.next();

        System.out.print("Informe a senha: ");
        password = sc.next();

        if (username.equalsIgnoreCase("administrador") && password.equalsIgnoreCase("123")) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado! \nUsuário ou senha não são válidos!");
        }

        sc.close();
    }
}

package br.eti.freitas;

import java.util.Scanner;

/**
 * Imersão Java - Uso métodos com retorno e mais de um parametro de entrada
 *
 * @author Roberto Freitas
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.print("Informe o usuário: ");
        username = sc.next();

        System.out.print("Informe a senha: ");
        password = sc.next();

        if (validarUsuario(username, password)) {
            System.out.println("Autenticado com sucesso!");
        } else {
            System.out.println("Falha na autenticação!");
        };
    }

    /**
     * Método utilizado para validar usuário e senha
     *
     * @param username Nome do usuário
     * @param password Senha do usuário
     * @return
     */
    public static boolean validarUsuario(String username, String password) {
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
            return true;
        } else {
            return false;
        }
    }

}

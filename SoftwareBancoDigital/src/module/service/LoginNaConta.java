package module.service;

import java.util.Scanner;

public class LoginNaConta {

    public static void efetuarLogin(Cadastro c) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Efetue o login: ");
        System.out.print("Login: ");
        String login = sc.next();
        System.out.print("Senha: ");

        int senha = sc.nextInt();
        if (login.equals(c.getLogin()) || senha==c.getSenha()) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Usuario ou senha incorreto");
        }

    }
}

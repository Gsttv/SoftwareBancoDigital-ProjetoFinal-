package module.service;

import java.util.Scanner;

public class Segurança {
    public static void recuperarSenha(Cadastro c){
        Scanner sc = new Scanner(System.in);

        System.out.print("Para recuperar a senha digite seu login: ");
        String login = sc.next();

        if (login == c.getLogin()) {
            System.out.print("Nova senha: ");
            int senha = sc.nextInt();
            c.setSenha(senha);
            System.out.println("Senha alterada!");
        }else {
            System.out.println("Login invalio, para recuperar a senha é preciso do login correto!");
        }
    }
}

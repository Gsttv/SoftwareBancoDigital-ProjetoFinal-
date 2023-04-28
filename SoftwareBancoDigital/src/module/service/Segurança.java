package module.service;

import java.util.Scanner;

public class Segurança {
    public static void recuperarSenha(int novaSenha, Cadastro c) {
        c.setSenha(novaSenha);
        System.out.println("Senha alterada!");
    }
}

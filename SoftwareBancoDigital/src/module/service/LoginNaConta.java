package module.service;

import java.util.Scanner;

public class LoginNaConta {

    private String login;
    private Integer senha;
    private Cadastro dadosCadastradosDoNovoUsuario;



    public LoginNaConta(String login, Integer senha, Cadastro dadosCadastradosDoNovoUsuario) {
        this.login = login;
        this.senha = senha;
        this.dadosCadastradosDoNovoUsuario = dadosCadastradosDoNovoUsuario;
    }

    public boolean efetuarLogin() {
        if (this.login.equals(this.dadosCadastradosDoNovoUsuario.getLogin()) && this.senha == this.dadosCadastradosDoNovoUsuario.getSenha()) {
            System.out.println("Login realizado com sucesso");
            return false;
        } else {
            System.out.println("Usuario ou senha incorreto, tente novamente. ");

            return true;
        }

    }
}

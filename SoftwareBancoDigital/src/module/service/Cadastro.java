package module.service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cadastro {

    private String login;
    private Integer senha;

    public Cadastro() {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o login para cadastrar: ");
            this.login = sc.next();
            System.out.print("Digite a senha para cadastrar: ");
            this.senha = sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("Senha deve possuir apenas numeros");
            System.exit(1);
        }finally {
            System.out.println("Cadastro realizado com sucesso");
        }

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(Integer senha) {
        this.senha = senha;
    }
}

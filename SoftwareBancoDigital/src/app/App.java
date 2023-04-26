package app;

import module.entites.CartaoCredito;
import module.entites.Compras;
import module.service.LoginNaConta;
import module.service.Cadastro;
import module.service.Segurança;

import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CartaoCredito itemComprado = new CartaoCredito(new Compras(new Date(),"mouse",100.00));
        System.out.println(itemComprado.getSaldoDisponivel());
        itemComprado.pagarFatura(100.00);
        System.out.println(itemComprado.getSaldoDisponivel());

    }
}

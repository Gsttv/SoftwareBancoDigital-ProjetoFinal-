package app;

import module.entites.*;
import module.service.LoginNaConta;
import module.service.Cadastro;
import module.service.Pagamento;
import module.service.Segurança;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Titular cliente = new Titular("gustavo", "099811");
        Conta conta = new ContaCorrente(112, cliente, 1000.0);
        conta.setSaldo(2500.00);
        CartaoCredito itemComprado = new CartaoCredito(new Compras(new Date(), "mouse", 100.00));
        System.out.println(itemComprado.toString());
        System.out.println("");
//        System.out.println(itemComprado.getSaldoDisponivel());
//        System.out.println(itemComprado.getSaldoDisponivel());
        Pagamento.realizarPagamentoFatura(400.00, conta, itemComprado);
        System.out.print("Saldo restante: " + conta.getSaldo());
        Emprestimo emprestimo = new Emprestimo(1000.00, new Date(),12, cliente);
        System.out.println("\n");
        System.out.println(emprestimo.toString());


    }
}

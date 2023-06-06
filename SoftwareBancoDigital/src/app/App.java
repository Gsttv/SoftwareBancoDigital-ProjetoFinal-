package app;

import module.enums.TipoDaTranferencia;
import module.entites.*;
import module.service.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("-----BANCO DIGITAL------");
        System.out.println("-----REALIZE O CADASTRO------");
        System.out.println("Crie seu login e senha(senha deve conter apenas numero)");
        System.out.print("Login: ");
        String loginCadastro = sc.next();
        System.out.print("Senha: ");
        int senhaCadastro = 0;
        boolean senhaValida = false;
        while (!senhaValida) {
            try {
                senhaCadastro = sc.nextInt();
                senhaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("A senha deve conter apenas numeros, digite a senha novamente");
                sc.next();

            }
        }
        Cadastro novoUsuario = new Cadastro(loginCadastro, senhaCadastro);
        System.out.println();


        System.out.println("-----REALIZE O LOGIN NA CONTA CADASTRADA------");
        System.out.println("Digite os dados cadastrados para entra no aplicativo (Caso queria trocar a senha digite 00 na senha");
        boolean a = false;

        do {
            System.out.print("Login: ");
            String login = sc.next();
            System.out.print("Senha: ");
            int senha = sc.nextInt();
            System.out.println();
            LoginNaConta logando = new LoginNaConta(login, senha, novoUsuario);

            a = logando.efetuarLogin();
            if (senha == 00) {
                System.out.println("Troque sua senha");
                System.out.print("Digite a nova senha: ");
                int novaSenha = sc.nextInt();
                Segurança.recuperarSenha(novaSenha, novoUsuario);
            }
        } while (a);

        System.out.println("-----INSIRA OS DADOS DA NOVA CONTA------");
        System.out.println("Digite o nome e cpf para cadastro como titular");
        System.out.print("Nome: ");
        sc.nextLine();
        String nome = sc.nextLine();
        System.out.print("CPF: ");

        String cpf = sc.nextLine();
        Titular titular = new Titular(nome, cpf);
        System.out.print("Digite o numero da conta: ");
        int numeroConta = sc.nextInt();

        Conta novaConta = new ContaCorrente(numeroConta, titular);
        System.out.println("");
        System.out.println("Dados da conta");
        System.out.println(novaConta.dados(titular));
        System.out.println("Você possui um cartao de credito com limite de R$ 1000,00");
        System.out.println("");
        System.out.println("Deseja fazer um deposito?(y/n)");

        char respo = sc.next().charAt(0);
        if (respo == 'y') {
            System.out.println("Qual valor do desposito");
            double depo = sc.nextDouble();
            novaConta.depositar(depo);


            System.out.println("Dados da conta após o deposito");
            System.out.println(novaConta.dados(titular));
        }


        System.out.println("");

        System.out.println("Digite os dados da compra que você efetuou");
        System.out.print("Data: ");
        Date data = sdf.parse(sc.next());
        System.out.print("Nome do produto: ");
        String nomeProduto = sc.next();
        System.out.print("Valor do produto: ");
        double valorProduto = sc.nextDouble();

        Compras compraRealizada = new Compras(data, nomeProduto, valorProduto);
        CartaoCredito cartaoCredito = new CartaoCredito(compraRealizada);
        System.out.println(cartaoCredito.toString());

        System.out.println("");
        System.out.println("Realizando o pagamento da fatura...");
        Pagamento.realizarPagamentoFatura(valorProduto, novaConta, cartaoCredito);


        System.out.println("-----DADOS DA NOVA CONTA POUPANÇA------");
        Titular titular2 = new Titular("Aderbaldo", "099554635");

        Conta novaContaPoup = new ContaPoupanca( 113, titular2);
        System.out.println("Dados da conta: ");
        System.out.println(novaContaPoup.dados(titular2));
        novaContaPoup.rendimento();
        System.out.println("Dados da conta após o rendimento");
        System.out.println(novaContaPoup.dados(titular2));

        System.out.println("-----DADOS DA NOVA CONTA INVESTIMENTOS------");
        Titular titular3 = new Titular("Jeronimo", "059879635");
        Conta novaContaInvest = new ContaInvestimento(113, titular2);
        System.out.println("Dados da conta: ");
        System.out.println(novaContaInvest.dados(titular3));
        novaContaInvest.rendimento();
        System.out.println("Dados da conta após o rendimento");
        System.out.println(novaContaInvest.dados(titular3));

        Transferencia tranferencia = new Transferencia(100.00, 112, TipoDaTranferencia.TED, novaConta);
        tranferencia.realizarTranferencia(tranferencia);



    }
}


package module.service;

import module.entites.CartaoCredito;
import module.entites.Conta;

public class Pagamento {
    public static void realizarPagamentoFatura(double valor, Conta contaPaga, CartaoCredito cartao){
        if (valor<=contaPaga.getSaldo() && valor>= cartao.getValorCompras()){
            contaPaga.setSaldo(contaPaga.getSaldo()-cartao.getValorCompras());
            cartao.setSaldoDisponivel(cartao.getSaldoDisponivel()+valor);
            System.out.println("Fatura do cartao paga com sucesso!");
            System.out.println("Novo saldo: "+contaPaga.getSaldo());
            System.out.println("Novo limite: " + cartao.getLimiteTotal());
        }else {
            System.out.println("Saldo insuficiente");
        }


    }
}

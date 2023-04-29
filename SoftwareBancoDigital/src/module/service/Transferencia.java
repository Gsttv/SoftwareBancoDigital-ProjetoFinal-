package module.service;

import module.enums.TipoDaTranferencia;
import module.entites.Conta;

import java.util.ArrayList;
import java.util.List;

public class Transferencia {

    private Double valorTransferido;
    private Integer numeroDaContaDestino;
    private TipoDaTranferencia tipoDaTranferencia;
    private Conta contaDeOrigem;
    private List<Transferencia> historicoDeCompras = new ArrayList<Transferencia>();

    public Transferencia(Double valorTransferido, Integer numeroDaContaDestino, TipoDaTranferencia tipoDaTranferencia, Conta contaDeOrigem) {
        this.valorTransferido = valorTransferido;
        this.numeroDaContaDestino = numeroDaContaDestino;
        this.tipoDaTranferencia = tipoDaTranferencia;
        this.contaDeOrigem = contaDeOrigem;
    }

    public void realizarTranferencia(Transferencia transferencia) {
        if (this.contaDeOrigem.getSaldo() < this.valorTransferido) {
            System.out.println("Saldo insuficinete");
        } else {
            System.out.println("Tranferencia realizada para conta " + this.numeroDaContaDestino + ", no valor de: R$ " + this.valorTransferido);
            this.contaDeOrigem.setSaldo(this.contaDeOrigem.getSaldo() - this.valorTransferido);
            this.historicoDeCompras.add(transferencia);
        }
    }


}

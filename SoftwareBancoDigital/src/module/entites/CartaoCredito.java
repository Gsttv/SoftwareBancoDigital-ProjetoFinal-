package module.entites;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class CartaoCredito {

    private Double limiteTotal;
    private Double saldoDisponivel;
    private String dataVencimento;
    private Compras compras;
    private ArrayList<Compras> comprasRealizadas = new ArrayList<Compras>();


    public CartaoCredito(Compras compras) {
        this.limiteTotal = 1000.00 ;
        this.saldoDisponivel = this.limiteTotal - compras.getValor();
        this.dataVencimento = "10/05/23";
        this.compras = compras;
    }

    public Double getLimiteTotal() {
        return limiteTotal;
    }

    public void setLimiteTotal(Double limiteTotal) {
        this.limiteTotal = limiteTotal;
    }

    public Double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void comprasRealizadas(Compras c1){
        comprasRealizadas.add(c1);

    }
    public void pagarFatura(double valor) {
        if (valor <= (this.limiteTotal - this.saldoDisponivel)) {
            this.saldoDisponivel += valor;
        } else {
            throw new IllegalArgumentException("Valor do pagamento excede o saldo disponível");
        }
    }

}

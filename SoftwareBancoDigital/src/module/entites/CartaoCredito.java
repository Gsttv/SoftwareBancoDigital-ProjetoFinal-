package module.entites;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class CartaoCredito {

    private Double limiteTotal;
    private Double saldoDisponivel;
    private Date dataVencimento;
    private Compras compras;
    private ArrayList<Compras> comprasRealizadas = new ArrayList<Compras>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


    public CartaoCredito(Compras compras) throws ParseException {
        this.limiteTotal = 1000.00;
        this.saldoDisponivel = this.limiteTotal - compras.getValor();
        this.dataVencimento = sdf.parse("10/05/2023");
        this.compras = compras;
        comprasRealizadas.add(this.compras);

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

    public void setSaldoDisponivel(Double saldoDisponivel) {
        this.saldoDisponivel = saldoDisponivel;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public Double getValorCompras() {
        double total = 0.0;
        for (Compras c : comprasRealizadas) {
            total += c.getValor();
        }
        return total;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("ITENS COMPRADOS: \n");
        for (Compras c:comprasRealizadas) {
            sb.append("Nome: "+c.getNomeCompra()+", ");
            sb.append("Valor: "+c.getValor()+", ");
            sb.append("Data: "+c.getDataCompra()+"\n");
        }
        sb.append("Valor total da fatura: "+this.getValorCompras());
        return sb.toString();

    }

}

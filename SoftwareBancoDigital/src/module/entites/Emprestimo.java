package module.entites;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Emprestimo {
    private double valor;
    private Date data;
    private double taxa;
    private Titular cliente;
    private String status;
    private Integer quantidadeParcelas;
    private Integer parcelaAtual = 0;

    public Emprestimo(double valor, Date data, int quantidadeParcelas, Titular cliente) {
        this.valor = valor;
        this.data = data;
        this.taxa = 0.06;
        this.cliente = cliente;
        this.status = "Em aberto";
        this.quantidadeParcelas = quantidadeParcelas;
    }


    public double getValorEmprestimo() {
        return valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setValorEmprestimo(double valor) {
        this.valor = valor;
    }

    public double getTaxaJuros() {
        return taxa;
    }

    public void setTaxaJuros(double taxa) {
        this.taxa = taxa;
    }

    public double getValorJuros() {
        return this.valor * this.taxa;
    }

    public Date getDataEmprestimo() {
        return data;
    }

    public void setDataEmprestimo(Date data) {
        this.data = data;
    }

    public double getValorTotal() {
        return this.calcularValorParcelaParaPagar() * this.quantidadeParcelas;
    }

    public double getValorParcela() {
        return calcularValorParcelaParaPagar();
    }


    public int getQuantidadeParcelas() {
        return this.quantidadeParcelas;
    }


    public void pagarParcela(double valor) {

        if (valor <= this.calcularValorParcelaParaPagar()) {
            System.out.println("Saldo insuficiente!");
        } else {
            System.out.println("Parcela paga");
            parcelaAtual++;
            System.out.println(parcelaAtual);
            if (parcelaAtual == this.quantidadeParcelas) {
                System.out.println("Todas as parcelas foram pagas");
                this.parcelaAtual = 0;
            }

        }
    }

    public boolean verificarEmprestimoPago() {
        return status.equals("Pago");
    }

    private double calcularValorParcelaParaPagar() {
        return (this.valor + (this.valor * taxa)) / 12;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DADOS DO EMPRESTIMO: \n");
        sb.append("Quantidade de parcelas: " + this.getQuantidadeParcelas() + "\n");
        sb.append("Taxa de juros: " + this.getTaxaJuros() + "\n");
        sb.append("Valor de cada parcela: " + String.format("R$ %.2f", this.getValorParcela()) + "\n");
        sb.append("Valor total das parcelas: R$ " + this.getValorTotal());

        return sb.toString();
    }


}

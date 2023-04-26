package module.entites;

import java.util.Date;
public class Compras {

    private Date dataCompra;
    private String nomeCompra;
    private Double valor;


    public Compras(Date dataCompra, String nomeCompra, Double valor) {
        this.dataCompra = dataCompra;
        this.nomeCompra = nomeCompra;
        this.valor = valor;
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public String getNomeCompra() {
        return nomeCompra;
    }

    public Double getValor() {
        return valor;
    }
}

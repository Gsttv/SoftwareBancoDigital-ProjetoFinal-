package module.entites;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
public class Compras {

    private Date dataCompra;
    private String nomeCompra;
    private Double valor;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Compras(Date dataCompra, String nomeCompra, Double valor) {
        this.dataCompra = dataCompra;
        this.nomeCompra =  nomeCompra;
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

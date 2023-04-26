package module.entites;

import java.util.ArrayList;
import java.util.List;

public class Transferencia {

    private Double valorTransferido;
    private Integer numeroDaConta;
    private String tipoDaTranferencia;
    private List<Transferencia> historicoDeCompras = new ArrayList<Transferencia>();

    public Transferencia(Double valorTransferido, Integer numeroDaConta, String tipoDaTranferencia) {
        this.valorTransferido = valorTransferido;
        this.numeroDaConta = numeroDaConta;
        this.tipoDaTranferencia = tipoDaTranferencia;
    }

    public String getTipoDaTranferencia() {
        return tipoDaTranferencia;
    }

    public void setTipoDaTranferencia(String tipoDaTranferencia) {
        this.tipoDaTranferencia = tipoDaTranferencia;
    }

    public Double getValorTransferido() {
        return valorTransferido;
    }

    public void setValorTransferido(Double valorTransferido) {
        this.valorTransferido = valorTransferido;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }


}

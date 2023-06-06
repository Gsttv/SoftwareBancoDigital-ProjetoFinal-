package module.entites;

public class ContaInvestimento extends Conta{

    private Double juros;
    public ContaInvestimento(int numeroDaConta, Titular titular) {
        super(numeroDaConta, titular);
        juros = 0.1;
    }

    @Override
    public int getNumeroDaConta() {
        return 0;
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > (this.verificarSaldo())) {
            System.out.println("Saldo insuficiente");
        } else {
            if (valorSaque <= this.verificarSaldo()) {
                this.setSaldo((this.getSaldo() - valorSaque));
            } else {
                double diferenca = this.getSaldo() - valorSaque;
                this.setSaldo((this.getSaldo()-valorSaque));

            }
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor>0) {
            this.setSaldo(valor + this.getSaldo());
        }else{
            System.out.println("O valor de deposito é inválido");
        }
    }

    @Override
    public String dados(Titular titular) {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: " + titular.getNome()+", ");
        sb.append("CPF: " + titular.getCpf()+", ");
        sb.append("Saldo: " + this.getSaldo()+", ");
        sb.append("Rendimento: "+ this.rendimento());
        return sb.toString();
    }

    @Override
    public double rendimento() {
        double rendimento = this.juros*getSaldo();
        depositar(rendimento);
        return rendimento;
    }

    public double verificarSaldo () {
        return this.getSaldo();
    }

}

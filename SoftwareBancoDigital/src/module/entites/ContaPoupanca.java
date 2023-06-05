package module.entites;

public class ContaPoupanca extends Conta{


    public ContaPoupanca(double saldo, int numeroDaConta, Titular titular) {
        super(saldo, numeroDaConta, titular);
    }

    @Override
    public int getNumeroDaConta() {
        return getNumeroDaConta();
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > (this.verificarSaldo())){
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
        sb.append("Nome: ").append(titular.getNome()).append(", ");
        sb.append("CPF: ").append(titular.getCpf()).append(", ");
        sb.append("Saldo: ").append(getSaldo()+", ");
        sb.append("Rendimento: "+ this.rendimento());
        return sb.toString();
    }
    @Override
    public double rendimento() {
        double rendimento = 0.02*getSaldo();
        depositar(rendimento);
        return rendimento;

    }

    public double verificarSaldo () {
        return this.getSaldo();
    }

}

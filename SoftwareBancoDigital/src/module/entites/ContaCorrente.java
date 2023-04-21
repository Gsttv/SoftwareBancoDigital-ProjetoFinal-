package module.entites;

public class ContaCorrente extends Conta {

    public double chequeEspecial;

    public ContaCorrente(int numeroDaConta, Titular titular, double chequeEspecial) {
        super(chequeEspecial, numeroDaConta, titular);
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public int getNumeroDaConta() {
        return this.getNumeroDaConta();
    }

    @Override
    public void sacar(double valorSaque) {
        if (valorSaque > (this.verificarSaldo() + this.getChequeEspecial())) {
            System.out.println("Saldo insuficiente");
        } else {
            if (valorSaque <= this.verificarSaldo()) {
                this.setSaldo((this.getSaldo() - valorSaque));
            } else {
                double diferenca = this.getSaldo() - valorSaque;
                this.setChequeEspecial(this.getChequeEspecial() - diferenca);
                this.setSaldo((this.getSaldo()-valorSaque));
                
            }
        }
    }

        @Override
        public void depositar ( double valor){
        if (valor>0) {
            this.setSaldo(valor + this.getSaldo());
        }else{
            System.out.println("O valor de deposito é inválido");
        }

        }
        public double verificarSaldo () {
            return this.getSaldo();
        }
    }


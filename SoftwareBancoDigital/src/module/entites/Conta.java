package module.entites;

public abstract class Conta {
    private double saldo;
    private int numeroDaConta;
    private Titular titular;


    public Conta(double saldo, int numeroDaConta, Titular titular) {
        this.saldo = saldo;
        this.numeroDaConta = numeroDaConta;
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public abstract int getNumeroDaConta();
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract String dados(Titular titular);
}

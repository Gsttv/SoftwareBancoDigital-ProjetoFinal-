package module.entites;

public abstract class Conta {
    private double saldo;
    private int numeroDaConta;
    private Titular titular;


    public Conta(double saldo, int numeroDaConta, Titular titular) {
        this.saldo = 0.0;
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


}

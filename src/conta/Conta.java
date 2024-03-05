package conta;

public abstract class Conta implements OperacoesBancarias {
    protected int numeroConta;
    protected double saldo;

    public Conta(int numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        System.out.println("Depositando em Conta");
        this.saldo += valor;
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        }

        System.out.println("Sacando em Conta");
        this.saldo -= valor;
        return true;
    }
}

import conta.Conta;

public class Poupanca extends Conta {
    public Poupanca(int numeroConta, double saldo) {
        super(numeroConta, saldo);
    }

    @Override
    public boolean depositar(double valor) {
        if (valor <= 0) {
            return false;
        }

        System.out.println("Depositando em Conta Poupança");
        this.saldo += valor;
        return true;
    }

    @Override
    public boolean sacar(double valor) {
        if (valor > this.saldo) {
            return false;
        }

        System.out.println("Sacando em Conta Poupança");
        this.saldo -= valor;
        return true;
    }
}

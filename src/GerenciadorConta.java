import conta.Conta;

public class GerenciadorConta {
    public static <T extends Conta> boolean transferir(T origem, T destino, double valor) {
        if (valor <= 0) {
            return false;
        }

        boolean saldoSuficienteNaOrigem = origem.sacar(valor);

        if (saldoSuficienteNaOrigem) {
            destino.depositar(valor);
            return true;
        }

        return false;
    }
}

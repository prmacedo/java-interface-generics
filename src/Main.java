public class Main {
    public static void main(String[] args) {
        Corrente conta1 = new Corrente(1, 1_000);
        Poupanca conta2 = new Poupanca(2, 6_000);

        boolean realizouTransferencia = GerenciadorConta.transferir(conta1, conta2, 750);

        System.out.println(realizouTransferencia ? "Transferência realizada" : "Erro ao realizar transferência");
    }
}
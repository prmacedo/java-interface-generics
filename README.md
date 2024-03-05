# Interface e Generics

Exercício realizado no módulo de POO2 do Santander Coders 2023.2


## Questão
Criar classes Conta Corrente e Poupanca
Atributos:
numeroConta (int): Número da conta bancária.
saldo (double): Saldo atual da conta bancária.

Métodos:
depositar(double valor): Adiciona o valor especificado ao saldo da conta.
sacar(double valor): Subtrai o valor especificado do saldo da conta (se houver saldo suficiente).


Cria uma outra classe GerenciadorContas, implemente o método transferir(T origem, T destino, double valor) que transfere um valor da conta de origem para a conta de destino, verificando se há saldo suficiente na conta de origem.
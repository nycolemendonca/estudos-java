/*  CENÁRIO:

*   Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais
*   possuem as funcionalidades de depósito, saque e transferência (entre contas da própria
*   instituição).
*/
public class Main {
    public static void main(String[] args) {
        Cliente margot = new Cliente();
        margot.setNome("Margot");

        Conta cc = new ContaCorrente(margot);
        Conta poupanca = new ContaPoupanca(margot);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
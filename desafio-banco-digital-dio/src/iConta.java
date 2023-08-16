public interface iConta {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(iConta contaDestino, double valor);

    void transferir(double valor, iConta contaDestino);

    void imprimirExtrato();
}
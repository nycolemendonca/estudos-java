package org.dio.singleton;

public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    // Constructor
    private SingletonEager() {
        super();
    }

    // Getter
    // SingletonEager -> Não faz verificação de instância e já cria uma
    public static SingletonEager getInstancia() {
        return instancia;
    }
}

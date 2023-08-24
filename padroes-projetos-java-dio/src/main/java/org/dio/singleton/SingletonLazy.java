package org.dio.singleton;

// Não disponibiliza a instância para o usuário
public class SingletonLazy {
    private static SingletonLazy instancia;

    // Constructor
    private SingletonLazy() {
        super();
    }

    // Getter
    // SingletonLazy -> Faz a verificação de instância para entrão criar uma
    public static SingletonLazy getInstancia() {
        if (instancia == null) { instancia = new SingletonLazy(); }
        return instancia;
    }
}

package org.dio.subsistema2;

public class CepApi {
    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Fortaleza";
    }

    public String recuperarEstado(String estado) {
        return "Ceará";
    }
}

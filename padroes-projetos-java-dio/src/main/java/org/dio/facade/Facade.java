package org.dio.facade;

import org.dio.subsistema1.crm.CrmService;
import org.dio.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep) {
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);

        CrmService.salvarCliente(nome, cep, cidade, estado);
    }
}

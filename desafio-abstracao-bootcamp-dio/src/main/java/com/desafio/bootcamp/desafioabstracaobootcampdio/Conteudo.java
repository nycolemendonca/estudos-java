package com.desafio.bootcamp.desafioabstracaobootcampdio;

import lombok.Data;

@Data
public abstract class Conteudo {
    public static final double XP_PADRAO = 10;

    private String titulo;
    private String descricao;

    public abstract double calcularXP();
}

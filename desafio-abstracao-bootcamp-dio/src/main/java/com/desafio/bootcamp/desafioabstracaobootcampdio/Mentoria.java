package com.desafio.bootcamp.desafioabstracaobootcampdio;

import lombok.Data;
import java.time.LocalDate;

@Data
public class Mentoria extends Conteudo {
    private LocalDate data;

    public Mentoria() {}

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }
}

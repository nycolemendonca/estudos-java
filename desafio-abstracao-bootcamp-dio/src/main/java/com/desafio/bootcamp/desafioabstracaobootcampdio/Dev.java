package com.desafio.bootcamp.desafioabstracaobootcampdio;

import lombok.Data;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

@Data
public class Dev {
    private String nome;

    // Set<> -> Elementos não se repetem
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>(); // Cursos ordenados na medida em que são inscritos
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>(); // Cursos ordenados na medida em que são concluídos

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsInscritos().add(this);
    }
    public void progredir() {
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if  (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());

        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }
    }
    public double calcularXpTotal() {
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();
    }
}

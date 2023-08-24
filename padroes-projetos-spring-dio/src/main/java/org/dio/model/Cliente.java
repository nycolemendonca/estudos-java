package org.dio.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity // Classe marcada como entidade de DB
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    @ManyToOne
    private Endereco endereco;
}

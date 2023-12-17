package com.mulhermarav.propriedade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode
public class Propriedade {

    @Id
    private String nome;
    private String valor;
    private String descricao;
    private String categoria;
}

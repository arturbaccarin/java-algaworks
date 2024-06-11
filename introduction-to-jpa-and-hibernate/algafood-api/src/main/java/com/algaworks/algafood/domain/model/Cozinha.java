package com.algaworks.algafood.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

// @Getter
// @Setter
// @EqualsAndHashCode
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
// @Table(name = "tab_cozinhas")
public class Cozinha {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(name = "nom_cozinha")
    private String nome;
}

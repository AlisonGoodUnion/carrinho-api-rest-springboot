package com.example.carrinho.carrinhoapi.domain;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.math.BigDecimal;

@Builder
@Data
@EqualsAndHashCode(of = "id")
@Entity
@Table(name = "PRODUTO")
@ToString
public class Produto {

    private static final String SEQUENCE = "PRODUTO_SEQ";

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE)
    @SequenceGenerator(name = SEQUENCE, sequenceName = SEQUENCE, allocationSize = 1)
    @Column(name = "ID")
    private Long id;

    @Column(name = "VALOR")
    private BigDecimal valor;

    @Column(name = "PESO")
    private Long peso;

    @Column(name = "DESCRICAO")
    private String descricao;
}

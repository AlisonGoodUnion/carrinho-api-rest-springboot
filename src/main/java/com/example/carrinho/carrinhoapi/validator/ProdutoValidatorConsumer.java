package com.example.carrinho.carrinhoapi.validator;

import com.example.carrinho.carrinhoapi.domain.Produto;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;
import java.util.function.Predicate;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Component
public class ProdutoValidatorConsumer implements Consumer<Produto> {

    @Override
    public void accept(Produto produto) {
        if (isNull(produto))
            throw new IllegalArgumentException("Produto invalido.");

        if (isNull(produto.getPeso()))
            throw new IllegalArgumentException("Produto não contém peso.");
    }
}

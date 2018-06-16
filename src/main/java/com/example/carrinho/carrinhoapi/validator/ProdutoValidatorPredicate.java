package com.example.carrinho.carrinhoapi.validator;

import com.example.carrinho.carrinhoapi.domain.Produto;
import org.springframework.stereotype.Component;

import java.util.function.Predicate;

import static java.util.Objects.nonNull;

@Component
public class ProdutoValidatorPredicate implements Predicate<Produto> {

    @Override
    public boolean test(Produto produto) {
        return nonNull(produto);
    }
}

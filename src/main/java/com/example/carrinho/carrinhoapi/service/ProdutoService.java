package com.example.carrinho.carrinhoapi.service;

import com.example.carrinho.carrinhoapi.domain.Produto;
import com.example.carrinho.carrinhoapi.repository.ProdutoRepository;
import com.example.carrinho.carrinhoapi.validator.ProdutoValidatorConsumer;
import com.example.carrinho.carrinhoapi.validator.ProdutoValidatorPredicate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import static java.util.Objects.*;

@Service
@Slf4j
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private ProdutoValidatorConsumer validatorConsumer;

    @Autowired
    private ProdutoValidatorPredicate validatorPredicate;

    public Produto consultar(final Long id) {
        log.info("Consultando produto de id: {}", id);

        Produto produto = repository.findById(id);

        log.info("Produto encontrado: {}", produto);
        return produto;
    }

    public Produto salvar(final Produto produto) {

        log.info("Validação Predicate produto: {}", produto);
        if (validatorPredicate.test(produto))
            throw new IllegalArgumentException("Produto Predicate.");

        log.info("Validação Consumer produto: {}", produto);
        validatorConsumer.accept(produto);

        log.info("Salvando Produto ", produto);
        repository.save(produto);
        Produto produtoConsultado = consultar(produto.getId());
        if (isNull(produtoConsultado))
            log.info("Produto realmente foi salvo :P Produto: {}", produtoConsultado);

        return produtoConsultado;
    }

    public void remover(final Long id) {

        log.info("Salvando Produto de id: {}", id);

        repository.deleteById(id);

        Produto produto = consultar(id);

        if (isNull(produto))
            log.info("produto realmente foi removido :P id: {}", id);

    }
}

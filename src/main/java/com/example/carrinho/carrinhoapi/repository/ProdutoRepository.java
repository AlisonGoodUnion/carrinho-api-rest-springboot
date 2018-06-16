package com.example.carrinho.carrinhoapi.repository;

import com.example.carrinho.carrinhoapi.domain.Produto;
import org.springframework.data.repository.Repository;

public interface ProdutoRepository extends Repository<Produto, Long> {

    Produto findById(Long id);

    Produto save(Produto produto);

    void delete(Produto produto);
    void deleteById(Long id);
}

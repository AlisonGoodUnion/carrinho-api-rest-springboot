package com.example.carrinho.carrinhoapi.web;

import com.example.carrinho.carrinhoapi.domain.Produto;
import com.example.carrinho.carrinhoapi.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/produto")
@RestController
public class ProdutoController implements ProdutoApi {

    @Autowired
    private ProdutoService service;

    @Override
    @GetMapping("{id}")
    public Produto buscar(@PathVariable final Long id) {
        return service.consultar(id);
    }

    @Override
    @PostMapping
    public void criar(@RequestBody final Produto produto) {
        service.salvar(produto);
    }

    @Override
    @DeleteMapping("{id}")
    public void remover(@PathVariable final Long id) {
        service.remover(id);
    }
}

package com.example.carrinho.carrinhoapi.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/carrinho")
@RestController
public class CarrinhoController implements CarrinhoApi {


    @Override
    @GetMapping("{id}")
    public void buscar(@PathVariable Integer id) {

    }
}

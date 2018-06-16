package com.example.carrinho.carrinhoapi.web;

import com.example.carrinho.carrinhoapi.domain.Produto;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface ProdutoApi {

    @ApiOperation(
            value = "Buscar produto",
            notes = "Retorna informações do produto")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Consulta realizada com sucesso.")})
    Produto buscar(Long id);

    @ApiOperation(
            value = "Criar produto",
            notes = "Cria produto")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Criado com sucesso.")})
    void criar(Produto produto);

    @ApiOperation(
            value = "Remover produto",
            notes = "Remover o produto")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Removido com sucesso.")})
    void remover(Long id);
}


package com.example.carrinho.carrinhoapi.web;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

public interface CarrinhoApi {

    @ApiOperation(
            value = "Buscar carrinho",
            notes = "Retorna todos os dados do carrinho")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Consulta realizada com sucesso.")})
    void buscar(Integer id);
}

package com.example.carrinho.carrinhoapi.web;

import com.example.carrinho.carrinhoapi.domain.Carrinho;
import com.example.carrinho.carrinhoapi.service.integration.dto.Post;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;

import javax.xml.ws.Response;
import java.util.List;

public interface CarrinhoApi {

    @ApiOperation(
            value = "Buscar carrinho",
            notes = "Retorna todos os dados do carrinho")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Consulta realizada com sucesso.")})
    ResponseEntity<List<Post>> buscar(Integer id);
}

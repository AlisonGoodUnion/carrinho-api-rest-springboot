package com.example.carrinho.carrinhoapi.web;

import com.example.carrinho.carrinhoapi.service.integration.dto.Post;
import com.example.carrinho.carrinhoapi.service.integration.service.FeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/carrinho")
@RestController
public class CarrinhoController implements CarrinhoApi {


    private FeignService feignService;

    @Autowired
    public CarrinhoController(FeignService feignService) {
        this.feignService = feignService;
    }

    @Override
    @GetMapping("{id}")
    public ResponseEntity<List<Post>> buscar(@PathVariable Integer id) {
        return new ResponseEntity<>(feignService.getPost(), HttpStatus.ACCEPTED);
    }
}

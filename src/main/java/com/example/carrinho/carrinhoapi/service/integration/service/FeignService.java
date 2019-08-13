package com.example.carrinho.carrinhoapi.service.integration.service;

import com.example.carrinho.carrinhoapi.service.integration.client.FeignInterfaceClient;
import com.example.carrinho.carrinhoapi.service.integration.dto.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeignService {

    private FeignInterfaceClient feignInterfaceClient;

    @Autowired
    public FeignService(FeignInterfaceClient feignInterfaceClient) {
        this.feignInterfaceClient = feignInterfaceClient;
    }

    public List<Post> getPost() {
        feignInterfaceClient.getPostById(1L);
        return feignInterfaceClient.getPosts();
    }
}

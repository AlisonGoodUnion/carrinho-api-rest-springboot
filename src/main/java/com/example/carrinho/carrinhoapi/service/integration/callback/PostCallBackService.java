package com.example.carrinho.carrinhoapi.service.integration.callback;

import com.example.carrinho.carrinhoapi.service.integration.client.FeignInterfaceClient;
import com.example.carrinho.carrinhoapi.service.integration.dto.Post;

import java.util.Collections;
import java.util.List;

//Classe de fallback quando ocorre algum erro

public class PostCallBackService implements FeignInterfaceClient {
    @Override
    public List<Post> getPosts() {
        return Collections.emptyList();
    }

    @Override
    public Post getPostById(Long postId) {
        return null;
    }
}

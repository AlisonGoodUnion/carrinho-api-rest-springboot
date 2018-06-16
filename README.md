# carrinho-api

Api contém, JPA, Spring, Hibernate, H2, Swagger, REST.
Aplicação com Spring que implemente os requisitos abaixo:

## Domínio

### Carrinho
- Lista de produtos e quantidade de cada um
- Valor Total ( soma do valor de cada produto multiplicado pela quantidade )
- Valor do Desconto
    - Acima de 3 produtos diferentes, aplicar 10% no Valor Total
    - Acima de 5 produtos diferentes, aplicar 20% no Valor Total
- Valor Final (Valor Total - Valor Desconto)

### Produto
- Descrição
- Valor
- Peso

## API

### /produto
- GET `/produto/id`
- POST `/produto`
- PUT `/produto/id`
- DELETE `/produto/id`

### /carrinho
- GET `/carrinho/id` - Retorna todos os dados do carrinho

- POST `/carrinho` - Cria um novo carrinho
    - Request: `vazio`
    - Response: `id do carrinho`

- PUT `/carrinho/id/adicionar` - Adicionar um novo produto ou incrementar a quantidade de um produto existente
    - Request: `idProduto`

- PUT `/carrinho/id/remover` - Remover um produto ou decrementar a quantidade de um produto existente
    - Request: `idProduto`

- DELETE `/carrinho/id`

# Challenge Forum Hub

![Status: Concluído](https://img.shields.io/badge/status-concluído-brightgreen)
![Tecnologias](https://img.shields.io/badge/Java-orange?style=flat&logo=openjdk)

<br>

## 📜 Índice

1.  [Sobre o Projeto](#1-sobre-o-projeto)
2.  [Principais Funcionalidades](#2-principais-funcionalidades)

<br>

## 1. Sobre o Projeto

O *challenge* Forum Hub é uma API RESTful desenvolvida em Java com Spring Boot, focada em simular o back-end de um fórum de discussões. O sistema permite o gerenciamento completo de tópicos, onde usuários autenticados podem publicar, visualizar, editar e deletar suas dúvidas. A aplicação foca fortemente em boas práticas de arquitetura, segurança de rotas e integridade no tráfego de dados.

<br>

## 2. Principais Funcionalidades

| Funcionalidade | Descrição |
| :--- | :--- |
| **Arquitetura API REST** | A aplicação segue o padrão REST, trafegando dados em formato JSON através de DTOs e retornando os códigos HTTP adequados para cada operação (como `201 Created` com cabeçalho Location e `204 No Content`). |
| **Autenticação com JWT**| O sistema utiliza Spring Security para blindar as rotas. O usuário faz login com e-mail e senha (criptografada via BCrypt) e a API devolve um token JWT (Bearer Token) que deve ser usado para acessar os endpoints restritos. |
| **Persistência e Migrations** | A conexão com o banco de dados MySQL é feita através do Spring Data JPA. O versionamento e a criação da estrutura do banco (tabelas de usuários, perfis, tópicos e cursos) são gerenciados de forma automatizada pelo Flyway. |
| **CRUD de Tópicos**| A API permite criar, listar, atualizar e deletar tópicos. O sistema é inteligente o suficiente para identificar o autor da postagem extraindo os dados diretamente do token JWT de quem está logado, evitando fraudes. |
| **Tratamento Global de Erros**| Utilização de um `@RestControllerAdvice` para interceptar exceções da aplicação e devolver respostas JSON amigáveis para erros como `404 Not Found`, falhas de validação ou tentativas de salvar dados duplicados (`400 Bad Request`).|
| **Validação de Dados**| A aplicação utiliza Bean Validation (`@Valid`, `@NotBlank`, etc.) nos DTOs de entrada para garantir que requisições com dados em branco ou mal formatados sejam barradas antes mesmo de chegarem ao banco de dados. |

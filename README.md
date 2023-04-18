# Projeto: Sistema de Gerenciamento de Biblioteca

## Descrição
O objetivo deste projeto é desenvolver um sistema de gerenciamento de biblioteca simples que permita aos usuários gerenciar informações sobre livros, autores e editoras. Utilizamos técnicas de Engenharia de Software para criar um design modular e testável, implementando funcionalidades essenciais como adicionar, remover, pesquisar e classificar livros com base em vários critérios.

## Classes e pacotes

### `com.library.models`
- **Book**: classe que representa um livro com informações sobre título, autor e editora.
- **Author**: classe que representa um autor com informações sobre o nome e nacionalidade.
- **Publisher**: classe que representa uma editora com informações sobre o nome e país de origem.
- **Library**: classe que representa uma biblioteca contendo uma lista de livros.

### `com.library.service`
- **LibraryService**: classe que implementa as funcionalidades de gerenciamento de biblioteca, como adicionar, remover e pesquisar livros.

### `com.library.test`
- **LibraryTest**: classe que contém testes unitários para garantir o correto funcionamento do sistema de gerenciamento de biblioteca.

## Técnicas de Engenharia de Software aplicadas
1. **Encapsulamento e modularidade**: Separamos a lógica do sistema em classes e pacotes distintos, cada um com responsabilidades específicas, garantindo um design modular e fácil de manter.
2. **Testes unitários**: Escrevemos testes unitários para cada funcionalidade do sistema, garantindo a qualidade do código e facilitando a detecção e correção de erros.
3. **Programação Orientada a Objetos**: Utilizamos os conceitos de herança, encapsulamento e polimorfismo para criar um design de software eficiente e de fácil manutenção.
4. **Princípios SOLID**: Seguimos os princípios SOLID de design de software para garantir um código limpo, modular e fácil de estender.

## Expansão do projeto
O projeto atualmente possui funcionalidades básicas de gerenciamento de biblioteca, como adicionar, remover, pesquisar e classificar livros. No entanto, pode ser expandido para incluir funcionalidades adicionais, como empréstimo de livros, gerenciamento de usuários e outras funcionalidades específicas de biblioteca.

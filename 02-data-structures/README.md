# 02 - Data Structures

Exercícios centrados em coleções, igualdade entre objetos e estruturas genéricas reutilizáveis.

## Conteúdo

### `list-basics/`
- `Main.java`: manipulação de `ArrayList`, inserção repetida de objetos e visualização da coleção.
- `User.java`: classe de apoio com `equals`, `toString` e encapsulamento básico.

### `generic-dao/`
- `src/domain/GenericDomain.java`: contrato para entidades com identificador.
- `src/domain/UserDomain.java` e `src/domain/ClientDomain.java`: domínios usados no DAO genérico.
- `src/dao/GenericDAO.java`: armazenamento em memória com operações de salvar, buscar, atualizar, excluir e contar.
- `src/dao/UserDAO.java` e `src/dao/ClientDAO.java`: especializações do DAO genérico.
- `src/Main.java`: ponto de entrada com testes das operações do DAO.

## O que este bloco demonstra

- `List`
- `ArrayList`
- `equals` e `hashCode`
- generics
- separação entre domínio e acesso a dados

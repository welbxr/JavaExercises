# 03 - OOP Principles

Exercícios focados em orientação a objetos, abstração e composição de comportamento.

## Conteúdo

### `enum-calculator/`
- `OperationEnum.java`: enum com comportamento associado a cada operação matemática.
- `Main.java`: menu de console para executar as operações selecionadas.

### `interfaces/01`
- `Comunicator.java`: interface com método padrão para envio de mensagens.
- `Main.java`: exemplos de implementação anônima.

### `interfaces/02`
- `TaxCalc.java`: contrato para cálculo de tributos.
- `Alimentacao.java`, `Cultura.java`, `SaudeBemEstar.java`, `Vestuario.java`: implementações com percentuais diferentes.
- `Main.java`: uso polimórfico das classes de cálculo.

### `interfaces/03`
- `Geometrics.java`: interface para cálculo de área.
- `Circle.java`, `Rectangle.java`, `Square.java`: implementações com `record`.
- `Main.java`: testes das áreas calculadas.

## O que este bloco demonstra

- interface
- polimorfismo
- enum com comportamento
- `record`
- organização por responsabilidade

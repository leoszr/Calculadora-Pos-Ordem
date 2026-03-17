# Calculadora Pós-Ordem

Aplicação web desenvolvida em Java para calcular expressões aritméticas na notação pós-ordem (pós-fixada), simulando o funcionamento de uma calculadora científica.

O projeto foi construído com foco em estruturas de dados, utilizando **fila dinâmica** e **pilha** como base para o processamento das expressões. Além disso, conta com interface web para facilitar a entrada de dados e a visualização dos resultados.

## Objetivo

Este projeto tem como objetivo aplicar, na prática, conceitos de:

- Estruturas de dados
- Manipulação e validação de expressões aritméticas
- Desenvolvimento web com Java
- Organização em camadas
- Tratamento de erros e exceções

Também funciona como um exercício prático para consolidar o uso de pilha e fila em um problema real de computação.

## Funcionalidades

- Inserção de expressões em notação pós-fixada
- Processamento da expressão com base em pilha
- Suporte a operações aritméticas
- Validação de entrada
- Exibição do resultado na interface web
- Tratamento de entradas inválidas

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Thymeleaf
- HTML
- CSS
- Maven
- JUnit

## Como executar o projeto

### Pré-requisitos

- Java 21 instalado
- Maven instalado

### Passos

1. Clone o repositório:

```bash
git clone https://github.com/leoszr/Calculadora-Pos-Ordem.git
```

2. Acesse a pasta do projeto:

```bash
cd Calculadora-Pos-Ordem
```

3. Execute a aplicação:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

4. Abra no navegador:

```text
http://localhost:8080
```

## Estrutura do projeto

O projeto segue uma organização baseada em aplicação Java com Spring Boot, separando a inicialização da aplicação, a lógica de negócio, os testes e os recursos da interface.

Exemplo de estrutura:

```text
src/
 ├── main/
 │   ├── java/
 │   └── resources/
 └── test/
     └── java/
```

## Como funciona a lógica

Na notação pós-fixada, os operadores aparecem depois dos operandos.

Exemplo:

```text
3 4 + 2 *
```

Processamento da expressão:

1. Empilha o `3`
2. Empilha o `4`
3. Encontra `+`, então desempilha dois valores e realiza a soma
4. Empilha o resultado
5. Empilha o `2`
6. Encontra `*`, então multiplica os dois últimos valores
7. Retorna o resultado final

Resultado:

```text
14
```

## Aprendizados aplicados

Durante o desenvolvimento deste projeto, foram praticados conceitos importantes como:

- Uso de pilha para avaliação de expressões
- Apoio de fila na organização da entrada
- Separação entre lógica de processamento e interface
- Validação de dados fornecidos pelo usuário
- Construção de aplicação web com Spring Boot

## Possíveis melhorias futuras

- Suporte a mais operadores
- Histórico de cálculos
- Melhorias visuais na interface
- Testes automatizados mais abrangentes
- Suporte a expressões com números decimais
- Mensagens de erro mais detalhadas

## Autor

Leonardo Rodrigues

## Observação

Este projeto foi desenvolvido com fins acadêmicos e de prática, com foco no aprendizado de estruturas de dados e no desenvolvimento de aplicações web com Java.

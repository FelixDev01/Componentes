### Componentes e Injeção de Dependência

## Projeto simples desenvolvido para treinar conceitos de componentes, injeção de dependências, coesão e criação de serviços em Java.

### Objetivo do projeto

Simular o cálculo de salário líquido de um funcionário considerando:

✔ Imposto de renda (TaxService)

✔ Desconto previdenciário (PensionService)

✔ Processamento de salário líquido (SalaryService)

Aplicando boas práticas de OOP, segregação de responsabilidades e injeção de dependências manual, substituindo implementações sem alterar a classe principal.

🛠️ Tecnologias e conceitos utilizados
Item	Uso
Java 17+	Linguagem principal
POO	Encapsulamento, composição, modularização
Injeção de dependência	Passagem de serviços via construtor
Classes de serviço	Responsabilidades isoladas
Scanner	Entrada de dados via terminal
## Estrutura do projeto
src/

 ├── entities/
 
 │   └── Employee.java
 
 ├── service/
 
 │   ├── TaxService.java
 
 │   ├── BrazilTaxService.java   // Implementação de imposto
 
 │   ├── PensionService.java     // Desconto previdenciário
 
 │   └── SalaryService.java      // Cálculo final do salário
 
 └── Main.java


## Execução

Ao rodar o programa, o usuário deve informar:

Nome do funcionário

Salário bruto

Exemplo de saída:

Digite o nome do funcionario:  João Silva
Digite o salario bruto desse funcionario:  4500

Salário líquido:  3520.50

### Pontos exercitados no projeto

Criação e uso de interfaces e implementações

Composição de objetos e dependências

Substituição de serviços sem modificar a lógica central

Separação clara de responsabilidades

Código limpo e facilmente escalável

## Próximos passos (ideias de melhoria)

✔ Adicionar mais países com diferentes regras de imposto
✔ Criar testes unitários (JUnit)
✔ Transformar em API REST usando Spring Boot
✔ Implementar logs e validações de entrada

## Licença

Este projeto é de estudo e livre para uso.

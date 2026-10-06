# Consumo de API Receita WS - Java

**Aluno:** Gabriel Razo Dantas  | ADS - FIAP  


## - Sobre o Projeto
Projeto desenvolvido em Java para consumir a API da **Receita WS** ([receitaws.com.br](https://receitaws.com.br/)), focado na busca de dados de empresas através do CNPJ.

## - Tecnologias e Estrutura
- **Linguagem:** Java
- **Bibliotecas:** `HttpClient` e `Gson`
- **Interface:** `JOptionPane` para entrada de dados.

**Estrutura de Serviços (Pasta `services`):**
- **Request:** Cria a requisição HTTP GET para a URL da API.
- **Client:** Executa a chamada HTTP.
- **Response:** Armazena a resposta recebida.
- **Entity:** Converte a resposta da API para `String`.

## - Como Executar
1. Abra o projeto no IntelliJ.
2. Execute a classe `TesteReceitaws` localizada em `src/main/java/br/com/fiap/main`.
3. Digite o CNPJ desejado na caixa de diálogo (utilize **apenas números**).

**CNPJs para teste:**
- **Banco do Brasil:** `00000000000191`
- **Associação Cultural Nossa Senhora de Fátima:** `02090452000137`

# 🚗 Sistema de Cadastro de Veículos em Java

## 📝 Descrição

Este é um projeto simples de um sistema de Cadastro, Leitura, Atualização e Exclusão (CRUD) de veículos, desenvolvido em Java puro. A aplicação roda diretamente no console e permite ao usuário gerenciar carros e motos, salvando as informações em um arquivo de texto (`CRUD.txt`).

O objetivo principal é demonstrar os conceitos de Programação Orientada a Objetos (POO), como classes abstratas, herança e interfaces.

---

## ⚙️ Principais Funcionalidades

-   **Cadastrar Veículos:** Adiciona novos carros ou motos ao sistema.
-   **Listar Veículos:** Exibe todos os veículos cadastrados.
-   **Editar Veículos:** Permite modificar informações de um veículo existente.
-   **Remover Veículos:** Exclui um veículo do sistema.
-   **Realizar Manutenção:** Registra o status de manutenção de um veículo.
-   **Persistência de Dados:** As informações são salvas em um arquivo `CRUD.txt` para manter o histórico entre as execuções.

---

## 💻 Tecnologias e Linguagens

-   **Linguagem:** Java
-   **Ambiente de Execução:** Console (CLI - Command-Line Interface)
-   **Gerenciamento de Dependências:** Nenhuma (Java puro)

---

## 📁 Estrutura de Pastas e Arquivos

O projeto está organizado da seguinte forma para separar responsabilidades:

```
/
├── .gitignore
├── .idea/
├── out/
├── src/
│   ├── Main.java           # Ponto de entrada da aplicação (menu interativo)
│   ├── Veiculo.java        # Classe abstrata base para todos os veículos
│   ├── Carro.java          # Classe que representa um Carro
│   ├── Moto.java           # Classe que representa uma Moto
│   └── OperacoesVeiculo.java # Interface para operações de manutenção
└── CRUD.txt                # Arquivo onde os dados são salvos
```

---

## ▶️ Passo a Passo de Execução

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/seu-usuario/sistema-cadastro-veiculos-java.git](https://github.com/seu-usuario/sistema-cadastro-veiculos-java.git)
    ```

2.  **Navegue até o diretório do projeto:**
    ```bash
    cd sistema-cadastro-veiculos-java
    ```

3.  **Compile os arquivos Java:**
    ```bash
    javac src/*.java -d out
    ```

4.  **Execute a aplicação:**
    ```bash
    java -cp out Main
    ```

Após a execução, um menu interativo será exibido no console, permitindo que você utilize todas as funcionalidades do sistema.

---

## 💡 Exemplo de Uso

Ao iniciar o programa, o seguinte menu será exibido:

```
-----CRUD-----
1-Cadastrar veículo
2-Listar todos os veículos
3-Editar Veiculos
4-Remover Veiculos
5-Realizar Manutenção
6-Sair
--------------------
Digite alguma opção:
```

Ao escolher a opção `1`, o sistema perguntará se deseja cadastrar um carro ou uma moto e solicitará as informações correspondentes.

---

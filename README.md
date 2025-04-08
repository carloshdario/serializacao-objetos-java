# 📂 Serialização de Objetos em Java - Algaworks

Este projeto demonstra como serializar e desserializar objetos em Java usando as classes `ObjectOutputStream` e `ObjectInputStream`. Ele simula a persistência de um objeto `Cliente` contendo informações de endereço e limite de crédito.

## ✨ Funcionalidades

- Criação de objeto `Cliente` com:
  - Nome
  - Endereço (rua, número, bairro)
  - Limite de crédito (`transient`, não é serializado)
- Serialização: gravação do objeto em arquivo `.ser`
- Desserialização: leitura do objeto do arquivo
- Demonstração do uso de `transient` e `serialVersionUID`

## 🧱 Estrutura do Projeto

```
desafio/
├── Cliente.java          # Classe principal serializável
├── Endereco.java         # Classe auxiliar serializável
├── Serializacao.java     # Programa que salva o objeto em arquivo
└── Desserializacao.java  # Programa que lê o objeto do arquivo
```

## ▶️ Como executar

1. Compile os arquivos:

```bash
javac desafio/*.java
```

2. Execute a serialização:

```bash
java desafio.Serializacao
```

3. Execute a desserialização:

```bash
java desafio.Desserializacao
```

📂 O arquivo gerado será salvo em `objetos/cliente.ser`.

## 💡 Conceitos abordados

- `Serializable`: interface usada para habilitar serialização.
- `transient`: impede que um campo seja serializado.
- `serialVersionUID`: identifica a versão da classe serializável.
- `ObjectOutputStream` / `ObjectInputStream`: gravação e leitura de objetos.

## 📌 Observações

- Após a desserialização, o campo `limiteCredito` será `null` porque foi marcado como `transient`.
- Caso a estrutura da classe seja modificada, o `serialVersionUID` ajuda a garantir compatibilidade.

---



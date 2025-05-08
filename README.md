
# Exemplo de Manipulação de Strings em Java

Este projeto Java demonstra várias operações comuns de manipulação de strings, como:

- Substrings
- Substituição de caracteres
- Verificação de prefixo e sufixo
- Remoção de espaços em branco
- Contagem de caracteres

## 📁 Estrutura do Projeto

```
src/
└── teste/
    ├── ExemploManipulacaoString.java
    └── TesteExemploManipulacaoString.java
```

> ⚠️ O arquivo `ExemploManipulacaoString.java` deve conter os métodos `getNomeTeste`, `setNomeTeste`, `getNumeroTeste` e `setNumeroTeste`.

## 🚀 Como Executar

1. Compile os arquivos `.java`:
   ```bash
   javac teste/*.java
   ```

2. Execute a classe principal:
   ```bash
   java teste.TesteExemploManipulacaoString
   ```

## 🧪 Funcionalidades Demonstradas

- `substring(início, fim)`: imprime partes do nome.
- `startsWith("Jonatas")`: verifica se o nome começa com `"Jonatas"`.
- `endsWith("bosa")`: verifica se o nome termina com `"bosa"`.
- `replace('a', '@')`: substitui caracteres.
- `trim()`: remove espaços no início e no fim.
- `length()`: calcula o tamanho da string.

## ✍️ Exemplo de Saída

```
Jonatas Lima Barbosa 1
Jonatas Lima Barbosa
nata
Jo
na
ta
tas L
atas L
tas Lim
Jonatas Lima
tas Lima
O nome começa com Jona
O nome não termina com bosa
J0n@t@s Lim@ B@rb0s@
 Jonatas 
Jonatas
Jonatas Lima
Quantidade de caracteres do nome 21
Jonatas Lima Barb
 J0n@t@s Lim@ B@rb0s@ 
Jonatas Lima Barbo
```

## 📚 Aprendizado

Este exemplo é útil para quem está começando em Java e quer praticar:

- Métodos da classe `String`
- Estrutura de métodos `get` e `set`
- Controle de fluxo com `if`

## 🧑‍💻 Autor

Jonatas Lima Barbosa  
Projeto de prática com strings em Java.

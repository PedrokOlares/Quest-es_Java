# Questão: Encapsulamento e Herança em Java (com getters, setters, construtores, `private` e `protected`)

## Objetivo
Praticar **classes**, **herança**, **encapsulamento**, **getters/setters**, **construtores**, `super`, `private` e `protected`.

---

## 1) Classe `Veiculo`
Crie o arquivo `Veiculo.java` com a classe `Veiculo`.

### Atributos
- `private`:
  - `String marca`
  - `int ano`
- `protected`:
  - `int velAtual`

### Construtores
- Construtor padrão (sem parâmetros)
- Construtor completo: `Veiculo(String marca, int ano, int velAtual)`

### Métodos
- `String getMarca()` / `void setMarca(String marca)`
- `int getAno()` / `void setAno(int ano)`
- `void acelerar(int incremento)` → soma `incremento` em `velAtual`
- `void frear(int decremento)` → diminui `velAtual`, mas **não pode ficar negativo** (se tentar ficar < 0, trave em 0)
- `String toString()` → devolve uma descrição formatada contendo `marca`, `ano` e `velAtual`

---

## 2 Classe `Carro` (herda de `Veiculo`)
Crie o arquivo `Carro.java` com a classe `Carro` que **estende** `Veiculo`.

### Atributo
- `private`:
  - `String nomeModelo`

### Construtores
- Construtor padrão
- Construtor completo: `Carro(String marca, int ano, int velAtual, String nomeModelo)` usando `super(marca, ano, velAtual)`

### Métodos
- `String getNomeModelo()` / `void setNomeModelo(String nomeModelo)`
- `public void buzinar()` → imprime no console: **`BEEP BEEP!`**
- Sobrescreva `toString()` para incluir também `nomeModelo`

---

## 3) Classe `CarroTestar`
Crie o arquivo `CarroTestar.java` com um `main` que:
1. Instancia um `Carro` usando o construtor completo
2. Mostra no console `marca` e `ano` **via getters**
3. Altera `nomeModelo` **via setter**
4. Chama `acelerar(30)` e depois `frear(10)`
5. Mostra `velAtual` (em `Carro`, por estar em `Veiculo` como `protected`, você consegue acessar no contexto adequado)
6. Chama `buzinar()`

---

## Regras / Critérios (para receber nota)
- `marca` e `ano` precisam ser `private` e acessados por **getters/setters**
- `velAtual` precisa ser `protected`
- `frear` não permite velocidade negativa
- Construtor de `Carro` deve usar `super(...)`
- Implementar herança e override de `toString()`

---

## Entrega
Envie os arquivos: `Veiculo.java`, `Carro.java` e `CarroTestar.java`.


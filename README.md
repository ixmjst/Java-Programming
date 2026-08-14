# Java — Programação Orientada a Objetos

[![Java](https://img.shields.io/badge/Java-007396?logo=openjdk&logoColor=white)](https://openjdk.org/)
[![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6?logo=apachenetbeanside&logoColor=white)](https://netbeans.apache.org/)

🇵🇹 [Português](#português) · 🇬🇧 [English](#english)

---

## Português

Lista de exercícios introdutórios de **Programação Orientada a Objetos** em Java.
Cada exercício isola um conceito, modelando uma entidade do mundo real com os seus
atributos e comportamentos.

### Exercícios

| Pasta | Classe | Conceito exercitado |
| --- | --- | --- |
| `exercicio1` | `Aluno` | Atributos, construtores e cálculo de média |
| `exercicio2` | `Televisor` | Estado interno e validação de limites (volume, canal) |
| `exercicio3` | `Funcionario1` | Encapsulamento e aumento salarial |
| `exercicio4` | `Caneta` | Modelação de estado com booleanos |
| `exercicio5` | `Cliente` | Composição de dados pessoais |
| `exercicio6` | `Lampada` | Alternância de estado (ligar/desligar) |
| `exercicio7` | `Pessoa` | Atributos básicos e métodos de acesso |
| `exercicio8` | `Porta` | Estado com pré-condições (abrir só se destrancada) |
| `exercicio9` | `Rectangulo` | Cálculo de área e perímetro |
| `exercicio10` | `Circulo` | Constantes e operações geométricas |
| `exercicio11` | `Funcionario` | Getters, setters e regras de negócio |
| `exercicio12` | `Livro` | Modelação com múltiplos atributos |
| `exercicio13` | `Agenda` + `Contato` | Relação entre classes e coleções |

A pasta `utils/` contém as classes de teste (`TesteAluno`, `TesteCirculo`, …), cada uma com
um `main` que instancia e exercita a classe correspondente.

### Como executar

```bash
git clone https://github.com/ixmjst/Java-Programming.git
cd Java-Programming/Lista1
javac -d build/classes src/**/*.java
java -cp build/classes utils.TesteAluno
```

Alternativamente, abre a pasta `Lista1` diretamente no **NetBeans** — o projeto já traz a
configuração (`build.xml`, `nbproject/`).

### Conceitos praticados

- Classes, objetos e construtores
- Encapsulamento com `private` e métodos de acesso
- Validação de estado dentro dos próprios métodos
- Relação entre classes (agregação em `Agenda` / `Contato`)
- Organização de código por pacotes

---

## English

An introductory exercise set on **Object-Oriented Programming** in Java. Each exercise
isolates one concept by modelling a real-world entity with its attributes and behaviours.

### Exercises

| Folder | Class | Concept |
| --- | --- | --- |
| `exercicio1` | `Aluno` (Student) | Fields, constructors and average calculation |
| `exercicio2` | `Televisor` (TV) | Internal state and bounds validation |
| `exercicio3` | `Funcionario1` (Employee) | Encapsulation and salary raise |
| `exercicio4` | `Caneta` (Pen) | Modelling state with booleans |
| `exercicio5` | `Cliente` (Customer) | Composing personal data |
| `exercicio6` | `Lampada` (Lamp) | State toggling |
| `exercicio7` | `Pessoa` (Person) | Basic fields and accessors |
| `exercicio8` | `Porta` (Door) | State with preconditions |
| `exercicio9` | `Rectangulo` | Area and perimeter |
| `exercicio10` | `Circulo` | Constants and geometry |
| `exercicio11` | `Funcionario` | Getters, setters and business rules |
| `exercicio12` | `Livro` (Book) | Modelling with multiple fields |
| `exercicio13` | `Agenda` + `Contato` | Class relationships and collections |

`utils/` holds the test classes, each with a `main` that exercises its counterpart.

### Running

```bash
git clone https://github.com/ixmjst/Java-Programming.git
cd Java-Programming/Lista1
javac -d build/classes src/**/*.java
java -cp build/classes utils.TesteAluno
```

You can also open `Lista1` directly in **NetBeans** — the project configuration is included.

### Concepts practised

- Classes, objects and constructors
- Encapsulation with `private` fields and accessors
- State validation inside methods
- Class relationships (aggregation in `Agenda` / `Contato`)
- Package organisation

---

<sub>Trabalho académico · José Simão Tala ([@ixmjst](https://github.com/ixmjst))</sub>

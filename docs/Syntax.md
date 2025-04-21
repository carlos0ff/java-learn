<h1 align="center">☕ Java - Sintaxe Básica</h1>
<p align="center">Exemplos simples e práticos para aprender a sintaxe essencial da linguagem Java.</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-17+-red?logo=java&logoColor=white)](https://www.oracle.com/java/)
[![License](https://img.shields.io/github/license/seu-usuario/java-sintaxe-basica?color=brightgreen)](LICENSE)
[![Author](https://img.shields.io/badge/author-seu_nome-blue)](https://github.com/seu-usuario)
[![Issues](https://img.shields.io/github/issues/seu-usuario/java-sintaxe-basica?color=orange)](https://github.com/seu-usuario/java-sintaxe-basica/issues)
[![Forks](https://img.shields.io/github/forks/seu-usuario/java-sintaxe-basica?style=social)](https://github.com/seu-usuario/java-sintaxe-basica/network/members)
[![Stars](https://img.shields.io/github/stars/seu-usuario/java-sintaxe-basica?style=social)](https://github.com/seu-usuario/java-sintaxe-basica/stargazers)

</div>

---

## 📚 Sobre

Este repositório foi criado como parte do Bootcamp Bradesco - Java Cloud Native, promovido pela DIO (Digital Innovation One).
O objetivo é consolidar o aprendizado de tecnologias voltadas para o desenvolvimento de aplicações modernas em Java, com foco em microsserviços, cloud computing e boas práticas de engenharia de software.

---

## 🧠 Conteúdo

### ✅ Estrutura básica de um programa Java

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");
    }
}
```
### 
```java
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Tipos primitivos numéricos
        byte b = 127;               // 1 byte (-128 a 127)
        short s = 32000;            // 2 bytes
        int i = 100000;             // 4 bytes
        long l = 10000000000L;      // 8 bytes (L no final)

        // Tipos ponto flutuante
        float f = 3.14f;            // 4 bytes (f no final)
        double d = 3.14159265359;   // 8 bytes

        // Outros tipos primitivos
        char c = 'A';               // 2 bytes (um caractere Unicode)
        boolean ativo = true;       // 1 bit (true ou false)

        // Impressão dos valores
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + ativo);
    }
}
```

### ✅ Tipos Primitivos

<table align="center">
  <thead>
    <tr>
      <th>Tipo</th>
      <th>Tamanho</th>
      <th>Valor Padrão</th>
      <th>Faixa</th>
      <th>Exemplo</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>byte</td>
      <td>1 byte</td>
      <td>0</td>
      <td>-128 a 127</td>
      <td><code>byte b = 127;</code></td>
    </tr>
    <tr>
      <td>short</td>
      <td>2 bytes</td>
      <td>0</td>
      <td>-32.768 a 32.767</td>
      <td><code>short s = 123;</code></td>
    </tr>
    <tr>
      <td>int</td>
      <td>4 bytes</td>
      <td>0</td>
      <td>-2³¹ a 2³¹-1</td>
      <td><code>int i = 1000;</code></td>
    </tr>
    <tr>
      <td>long</td>
      <td>8 bytes</td>
      <td>0L</td>
      <td>-2⁶³ a 2⁶³-1</td>
      <td><code>long l = 99L;</code></td>
    </tr>
    <tr>
      <td>float</td>
      <td>4 bytes</td>
      <td>0.0f</td>
      <td>±3.4E-38 a ±3.4E+38</td>
      <td><code>float f = 1.5f;</code></td>
    </tr>
    <tr>
      <td>double</td>
      <td>8 bytes</td>
      <td>0.0d</td>
      <td>±1.7E-308 a ±1.7E+308</td>
      <td><code>double d = 3.14;</code></td>
    </tr>
    <tr>
      <td>char</td>
      <td>2 bytes</td>
      <td>'\u0000'</td>
      <td>0 a 65.535 (Unicode)</td>
      <td><code>char c = 'A';</code></td>
    </tr>
    <tr>
      <td>boolean</td>
      <td>1 bit</td>
      <td>false</td>
      <td>true ou false</td>
      <td><code>boolean ativo = true;</code></td>
    </tr>
  </tbody>
</table>


### 🔤 Tipos de dados e variáveis
```java
public class TiposVariaveis {
    public static void main(String[] args) {
        int idade = 25;
        double altura = 1.75;
        boolean ativo = true;
        char inicial = 'J';
        String nome = "Carlos";

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Ativo: " + ativo);
        System.out.println("Inicial: " + inicial);
    }
}
```

### ➗ Operadores
```java
public class Operadores {
    public static void main(String[] args) {
        int a = 10, b = 5;
        int soma = a + b;
        boolean resultado = (a > b) && (b < 10);

        System.out.println("Soma: " + soma);
        System.out.println("Resultado lógico: " + resultado);
    }
}
```

### 🔀 Estruturas condicionais
```java
public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 16;

        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
```

### 🔁 Estruturas de repetição
```java
public class EstruturasRepeticao {
    public static void main(String[] args) {
        System.out.println("Laço for:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        System.out.println("Laço while:");
        int a = 0;
        while (a < 3) {
            System.out.println(a);
            a++;
        }
    }
}

```

### 🔣 Arrays (Vetores)
```java
public class ArraysSimples {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        System.out.println("Primeiro número: " + numeros[0]);

        System.out.println("Todos os números:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
```

### 🧩 Métodos (Funções)
```java
public class Metodos {
    public static void main(String[] args) {
        int resultado = somar(3, 4);
        System.out.println("Resultado da soma: " + resultado);
    }

    public static int somar(int x, int y) {
        return x + y;
    }
}

```
### 🧱 Classes e Objetos
```java
public class ClassPerson {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.nome = "Carlos";
        p.idade = 25;

        p.dizerOla();
    }
}

class Person {
    String nome;
    int idade;

    void dizerOla() {
        System.out.println("Olá! Meu nome é " + nome);
    }
}

```
### 
```java

```
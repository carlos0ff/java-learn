<h1 align="center">💻 Java learn </h1>
<p align="center">Uma experiência bancária minimalista diretamente no terminal.</p>

<p align="center">
  <a href="https://github.com/sponsors/carlos0ff">
    <img src="https://img.shields.io/badge/Sponsor-%23EA4AAA.svg?style=for-the-badge&logo=github-sponsors&logoColor=white" alt="Sponsor">
  </a>
  <a href="https://github.com/carlos0ff/java-learn/stargazers">
    <img src="https://img.shields.io/github/stars/carlos0ff/java-learn?style=for-the-badge&color=yellow" alt="Stars">
  </a>
  <a href="https://github.com/carlos0ff/java-learn/network/members">
    <img src="https://img.shields.io/github/forks/carlos0ff/java-learn?style=for-the-badge&color=blue" alt="Forks">
  </a>
  <a href="https://github.com/carlos0ff/java-learn/issues">
    <img src="https://img.shields.io/github/issues/carlos0ff/java-learn?style=for-the-badge&color=green" alt="Issues">
  </a>
  <a href="https://github.com/carlos0ff/java-learn/blob/main/LICENSE">
    <img src="https://img.shields.io/badge/license-MIT-green?style=for-the-badge&logo=open-source-initiative" alt="License">
  </a>
</p>

---

## 📚 Project Structure

```bash
src/
└── br/com/javalearn/
    ├── basics/           # Java fundamentals (variables, methods, operators)
    ├── collections/      # Collection framework examples (ArrayList, etc.)
    ├── database/         # Future database interaction examples
    ├── oop/              # Core OOP principles (inheritance, polymorphism, etc.)
    └── threads/          # Multithreading examples
Main.java                # Entry point to run demos
```
--- 

## 📁 Folder Overview

- `basics/`: Java fundamentals like variables, operators, control flow.
- `collections/`: Examples with Java collections (ArrayList, etc.).
- `oop/`: Core object-oriented programming concepts.
- `threads/`: Multithreading and concurrency.
- `database/`: Future DB interaction examples.

---

## 📦 Packages and Descriptions

### ✅ `basics/`
- `HelloWorld.java` – The classic Hello World.
- `ControlFlow.java` – if/else, loops, and switch statements.
- `VariablesAndDataTypes.java` – Java primitive and reference types.
- `Operators.java` – Arithmetic, logical, and comparison operators.
- `Methods.java` – Defining and using methods.

### 🧱 `collections/`
- ArrayListExample.java – Using dynamic arrays with ArrayList.
- HashMapExample.java – Key-value storage with HashMap.
- LinkedListExample.java – Doubly linked list implementation.
- SetExample.java – Working with HashSet and uniqueness.
- IteratorExample.java – Iterating through collections.
- CollectionsUtility.java – Using Collections class (sort, reverse, shuffle).

### 🔐 `oop/`
- `Person.java` – A base class to demonstrate inheritance.
- `Encapsulation.java` – Hiding data using getters/setters.
- `Inheritance.java` – Extending classes and using `super`.
- `Polymorphism.java` – Method overriding and dynamic dispatch.
- `AbstractClasses.java` – Using `abstract` keyword.
- `InnerInterfaces.java` – Working with interfaces.

### 🔄 `threads/`
- SimpleThread.java – Creating threads by extending Thread.
- RunnableExample.java – Implementing the Runnable interface.
- ThreadSleep.java – Delays and timing using Thread.sleep().
- SynchronizationExample.java – Handling race conditions with synchronized.
- ThreadPoolExample.java – Managing threads with ExecutorService.

### 🗃️ `database/`
- JDBCConnection.java – Connecting to a MySQL database using JDBC.
- InsertDataExample.java – Inserting records into a database.
- ReadDataExample.java – Retrieving and displaying data from a table.
- PreparedStatementExample.java – Using prepared statements to avoid SQL injection.
- UpdateAndDeleteExample.java – Performing update and delete operations.
- DatabaseUtils.java – Utility class for managing connections and resources.

---

📌 TODO
Add examples using HashMap and Set
Add file handling and exceptions
Add database CRUD example with JDBC
Add threading examples
Add basic GUI with JavaFX or Swing

---
## 🎯 How to Run

Compile and run using terminal or your IDE (e.g., VS Code):

```bash
javac src/br/com/javalearn/Main.java
java br.com.javalearn.Main
```

## 🚀 Requirements
- Java JDK 8 or higher
- A code editor or IDE (e.g., IntelliJ, VS Code)
- Basic command-line knowledge (for compiling and running)
- MySQL or another relational DBMS (for database examples)
- JDBC driver configured in your classpath

## 🤝 Contributing
Contributions are welcome! If you'd like to add examples, improve the structure, or translate content — feel free to fork this repo and open a pull request.

## 👨‍💻 Author
Created by ()[] – feel free to reach out!

## 📄 License
This project is licensed under the MIT License.

---

Let me know if you want this version tailored to a GitHub Pages setup, or to auto-generate it from folder structure.

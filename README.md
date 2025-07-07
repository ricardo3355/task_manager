
📌 Gerenciador de Tarefas - API RESTful em Java

Este é um projeto de API RESTful desenvolvido em Java com o objetivo de gerenciar tarefas de forma simples, didática e eficiente.

---

🎯 Descrição do Projeto

O projeto consiste na criação de uma API RESTful para gerenciamento de tarefas (CRUD), utilizando o framework Spring Boot e seguindo boas práticas de desenvolvimento.  

Foi implementado o uso de:
- ✅ JUnit para testes unitários  
- 🧪 Postman para testes de requisições HTTP  
- 💾 Persistência de dados com Spring Data JPA  
- 🔗 Injeção de dependências com Spring Framework  
- 🌐 Spring Boot, que facilita a criação e configuração de aplicações Java  
- 🖼️ Thymeleaf, para fins de estruturação ou expansão futura para visualização (opcional)
- 🕓 Timestamp, para controle de tempo em registros  
- 🧱 Tomcat, servidor embutido utilizado automaticamente no Spring Boot  

---

🏗️ Estrutura e Inicialização

O projeto foi iniciado com o Maven, um sistema de automação e gerenciamento de dependências e builds para projetos Java.

🔧 Spring Boot Initializr

A estrutura base foi gerada utilizando o Spring Boot Initializr (https://start.spring.io), onde foram injetadas as seguintes dependências:

- Spring Web  
- Spring Data JPA  
- MySQL Driver  
- Thymeleaf  
- Spring Boot DevTools  
- Lombok (opcional)

---

⚙️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Postman
- JUnit
- Thymeleaf
- Tomcat

---

🧪 Exemplos de Requisições

### Criar tarefa

POST /tarefas

{
    "nome": "Desenvolvimento da API",
    "dataEntrega": "2025-12-12",
    "responsavel": "Ricardo RU 0000000"
}

### Atualizar tarefa

PUT /tarefas/{id}

### Deletar tarefa

DELETE /tarefas/{id}

### Buscar todas tarefas

GET /tarefas

---

🧑‍💻 Autor

- Ricardo Souza  
- 📧 ricardo3355@gmail.com

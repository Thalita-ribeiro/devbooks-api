### ✨ Visão Geral Técnica

A aplicação **DevBooks API** é construída com **Java e Spring Boot**, adotando arquitetura **MVC** e seguindo boas práticas de desenvolvimento de APIs RESTful. Seu principal objetivo é oferecer uma solução eficiente para gerenciamento de livros com armazenamento em memória, evoluindo futuramente para integração com banco de dados relacional, autenticação JWT, e recursos adicionais como notificações e documentação automatizada.

---

### 🧩 Funcionalidades da Versão Atual

- ✅ CRUD completo de livros (GET, POST, PUT, DELETE)
- 📖 Filtro por status de leitura: `Planejado`, `Lendo`, `Finalizado`
- 🚫 Regras de negócio:
    - Impede duplicidade de livros por usuário
    - Bloqueia exclusão de livros com status `Lendo` ou `Finalizado`
- 🧪 Testes de todos os endpoints via **Postman**

---

### ✨ Visão Geral Técnica

A aplicação **DevBooks API** é construída com **Java e Spring Boot**, adotando arquitetura **MVC** e seguindo boas
práticas de desenvolvimento de APIs RESTful. Seu principal objetivo é oferecer uma solução eficiente para gerenciamento
de livros com armazenamento em memória, evoluindo futuramente para integração com banco de dados relacional,
autenticação JWT, e recursos adicionais como notificações e documentação automatizada.

---

### 🧩 Funcionalidades da Versão Atual

- ✅ CRUD completo de livros (GET, POST, PUT, DELETE)
- 📖 Filtro por status de leitura: `Planejado`, `Lendo`, `Finalizado`
- 🚫 Regras de negócio:
    - Impede duplicidade de livros por usuário
    - Bloqueia exclusão de livros com status `Lendo` ou `Finalizado`
- 🧪 Testes de todos os endpoints via **Postman**

---

## 👤 Cadastro de Usuário

A API permite o registro de usuários com os seguintes campos obrigatórios:

- `id` — Identificador único do usuário
- `nome` — Nome completo
- `email` — Endereço de e-mail único
- `telefone` — Número de celular para contato
- `dataDeNascimento` — Data de nascimento no formato `YYYY-MM-DD`
- `cpf` — Cadastro de Pessoa Física (armazenado com segurança conforme LGPD)
- `senha` — Criptografada usando BCrypt
- `dataCadastro` — Registro automático da data em que o perfil foi criado

---

## 📚 Cadastro de Livros

Cada livro é vinculado ao usuário por meio de seu `usuarioId`. Os campos obrigatórios são:

- `id` — Identificador único do livro
- `titulo` — Título da obra
- `autor` — Nome do autor
- `descricao` — Observações ou sinopse personalizadas
- `status` — Estado da leitura: `Planejado`, `Lendo` ou `Finalizado`
- `nota` — Avaliação pessoal do livro (0 a 5 estrelas)
- `dataCadastro` — Quando o livro foi adicionado ao catálogo
- `dataFinalizacao` — Quando o usuário concluiu a leitura
- `usuarioId` — ID do usuário proprietário do livro
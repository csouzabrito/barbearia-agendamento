# Entrega 01 — Estrutura inicial do backend

## Implementado
- Projeto Maven com Java 21 e Spring Boot 3.4.4.
- Entidades JPA: Cliente, Profissional, Servico e Agendamento.
- Agendamento armazena início, fim calculado pela duração e status.
- Repository de clientes e endpoints GET /api/clientes, GET /api/clientes/{id}, POST /api/clientes.
- H2 em memória para testes locais.
- Teste de inicialização do contexto Spring.

## Como executar
Requisitos: JDK 21 e Maven 3.9+.

```bash
cd backend
mvn spring-boot:run
```

Criar cliente:
```bash
curl -X POST http://localhost:8080/api/clientes -H "Content-Type: application/json" -d '{"nome":"Cliente Teste","telefone":"11999999999","email":"teste@example.com"}'
```

Listar clientes:
```bash
curl http://localhost:8080/api/clientes
```

Testes:
```bash
mvn test
```

## Limitações e próximos passos
- O código foi publicado, mas ainda não foi compilado ou testado neste ambiente.
- H2 perde os dados ao reiniciar.
- Endpoints de profissionais, serviços e agendamentos ainda não existem.
- Regra de prevenção de conflito de horários e proteção contra concorrência ainda não implementadas.
- PostgreSQL, migrations, Vue e Docker serão incluídos em entregas posteriores.

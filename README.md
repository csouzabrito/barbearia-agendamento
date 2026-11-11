# Barbearia Agendamento

Aplicação experimental para agendamento de serviços de barbearia.

## Stack planejada

- Backend: Java 21, Spring Boot, Maven
- Frontend: Vue.js 3, Vite
- Banco de dados: PostgreSQL (H2 para testes locais, se necessário)
- API REST com validação de conflitos de horários
- Testes: JUnit e testes de integração

## Escopo do MVP

1. Cadastro de clientes e profissionais.
2. Catálogo de serviços, preços e duração.
3. Consulta de horários disponíveis.
4. Criação, consulta, reagendamento e cancelamento de agendamentos.
5. Prevenção de sobreposição de agendamentos por profissional.
6. Visão administrativa da agenda.

## Organização proposta

- `backend/`: API Spring Boot
- `frontend/`: interface Vue 3
- `database/`: scripts e migrações
- `docs/`: decisões técnicas e documentação

## Acompanhamento

As entregas serão incrementais, com descrição das alterações, decisões técnicas, testes e próximos passos. Este README registra apenas o planejamento inicial; a aplicação ainda não está implementada.

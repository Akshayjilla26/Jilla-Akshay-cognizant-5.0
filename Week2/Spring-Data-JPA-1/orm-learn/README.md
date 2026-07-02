# orm-learn — Spring Data JPA Exercise 1

Basic object-relational mapping exercise: a `Country` entity persisted to an
in-memory H2 database via Spring Data JPA, with a repository (query derivation)
and a service layer wrapping CRUD operations.

## Run

```bash
mvn spring-boot:run
```

The `CommandLineRunner` bean seeds a few countries, lists all of them, filters
by continent, and demonstrates an update.

H2 console: `http://localhost:8080/h2-console` (JDBC URL `jdbc:h2:mem:ormlearndb`).

# employee-jpa-demo — Spring Data JPA Exercise 2

CRUD operations on an `Employee` entity using Spring Data JPA, backed by an
in-memory H2 database.

## Run

```bash
mvn spring-boot:run
```

Seeds three employees, filters by department and salary, then updates one
employee's salary to demonstrate the full CRUD cycle.

H2 console: `http://localhost:8080/h2-console` (JDBC URL `jdbc:h2:mem:employeedb`).

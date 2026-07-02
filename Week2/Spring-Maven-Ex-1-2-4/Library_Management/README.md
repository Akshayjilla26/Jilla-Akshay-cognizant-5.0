# Library Management System — Spring & Maven (Ex 1, 2, 4)

Week 2 mandatory exercise for the Cognizant FSE training.

## What each exercise demonstrates

| Exercise | Concept | Where |
|---|---|---|
| Ex 1 | XML-based Spring configuration, singleton bean scope | `src/main/resources/applicationContext.xml`, `beans/Librarian.java` |
| Ex 2 | Annotation-based dependency injection (`@Service`, `@Autowired`) | `service/BookService.java` |
| Ex 4 | Full Spring Boot app + Spring Data JPA persistence | `LibraryManagementApplication.java`, `model/Book.java`, `repository/BookRepository.java` |

## How to run

```bash
mvn spring-boot:run
```

On startup the app:
1. Loads the `librarian` bean from `applicationContext.xml` and shows that requesting it twice returns the same singleton instance.
2. Seeds three books into an in-memory H2 database via `BookService`, lists them, then issues one book and shows the remaining available books.

H2 console: `http://localhost:8080/h2-console` (JDBC URL `jdbc:h2:mem:librarydb`, user `sa`, no password).

## Import into IntelliJ
Open the folder as a Maven project (`File > Open`, select this folder, IntelliJ will detect `pom.xml`).

# Week 2 — Mandatory Exercises (Cognizant FSE Training)

This folder mirrors the Week 2 mandatory structure and contains three
independent Maven/Spring Boot projects. Each has its own `pom.xml` and can
be opened/imported and run separately in IntelliJ IDEA.

| Folder | Exercise | Theme |
|---|---|---|
| `Spring-Maven-Ex-1-2-4/Library_Management` | Spring & Maven (Ex 1, 2, 4) | XML config, annotation DI, Spring Boot + JPA — Library/Book domain |
| `Spring-Data-JPA-1/orm-learn` | Spring Data JPA Exercise 1 | ORM basics, CRUD — Country domain |
| `Spring-Data-JPA-2/employee-jpa-demo` | Spring Data JPA Exercise 2 | CRUD, derived queries — Employee domain |

## To run any project

```bash
cd <project-folder>
mvn spring-boot:run
```

## To import into IntelliJ
`File > Open` → select the individual project folder (the one containing its
`pom.xml`) → IntelliJ auto-detects it as a Maven project.

## Suggested repo layout
Copy these three folders into your `Jilla-Akshay-cognizant-5.0` repo under a
`Week2/mandatory/` path, matching your Week 1 structure, then commit and push.

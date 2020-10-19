# Spring Data JPA
A Spring Boot application demonstrating the use of Spring Data JPA with H2 in-memory database.

## Entities
* Author *{many-to-many with **Book**}*
* Book *{many-to-many with **Author**}* *{one-to-one with **Publisher**}*
* Publisher

## Repositories
* AuthorRepository
* BookRepository
* PublisherRepository


*Database is initialized by ApplicationListener on Spring's ContextRefreshedEvent.*

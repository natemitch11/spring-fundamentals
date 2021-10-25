package com.pluralsight.fundamentals.resources;

public class AccessingDataH2 {
    /*
    H2 creates an in-memory database that is easy to set up and configure in a development environment. Data does not
     persist however
    1. include h2database as a dependency
    defaults:

    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=
    spring.h2.console.enabled=false

    MAKE SURE YOU OVERRIDE THESE DEFAULTS
    spring.h2.console.enabled=true********
    spring.h2.console.path=/h2************
    spring.datasource.url=jdbc:h2:mem:**NAME OF YOUR DB******

    2. When you have added spring-boot-starter-data-jpa as a dependency it adds in some key dependencies to your
    project namely: Hibernate, Spring Data JPA, Spring ORM
    JPA = Java Persistence API
    ORM = Object Relational Mapping

    3. Entities are objects that live in a DB and are annotated with @Entity
    You can use annotations now with the Spring Dependencies installed to quickly map your objects to your DB
    @Entity -- states its this class should be mapped to a table. No name provided defaults to a table named the same
     thing as the class/object
    @Id -- states the object is considered an ID
    @GeneratedValue(strategy = GenerationType.AUTO) -- states that this value should be generated automatically
    @Column(name = "app_name", nullable = false) -- states that this value should be stored in a column named 'named'
     and cannot be null

     4. Create repositories directory and place Interfaces within the new directory. These interfaces allow you to
     create JPA queries without the boiler plate code when you extend CrudRepository. eg:

     public interface SpringInitializrDemo extends CrudRepository<Application(entity), Long(id)>{}

     then in your main class you can initialize the interface for use

     5. to navigate to the DB in your browser navigate to the localhost:PORT/PATH
     in this case "localhost:PORT/h2" and you will be able to login to the DB and view its contents and write SQL to
     view contents

     */
}

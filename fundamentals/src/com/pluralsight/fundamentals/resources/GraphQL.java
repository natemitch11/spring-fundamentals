package com.pluralsight.fundamentals.resources;

public class GraphQL {
    /*
    GraphQL is a query language for API's

    the dependencies needed are:
    graphql-spring-boot-starter
    graphql-java-tools -- helps parse the schema

    schema: defines the data points offered, data types and relationships, operations available
    (SEE DEMO FILES FOR EXAMPLE QUERY FILE) query files end it .graphqls

    You can define which mutations are permissible inside of the schema. Mutations are the changes you make to your
    DB then in your class you can create the methods related to the mutations

    error handling is similar to REST api logic you just need to extend RuntimeException and implement GraphQLError

    Be sure to view Demo Files to view examples for the GraphQL API implementation


    ------------------------------------------------ACTUATOR----------------------------------------------------------
    You can also establish custom health metrics within the Actuator capacity of Spring.
    This could include a health status if an external API is not running it could show a message to you saying the
    endpoint isnt running, and giving info why your endpoint is not running.
     */
}

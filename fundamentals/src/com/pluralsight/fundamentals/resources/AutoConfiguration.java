package com.pluralsight.fundamentals.resources;

public class AutoConfiguration {
    /*Navigate to the resources directory inside the package created by either the springCLI or Spring Initializr and
    go to application.properties. Inside of application.properties add a line that says:

    logging.level.org.springframework: DEBUG

    this enables debugging and generates the common things used to debug your application.

    You can define what profile is active at which time when using spring. You can define the profiles by creating new
    application.properties files.

    there are many properties and can be found at
    https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html

    such as applications-dev.properties -> dev profile
    such as applications-test.properties -> Test/QA profile
    such as applications-prod.properties -> Production profile

    then you can also set which profile is active inside of the application.properties file by stating
    spring.profiles.active = {profile}

    */
}

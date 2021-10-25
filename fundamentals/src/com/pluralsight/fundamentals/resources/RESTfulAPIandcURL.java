package com.pluralsight.fundamentals.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class RESTfulAPIandcURL {
    /*
    Annotate the controller class with:
    @RestController  --- this simplifies object data into JSON
    @RequestMapping("/PATH")  --- this simplifies the path for future endpoints eg. google.com/api/search... "/api"
    would be the request map
    @GetMapping("/ENDPOINT") -- maps the endpoints as well as their type

    ---------------------------------------EXAMPLE ENDPOINT---------------------------------------
    @GetMapping("/applications")
    public ResponseEntity<List<Application>> getAllApplications(){
        List<Application> list = applicationService.listApplications();
        return new ResponseEntity<List<Application>>(list, HttpStatus.OK);
        }

        you can test endpoints with cURL from the terminal with curl URL.
        you can also use POSTMAN

     ResponseEntity is a generic so it can return various things.

     Exception Handling is easy to accomplish with Spring.
     ResponseStatusException -- Exception to use.

     create a new class to handle exceptions. Then create a new instance of the class to use with your REST
     controllers. then you can add try-catch blocks to your endpoints.

        */
}

# Hello World RESTful Web Service

## Objective

To create a simple **RESTful Web Service** using Spring Boot that returns the message **"Hello World!!"** for an HTTP GET request.

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Maven
- Postman

---

## HelloController.java

Create the package:

```
com.cognizant.springlearn.controller
```

Create the class:

```java
package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public String sayHello() {

        LOGGER.info("START");

        String message = "Hello World!!";

        LOGGER.info("END");

        return message;
    }
}
```

---

## application.properties

```properties
server.port=8083

logging.level.org.springframework=info
logging.level.com.cognizant=debug
```

---

## Maven Commands

Build Project

```bash
mvn clean package
```

Run Project

```bash
mvn spring-boot:run
```

---

## API Details

| Method | Endpoint | Response |
|--------|----------|----------|
| GET | `/hello` | Hello World!! |

---

## Sample Request

```
GET http://localhost:8083/hello
```

---

## Sample Response

```text
Hello World!!
```

---

## Expected Console Output

```
INFO START
INFO END
```

---

## Testing

### Using Browser

```
http://localhost:8083/hello
```

### Using Postman

- Method: **GET**
- URL:

```
http://localhost:8083/hello
```

Response:

```text
Hello World!!
```


---

## Conclusion

This hands-on demonstrates how to develop a basic RESTful web service using Spring Boot. The application exposes a GET endpoint that returns a simple text response, providing a foundation for building more advanced REST APIs.

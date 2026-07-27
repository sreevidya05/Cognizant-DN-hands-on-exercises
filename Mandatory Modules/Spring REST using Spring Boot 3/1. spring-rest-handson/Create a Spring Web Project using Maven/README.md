# Spring Web Project using Maven

## Brief :

To create a basic **Spring Boot Web Application** using Maven and understand the project structure, Spring Boot application lifecycle, Maven dependencies, and logging.

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Web
- Spring Boot DevTools
- Maven
- Eclipse IDE

---

## Dependencies

- Spring Boot DevTools
- Spring Web

---

## SpringLearnApplication.java

```java
package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SpringLearnApplication.class, args);

        LOGGER.info("Inside main");

    }

}
```

---

## application.properties

```properties
logging.level.org.springframework=info
logging.level.com.cognizant=debug
```

---

## pom.xml

```xml
<dependencies>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
    </dependency>

</dependencies>
```

---

## Maven Commands

Build Project

```bash
mvn clean package
```

Build with Proxy

```bash
mvn clean package ^
-Dhttp.proxyHost=proxy.cognizant.com ^
-Dhttp.proxyPort=6050 ^
-Dhttps.proxyHost=proxy.cognizant.com ^
-Dhttps.proxyPort=6050 ^
-Dhttp.proxyUser=123456
```

Run Application

```bash
mvn spring-boot:run
```

---


## Conclusion

This hands-on demonstrates the creation of a basic Spring Boot Web application using Maven. It provides an understanding of project setup, dependency management, application startup, and logging, forming the foundation for developing RESTful web services with Spring Boot.

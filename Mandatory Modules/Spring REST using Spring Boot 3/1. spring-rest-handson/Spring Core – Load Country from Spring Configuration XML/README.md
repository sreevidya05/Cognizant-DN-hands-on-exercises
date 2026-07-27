# Spring Core – Load SimpleDateFormat from Spring Configuration XML

## Brief :

To demonstrate how to configure and load a **SimpleDateFormat** bean from a Spring XML configuration file using the Spring Core IoC Container.

---

## Technologies Used

- Java
- Spring Boot
- Spring Core
- Spring Context
- Maven

---

## XML Configuration (date-format.xml)

Create `date-format.xml` inside `src/main/resources`.

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="dateFormat"
          class="java.text.SimpleDateFormat">

        <constructor-arg value="dd/MM/yyyy"/>

    </bean>

</beans>
```

---

## SpringLearnApplication.java

```java
package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {

    public static void main(String[] args) throws Exception {

        SpringApplication.run(SpringLearnApplication.class, args);

        displayDate();

    }

    private static void displayDate() throws Exception {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("date-format.xml");

        SimpleDateFormat format =
                context.getBean("dateFormat", SimpleDateFormat.class);

        Date date = format.parse("31/12/2018");

        System.out.println(date);

    }

}
```

---

## application.properties

```properties
logging.level.org.springframework=info
logging.level.com.cognizant=debug

# Change port if 8080 is already in use
server.port=8081
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


## Conclusion

This hands-on demonstrates how Spring Core manages object creation through XML-based bean configuration. By defining `SimpleDateFormat` as a Spring bean, the application promotes reusability, centralized configuration, and better maintainability.

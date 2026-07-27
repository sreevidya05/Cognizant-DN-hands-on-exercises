# REST - Country Web Service

## Objective

To develop a RESTful Web Service that returns the details of **India** by loading a Spring bean from an XML configuration file and returning it as a JSON response.

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Core
- Maven

---

## country.xml

Create `country.xml` inside `src/main/resources`.

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="country"
          class="com.cognizant.springlearn.model.Country">

        <property name="code" value="IN"/>
        <property name="name" value="India"/>

    </bean>

</beans>
```

---

## Country.java

```java
package com.cognizant.springlearn.model;

public class Country {

    private String code;
    private String name;

    public Country() {
    }

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
```

---

## CountryController.java

```java
package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @RequestMapping("/country")
    public Country getCountryIndia() {

        LOGGER.info("START");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country =
                context.getBean("country", Country.class);

        LOGGER.info("END");

        return country;
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
|---------|----------|----------|
| GET | `/country` | Country Details (JSON) |

---

## Sample Request

```
GET http://localhost:8083/country
```

---

## Sample Response

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## Expected Console Output

```
INFO START
INFO END
```

---

## Testing

### Browser

```
http://localhost:8083/country
```

### Postman

- Method: **GET**
- URL:

```
http://localhost:8083/country
```

Response

```json
{
    "code": "IN",
    "name": "India"
}
```

---

## Conclusion

This hands-on demonstrates how to build a RESTful web service in Spring Boot that loads a bean from an XML configuration file and returns it as a JSON response. Spring Boot automatically converts the Java object into JSON using Jackson, making it easy to expose REST APIs.

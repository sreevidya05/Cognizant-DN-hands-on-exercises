# REST - Get Country Based on Country Code

## Objective

To develop a RESTful Web Service that retrieves country details based on the country code provided in the URL. The country code matching is **case-insensitive**.

---

## Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Core
- Maven

---

## country.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans
       https://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="countryList" class="java.util.ArrayList">

        <constructor-arg>
            <list>

                <bean class="com.cognizant.springlearn.model.Country">
                    <property name="code" value="IN"/>
                    <property name="name" value="India"/>
                </bean>

                <bean class="com.cognizant.springlearn.model.Country">
                    <property name="code" value="US"/>
                    <property name="name" value="United States"/>
                </bean>

                <bean class="com.cognizant.springlearn.model.Country">
                    <property name="code" value="JP"/>
                    <property name="name" value="Japan"/>
                </bean>

            </list>
        </constructor-arg>

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

## CountryService.java

```java
package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {

    @SuppressWarnings("unchecked")
    public Country getCountry(String code) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        List<Country> countries =
                (List<Country>) context.getBean("countryList");

        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
```

---

## CountryController.java

```java
package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        LOGGER.info("START");

        Country country = countryService.getCountry(code);

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

| Method | Endpoint | Description |
|---------|----------|-------------|
| GET | `/countries/{code}` | Returns country details based on country code |

---

## Sample Request

```
GET http://localhost:8083/countries/in
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


## Conclusion

This hands-on demonstrates how to build a RESTful API that retrieves country details dynamically using a path variable. The service loads data from a Spring XML configuration file, performs a case-insensitive search, and returns the matching country as a JSON response.

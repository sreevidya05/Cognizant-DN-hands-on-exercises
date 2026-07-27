# Create Authentication Service that Returns JWT

## Objective

To create an authentication service that validates user credentials and generates a **JSON Web Token (JWT)**. The generated token is returned to the client and can be used for securing REST APIs.

---

## Technologies Used

- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Maven

---

## Dependencies (pom.xml)

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>

<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt</artifactId>
    <version>0.9.1</version>
</dependency>
```

---

## JwtTokenUtil.java

```java
package com.cognizant.springlearn.util;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JwtTokenUtil {

    private static final String SECRET_KEY = "secretkey";

    public static String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1200000))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
```

---

## AuthenticationResponse.java

```java
package com.cognizant.springlearn.model;

public class AuthenticationResponse {

    private String token;

    public AuthenticationResponse() {
    }

    public AuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
```

---

## AuthenticationController.java

```java
package com.cognizant.springlearn.controller;

import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.AuthenticationResponse;
import com.cognizant.springlearn.util.JwtTokenUtil;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String base64Credentials = authHeader.substring("Basic ".length());

        String credentials = new String(
                Base64.getDecoder().decode(base64Credentials));

        String username = credentials.split(":")[0];

        String token = JwtTokenUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}
```

---

## SecurityConfig.java

```java
package com.cognizant.springlearn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth)
            throws Exception {

        auth.inMemoryAuthentication()
                .withUser("user")
                .password("{noop}pwd")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http)
            throws Exception {

        http.csrf().disable()
            .authorizeRequests()
            .antMatchers("/authenticate").authenticated()
            .anyRequest().permitAll()
            .and()
            .httpBasic();
    }
}
```

---

## application.properties

```properties
server.port=8090

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
| GET | `/authenticate` | Generates and returns a JWT token |

---


## Conclusion

This hands-on demonstrates the first step of JWT authentication in Spring Boot. The application authenticates the user using HTTP Basic Authentication, extracts the username from the Authorization header, generates a JWT token, and returns it to the client for use in subsequent secured API requests.

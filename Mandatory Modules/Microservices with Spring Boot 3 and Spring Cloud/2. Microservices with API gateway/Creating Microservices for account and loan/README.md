# Spring Boot Microservices - Account & Loan Services

## Brief :

This project demonstrates the creation of two independent Spring Boot Microservices for a banking application.

- Account Microservice
- Loan Microservice

Each microservice is developed as an individual Maven project with its own `pom.xml`, controller, configuration, and application class.

No database connectivity is used. Both services return dummy JSON responses.

---






# Creating Account Microservice

## Step 1

Open

https://start.spring.io

### Project

Maven

### Language

Java

### Spring Boot

Latest Stable Version



### Artifact

```
account
```

### Name

```
account
```



Click

Generate

Extract the project inside

```
C:\<EmployeeID>\microservices\
```

---

# pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.5.4</version>
    </parent>

    <groupId>com.cognizant</groupId>
    <artifactId>account</artifactId>
    <version>0.0.1-SNAPSHOT</version>

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

</project>
```

---

# AccountApplication.java

```java
package com.cognizant.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }

}
```

---

# Account.java

```java
package com.cognizant.account.model;

public class Account {

    private String number;
    private String type;
    private double balance;

    public Account() {
    }

    public Account(String number, String type, double balance) {
        this.number = number;
        this.type = type;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
```

---

# AccountController.java

```java
package com.cognizant.account.controller;

import com.cognizant.account.model.Account;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @GetMapping("/{number}")
    public Account getAccount(@PathVariable String number){

        return new Account(
                number,
                "savings",
                234343
        );

    }

}
```

---


---

# Loan Microservice



Artifact

```
loan
```


---

# Loan.java

```java
package com.cognizant.loan.model;

public class Loan {

    private String number;
    private String type;
    private double loan;
    private int emi;
    private int tenure;

    public Loan() {
    }

    public Loan(String number,
                String type,
                double loan,
                int emi,
                int tenure) {

        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLoan() {
        return loan;
    }

    public void setLoan(double loan) {
        this.loan = loan;
    }

    public int getEmi() {
        return emi;
    }

    public void setEmi(int emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

}
```

---

# LoanController.java

```java
package com.cognizant.loan.controller;

import com.cognizant.loan.model.Loan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping("/{number}")
    public Loan getLoan(@PathVariable String number){

        return new Loan(
                number,
                "car",
                400000,
                3258,
                18
        );

    }

}
```

---

# LoanApplication.java

```java
package com.cognizant.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoanApplication.class, args);
    }

}
```


---

# Conclusion

Successfully created two independent Spring Boot microservices:

- Account Microservice
- Loan Microservice


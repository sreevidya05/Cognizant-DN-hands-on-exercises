# Difference Between JPA, Hibernate and Spring Data JPA

## Objective

To understand the differences between **JPA**, **Hibernate**, and **Spring Data JPA**, and compare how each simplifies database operations in Java applications.


---

## Java Persistence API (JPA)

- Java Persistence API (JPA) is a **Java specification (JSR 338)** for object-relational mapping (ORM).
- It defines standard APIs for persisting, retrieving, updating, and deleting data.
- JPA is only a specification and **does not provide an implementation**.
- It requires an implementation such as **Hibernate**, **EclipseLink**, or **OpenJPA**.

---

## Hibernate

- Hibernate is an **ORM framework** and one of the most popular implementations of JPA.
- It maps Java objects to database tables.
- Provides features like caching, lazy loading, transaction management, and HQL.
- Requires more boilerplate code compared to Spring Data JPA.

---

## Spring Data JPA

- Spring Data JPA is built on top of JPA.
- It **does not implement JPA**, but simplifies data access by reducing boilerplate code.
- Automatically provides CRUD operations using `JpaRepository`.
- Manages transactions and integrates seamlessly with Spring Boot.

---

## Comparison

| Feature | JPA | Hibernate | Spring Data JPA |
|---------|-----|-----------|-----------------|
| Type | Specification | ORM Framework | Spring Module |
| Implementation | ❌ No | ✅ Yes | ❌ No |
| Database Operations | Standard API | Manual Implementation | Simplified Repository API |
| Boilerplate Code | Medium | High | Very Low |
| Transaction Management | External | Manual | Automatic (`@Transactional`) |

---

## Hibernate Example

```java
public Integer addEmployee(Employee employee){

    Session session = factory.openSession();
    Transaction tx = null;
    Integer employeeID = null;

    try{

        tx = session.beginTransaction();

        employeeID = (Integer) session.save(employee);

        tx.commit();

    }catch(HibernateException e){

        if(tx != null)
            tx.rollback();

        e.printStackTrace();

    }finally{

        session.close();

    }

    return employeeID;

}
```

---

## Spring Data JPA Example

### EmployeeRepository.java

```java
package com.cognizant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository
        extends JpaRepository<Employee, Integer> {

}
```

---

### EmployeeService.java

```java
package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public void addEmployee(Employee employee){

        employeeRepository.save(employee);

    }

}
```

---

## Key Differences

- **JPA** defines how persistence should work.
- **Hibernate** implements the JPA specification and performs ORM operations.
- **Spring Data JPA** uses Hibernate (or another JPA provider) internally and reduces the amount of code developers need to write.

---


## Conclusion

JPA provides the standard specification for persistence, Hibernate implements that specification, and Spring Data JPA builds on top of JPA to simplify database access through repository interfaces. Together, they enable efficient, maintainable, and scalable data access in Spring Boot applications.

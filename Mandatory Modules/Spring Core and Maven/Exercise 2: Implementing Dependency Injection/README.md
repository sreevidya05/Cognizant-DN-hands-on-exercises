# Exercise 2: Implementing Dependency Injection

## Objective

To implement Dependency Injection (DI) in a Spring Framework application using XML configuration by injecting the `BookRepository` dependency into the `BookService` class.

---


## Implementation Steps

### BookService.java

<img width="1174" height="592" alt="image" src="https://github.com/user-attachments/assets/d83d1db5-2712-43b1-bfbb-ffd869bd8828" />

---

### applicationContext.xml

<img width="1150" height="636" alt="image" src="https://github.com/user-attachments/assets/2e9885ba-9acb-48f0-b460-04cdaa8c9a3b" />


---
###  `pom.xml`

<?xml version="1.0" encoding="UTF-8"?>

<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0
         https://maven.apache.org/xsd/maven-4.0.0.xsd">

    <modelVersion>4.0.0</modelVersion>

    <groupId>com.library</groupId>
    <artifactId>LibraryManagement</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>

        <!-- Spring Context -->
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-context</artifactId>
            <version>5.3.39</version>
        </dependency>

        <!-- JUnit -->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>

    </dependencies>

    <build>
        <plugins>

            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.11.0</version>
                <configuration>
                    <source>17</source>
                    <target>17</target>
                </configuration>
            </plugin>

            <plugin>
                <groupId>org.codehaus.mojo</groupId>
                <artifactId>exec-maven-plugin</artifactId>
                <version>3.1.0</version>
            </plugin>

        </plugins>
    </build>

</project>

---
###  `BookRepository.java`

<img width="1212" height="429" alt="image" src="https://github.com/user-attachments/assets/b7c57d94-deaa-436d-9b17-c46d2002468d" />


---

### `MainApp.java`

<img width="1032" height="610" alt="image" src="https://github.com/user-attachments/assets/16fd3e12-0be8-422d-be7c-7d2fad88c403" />
---

### Output

<img width="1180" height="373" alt="image" src="https://github.com/user-attachments/assets/6d87f084-1124-4a68-b724-8e297fafd6fd" />



---

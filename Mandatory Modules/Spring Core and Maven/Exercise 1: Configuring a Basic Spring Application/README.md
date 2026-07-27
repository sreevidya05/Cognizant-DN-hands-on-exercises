# Library Management - Spring Core Exercise

## Exercise 1: Configuring a Basic Spring Application

### Objective

The objective of this exercise is to understand the fundamentals of the Spring Framework by creating a simple Library Management application using Spring Core and XML-based configuration.

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


###  `applicationContext.xml`

<img width="930" height="619" alt="image" src="https://github.com/user-attachments/assets/f5d9527e-f550-404e-98fd-69323a02b555" />


---


###  `BookRepository.java`

<img width="1212" height="429" alt="image" src="https://github.com/user-attachments/assets/b7c57d94-deaa-436d-9b17-c46d2002468d" />


---

### `BookService.java`

<img width="1053" height="520" alt="image" src="https://github.com/user-attachments/assets/9cf920ca-e4b7-45be-a48e-b619dc959d3f" />

---

### `MainApp.java`

<img width="1032" height="610" alt="image" src="https://github.com/user-attachments/assets/16fd3e12-0be8-422d-be7c-7d2fad88c403" />


---


Successfully executed the application by loading the Spring context.

# Output

<img width="1179" height="346" alt="image" src="https://github.com/user-attachments/assets/a848fa30-bbb6-4bc6-9da7-bf91b265fba8" />


---


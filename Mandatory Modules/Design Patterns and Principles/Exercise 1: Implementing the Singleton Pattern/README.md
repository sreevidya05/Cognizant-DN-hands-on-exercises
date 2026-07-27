# Implementing the Singleton Pattern

## Objective

Implement the **Singleton Design Pattern** to ensure that only one instance of a logging utility (`Logger`) exists throughout the application lifecycle.

---


# What is the Singleton Pattern?

The **Singleton Pattern** is a Creational Design Pattern that restricts the instantiation of a class to a single object and provides a global access point to that instance.

---


# Implementation Steps

1. Create a Java project named **SingletonPatternExample**.
2. Create a `Logger` class.
3. Make the constructor `private`.
4. Create a private static instance of `Logger`.
5. Provide a public static `getInstance()` method.
6. Create a test class to verify that only one object is created.



---


# Source Code

## Logger.java

<img width="853" height="724" alt="image" src="https://github.com/user-attachments/assets/16d00757-d301-4622-bf5c-7d715b3d0cd7" />

---

## SingletonTest.java

<img width="1146" height="741" alt="image" src="https://github.com/user-attachments/assets/cf86a583-8f5b-4bb6-9ca0-8896eb9297ad" />


---

# Output

<img width="1327" height="276" alt="image" src="https://github.com/user-attachments/assets/2a33bd8e-dc25-4826-9689-a0f66373b334" />


---




# Result

Successfully implemented the **Singleton Design Pattern** in Java. 

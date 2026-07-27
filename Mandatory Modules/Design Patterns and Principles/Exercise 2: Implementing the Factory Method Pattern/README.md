# Factory Method Pattern Example

## Objective

Implement the **Factory Method Design Pattern** to create different types of documents (Word, PDF, and Excel) in a document management system without exposing object creation logic to the client.

---


# What is the Factory Method Pattern?

The **Factory Method Pattern** is a **Creational Design Pattern** that defines an interface for creating objects while allowing subclasses to decide which class to instantiate. It promotes loose coupling by separating object creation from object usage.

---


# Implementation Steps

1. Create a Java project named **FactoryMethodPatternExample**.
2. Define a common interface or abstract class for documents.
3. Create concrete document classes:
   - WordDocument
   - PdfDocument
   - ExcelDocument
4. Create an abstract factory class named `DocumentFactory`.
5. Implement concrete factory classes for each document type.
6. Create a test class to verify the creation of different documents using the factory method.

---


# Source Code

## Document.java

<img width="571" height="259" alt="image" src="https://github.com/user-attachments/assets/de6c0a38-b453-4734-bfca-1fec3a2da341" />

---

## DocumentFactory.java

<img width="798" height="354" alt="image" src="https://github.com/user-attachments/assets/8388d129-9278-47d0-9d57-3dd41beb7a0a" />


---

## PdfDocumentFactory.java

<img width="985" height="415" alt="image" src="https://github.com/user-attachments/assets/498f0009-cb39-4310-b294-42e13efb57eb" />


---

## PdfDocumentFactory.java
<img width="945" height="445" alt="image" src="https://github.com/user-attachments/assets/91a8a011-364e-43cc-9cf0-629176324ed1" />


---
## ExcelDocumentFactory.java

<img width="853" height="477" alt="image" src="https://github.com/user-attachments/assets/72c08b7e-2540-4537-bcaa-a3be874ae0f4" />


---


## ExcelDocument.java
<img width="826" height="402" alt="image" src="https://github.com/user-attachments/assets/d0da9e69-87c8-49de-a357-5a2a668e4f47" />

---

## WordDocumentFactory.java

<img width="997" height="478" alt="image" src="https://github.com/user-attachments/assets/8bf22a6b-2ccb-4e9d-be69-28cb122a089e" />


---

## WordDocument.java

<img width="883" height="471" alt="image" src="https://github.com/user-attachments/assets/42eb8a0d-4a53-4f3d-a32a-fe693c617f2f" />

---

## FactoryMethodTest.java

<img width="916" height="610" alt="image" src="https://github.com/user-attachments/assets/d8f4e1fa-227e-4f28-93e9-d9c09c522771" />


---

# Output

<img width="976" height="231" alt="image" src="https://github.com/user-attachments/assets/af8cdcbe-1f52-44b0-904a-c55ac0afc937" />


---



# Result

Successfully implemented the **Factory Method Design Pattern** in Java to create different document types through factory classes.

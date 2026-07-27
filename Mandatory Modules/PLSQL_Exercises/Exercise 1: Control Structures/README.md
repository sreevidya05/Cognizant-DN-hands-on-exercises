# PL/SQL Control Structures – Banking Scenarios

This project demonstrates the implementation of **PL/SQL Control Structures** using a simple banking database. The exercises use **FOR LOOP**, **IF condition**, **UPDATE statements**, and **DBMS_OUTPUT** to perform common banking operations.

---

## Database Schema

### Customers Table

```sql
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(30),
    Age NUMBER,
    Balance NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    IsVIP VARCHAR2(5)
);
```

---

## Sample Data

```sql
INSERT INTO Customers
VALUES (101,'Amrutha',65,15000,10,
TO_DATE('20-07-2026','DD-MM-YYYY'),'FALSE');

INSERT INTO Customers
VALUES (102,'Revanth',45,8000,12,
TO_DATE('25-08-2026','DD-MM-YYYY'),'FALSE');

INSERT INTO Customers
VALUES (103,'Sharmila',70,12000,11,
TO_DATE('15-07-2026','DD-MM-YYYY'),'FALSE');

INSERT INTO Customers
VALUES (104,'Bhavya',35,5000,9,
TO_DATE('10-07-2026','DD-MM-YYYY'),'FALSE');
```

---

# Exercise 1 – Control Structures

## Scenario 1 – Apply Interest Rate Discount

### Problem Statement

The bank wants to provide a **1% interest rate discount** to customers who are **above 60 years of age**.

### PL/SQL Code

```sql
BEGIN

FOR c IN (SELECT * FROM Customers) LOOP

    IF c.Age > 60 THEN

        UPDATE Customers
        SET InterestRate = InterestRate - 1
        WHERE CustomerID = c.CustomerID;

    END IF;

END LOOP;

END;
/
```

### Verify Result

```sql
SELECT CustomerID,
       CustomerName,
       Age,
       InterestRate
FROM Customers;
```

### Output

<img width="858" height="275" alt="p1s1" src="https://github.com/user-attachments/assets/a82e7ab9-6481-446a-9052-832493296d91" />

---

## Scenario 2 – Promote Customers to VIP

### Problem Statement

Customers having a **balance greater than 10,000** should be promoted to **VIP** status.

### PL/SQL Code

```sql
BEGIN

FOR c IN (SELECT * FROM Customers) LOOP

    IF c.Balance > 10000 THEN

        UPDATE Customers
        SET IsVIP = 'TRUE'
        WHERE CustomerID = c.CustomerID;

    END IF;

END LOOP;

END;
/
```

### Verify Result

```sql
SELECT CustomerID,
       CustomerName,
       Balance,
       IsVIP
FROM Customers;
```

### Output

<img width="762" height="297" alt="p1s2" src="https://github.com/user-attachments/assets/99b9448c-4c2b-4346-8292-a570e0a585c8" />


---

## Scenario 3 – Loan Due Reminder

### Problem Statement

Display reminder messages for customers whose **loan due date falls within the next 30 days**.

### PL/SQL Code

```sql
BEGIN

FOR c IN (
    SELECT *
    FROM Customers
    WHERE DueDate <= TO_DATE('30-07-2026','DD-MM-YYYY')
) LOOP

    DBMS_OUTPUT.PUT_LINE(
        'Reminder for ' || c.CustomerName
    );

END LOOP;

END;
/
```

### Output

<img width="1002" height="317" alt="p1s3" src="https://github.com/user-attachments/assets/84f987c3-6b15-4da4-81c0-79190b04571e" />


---



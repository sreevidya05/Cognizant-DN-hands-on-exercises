# PL/SQL Stored Procedures – Banking Scenarios

This project demonstrates the implementation of **Stored Procedures in PL/SQL** using a banking database. The exercises cover creating reusable procedures for processing monthly interest, updating employee bonuses, and transferring funds between accounts.

---

# Database Schema

## Accounts Table

```sql
CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerName VARCHAR2(30),
    AccountType VARCHAR2(20),
    Balance NUMBER
);
```

## Employees Table

```sql
CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(30),
    Department VARCHAR2(20),
    Salary NUMBER
);
```

---

# Sample Data

## Accounts

```sql
INSERT INTO Accounts VALUES (101,'Revanth','Savings',10000);

INSERT INTO Accounts VALUES (102,'Amrutha','Savings',15000);

INSERT INTO Accounts VALUES (103,'Bhavya','Current',20000);

INSERT INTO Accounts VALUES (104,'Sharmila','Savings',5000);

INSERT INTO Accounts VALUES (105,'Sreya','Savings',12000);

INSERT INTO Accounts VALUES (106,'Aashritha','Current',18000);
```

## Employees

```sql
INSERT INTO Employees VALUES (1,'Revanth','IT',50000);

INSERT INTO Employees VALUES (2,'Amrutha','HR',45000);

INSERT INTO Employees VALUES (3,'Bhavya','IT',60000);

INSERT INTO Employees VALUES (4,'Sharmila','Finance',55000);

INSERT INTO Employees VALUES (5,'Sreya','IT',48000);

INSERT INTO Employees VALUES (6,'Aashritha','HR',52000);
```

---

# Exercise 3 – Stored Procedures

## Scenario 1 – Process Monthly Interest

### Problem Statement

The bank needs to process **monthly interest** for all **Savings Accounts** by applying **1% interest** to the current balance.

### Stored Procedure

```sql
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest
IS
BEGIN

UPDATE Accounts
SET Balance = Balance + (Balance * 0.01)
WHERE AccountType = 'Savings';

END;
/
```

### Execute Procedure

```sql
EXEC ProcessMonthlyInterest;
```

### Verify Result

```sql
SELECT * FROM Accounts;
```

### Output

<img width="907" height="423" alt="p2s1" src="https://github.com/user-attachments/assets/33eca345-69c9-49c8-9736-2882399087ea" />


---

## Scenario 2 – Update Employee Bonus

### Problem Statement

The bank wants to reward employees by updating their salaries based on a **bonus percentage** provided as a parameter for a specific department.

### Stored Procedure

```sql
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus
(
    dept IN VARCHAR2,
    bonus IN NUMBER
)
IS
BEGIN

UPDATE Employees
SET Salary = Salary + (Salary * bonus/100)
WHERE Department = dept;

END;
/
```

### Execute Procedure

```sql
EXEC UpdateEmployeeBonus('IT',10);
```

### Verify Result

```sql
SELECT * FROM Employees;
```

### Output

<img width="882" height="425" alt="p2s2" src="https://github.com/user-attachments/assets/780abb02-027f-406b-bfc0-8c88a00c224f" />


---

## Scenario 3 – Transfer Funds Between Accounts

### Problem Statement

Customers should be able to transfer money between accounts. The procedure checks whether the **source account has sufficient balance** before completing the transaction.

### Stored Procedure

```sql
CREATE OR REPLACE PROCEDURE TransferFunds
(
    FromAcc IN NUMBER,
    ToAcc IN NUMBER,
    Amount IN NUMBER
)
IS

Bal NUMBER;

BEGIN

SELECT Balance
INTO Bal
FROM Accounts
WHERE AccountID = FromAcc;

IF Bal >= Amount THEN

UPDATE Accounts
SET Balance = Balance - Amount
WHERE AccountID = FromAcc;

UPDATE Accounts
SET Balance = Balance + Amount
WHERE AccountID = ToAcc;

DBMS_OUTPUT.PUT_LINE('Transfer Successful');

ELSE

DBMS_OUTPUT.PUT_LINE('Insufficient Balance');

END IF;

END;
/
```

### Execute Procedure

```sql
EXEC TransferFunds(101,102,3000);
```

### Verify Result

```sql
SELECT * FROM Accounts;
```

### Output

<img width="916" height="411" alt="p2s3" src="https://github.com/user-attachments/assets/52b9a974-d6ef-46f0-954d-2f78fe826605" />


---

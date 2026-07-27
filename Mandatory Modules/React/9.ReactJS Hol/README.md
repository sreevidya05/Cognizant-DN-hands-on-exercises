# Cricket App
---
## Objectives
---

# ES6 Concepts

## Features of ES6

ES6 introduced several new features including:

- `let` and `const`
- Arrow Functions
- Classes
- Class Inheritance
- Template Literals
- Destructuring
- Spread and Rest Operators
- Promises
- Modules
- Set and Map Collections

---

## JavaScript `let`

The `let` keyword is used to declare block-scoped variables that can be reassigned later.

### Example

```javascript
let playerName = "Virat Kohli";
playerName = "Rohit Sharma";
```

---

## Difference Between `var` and `let`

| var | let |
|------|------|
| Function scoped | Block scoped |
| Can be redeclared | Cannot be redeclared in the same scope |
| Hoisted and initialized with undefined | Hoisted but not initialized |
| Older way of declaring variables | Modern ES6 variable declaration |

---

## JavaScript `const`

The `const` keyword is used to declare variables whose reference cannot be reassigned after initialization.

### Example

```javascript
const teamName = "India";
```

---

## ES6 Class Fundamentals

Classes provide a blueprint for creating objects and encapsulating data and methods.

### Example

```javascript
class Player {
  constructor(name) {
    this.name = name;
  }
}
```

---

## ES6 Class Inheritance

Inheritance allows one class to acquire the properties and methods of another class using the `extends` keyword.

### Example

```javascript
class Cricketer extends Player {
  constructor(name, role) {
    super(name);
    this.role = role;
  }
}
```

---

## ES6 Arrow Functions

Arrow functions provide a shorter syntax for writing functions.

### Example

```javascript
const displayPlayer = () => {
  return "Player Details";
};
```

---

## Set() and Map()

### Set()

A `Set` stores unique values and automatically removes duplicates.

```javascript
const players = new Set(["Virat", "Rohit", "Virat"]);
```

### Map()

A `Map` stores key-value pairs and maintains insertion order.

```javascript
const playerMap = new Map();
playerMap.set(1, "Virat Kohli");
```

---



# cricketapp

## App.js

<img width="697" height="979" alt="image" src="https://github.com/user-attachments/assets/a0b5dfa1-f10a-47aa-a9a4-d3fe3a1df799" />

<img width="796" height="982" alt="image" src="https://github.com/user-attachments/assets/8e3fc8aa-5eaa-4bce-b2b5-1a5ca2f8fa10" />

<img width="520" height="309" alt="image" src="https://github.com/user-attachments/assets/928029db-ffd9-4acd-9b08-fcbeba1df4f5" />


---

## ListofPlayers.js

<img width="996" height="949" alt="image" src="https://github.com/user-attachments/assets/b9a5c5b4-c21a-4acf-bdf8-83977aea3f5a" />


---

## IndianPlayers.js

<img width="709" height="829" alt="image" src="https://github.com/user-attachments/assets/8e3d8e99-6909-4bc1-9f9f-d93f559b9223" />


---



# Output

<img width="1600" height="921" alt="image" src="https://github.com/user-attachments/assets/dd5513a9-68db-4b21-99e1-5f04a3288449" />


---

# Result

Successfully developed a React application named **Cricket App** using React and ES6 concepts.

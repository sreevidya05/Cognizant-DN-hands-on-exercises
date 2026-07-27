# Office Space Rental App

---

## Objectives

## Define JSX

JSX (JavaScript XML) is a syntax extension for JavaScript that allows developers to write HTML-like code inside JavaScript. It is compiled into `React.createElement()` calls by React.

---

## Explain ECMAScript

ECMAScript (ES) is the standard specification for JavaScript. Modern versions such as ES6 provide features like classes, arrow functions, modules, `let`, and `const`, making JavaScript more efficient and easier to write.

---

## Explain `React.createElement()`

`React.createElement()` is the React method used to create React elements. JSX is automatically transformed into `React.createElement()` during compilation.

### Example

```javascript
React.createElement("h1", null, "Office Space Rental");
```

---

## Creating React Nodes with JSX

JSX enables developers to create React nodes using HTML-like syntax.

### Example

```jsx
const heading = <h1>Office Space Rental App</h1>;
```

---

## Rendering JSX to the DOM

React renders JSX to the browser using the `ReactDOM.createRoot()` method and the `render()` function.

### Example

```jsx
const root = ReactDOM.createRoot(document.getElementById("root"));
root.render(<App />);
```

---

## Using JavaScript Expressions in JSX

JavaScript expressions can be embedded inside JSX using curly braces `{}`.

### Example

```jsx
const officeName = "Tech Park";

<h2>{officeName}</h2>
```

---

## Using Inline CSS in JSX

Inline CSS is applied using the `style` attribute with a JavaScript object.

### Example

```jsx
const style = {
  color: "green",
  fontSize: "22px"
};

<h1 style={style}>Office Space Rental</h1>
```

---



# officespacerentalapp

## App.js

<img width="721" height="957" alt="image" src="https://github.com/user-attachments/assets/999b5f85-5050-4fb2-9898-ac5372f0ca74" />


<img width="628" height="418" alt="image" src="https://github.com/user-attachments/assets/24f47b8a-72ff-40c6-854f-663a5839236c" />


---

## App.css

<img width="789" height="858" alt="image" src="https://github.com/user-attachments/assets/6fde13db-c4bf-441c-80e5-6c7d5647ee7f" />

---


# Output

<img width="1600" height="938" alt="image" src="https://github.com/user-attachments/assets/46f3c290-7095-46db-9c78-284fff528699" />

---

# Result

Successfully developed the **Office Space Rental App** using React JSX. 

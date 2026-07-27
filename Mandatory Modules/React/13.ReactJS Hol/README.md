# Blogger App

---

## Objectives

## Various Ways of Conditional Rendering

React supports multiple ways to conditionally render components based on application state or conditions.

### 1. Using `if...else`

```jsx
if (isLoggedIn) {
  return <Home />;
}
return <Login />;
```

### 2. Using Ternary Operator

```jsx
{isLoggedIn ? <Home /> : <Login />}
```

### 3. Using Logical AND (`&&`)

```jsx
{isAdmin && <AdminPanel />}
```

### 4. Returning `null`

```jsx
if (!showComponent) {
  return null;
}
```

---

## Rendering Multiple Components

React allows multiple components to be rendered together inside a parent component.

### Example

```jsx
<>
  <BookDetails />
  <BlogDetails />
  <CourseDetails />
</>
```

---

## List Components

A List Component displays multiple items by rendering collections of data dynamically.

### Example

```jsx
const books = ["React", "Java", "Python"];
```

---

## Keys in React Applications

Keys are unique identifiers used by React to efficiently update and render list items.

### Example

```jsx
books.map((book, index) => (
  <li key={index}>{book}</li>
));
```

---

## Extracting Components with Keys

When rendering lists using separate components, the `key` should be assigned to the component while rendering the list.

### Example

```jsx
<BookDetails key={book.id} book={book} />
```

---

## React `map()` Function

The `map()` function iterates through an array and returns a new array of React elements.

### Example

```jsx
const courses = ["React", "Angular", "Node"];

courses.map((course) => (
  <li>{course}</li>
));
```

---

# bloggerapp

## App.js

<img width="1135" height="664" alt="image" src="https://github.com/user-attachments/assets/595ec3f8-d644-4a11-9cb7-393cb53c48d3" />


---

## App.css

<img width="1063" height="856" alt="image" src="https://github.com/user-attachments/assets/6e8c6ef1-a825-407e-8e36-af240ce02375" />


---

## BookDetails.js

<img width="1288" height="900" alt="image" src="https://github.com/user-attachments/assets/3980731f-b88d-4182-baa8-0bf851b0e9d2" />


---

## BlogDetails.js

<img width="1237" height="928" alt="image" src="https://github.com/user-attachments/assets/ea46cfeb-3326-44b3-9d3c-0253475a8e8e" />


---

## CourseDetails.js

<img width="1057" height="919" alt="image" src="https://github.com/user-attachments/assets/32ce3eb5-8ed5-4bfd-a776-2a017e21b03f" />


---


# Output

<img width="1600" height="863" alt="image" src="https://github.com/user-attachments/assets/fc821226-d2f8-42da-ba56-e28cd449fdf2" />


---

# Result

Successfully developed the **Blogger App** using React. 

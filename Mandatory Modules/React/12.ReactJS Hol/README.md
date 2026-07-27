# Ticket Booking App

---

## Objectives

## Explain Conditional Rendering in React

Conditional Rendering allows React to display different UI elements based on a condition, such as user login status or application state.

### Example

```jsx
function Welcome(props) {
  if (props.isLoggedIn) {
    return <h2>Welcome Back!</h2>;
  }
  return <h2>Please Login</h2>;
}
```

---

## Define Element Variables

Element variables are variables used to store React elements, making conditional rendering simpler and improving code readability.

### Example

```jsx
let button;

if (isLoggedIn) {
  button = <LogoutButton />;
} else {
  button = <LoginButton />;
}
```

---

## Preventing Components from Rendering

A component can prevent rendering by returning `null`. This means nothing will be displayed in the DOM.

### Example

```jsx
function Warning(props) {
  if (!props.showWarning) {
    return null;
  }

  return <h3>Warning!</h3>;
}
```

---

# ticketbookingapp

## App.js

<img width="766" height="339" alt="image" src="https://github.com/user-attachments/assets/6f47121c-0ab1-4d0f-b02b-12e5f0a9489c" />



---

## TicketBooking.js

<img width="1138" height="900" alt="image" src="https://github.com/user-attachments/assets/85c7af11-080c-43f2-bded-994ed6bdc2f4" />

<img width="991" height="807" alt="image" src="https://github.com/user-attachments/assets/c4623a7e-b3b5-454e-8aef-30c329a353d6" />


---

# Output

<img width="1600" height="561" alt="image" src="https://github.com/user-attachments/assets/3a4033fd-d7fb-4975-94d1-8af9b40a0836" />

<img width="1600" height="486" alt="image" src="https://github.com/user-attachments/assets/e9cecbae-f4d9-4bec-beb4-fdf1a8c989d5" />


---

# Result

Successfully developed the **Ticket Booking App** using React. 

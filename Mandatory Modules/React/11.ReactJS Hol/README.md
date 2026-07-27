# Event Examples App

---

## Objectives


## Explain React Events

React Events are actions triggered by the user, such as clicking a button, typing in a textbox, or submitting a form. React handles these events similarly to JavaScript but with a consistent cross-browser interface.

---

## Explain Event Handlers

Event handlers are functions that execute when a specific event occurs. In React, event handlers are passed as functions to JSX event attributes.

### Example

```jsx
function handleClick() {
  alert("Button Clicked!");
}

<button onClick={handleClick}>Click Me</button>
```

---

## Define Synthetic Event

A Synthetic Event is React's wrapper around the native browser event. It provides a consistent event interface that works the same across all browsers.

### Example

```jsx
function handleChange(event) {
  console.log(event.target.value);
}

<input onChange={handleChange} />
```

---

## React Event Naming Convention

React uses **camelCase** naming for events instead of lowercase HTML event names.

| HTML Event | React Event |
|------------|-------------|
| onclick | onClick |
| onchange | onChange |
| onsubmit | onSubmit |
| onmouseover | onMouseOver |
| onkeydown | onKeyDown |

---

# eventexamplesapp

## App.js

<img width="1097" height="837" alt="image" src="https://github.com/user-attachments/assets/266429bb-55b0-464d-926a-8ff0e9efc271" />



<img width="592" height="728" alt="image" src="https://github.com/user-attachments/assets/95015466-f572-43ba-a36a-7100a1c856e8" />



<img width="902" height="722" alt="image" src="https://github.com/user-attachments/assets/e2e99c90-ff5e-40eb-86cc-55712a4f0feb" />



<img width="487" height="365" alt="image" src="https://github.com/user-attachments/assets/095dfdae-fbf4-4c24-8674-a3cea77aa91c" />

---

## App.css

<img width="992" height="812" alt="image" src="https://github.com/user-attachments/assets/51b92002-2dfd-4a9d-93ab-910fb61b41e7" />


---

## index.js


<img width="847" height="415" alt="image" src="https://github.com/user-attachments/assets/9482eecd-c58a-4bce-8050-067e9c89a860" />


---

## CurrencyConverter.js

<img width="1046" height="832" alt="image" src="https://github.com/user-attachments/assets/7bba9bcd-da75-47c6-871e-f8d24f2e142d" />



<img width="971" height="811" alt="image" src="https://github.com/user-attachments/assets/4b15e517-280e-4df9-a050-9265ad2b8915" />



<img width="785" height="585" alt="image" src="https://github.com/user-attachments/assets/21f03d95-7fd8-4301-9568-fd8a42ab36ad" />

---

# Output

<img width="1912" height="892" alt="image" src="https://github.com/user-attachments/assets/109d54e1-9830-4f9d-aab8-2be2ff63b282" />



<img width="1902" height="862" alt="image" src="https://github.com/user-attachments/assets/5464229e-9403-49fc-9fe2-22c17d4cca86" />


---

# Result

Successfully developed the **Event Examples App** using React to demonstrate handling various HTML form events.

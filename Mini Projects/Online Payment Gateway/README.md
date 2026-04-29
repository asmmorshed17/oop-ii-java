# 💳 Payment Gateway System (OOP)

## 📌 Problem Statement

**Concepts:** Interface, Abstraction, Polymorphism, Exception Handling

### 🎯 Learning Goals

* Design systems using interfaces
* Implement multiple payment methods
* Handle transaction errors using exceptions

---

## 📖 Description

Design and implement a **Payment Gateway System** using Object-Oriented Programming in Java.

The system should simulate real-world payment processing by supporting:

* Multiple payment methods
* Authorization, capture, and refund operations
* Secure and flexible payment handling

---

## 🧱 System Design

### 🔷 Class Structure

```id="ab19xy"
PaymentMethod (interface)
 ├── CreditCard
 ├── DebitCard
 └── PayPal

Other:
- Custom Exceptions
```

---

## ⚙️ Features

### ✅ Payment Processing

* Authorize payment
* Capture payment (deduct balance)
* Refund payment

### ✅ Multiple Payment Methods

* Credit Card
* Debit Card
* PayPal

### ✅ Polymorphism

* Same interface (`PaymentMethod`) used for different payment types

### ✅ Exception Handling

* Invalid card number
* Insufficient balance
* Invalid transaction

---

## 🧠 OOP Concepts Used

### 🔹 Interface

* `PaymentMethod` defines:

  * `authorize()`
  * `capture()`
  * `refund()`

---

### 🔹 Abstraction

* Only method definitions are exposed in the interface
* Implementation details are hidden

---

### 🔹 Polymorphism

```id="p2example"
PaymentMethod p = new CreditCard(...);
p.capture(500);
```

✔ Same interface → different behavior

---

### 🔹 Exception Handling

* Custom exceptions like:

  * `InvalidCardException`
  * `InsufficientBalanceException`

---

## 🚀 Example Functionalities

* Validate card details
* Process payments securely
* Deduct balance during capture
* Refund transactions
* Handle errors gracefully

---

## 🖥️ Sample Output

```id="out2"
Card authorized.
Payment captured: 500.0
Refund successful: 200.0
```

---

## 📂 Technologies Used

* Java
* OOP Principles
* Exception Handling

---

## 🎯 Conclusion

This project demonstrates how modern payment systems can be designed using:

* Interface-based architecture
* Flexible and scalable design
* Secure transaction handling

---

## 🎓 Author

**A.S.M. Morshed**
Software Engineering Student

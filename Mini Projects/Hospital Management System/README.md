# 🏥 Hospital Management System (OOP)

## 📌 Problem Statement

**Concepts:** Inheritance, Aggregation, Encapsulation, Exception Handling

### 🎯 Learning Goals

* Model a staff/patient hierarchy using inheritance
* Protect sensitive data using encapsulation
* Enforce scheduling rules using exception handling

---

## 📖 Description

Design and implement a **Hospital Management System** using Object-Oriented Programming principles in Java.

The system should support:

* Managing hospital staff and patients
* Booking appointments without conflicts
* Prescribing medicines
* Generating bills
* Protecting sensitive patient data

---

## 🧱 System Design

### 🔷 Class Structure

```
Person (base class)
 ├── Doctor
 ├── Patient
 └── Nurse

Other Classes:
- Appointment
- Medicine
- Bill
- HospitalManager
```

---

## ⚙️ Features

### ✅ Registration

* Add Doctor
* Add Patient
* Add Nurse

### ✅ Appointment Management

* Book appointments
* Prevent overlapping appointments for the same doctor

### ✅ Medical Operations

* Doctors can prescribe medicines to patients

### ✅ Billing System

* Generate bills based on appointments and medicines

### ✅ Data Protection (Encapsulation)

* Patient medical history is private and accessed via getter/setter methods

### ✅ Exception Handling

* Prevent invalid operations such as:

  * Booking duplicate appointment slots
  * Invalid inputs

---

## 🧠 OOP Concepts Used

### 🔹 Inheritance

* `Doctor`, `Patient`, `Nurse` inherit from `Person`

### 🔹 Encapsulation

* Sensitive data like `medicalHistory` is kept private

### 🔹 Aggregation

* `HospitalManager` manages collections of doctors, patients, and appointments

### 🔹 Exception Handling

* Used to handle appointment conflicts and invalid operations

---

## 🚀 Example Functionalities

* Register new doctors and patients
* Book an appointment with time validation
* Prescribe medicine to a patient
* Generate a bill
* Handle errors using exceptions

---

## 🖥️ Sample Output

```
Appointment booked successfully.
Appointment slot already booked!
Total Bill: 500.0
```

---

## 📂 Technologies Used

* Java
* OOP Principles
* Java Collections (`ArrayList`)

---

## 🎯 Conclusion

This project demonstrates how real-world systems like hospitals can be modeled using **Object-Oriented Programming concepts**, ensuring:

* Code reusability
* Data security
* Maintainability

---

## Author

**A.S.M. Morshed**
Software Engineering Student

----
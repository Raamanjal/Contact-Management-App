# Contact Management System – Spring Boot CRUD Application

A simple **Contact Management System** built using **Spring Boot** that performs basic **CRUD operations** (Create, Read, Update, Delete) using **REST APIs** and a **static HTML/CSS/JavaScript frontend**.

This project is designed for **academic practicals, viva, and learning RESTful web services**.


## 📌 Features

- Add new contacts
- View all contacts
- Update existing contacts
- Delete contacts
- RESTful API design
- Clean MVC architecture
- Simple and responsive UI
- In-memory data storage (no database)

---

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **REST APIs**
- **HTML**
- **CSS**
- **JavaScript**
- **Maven**

---

# Contact Management System – Spring Boot CRUD Application

A simple **Contact Management System** built using **Spring Boot** that performs basic **CRUD operations** (Create, Read, Update, Delete) using **REST APIs** and a **static HTML/CSS/JavaScript frontend**.

This project is designed for **academic practicals, viva, and learning RESTful web services**.

---

## 📌 Features

- Add new contacts
- View all contacts
- Update existing contacts
- Delete contacts
- RESTful API design
- Clean MVC architecture
- Simple and responsive UI
- In-memory data storage (no database)

---

## 🛠️ Technologies Used

- **Java**
- **Spring Boot**
- **REST APIs**
- **HTML**
- **CSS**
- **JavaScript**
- **Maven**

---

## 📁 Project Structure

contactmanagement
**│── src**
**│ └── main**
**│ ├── java**
**│ │ └── com.example.contactmanagement**
**│ │ ├── controller**
**│ │ │ └── ContactController.java**
**│ │ ├── service**
**│ │ │ └── ContactService.java**
**│ │ ├── repository**
**│ │ │ └── ContactRepository.java**
**│ │ ├── model**
**│ │ │ └── Contact.java**
**│ │ └── ContactmanagementApplication.java**
**│ │**
**│ └── resources**
**│ └── static**
**│ └── index.html**
**│**
**│── pom.xml**
**│── .gitignore**
**│── mvnw**
---
## 🌐 REST API Endpoints

| Operation | HTTP Method | Endpoint | Description |
|--------|------------|---------|------------|
| Create | POST | `/contacts` | Add a new contact |
| Read | GET | `/contacts` | Fetch all contacts |
| Update | PUT | `/contacts/{id}` | Update contact by ID |
| Delete | DELETE | `/contacts/{id}` | Delete contact by ID |

---

## 🧪 Sample JSON Request

### Add Contact
```json
{
  "id": 1,
  "name": "Rahul",
  "phone": "9876543210",
  "email": "rahul@gmail.com"
}

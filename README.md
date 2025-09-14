# 🚢 Ship Management API

A simple RESTful API built with **Spring Boot** and **H2 Database** to manage ships.  

This project demonstrates clean code practices, validation, exception handling, and API documentation/testing with Postman.  

Deployed live on **Render**.

---

## 🌍 Live Demo

👉 [Ship Management API on Render](https://ship-management-api.onrender.com)

> Note: The app is hosted on Render free tier, so it may take 30–60 seconds to spin up on the first request.

---

## 📌 Features

- CRUD operations on ships:
  - `GET /ships` → Fetch all ships
  - `GET /ships/{id}` → Fetch ship by ID
  - `POST /ships` → Create a new ship
  - `PUT /ships/{id}` → Update an existing ship
  - `DELETE /ships/{id}` → Delete a ship
- Input validation (name required, valid email)
- Global exception handling with clean JSON error responses
- In-memory H2 database for simplicity

---

## ⚙️ Tech Stack

- Java 21  
- Spring Boot 3  
- Spring Data JPA  
- H2 Database  
- Lombok  
- Maven  
- Docker (for deployment)

---

## 🚀 Running the Application

### 1️⃣ Local Setup

Make sure you have **Java 17+** and **Maven** installed.

```bash
git clone https://github.com/<your-username>/ship-management-api.git
cd ship-management-api
./mvnw spring-boot:run
```

The API will be available at:  
👉 [http://localhost:8080](http://localhost:8080)

---

### 2️⃣ Using Docker

```bash
docker build -t ship-api .
docker run -p 8080:8080 ship-api
```

---

## 📖 API Endpoints

### GET all ships
```bash
GET /ships
```

**Response: 200 OK**
```json
[
  {
    "id": 1,
    "name": "Titanic",
    "email": "titanic@ships.com"
  }
]
```

---

### GET ship by ID
```bash
GET /ships/{id}
```
- Success → `200 OK`  
- Not found → `404 Not Found`

---

### Create ship
```bash
POST /ships
```

**Body:**
```json
{
  "name": "Titanic",
  "email": "titanic@ships.com"
}
```

**Response: 201 Created**

---

### Update ship
```bash
PUT /ships/{id}
```

**Body:**
```json
{
  "name": "Updated Titanic",
  "email": "updated@ships.com"
}
```

**Response: 200 OK**

---

### Delete ship
```bash
DELETE /ships/{id}
```
**Response: 200 OK**

---

## 🧪 Postman Collection

A Postman collection with all endpoints and automated tests is included.

File: `/postman/Ship Management API.postman_collection.json`

Import into Postman to test the API.

### Tests cover:
- ✅ `GET /ships` returns **200 OK**  
- ✅ `POST /ships` returns **201 Created**  
- ✅ `GET /ships/{id}` returns **404** for missing ship  
- ✅ `PUT /ships/{id}` returns **200 OK** with updated values  
- ✅ `DELETE /ships/{id}` returns **200 OK**  

- ✅ `PUT /ships/{id}` returns **200 OK** with updated values  
- ✅ `DELETE /ships/{id}` returns **200 OK**  

Here’s your **README.md** formatted cleanly and correctly in Markdown 👇

---

````markdown
# 🐱 CatProfile API

A simple Spring Boot REST API built for the **Backend Wizards Stage 0 Task**.  
It exposes a `/me` endpoint that returns profile information along with a random cat fact fetched from the **Cat Facts API**.

---

## 🚀 Features

- RESTful **GET** endpoint at `/me`
- Returns:
  - **Status message:** `success`
  - **User details:** `email`, `name`, `stack`
  - **Dynamic UTC timestamp** (ISO 8601)
  - **Random cat fact** from [`https://catfact.ninja/fact`](https://catfact.ninja/fact)
- Graceful error handling
- Logging with **SLF4J**
- Unit test with **MockMvc**
- Ready for deployment on **PXXL App**

---

## 🧩 Tech Stack

- ☕ Java 21  
- 🌱 Spring Boot 3.x  
- 📦 Maven  
- 💡 Lombok  
- 🧪 JUnit 5  

---

## ⚙️ How to Run Locally

1. **Clone the repository**
   ```bash
   git clone https://github.com/JoshuaUdenyi/catprofile.git
   cd catprofile
````

2. **Build the project**

   ```bash
   mvn clean package
   ```

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

   or

   ```bash
   java -jar target/catprofile-1.0.0.jar
   ```

4. **Access the API**

   ```
   http://localhost:8080/me
   ```

---

✅ **Example Response**

```json
{
  "status": "success",
  "user": {
    "email": "joethedev90@gmail.com",
    "name": "Udenyi Egboche Joshua",
    "stack": "Spring Boot/Java"
  },
  "timestamp": "2025-10-16T14:34:12.123Z",
  "fact": "Cats sleep for around 70% of their lives."
}
```

---

## 🧰 Notes

* Make sure you have **Java 21+** and **Maven** installed.
* The timestamp updates dynamically with every request.
* A new cat fact is fetched on every call to `/me`.

---

## 🧑‍💻 Author

**Udenyi Egboche Joshua**
📧 [joethedev90@gmail.com](mailto:joethedev90@gmail.com)
🔗 [GitHub: JoshuaUdenyi](https://github.com/JoshuaUdenyi)

```
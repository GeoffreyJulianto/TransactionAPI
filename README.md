# TransactionAPI
Aplikasi API menggunakan bahasa berbasis OOP (Java, framework Spring Boot) dengan requirement protocol HTTP, Data Json, Method GET, Response seusai viewData.json, logic aplikasi mengambil data dari database mysql, struktur database dan table bisa dibuat sesuai respon yang akan ditampilkan pada API

API sederhana Sprint Boot + MySQL untuk transaksi
Menampilkan data transaksi dalam JSON sesuai viewData.

## Requirement
- Java 17+
- Maven
- MySQL

## Cara Jalankan

1. Clone repo https://github.com/GeoffreyJulianto/TransactionAPI.git
2. Sesuaikan `src/main/resources/application.properties` dengan DB lokalmu. (Sesuaikan juga nama atribut dan tabel di database)
3. Masuk ke folder projek, cd TransactionAPI
4. Jalankan Spring Boot dan DB lokal, ./mvnw spring-boot:run
5. Test endpoint (contoh, menggunakan Postman GET http://localhost:8080/api/view-data)
  

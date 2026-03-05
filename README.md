# Pedidos Spring Boot

Este es un proyecto de ejemplo para **gestión de pedidos**, desarrollado con **Spring Boot** y **base de datos H2** en memoria.  

---

## ⚡ Características principales

- Permite **cargar productos por default** en la base de datos usando el método `GET /pedidos/cargar-productos`.
- Permite **consultar los productos** disponibles con `GET /pedidos/productos`.
- Permite **generar un pedido** con los productos cargados:
  - Cada pedido genera automáticamente un **ID** y la **fecha de creación**.
- Permite **consultar un pedido** por su ID con `GET /pedidos/{id}`.

---

## 🛠 Tecnologías

- Java 21
- Spring Boot
- H2 Database (en memoria)
- JPA / Hibernate
- Maven

---

## 🚀 Cómo ejecutar

1. Clonar el repositorio:

```bash
git clone https://github.com/rodTrejo/pedidos.git
cd pedidos

Ejecutar la aplicación:

./mvnw spring-boot:run

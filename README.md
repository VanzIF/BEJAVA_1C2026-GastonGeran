E-Commerce Java — Proyecto Backend de Consola

📌 Descripción

Este proyecto consiste en una aplicación backend desarrollada en Java orientada a objetos, diseñada para simular un pequeño sistema de e-commerce mediante consola.

El sistema permite:


    Gestionar productos
    
    Crear pedidos
    
    Controlar stock
    
    Validar información
    
    Manejar excepciones personalizadas
    
    Aplicar arquitectura modular por capas

El objetivo principal del proyecto fue aplicar conceptos fundamentales de desarrollo backend utilizando buenas prácticas de programación y una estructura profesional adaptable a proyectos reales.

🚀 Tecnologías Utilizadas

    Java
    
    Visual Studio Code
    
    Java Extension Pack
    
    Programación Orientada a Objetos (POO)
    
    Colecciones (ArrayList)
    
    Arquitectura por capas
    
    Manejo de excepciones

🏗️ Arquitectura del Proyecto

La aplicación fue desarrollada utilizando una arquitectura modular simplificada:

    UI → Service → Model

Capas implementadas

🔹 UI

    Encargada de la interacción con el usuario mediante consola.

🔹 Service
  
    Contiene toda la lógica de negocio.

🔹 Model
  
    Representa las entidades principales del dominio.

🔹 Exception
  
    Manejo de excepciones personalizadas.

🔹 Util
  
    Clases auxiliares y validaciones reutilizables.

📂 Estructura del Proyecto

    src/
    └── com/
        └── techlab/
        └── ecommerce/
            ├── exception/
            │   ├── ProductoNoEncontradoException.java
            │   └── StockInsuficienteException.java
            │
            ├── model/
            │   ├── Producto.java
            │   ├── Pedido.java
            │   └── LineaPedido.java
            │
            ├── service/
            │   ├── ProductoService.java
            │   └── PedidoService.java
            │
            ├── ui/
            │   └── MenuProducto.java
            │
            ├── util/
            │   └── Validador.java
            │
            └── Main.java

⚙️ Funcionalidades Implementadas


✅ Gestión de Productos

    Alta de productos
    
    Listado de productos
    
    Búsqueda por ID
    
    Actualización de datos
    
    Eliminación de productos

✅ Gestión de Pedidos
  
    Creación de pedidos
    
    Asociación de múltiples productos
    
    Validación de stock
    
    Descuento automático de stock
    
    Cálculo de subtotales y total general
  
✅ Validaciones
    
    Validación de nombres
    
    Validación de precios
    
    Validación de stock
    
    Prevención de datos inválidos

✅ Manejo de Excepciones
  
Excepciones personalizadas implementadas:

    ProductoNoEncontradoException

    StockInsuficienteException


🧠 Conceptos Aplicados

Este proyecto implementa conceptos fundamentales del desarrollo backend:

    Programación Orientada a Objetos
    
    Encapsulamiento
    
    Composición
    
    Modularización
    
    Colecciones
    
    Manejo de excepciones
    
    Separación de responsabilidades
    
    Arquitectura por capas
    
    Reutilización de código
  
▶️ Ejecución del Proyecto

Requisitos

    Java JDK 17 o superior

    Visual Studio Code

    Java Extension Pack
  
Ejecutar desde VS Code
  
    Abrir el proyecto
    
    Esperar la carga del Java Language Server
    
    Abrir 'Main.java'
    
    Presionar 'Run Java'

🖥️ Menú Principal

El sistema incluye un menú interactivo:

    1. Agregar producto
    2. Listar productos
    3. Buscar producto
    4. Eliminar producto
    5. Crear pedido
    6. Listar pedidos
    7. Salir

📌 Ejemplo de Flujo

Crear Producto

    Nombre: Café Premium
    Precio: 5500
    Stock: 10

Crear Pedido

    ID producto: 1
    Cantidad: 2

El sistema:

    Valida stock
    Calcula subtotales
    Calcula total
    Actualiza stock automáticamente

🔮 Mejoras Futuras

El proyecto puede evolucionar hacia un entorno más profesional implementando:

    Spring Boot
    API REST
    MySQL o PostgreSQL
    Hibernate/JPA
    Docker
    Testing con JUnit
    Logging
    Seguridad y autenticación
    Persistencia real de datos

👨‍💻 Autor

Proyecto desarrollado como práctica académica orientada al aprendizaje de desarrollo backend en Java.

📄 Licencia

Este proyecto fue desarrollado con fines educativos y de aprendizaje.

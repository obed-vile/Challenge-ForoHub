# ForoHub API

ForoHub es una API REST desarrollada en **Spring Boot** diseñada para gestionar tópicos en un foro. Proporciona funcionalidades como creación, consulta, actualización y eliminación de tópicos, además de contar con autenticación basada en **JWT** para garantizar la seguridad.

---

## 🚀 Funcionalidades principales

- **Crear un nuevo tópico**:  
  Endpoint `/topicos` `(POST)`. Permite registrar un nuevo tópico proporcionando título, mensaje, autor y curso.

- **Listar tópicos**:  
  Endpoint `/topicos` `(GET)`. Devuelve todos los tópicos registrados en formato JSON.

- **Detalle de un tópico**:  
  Endpoint `/topicos/{id}` `(GET)`. Permite consultar los detalles de un tópico específico.

- **Actualizar un tópico**:  
  Endpoint `/topicos/{id}` `(PUT)`. Permite actualizar los datos de un tópico existente.

- **Eliminar un tópico**:  
  Endpoint `/topicos/{id}` `(DELETE)`. Elimina un tópico de la base de datos.

- **Autenticación con JWT**:  
  Los usuarios deben autenticarse para acceder a los endpoints protegidos. Generación de token en `/login`.

---

## ⚙️ Tecnologías utilizadas

- **Java**: JDK 17
- **Spring Boot**: 3.4.1
- **Spring Security**: Implementación de autenticación y autorización.
- **JWT (JSON Web Token)**: Seguridad basada en tokens.
- **MySQL**: Base de datos relacional para persistencia.
- **Flyway**: Migración y control de versiones de la base de datos.
- **Lombok**: Simplificación del código Java.
- **Validation**: Validación de datos en las solicitudes.

---

## 🛠️ Requisitos previos

1. **Java**: JDK 17 o superior instalado.
2. **Maven**: Para gestionar las dependencias.
3. **MySQL**: Configurado y en ejecución.
4. **IDE**: Como IntelliJ IDEA o Eclipse.

---

## 🛠️ Configuración del proyecto

1. Clona el repositorio:
~~~
git clone https://github.com/tu-usuario/foro-hub-api.git
cd foro-hub-api
~~~
   
2. Configura tu base de datos en application.properties:

~~~
spring.datasource.url=jdbc:mysql://localhost:3306/foro_hub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.jpa.hibernate.ddl-auto=none
spring.flyway.enabled=true
spring.flyway.baseline-on-migrate=true
~~~
3. Ejecuta las migraciones de Flyway:
~~~
mvn flyway:migrate
~~~

4. Compila y ejecuta el proyecto:
~~~
mvn spring-boot:run
~~~

## 🔑 Seguridad y autenticación

ForoHub utiliza JWT para la autenticación y autorización. Para generar un token:

1. Realiza una solicitud POST a /login con el usuario y contraseña en formato JSON:
~~~
{
  "username": "usuario",
  "password": "contraseña"
}
~~~

2. Recibirás un token JWT. Este debe ser enviado en el encabezado Authorization con cada solicitud protegida:
~~~
Authorization: Bearer <tu_token>
~~~

## 🔍 Pruebas de la API

Para realizar pruebas, se recomienda el uso de herramientas como Postman o Insomnia.

### Ejemplo de solicitudes
#### Crear un nuevo tópico:
-URL: `/topicos` 
-Método: `POST` 
-Body:
~~~
{
  "titulo": "Mi primer tópico",
  "mensaje": "Este es el contenido del tópico",
  "autor": "Juan Pérez",
  "curso": "Java Avanzado"
}
~~~

#### Listar todos los tópicos:
-URL: `/topicos` 
-Método: `GET` 

#### Consultar un tópico por ID:
-URL: `/topicos/1` 
-Método: `GET` 

#### Actualizar un tópico:
-URL: `/topicos/1` 

-Método: `PUT` 
-Body:
~~~
{
  "titulo": "Mi tópico actualizado",
  "mensaje": "Contenido actualizado",
  "curso": "Spring Boot"
}
~~~

#### Eliminar un tópico:

-URL: `/topicos/1` 
-Método: `DELETE`

## 🤝 Contribuciones
¡Siempre son bienvenidas las contribuciones! Si deseas colaborar, por favor abre un issue o envía un pull request.



## ¡Gracias por revisar ForoHub! 🚀

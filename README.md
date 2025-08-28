Este proyecto fue desarrollado como parte de una práctica académica en la que se implementa una aplicación en Java utilizando Maven y siguiendo los principios de Arquitectura Limpia.
El sistema está diseñado para conectarse a una base de datos y demostrar cómo organizar el código en capas desacopladas que favorecen la mantenibilidad, escalabilidad y facilidad de pruebas.

Tecnologías utilizadas:

Openjdk version "21.0.7" 2025-04-15 LTS

Maven para gestión de dependencias y construcción

Arquitectura Limpia (Clean Architecture)

Base de Datos Relacional (ejemplo: MySQL / PostgreSQL, configurable en application.properties)

Git para control de versiones

Estructura del proyecto:

La organización del código sigue los principios de arquitectura limpia:

Domain → Contiene las entidades de negocio y las interfaces.

Application → Lógica de aplicación y casos de uso.

Infrastructure → Implementaciones técnicas (persistencia, conexión a BD, adaptadores).

Presentation → Punto de entrada (controladores o interfaz).

Requisitos previos:

Antes de ejecutar el proyecto, asegúrate de tener instalado:

Java JDK 17 o superior (Preferencialmente 21.0.7)

Apache Maven

Un gestor de base de datos (ejemplo: MySQL, PostgreSQL)

Instalación y ejecución:

Clonar el repositorio:

git clone https://github.com/usuario/cleanapp.git
cd cleanapp


Compilar el proyecto con Maven:

mvn clean install


Ejecutar la aplicación:

mvn spring-boot:run


(Si no es Spring Boot, se puede ejecutar el jar generado en la carpeta target/ con java -jar nombre.jar).

Configuración de la base de datos:

En el archivo application.properties o application.yml (dependiendo de la configuración), define las credenciales de la base de datos:

spring.datasource.url=jdbc:mysql://localhost:3306/cleanapp
spring.datasource.username=usuario
spring.datasource.password=contraseña
spring.jpa.hibernate.ddl-auto=update

Aprendizajes del proyecto:

Uso de Maven para manejar dependencias y construcción del proyecto.

Aplicación de Arquitectura Limpia, separando responsabilidades por capas.

Conexión de un proyecto Java a una base de datos relacional.

Uso de Git y buenas prácticas de versionado.

Autor:

Proyecto desarrollado como parte de prácticas académicas por Erick Leomar Olivares Guzmán.

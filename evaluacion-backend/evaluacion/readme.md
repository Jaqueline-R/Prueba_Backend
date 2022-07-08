## Proyecto backend
### 1. Instruacciones para levantar el proyecto

- El proyecto utiliza java 11 y maven 3.8.4
- Clonar el proyecto
- ejecutar desde terminal el comando ```mvn clean install``` para compilar
- ejecutar ```java -jar target/evaluacion-0.0.1-SNAPSHOT.jar``` para levantar el proyecto

### 2. Base de datos
No se necesita instalar base de datos, utiliza una base de datos postgres en la nube.

Para consultar la data guardada se puede usar herramientas como Dbeaver o DataGrip

datos de conexion:

```
IP publica: 159.223.219.224
usuario: admin
password: Admin1234*
nombre de base de datos: bytesws_evaluacion
```

### 3. Endpoints

1. Consultar todas las empresas:

```
GET:
https://localhost:8080/api/company
```

2. Crear una empresa:
```
POST:
https://localhost:8080/api/company
```

body:

```json
{
	"name": "Empresa de prueba para borrar",
	"nit": "750523-K",
	"fundationDate": "2022-07-07",
	"address": "Guatemala, Guatemala"
}
```

3. Actualizar una empresa:

```
PUT:
https://localhost:8080/api/company
```


body:

```json
{
  "id": 1,
  "name": "Empresa de prueba actualizado",
  "nit": "750523",
  "fundationDate": "2022-07-08",
  "address": "Guatemala, Guatemala"
}
```

4. Eliminar una empresa

```
PUT:
https://localhost:8080/api/company/1
```

En el path de la url se coloca el ID de la empresa que se desea eliminar

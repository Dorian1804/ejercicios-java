# Conexión a base de datos

Ejemplos de acceso a datos; requieren controlador JDBC y configuración local.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [build.xml](build.xml)
- [src/database_conexion/Database_Conexion.java](src/database_conexion/Database_Conexion.java)
- [src/database_conexion/Db_conexion.java](src/database_conexion/Db_conexion.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [Database_Conexion](src/database_conexion/Database_Conexion.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out database_conexion.Database_Conexion
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import java.sql.*
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

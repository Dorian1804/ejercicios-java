# Caja de ahorros

Ejercicios de gestión de saldo y formularios de entrada.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [build.xml](build.xml)
- [src/caja/de/ahorros/CajaDeAhorros.java](src/caja/de/ahorros/CajaDeAhorros.java)
- [src/CajaDeAhorrosConInteres.java](src/CajaDeAhorrosConInteres.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [CajaDeAhorrosConInteres](src/CajaDeAhorrosConInteres.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out cajadeahorros.CajaDeAhorrosConInteres
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import java.util.Scanner
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

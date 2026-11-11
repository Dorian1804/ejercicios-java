# Cotizaciones y desarrollo de charolas

Formularios para capturar cotizaciones y calcular desarrollos.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [src/Cotizaciones.form](src/Cotizaciones.form)
- [src/Cotizaciones.java](src/Cotizaciones.java)
- [src/DesarrolloDeCharolas.form](src/DesarrolloDeCharolas.form)
- [src/DesarrolloDeCharolas.java](src/DesarrolloDeCharolas.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [Cotizaciones](src/Cotizaciones.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out Cotizaciones
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import javax.swing.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.util.HashMap
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

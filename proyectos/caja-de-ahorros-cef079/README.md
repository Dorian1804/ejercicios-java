# Caja de ahorros

Ejercicios de gestión de saldo y formularios de entrada.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [build.xml](build.xml)
- [src/Datosdeentrada.form](src/Datosdeentrada.form)
- [src/Datosdeentrada.java](src/Datosdeentrada.java)
- [src/Entrada.form](src/Entrada.form)
- [src/Entrada.java](src/Entrada.java)
- [src/PanelDeEntrada.form](src/PanelDeEntrada.form)
- [src/PanelDeEntrada.java](src/PanelDeEntrada.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [PanelDeEntrada](src/PanelDeEntrada.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out PanelDeEntrada
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import javax.swing.*
import java.awt.event.ActionEvent
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

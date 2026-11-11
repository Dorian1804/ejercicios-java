# JavaApplication24

Práctica recuperada de Java, Swing, concurrencia y programación orientada a objetos. El inventario inferior muestra exactamente los archivos disponibles.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [build.xml](build.xml)
- [src/javaapplication24/JavaApplication24.java](src/javaapplication24/JavaApplication24.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [JavaApplication24](src/javaapplication24/JavaApplication24.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out javaapplication24.JavaApplication24
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

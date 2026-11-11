# Figuras geométricas

Modelado y operaciones con figuras geométricas.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [build.xml](build.xml)
- [src/trapecio/Trapecio.java](src/trapecio/Trapecio.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [Trapecio](src/trapecio/Trapecio.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out trapecio.Trapecio
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

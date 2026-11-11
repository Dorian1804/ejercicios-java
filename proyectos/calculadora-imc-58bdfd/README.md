# Calculadora de IMC

Cálculo educativo a partir del peso y la estatura; consulta las validaciones implementadas en cada variante.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [AreaYPerimetro.java](AreaYPerimetro.java)
- [CalculadoraIMC.java](CalculadoraIMC.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [AreaYPerimetro](AreaYPerimetro.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out AreaYPerimetro
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import java.util.Scanner
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

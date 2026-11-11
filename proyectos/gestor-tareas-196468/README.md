# Gestor de tareas

Formularios de tareas y panel de detalles.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [build.xml](build.xml)
- [src/cString.java](src/cString.java)
- [src/FormularioTareas.form](src/FormularioTareas.form)
- [src/FormularioTareas.java](src/FormularioTareas.java)
- [src/PanelDetalles.form](src/PanelDetalles.form)
- [src/PanelDetalles.java](src/PanelDetalles.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [FormularioTareas](src/FormularioTareas.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out FormularioTareas
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import java.util.ArrayList
import javax.swing.DefaultListModel
import javax.swing.JOptionPane
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

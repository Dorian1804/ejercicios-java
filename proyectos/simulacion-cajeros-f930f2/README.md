# Simulación de cajeros y turnos

Modelo de clientes, cajeros y asignación de turnos; algunas variantes incluyen formularios Swing.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [Actividad1_2/src/actividad1_2/Actividad1_2.java](Actividad1_2/src/actividad1_2/Actividad1_2.java)
- [Actividad1_2/src/actividad1_2/cajero.form](Actividad1_2/src/actividad1_2/cajero.form)
- [Actividad1_2/src/actividad1_2/cajero.java](Actividad1_2/src/actividad1_2/cajero.java)
- [Actividad1_2/src/actividad1_2/Cajeros.java](Actividad1_2/src/actividad1_2/Cajeros.java)
- [Actividad1_2/src/actividad1_2/Cliente.form](Actividad1_2/src/actividad1_2/Cliente.form)
- [Actividad1_2/src/actividad1_2/Cliente.java](Actividad1_2/src/actividad1_2/Cliente.java)
- [Actividad1_2/src/actividad1_2/Clientes.java](Actividad1_2/src/actividad1_2/Clientes.java)
- [Actividad1_2/src/actividad1_2/Personas.java](Actividad1_2/src/actividad1_2/Personas.java)
- [Actividad1_2/src/actividad1_2/Principal.form](Actividad1_2/src/actividad1_2/Principal.form)
- [Actividad1_2/src/actividad1_2/Principal.java](Actividad1_2/src/actividad1_2/Principal.java)
- [Actividad1_2/src/actividad1_2/Turnos.form](Actividad1_2/src/actividad1_2/Turnos.form)
- [Actividad1_2/src/actividad1_2/Turnos.java](Actividad1_2/src/actividad1_2/Turnos.java)
- [Actividad1_2/src/actividad1_2/XML.java](Actividad1_2/src/actividad1_2/XML.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [Actividad1_2](Actividad1_2/src/actividad1_2/Actividad1_2.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out actividad1_2.Actividad1_2
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import java.awt.Dimension
import java.awt.Toolkit
import java.util.Dictionary
import javax.swing.JOptionPane
import java.io.File
import java.io.IOException
import java.util.Hashtable
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.util.LinkedList
import java.util.List
import java.util.Queue
import javax.swing.DefaultListModel
import javax.swing.JButton
import javax.swing.JLabel
import javax.swing.JList
import javax.swing.JTextField
import javax.swing.Timer
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

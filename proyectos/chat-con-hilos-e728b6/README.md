# Chat y comunicación concurrente

Estudio de clientes e hilos de comunicación en Java.

## Tecnologías

Java, Swing, concurrencia y programación orientada a objetos.

## Archivos disponibles

- [build.xml](build.xml)
- [src/chat_4e1/Chat_4E1.java](src/chat_4e1/Chat_4E1.java)
- [src/chat_4e1/Cliente.form](src/chat_4e1/Cliente.form)
- [src/chat_4e1/Cliente.java](src/chat_4e1/Cliente.java)
- [src/chat_4e1/HiloCliente.java](src/chat_4e1/HiloCliente.java)
- [src/chat_4e1/HiloServidor.java](src/chat_4e1/HiloServidor.java)

## Cómo ejecutarlo

Instala un JDK. Puedes abrir el código en IntelliJ IDEA, NetBeans o VS Code con soporte Java.

Entrada detectada: [Chat_4E1](src/chat_4e1/Chat_4E1.java). Compila incluyendo todas las clases y dependencias del proyecto, por ejemplo desde esta carpeta:

```powershell
New-Item -ItemType Directory out -Force
$fuentes = Get-ChildItem -Recurse -Filter *.java | Select-Object -ExpandProperty FullName
javac -encoding UTF-8 -d out $fuentes
java -cp out chat_4e1.Chat_4E1
```

Este comando requiere que estén presentes todas las clases referenciadas.

## Dependencias identificadas en el código

```text
import java.awt.Dimension
import java.awt.Toolkit
import java.io.IOException
import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress
import java.net.SocketException
import java.net.UnknownHostException
import java.util.logging.Level
import java.util.logging.Logger
import javax.swing.JOptionPane
import java.util.StringTokenizer
```

## Estado

Fuente académica recuperada.  No se ha comprobado su funcionamiento completo en esta revisión. Las variantes se mantienen separadas para conservar su contenido.

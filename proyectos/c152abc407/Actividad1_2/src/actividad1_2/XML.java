 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_2;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author roafi
 */
public class XML {
    private File arch;
    private DocumentBuilderFactory dbFactory;
    private DocumentBuilder dBuilder;
    private Document doc;
    
    public XML()
    {
        arch=new File ("XML/ejemplo.xml");
        if (arch.exists())
        {
            if (!arch.isFile())
            {
                JOptionPane.showMessageDialog(null, "Error al abrir el XML");
            }
        }
        else
        {
            try {
                arch.createNewFile();
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al abrir el XML");
             }
        }
    }
    public void leerXML()
    {
        try {
            dbFactory = DocumentBuilderFactory.newInstance();
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(arch);
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Error al abrir el XML");
            System.exit(0);
        }
        NodeList listaNodos=doc.getElementsByTagName("Alumno");
        //JOptionPane.showMessageDialog(null, "Existen :"+listaNodos.getLength());
        for (int i = 0; i < listaNodos.getLength(); i++) {
            Node nodo=listaNodos.item(i);
            if (nodo.getNodeType()==Node.ELEMENT_NODE)
            {
                Element alumno=(Element)nodo;
                JOptionPane.showMessageDialog(null, "ID del alumno: "+alumno.getAttribute("idAlumno"));
                JOptionPane.showMessageDialog(null, "Nombre del alumno: "+alumno.getElementsByTagName("Nombre").item(0).getTextContent());
                JOptionPane.showMessageDialog(null, "Apellido paterno del alumno: "+alumno.getElementsByTagName("App").item(0).getTextContent());
                JOptionPane.showMessageDialog(null, "Apellido Materno del alumno: "+alumno.getElementsByTagName("Apm").item(0).getTextContent());
                JOptionPane.showMessageDialog(null, "Fecha de nacimiento del alumno: "+alumno.getElementsByTagName("Fecha_nac").item(0).getTextContent());
            }
        }
    }
}

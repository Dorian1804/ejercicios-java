/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package actividad1_2;

import java.io.File;
import java.io.IOException;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author roafi
 */
public class XML {
    private File arch;
    private DocumentBuilderFactory dbFactory;
    private DocumentBuilder dBuilder;
    private Document doc;
    private Dictionary lista;


    public XML(File arch) {
     
        this.arch=arch;
       lista= new Hashtable();
    }
    
    public Dictionary leeXML() throws NullPointerException
    {
        try{
            dbFactory=DocumentBuilderFactory.newInstance();
            dBuilder=dbFactory.newDocumentBuilder();
            doc=dBuilder.parse(arch);
        }catch (Exception e)
        {
             JOptionPane.showMessageDialog(null,"Error al abrir el archivo XML","Banco Internacional de Hyrule (BIH)",JOptionPane.ERROR_MESSAGE);
             throw new NullPointerException(); 
        }
        //Eliminar nodos vacios
        doc.getDocumentElement().normalize();
        
        NodeList nList = doc.getElementsByTagName("Cliente");
        
        for (int i=0;i<nList.getLength();i++)
        {
            Clientes c=new Clientes();
            Node nodo=nList.item(i);
            if (nodo.getNodeType()==Node.ELEMENT_NODE)
            {
                Element elemento =(Element) nodo;
                c.setNumCliente(Integer.parseInt(elemento.getAttribute("numCliente")));
                c.setNombre(elemento.getElementsByTagName("Nombre").item(0).getTextContent());
                c.setApp(elemento.getElementsByTagName("App").item(0).getTextContent());
                c.setApm(elemento.getElementsByTagName("Apm").item(0).getTextContent());
                c.setRfc(elemento.getElementsByTagName("RFC").item(0).getTextContent());
                c.setTipo(elemento.getElementsByTagName("Tipo").item(0).getTextContent().charAt(0));
                c.setSalarioMensual(Double.parseDouble(elemento.getElementsByTagName("Salario_Mensual").item(0).getTextContent()));
                c.setDireccion(elemento.getElementsByTagName("Direccion").item(0).getTextContent());
                
                lista.put(c.getNumCliente(), c);
              }
        }
        return lista;
       
        
    }
    
    public void escribirXML(Dictionary lista)
    {
         try{
           
            
            dbFactory=DocumentBuilderFactory.newInstance();
            dBuilder=dbFactory.newDocumentBuilder();
            doc=dBuilder.newDocument();
            
            Element raiz = doc.createElement("Clientes");
            doc.appendChild(raiz);
            
            for (int i=1;i<=lista.size();i++)
            {
                Clientes tmp=(Clientes)lista.get(i);
                Element alumno=doc.createElement("Cliente");
                raiz.appendChild(alumno);
                Attr atributo=doc.createAttribute("numCliente");
                atributo.setValue(String.valueOf(tmp.getNumCliente()));
                alumno.setAttributeNode(atributo);
            
                Element nombreCliente=doc.createElement("Nombre");
                nombreCliente.appendChild(doc.createTextNode(tmp.getNombre()));
                alumno.appendChild(nombreCliente);
                
                Element appCliente=doc.createElement("App");
                appCliente.appendChild(doc.createTextNode(tmp.getApp()));
                alumno.appendChild(appCliente);
                
                Element apmCliente=doc.createElement("Apm");
                apmCliente.appendChild(doc.createTextNode(tmp.getApm()));
                alumno.appendChild(apmCliente);
                
                Element rfcCliente=doc.createElement("RFC");
                rfcCliente.appendChild(doc.createTextNode(tmp.getRfc()));
                alumno.appendChild(rfcCliente);
                
                Element tipoCliente=doc.createElement("Tipo");
                tipoCliente.appendChild(doc.createTextNode(String.valueOf(tmp.getTipo())));
                alumno.appendChild(tipoCliente);
            
                Element salarioCliente=doc.createElement("Salario_Mensual");
                salarioCliente.appendChild(doc.createTextNode(String.valueOf(tmp.getSalarioMensual())));
                alumno.appendChild(salarioCliente);
                
                Element direccionCliente=doc.createElement("Direccion");
                direccionCliente.appendChild(doc.createTextNode(tmp.getDireccion()));
                alumno.appendChild(direccionCliente);
            
            TransformerFactory tFactory=TransformerFactory.newInstance();
            Transformer optimusPrime=null;
                try {
                    optimusPrime = tFactory.newTransformer();
                } catch (TransformerConfigurationException ex) {
                }
            DOMSource source = new DOMSource(doc);
            StreamResult resultado=new StreamResult (new File("XML/clientes.xml"));
                try {
                    optimusPrime.transform(source, resultado);
                } catch (TransformerException ex) {
                }
            
        
    }
    
    
    
}catch (Exception e){
            JOptionPane.showMessageDialog(null,e.getStackTrace());
        }
    }

}
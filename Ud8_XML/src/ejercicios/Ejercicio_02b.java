package ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class Ejercicio_02b {
	
	public static void main(String[] args) {
		//Prueba a hacerlo sin ArrayList tambien
		ArrayList<Departamento> lista=leerFichero();
		
		crearXML(lista);
		
		leerXML();
	}

	public static ArrayList<Departamento> leerFichero(){
		ArrayList<Departamento> lista= new ArrayList<Departamento>();
		File fichero = new File("documentos/departamentos.dat");

		if (fichero.exists()) { 
			ObjectInputStream entrada = null;
			Departamento d;
			try {
				entrada = new ObjectInputStream(new FileInputStream(fichero));
				while (true) {
					d = (Departamento) entrada.readObject();
					lista.add(d);
				}
			} catch (ClassNotFoundException e) {
			} catch (FileNotFoundException e) {
			} catch (IOException e) {}
			finally {
				try {
					if(entrada != null) {
						entrada.close();
					}
				} catch (IOException e) {}
			}
		}
		return lista;
	}

	public static void crearXML(ArrayList<Departamento> lista) {
		try {
            
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
 
            Document documento = implementation.createDocument(null, "departamentos", null);
            documento.setXmlVersion("1.0"); 
            
            for (Departamento d : lista) {
            	Element departamento = documento.createElement("departamento");
            	
            	 Element numDepartamento = documento.createElement("numDepartamento");
            	 Text textNumero = documento.createTextNode(Integer.toString(d.getNumDepartamento()));
            	 numDepartamento.appendChild(textNumero);
                 departamento.appendChild(numDepartamento);
                 
                 Element nombre = documento.createElement("nombre");
            	 Text textNombre = documento.createTextNode(d.getNombre());
            	 nombre.appendChild(textNombre);
                 departamento.appendChild(nombre);
                 
                 Element localidad = documento.createElement("localidad");
            	 Text textLocalidad = documento.createTextNode(d.getLocalidad());
            	 localidad.appendChild(textLocalidad);
                 departamento.appendChild(localidad);
                 
                 documento.getDocumentElement().appendChild(departamento);
                 System.out.println();
             
			}
            
            Source source = new DOMSource(documento);
            Result result = new StreamResult(new File("documentos/departamentos.xml"));
 
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
            System.out.println("--Fichero creado--\n");
 
        } catch (ParserConfigurationException | TransformerException ex) {
            System.out.println(ex.getMessage());
        }
	}

	public static void leerXML() {
		try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            
            Document documento = builder.parse(new File("documentos/departamentos.xml"));
            
            NodeList listaDepartamentos = documento.getElementsByTagName("departamento");
 
            for (int i = 0; i < listaDepartamentos.getLength(); i++) {
             
                Node nodo = listaDepartamentos.item(i);
                if (nodo.getNodeType() == Node.ELEMENT_NODE) {

                    NodeList hijos = nodo.getChildNodes();
                    
                    for (int j = 0; j < hijos.getLength(); j++) {
                       
                        Node hijo = hijos.item(j);
                        
                        if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                            
                            System.out.println(hijo.getNodeName()
                                    + ": " + hijo.getTextContent());
                        }
 
                    }
                    System.out.println("");
                }
 
            }
 
        } catch (ParserConfigurationException | SAXException | IOException ex) {
            System.out.println(ex.getMessage());
        }
	}
}
	


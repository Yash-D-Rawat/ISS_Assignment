package XML;

import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class XMLAddDemo {

    public static void main(String[] args) {

        try {
            File file = new File("D:\\ISSAssignment\\Core-Java\\src\\XML\\pokemon.xml");

            DocumentBuilder builder =
                    DocumentBuilderFactory.newInstance().newDocumentBuilder();

            Document doc = builder.parse(file);

            Element root = doc.getDocumentElement();

            Element pokemon = doc.createElement("pokemon");

            Element id = doc.createElement("id");
            id.setTextContent("3");

            Element name = doc.createElement("name");
            name.setTextContent("Bulbasaur");

            Element type = doc.createElement("type");
            type.setTextContent("Grass");

            pokemon.appendChild(id);
            pokemon.appendChild(name);
            pokemon.appendChild(type);

            root.appendChild(pokemon);

            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.transform(
                    new DOMSource(doc),
                    new StreamResult(file)
            );

            System.out.println("New Pokemon Added");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

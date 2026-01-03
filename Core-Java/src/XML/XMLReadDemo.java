package XML;

import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.*;

public class XMLReadDemo {
    public static void main(String[] args) {

        try {
            File file = new File("D:\\ISSAssignment\\Core-Java\\src\\XML\\pokemon.xml");

            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();

            Document doc = builder.parse(file);

            NodeList list =
                    doc.getElementsByTagName("pokemon");

            for (int i = 0; i < list.getLength(); i++) {

                Element e = (Element) list.item(i);

                String name =
                        e.getElementsByTagName("name")
                                .item(0)
                                .getTextContent();

                System.out.println(name);
            }

            for (int i = 0; i < list.getLength(); i++) {

                Element pokemon = (Element) list.item(i);

                String id =
                        pokemon.getElementsByTagName("id")
                                .item(0)
                                .getTextContent();

                if (id.equals("1")) {
                    Element type =
                            (Element) pokemon
                                    .getElementsByTagName("type")
                                    .item(0);

                    type.setTextContent("Electric + Fairy");
                }
            }

            Transformer transformer =
                    TransformerFactory.newInstance().newTransformer();
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.transform(
                    new DOMSource(doc),
                    new StreamResult(file)
            );

            System.out.println("XML Updated Successfully");

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}

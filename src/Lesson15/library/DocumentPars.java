package Lesson15.library;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class DocumentPars {
    private static ArrayList<Book> books = new ArrayList<>();
    public static ArrayList<Book> bookDocument() throws ParserConfigurationException, IOException, SAXException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("test1.xml"));
        NodeList bookElements = document.getDocumentElement().getElementsByTagName("employee");
        for (int i = 0; i < bookElements.getLength(); i++) {
            Node book = bookElements.item(i);
            NamedNodeMap attributes = book.getAttributes();
            books.add(new Book(attributes.getNamedItem("name").getNodeValue(), attributes.getNamedItem("genre").getNodeValue(), attributes.getNamedItem("year").getNodeValue(), attributes.getNamedItem("cover").getNodeValue()));
        }

        for (Book book : books) {
            System.out.println(String.format("Книга : имя - %s, жанр - %s,год - %s, обложка книги - %s.", book.getName(), book.getGenre(), book.getYear(), book.getCover()));
        }
        return books;
    }

}

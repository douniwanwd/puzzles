package dom;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.dom4j.Document;
import org.dom4j.io.DOMReader;

/**
 * A simple test program to demonstrate using W3C DOM and JAXP to load a DOM XML
 * tree then converting it to a DOM4J tree.
 * 
 * @author <a href="mailto:james.strachan@metastuff.com">James Strachan </a>
 * @version $Revision: 1.4 $
 */
public class DOMDemo extends AbstractDemo {

    public static void main(String[] args) {
        run(new DOMDemo(), args);
    }

    public DOMDemo() {
    }

    protected Document parse(String url) throws Exception {
        // parse a DOM tree
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();

        System.out.println("Loading document with JAXP builder: " + builder);

        org.w3c.dom.Document domDocument = builder.parse(url);

        System.out.println("Created W3C DOM document: " + domDocument);

        // now convert to DOM4J model
        DOMReader reader = new DOMReader();
        Document document = reader.read(domDocument);

        System.out.println("Created DOM4J document: " + document);

        return document;
    }

}
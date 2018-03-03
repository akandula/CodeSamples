package xpath;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import javax.xml.xpath.*;

public class ProductXPath {
	
	public static void display(){
		try{
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.parse("src\\data\\products.xml");
			XPath xp = XPathFactory.newInstance().newXPath();
			NodeList nl = (NodeList)xp.compile("//product").evaluate(d, XPathConstants.NODESET);
			System.out.println("Number of product : " + nl.getLength());
			System.out.println("List product information");
			for(int i=0; i < nl.getLength(); i++){
				System.out.println("id : " + xp.compile("./@id").evaluate(nl.item(i)));
//				Get Name Node
				System.out.println("Name :" + xp.compile("./name").evaluate(nl.item(i)));
//				Get Price Node
				System.out.println("Price :" + xp.compile("./price").evaluate(nl.item(i)));
				System.out.println("=================================================");
			}
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}

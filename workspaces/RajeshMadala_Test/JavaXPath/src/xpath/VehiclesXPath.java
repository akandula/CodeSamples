package xpath;

import javax.xml.parsers.*;

import org.w3c.dom.*;

import javax.xml.xpath.*;

public class VehiclesXPath {
	
	public static void display(){
		try{
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document d = db.parse("src\\data\\VehicleFleetInformation.xml");
			XPath xp = XPathFactory.newInstance().newXPath();
			NodeList nl = (NodeList)xp.compile("//Vehicles").evaluate(d, XPathConstants.NODESET);
			System.out.println("Number of Vehicles : " + nl.getLength());
//			System.out.println("List product information");
		}
		catch(Exception e){
		
			System.out.println(e.getMessage());
		}
		
	}
}
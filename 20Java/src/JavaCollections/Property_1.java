package JavaCollections;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Property_1 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		prop.load(new FileReader("src/JavaCollections/application.properties"));
		String driver = prop.getProperty("driver");
		String url = prop.getProperty("url");
		String user = prop.getProperty("user");
		String password = prop.getProperty("password");
		
		System.out.println("driver : " + driver);
		System.out.println("url : " + url);
		System.out.println("user : " + user);
		System.out.println("password : " + password);
		
		//프로퍼티 정보 저장
		prop.storeToXML(new FileOutputStream("dbconf.xml"), "DataBase Configuration");
	}
}

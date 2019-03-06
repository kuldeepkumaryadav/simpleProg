package asd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadDataFromConfigFile {
	public void readProperties() {
		InputStream input = null;
		Properties prop = new Properties();
		try {
			input = new FileInputStream(
					"C:\\Users\\Kuyadav\\eclipse-workspace\\asd\\src\\main\\resources\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("read"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String args[]) {
		ReadDataFromConfigFile rdfn = new ReadDataFromConfigFile();
		rdfn.readProperties();
	}

}

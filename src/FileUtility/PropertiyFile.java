package FileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiyFile {
	public static String getProperty(String key) throws IOException {
		String value = null;
		FileInputStream fis = new FileInputStream(".//propertyFile//ObjectRepo.properties");
		Properties prop = new Properties();
		prop.load(fis);

		return value = prop.getProperty(key);
	}

}

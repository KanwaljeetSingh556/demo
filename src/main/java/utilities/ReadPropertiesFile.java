package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile
{
	String FileName;
	FileInputStream myfile;
	public ReadPropertiesFile(String FileName) 
	{
		this.FileName = FileName;
		
	}
	
	public String ReadData(String userKey) 
	{
		 try {
			myfile = new FileInputStream(FileName);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties p = new Properties();
		try {
			p.load(myfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p.getProperty(userKey);
		
		
		
	}

}

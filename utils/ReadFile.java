package utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import constants.FileConstant;
import constants.FileConstant;

public class ReadFile {
	
	
	public static String readPropertiesFile(String path, String key) throws IOException {
		File f = new File(path);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	}

	
	/**
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public static String readUserMenuTestData(String key) throws IOException {
		File f = new File(FileConstant.USER_MENU_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	
		
	}
	public static String opportunityUserMenuTestData(String key) throws IOException {
		File f = new File(FileConstant.OPPORTUNITY_MENU_TESTDATA_FILE_PATH);
		FileReader fr = new FileReader(f);
		Properties p = new Properties();
		p.load(fr);
		return p.getProperty(key);
	
		
	}



	public static void copyFile(File src, File dst) {
		// TODO Auto-generated method stub
		
	}
	
	}
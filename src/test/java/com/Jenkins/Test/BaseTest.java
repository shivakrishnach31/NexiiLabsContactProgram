package com.Jenkins.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import jxl.Sheet;
import jxl.Workbook;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import testUtils.helper;

public class BaseTest {
	public static WebDriver driver;
	public static Properties or;
	public static Properties config;
	public static Workbook wb;
	public static Sheet sheetid;
	public static helper h;
	
  
  @BeforeSuite
  public void beforeSuite() throws IOException, Exception {
	  h = new helper();
	  or = new Properties();
	  config = new Properties();
	  or.load(new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\config\\OR.properties"));
	  config.load(new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\Config.properties"));
	  FileInputStream fp = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\testdata\\NexiiJenkinstestdata.xls");
	  wb = Workbook.getWorkbook(fp);
	  sheetid = wb.getSheet(0);
  }

}

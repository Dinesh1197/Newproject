package org.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	//browser launch 	
	public static WebDriver chromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		return driver;
		}
	public static WebDriver firefoxBrowser() {
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		return driver;
        }
	public static WebDriver edgeBrowser() {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		return driver;
        }
	//url launch
	public static void urllaunch(String url) {
		driver.get(url);
	    }
	//maximize
	public static void windowmaximize() {
		driver.manage().window().maximize();
	   }
	//implicit wait
	public static void implicitwait(int secs){
	    driver.manage().timeouts().implicitlyWait(secs, TimeUnit.SECONDS);
	    }
	//send keys
	public static void sendkeys(WebElement W, String user) {
	   W.sendKeys(user);
	    }
	//click
	public static void click(WebElement W) {
	   W.click();
	}
	//selectbyindex   
	public static void selectByIndex(WebElement W, int index) {
		Select s=new Select(W);
		s.selectByIndex(index);
	}
	// move to element
	public static void moveElement(WebElement target) {
	Actions a=new Actions (driver);
	a.moveToElement(target).perform();
	}
	//drag and drop
	public static void dragAndDrop(WebElement from, WebElement to) {
	Actions a=new Actions(driver);
	a.dragAndDrop(from, to).perform();
	}
	//Excel
	
	public static String getExcel(String filename, String Sheet, int row, int c) throws IOException {
		
	File f=new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenNew\\src\\test\\resources\\"+filename+".xlsx");
	FileInputStream fi=new FileInputStream(f);		
	Workbook w=new XSSFWorkbook(fi);
	Sheet s =w.getSheet("Sheet");
	Row r = s.getRow(row);
	Cell cell = r.getCell(c);	
	int type = cell.getCellType();
	
	//type 1 -- text
	//type 0 -- number, date
	
	String value;
	if(type==1) {
		value = cell.getStringCellValue();			
	}
else {
			if(DateUtil.isCellDateFormatted(cell)) {
				Date d = cell.getDateCellValue();
				SimpleDateFormat si = new SimpleDateFormat("DD-MMM-YYYY");
				value = si.format(d);			
		}
else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
			value = String.valueOf(l);			
		}	
	}
	return value;	
	}
}


package testingbaba_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.Baselibrary;
import excelutility.Excelutility;

public class CheckboxPage extends Baselibrary
{
	Excelutility excel = new Excelutility();
	String path="C:\\Users\\sachi\\eclipse-workspace\\CheckboxAssertion\\testdata\\sheet2.xlsx";
	public void getTitle()
	{
		String title = driver.getTitle();
		System.out.println("testingbaba title is:"+title);
	}
	
	public CheckboxPage()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="//*[@class=\"close\"]")
	private WebElement closebtn;
	@FindBy(xpath="//*[@href=\"newdemo.html\"]")
	private WebElement practice;
	@FindBy(xpath="//*[@data-target=\"#elements\"]")
	private WebElement elements;
	@FindBy(xpath="//*[@href=\"#tab_2\"]")
	private WebElement checkbx;
	
	@FindBy(xpath="//*[@id=\"myCheck\"]")
	private WebElement mobile;
	@FindBy(xpath="//*[@id=\"mylaptop\"]")
	private WebElement laptop;
	@FindBy(xpath="//*[@id=\"mydesktop\"]")
	private WebElement desktop;
	@FindBy(xpath="//*[@id=\"tab_2\"]/div/iframe")
	private WebElement iframe;
	
	@FindBy(xpath="//h6[text()=\"You are selected Mobile\"]")
	private WebElement mobiletext;
	@FindBy(xpath="//h6[text()=\"You are Selected Laptop\"]")
	private WebElement laptoptext;
	@FindBy(xpath="//h6[text()=\"You are Selected Desktop\"]")
	private WebElement desktoptext;
	
	public void getClosebtn()
	{
		closebtn.click();
	}
	public void getPractice()
	{
		practice.click();
	}
	public void getElements()
	{
		elements.click();
	}
	public void getCheckbox()
	{
		checkbx.click();
	}
	public void getdata()
	{
		driver.switchTo().frame(iframe);
		mobile.click();
		org.testng.Assert.assertEquals(mobiletext.getText(),excel.getReadData(path,0,1,1));
		laptop.click();
		org.testng.Assert.assertEquals(laptoptext.getText(),excel.getReadData(path,0,1,2));
		desktop.click();
		org.testng.Assert.assertEquals(desktoptext.getText(),excel.getReadData(path,0,1,3));
		driver.switchTo().defaultContent();
	}
	
}

package testingbaba_test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.Baselibrary;
import testingbaba_pages.CheckboxPage;

public class CheckboxTest extends Baselibrary{
	CheckboxPage obj;
	@BeforeTest
	public void getLaunchUrl_testingbaba()
	{
		getLaunchUrl("https://testingbaba.com/old/");
		obj = new CheckboxPage();
	}
	@Test(priority=1)
	public void getTitle_testingbaba()
	{
		obj.getTitle();
	}
	@Test(priority=2)
	public void getclosebtn_testing()
	{
		obj.getClosebtn();
	}
	@Test(priority=3)
	public void practicebtn_testing()
	{
		obj.getPractice();
	}
	@Test(priority=4)
	public void getelements_testing()
	{
		obj.getElements();
	}
	@Test(priority=5)
	public void getcheckbx_testingbaba()
	{
		obj.getCheckbox();
	}
	@Test(priority=6)
	public void getcheck_testingbaba()
	{
		obj.getdata(); 
	}
}

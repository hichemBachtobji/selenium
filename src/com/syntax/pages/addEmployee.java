package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class addEmployee extends CommonMethods {
	
	@FindBy(id="firstName")
	public WebElement empName;
	
	@FindBy(id ="lastName")
	public WebElement lastName;
	
	@FindBy(id="employeeId")
	public WebElement empId;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	public addEmployee(){
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	

}

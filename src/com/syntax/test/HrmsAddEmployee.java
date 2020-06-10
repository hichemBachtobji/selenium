package com.syntax.test;

import com.syntax.pages.addEmployee;
import com.syntax.pages.DashBoardPageElements;
import com.syntax.pages.LoginPageElements;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HrmsAddEmployee extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		LoginPageElements login= new LoginPageElements();
		
		
		sendText(login.username, ConfigsReader.getProperty("userName"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		
		
		DashBoardPageElements dashboard= new DashBoardPageElements();

		
		
		click(dashboard.PIM);
		click(dashboard.addEmp);
		
		
		addEmployee employee=new addEmployee();
		
		
		sendText(employee.empName, "Hich");
		sendText(employee.lastName, "Bach");
		sendText(employee.empId, "1989");
		click(employee.saveBtn);
		
		
	}

}

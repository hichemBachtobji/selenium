package com.syntax.hw;

import com.syntax.utils.BaseClass;

import okio.Buffer;

public class TestClass extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		//tearDown();
		
		
		
	}

}

package com.TestNGPractice;

public class DataProvider {
	
	//@DataProvider(name = "getData")
	public Object[][] getData(){
		//Object [][] data = new Object [rowCount][colCount]
		Object [][] data = new Object[2][2]; 
		data[0][0]= "FirstUid";
		data[0][1]= "FirstPwd";
		data[1][0]= "SecondUid";
		data[1][1]= "SecondPwd";
		return data;
		
	} 

}

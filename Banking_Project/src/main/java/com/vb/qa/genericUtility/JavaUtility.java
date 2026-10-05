package com.vb.qa.genericUtility;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtility {
	public String currentDate() {
		Date d=new Date(); //gives current date including time
		SimpleDateFormat sim=new SimpleDateFormat("MM-yy");//we dont want time so we use data mention and mention in() what format to use
		return sim.format(d); //it gives for which date, format is required
		
	}
}

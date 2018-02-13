package com.app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeFmte {
	public static void main(String[] args)
	   {
String input="10/12/2014 10:22:12 PM";
// formate date define in input String
DateFormat df= new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
//desired date formate
DateFormat outputDate=new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
Date date=null;
String output=null;
try{
	date=df.parse(input);
	output=outputDate.format(date);
	System.out.println(output);
	
}
catch(ParseException pe){
    pe.printStackTrace();
  }

}
}

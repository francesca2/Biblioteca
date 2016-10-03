package Biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//Confrontare due date
public class DataUtility {
	
	public static Date convertStringToDate(String s) throws ParseException{
		
		SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");

		Date d=sf.parse(s);
		
		return d;
		
	}
	
	public static String convertDatetoString(Date d){
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		String s=sf.format(d);
		
		return s;
	}
	
	public java.sql.Date convertJavaDateToSqlDate(Date d){
		
		java.sql.Date dSql = new java.sql.Date(d.getTime());
		
		return dSql;
	}

}

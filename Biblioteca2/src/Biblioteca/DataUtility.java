package Biblioteca;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DataUtility {
	
	//Converte una stringa in un oggetto Date
	public static Date convertStringToDate(String s) throws ParseException{
		
		SimpleDateFormat sf= new SimpleDateFormat("dd/MM/yyyy");

		Date d=sf.parse(s);
		
		return d;
		
	}
	
	//Converte una data in stringa
	public static String convertDatetoString(Date d){
		SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
		String s=sf.format(d);
		
		return s;
	}
	
	//Converte una java.util.Date in java.sql.Date
	public java.sql.Date convertJavaDateToSqlDate(Date d){
		
		java.sql.Date dSql = new java.sql.Date(d.getTime());
		
		return dSql;
	}
	
	//Converte una java.sql.Date in java.util.Date
	public Date convertSqlDateToJavaDate(Date dSql)
	{
		Date d = new Date(dSql.getTime());
		
		return d;
	}

	//Converte java.util.Date in Calendar
	public Calendar convertDateInCalendar(Date d)
	{
		Calendar cal= new GregorianCalendar();
		cal.setTime(d);
		return cal;
	}
	
	//Confronta due date usando java.sql.Date	
	public long confrontaDueDate(Date d1, Date d2)
	{
		long differenza=d1.getTime()-d2.getTime();
		return differenza;
	}
	
	//Shiftare la data di tot giorni
	public Calendar shiftaLaData(Date d, int numGiorni)
	{
		Calendar cl=new GregorianCalendar();
		cl.setTime(d);
		cl.add(Calendar.DATE,numGiorni);
		
		return cl;
		
	}
}

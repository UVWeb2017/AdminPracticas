package Servlets;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class prueba {

	public static void main(String[] args) {
		
		Calendar fech = new GregorianCalendar();
		int year = fech.get(Calendar.YEAR);
		int month = fech.get(Calendar.MONTH);
		month++;
		int day = fech.get(Calendar.DAY_OF_MONTH);
		String año = Integer.toString(year);
		String mes = Integer.toString(month);
		String dia = Integer.toString(day);
		
		String fecha = año + "-" + mes + "-" + dia;
		
		//System.out.println("0" + (mes+1));
		System.out.println(fecha);

	}

}
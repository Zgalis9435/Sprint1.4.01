package testJUnit;
import java.util.*;

import javax.swing.JOptionPane;
public class ListYear {
	
	private String month;
	private int number;
	
	public ListYear (String month, int number) {
		month=this.month;
		number=this.number;
	}

	//Getters & Setters
	
	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//Functions
	
	public static ListYear orderedList(String month, int number) {
		ListYear userYear=new ListYear[11][11];
		HashMap<String, Integer> referenceList= new HashMap();
		referenceList.put("Gener", 1);
		referenceList.put("Febrer", 2);
		referenceList.put("Març", 3);
		referenceList.put("Abril", 4);
		referenceList.put("Maig", 5);
		referenceList.put("Juny", 6);
		referenceList.put("Juliol", 7);
		referenceList.put("Agost", 8);
		referenceList.put("Septembre", 9);
		referenceList.put("Octubre", 10);
		referenceList.put("Novembre", 11);
		referenceList.put("Desembre", 12);
		int i;
		boolean listOk=false;
		String userMonth;
		while(!listOk) {
			for(i=0;i<=userYear.length;i++) {
				userMonth=JOptionPane.showInputDialog("Introdueix el mes corresponent:");
				
				userYear[i]= new ListYear(month,number);
		}
		}
	}
	

}

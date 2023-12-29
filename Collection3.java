//Create a package
package com.clection.pro1;

//Importing required class
import java.util.HashMap;

//Main class
public class Collection3 {
	
	//Main method where start any code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create two arrays 
		String[] sID = {"1", "2", "5", "8"};
		int[] sMarks = {100, 20, 83, 94};
		
		//Collection arbitrarily create an empty Hashmap of string types
		HashMap<String, Integer> sMap = new HashMap<>();
		
		for(int i=0; i<sID.length; i++) {
			String stuID = sID[i];
			int stuMarks = sMarks[i];
			
			sMap.put(stuID, stuMarks);
		}
		
		for (String ID : sMap.keySet()) {
			int mark = sMap.get(ID);
			System.out.println("sID: "+ID+ ", sMarks: "+mark);
		}
		//Print the size of data
		System.out.println("Size of the data: "+sMap.size());
	}

}

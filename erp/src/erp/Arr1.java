package erp;

import java.awt.List;
import java.util.Arrays;


public class Arr1 {

	public static void main(String[] args) {

		// initialize a new String array
		String[] studentDatabase = new String[]{"Ryan","Alfred","Beth"};
		
		// convert the student database into list
		List alist = (List) Arrays.asList(studentDatabase);
				
		// print how many student on the list
		System.out.println("Count of Student:"+alist.size());
		
		// print the contents of our list
		for(String s:alist){
			System.out.println(s);
		}

	}
}
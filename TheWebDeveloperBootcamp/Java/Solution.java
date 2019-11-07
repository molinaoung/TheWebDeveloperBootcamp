

import java.util.*;
class Solution{

static String array[] = {"Mon", "Tue", "Wed","Thu","Fri","Sat","Sun"};
	public static void main(String[] args){
			String day = "Mon";
			int k = 1;
			int dayindex = Summation(day);
			k += dayindex;
			System.out.println(Check(k));

	}	

	//Function that adds k to day of week	
	private static int Summation(String day){
		//iterate through the array to find the dow that matches day(index)
		int i = 0;
		while(i<7){
			if(array[i]==day)
				return i;
			i++;
		}
		return -1;
	}

	private static String Check(int k){
		// System.out.println(array[k]);
		// System.out.println("Inside Check");
		//check if the value is within range. if not exit
		//if in range check modulus of it
		
		System.out.println(k);
		int remainder = k%7;
		
		//Will always be 1-7
		System.out.println(remainder);


		return (array[remainder]);
		
	}
}
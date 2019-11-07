
import java.util.LinkedList;
import java.util.Collections;

public class Solution2{

    public static void main(String[] args)
    	{
	    	// Creating an empty linked list
			LinkedList<String> givenNum = new LinkedList<String>(); 
			//Adding elements to linked list
			givenNum.add("2");
			givenNum.add("6");
			givenNum.add("8");
	     	int number = 268;
			int digit = 5;
			int largestNum = getLargest(5,268);

			//output list
			//System.out.println("The Given Number is:" + givenNum);
		}

		public static int getLargest(int insertedDigit, int number)
		{
			StringBuffer s = new StringBuffer(number.toString());
			int lengthofString = s.length();
			List<Integer> allCombinations = new ArrayList<Integer>();

			for(int i=length; i>0; i--)
			{
				s.insert(i, insertedDigit); //inserts the digit 5 at a different index for every iteration
				allCombinations.add(Integer.parseInt(s.toString()));  //adds the new number to a list that contains all of the different combinations
				s = new StringBuffer(number.toString());//resets the stringbuffer instance to the initial value
			}

			System.out.println(allCombinations);
			Collections.sort(allCombinations, Comparator.reverseOrder());
			return allCombinations.get(0); //returns the larget number

		}


        //adding elements to the end

}

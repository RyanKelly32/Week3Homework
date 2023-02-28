
	import java.lang.reflect.Array;
	import java.util.Arrays;

	public class Week3Assignment {

		 public static void main(String[] args) {
			  
			int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 26};
			  
			int Last = (ages[ages.length - 1]) - ages[0];
			  
			System.out.println("The last positon minus the first positon is: " + Last);
			  
			int ageSum = 0;
			  
			for (int i = 0; i < ages.length; i++) {
				ageSum += ages[i];
			}
			System.out.println("The average age is: " + ageSum / ages.length);
			  
			System.out.println();
		    
			String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
			 
			int letters = 0;
			  
			for (String name: names) {
				letters += name.length();
			}
			 		  
			int averageletters = letters / names.length;
			System.out.println("The average letters are " + averageletters);		  
		 	
		 	
		 	String allNames = "";
		 	
		 	for(int i = 0; i < names.length; i++) {
		 		allNames = allNames.concat(" " + names[i]);
		 	}
		 	
		 	System.out.println(allNames);
		 	
//		 	lastElement = array[array.length - 1];
		 	
//		 	firstElement = array[0];
		 	
		 	int[] nameLengths = new int[names.length];
		 
		 	for(int i = 0; i <names.length; i++) {
		 		nameLengths[i] = names[i].length();
		 	}
		 	
		 	System.out.println(Arrays.toString(nameLengths));
		 	
		 	String word = multiplyString("Hello", 3);
			
		 	System.out.println(word);
	   	    }
		 
		 	public static String multiplyString(String str, int num) {
			
		    String result = "";
			
		    for (int i = 0; i < num; i++) {
		    	result += str;
		    }
			return result;
		    }
		    	    
		    public static boolean greaterThan100(int[] numbers) {
			
		    int sum = 0;
		    
		    for( int number : numbers) {
		    	sum += number;
		    }
		    
		    if (sum > 100) {
		    	
		    	return true;
		    	
		    } else {	    	
		    
		    	return false;
		    }	
		    }
		   
			public static double averageDouble(double arr[]){
				
		    double sum = 0.0;
			
		    for (double num : arr) {				
					sum+= num;
			}
		    	return sum/arr.length;
		    }
		    
			
		    
		    public static boolean isGreaterAverage(double Array1[],double Array2[])
			{
				
			double sum1 = 0.0;
			for (double num1 : Array1) {				
					sum1 += num1;
			}
			double	average1 = sum1 / Array1.length;			
					
			double sum2 = 0.0;
			for (double num2 : Array2) {					
					sum2 += num2;
			}
			double 	average2 = sum2 / Array2.length;
					
			if( average1 > average2)
			{
				return true;
					
			} else {
					
			return false;
			}
		}
		    
		   
		    
		    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {

				return ((isHotOutside == true) && (10.5 < moneyInPocket));

		    }
	}

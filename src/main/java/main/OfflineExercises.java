package main;

import java.util.ArrayList;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original string,
	// there are three chars.

	// multChar("The") → "TTThhheee"
	// multChar("AAbb") → "AAAAAAbbbbbb"
	// multChar("Hi-There") → "HHHiii---TTThhheeerrreee"

	public String multChar(String input) {
		
		String a = "";
		String x ="";
		
		for (int i = 0; i < input.length(); i++) {
			
			 a = input.substring(i, i+1);
			// x = input.substring(i+1 , i+2);
			
				for (int j = 0; j < 3; j++) {
					
					x += a;
					//x +=x;
				
			}
			
		}
		
		return x;
	}
	
	// Return the string (backwards) that is between the first and last appearance
	// of "bert"
	// in the given string, or return the empty string "" if there is not 2
	// occurances of "bert" - Ignore Case

	// getBert("bertclivebert") → "evilc"
	// getBert("xxbertfridgebertyy") → "egdirf"
	// getBert("xxBertfridgebERtyy") → "egdirf"
	// getBert("xxbertyy") → ""
	// getBert("xxbeRTyy") → ""

	public String getBert(String input) {
		
		String x  = input.toLowerCase();
		String  a = x.replace("bert", "").replace("xx", "").replace("yy", "");
		String d = "";
		
		if(a.isEmpty()) {
			return "";
		}
		
		char [] array  = a.toCharArray();
		
		for (int i = array.length-1; i >=  0; i--) {
			
			
			char c = array[i];
			 d += String.valueOf(c);
			
		}
		
		
		return d;
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large. Do not assume the ints will come to you in a reasonable
	// order.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false
	// evenlySpaced(4, 60, 9) → false

	public boolean evenlySpaced(int a, int b, int c) {
    
		int [] array  = new int[]{a , b , c};
		
		boolean v = false;
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]%2 == 0) {
				v = true;
			}else {
				v = false;
			}
			
		}
		
		return v;
	}

	// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
	// The string length will be at least n, and be odd when the length of the input is odd.

	// nMid("Hello", 3) → "Ho"
	// nMid("Chocolate", 3) → "Choate"
	// nMid("Chocolate", 1) → "Choclate"

	public String nMid(String input, int a) {
		return "";
	}

	// Given a string, return true if it ends in "dev". Ignore Case

	// endsDev("ihatedev") → true
	// endsDev("wehateDev") → true
	// endsDev("everoyonehatesdevforreal") → false
	// endsDev("devisnotcool") → false

	public boolean endsDev(String input) {
		
		String x  = input.toLowerCase();
		boolean v = false;
		
		if(x.endsWith("dev")) {
			
			v = true;
			return v;
			
		}
		
		return v;
	}



	// Given a string, return the length of the largest "block" in the string.
	// A block is a run of adjacent chars that are the same.
	//
	// superBlock("hoopplla") → 2
	// superBlock("abbCCCddDDDeeEEE") → 3
	// superBlock("") → 0

	public int superBlock(String input) {
		
		//String input = "hoopplla";
		ArrayList<String> h = new ArrayList<String>();
		int count=0;
		int temp =0;
		for (int i = 0; i < input.length()-1; i++) {
			
			String c = input.substring(i, i+1);
			String x = input.substring(i+1, i+2);
			
			System.out.println(c);
			System.out.println(x);
			
			
			if(c.equals(x)) {
				
				
				h.add(c);
				
			}
			
		}
		
       for (int i = 0; i < h.size(); i++) {
			for (int j = 0; j < input.length(); j++) {
				
				if(h.get(i).equals(input.substring(j,j+1))) {
					count++;
				}
				
			}
			
			if(temp < count) {
				temp = count;
			}
			
			count = 0;
		}
		
		
		return temp;

	}
	
	//given a string - return the number of times "am" appears in the String ignoring case -
	// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
	//
	//amISearch("Am I in Amsterdam") → 1
	//amISearch("I am in Amsterdam am I?") → 2
	//amISearch("I have been in Amsterdam") → 0

	public int amISearch(String arg1) {
		
		String [] a = arg1.split(" ");
				
		int count = 0;
		
		
		for (int i = 0; i < a.length; i++) {
		
			if(a[i].equalsIgnoreCase("am")) {
	
				count++;
				
			}
			
		}
		
		return count;
		
	}
	
	//given a number 
	// if this number is divisible by 3 return "fizz"
	// if this number is divisible by 5 return "buzz"
	// if this number is divisible by both 3  and 5return "fizzbuzz"
	//
	//fizzBuzz(3) → "fizz"
	//fizzBuzz(10) → "buzz"
	//fizzBuzz(15) → "fizzbuzz"
	
	public String fizzBuzz(int arg1) {
		
		
		 if(arg1%3 == 0 && arg1%5 == 0) {
				return "fizzbuzz";
			}else if(arg1%3 == 0) {
				return"fizz";
			} else if (arg1%5 == 0){
				return "buzz";
			}
		
		return null;
		
	}
	
	//Given a string split the string into the individual numbers present
	//then add each digit of each number to get a final value for each number
	// String example = "55 72 86"
	//
	// "55" will = the integer 10
	// "72" will = the integer 9
	// "86" will = the integer 14
	//
	// You then need to return the highest vale
	//
	//largest("55 72 86") → 14
	//largest("15 72 80 164") → 11
	//largest("555 72 86 45 10") → 15
	
	public int largest(String arg1) {
		
		int temp = 0;
		int total=0;
			
			String [] x  = arg1.split(" ");
			
			for (int j = 0; j < x.length; j++) {
				
				int c = Integer.valueOf(x[j]);
				
				int first = c/10;
				int second = c%10;
				
			    total += first;
				
				if(temp < total) {
					temp = total;
				}
				
			}
			
		return temp;
		
	}
	
	
}

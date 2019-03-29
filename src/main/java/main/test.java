package main;

public class test {
	public static void main(String[] args) {
		
		
		String arg1 = "55 72 86";
		
		int temp = 0;
		int total = 0;
		int c=0;
		
		String [] x  = arg1.split(" ");
		
		for (int j = 0; j < x.length; j++) {
			
			 c = Integer.valueOf(x[j]);
		}
     		while(c > 0) {
     			int v = c%10;
         		c = c-v;
         	    v = c/10;
         	    total +=v;
         	    
         	    System.out.println(total);
     		}
     		
     		System.out.println(total);
     		
     				
     		
     		
	}

}

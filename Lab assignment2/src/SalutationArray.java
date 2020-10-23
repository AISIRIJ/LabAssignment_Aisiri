/**  Author name : AISIRI J
     date: 23/10/2020
     desc: testing compilation and running a demo of jagged Array by concatenating the salutation
*/
public class SalutationArray {

	public static void main(String[] args) {
		String salutation[][]=new String[2][];
		String temp1[]= {"Mr","Mrs","Miss"};
		String temp2[]={"Pratheek","surya","aishwarya","rohan","rakesh"};
		salutation[0]= temp1;
		salutation[1]= temp2;
		
		for(int i=0;i<salutation.length;i++) {
	    	   for(int j=0;j<salutation[i].length;j++) {
	    		 System.out.print(" "+salutation[i][j]);	  
	    	   }
	    	   System.out.println();
	       } 
		System.out.println("--------------------------------------");
		System.out.println(salutation[0][0]+"."+salutation[1][0]);
		System.out.println(salutation[0][2]+"."+salutation[1][1]);
		System.out.println(salutation[0][1]+"."+salutation[1][2]);
		System.out.println(salutation[0][0]+"."+salutation[1][3]);
		System.out.println(salutation[0][0]+"."+salutation[1][4]);
		
	}


}

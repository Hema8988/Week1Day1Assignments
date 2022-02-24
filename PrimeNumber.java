package week1.day1.assignments;

import java.util.Iterator;

public class PrimeNumber {

	

	public static void main(String[] args) {
		int i,m=0,flag=0;
		int input=13;
		m=input/2;
		
		  if(m==0||input==1) { System.out.println(input+ "  is not a  Prime Number");
		  
		  }
		 
		  else {
			for(i=2;i< m;i++) {
			if(input % i==0) {
			System.out.println(input+ "  is not a  Prime Number");
			//flag=1;
			break;
			}
		  }
		  }
		
		if(flag==0) {
		System.out.println(input+ "  is  a  Prime Number");
				}
		}
		
		

	}
	



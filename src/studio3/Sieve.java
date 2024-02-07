package studio3;

import java.util.Arrays;
import java.util.Scanner;


public class Sieve {


		int round = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Pick a number");
		int n = in.nextInt();
		
		int[] prime =  new int [n];
		for (int i = 0; i < prime.length - 2; i++)
		{
	
		      prime[i]= i+2 ;
		      System.out.println(i);
		}
		
		
	}

}

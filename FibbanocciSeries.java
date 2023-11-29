package practicePrograms;

import java.util.Scanner;

public class FibbanocciSeries 
{
	 static int a=0;
	 static int b=1;
	static int c;
	int num=5;
	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++) {
			a=b;
			b=c;
			c=a+b;
		}
		System.out.println(c);
	}

}

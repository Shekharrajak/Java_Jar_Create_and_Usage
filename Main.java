
// package com.client.java;

import java.util.Scanner;
// import com.stackroute.java.robo;

import com.stackroute.java.robo.Robo;

public class Main  {
	// public static class robo_get extends Robo{

	// }
	

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("**Enter the operation(add, sub, divide, multiply)");

		String opr = input.next();

		System.out.println("Enter the 2 numbers for operation : ");

		float a = input.nextFloat();
		float b = input.nextFloat();

		Robo m = new Robo();

		// float res = Robo.compute(opr, a, b);

		// Main m = new Main();

		// robo_get m = new robo_get();
		float res = Robo.compute(opr, a, b);

		System.out.println("res is : ");
		System.out.println(res);		
	}	
}

/*



javac -d . Robo.java
jar cvf Robo.jar com/stackroute/java/robo/Robo.class
java Main 

no need this :

java -cp .: ./Robo.jar Main


chmod +x script1.sh 

*/

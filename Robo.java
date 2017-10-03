package com.stackroute.java.robo;


public class Robo {
	

	public static float compute(String opr, float a, float b){
	
		switch(opr){
			case "add": {
				return a + b;
			}
			case "sub": {
				return a - b;
			}
			case "multiply": {
				return a * b;
			}
			case "divide": {
				return a / b;
			}

		};
		return 0;

	}	

}
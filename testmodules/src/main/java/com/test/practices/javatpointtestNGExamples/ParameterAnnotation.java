package com.test.practices.javatpointtestNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterAnnotation {

	@Test
	public void outerClassTestMethod() {
		System.out.println("Outer class outer method called..");
	}
	
	class Sum {

		@Test
		@Parameters({ "a", "b" })
		public void sumMethod(int c, int d) {
			int sum;
			sum = c + d;
			System.out.println("Sum is : " + sum);
		}
	}

	class Minus {

		@Test
		@Parameters({ "a", "b" })
		public void minusMethod(int c, int d) {
			int minus;
			minus = c - d;
			System.out.println("Minus : " + minus);
		}
	}

	class Multiply {

		@Test
		@Parameters({ "a", "b" })
		public void multiplyMethod(int c, int d) {
			int multiply;
			multiply = c * d;
			System.out.println("Multiply: " + multiply);
		}
	}
	
	
	class Fruits{
		@Test  
		@Parameters("mango")  
		public void mango(String m)  
		{  
		System.out.println("Fruits names are:  ");  
		System.out.println(m);  
		}  
		@Test  
		@Parameters("orange")  
		public void orange(String o)  
		{  
		System.out.println(o);  
		}  
	}

	class Vegetables{
		
		@Test  
		@Parameters("Cauliflower")  
		public void c(String m)  
		{  
		System.out.println("Vegetable names are :");  
		System.out.println(m);  
		}  
		@Test  
		@Parameters("Ladyfinger")  
		public void orange(String l)  
		{  
		System.out.println(l);  
		} 
	}
}
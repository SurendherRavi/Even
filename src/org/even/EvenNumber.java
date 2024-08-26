package org.even;

public class EvenNumber {
	public void countEven(int num) {
		int count = 0;
		for (int i=1; i<=100; i++) {
			if(i % 2 == 0) {
			 count++;
			}
			}
		System.out.println(count);
		System.out.println("Hi");
	}
	public static void main(String[] args) {
		EvenNumber e = new EvenNumber();
		e.countEven(0);
	}
}

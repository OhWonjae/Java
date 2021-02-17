package ch04homework;

import java.util.Scanner;

public class BreakExample {

	public static void main(String[] args) {
	Outter:for(char upper='A';upper<='Z'; upper++) {
		for(char lower='a';upper<='z'; lower++) {
			System.out.println(upper+"-" + lower);
			if(lower=='g')
			{
				break Outter;
			}
		}
	}
		System.out.println("Á¾·á");
		
	}

}

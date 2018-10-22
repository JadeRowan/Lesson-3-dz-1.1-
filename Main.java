package lesson.three.dz.one;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a");
		int a = sc.nextInt();
		System.out.println("Input b");
		int b = sc.nextInt();
		System.out.println("Input c");
		int c = sc.nextInt();
		System.out.println("Input d");
		int d = sc.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		if (d > max) {
			max = d;
		}
		System.out.println("Max is "+max);
	}

}

package hu.webler;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("a b c x y: ");
		Poli2 f = new Poli2(in.nextInt(), in.nextInt(), in.nextInt());
		
		System.out.println(f.area(in.nextInt(), in.nextInt()));
		in.close();
	}
}

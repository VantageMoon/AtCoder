package ABC.ABC008;

import java.util.Scanner;

public class ABC008A {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S = sc.nextInt();
		int T = sc.nextInt();
		sc.close();
		
		System.out.println((T-S+1));
	}
}

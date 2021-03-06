package ABC.ABC102;

import java.util.Scanner;

public class ABC102B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		int max = A[0];
		int min = A[0];
		for(int i = 1;i < N;++i) {
			if(max < A[i])
				max = A[i];
			if(min > A[i])
				min = A[i];
		}
		System.out.println((max - min));
	}
}
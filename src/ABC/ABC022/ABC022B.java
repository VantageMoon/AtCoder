package ABC.ABC022;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ABC022B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0;i < N;++i)
			A[i] = sc.nextInt();
		sc.close();
		
		int ans = 0;
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0;i < N;++i) {
			if(set.contains(A[i]))
				ans++;
			else
				set.add(A[i]);
		}
		System.out.println(ans);
	}
}

package ABC.ABC076;

import java.util.Scanner;

public class ABC076B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		int ans = 1;
		for(int i = 0;i < N;++i) {
			if(ans > K)
				ans += K;
			else
				ans *= 2;
		}
		System.out.println(ans);
	}
}

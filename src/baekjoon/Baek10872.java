package baekjoon;

import java.util.Scanner;

public class Baek10872 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.close();

        int sum = factorial(n);
        System.out.println(sum);
    }

    public static int factorial(int n){
        if(n<=1) return 1;
        //n이 1씩 감소하면서 곱해지다가 1이하가 되면 팩토리얼이 종료된다.

        return n*factorial(n-1);
    }

    /*재귀함수를 쓰지 않고 반복문으로도 가능하다.
    *public class Baek10872 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.close();

		int sum = 1;

		// n 이 0이 아닐 때 까지 1씩 감소하면서 sum과 곱
		*
		while(n != 0) {
			sum = sum * n;
			n--;
		}

		System.out.println(sum);

	}
}
    *
    * */
}

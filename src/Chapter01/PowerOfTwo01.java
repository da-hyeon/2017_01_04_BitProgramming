package Chapter01;

import java.util.*;

public class PowerOfTwo01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("자연수 : ");
		int num = in.nextInt();
		System.out.print("지수 : ");
		int snum = in.nextInt();
		int result = 1;
		
		for(int i = 0 ; i < snum; i++){
			result *= num;
		}
		System.out.println(num + "의 " + snum + "의 제곱근은 " + result + "입니다.");
	}
}

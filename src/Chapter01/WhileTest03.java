package Chapter01;

import java.util.Scanner;

public class WhileTest03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		while( true ){
			System.out.print("숫자 입력 [0 to Quit] > ");
			int value = in.nextInt();
			
			if(value == 0){
				break;
			}
			sum += value;
		}
		System.out.println(sum);
		in.close();
	}
}

package Chapter01;

import java.util.*;

public class DoWhile {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		int value = 0;
		do {
			System.out.println(" 숫자 입력 [0 to Quit] > ");
			value = in.nextInt();
			
			sum += value;
			
		} while( value != 0 ) ;
		
		System.out.println(sum);
		in.close();
	}
}

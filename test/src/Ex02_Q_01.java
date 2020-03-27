import java.util.Scanner;

public class Ex02_Q_01 {

	public static void main(String[] args) {
		
		int a, b, c, d;
		int result;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫번째 계산할 값을 입력하세요 ==>");	
		a = s.nextInt();
		System.out.println("두번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();
		System.out.println("세번째 계산할 값을 입력하세요 ==>");
		c = s.nextInt();
		System.out.println("네번째 계산할 값을 입력하세요 ==>");
		d = s.nextInt();

		result = a + b + c + d; //각 변수들이 사용자에 의해 모두 입력된 후에야 result 값이 계산 가능하다.
		System.out.println(a + "+" + b + "+" + c + "+" + d + "=" + result);
	}

}

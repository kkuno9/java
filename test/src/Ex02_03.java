import java.util.Scanner;

public class Ex02_03 {

	public static void main(String[] args) {
		
		int a, b, c;
		int result;
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();
		System.out.println("두번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();
		System.out.println("세번째 계산할 값을 입력하세요 ==>");
		c = s.nextInt();
		
		result = a + b + c;
		System.out.println(a + "+" + b + "+" + c + "=" + result);
		
		result = a - b;
		System.out.println(a + "-" + b + "=" + result);	
		
		result = a * b * c;
		System.out.println(a + "*" + b + "*" + c + "=" + result);	
		
		result = a / b;
		System.out.println(a + "/" + b + "=" + result);	
		
		result = a % b;
		System.out.println(a + "%" + b + "=" + result);	
				

	}

}
